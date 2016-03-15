/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *     Adolfo Sanchez-Barbudo Herrera (University of York) - Bug 397429
 *******************************************************************************/
package org.eclipse.ocl.xtext.oclstdlib.cs2as;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.essentialocl.cs2as.EssentialOCLCS2AS;
import org.eclipse.ocl.xtext.oclstdlibcs.MetaclassNameCS;
import org.eclipse.ocl.xtext.oclstdlibcs.OCLstdlibCSFactory;
import org.eclipse.ocl.xtext.oclstdlibcs.util.OCLstdlibCSVisitor;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class OCLstdlibCS2AS extends EssentialOCLCS2AS
{	
	private static @Nullable Map<String, MetaclassNameCS> metaTypeNames = null;

	public static @Nullable MetaclassNameCS lookUpMetaTypeName(@NonNull EObject csElement, /*@NonNull*/ EStructuralFeature eFeature) {
		Map<String, MetaclassNameCS> metaTypeNames2 = metaTypeNames;
		if (metaTypeNames2 == null) {
			Resource metaTypeResource = new ResourceImpl(URI.createURI("internal_list;;//of_meta-type_names"));
			List<EObject> metaTypes = metaTypeResource.getContents();
			metaTypeNames2 = metaTypeNames = new HashMap<String, MetaclassNameCS>();
			for (EClassifier eClassifier : PivotPackage.eINSTANCE.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					if (PivotPackage.Literals.CLASS.isSuperTypeOf((EClass) eClassifier)) {
						MetaclassNameCS metaTypeName = OCLstdlibCSFactory.eINSTANCE.createMetaclassNameCS();
						String name = eClassifier.getName();
						metaTypeName.setName(name);
						metaTypeNames2.put(name, metaTypeName);
						metaTypes.add(metaTypeName);			// Avoid detection of orphans by EnvironmentView.addElement()
					}
				}
			}
		}
		List<INode> featureNodes = NodeModelUtils.findNodesForFeature(csElement, eFeature);
		if ((featureNodes != null) && (featureNodes.size() > 0)) {
			String metaTypeNameText = NodeModelUtils.getTokenText(featureNodes.get(0));
			MetaclassNameCS metaTypeName = metaTypeNames2.get(metaTypeNameText);
			csElement.eSet(eFeature, metaTypeName);
			return metaTypeName;
		}
		return null;
	}

	public OCLstdlibCS2AS(@NonNull EnvironmentFactoryInternal environmentFactory, @NonNull BaseCSResource csResource, @NonNull ASResource asResource) {
		super(environmentFactory, csResource, asResource);
	}
	
	public OCLstdlibCS2AS(@NonNull OCLstdlibCS2AS cs2as) {
		super(cs2as);
	}

	@Override
	protected @NonNull OCLstdlibCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull CS2ASConversion converter) {
		return new OCLstdlibCSContainmentVisitor(converter);
	}

	@Override
	protected @NonNull OCLstdlibCSVisitor<Element> createLeft2RightVisitor(@NonNull CS2ASConversion converter) {
		return new OCLstdlibCSLeft2RightVisitor(converter);
	}

	@Override
	protected @NonNull OCLstdlibCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull CS2ASConversion converter) {
		return new OCLstdlibCSPostOrderVisitor(converter);
	}

	@Override
	protected @NonNull OCLstdlibCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull CS2ASConversion converter) {
		return new OCLstdlibCSPreOrderVisitor(converter);
	}

	@Override
	public synchronized void update(@NonNull IDiagnosticConsumer diagnosticsConsumer) {
		metamodelManager.setLibraryLoadInProgress(metamodelManager.getLibraryResource() == null);
		try {
			super.update(diagnosticsConsumer);
		} finally {
			metamodelManager.setLibraryLoadInProgress(false);
		}
	}
}
