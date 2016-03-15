/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 * 	 E.D.Willink (CEA LIST) - Bug 425799 - validity view
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.library;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.library.AbstractOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

/**
 * An instance of ConstrainedOperation supports evaluation of
 * an operation defined by constraints.
 */
public class ConstrainedOperation extends AbstractOperation
{
	protected final @NonNull ExpressionInOCL expressionInOCL;
	
	public ConstrainedOperation(@NonNull ExpressionInOCL expressionInOCL) {
		this.expressionInOCL = expressionInOCL;
	}
	
	/**
	 * @since 1.1
	 */
	@Override
	public @Nullable Object dispatch(@NonNull Executor executor, @NonNull OperationCallExp callExp, @Nullable Object sourceValue) {
		List<? extends OCLExpression> arguments = callExp.getOwnedArguments();
		@Nullable Object[] argumentValues = new @Nullable Object[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			OCLExpression argument = arguments.get(i);
			assert argument != null;
			argumentValues[i] = executor.evaluate(argument);
		}
		return evaluate(executor, callExp, sourceValue, argumentValues);
	}

	private @Nullable Object evaluate(@NonNull Executor executor, @NonNull OperationCallExp callExp, @Nullable Object sourceValue, @Nullable Object @NonNull ... argumentValues) {
		PivotUtil.checkExpression(expressionInOCL);
		EvaluationEnvironment nestedEvaluationEnvironment = executor.pushEvaluationEnvironment(expressionInOCL, callExp);
		nestedEvaluationEnvironment.add(ClassUtil.nonNullModel(expressionInOCL.getOwnedContext()), sourceValue);
		List<Variable> parameters = expressionInOCL.getOwnedParameters();
		if (!parameters.isEmpty()) {
			for (int i = 0; i < parameters.size(); i++) {
				Object value = argumentValues[i];
				nestedEvaluationEnvironment.add(ClassUtil.nonNullModel(parameters.get(i)), value);
			}
		}
		try {
			OCLExpression bodyExpression = expressionInOCL.getOwnedBody();
			assert bodyExpression != null;
			return executor.evaluate(bodyExpression);
		}
		finally {
			executor.popEvaluationEnvironment();
		}
	}
}