/*******************************************************************************
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink(CEA LIST) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.codegen.generator;

public class CodeGenException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public CodeGenException(String message) {
		super(message);
	}

	public CodeGenException(Throwable cause) {
		super(cause);
	}
	
	public CodeGenException(String message, Throwable cause) {
		super(message, cause);
	}
}