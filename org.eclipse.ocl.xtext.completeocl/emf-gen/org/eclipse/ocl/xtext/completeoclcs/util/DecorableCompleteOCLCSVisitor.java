/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * This code is auto-generated
 * from: org.eclipse.ocl.xtext.completeocl/model/CompleteOCLCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.ocl.xtext.completeoclcs.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 */
public interface DecorableCompleteOCLCSVisitor<R> extends CompleteOCLCSVisitor<R>, org.eclipse.ocl.xtext.essentialoclcs.util.DecorableEssentialOCLCSVisitor<R>
{
	@Override
	void setUndecoratedVisitor(org.eclipse.ocl.xtext.basecs.util.@NonNull BaseCSVisitor<R> visitor);
}
