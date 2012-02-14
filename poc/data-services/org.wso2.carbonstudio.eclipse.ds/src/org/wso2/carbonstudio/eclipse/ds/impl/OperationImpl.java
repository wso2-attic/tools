/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.Operation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl#getName <em>
 * Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl#getCallQuery
 * <em>Call Query</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl#getCallQueryList
 * <em>Call Query List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCallQuery() <em>Call Query</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCallQuery()
	 * @generated
	 * @ordered
	 */
	protected CallQuery callQuery;

	/**
	 * The cached value of the '{@link #getCallQueryList()
	 * <em>Call Query List</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCallQueryList()
	 * @generated
	 * @ordered
	 */
	protected CallQueryList callQueryList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallQuery getCallQuery() {
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCallQuery(CallQuery newCallQuery, NotificationChain msgs) {
		CallQuery oldCallQuery = callQuery;
		callQuery = newCallQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.OPERATION__CALL_QUERY, oldCallQuery, newCallQuery);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCallQuery(CallQuery newCallQuery) {
		if (newCallQuery != callQuery) {
			NotificationChain msgs = null;
			if (callQuery != null)
				msgs = ((InternalEObject) callQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DsPackage.OPERATION__CALL_QUERY, null, msgs);
			if (newCallQuery != null)
				msgs = ((InternalEObject) newCallQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DsPackage.OPERATION__CALL_QUERY, null, msgs);
			msgs = basicSetCallQuery(newCallQuery, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__CALL_QUERY,
					newCallQuery, newCallQuery));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallQueryList getCallQueryList() {
		return callQueryList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCallQueryList(CallQueryList newCallQueryList,
			NotificationChain msgs) {
		CallQueryList oldCallQueryList = callQueryList;
		callQueryList = newCallQueryList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.OPERATION__CALL_QUERY_LIST, oldCallQueryList, newCallQueryList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCallQueryList(CallQueryList newCallQueryList) {
		if (newCallQueryList != callQueryList) {
			NotificationChain msgs = null;
			if (callQueryList != null)
				msgs = ((InternalEObject) callQueryList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY_LIST, null, msgs);
			if (newCallQueryList != null)
				msgs = ((InternalEObject) newCallQueryList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY_LIST, null, msgs);
			msgs = basicSetCallQueryList(newCallQueryList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.OPERATION__CALL_QUERY_LIST, newCallQueryList, newCallQueryList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DsPackage.OPERATION__CALL_QUERY:
			return basicSetCallQuery(null, msgs);
		case DsPackage.OPERATION__CALL_QUERY_LIST:
			return basicSetCallQueryList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.OPERATION__NAME:
			return getName();
		case DsPackage.OPERATION__CALL_QUERY:
			return getCallQuery();
		case DsPackage.OPERATION__CALL_QUERY_LIST:
			return getCallQueryList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case DsPackage.OPERATION__CALL_QUERY:
			setCallQuery((CallQuery) newValue);
			return;
		case DsPackage.OPERATION__CALL_QUERY_LIST:
			setCallQueryList((CallQueryList) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DsPackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DsPackage.OPERATION__CALL_QUERY:
			setCallQuery((CallQuery) null);
			return;
		case DsPackage.OPERATION__CALL_QUERY_LIST:
			setCallQueryList((CallQueryList) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DsPackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DsPackage.OPERATION__CALL_QUERY:
			return callQuery != null;
		case DsPackage.OPERATION__CALL_QUERY_LIST:
			return callQueryList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // OperationImpl
