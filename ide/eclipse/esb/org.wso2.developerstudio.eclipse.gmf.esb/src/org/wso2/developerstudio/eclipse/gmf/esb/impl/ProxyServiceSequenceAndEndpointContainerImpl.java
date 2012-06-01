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
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceAndEndpointContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Service Sequence And Endpoint Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceAndEndpointContainerImpl#getSequenceContainer <em>Sequence Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceAndEndpointContainerImpl#getEndpointContainer <em>Endpoint Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxyServiceSequenceAndEndpointContainerImpl extends EsbNodeImpl implements ProxyServiceSequenceAndEndpointContainer {
	/**
	 * The cached value of the '{@link #getSequenceContainer() <em>Sequence Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceContainer()
	 * @generated
	 * @ordered
	 */
	protected ProxyServiceSequenceContainer sequenceContainer;

	/**
	 * The cached value of the '{@link #getEndpointContainer() <em>Endpoint Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointContainer()
	 * @generated
	 * @ordered
	 */
	protected ProxyServiceEndpointContainer endpointContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyServiceSequenceAndEndpointContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceSequenceContainer getSequenceContainer() {
		return sequenceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceContainer(ProxyServiceSequenceContainer newSequenceContainer, NotificationChain msgs) {
		ProxyServiceSequenceContainer oldSequenceContainer = sequenceContainer;
		sequenceContainer = newSequenceContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER, oldSequenceContainer, newSequenceContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceContainer(ProxyServiceSequenceContainer newSequenceContainer) {
		if (newSequenceContainer != sequenceContainer) {
			NotificationChain msgs = null;
			if (sequenceContainer != null)
				msgs = ((InternalEObject)sequenceContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER, null, msgs);
			if (newSequenceContainer != null)
				msgs = ((InternalEObject)newSequenceContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER, null, msgs);
			msgs = basicSetSequenceContainer(newSequenceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER, newSequenceContainer, newSequenceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceEndpointContainer getEndpointContainer() {
		return endpointContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointContainer(ProxyServiceEndpointContainer newEndpointContainer, NotificationChain msgs) {
		ProxyServiceEndpointContainer oldEndpointContainer = endpointContainer;
		endpointContainer = newEndpointContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER, oldEndpointContainer, newEndpointContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointContainer(ProxyServiceEndpointContainer newEndpointContainer) {
		if (newEndpointContainer != endpointContainer) {
			NotificationChain msgs = null;
			if (endpointContainer != null)
				msgs = ((InternalEObject)endpointContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER, null, msgs);
			if (newEndpointContainer != null)
				msgs = ((InternalEObject)newEndpointContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER, null, msgs);
			msgs = basicSetEndpointContainer(newEndpointContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER, newEndpointContainer, newEndpointContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER:
				return basicSetSequenceContainer(null, msgs);
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER:
				return basicSetEndpointContainer(null, msgs);
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
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER:
				return getSequenceContainer();
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER:
				return getEndpointContainer();
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
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER:
				setSequenceContainer((ProxyServiceSequenceContainer)newValue);
				return;
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER:
				setEndpointContainer((ProxyServiceEndpointContainer)newValue);
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
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER:
				setSequenceContainer((ProxyServiceSequenceContainer)null);
				return;
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER:
				setEndpointContainer((ProxyServiceEndpointContainer)null);
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
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__SEQUENCE_CONTAINER:
				return sequenceContainer != null;
			case EsbPackage.PROXY_SERVICE_SEQUENCE_AND_ENDPOINT_CONTAINER__ENDPOINT_CONTAINER:
				return endpointContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ProxyServiceSequenceAndEndpointContainerImpl
