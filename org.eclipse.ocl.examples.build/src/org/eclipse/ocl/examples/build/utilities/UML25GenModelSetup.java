/*******************************************************************************
 * Copyright (c) 2013, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.build.utilities;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactoryRegistry;
import org.eclipse.ocl.xtext.base.services.BaseLinkingService;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

/**
 * Initializes UML 2.5 genmodel support.
 */
public class UML25GenModelSetup extends UMLGenModelSetup
{
	public UML25GenModelSetup() {
		BaseLinkingService.DEBUG_RETRY.setState(true);
	}
	
	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		EssentialOCLStandaloneSetup.doSetup();
		super.setResourceSet(resourceSet);
		if (resourceSet != null) {
			ASResourceFactoryRegistry.INSTANCE.configureResourceSet(resourceSet);
		}
	}
}
