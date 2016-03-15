/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
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

/**
 * Initializes Complete OCL parsing support.
 */
public class CompleteOCLStandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());

	public CompleteOCLStandaloneSetup() {
		log.info("Registering CompleteOCLStandaloneSetup");
		org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
	}
}