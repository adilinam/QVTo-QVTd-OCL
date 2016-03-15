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
package org.eclipse.ocl.examples.codegen.oclinjunit;

import java.util.List;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.cgmodel.CGClass;
import org.eclipse.ocl.examples.codegen.cgmodel.CGOperation;
import org.eclipse.ocl.examples.codegen.cgmodel.CGValuedElement;
import org.eclipse.ocl.examples.codegen.java.CG2JavaVisitor;
import org.eclipse.ocl.pivot.ExpressionInOCL;

/**
 * A CG2JavaClassVisitor supports generation of an OCL expression as the LibraryOperation INSTANCE of a Java Class.
 */
public class JUnitCG2JavaClassVisitor extends CG2JavaVisitor<@NonNull JUnitCodeGenerator>
{
	protected final @NonNull ExpressionInOCL expInOcl;
	protected final @Nullable List<CGValuedElement> sortedGlobals;
	
	public JUnitCG2JavaClassVisitor(@NonNull JUnitCodeGenerator codeGenerator,
			@NonNull ExpressionInOCL expInOcl, @Nullable List<CGValuedElement> sortedGlobals) {
		super(codeGenerator);
		this.expInOcl = expInOcl;
		this.sortedGlobals = sortedGlobals;
	}

	@Override
	public @NonNull Set<String> getAllImports() {
		return globalContext.getImports();
	}

	@Override
	public @NonNull Boolean visitCGClass(@NonNull CGClass cgClass) {
		js.appendClassHeader(cgClass.getContainingPackage());
		Class<?> baseClass = genModelHelper.getAbstractOperationClass(expInOcl.getOwnedParameters());
		String title = cgClass.getName() + " provides the Java implementation for\n";
		js.appendCommentWithOCL(title, expInOcl);
		String className = cgClass.getName();
		js.append("@SuppressWarnings(\"nls\")\n");
		js.append("public class " + className + " extends ");
		js.appendClassReference(baseClass);
		js.append("\n");
		js.append("{\n");
		js.pushIndentation(null);
		if (sortedGlobals != null) {
			generateGlobals(sortedGlobals);
		}
		js.append("\n");
		if (expInOcl.getOwnedContext() != null) {
			for (CGOperation cgOperation : cgClass.getOperations()) {
				cgOperation.accept(this);
			}
		}
		else {
			js.append("/*\n");
			js.append("«IF expInOcl.messageExpression != null»«(expInOcl.messageExpression as StringLiteralExp).stringSymbol»«ENDIF»\n");
			js.append("*/\n");
		}
		js.popIndentation();
		js.append("}\n");
		return true;
	}
}
