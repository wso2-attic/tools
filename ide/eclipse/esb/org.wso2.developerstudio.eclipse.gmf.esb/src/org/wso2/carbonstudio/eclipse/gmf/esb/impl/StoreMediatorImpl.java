/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.gmf.esb.StoreMediator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getMessageStore <em>Message Store</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getOnStoreSequence <em>On Store Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreMediatorImpl extends MediatorImpl implements StoreMediator {
	/**
	 * The default value of the '{@link #getMessageStore() <em>Message Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStore()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageStore() <em>Message Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStore()
	 * @generated
	 * @ordered
	 */
	protected String messageStore = MESSAGE_STORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnStoreSequence() <em>On Store Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStoreSequence()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty onStoreSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.STORE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageStore() {
		return messageStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageStore(String newMessageStore) {
		String oldMessageStore = messageStore;
		messageStore = newMessageStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__MESSAGE_STORE, oldMessageStore, messageStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getOnStoreSequence() {
		if (onStoreSequence != null && onStoreSequence.eIsProxy()) {
			InternalEObject oldOnStoreSequence = (InternalEObject)onStoreSequence;
			onStoreSequence = (RegistryKeyProperty)eResolveProxy(oldOnStoreSequence);
			if (onStoreSequence != oldOnStoreSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, oldOnStoreSequence, onStoreSequence));
			}
		}
		return onStoreSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty basicGetOnStoreSequence() {
		return onStoreSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnStoreSequence(RegistryKeyProperty newOnStoreSequence) {
		RegistryKeyProperty oldOnStoreSequence = onStoreSequence;
		onStoreSequence = newOnStoreSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, oldOnStoreSequence, onStoreSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
				return getMessageStore();
			case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
				if (resolve) return getOnStoreSequence();
				return basicGetOnStoreSequence();
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
			case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
				setMessageStore((String)newValue);
				return;
			case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
				setOnStoreSequence((RegistryKeyProperty)newValue);
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
			case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
				setMessageStore(MESSAGE_STORE_EDEFAULT);
				return;
			case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
				setOnStoreSequence((RegistryKeyProperty)null);
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
			case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
				return MESSAGE_STORE_EDEFAULT == null ? messageStore != null : !MESSAGE_STORE_EDEFAULT.equals(messageStore);
			case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
				return onStoreSequence != null;
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
		result.append(" (messageStore: ");
		result.append(messageStore);
		result.append(')');
		return result.toString();
	}

} //StoreMediatorImpl
