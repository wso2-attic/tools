/**
 * Copyright (c) 2008 IBM Corporation, University of Stuttgart (IAAS) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation, University of Stuttgart (IAAS) - initial API and implementation
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.dd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCleanup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup#getOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.ddPackage#getTCleanup()
 * @model extendedMetaData="name='tCleanup' kind='elementOnly'"
 * @generated
 */
public interface TCleanup extends TEnableEventList { // EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.bpel.apache.ode.deploy.model.dd.CategoryType}.
	 * The literals are from the enumeration {@link org.eclipse.bpel.apache.ode.deploy.model.dd.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute list.
	 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.CategoryType
	 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.ddPackage#getTCleanup_Category()
	 * @model default="all" unique="false"
	 * @generated
	 */
	EList<CategoryType> getCategory();

	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel.apache.ode.deploy.model.dd.OnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.OnType
	 * @see #isSetOn()
	 * @see #unsetOn()
	 * @see #setOn(OnType)
	 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.ddPackage#getTCleanup_On()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='on'"
	 * @generated
	 */
	OnType getOn();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see org.eclipse.bpel.apache.ode.deploy.model.dd.OnType
	 * @see #isSetOn()
	 * @see #unsetOn()
	 * @see #getOn()
	 * @generated
	 */
	void setOn(OnType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOn()
	 * @see #getOn()
	 * @see #setOn(OnType)
	 * @generated
	 */
	void unsetOn();

	/**
	 * Returns whether the value of the '{@link org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup#getOn <em>On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On</em>' attribute is set.
	 * @see #unsetOn()
	 * @see #getOn()
	 * @see #setOn(OnType)
	 * @generated
	 */
	boolean isSetOn();

} // TCleanup
