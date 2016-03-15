/*******************************************************************************
 * Copyright (c) 2010, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer.benchmark.preparation.model;

import org.eclipse.emf.ecore.xmi.XMLResource;

public interface ResourceWithSize extends XMLResource {
    /**
     * Returns the number of model elements contained in this resource; the resource class
     * implementing this interface should contemplate caching the results
     */
    int getSize();
}
