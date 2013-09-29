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

import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorAdviceOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorObligationsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorOnAcceptOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorOnRejectOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entitlement Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getEntitlementServerURL <em>Entitlement Server URL</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getCallbackClassName <em>Callback Class Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getThriftHost <em>Thrift Host</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getThriftPort <em>Thrift Port</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getEntitlementClientType <em>Entitlement Client Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getEntitlementContainer <em>Entitlement Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getOnRejectOutputConnector <em>On Reject Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getOnAcceptOutputConnector <em>On Accept Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getAdviceOutputConnector <em>Advice Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl#getObligationsOutputConnector <em>Obligations Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntitlementMediatorImpl extends MediatorImpl implements EntitlementMediator {
	/**
	 * The default value of the '{@link #getEntitlementServerURL() <em>Entitlement Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitlementServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITLEMENT_SERVER_URL_EDEFAULT = "server_url";

	/**
	 * The cached value of the '{@link #getEntitlementServerURL() <em>Entitlement Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitlementServerURL()
	 * @generated
	 * @ordered
	 */
	protected String entitlementServerURL = ENTITLEMENT_SERVER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = "username";

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = "password";

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallbackClassName() <em>Callback Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLBACK_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallbackClassName() <em>Callback Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackClassName()
	 * @generated
	 * @ordered
	 */
	protected String callbackClassName = CALLBACK_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThriftHost() <em>Thrift Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThriftHost()
	 * @generated
	 * @ordered
	 */
	protected static final String THRIFT_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThriftHost() <em>Thrift Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThriftHost()
	 * @generated
	 * @ordered
	 */
	protected String thriftHost = THRIFT_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getThriftPort() <em>Thrift Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThriftPort()
	 * @generated
	 * @ordered
	 */
	protected static final String THRIFT_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThriftPort() <em>Thrift Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThriftPort()
	 * @generated
	 * @ordered
	 */
	protected String thriftPort = THRIFT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntitlementClientType() <em>Entitlement Client Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitlementClientType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITLEMENT_CLIENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitlementClientType() <em>Entitlement Client Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitlementClientType()
	 * @generated
	 * @ordered
	 */
	protected String entitlementClientType = ENTITLEMENT_CLIENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntitlementContainer() <em>Entitlement Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitlementContainer()
	 * @generated
	 * @ordered
	 */
	protected EntitlementContainer entitlementContainer;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getOnRejectOutputConnector() <em>On Reject Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRejectOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorOnRejectOutputConnector onRejectOutputConnector;

	/**
	 * The cached value of the '{@link #getOnAcceptOutputConnector() <em>On Accept Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAcceptOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorOnAcceptOutputConnector onAcceptOutputConnector;

	/**
	 * The cached value of the '{@link #getAdviceOutputConnector() <em>Advice Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdviceOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorAdviceOutputConnector adviceOutputConnector;

	/**
	 * The cached value of the '{@link #getObligationsOutputConnector() <em>Obligations Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationsOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EntitlementMediatorObligationsOutputConnector obligationsOutputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitlementMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.ENTITLEMENT_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntitlementServerURL() {
		return entitlementServerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntitlementServerURL(String newEntitlementServerURL) {
		String oldEntitlementServerURL = entitlementServerURL;
		entitlementServerURL = newEntitlementServerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_SERVER_URL, oldEntitlementServerURL, entitlementServerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallbackClassName() {
		return callbackClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallbackClassName(String newCallbackClassName) {
		String oldCallbackClassName = callbackClassName;
		callbackClassName = newCallbackClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__CALLBACK_CLASS_NAME, oldCallbackClassName, callbackClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThriftHost() {
		return thriftHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThriftHost(String newThriftHost) {
		String oldThriftHost = thriftHost;
		thriftHost = newThriftHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_HOST, oldThriftHost, thriftHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThriftPort() {
		return thriftPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThriftPort(String newThriftPort) {
		String oldThriftPort = thriftPort;
		thriftPort = newThriftPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_PORT, oldThriftPort, thriftPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntitlementClientType() {
		return entitlementClientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntitlementClientType(String newEntitlementClientType) {
		String oldEntitlementClientType = entitlementClientType;
		entitlementClientType = newEntitlementClientType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CLIENT_TYPE, oldEntitlementClientType, entitlementClientType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementContainer getEntitlementContainer() {
		return entitlementContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntitlementContainer(EntitlementContainer newEntitlementContainer, NotificationChain msgs) {
		EntitlementContainer oldEntitlementContainer = entitlementContainer;
		entitlementContainer = newEntitlementContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER, oldEntitlementContainer, newEntitlementContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntitlementContainer(EntitlementContainer newEntitlementContainer) {
		if (newEntitlementContainer != entitlementContainer) {
			NotificationChain msgs = null;
			if (entitlementContainer != null)
				msgs = ((InternalEObject)entitlementContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER, null, msgs);
			if (newEntitlementContainer != null)
				msgs = ((InternalEObject)newEntitlementContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER, null, msgs);
			msgs = basicSetEntitlementContainer(newEntitlementContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER, newEntitlementContainer, newEntitlementContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(EntitlementMediatorInputConnector newInputConnector, NotificationChain msgs) {
		EntitlementMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(EntitlementMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(EntitlementMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		EntitlementMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(EntitlementMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorOnRejectOutputConnector getOnRejectOutputConnector() {
		return onRejectOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnRejectOutputConnector(EntitlementMediatorOnRejectOutputConnector newOnRejectOutputConnector, NotificationChain msgs) {
		EntitlementMediatorOnRejectOutputConnector oldOnRejectOutputConnector = onRejectOutputConnector;
		onRejectOutputConnector = newOnRejectOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, oldOnRejectOutputConnector, newOnRejectOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRejectOutputConnector(EntitlementMediatorOnRejectOutputConnector newOnRejectOutputConnector) {
		if (newOnRejectOutputConnector != onRejectOutputConnector) {
			NotificationChain msgs = null;
			if (onRejectOutputConnector != null)
				msgs = ((InternalEObject)onRejectOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, null, msgs);
			if (newOnRejectOutputConnector != null)
				msgs = ((InternalEObject)newOnRejectOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOnRejectOutputConnector(newOnRejectOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, newOnRejectOutputConnector, newOnRejectOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorOnAcceptOutputConnector getOnAcceptOutputConnector() {
		return onAcceptOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAcceptOutputConnector(EntitlementMediatorOnAcceptOutputConnector newOnAcceptOutputConnector, NotificationChain msgs) {
		EntitlementMediatorOnAcceptOutputConnector oldOnAcceptOutputConnector = onAcceptOutputConnector;
		onAcceptOutputConnector = newOnAcceptOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, oldOnAcceptOutputConnector, newOnAcceptOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnAcceptOutputConnector(EntitlementMediatorOnAcceptOutputConnector newOnAcceptOutputConnector) {
		if (newOnAcceptOutputConnector != onAcceptOutputConnector) {
			NotificationChain msgs = null;
			if (onAcceptOutputConnector != null)
				msgs = ((InternalEObject)onAcceptOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, null, msgs);
			if (newOnAcceptOutputConnector != null)
				msgs = ((InternalEObject)newOnAcceptOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOnAcceptOutputConnector(newOnAcceptOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, newOnAcceptOutputConnector, newOnAcceptOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorAdviceOutputConnector getAdviceOutputConnector() {
		return adviceOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdviceOutputConnector(EntitlementMediatorAdviceOutputConnector newAdviceOutputConnector, NotificationChain msgs) {
		EntitlementMediatorAdviceOutputConnector oldAdviceOutputConnector = adviceOutputConnector;
		adviceOutputConnector = newAdviceOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR, oldAdviceOutputConnector, newAdviceOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdviceOutputConnector(EntitlementMediatorAdviceOutputConnector newAdviceOutputConnector) {
		if (newAdviceOutputConnector != adviceOutputConnector) {
			NotificationChain msgs = null;
			if (adviceOutputConnector != null)
				msgs = ((InternalEObject)adviceOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR, null, msgs);
			if (newAdviceOutputConnector != null)
				msgs = ((InternalEObject)newAdviceOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetAdviceOutputConnector(newAdviceOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR, newAdviceOutputConnector, newAdviceOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorObligationsOutputConnector getObligationsOutputConnector() {
		return obligationsOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObligationsOutputConnector(EntitlementMediatorObligationsOutputConnector newObligationsOutputConnector, NotificationChain msgs) {
		EntitlementMediatorObligationsOutputConnector oldObligationsOutputConnector = obligationsOutputConnector;
		obligationsOutputConnector = newObligationsOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR, oldObligationsOutputConnector, newObligationsOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligationsOutputConnector(EntitlementMediatorObligationsOutputConnector newObligationsOutputConnector) {
		if (newObligationsOutputConnector != obligationsOutputConnector) {
			NotificationChain msgs = null;
			if (obligationsOutputConnector != null)
				msgs = ((InternalEObject)obligationsOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR, null, msgs);
			if (newObligationsOutputConnector != null)
				msgs = ((InternalEObject)newObligationsOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetObligationsOutputConnector(newObligationsOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR, newObligationsOutputConnector, newObligationsOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER:
				return basicSetEntitlementContainer(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return basicSetOnRejectOutputConnector(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return basicSetOnAcceptOutputConnector(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR:
				return basicSetAdviceOutputConnector(null, msgs);
			case EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR:
				return basicSetObligationsOutputConnector(null, msgs);
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
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_SERVER_URL:
				return getEntitlementServerURL();
			case EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME:
				return getUsername();
			case EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
				return getPassword();
			case EsbPackage.ENTITLEMENT_MEDIATOR__CALLBACK_CLASS_NAME:
				return getCallbackClassName();
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_HOST:
				return getThriftHost();
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_PORT:
				return getThriftPort();
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CLIENT_TYPE:
				return getEntitlementClientType();
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER:
				return getEntitlementContainer();
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return getOnRejectOutputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return getOnAcceptOutputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR:
				return getAdviceOutputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR:
				return getObligationsOutputConnector();
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
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_SERVER_URL:
				setEntitlementServerURL((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME:
				setUsername((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
				setPassword((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__CALLBACK_CLASS_NAME:
				setCallbackClassName((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_HOST:
				setThriftHost((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_PORT:
				setThriftPort((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CLIENT_TYPE:
				setEntitlementClientType((String)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER:
				setEntitlementContainer((EntitlementContainer)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((EntitlementMediatorInputConnector)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((EntitlementMediatorOutputConnector)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				setOnRejectOutputConnector((EntitlementMediatorOnRejectOutputConnector)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				setOnAcceptOutputConnector((EntitlementMediatorOnAcceptOutputConnector)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR:
				setAdviceOutputConnector((EntitlementMediatorAdviceOutputConnector)newValue);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR:
				setObligationsOutputConnector((EntitlementMediatorObligationsOutputConnector)newValue);
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
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_SERVER_URL:
				setEntitlementServerURL(ENTITLEMENT_SERVER_URL_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__CALLBACK_CLASS_NAME:
				setCallbackClassName(CALLBACK_CLASS_NAME_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_HOST:
				setThriftHost(THRIFT_HOST_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_PORT:
				setThriftPort(THRIFT_PORT_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CLIENT_TYPE:
				setEntitlementClientType(ENTITLEMENT_CLIENT_TYPE_EDEFAULT);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER:
				setEntitlementContainer((EntitlementContainer)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((EntitlementMediatorInputConnector)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((EntitlementMediatorOutputConnector)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				setOnRejectOutputConnector((EntitlementMediatorOnRejectOutputConnector)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				setOnAcceptOutputConnector((EntitlementMediatorOnAcceptOutputConnector)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR:
				setAdviceOutputConnector((EntitlementMediatorAdviceOutputConnector)null);
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR:
				setObligationsOutputConnector((EntitlementMediatorObligationsOutputConnector)null);
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
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_SERVER_URL:
				return ENTITLEMENT_SERVER_URL_EDEFAULT == null ? entitlementServerURL != null : !ENTITLEMENT_SERVER_URL_EDEFAULT.equals(entitlementServerURL);
			case EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EsbPackage.ENTITLEMENT_MEDIATOR__CALLBACK_CLASS_NAME:
				return CALLBACK_CLASS_NAME_EDEFAULT == null ? callbackClassName != null : !CALLBACK_CLASS_NAME_EDEFAULT.equals(callbackClassName);
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_HOST:
				return THRIFT_HOST_EDEFAULT == null ? thriftHost != null : !THRIFT_HOST_EDEFAULT.equals(thriftHost);
			case EsbPackage.ENTITLEMENT_MEDIATOR__THRIFT_PORT:
				return THRIFT_PORT_EDEFAULT == null ? thriftPort != null : !THRIFT_PORT_EDEFAULT.equals(thriftPort);
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CLIENT_TYPE:
				return ENTITLEMENT_CLIENT_TYPE_EDEFAULT == null ? entitlementClientType != null : !ENTITLEMENT_CLIENT_TYPE_EDEFAULT.equals(entitlementClientType);
			case EsbPackage.ENTITLEMENT_MEDIATOR__ENTITLEMENT_CONTAINER:
				return entitlementContainer != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return onRejectOutputConnector != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return onAcceptOutputConnector != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__ADVICE_OUTPUT_CONNECTOR:
				return adviceOutputConnector != null;
			case EsbPackage.ENTITLEMENT_MEDIATOR__OBLIGATIONS_OUTPUT_CONNECTOR:
				return obligationsOutputConnector != null;
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
		result.append(" (entitlementServerURL: ");
		result.append(entitlementServerURL);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", callbackClassName: ");
		result.append(callbackClassName);
		result.append(", thriftHost: ");
		result.append(thriftHost);
		result.append(", thriftPort: ");
		result.append(thriftPort);
		result.append(", entitlementClientType: ");
		result.append(entitlementClientType);
		result.append(')');
		return result.toString();
	}

} //EntitlementMediatorImpl
