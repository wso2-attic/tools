/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.ds.CallQuery;
import org.wso2.developerstudio.eclipse.ds.CallQueryList;
import org.wso2.developerstudio.eclipse.ds.DsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Query List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.CallQueryListImpl#getCallQuery <em>Call Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallQueryListImpl extends EObjectImpl implements CallQueryList {
	/**
	 * The cached value of the '{@link #getCallQuery() <em>Call Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<CallQuery> callQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallQueryListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return DsPackage.Literals.CALL_QUERY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallQuery> getCallQuery() {
		if (callQuery == null) {
			callQuery = new EObjectContainmentEList<CallQuery>(CallQuery.class, this, DsPackage.CALL_QUERY_LIST__CALL_QUERY);
		}
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.CALL_QUERY_LIST__CALL_QUERY:
				return ((InternalEList<?>)getCallQuery()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.CALL_QUERY_LIST__CALL_QUERY:
				return getCallQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsPackage.CALL_QUERY_LIST__CALL_QUERY:
				getCallQuery().clear();
				getCallQuery().addAll((Collection<? extends CallQuery>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsPackage.CALL_QUERY_LIST__CALL_QUERY:
				getCallQuery().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsPackage.CALL_QUERY_LIST__CALL_QUERY:
				return callQuery != null && !callQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallQueryListImpl
