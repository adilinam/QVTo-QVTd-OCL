/**
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.ocl.pivot.uml.internal.oclforuml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.pivot.uml.internal.oclforuml.OCLforUMLPackage;
import org.eclipse.ocl.pivot.uml.internal.oclforuml.Validations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.uml.internal.oclforuml.impl.ValidationsImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.uml.internal.oclforuml.impl.ValidationsImpl#isValidateInstanceSpecifications <em>Validate Instance Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationsImpl
		extends EObjectImpl
		implements Validations {

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #isValidateInstanceSpecifications() <em>Validate Instance Specifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateInstanceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATE_INSTANCE_SPECIFICATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidateInstanceSpecifications() <em>Validate Instance Specifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateInstanceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected boolean validateInstanceSpecifications = VALIDATE_INSTANCE_SPECIFICATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLforUMLPackage.Literals.VALIDATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy())
		{
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidateInstanceSpecifications() {
		return validateInstanceSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateInstanceSpecifications(
			boolean newValidateInstanceSpecifications) {
		boolean oldValidateInstanceSpecifications = validateInstanceSpecifications;
		validateInstanceSpecifications = newValidateInstanceSpecifications;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLforUMLPackage.VALIDATIONS__VALIDATE_INSTANCE_SPECIFICATIONS, oldValidateInstanceSpecifications, validateInstanceSpecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case OCLforUMLPackage.VALIDATIONS__VALIDATE_INSTANCE_SPECIFICATIONS:
				return isValidateInstanceSpecifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case OCLforUMLPackage.VALIDATIONS__VALIDATE_INSTANCE_SPECIFICATIONS:
				setValidateInstanceSpecifications((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case OCLforUMLPackage.VALIDATIONS__VALIDATE_INSTANCE_SPECIFICATIONS:
				setValidateInstanceSpecifications(VALIDATE_INSTANCE_SPECIFICATIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case OCLforUMLPackage.VALIDATIONS__BASE_PACKAGE:
				return base_Package != null;
			case OCLforUMLPackage.VALIDATIONS__VALIDATE_INSTANCE_SPECIFICATIONS:
				return validateInstanceSpecifications != VALIDATE_INSTANCE_SPECIFICATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (validateInstanceSpecifications: "); //$NON-NLS-1$
		result.append(validateInstanceSpecifications);
		result.append(')');
		return result.toString();
	}

} //ValidationsImpl
