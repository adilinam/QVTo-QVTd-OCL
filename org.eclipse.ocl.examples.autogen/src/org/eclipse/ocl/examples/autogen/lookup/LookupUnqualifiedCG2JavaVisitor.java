package org.eclipse.ocl.examples.autogen.lookup;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.cgmodel.CGClass;
import org.eclipse.ocl.examples.codegen.cgmodel.CGPackage;
import org.eclipse.ocl.examples.codegen.cgmodel.CGValuedElement;

public class LookupUnqualifiedCG2JavaVisitor extends LookupVisitorsCG2JavaVisitor<@NonNull LookupUnqualifiedCodeGenerator> {

	public LookupUnqualifiedCG2JavaVisitor(
			@NonNull LookupUnqualifiedCodeGenerator codeGenerator,
			@NonNull CGPackage cgPackage,
			@Nullable List<CGValuedElement> sortedGlobals) {
		super(codeGenerator, cgPackage, sortedGlobals);
	}
	
	@Override
	protected void doInternalVisiting(@NonNull CGClass cgClass) {
		// We call parentEnv;
		js.append("\n");
		js.append("@Override\n");
		js.append("protected ");
		js.appendIsRequired(false);
		js.append(" ");
		js.appendClassReference(context.getVisitorResultClass());
		js.append(" doVisiting(");
		js.appendIsRequired(true);
		js.append(" ");
		js.appendClassReference(context.getVisitableClass());
		js.append(" visitable) {\n");
		js.pushIndentation(null);
		js.append("return parentEnv((");
		js.appendClassReference(EObject.class);
		js.append(")");
		js.append("visitable);\n");
		js.popIndentation();
		js.append("}\n");
	}
	
	@Override
	protected void doMoreClassMethods(@NonNull CGClass cgClass) {
		super.doMoreClassMethods(cgClass);
		doParentEnv(cgClass);
	}
	
	/**
	 * protected @Nullable Environment parentEnv(@NonNull EObject element) {
     *    EObject parent = element.eContainer();
	 *    if (parent instanceof Visitable) {
	 *        this.child = element;
	 *        return (Environment)((Visitable)parent).accept(this);
	 *    }
	 *    else {
	 *        return null;
	 *    }
	 * }
	 */
	protected void doParentEnv(@NonNull CGClass cgClass) {
		js.append("\n");
		js.append("/**\n");
		js.append(" * Continue the search for matches in the parent of " + LookupVisitorsClassContext.ELEMENT_NAME + ".\n");
		js.append(" */\n");
		js.append("protected ");
		js.appendIsRequired(false);
		js.append(" ");
		js.appendClassReference(context.getEnvironmentClass());
		js.append(" " + LookupVisitorsClassContext.PARENT_ENV_NAME + "(");
		js.appendIsRequired(true);
		js.append(" ");
		js.appendClassReference(EObject.class);
		js.append(" " + LookupVisitorsClassContext.ELEMENT_NAME + ") {\n");
		js.pushIndentation(null);
			js.appendClassReference(EObject.class);
			js.append(" " + LookupVisitorsClassContext.PARENT_NAME + " = " + LookupVisitorsClassContext.ELEMENT_NAME + ".eContainer();\n");
			js.append("if (" + LookupVisitorsClassContext.PARENT_NAME + " instanceof ");
			js.appendClassReference(context.getVisitableClass());
			js.append(") {\n");
			js.pushIndentation(null);
				js.append("this.");
				js.appendReferenceTo(context.getChildProperty());
				js.append(" = " + LookupVisitorsClassContext.ELEMENT_NAME + ";\n");
				js.append("return ((");
				js.appendClassReference(context.getVisitableClass());
				js.append(")" + LookupVisitorsClassContext.PARENT_NAME + ").accept(this);\n");
			js.popIndentation();
			js.append("}\n");
			js.append("else {\n");
			js.pushIndentation(null);
				js.append("return "+LookupVisitorsClassContext.CONTEXT_NAME +";\n");
			js.popIndentation();
		js.append("}\n");
		js.popIndentation();
		js.append("}\n");
	}
}

