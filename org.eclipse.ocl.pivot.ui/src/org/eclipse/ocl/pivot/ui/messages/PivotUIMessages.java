/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.ui.messages;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 */
public class PivotUIMessages
{	
	static {
		NLS.initializeMessages(PivotUIMessages.class.getName(), PivotUIMessages.class);
	}

	public static String Pivot_MissingSafeNavigation;
	public static String Pivot_RedundantSafeNavigation;

	public static String Pivot_Severity_Ignore;
	public static String Pivot_Severity_Warning;
	public static String Pivot_Severity_Error;

	public static String Pivot_PageTitle;
}
