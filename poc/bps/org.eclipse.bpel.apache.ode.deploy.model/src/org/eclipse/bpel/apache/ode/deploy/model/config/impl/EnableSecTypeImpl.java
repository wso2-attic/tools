/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.impl;

import org.eclipse.bpel.apache.ode.deploy.model.config.ConfigPackage;
import org.eclipse.bpel.apache.ode.deploy.model.config.EnableSecType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enable Sec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link config.impl.EnableSecTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link config.impl.EnableSecTypeImpl#getPolicyLocation <em>Policy Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnableSecTypeImpl extends EObjectImpl implements EnableSecType {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getPolicyLocation() <em>Policy Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyLocation() <em>Policy Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyLocation()
	 * @generated
	 * @ordered
	 */
	protected String policyLocation = POLICY_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnableSecTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ENABLE_SEC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ConfigPackage.ENABLE_SEC_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyLocation() {
		return policyLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyLocation(String newPolicyLocation) {
		String oldPolicyLocation = policyLocation;
		policyLocation = newPolicyLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ENABLE_SEC_TYPE__POLICY_LOCATION, oldPolicyLocation, policyLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.ENABLE_SEC_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.ENABLE_SEC_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ConfigPackage.ENABLE_SEC_TYPE__POLICY_LOCATION:
				return getPolicyLocation();
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
			case ConfigPackage.ENABLE_SEC_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ConfigPackage.ENABLE_SEC_TYPE__POLICY_LOCATION:
				setPolicyLocation((String)newValue);
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
			case ConfigPackage.ENABLE_SEC_TYPE__ANY:
				getAny().clear();
				return;
			case ConfigPackage.ENABLE_SEC_TYPE__POLICY_LOCATION:
				setPolicyLocation(POLICY_LOCATION_EDEFAULT);
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
			case ConfigPackage.ENABLE_SEC_TYPE__ANY:
				return any != null && !any.isEmpty();
			case ConfigPackage.ENABLE_SEC_TYPE__POLICY_LOCATION:
				return POLICY_LOCATION_EDEFAULT == null ? policyLocation != null : !POLICY_LOCATION_EDEFAULT.equals(policyLocation);
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
		result.append(" (any: ");
		result.append(any);
		result.append(", policyLocation: ");
		result.append(policyLocation);
		result.append(')');
		return result.toString();
	}

} //EnableSecTypeImpl
