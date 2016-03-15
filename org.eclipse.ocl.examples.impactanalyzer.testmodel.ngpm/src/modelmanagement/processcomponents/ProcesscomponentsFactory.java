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
package modelmanagement.processcomponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelmanagement.processcomponents.ProcesscomponentsPackage
 * @generated
 */
public interface ProcesscomponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcesscomponentsFactory eINSTANCE = modelmanagement.processcomponents.impl.ProcesscomponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Component Inside Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Component Inside Company</em>'.
	 * @generated
	 */
	ProcessComponentInsideCompany createProcessComponentInsideCompany();

	/**
	 * Returns a new object of class '<em>Process Component Outside Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Component Outside Company</em>'.
	 * @generated
	 */
	ProcessComponentOutsideCompany createProcessComponentOutsideCompany();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcesscomponentsPackage getProcesscomponentsPackage();

} //ProcesscomponentsFactory
