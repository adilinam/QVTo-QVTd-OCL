/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     R.Dvorak and others - QVTo debugger framework
 *     E.D.Willink - revised API for OCL debugger framework
 *******************************************************************************/
package org.eclipse.ocl.examples.debug.vm.evaluator;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.debug.vm.core.VMDebugCore;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.OCLExpression;

public abstract class VMNestedEvaluationEnvironment extends AbstractVMEvaluationEnvironment
{
	protected final @NonNull VMEvaluationEnvironment rootVMEvaluationEnvironment;
	
	public VMNestedEvaluationEnvironment(@NonNull VMEvaluationEnvironment vmEvaluationEnvironment, @NonNull NamedElement executableObject, @Nullable OCLExpression callingObject) {
		super(vmEvaluationEnvironment, executableObject, callingObject);
		rootVMEvaluationEnvironment = vmEvaluationEnvironment.getVMRootEvaluationEnvironment();
	}

	public @NonNull VMDebugCore getDebugCore() {
		return rootVMEvaluationEnvironment.getDebugCore();
	}

	public @NonNull NamedElement getDebuggableElement() {
		return rootVMEvaluationEnvironment.getDebuggableElement();
	}

	public @NonNull VMEvaluationEnvironment getRootVMEvaluationEnvironment() {
		return rootVMEvaluationEnvironment;
	}
}
