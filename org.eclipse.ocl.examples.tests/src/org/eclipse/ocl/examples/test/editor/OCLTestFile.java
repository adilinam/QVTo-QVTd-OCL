/*******************************************************************************
 * Copyright (c) 2010 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.test.editor;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.IFileEditorInput;

public interface OCLTestFile
{
	 void createInvariant(EClass eClass, String name, String expression);

	 IFileEditorInput getEditorInput() throws IOException, CoreException;
}
