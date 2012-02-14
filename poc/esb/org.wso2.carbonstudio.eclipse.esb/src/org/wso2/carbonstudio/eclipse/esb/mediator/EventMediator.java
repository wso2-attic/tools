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
 * A representation of the model object '<em><b>Event Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator#getEventSourceName <em>Event Source Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEventMediator()
 * @model
 * @generated
 */
public interface EventMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Event Source Name</b></em>' attribute.
	 * The default value is <code>"event_source_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Source Name</em>' attribute.
	 * @see #setEventSourceName(String)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getEventMediator_EventSourceName()
	 * @model default="event_source_name"
	 * @generated
	 */
	String getEventSourceName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator#getEventSourceName <em>Event Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Source Name</em>' attribute.
	 * @see #getEventSourceName()
	 * @generated
	 */
	void setEventSourceName(String value);

} // EventMediator
