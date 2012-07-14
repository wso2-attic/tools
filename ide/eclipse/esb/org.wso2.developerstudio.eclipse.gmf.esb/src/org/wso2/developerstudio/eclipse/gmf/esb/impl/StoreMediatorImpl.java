/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.StoreMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.StoreMediatorOutputConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getMessageStore <em>Message Store</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getOnStoreSequence <em>On Store Sequence</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
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
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected StoreMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected StoreMediatorOutputConnector outputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected StoreMediatorImpl() {
		super();
		setMessageStore("messageStore");
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
	public StoreMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(StoreMediatorInputConnector newInputConnector, NotificationChain msgs) {
		StoreMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(StoreMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(StoreMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		StoreMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(StoreMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
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
			case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
				return getMessageStore();
			case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
				if (resolve) return getOnStoreSequence();
				return basicGetOnStoreSequence();
			case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
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
			case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((StoreMediatorInputConnector)newValue);
				return;
			case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((StoreMediatorOutputConnector)newValue);
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
			case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((StoreMediatorInputConnector)null);
				return;
			case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((StoreMediatorOutputConnector)null);
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
			case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
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
