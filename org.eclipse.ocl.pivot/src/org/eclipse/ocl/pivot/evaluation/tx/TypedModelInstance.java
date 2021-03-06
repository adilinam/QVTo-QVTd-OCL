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
package org.eclipse.ocl.pivot.evaluation.tx;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * A TypedModelInstance makes an input or output model of an executing transformation
 * accessible as a model instance.
 * 
 * @since 1.1
 * @noimplement clients should derive from AbstractTypedModelInstance
 */
public interface TypedModelInstance
{
	@NonNull Collection<EObject> getAllObjects();
	@Nullable String getName();
	@NonNull Collection<EObject> getObjectsOfKind(org.eclipse.ocl.pivot.@NonNull Class type);
	@NonNull Collection<EObject> getObjectsOfType(org.eclipse.ocl.pivot.@NonNull Class type);
	@NonNull Collection<EObject> getRootObjects();
}
