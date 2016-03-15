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

/**
 */
public class CodeGenOptions
{
	private boolean useNullAnnotations = false;
	
	public void setUseNullAnnotations(boolean useNullAnnotations) {
		this.useNullAnnotations = useNullAnnotations;
	}
	
	public boolean suppressNonNullWarningsForEMFCollections() {
		return true;
	}
	
	public boolean suppressNonNullWarningsForEMFCreates() {
		return true;
	}
	
	public boolean useNullAnnotations() {
		return useNullAnnotations;
	}
}
