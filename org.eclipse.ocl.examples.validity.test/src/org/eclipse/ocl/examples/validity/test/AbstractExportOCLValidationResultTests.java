/*******************************************************************************
 * Copyright (c) 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Obeo - initial API and implementation
 *   E.D.Willink (Obeo) - 425799 Validity View Integration
 *******************************************************************************/
package org.eclipse.ocl.examples.validity.test;

import java.io.IOException;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.export.IValidityExporter;
import org.eclipse.ocl.examples.emf.validation.validity.export.ValidityExporterRegistry;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.junit.After;
import org.junit.Before;

/**
 * Class testing the AbstractExport class.
 */
public class AbstractExportOCLValidationResultTests extends AbstractValidityTestCase
{
	protected IValidityExporter exporter;
	protected EList<Result> results;

	protected @NonNull URL getTestResource(@NonNull String resourceName) {
		URL projectURL = getClass().getClassLoader().getResource(resourceName);
		try {
			if ((projectURL != null) && Platform.isRunning()) {
				try {
					projectURL = FileLocator.resolve(projectURL);
				} catch (IOException e) {
					TestCase.fail(e.getMessage());
					assert false;;
				}
			}
		}
		catch (Throwable e) {}
		return ClassUtil.nonNullState(projectURL);
	}
	
	protected @NonNull String getProjectFileName(String referenceName) {
		String projectName = getClass().getPackage().getName().replace('.', '/');
		URL projectURL = getTestResource(projectName);	
		assertNotNull(projectURL);
		return projectURL.getFile().replace("\\", "/") + "/" + referenceName;
	}

	protected @NonNull String getHTMLLogFileName() {
		return getProjectFileName("models/" + getName() + ".html");
	}

	protected @NonNull String getTextLogFileName() {
		return getProjectFileName("models/log_" + getName() + ".txt");
	}
	

	protected void initExporter(@NonNull String exporterType) {
		exporter = ValidityExporterRegistry.INSTANCE.getExporter(exporterType);
		assertNotNull(exporter);
		TEST_PROGRESS.println("exporter = " + exporter);
	}

	@Before
	public void setUp() throws Exception {
//		TEST_PROGRESS.setState(true);
		super.setUp();
		initTestModels();
		initValidityManager(EMFPlugin.IS_ECLIPSE_RUNNING ? null : new ValidityManager());
		results = resultSet.getResults();
		TEST_PROGRESS.println("results = " + results);
	}

	@After
	public void tearDown() throws Exception {
		exporter = null;
		TEST_PROGRESS.println("-exporter");
		super.tearDown();
	}
}
