/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPointInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPointWestOutputConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient List End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RecipientListEndPointImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RecipientListEndPointImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RecipientListEndPointImpl#getWestOutputConnector <em>West Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipientListEndPointImpl extends ParentEndPointImpl implements RecipientListEndPoint {
	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected RecipientListEndPointInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<RecipientListEndPointOutputConnector> outputConnector;

	/**
	 * The cached value of the '{@link #getWestOutputConnector() <em>West Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWestOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected RecipientListEndPointWestOutputConnector westOutputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipientListEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.RECIPIENT_LIST_END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientListEndPointInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(RecipientListEndPointInputConnector newInputConnector, NotificationChain msgs) {
		RecipientListEndPointInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(RecipientListEndPointInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecipientListEndPointOutputConnector> getOutputConnector() {
		if (outputConnector == null) {
			outputConnector = new EObjectContainmentEList<RecipientListEndPointOutputConnector>(RecipientListEndPointOutputConnector.class, this, EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR);
		}
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientListEndPointWestOutputConnector getWestOutputConnector() {
		return westOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWestOutputConnector(RecipientListEndPointWestOutputConnector newWestOutputConnector, NotificationChain msgs) {
		RecipientListEndPointWestOutputConnector oldWestOutputConnector = westOutputConnector;
		westOutputConnector = newWestOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR, oldWestOutputConnector, newWestOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWestOutputConnector(RecipientListEndPointWestOutputConnector newWestOutputConnector) {
		if (newWestOutputConnector != westOutputConnector) {
			NotificationChain msgs = null;
			if (westOutputConnector != null)
				msgs = ((InternalEObject)westOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR, null, msgs);
			if (newWestOutputConnector != null)
				msgs = ((InternalEObject)newWestOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetWestOutputConnector(newWestOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR, newWestOutputConnector, newWestOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR:
				return ((InternalEList<?>)getOutputConnector()).basicRemove(otherEnd, msgs);
			case EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR:
				return basicSetWestOutputConnector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR:
				return getWestOutputConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR:
				setInputConnector((RecipientListEndPointInputConnector)newValue);
				return;
			case EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR:
				getOutputConnector().clear();
				getOutputConnector().addAll((Collection<? extends RecipientListEndPointOutputConnector>)newValue);
				return;
			case EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR:
				setWestOutputConnector((RecipientListEndPointWestOutputConnector)newValue);
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
			case EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR:
				setInputConnector((RecipientListEndPointInputConnector)null);
				return;
			case EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR:
				getOutputConnector().clear();
				return;
			case EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR:
				setWestOutputConnector((RecipientListEndPointWestOutputConnector)null);
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
			case EsbPackage.RECIPIENT_LIST_END_POINT__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.RECIPIENT_LIST_END_POINT__OUTPUT_CONNECTOR:
				return outputConnector != null && !outputConnector.isEmpty();
			case EsbPackage.RECIPIENT_LIST_END_POINT__WEST_OUTPUT_CONNECTOR:
				return westOutputConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //RecipientListEndPointImpl
