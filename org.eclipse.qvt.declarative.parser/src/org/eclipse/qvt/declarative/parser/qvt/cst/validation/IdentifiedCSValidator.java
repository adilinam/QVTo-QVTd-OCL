/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * E.D.Willink - initial API and implementation
 * 
 * </copyright>
 *
 * $Id: IdentifiedCSValidator.java,v 1.1 2008/07/23 10:05:08 qglineur Exp $
 */
package org.eclipse.qvt.declarative.parser.qvt.cst.validation;

import org.eclipse.qvt.declarative.parser.qvt.cst.IdentifierCS;

/**
 * A sample validator interface for {@link org.eclipse.qvt.declarative.parser.qvt.cst.IdentifiedCS}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IdentifiedCSValidator {
	boolean validate();

	boolean validateIdentifier(IdentifierCS value);
}
