/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.evaluation;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Minimal implementation of the EvaluationLogger and EvaluationLogger.Indentable interfaces from which all real
 * implementation should derive.
 * 
 * The default just passes append(message) directly to print(message).
 * @since 1.1
 */
public abstract class AbstractLogger implements EvaluationLogger.Indentable
{
	@Override
	public void append(@NonNull String message) {
		print(message);
	}

	@Override
	public void close() {}

	@Override
	public void popIndentation() {}

	protected abstract void print(@NonNull String string);

	@Override
	public void pushIndentation() {}
}