/*******************************************************************************
 * Copyright (c) 2007, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.examples.interpreter.console.text;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;


/**
 * Syntax-highlighting scanner for OCL comments.  I consists of no rules because
 * all of the text in a comment should have the same style.
 * 
 * @author Christian W. Damus (cdamus)
 */
class OCLCommentScanner
    extends RuleBasedScanner {

    OCLCommentScanner(ColorManager manager) {
        super();
        
        setRules(new IRule[0]);
    }
}
