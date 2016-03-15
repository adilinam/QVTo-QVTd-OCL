/**
 * <copyright>
 * 
 * Copyright (c) 2007,2008 E.D.Willink and others.
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
 * $Id: OCLParsingError.java,v 1.1 2008/08/14 07:52:38 ewillink Exp $
 */
package org.eclipse.qvt.declarative.parser.ocl;

/**
 * OCLParsingError propagates parsing errors detectable within the OCL parser to avoid
 * hideous stack overflows.
 * 
 * FIXME lose this class as soon as the OCL Parser is NPE proof
 */
public class OCLParsingError extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public OCLParsingError(String message) {
		super(message);
	}	
}