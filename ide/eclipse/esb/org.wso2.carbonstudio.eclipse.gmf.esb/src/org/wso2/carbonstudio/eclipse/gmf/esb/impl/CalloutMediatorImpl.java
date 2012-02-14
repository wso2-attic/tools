/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutPayloadType;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutResultType;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callout Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getSoapAction <em>Soap Action</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getPathToAxis2xml <em>Path To Axis2xml</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getPathToAxis2Repository <em>Path To Axis2 Repository</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getPayloadMessageXpath <em>Payload Message Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getPayloadRegistryKey <em>Payload Registry Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getResultMessageXpath <em>Result Message Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getResultContextProperty <em>Result Context Property</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalloutMediatorImpl extends MediatorImpl implements CalloutMediator {
	/**
	 * The default value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URL_EDEFAULT = "service_url";

	/**
	 * The cached value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String serviceURL = SERVICE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoapAction() <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapAction()
	 * @generated
	 * @ordered
	 */
	protected static final String SOAP_ACTION_EDEFAULT = "soap_action";

	/**
	 * The cached value of the '{@link #getSoapAction() <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapAction()
	 * @generated
	 * @ordered
	 */
	protected String soapAction = SOAP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathToAxis2xml() <em>Path To Axis2xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToAxis2xml()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_AXIS2XML_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPathToAxis2xml() <em>Path To Axis2xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToAxis2xml()
	 * @generated
	 * @ordered
	 */
	protected String pathToAxis2xml = PATH_TO_AXIS2XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathToAxis2Repository() <em>Path To Axis2 Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToAxis2Repository()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_AXIS2_REPOSITORY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPathToAxis2Repository() <em>Path To Axis2 Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToAxis2Repository()
	 * @generated
	 * @ordered
	 */
	protected String pathToAxis2Repository = PATH_TO_AXIS2_REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayloadType() <em>Payload Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected static final CalloutPayloadType PAYLOAD_TYPE_EDEFAULT = CalloutPayloadType.MESSAGE_ELEMENT;

	/**
	 * The cached value of the '{@link #getPayloadType() <em>Payload Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected CalloutPayloadType payloadType = PAYLOAD_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayloadMessageXpath() <em>Payload Message Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadMessageXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty payloadMessageXpath;

	/**
	 * The cached value of the '{@link #getPayloadRegistryKey() <em>Payload Registry Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadRegistryKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty payloadRegistryKey;

	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final CalloutResultType RESULT_TYPE_EDEFAULT = CalloutResultType.MESSAGE_ELEMENT;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected CalloutResultType resultType = RESULT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultMessageXpath() <em>Result Message Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMessageXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty resultMessageXpath;

	/**
	 * The default value of the '{@link #getResultContextProperty() <em>Result Context Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultContextProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CONTEXT_PROPERTY_EDEFAULT = "context_property_name";

	/**
	 * The cached value of the '{@link #getResultContextProperty() <em>Result Context Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultContextProperty()
	 * @generated
	 * @ordered
	 */
	protected String resultContextProperty = RESULT_CONTEXT_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected CalloutMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected CalloutMediatorOutputConnector outputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CalloutMediatorImpl() {
		super();
		
		// Payload xpath.
		NamespacedProperty payloadXpath = EsbFactoryImpl.eINSTANCE
				.createNamespacedProperty();
		payloadXpath.setPrettyName("Payload XPath");
		payloadXpath.setPropertyName("xpath");
		payloadXpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);
		setPayloadMessageXpath(payloadXpath);

		// Payload registry key.
		RegistryKeyProperty payloadKey = EsbFactoryImpl.eINSTANCE
				.createRegistryKeyProperty();
		payloadKey.setPrettyName("Payload Key");
		payloadKey.setKeyName("key");
		payloadKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setPayloadRegistryKey(payloadKey);

		// Result xpath.
		NamespacedProperty resultXpath = EsbFactoryImpl.eINSTANCE
				.createNamespacedProperty();
		resultXpath.setPrettyName("Target XPath");
		resultXpath.setPropertyName("xpath");
		resultXpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);
		setResultMessageXpath(resultXpath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.CALLOUT_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURL() {
		return serviceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURL(String newServiceURL) {
		String oldServiceURL = serviceURL;
		serviceURL = newServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__SERVICE_URL, oldServiceURL, serviceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoapAction() {
		return soapAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapAction(String newSoapAction) {
		String oldSoapAction = soapAction;
		soapAction = newSoapAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__SOAP_ACTION, oldSoapAction, soapAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathToAxis2xml() {
		return pathToAxis2xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathToAxis2xml(String newPathToAxis2xml) {
		String oldPathToAxis2xml = pathToAxis2xml;
		pathToAxis2xml = newPathToAxis2xml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2XML, oldPathToAxis2xml, pathToAxis2xml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathToAxis2Repository() {
		return pathToAxis2Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathToAxis2Repository(String newPathToAxis2Repository) {
		String oldPathToAxis2Repository = pathToAxis2Repository;
		pathToAxis2Repository = newPathToAxis2Repository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY, oldPathToAxis2Repository, pathToAxis2Repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutPayloadType getPayloadType() {
		return payloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadType(CalloutPayloadType newPayloadType) {
		CalloutPayloadType oldPayloadType = payloadType;
		payloadType = newPayloadType == null ? PAYLOAD_TYPE_EDEFAULT : newPayloadType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_TYPE, oldPayloadType, payloadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getPayloadMessageXpath() {
		return payloadMessageXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadMessageXpath(NamespacedProperty newPayloadMessageXpath, NotificationChain msgs) {
		NamespacedProperty oldPayloadMessageXpath = payloadMessageXpath;
		payloadMessageXpath = newPayloadMessageXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH, oldPayloadMessageXpath, newPayloadMessageXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadMessageXpath(NamespacedProperty newPayloadMessageXpath) {
		if (newPayloadMessageXpath != payloadMessageXpath) {
			NotificationChain msgs = null;
			if (payloadMessageXpath != null)
				msgs = ((InternalEObject)payloadMessageXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH, null, msgs);
			if (newPayloadMessageXpath != null)
				msgs = ((InternalEObject)newPayloadMessageXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH, null, msgs);
			msgs = basicSetPayloadMessageXpath(newPayloadMessageXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH, newPayloadMessageXpath, newPayloadMessageXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getPayloadRegistryKey() {
		return payloadRegistryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadRegistryKey(RegistryKeyProperty newPayloadRegistryKey, NotificationChain msgs) {
		RegistryKeyProperty oldPayloadRegistryKey = payloadRegistryKey;
		payloadRegistryKey = newPayloadRegistryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY, oldPayloadRegistryKey, newPayloadRegistryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadRegistryKey(RegistryKeyProperty newPayloadRegistryKey) {
		if (newPayloadRegistryKey != payloadRegistryKey) {
			NotificationChain msgs = null;
			if (payloadRegistryKey != null)
				msgs = ((InternalEObject)payloadRegistryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY, null, msgs);
			if (newPayloadRegistryKey != null)
				msgs = ((InternalEObject)newPayloadRegistryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY, null, msgs);
			msgs = basicSetPayloadRegistryKey(newPayloadRegistryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY, newPayloadRegistryKey, newPayloadRegistryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutResultType getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(CalloutResultType newResultType) {
		CalloutResultType oldResultType = resultType;
		resultType = newResultType == null ? RESULT_TYPE_EDEFAULT : newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__RESULT_TYPE, oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getResultMessageXpath() {
		return resultMessageXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultMessageXpath(NamespacedProperty newResultMessageXpath, NotificationChain msgs) {
		NamespacedProperty oldResultMessageXpath = resultMessageXpath;
		resultMessageXpath = newResultMessageXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH, oldResultMessageXpath, newResultMessageXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultMessageXpath(NamespacedProperty newResultMessageXpath) {
		if (newResultMessageXpath != resultMessageXpath) {
			NotificationChain msgs = null;
			if (resultMessageXpath != null)
				msgs = ((InternalEObject)resultMessageXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH, null, msgs);
			if (newResultMessageXpath != null)
				msgs = ((InternalEObject)newResultMessageXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH, null, msgs);
			msgs = basicSetResultMessageXpath(newResultMessageXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH, newResultMessageXpath, newResultMessageXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultContextProperty() {
		return resultContextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultContextProperty(String newResultContextProperty) {
		String oldResultContextProperty = resultContextProperty;
		resultContextProperty = newResultContextProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY, oldResultContextProperty, resultContextProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(CalloutMediatorInputConnector newInputConnector, NotificationChain msgs) {
		CalloutMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(CalloutMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(CalloutMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		CalloutMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(CalloutMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH:
				return basicSetPayloadMessageXpath(null, msgs);
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY:
				return basicSetPayloadRegistryKey(null, msgs);
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH:
				return basicSetResultMessageXpath(null, msgs);
			case EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR:
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
			case EsbPackage.CALLOUT_MEDIATOR__SERVICE_URL:
				return getServiceURL();
			case EsbPackage.CALLOUT_MEDIATOR__SOAP_ACTION:
				return getSoapAction();
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2XML:
				return getPathToAxis2xml();
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY:
				return getPathToAxis2Repository();
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_TYPE:
				return getPayloadType();
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH:
				return getPayloadMessageXpath();
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY:
				return getPayloadRegistryKey();
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_TYPE:
				return getResultType();
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH:
				return getResultMessageXpath();
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY:
				return getResultContextProperty();
			case EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR:
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
			case EsbPackage.CALLOUT_MEDIATOR__SERVICE_URL:
				setServiceURL((String)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__SOAP_ACTION:
				setSoapAction((String)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2XML:
				setPathToAxis2xml((String)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY:
				setPathToAxis2Repository((String)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_TYPE:
				setPayloadType((CalloutPayloadType)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH:
				setPayloadMessageXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY:
				setPayloadRegistryKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_TYPE:
				setResultType((CalloutResultType)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH:
				setResultMessageXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY:
				setResultContextProperty((String)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((CalloutMediatorInputConnector)newValue);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((CalloutMediatorOutputConnector)newValue);
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
			case EsbPackage.CALLOUT_MEDIATOR__SERVICE_URL:
				setServiceURL(SERVICE_URL_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__SOAP_ACTION:
				setSoapAction(SOAP_ACTION_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2XML:
				setPathToAxis2xml(PATH_TO_AXIS2XML_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY:
				setPathToAxis2Repository(PATH_TO_AXIS2_REPOSITORY_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_TYPE:
				setPayloadType(PAYLOAD_TYPE_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH:
				setPayloadMessageXpath((NamespacedProperty)null);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY:
				setPayloadRegistryKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_TYPE:
				setResultType(RESULT_TYPE_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH:
				setResultMessageXpath((NamespacedProperty)null);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY:
				setResultContextProperty(RESULT_CONTEXT_PROPERTY_EDEFAULT);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((CalloutMediatorInputConnector)null);
				return;
			case EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((CalloutMediatorOutputConnector)null);
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
			case EsbPackage.CALLOUT_MEDIATOR__SERVICE_URL:
				return SERVICE_URL_EDEFAULT == null ? serviceURL != null : !SERVICE_URL_EDEFAULT.equals(serviceURL);
			case EsbPackage.CALLOUT_MEDIATOR__SOAP_ACTION:
				return SOAP_ACTION_EDEFAULT == null ? soapAction != null : !SOAP_ACTION_EDEFAULT.equals(soapAction);
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2XML:
				return PATH_TO_AXIS2XML_EDEFAULT == null ? pathToAxis2xml != null : !PATH_TO_AXIS2XML_EDEFAULT.equals(pathToAxis2xml);
			case EsbPackage.CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY:
				return PATH_TO_AXIS2_REPOSITORY_EDEFAULT == null ? pathToAxis2Repository != null : !PATH_TO_AXIS2_REPOSITORY_EDEFAULT.equals(pathToAxis2Repository);
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_TYPE:
				return payloadType != PAYLOAD_TYPE_EDEFAULT;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH:
				return payloadMessageXpath != null;
			case EsbPackage.CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY:
				return payloadRegistryKey != null;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_TYPE:
				return resultType != RESULT_TYPE_EDEFAULT;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH:
				return resultMessageXpath != null;
			case EsbPackage.CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY:
				return RESULT_CONTEXT_PROPERTY_EDEFAULT == null ? resultContextProperty != null : !RESULT_CONTEXT_PROPERTY_EDEFAULT.equals(resultContextProperty);
			case EsbPackage.CALLOUT_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.CALLOUT_MEDIATOR__OUTPUT_CONNECTOR:
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
		result.append(" (serviceURL: ");
		result.append(serviceURL);
		result.append(", soapAction: ");
		result.append(soapAction);
		result.append(", pathToAxis2xml: ");
		result.append(pathToAxis2xml);
		result.append(", pathToAxis2Repository: ");
		result.append(pathToAxis2Repository);
		result.append(", payloadType: ");
		result.append(payloadType);
		result.append(", resultType: ");
		result.append(resultType);
		result.append(", resultContextProperty: ");
		result.append(resultContextProperty);
		result.append(')');
		return result.toString();
	}

} //CalloutMediatorImpl
