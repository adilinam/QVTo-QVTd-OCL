/*******************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink(CEA LIST) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.codegen.oclinecore;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.codegen.cgmodel.CGElement;
import org.eclipse.ocl.examples.codegen.java.JavaGlobalContext;

/**
 * A JavaGlobalContext maintains the Java-specific global context for generation of code.
 */
public class OCLinEcoreGlobalContext extends JavaGlobalContext<OCLinEcoreCodeGenerator>
{
	protected final @NonNull GenPackage genPackage;
	
	public OCLinEcoreGlobalContext(@NonNull OCLinEcoreCodeGenerator codeGenerator, @NonNull GenPackage genPackage) {
		super(codeGenerator);
		this.genPackage = genPackage;
	}

	@Override
	public @NonNull OCLinEcoreLocalContext createNestedContext(@NonNull CGElement cgScope) {
		return new OCLinEcoreLocalContext(this, cgScope);
	}

/*	public @NonNull CGParameter createSelfParameter(@NonNull Variable contextVariable) {
		CGTextParameter cgTextParameter = CGModelFactory.eINSTANCE.createCGTextParameter();
		cgTextParameter.setName(contextVariable.getName());
		cgTextParameter.setValueName(getSelfName());
		cgTextParameter.setAst(contextVariable);
		cgTextParameter.setTextValue("this");
		cgTextParameter.setNonInvalid();
		cgTextParameter.setNonNull();
		cgTextParameter.setTypeId(analyzer.getTypeId(contextVariable.getTypeId()));
		return cgTextParameter;
	} */

	public @NonNull String getTablesClassName() {
		return codeGenerator.getGenModelHelper().getTablesClassName(genPackage);
	}
}