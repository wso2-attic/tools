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

import org.wso2.carbonstudio.eclipse.esb.Mediator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entitlement Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getUsername <em>Username</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEntitlementMediator()
 * @model
 * @generated
 */
public interface EntitlementMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Server URL</b></em>' attribute.
	 * The default value is <code>"server_url"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server URL</em>' attribute.
	 * @see #setServerURL(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEntitlementMediator_ServerURL()
	 * @model default="server_url"
	 * @generated
	 */
	String getServerURL();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getServerURL <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server URL</em>' attribute.
	 * @see #getServerURL()
	 * @generated
	 */
	void setServerURL(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"username"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEntitlementMediator_Username()
	 * @model default="username"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"password"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEntitlementMediator_Password()
	 * @model default="password"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // EntitlementMediator
