/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.ds.CallQuery;
import org.wso2.developerstudio.eclipse.ds.CallQueryList;
import org.wso2.developerstudio.eclipse.ds.DsPackage;
import org.wso2.developerstudio.eclipse.ds.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.OperationImpl#getCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.OperationImpl#getCallQueryGroup <em>Call Query Group</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.OperationImpl#isDisableStreaming <em>Disable Streaming</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.OperationImpl#isReturnRequestStatus <em>Return Request Status</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The cached value of the '{@link #getCallQuery() <em>Call Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallQuery()
	 * @generated
	 * @ordered
	 */
	protected CallQuery callQuery;

	/**
	 * The cached value of the '{@link #getCallQueryGroup() <em>Call Query Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallQueryGroup()
	 * @generated
	 * @ordered
	 */
	protected CallQueryList callQueryGroup;

	/**
	 * The default value of the '{@link #isDisableStreaming() <em>Disable Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableStreaming()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_STREAMING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableStreaming() <em>Disable Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableStreaming()
	 * @generated
	 * @ordered
	 */
	protected boolean disableStreaming = DISABLE_STREAMING_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnRequestStatus() <em>Return Request Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnRequestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_REQUEST_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnRequestStatus() <em>Return Request Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnRequestStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean returnRequestStatus = RETURN_REQUEST_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQuery getCallQuery() {
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallQuery(CallQuery newCallQuery, NotificationChain msgs) {
		CallQuery oldCallQuery = callQuery;
		callQuery = newCallQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__CALL_QUERY, oldCallQuery, newCallQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallQuery(CallQuery newCallQuery) {
		if (newCallQuery != callQuery) {
			NotificationChain msgs = null;
			if (callQuery != null)
				msgs = ((InternalEObject)callQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY, null, msgs);
			if (newCallQuery != null)
				msgs = ((InternalEObject)newCallQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY, null, msgs);
			msgs = basicSetCallQuery(newCallQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__CALL_QUERY, newCallQuery, newCallQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQueryList getCallQueryGroup() {
		return callQueryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallQueryGroup(CallQueryList newCallQueryGroup, NotificationChain msgs) {
		CallQueryList oldCallQueryGroup = callQueryGroup;
		callQueryGroup = newCallQueryGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__CALL_QUERY_GROUP, oldCallQueryGroup, newCallQueryGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallQueryGroup(CallQueryList newCallQueryGroup) {
		if (newCallQueryGroup != callQueryGroup) {
			NotificationChain msgs = null;
			if (callQueryGroup != null)
				msgs = ((InternalEObject)callQueryGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY_GROUP, null, msgs);
			if (newCallQueryGroup != null)
				msgs = ((InternalEObject)newCallQueryGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.OPERATION__CALL_QUERY_GROUP, null, msgs);
			msgs = basicSetCallQueryGroup(newCallQueryGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__CALL_QUERY_GROUP, newCallQueryGroup, newCallQueryGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisableStreaming() {
		return disableStreaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableStreaming(boolean newDisableStreaming) {
		boolean oldDisableStreaming = disableStreaming;
		disableStreaming = newDisableStreaming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__DISABLE_STREAMING, oldDisableStreaming, disableStreaming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnRequestStatus() {
		return returnRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnRequestStatus(boolean newReturnRequestStatus) {
		boolean oldReturnRequestStatus = returnRequestStatus;
		returnRequestStatus = newReturnRequestStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__RETURN_REQUEST_STATUS, oldReturnRequestStatus, returnRequestStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.OPERATION__CALL_QUERY:
				return basicSetCallQuery(null, msgs);
			case DsPackage.OPERATION__CALL_QUERY_GROUP:
				return basicSetCallQueryGroup(null, msgs);
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
			case DsPackage.OPERATION__CALL_QUERY:
				return getCallQuery();
			case DsPackage.OPERATION__CALL_QUERY_GROUP:
				return getCallQueryGroup();
			case DsPackage.OPERATION__DISABLE_STREAMING:
				return isDisableStreaming();
			case DsPackage.OPERATION__RETURN_REQUEST_STATUS:
				return isReturnRequestStatus();
			case DsPackage.OPERATION__NAME:
				return getName();
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
			case DsPackage.OPERATION__CALL_QUERY:
				setCallQuery((CallQuery)newValue);
				return;
			case DsPackage.OPERATION__CALL_QUERY_GROUP:
				setCallQueryGroup((CallQueryList)newValue);
				return;
			case DsPackage.OPERATION__DISABLE_STREAMING:
				setDisableStreaming((Boolean)newValue);
				return;
			case DsPackage.OPERATION__RETURN_REQUEST_STATUS:
				setReturnRequestStatus((Boolean)newValue);
				return;
			case DsPackage.OPERATION__NAME:
				setName((String)newValue);
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
			case DsPackage.OPERATION__CALL_QUERY:
				setCallQuery((CallQuery)null);
				return;
			case DsPackage.OPERATION__CALL_QUERY_GROUP:
				setCallQueryGroup((CallQueryList)null);
				return;
			case DsPackage.OPERATION__DISABLE_STREAMING:
				setDisableStreaming(DISABLE_STREAMING_EDEFAULT);
				return;
			case DsPackage.OPERATION__RETURN_REQUEST_STATUS:
				setReturnRequestStatus(RETURN_REQUEST_STATUS_EDEFAULT);
				return;
			case DsPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case DsPackage.OPERATION__CALL_QUERY:
				return callQuery != null;
			case DsPackage.OPERATION__CALL_QUERY_GROUP:
				return callQueryGroup != null;
			case DsPackage.OPERATION__DISABLE_STREAMING:
				return disableStreaming != DISABLE_STREAMING_EDEFAULT;
			case DsPackage.OPERATION__RETURN_REQUEST_STATUS:
				return returnRequestStatus != RETURN_REQUEST_STATUS_EDEFAULT;
			case DsPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (disableStreaming: ");
		result.append(disableStreaming);
		result.append(", returnRequestStatus: ");
		result.append(returnRequestStatus);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
