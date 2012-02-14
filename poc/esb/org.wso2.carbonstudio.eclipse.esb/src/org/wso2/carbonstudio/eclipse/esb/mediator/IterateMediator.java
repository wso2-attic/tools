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
 * A representation of the model object '<em><b>Iterate Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isContinueParent <em>Continue Parent</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isPreservePayload <em>Preserve Payload</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getIterateExpression <em>Iterate Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getAttachPath <em>Attach Path</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator()
 * @model
 * @generated
 */
public interface IterateMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Continue Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue Parent</em>' attribute.
	 * @see #setContinueParent(boolean)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator_ContinueParent()
	 * @model
	 * @generated
	 */
	boolean isContinueParent();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isContinueParent <em>Continue Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue Parent</em>' attribute.
	 * @see #isContinueParent()
	 * @generated
	 */
	void setContinueParent(boolean value);

	/**
	 * Returns the value of the '<em><b>Preserve Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preserve Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preserve Payload</em>' attribute.
	 * @see #setPreservePayload(boolean)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator_PreservePayload()
	 * @model
	 * @generated
	 */
	boolean isPreservePayload();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isPreservePayload <em>Preserve Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Payload</em>' attribute.
	 * @see #isPreservePayload()
	 * @generated
	 */
	void setPreservePayload(boolean value);

	/**
	 * Returns the value of the '<em><b>Iterate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterate Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterate Expression</em>' containment reference.
	 * @see #setIterateExpression(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator_IterateExpression()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getIterateExpression();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getIterateExpression <em>Iterate Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterate Expression</em>' containment reference.
	 * @see #getIterateExpression()
	 * @generated
	 */
	void setIterateExpression(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Attach Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Path</em>' containment reference.
	 * @see #setAttachPath(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator_AttachPath()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getAttachPath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getAttachPath <em>Attach Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Path</em>' containment reference.
	 * @see #getAttachPath()
	 * @generated
	 */
	void setAttachPath(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(IterateTarget)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getIterateMediator_Target()
	 * @model containment="true"
	 * @generated
	 */
	IterateTarget getTarget();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IterateTarget value);

} // IterateMediator
