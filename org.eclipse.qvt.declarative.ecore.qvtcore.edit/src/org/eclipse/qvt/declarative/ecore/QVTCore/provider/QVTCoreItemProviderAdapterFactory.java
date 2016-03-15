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
 * $Id: QVTCoreItemProviderAdapterFactory.java,v 1.2 2009/02/17 21:38:50 ewillink Exp $
 */
package org.eclipse.qvt.declarative.ecore.QVTCore.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.qvt.declarative.ecore.QVTCore.util.QVTCoreAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTCoreItemProviderAdapterFactory extends QVTCoreAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTCoreItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.BottomPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottomPatternItemProvider bottomPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.BottomPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBottomPatternAdapter() {
		if (bottomPatternItemProvider == null) {
			bottomPatternItemProvider = new BottomPatternItemProvider(this);
		}

		return bottomPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.CoreDomain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDomainItemProvider coreDomainItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.CoreDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoreDomainAdapter() {
		if (coreDomainItemProvider == null) {
			coreDomainItemProvider = new CoreDomainItemProvider(this);
		}

		return coreDomainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.CorePattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorePatternItemProvider corePatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.CorePattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCorePatternAdapter() {
		if (corePatternItemProvider == null) {
			corePatternItemProvider = new CorePatternItemProvider(this);
		}

		return corePatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.EnforcementOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnforcementOperationItemProvider enforcementOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.EnforcementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnforcementOperationAdapter() {
		if (enforcementOperationItemProvider == null) {
			enforcementOperationItemProvider = new EnforcementOperationItemProvider(this);
		}

		return enforcementOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.GuardPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardPatternItemProvider guardPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.GuardPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuardPatternAdapter() {
		if (guardPatternItemProvider == null) {
			guardPatternItemProvider = new GuardPatternItemProvider(this);
		}

		return guardPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.Mapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingItemProvider mappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingAdapter() {
		if (mappingItemProvider == null) {
			mappingItemProvider = new MappingItemProvider(this);
		}

		return mappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.PropertyAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAssignmentItemProvider propertyAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.PropertyAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAssignmentAdapter() {
		if (propertyAssignmentItemProvider == null) {
			propertyAssignmentItemProvider = new PropertyAssignmentItemProvider(this);
		}

		return propertyAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.RealizedVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizedVariableItemProvider realizedVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.RealizedVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealizedVariableAdapter() {
		if (realizedVariableItemProvider == null) {
			realizedVariableItemProvider = new RealizedVariableItemProvider(this);
		}

		return realizedVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.qvt.declarative.ecore.QVTCore.VariableAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignmentItemProvider variableAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.qvt.declarative.ecore.QVTCore.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAssignmentAdapter() {
		if (variableAssignmentItemProvider == null) {
			variableAssignmentItemProvider = new VariableAssignmentItemProvider(this);
		}

		return variableAssignmentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (bottomPatternItemProvider != null) bottomPatternItemProvider.dispose();
		if (coreDomainItemProvider != null) coreDomainItemProvider.dispose();
		if (corePatternItemProvider != null) corePatternItemProvider.dispose();
		if (enforcementOperationItemProvider != null) enforcementOperationItemProvider.dispose();
		if (guardPatternItemProvider != null) guardPatternItemProvider.dispose();
		if (mappingItemProvider != null) mappingItemProvider.dispose();
		if (propertyAssignmentItemProvider != null) propertyAssignmentItemProvider.dispose();
		if (realizedVariableItemProvider != null) realizedVariableItemProvider.dispose();
		if (variableAssignmentItemProvider != null) variableAssignmentItemProvider.dispose();
	}

}