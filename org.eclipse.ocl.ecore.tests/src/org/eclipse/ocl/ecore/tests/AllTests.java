/*******************************************************************************
 * Copyright (c) 2002, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - Bug 298634
 *******************************************************************************/

package org.eclipse.ocl.ecore.tests;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.tests.GenericTestSuite.CheckedTestSuite;

/**
 * Tests for the OCL engine plug-in.
 * 
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("nls")
public class AllTests
	extends TestCase {

	public AllTests() {
		super("");
	}

	public static Test suite() {
		if (System.getProperty("standalone") != null) {
			// running tests stand-alone:  must set up the environment registry
			Environment.Registry.INSTANCE.registerEnvironment(
					EcoreEnvironmentFactory.INSTANCE.createEnvironment());
		}
    	String testSuiteName = System.getProperty("testSuiteName", "OCL Tests for Ecore Metamodel");
		CheckedTestSuite result = new CheckedTestSuite(testSuiteName);			
		AbstractTestSuite.suite(result);
		return result;
	}

	public Object run(Object args)
		throws Exception {

		TestRunner.run(suite());
		return Arrays
			.asList(new String[] {"Please see raw test suite output for details."});
	}
}
