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
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrich Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#isCloneSource <em>Clone Source</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXpath <em>Source Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXML <em>Source XML</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetAction <em>Target Action</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetXpath <em>Target Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetProperty <em>Target Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator()
 * @model
 * @generated
 */
public interface EnrichMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Clone Source</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clone Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Source</em>' attribute.
	 * @see #setCloneSource(boolean)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_CloneSource()
	 * @model default="false"
	 * @generated
	 */
	boolean isCloneSource();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#isCloneSource <em>Clone Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clone Source</em>' attribute.
	 * @see #isCloneSource()
	 * @generated
	 */
	void setCloneSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The default value is <code>"CUSTOM"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType
	 * @see #setSourceType(EnrichSourceType)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_SourceType()
	 * @model default="CUSTOM"
	 * @generated
	 */
	EnrichSourceType getSourceType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(EnrichSourceType value);

	/**
	 * Returns the value of the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Xpath</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Xpath</em>' containment reference.
	 * @see #setSourceXpath(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_SourceXpath()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getSourceXpath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXpath <em>Source Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Xpath</em>' containment reference.
	 * @see #getSourceXpath()
	 * @generated
	 */
	void setSourceXpath(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' attribute.
	 * The default value is <code>"source_property"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' attribute.
	 * @see #setSourceProperty(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_SourceProperty()
	 * @model default="source_property"
	 * @generated
	 */
	String getSourceProperty();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceProperty <em>Source Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' attribute.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(String value);

	/**
	 * Returns the value of the '<em><b>Source XML</b></em>' attribute.
	 * The default value is <code>"<inline/>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source XML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source XML</em>' attribute.
	 * @see #setSourceXML(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_SourceXML()
	 * @model default="<inline/>"
	 * @generated
	 */
	String getSourceXML();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXML <em>Source XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source XML</em>' attribute.
	 * @see #getSourceXML()
	 * @generated
	 */
	void setSourceXML(String value);

	/**
	 * Returns the value of the '<em><b>Target Action</b></em>' attribute.
	 * The default value is <code>"REPLACE"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Action</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction
	 * @see #setTargetAction(EnrichTargetAction)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_TargetAction()
	 * @model default="REPLACE"
	 * @generated
	 */
	EnrichTargetAction getTargetAction();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetAction <em>Target Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Action</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction
	 * @see #getTargetAction()
	 * @generated
	 */
	void setTargetAction(EnrichTargetAction value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' attribute.
	 * The default value is <code>"CUSTOM"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType
	 * @see #setTargetType(EnrichTargetType)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_TargetType()
	 * @model default="CUSTOM"
	 * @generated
	 */
	EnrichTargetType getTargetType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(EnrichTargetType value);

	/**
	 * Returns the value of the '<em><b>Target Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Xpath</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Xpath</em>' containment reference.
	 * @see #setTargetXpath(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_TargetXpath()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getTargetXpath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetXpath <em>Target Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Xpath</em>' containment reference.
	 * @see #getTargetXpath()
	 * @generated
	 */
	void setTargetXpath(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' attribute.
	 * The default value is <code>"target_property"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' attribute.
	 * @see #setTargetProperty(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEnrichMediator_TargetProperty()
	 * @model default="target_property"
	 * @generated
	 */
	String getTargetProperty();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetProperty <em>Target Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' attribute.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(String value);

} // EnrichMediator
