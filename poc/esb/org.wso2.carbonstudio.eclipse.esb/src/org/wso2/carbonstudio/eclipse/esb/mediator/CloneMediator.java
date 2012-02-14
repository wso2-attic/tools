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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#isContinueParent <em>Continue Parent</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getCloneMediator()
 * @model
 * @generated
 */
public interface CloneMediator extends Mediator {
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
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getCloneMediator_ContinueParent()
	 * @model
	 * @generated
	 */
	boolean isContinueParent();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#isContinueParent <em>Continue Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue Parent</em>' attribute.
	 * @see #isContinueParent()
	 * @generated
	 */
	void setContinueParent(boolean value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getCloneMediator_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloneTarget> getTargets();

} // CloneMediator
