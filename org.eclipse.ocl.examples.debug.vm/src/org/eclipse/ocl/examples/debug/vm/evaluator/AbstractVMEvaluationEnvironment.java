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

import java.util.Stack;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.debug.vm.VariableFinder;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.internal.evaluation.BasicEvaluationEnvironment;

public abstract class AbstractVMEvaluationEnvironment extends BasicEvaluationEnvironment implements VMEvaluationEnvironment
{
//	protected final @NonNull IVMContext vmContext;
	private final @NonNull Stack<StepperEntry> stepperStack = new Stack<StepperEntry>();
	
	protected AbstractVMEvaluationEnvironment(@NonNull VMExecutor vmExecutor, @NonNull NamedElement executableObject) {
		super(vmExecutor, executableObject);
//		this.vmContext = vmExecutor.getVMContext();
	}

	protected AbstractVMEvaluationEnvironment(@NonNull VMEvaluationEnvironment evaluationEnvironment, @NonNull NamedElement executableObject, @Nullable OCLExpression callingObject) {
		super(evaluationEnvironment, executableObject, callingObject);
//		this.vmContext = evaluationEnvironment.getVMContext();
	}

	public @NonNull VariableFinder createVariableFinder(boolean isStoreValues) {
		return new VariableFinder(this, isStoreValues);
	}

	public @Nullable VMEvaluationEnvironment getVMParentEvaluationEnvironment() {
		return (VMEvaluationEnvironment) parent;
	}

	@Override
	public @NonNull Stack<VMEvaluationEnvironment.StepperEntry> getStepperStack() {
		return stepperStack;
	}

//	@Override
//	public @NonNull IVMContext getVMContext() {
//		return vmContext;
//	}
}
