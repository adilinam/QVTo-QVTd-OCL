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
package org.eclipse.ocl.xtext.base.services;

import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

public class BaseQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider
{
	protected String name(NamedElement namdElement) {
		return namdElement.getName();
	}
}
