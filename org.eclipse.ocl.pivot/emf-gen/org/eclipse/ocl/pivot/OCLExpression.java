/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.OCLExpression#getTypeValue <em>Type Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ocl.pivot.PivotPackage#getOCLExpression()
 * @generated
 */
public interface OCLExpression extends TypedElement {

	/**
	 * Returns the value of the '<em><b>Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Value</em>' reference.
	 * @see #setTypeValue(Type)
	 * @see org.eclipse.ocl.pivot.PivotPackage#getOCLExpression_TypeValue()
	 * @generated
	 */
	Type getTypeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.pivot.OCLExpression#getTypeValue <em>Type Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Value</em>' reference.
	 * @see #getTypeValue()
	 * @generated
	 */
	void setTypeValue(Type value);

} // OCLExpression
