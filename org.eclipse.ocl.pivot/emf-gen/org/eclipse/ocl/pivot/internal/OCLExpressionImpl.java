/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.OCLExpressionImpl#getTypeValue <em>Type Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OCLExpressionImpl
		extends TypedElementImpl
		implements OCLExpression {

	/**
	 * The cached value of the '{@link #getTypeValue() <em>Type Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeValue()
	 * @generated
	 * @ordered
	 */
	protected Type typeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.OCL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getTypeValue()
	{
		return typeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeValue(Type newTypeValue)
	{
		Type oldTypeValue = typeValue;
		typeValue = newTypeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.OCL_EXPRESSION__TYPE_VALUE, oldTypeValue, typeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PivotPackage.OCL_EXPRESSION__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.OCL_EXPRESSION__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.OCL_EXPRESSION__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.OCL_EXPRESSION__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.OCL_EXPRESSION__NAME:
				return getName();
			case PivotPackage.OCL_EXPRESSION__IS_MANY:
				return isIsMany();
			case PivotPackage.OCL_EXPRESSION__IS_REQUIRED:
				return isIsRequired();
			case PivotPackage.OCL_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.OCL_EXPRESSION__TYPE_VALUE:
				return getTypeValue();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PivotPackage.OCL_EXPRESSION__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.OCL_EXPRESSION__TYPE_VALUE:
				setTypeValue((Type)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PivotPackage.OCL_EXPRESSION__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.OCL_EXPRESSION__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.OCL_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.OCL_EXPRESSION__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case PivotPackage.OCL_EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.OCL_EXPRESSION__TYPE_VALUE:
				setTypeValue((Type)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PivotPackage.OCL_EXPRESSION__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.OCL_EXPRESSION__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.OCL_EXPRESSION__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.OCL_EXPRESSION__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.OCL_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.OCL_EXPRESSION__IS_MANY:
				return isIsMany() != IS_MANY_EDEFAULT;
			case PivotPackage.OCL_EXPRESSION__IS_REQUIRED:
				return ((eFlags & IS_REQUIRED_EFLAG) != 0) != IS_REQUIRED_EDEFAULT;
			case PivotPackage.OCL_EXPRESSION__TYPE:
				return type != null;
			case PivotPackage.OCL_EXPRESSION__TYPE_VALUE:
				return typeValue != null;
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitOCLExpression(this);
	}
} //OCLExpressionImpl
