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
package persistence.actions;

import behavioral.actions.StatementWithArgument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement With Entity Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see persistence.actions.ActionsPackage#getStatementWithEntityArgument()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CanStoreOnlyEntities='if self.argument.getType().oclIsKindOf(data::classes::ClassTypeDefinition) then\r\n    not self.argument.getType().oclAsType(data::classes::ClassTypeDefinition).clazz.valueType\r\n  else\r\n    false\r\n  endif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CanStoreOnlyEntities'"
 * @generated
 */
public interface StatementWithEntityArgument extends StatementWithArgument {
} // StatementWithEntityArgument
