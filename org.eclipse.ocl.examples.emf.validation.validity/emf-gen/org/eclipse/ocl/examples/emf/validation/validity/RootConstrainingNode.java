/*******************************************************************************
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.emf.validation.validity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root ConstrainingNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage#getRootConstrainingNode()
 * @model
 * @generated
 */
public interface RootConstrainingNode extends ConstrainingNode {
	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.emf.validation.validity.RootNode#getConstrainingNodes <em>Constraining Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' container reference.
	 * @see #setRootNode(RootNode)
	 * @see org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage#getRootConstrainingNode_RootNode()
	 * @see org.eclipse.ocl.examples.emf.validation.validity.RootNode#getConstrainingNodes
	 * @model opposite="constrainingNodes" required="true" transient="false"
	 * @generated
	 */
	RootNode getRootNode();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode#getRootNode <em>Root Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' container reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(RootNode value);

} // RootConstrainingNode
