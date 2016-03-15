/*******************************************************************************
 * Copyright (c) 2016 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Adolfo Sanchez-Barbudo Herrera
 *******************************************************************************/
package org.eclipse.ocl.examples.autogen.java;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.codegen.cgmodel.CGElement;
import org.eclipse.ocl.examples.codegen.cgmodel.CGValuedElement;
import org.eclipse.ocl.examples.codegen.java.JavaGlobalContext;

public class AutoGlobalContext<CG extends AutoCodeGenerator> extends JavaGlobalContext<CG> {

	public AutoGlobalContext(@NonNull CG codeGenerator, org.eclipse.ocl.pivot.@NonNull Package asPackage) {
		super(codeGenerator);
	}
	
	@Override
	protected @NonNull AutoLocalContext<CG> createNestedContext(@NonNull CGElement cgScope) {
		return new AutoLocalContext<CG>(this, cgScope);
	}

	public @NonNull CGValuedElement getIdResolverVariable(@NonNull CGValuedElement cgValuedElement) {
		return codeGenerator.getIdResolverVariable();
	}
}
