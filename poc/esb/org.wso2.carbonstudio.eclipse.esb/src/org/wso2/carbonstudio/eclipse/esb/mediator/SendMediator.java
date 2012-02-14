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

import org.wso2.carbonstudio.eclipse.esb.EndPoint;
import org.wso2.carbonstudio.eclipse.esb.EndPointReference;
import org.wso2.carbonstudio.eclipse.esb.Mediator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getAnonymousEndPoint <em>Anonymous End Point</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getEndPointReference <em>End Point Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSendMediator()
 * @model
 * @generated
 */
public interface SendMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Anonymous End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous End Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous End Point</em>' containment reference.
	 * @see #setAnonymousEndPoint(EndPoint)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSendMediator_AnonymousEndPoint()
	 * @model containment="true"
	 * @generated
	 */
	EndPoint getAnonymousEndPoint();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getAnonymousEndPoint <em>Anonymous End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous End Point</em>' containment reference.
	 * @see #getAnonymousEndPoint()
	 * @generated
	 */
	void setAnonymousEndPoint(EndPoint value);

	/**
	 * Returns the value of the '<em><b>End Point Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Point Reference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Reference</em>' containment reference.
	 * @see #setEndPointReference(EndPointReference)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSendMediator_EndPointReference()
	 * @model containment="true"
	 * @generated
	 */
    EndPointReference getEndPointReference();

    /**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getEndPointReference <em>End Point Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Reference</em>' containment reference.
	 * @see #getEndPointReference()
	 * @generated
	 */
    void setEndPointReference(EndPointReference value);

} // SendMediator
