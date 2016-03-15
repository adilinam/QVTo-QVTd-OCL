/*******************************************************************************
 * Copyright (c) 2009, 2014 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************
 */
package abapmapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abapmapping.AbapmappingPackage
 * @generated
 */
public interface AbapmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbapmappingFactory eINSTANCE = abapmapping.impl.AbapmappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abap Class Implementation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abap Class Implementation Annotation</em>'.
	 * @generated
	 */
	AbapClassImplementationAnnotation createAbapClassImplementationAnnotation();

	/**
	 * Returns a new object of class '<em>Abap Association Implementation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abap Association Implementation Annotation</em>'.
	 * @generated
	 */
	AbapAssociationImplementationAnnotation createAbapAssociationImplementationAnnotation();

	/**
	 * Returns a new object of class '<em>Abap Association End Implementation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abap Association End Implementation Annotation</em>'.
	 * @generated
	 */
	AbapAssociationEndImplementationAnnotation createAbapAssociationEndImplementationAnnotation();

	/**
	 * Returns a new object of class '<em>Abap Signature Implementation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abap Signature Implementation Annotation</em>'.
	 * @generated
	 */
	AbapSignatureImplementationAnnotation createAbapSignatureImplementationAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbapmappingPackage getAbapmappingPackage();

} //AbapmappingFactory
