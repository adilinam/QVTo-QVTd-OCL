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
package data.tuples;

import data.classes.TypeDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tuple type defines named and typed elements. Conformance for tuple types is less strict. It need not be explicitly defined as is required for classes. This allows tuple types to conform to each other based on their structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.tuples.TupleTypeDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.tuples.TuplesPackage#getTupleTypeDefinition()
 * @model
 * @generated
 */
public interface TupleTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link data.tuples.TupleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see data.tuples.TuplesPackage#getTupleTypeDefinition_Elements()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<TupleElement> getElements();

} // TupleTypeDefinition
