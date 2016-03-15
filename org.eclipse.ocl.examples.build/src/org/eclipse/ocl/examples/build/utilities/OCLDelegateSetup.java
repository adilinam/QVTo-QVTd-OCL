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
package org.eclipse.ocl.examples.build.utilities;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;

/**
 */
public class OCLDelegateSetup
{
	private Logger log = Logger.getLogger(getClass());	
	
	public void setResourceSet(ResourceSet resourceSet) {
		log.info("Setup OCL Delegates");
		OCLDelegateDomain.initialize(resourceSet);
	}
}
