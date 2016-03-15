/*******************************************************************************
* Copyright (c) 2007 IBM Corporation.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Robert Fuhrer (rfuhrer@watson.ibm.com) - initial API and implementation
*******************************************************************************/

package org.eclipse.imp.services;

import java.util.List;

/**
 * Operations related to the management of marker types that may be
 * provided by clients of the parse controller; may be used by cooperating
 * clients, e.g., editors and builders, to share marker types.
 * 
 * This is probably a temporary expedient until a more general scheme
 * of marker management across IDE services can be developed.
 * @author suttons@us.ibm.com
 */
public interface IAnnotationTypeInfo {
    /**
     * Add a type of problem marker to the list of problem marker
     * types to which errors generated by this parser may correspond.
     * 
     * @param problemMarkerType The name of the problem marker type
     */
    public void addProblemMarkerType(String problemMarkerType);

    /**
     * Provide the list of problem marker types to which errors
     * generated by this parser may correspond.
     * 
     * @return  The list of problem marker types
     */
    public List<String> getProblemMarkerTypes();

    /**
     * Remove a type of problem marker from the list of problem marker
     * types to which errors generated by this parser may correspond.
     * 
     * @param problemMarkerType The name of the problem marker type
     */
    public void removeProblemMarkerType(String problemMarkerType);
}
