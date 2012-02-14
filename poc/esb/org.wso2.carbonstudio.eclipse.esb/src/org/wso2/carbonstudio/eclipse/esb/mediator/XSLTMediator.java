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
 * A representation of the model object '<em><b>XSLT Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getXsltKey <em>Xslt Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getSourceXPath <em>Source XPath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator()
 * @model
 * @generated
 */
public interface XSLTMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Xslt Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xslt Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xslt Key</em>' containment reference.
	 * @see #setXsltKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator_XsltKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getXsltKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getXsltKey <em>Xslt Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xslt Key</em>' containment reference.
	 * @see #getXsltKey()
	 * @generated
	 */
	void setXsltKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Source XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source XPath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source XPath</em>' containment reference.
	 * @see #setSourceXPath(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator_SourceXPath()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getSourceXPath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getSourceXPath <em>Source XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source XPath</em>' containment reference.
	 * @see #getSourceXPath()
	 * @generated
	 */
	void setSourceXPath(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSLTProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSLTFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getXSLTMediator_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSLTResource> getResources();

} // XSLTMediator
