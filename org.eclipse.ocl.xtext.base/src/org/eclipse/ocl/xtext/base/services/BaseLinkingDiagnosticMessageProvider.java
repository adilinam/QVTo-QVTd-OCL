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
package org.eclipse.ocl.xtext.base.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

public class BaseLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider
{
	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		EObject csContext = context.getContext();
		String linkText = context.getLinkText();
		EReference eReference = context.getReference();
		assert (eReference != null) && (csContext != null) && (linkText != null);
		return CS2AS.getUnresolvedProxyMessage(eReference, csContext, linkText);
	}
}
