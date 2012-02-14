/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.esb.mediator;

import org.eclipse.emf.common.util.EList;
import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XQuery Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getQueryKey <em>Query Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getTargetXPath <em>Target XPath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXQueryMediator()
 * @model
 * @generated
 */
public interface XQueryMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Query Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Key</em>' containment reference.
	 * @see #setQueryKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXQueryMediator_QueryKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getQueryKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getQueryKey <em>Query Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Key</em>' containment reference.
	 * @see #getQueryKey()
	 * @generated
	 */
	void setQueryKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Target XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target XPath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target XPath</em>' containment reference.
	 * @see #setTargetXPath(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXQueryMediator_TargetXPath()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getTargetXPath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getTargetXPath <em>Target XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target XPath</em>' containment reference.
	 * @see #getTargetXPath()
	 * @generated
	 */
	void setTargetXPath(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXQueryMediator_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<XQueryVariable> getVariables();

} // XQueryMediator
