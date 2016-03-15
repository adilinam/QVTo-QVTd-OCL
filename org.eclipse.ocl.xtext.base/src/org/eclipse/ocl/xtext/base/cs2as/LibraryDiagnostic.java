/*******************************************************************************
 * Copyright (c) 2011, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.base.cs2as;

import org.eclipse.xtext.diagnostics.ExceptionDiagnostic;

public class LibraryDiagnostic extends ExceptionDiagnostic
{
	public LibraryDiagnostic(Exception exception) {
		super(exception);
	}

	@Override
	public String getMessage() {
		return getException().getMessage();
	}
}