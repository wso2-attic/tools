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
package org.wso2.carbonstudio.eclipse.esb.mediator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EventMediatorImpl#getEventSourceName <em>Event Source Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventMediatorImpl extends MediatorImpl implements EventMediator {
	/**
	 * The default value of the '{@link #getEventSourceName() <em>Event Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_SOURCE_NAME_EDEFAULT = "event_source_name";

	/**
	 * The cached value of the '{@link #getEventSourceName() <em>Event Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceName()
	 * @generated
	 * @ordered
	 */
	protected String eventSourceName = EVENT_SOURCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventMediatorImpl() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		if (self.hasAttribute("eventSourceName")) {
			setEventSourceName(self.getAttribute("eventSourceName"));
		}
		
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent,"eventPublisher");
		self.setAttribute("eventSourceName", getEventSourceName());
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.EVENT_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventSourceName() {
		return eventSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventSourceName(String newEventSourceName) {
		String oldEventSourceName = eventSourceName;
		eventSourceName = newEventSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.EVENT_MEDIATOR__EVENT_SOURCE_NAME, oldEventSourceName, eventSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediatorPackage.EVENT_MEDIATOR__EVENT_SOURCE_NAME:
				return getEventSourceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediatorPackage.EVENT_MEDIATOR__EVENT_SOURCE_NAME:
				setEventSourceName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MediatorPackage.EVENT_MEDIATOR__EVENT_SOURCE_NAME:
				setEventSourceName(EVENT_SOURCE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MediatorPackage.EVENT_MEDIATOR__EVENT_SOURCE_NAME:
				return EVENT_SOURCE_NAME_EDEFAULT == null ? eventSourceName != null : !EVENT_SOURCE_NAME_EDEFAULT.equals(eventSourceName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eventSourceName: ");
		result.append(eventSourceName);
		result.append(')');
		return result.toString();
	}

} //EventMediatorImpl
