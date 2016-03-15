/*******************************************************************************
 * Copyright (c) 2010, 2012 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.test.xtext;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;

/**
 * Supports loading model files.
 * <p>
 * A derived class with a singleton INSTANCE, may provide the URI of
 * a model within its folder using getURI().
 */
public class AbstractModels extends XtextTestCase
{
	public URI getURI(@NonNull String modelName) {
		String projectName = getClass().getPackage().getName();
		String fileName = projectName.replace('.', '/') + "/" + modelName;
		URL fileURL = getTestResource(fileName);
		File file = new File(fileURL.getFile());
		URI uri = URI.createFileURI(file.toString());
		if (uri == null)
			fail("Cannot create URI for '" + file.toString() + "'");
		return uri;
	}
}
