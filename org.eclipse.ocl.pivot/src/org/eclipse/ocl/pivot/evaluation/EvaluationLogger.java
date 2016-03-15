/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
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

public interface EvaluationLogger
{
	/**
	 * @since 1.1
	 */
	public interface Indentable extends EvaluationLogger
	{
		void close();
		void popIndentation();
		void pushIndentation();
	}
	
	void append(@NonNull String message);
}
