/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.essentialocl.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

public class NavigationOperatorCSAttribution extends AbstractAttribution
{
	public static final @NonNull NavigationOperatorCSAttribution INSTANCE = new NavigationOperatorCSAttribution();

	@Override
	public ScopeView computeLookup(@NonNull EObject target, @NonNull EnvironmentView environmentView, @NonNull ScopeView scopeView) {
		if (environmentView.isQualifier()) {
			return scopeView.getParent();
		}
		assert scopeView.getContainmentFeature() != PivotPackage.Literals.OPERATION_CALL_EXP__OWNED_ARGUMENTS;		// Arguments must leapfrog to parent.
		if (NavigationUtil.isNavigationInfixExp(target)) {
			InfixExpCS targetElement = (InfixExpCS)target;
			EObject child = scopeView.getChild();
			ExpCS argument = targetElement.getArgument();
			if ((child == argument) && (child instanceof NameExpCS)) {
				NameExpCS csNameExp = (NameExpCS)child;
				Type sourceTypeValue = csNameExp.getSourceTypeValue();
				if (sourceTypeValue != null) {
					environmentView.addElementsOfScope(environmentView.getStandardLibrary().getClassType(), scopeView);
				}
				if (!environmentView.hasFinalResult()) {
					Type type = sourceTypeValue != null ? sourceTypeValue : csNameExp.getSourceType();
					if (type != null) {
						environmentView.addElementsOfScope(type, scopeView);
					}
				}
				return null;											// Explicit navigation must be resolved in source
			}
		}
		return scopeView.getParent();
	}
}
