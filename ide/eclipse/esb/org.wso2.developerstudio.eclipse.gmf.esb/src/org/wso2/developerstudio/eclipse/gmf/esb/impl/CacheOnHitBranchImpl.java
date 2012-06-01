/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache On Hit Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheOnHitBranchImpl extends EObjectImpl implements CacheOnHitBranch {
	/**
	 * The default value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheSequenceType SEQUENCE_TYPE_EDEFAULT = CacheSequenceType.REGISTRY_REFERENCE;

	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected CacheSequenceType sequenceType = SEQUENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSequenceKey() <em>Sequence Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty sequenceKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheOnHitBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.CACHE_ON_HIT_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheSequenceType getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(CacheSequenceType newSequenceType) {
		CacheSequenceType oldSequenceType = sequenceType;
		sequenceType = newSequenceType == null ? SEQUENCE_TYPE_EDEFAULT : newSequenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE, oldSequenceType, sequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getSequenceKey() {
		if (sequenceKey != null && sequenceKey.eIsProxy()) {
			InternalEObject oldSequenceKey = (InternalEObject)sequenceKey;
			sequenceKey = (RegistryKeyProperty)eResolveProxy(oldSequenceKey);
			if (sequenceKey != oldSequenceKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY, oldSequenceKey, sequenceKey));
			}
		}
		return sequenceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty basicGetSequenceKey() {
		return sequenceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceKey(RegistryKeyProperty newSequenceKey) {
		RegistryKeyProperty oldSequenceKey = sequenceKey;
		sequenceKey = newSequenceKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY, oldSequenceKey, sequenceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE:
				return getSequenceType();
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY:
				if (resolve) return getSequenceKey();
				return basicGetSequenceKey();
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
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE:
				setSequenceType((CacheSequenceType)newValue);
				return;
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY:
				setSequenceKey((RegistryKeyProperty)newValue);
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
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE:
				setSequenceType(SEQUENCE_TYPE_EDEFAULT);
				return;
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY:
				setSequenceKey((RegistryKeyProperty)null);
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
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE:
				return sequenceType != SEQUENCE_TYPE_EDEFAULT;
			case EsbPackage.CACHE_ON_HIT_BRANCH__SEQUENCE_KEY:
				return sequenceKey != null;
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
		result.append(" (sequenceType: ");
		result.append(sequenceType);
		result.append(')');
		return result.toString();
	}

} //CacheOnHitBranchImpl
