/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.impl;

import org.eclipse.bpel.apache.ode.deploy.model.config.AddressType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ConfigPackage;
import org.eclipse.bpel.apache.ode.deploy.model.config.EnableSecType;
import org.eclipse.bpel.apache.ode.deploy.model.config.HttpOptionsType;
import org.eclipse.bpel.apache.ode.deploy.model.config.MexTimeoutType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ServiceDescriptionType;
import org.eclipse.bpel.apache.ode.deploy.model.config.TEndpoint;

import javax.xml.namespace.QName;

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
 * An implementation of the model object '<em><b>TEndpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link config.impl.TEndpointImpl#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getEnableSec <em>Enable Sec</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getMexTimeout <em>Mex Timeout</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getHttpOptions <em>Http Options</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getAny <em>Any</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link config.impl.TEndpointImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TEndpointImpl extends EObjectImpl implements TEndpoint {
	/**
	 * The cached value of the '{@link #getServiceDescription() <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescription()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptionType serviceDescription;

	/**
	 * The cached value of the '{@link #getEnableSec() <em>Enable Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableSec()
	 * @generated
	 * @ordered
	 */
	protected EnableSecType enableSec;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType address;

	/**
	 * The cached value of the '{@link #getMexTimeout() <em>Mex Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMexTimeout()
	 * @generated
	 * @ordered
	 */
	protected MexTimeoutType mexTimeout;

	/**
	 * The cached value of the '{@link #getHttpOptions() <em>Http Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpOptions()
	 * @generated
	 * @ordered
	 */
	protected HttpOptionsType httpOptions;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final QName NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected QName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.TENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDescription(ServiceDescriptionType newServiceDescription, NotificationChain msgs) {
		ServiceDescriptionType oldServiceDescription = serviceDescription;
		serviceDescription = newServiceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION, oldServiceDescription, newServiceDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescription(ServiceDescriptionType newServiceDescription) {
		if (newServiceDescription != serviceDescription) {
			NotificationChain msgs = null;
			if (serviceDescription != null)
				msgs = ((InternalEObject)serviceDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION, null, msgs);
			if (newServiceDescription != null)
				msgs = ((InternalEObject)newServiceDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION, null, msgs);
			msgs = basicSetServiceDescription(newServiceDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION, newServiceDescription, newServiceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableSecType getEnableSec() {
		return enableSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableSec(EnableSecType newEnableSec, NotificationChain msgs) {
		EnableSecType oldEnableSec = enableSec;
		enableSec = newEnableSec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__ENABLE_SEC, oldEnableSec, newEnableSec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableSec(EnableSecType newEnableSec) {
		if (newEnableSec != enableSec) {
			NotificationChain msgs = null;
			if (enableSec != null)
				msgs = ((InternalEObject)enableSec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__ENABLE_SEC, null, msgs);
			if (newEnableSec != null)
				msgs = ((InternalEObject)newEnableSec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__ENABLE_SEC, null, msgs);
			msgs = basicSetEnableSec(newEnableSec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__ENABLE_SEC, newEnableSec, newEnableSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		AddressType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MexTimeoutType getMexTimeout() {
		return mexTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMexTimeout(MexTimeoutType newMexTimeout, NotificationChain msgs) {
		MexTimeoutType oldMexTimeout = mexTimeout;
		mexTimeout = newMexTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__MEX_TIMEOUT, oldMexTimeout, newMexTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMexTimeout(MexTimeoutType newMexTimeout) {
		if (newMexTimeout != mexTimeout) {
			NotificationChain msgs = null;
			if (mexTimeout != null)
				msgs = ((InternalEObject)mexTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__MEX_TIMEOUT, null, msgs);
			if (newMexTimeout != null)
				msgs = ((InternalEObject)newMexTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__MEX_TIMEOUT, null, msgs);
			msgs = basicSetMexTimeout(newMexTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__MEX_TIMEOUT, newMexTimeout, newMexTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpOptionsType getHttpOptions() {
		return httpOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpOptions(HttpOptionsType newHttpOptions, NotificationChain msgs) {
		HttpOptionsType oldHttpOptions = httpOptions;
		httpOptions = newHttpOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__HTTP_OPTIONS, oldHttpOptions, newHttpOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpOptions(HttpOptionsType newHttpOptions) {
		if (newHttpOptions != httpOptions) {
			NotificationChain msgs = null;
			if (httpOptions != null)
				msgs = ((InternalEObject)httpOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__HTTP_OPTIONS, null, msgs);
			if (newHttpOptions != null)
				msgs = ((InternalEObject)newHttpOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.TENDPOINT__HTTP_OPTIONS, null, msgs);
			msgs = basicSetHttpOptions(newHttpOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__HTTP_OPTIONS, newHttpOptions, newHttpOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ConfigPackage.TENDPOINT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(QName newName) {
		QName oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TENDPOINT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION:
				return basicSetServiceDescription(null, msgs);
			case ConfigPackage.TENDPOINT__ENABLE_SEC:
				return basicSetEnableSec(null, msgs);
			case ConfigPackage.TENDPOINT__ADDRESS:
				return basicSetAddress(null, msgs);
			case ConfigPackage.TENDPOINT__MEX_TIMEOUT:
				return basicSetMexTimeout(null, msgs);
			case ConfigPackage.TENDPOINT__HTTP_OPTIONS:
				return basicSetHttpOptions(null, msgs);
			case ConfigPackage.TENDPOINT__ANY:
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
			case ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION:
				return getServiceDescription();
			case ConfigPackage.TENDPOINT__ENABLE_SEC:
				return getEnableSec();
			case ConfigPackage.TENDPOINT__ADDRESS:
				return getAddress();
			case ConfigPackage.TENDPOINT__MEX_TIMEOUT:
				return getMexTimeout();
			case ConfigPackage.TENDPOINT__HTTP_OPTIONS:
				return getHttpOptions();
			case ConfigPackage.TENDPOINT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ConfigPackage.TENDPOINT__NAME:
				return getName();
			case ConfigPackage.TENDPOINT__PORT:
				return getPort();
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
			case ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)newValue);
				return;
			case ConfigPackage.TENDPOINT__ENABLE_SEC:
				setEnableSec((EnableSecType)newValue);
				return;
			case ConfigPackage.TENDPOINT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case ConfigPackage.TENDPOINT__MEX_TIMEOUT:
				setMexTimeout((MexTimeoutType)newValue);
				return;
			case ConfigPackage.TENDPOINT__HTTP_OPTIONS:
				setHttpOptions((HttpOptionsType)newValue);
				return;
			case ConfigPackage.TENDPOINT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ConfigPackage.TENDPOINT__NAME:
				setName((QName)newValue);
				return;
			case ConfigPackage.TENDPOINT__PORT:
				setPort((String)newValue);
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
			case ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)null);
				return;
			case ConfigPackage.TENDPOINT__ENABLE_SEC:
				setEnableSec((EnableSecType)null);
				return;
			case ConfigPackage.TENDPOINT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case ConfigPackage.TENDPOINT__MEX_TIMEOUT:
				setMexTimeout((MexTimeoutType)null);
				return;
			case ConfigPackage.TENDPOINT__HTTP_OPTIONS:
				setHttpOptions((HttpOptionsType)null);
				return;
			case ConfigPackage.TENDPOINT__ANY:
				getAny().clear();
				return;
			case ConfigPackage.TENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigPackage.TENDPOINT__PORT:
				setPort(PORT_EDEFAULT);
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
			case ConfigPackage.TENDPOINT__SERVICE_DESCRIPTION:
				return serviceDescription != null;
			case ConfigPackage.TENDPOINT__ENABLE_SEC:
				return enableSec != null;
			case ConfigPackage.TENDPOINT__ADDRESS:
				return address != null;
			case ConfigPackage.TENDPOINT__MEX_TIMEOUT:
				return mexTimeout != null;
			case ConfigPackage.TENDPOINT__HTTP_OPTIONS:
				return httpOptions != null;
			case ConfigPackage.TENDPOINT__ANY:
				return any != null && !any.isEmpty();
			case ConfigPackage.TENDPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigPackage.TENDPOINT__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
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
		result.append(", name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //TEndpointImpl
