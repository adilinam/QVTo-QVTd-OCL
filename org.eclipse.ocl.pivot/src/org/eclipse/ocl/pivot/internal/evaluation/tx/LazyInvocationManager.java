/*******************************************************************************
 * Copyright (c) 2013, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.evaluation.tx;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.tx.AbstractInvocationManager;
import org.eclipse.ocl.pivot.evaluation.tx.AbstractTransformer;
import org.eclipse.ocl.pivot.evaluation.tx.Invocation;
import org.eclipse.ocl.pivot.evaluation.tx.InvocationFailedException;
import org.eclipse.ocl.pivot.evaluation.tx.SlotState;

/**
 * InvocationManager supervises and provides thread safety for the lists of blocked and waiting invocations.
 * @since 1.1
 */
public class LazyInvocationManager extends AbstractInvocationManager
{
	/**
	 * Head of doubly linked list of blocked invocations.
	 */
	private @Nullable AbstractInvocationInternal blockedInvocations = null;

	/**
	 * Head of doubly linked list of unblocked invocations waiting for a re-execution attempt.
	 */
	private @Nullable AbstractInvocationInternal waitingInvocations = null;	

	protected final boolean debugTracing = AbstractTransformer.INVOCATIONS.isActive();
    
	private synchronized void block(@NonNull Invocation invocation, @NonNull SlotState slotState) {
		AbstractInvocationInternal castInvocation = (AbstractInvocationInternal) invocation;
		assert castInvocation.debug_blockedBy == null;
		castInvocation.debug_blockedBy = slotState;
		AbstractInvocationInternal blockedInvocations2 = blockedInvocations;
		if (blockedInvocations2 == null) {
			blockedInvocations = castInvocation;
		}
		else {
			castInvocation.insertAfter(blockedInvocations2.prev);
		}
		slotState.block(invocation);
		if (debugTracing) {
			AbstractTransformer.INVOCATIONS.println("block " + invocation + " for " + slotState);
		}
	}

	@Override
	public boolean flush() throws ReflectiveOperationException {
		flushInternal();
		AbstractInvocationInternal blockedInvocation = blockedInvocations;
		if (blockedInvocation == null) {
			return true;
		}
		do {
			if (debugTracing) {
				AbstractTransformer.INVOCATIONS.println("still blocked " + blockedInvocation + " by " + blockedInvocation.debug_blockedBy);
			}
			blockedInvocation = blockedInvocation.next;
		}
		while (blockedInvocation != blockedInvocations);
		return false;
	}
	
    private void flushInternal() throws ReflectiveOperationException {
		while (waitingInvocations != null) {
			AbstractInvocationInternal invocation = null;
    		synchronized (this) {
    			AbstractInvocationInternal waitingInvocations2 = waitingInvocations;
    			if (waitingInvocations2 != null) {
    				invocation = waitingInvocations2;
    				waitingInvocations = waitingInvocations2.next;
    				if (waitingInvocations == invocation) {
    					waitingInvocations = null;
    				}
    				invocation.remove();
    			}
    		}
    		if (invocation != null) {
    			if (debugTracing) {
    				AbstractTransformer.INVOCATIONS.println("re-invoke " + invocation);
    			}
        		invoke(invocation, false);
    		}
    	}
    }
	
    @Override
	public void invoke(@NonNull Invocation invocation, boolean doFlush) throws ReflectiveOperationException {
		try {
			invocation.execute();
			if (debugTracing) {
				AbstractTransformer.INVOCATIONS.println("done " + invocation);
			}
			if (doFlush) {
				flushInternal();
			}
		}
		catch (InvocationFailedException e) {
 			block(invocation, e.slotState);
		}
    }
    
	@Override
	public synchronized void unblock(@NonNull Invocation invocation) {
		if (debugTracing) {
			AbstractTransformer.INVOCATIONS.println("unblock " + invocation);
		}
		AbstractInvocationInternal castInvocation = (AbstractInvocationInternal) invocation;
		assert castInvocation.debug_blockedBy != null;
		castInvocation.debug_blockedBy = null;
		if (blockedInvocations == castInvocation) {
			blockedInvocations = castInvocation.next;
			if (blockedInvocations == castInvocation) {
				blockedInvocations = null;
			}
		}
		castInvocation.remove();
		AbstractInvocationInternal waitingInvocations2 = waitingInvocations;
		if (waitingInvocations2 == null) {
			waitingInvocations = castInvocation;
		}
		else {
			castInvocation.insertAfter(waitingInvocations2.prev);
		}
	}
}