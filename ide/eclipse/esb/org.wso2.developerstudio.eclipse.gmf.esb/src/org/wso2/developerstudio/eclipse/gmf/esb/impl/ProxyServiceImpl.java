/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceInSequence;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceOutSequence;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServicePolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.platform.core.mediatype.PlatformMediaTypeConstants;
import org.wso2.developerstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.developerstudio.eclipse.platform.core.utils.DeveloperStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getPinnedServers <em>Pinned Servers</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getServiceGroup <em>Service Group</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#isTraceEnabled <em>Trace Enabled</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#isStatisticsEnabled <em>Statistics Enabled</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getTransports <em>Transports</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getWsdlType <em>Wsdl Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getWsdlXML <em>Wsdl XML</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getWsdlURL <em>Wsdl URL</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getWsdlKey <em>Wsdl Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getServiceParameters <em>Service Parameters</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getServicePolicies <em>Service Policies</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getSequenceContainer <em>Sequence Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl#getEndpointContainer <em>Endpoint Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxyServiceImpl extends EsbElementImpl implements ProxyService {
	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected ProxyOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected ProxyInputConnector inputConnector;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "proxy1";

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
	 * The default value of the '{@link #getPinnedServers() <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedServers()
	 * @generated
	 * @ordered
	 */
	protected static final String PINNED_SERVERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinnedServers() <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedServers()
	 * @generated
	 * @ordered
	 */
	protected String pinnedServers = PINNED_SERVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceGroup() <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceGroup() <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected String serviceGroup = SERVICE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isTraceEnabled() <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTraceEnabled() <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean traceEnabled = TRACE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatisticsEnabled() <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATISTICS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatisticsEnabled() <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean statisticsEnabled = STATISTICS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransports() <em>Transports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransports()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORTS_EDEFAULT = "https,http";

	/**
	 * The cached value of the '{@link #getTransports() <em>Transports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransports()
	 * @generated
	 * @ordered
	 */
	protected String transports = TRANSPORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isReliableMessagingEnabled() <em>Reliable Messaging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliableMessagingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELIABLE_MESSAGING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReliableMessagingEnabled() <em>Reliable Messaging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliableMessagingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean reliableMessagingEnabled = RELIABLE_MESSAGING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSecurityEnabled() <em>Security Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurityEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURITY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecurityEnabled() <em>Security Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurityEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean securityEnabled = SECURITY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlType() <em>Wsdl Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlType()
	 * @generated
	 * @ordered
	 */
	protected static final ProxyWsdlType WSDL_TYPE_EDEFAULT = ProxyWsdlType.NONE;

	/**
	 * The cached value of the '{@link #getWsdlType() <em>Wsdl Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlType()
	 * @generated
	 * @ordered
	 */
	protected ProxyWsdlType wsdlType = WSDL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlXML() <em>Wsdl XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlXML()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_XML_EDEFAULT = "<definitions/>";

	/**
	 * The cached value of the '{@link #getWsdlXML() <em>Wsdl XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlXML()
	 * @generated
	 * @ordered
	 */
	protected String wsdlXML = WSDL_XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlURL() <em>Wsdl URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_URL_EDEFAULT = "http://default/wsdl/url";

	/**
	 * The cached value of the '{@link #getWsdlURL() <em>Wsdl URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlURL()
	 * @generated
	 * @ordered
	 */
	protected String wsdlURL = WSDL_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWsdlKey() <em>Wsdl Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty wsdlKey;

	/**
	 * The cached value of the '{@link #getServiceParameters() <em>Service Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProxyServiceParameter> serviceParameters;

	/**
	 * The cached value of the '{@link #getServicePolicies() <em>Service Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ProxyServicePolicy> servicePolicies;

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
	 * @generated NOT
	 */
	protected ProxyServiceImpl() {
		super();		
		// WSDL Key.
		RegistryKeyProperty wsdlKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		//Set filter properties to filter in only wsdl media type
		DeveloperStudioProviderUtils.addFilter((Map<String, List<String>>)wsdlKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, PlatformMediaTypeConstants.MEDIA_TYPE_WSDL);

		wsdlKey.setPrettyName("WSDL Reference");
		wsdlKey.setKeyName("key");
		wsdlKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setWsdlKey(wsdlKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return EsbPackage.Literals.PROXY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(ProxyOutputConnector newOutputConnector, NotificationChain msgs) {
		ProxyOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(ProxyOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(ProxyInputConnector newInputConnector, NotificationChain msgs) {
		ProxyInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(ProxyInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR, newInputConnector, newInputConnector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPinnedServers() {
		return pinnedServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinnedServers(String newPinnedServers) {
		String oldPinnedServers = pinnedServers;
		pinnedServers = newPinnedServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__PINNED_SERVERS, oldPinnedServers, pinnedServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceGroup() {
		return serviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceGroup(String newServiceGroup) {
		String oldServiceGroup = serviceGroup;
		serviceGroup = newServiceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__SERVICE_GROUP, oldServiceGroup, serviceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTraceEnabled() {
		return traceEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceEnabled(boolean newTraceEnabled) {
		boolean oldTraceEnabled = traceEnabled;
		traceEnabled = newTraceEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__TRACE_ENABLED, oldTraceEnabled, traceEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatisticsEnabled() {
		return statisticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticsEnabled(boolean newStatisticsEnabled) {
		boolean oldStatisticsEnabled = statisticsEnabled;
		statisticsEnabled = newStatisticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__STATISTICS_ENABLED, oldStatisticsEnabled, statisticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransports() {
		return transports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransports(String newTransports) {
		String oldTransports = transports;
		transports = newTransports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__TRANSPORTS, oldTransports, transports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReliableMessagingEnabled() {
		return reliableMessagingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableMessagingEnabled(boolean newReliableMessagingEnabled) {
		boolean oldReliableMessagingEnabled = reliableMessagingEnabled;
		reliableMessagingEnabled = newReliableMessagingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED, oldReliableMessagingEnabled, reliableMessagingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurityEnabled() {
		return securityEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityEnabled(boolean newSecurityEnabled) {
		boolean oldSecurityEnabled = securityEnabled;
		securityEnabled = newSecurityEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__SECURITY_ENABLED, oldSecurityEnabled, securityEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyWsdlType getWsdlType() {
		return wsdlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlType(ProxyWsdlType newWsdlType) {
		ProxyWsdlType oldWsdlType = wsdlType;
		wsdlType = newWsdlType == null ? WSDL_TYPE_EDEFAULT : newWsdlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__WSDL_TYPE, oldWsdlType, wsdlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlXML() {
		return wsdlXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlXML(String newWsdlXML) {
		String oldWsdlXML = wsdlXML;
		wsdlXML = newWsdlXML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__WSDL_XML, oldWsdlXML, wsdlXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlURL() {
		return wsdlURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlURL(String newWsdlURL) {
		String oldWsdlURL = wsdlURL;
		wsdlURL = newWsdlURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__WSDL_URL, oldWsdlURL, wsdlURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getWsdlKey() {
		return wsdlKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlKey(RegistryKeyProperty newWsdlKey, NotificationChain msgs) {
		RegistryKeyProperty oldWsdlKey = wsdlKey;
		wsdlKey = newWsdlKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__WSDL_KEY, oldWsdlKey, newWsdlKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlKey(RegistryKeyProperty newWsdlKey) {
		if (newWsdlKey != wsdlKey) {
			NotificationChain msgs = null;
			if (wsdlKey != null)
				msgs = ((InternalEObject)wsdlKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__WSDL_KEY, null, msgs);
			if (newWsdlKey != null)
				msgs = ((InternalEObject)newWsdlKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__WSDL_KEY, null, msgs);
			msgs = basicSetWsdlKey(newWsdlKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__WSDL_KEY, newWsdlKey, newWsdlKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProxyServiceParameter> getServiceParameters() {
		if (serviceParameters == null) {
			serviceParameters = new EObjectContainmentEList<ProxyServiceParameter>(ProxyServiceParameter.class, this, EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS);
		}
		return serviceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProxyServicePolicy> getServicePolicies() {
		if (servicePolicies == null) {
			servicePolicies = new EObjectContainmentEList<ProxyServicePolicy>(ProxyServicePolicy.class, this, EsbPackage.PROXY_SERVICE__SERVICE_POLICIES);
		}
		return servicePolicies;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER, oldSequenceContainer, newSequenceContainer);
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
				msgs = ((InternalEObject)sequenceContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER, null, msgs);
			if (newSequenceContainer != null)
				msgs = ((InternalEObject)newSequenceContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER, null, msgs);
			msgs = basicSetSequenceContainer(newSequenceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER, newSequenceContainer, newSequenceContainer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER, oldEndpointContainer, newEndpointContainer);
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
				msgs = ((InternalEObject)endpointContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER, null, msgs);
			if (newEndpointContainer != null)
				msgs = ((InternalEObject)newEndpointContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER, null, msgs);
			msgs = basicSetEndpointContainer(newEndpointContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER, newEndpointContainer, newEndpointContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.PROXY_SERVICE__WSDL_KEY:
				return basicSetWsdlKey(null, msgs);
			case EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS:
				return ((InternalEList<?>)getServiceParameters()).basicRemove(otherEnd, msgs);
			case EsbPackage.PROXY_SERVICE__SERVICE_POLICIES:
				return ((InternalEList<?>)getServicePolicies()).basicRemove(otherEnd, msgs);
			case EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER:
				return basicSetSequenceContainer(null, msgs);
			case EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER:
				return basicSetEndpointContainer(null, msgs);
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
			case EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.PROXY_SERVICE__NAME:
				return getName();
			case EsbPackage.PROXY_SERVICE__PINNED_SERVERS:
				return getPinnedServers();
			case EsbPackage.PROXY_SERVICE__SERVICE_GROUP:
				return getServiceGroup();
			case EsbPackage.PROXY_SERVICE__TRACE_ENABLED:
				return isTraceEnabled();
			case EsbPackage.PROXY_SERVICE__STATISTICS_ENABLED:
				return isStatisticsEnabled();
			case EsbPackage.PROXY_SERVICE__TRANSPORTS:
				return getTransports();
			case EsbPackage.PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED:
				return isReliableMessagingEnabled();
			case EsbPackage.PROXY_SERVICE__SECURITY_ENABLED:
				return isSecurityEnabled();
			case EsbPackage.PROXY_SERVICE__WSDL_TYPE:
				return getWsdlType();
			case EsbPackage.PROXY_SERVICE__WSDL_XML:
				return getWsdlXML();
			case EsbPackage.PROXY_SERVICE__WSDL_URL:
				return getWsdlURL();
			case EsbPackage.PROXY_SERVICE__WSDL_KEY:
				return getWsdlKey();
			case EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS:
				return getServiceParameters();
			case EsbPackage.PROXY_SERVICE__SERVICE_POLICIES:
				return getServicePolicies();
			case EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER:
				return getSequenceContainer();
			case EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER:
				return getEndpointContainer();
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
			case EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR:
				setOutputConnector((ProxyOutputConnector)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR:
				setInputConnector((ProxyInputConnector)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__NAME:
				setName((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__PINNED_SERVERS:
				setPinnedServers((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_GROUP:
				setServiceGroup((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__TRACE_ENABLED:
				setTraceEnabled((Boolean)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__STATISTICS_ENABLED:
				setStatisticsEnabled((Boolean)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__TRANSPORTS:
				setTransports((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED:
				setReliableMessagingEnabled((Boolean)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__SECURITY_ENABLED:
				setSecurityEnabled((Boolean)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_TYPE:
				setWsdlType((ProxyWsdlType)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_XML:
				setWsdlXML((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_URL:
				setWsdlURL((String)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_KEY:
				setWsdlKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS:
				getServiceParameters().clear();
				getServiceParameters().addAll((Collection<? extends ProxyServiceParameter>)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_POLICIES:
				getServicePolicies().clear();
				getServicePolicies().addAll((Collection<? extends ProxyServicePolicy>)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER:
				setSequenceContainer((ProxyServiceSequenceContainer)newValue);
				return;
			case EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER:
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
	
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR:
				setOutputConnector((ProxyOutputConnector)null);
				return;
			case EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR:
				setInputConnector((ProxyInputConnector)null);
				return;
			case EsbPackage.PROXY_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__PINNED_SERVERS:
				setPinnedServers(PINNED_SERVERS_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_GROUP:
				setServiceGroup(SERVICE_GROUP_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__TRACE_ENABLED:
				setTraceEnabled(TRACE_ENABLED_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__STATISTICS_ENABLED:
				setStatisticsEnabled(STATISTICS_ENABLED_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__TRANSPORTS:
				setTransports(TRANSPORTS_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED:
				setReliableMessagingEnabled(RELIABLE_MESSAGING_ENABLED_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__SECURITY_ENABLED:
				setSecurityEnabled(SECURITY_ENABLED_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_TYPE:
				setWsdlType(WSDL_TYPE_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_XML:
				setWsdlXML(WSDL_XML_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_URL:
				setWsdlURL(WSDL_URL_EDEFAULT);
				return;
			case EsbPackage.PROXY_SERVICE__WSDL_KEY:
				setWsdlKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS:
				getServiceParameters().clear();
				return;
			case EsbPackage.PROXY_SERVICE__SERVICE_POLICIES:
				getServicePolicies().clear();
				return;
			case EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER:
				setSequenceContainer((ProxyServiceSequenceContainer)null);
				return;
			case EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER:
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
	
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.PROXY_SERVICE__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.PROXY_SERVICE__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.PROXY_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EsbPackage.PROXY_SERVICE__PINNED_SERVERS:
				return PINNED_SERVERS_EDEFAULT == null ? pinnedServers != null : !PINNED_SERVERS_EDEFAULT.equals(pinnedServers);
			case EsbPackage.PROXY_SERVICE__SERVICE_GROUP:
				return SERVICE_GROUP_EDEFAULT == null ? serviceGroup != null : !SERVICE_GROUP_EDEFAULT.equals(serviceGroup);
			case EsbPackage.PROXY_SERVICE__TRACE_ENABLED:
				return traceEnabled != TRACE_ENABLED_EDEFAULT;
			case EsbPackage.PROXY_SERVICE__STATISTICS_ENABLED:
				return statisticsEnabled != STATISTICS_ENABLED_EDEFAULT;
			case EsbPackage.PROXY_SERVICE__TRANSPORTS:
				return TRANSPORTS_EDEFAULT == null ? transports != null : !TRANSPORTS_EDEFAULT.equals(transports);
			case EsbPackage.PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED:
				return reliableMessagingEnabled != RELIABLE_MESSAGING_ENABLED_EDEFAULT;
			case EsbPackage.PROXY_SERVICE__SECURITY_ENABLED:
				return securityEnabled != SECURITY_ENABLED_EDEFAULT;
			case EsbPackage.PROXY_SERVICE__WSDL_TYPE:
				return wsdlType != WSDL_TYPE_EDEFAULT;
			case EsbPackage.PROXY_SERVICE__WSDL_XML:
				return WSDL_XML_EDEFAULT == null ? wsdlXML != null : !WSDL_XML_EDEFAULT.equals(wsdlXML);
			case EsbPackage.PROXY_SERVICE__WSDL_URL:
				return WSDL_URL_EDEFAULT == null ? wsdlURL != null : !WSDL_URL_EDEFAULT.equals(wsdlURL);
			case EsbPackage.PROXY_SERVICE__WSDL_KEY:
				return wsdlKey != null;
			case EsbPackage.PROXY_SERVICE__SERVICE_PARAMETERS:
				return serviceParameters != null && !serviceParameters.isEmpty();
			case EsbPackage.PROXY_SERVICE__SERVICE_POLICIES:
				return servicePolicies != null && !servicePolicies.isEmpty();
			case EsbPackage.PROXY_SERVICE__SEQUENCE_CONTAINER:
				return sequenceContainer != null;
			case EsbPackage.PROXY_SERVICE__ENDPOINT_CONTAINER:
				return endpointContainer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", pinnedServers: ");
		result.append(pinnedServers);
		result.append(", serviceGroup: ");
		result.append(serviceGroup);
		result.append(", traceEnabled: ");
		result.append(traceEnabled);
		result.append(", statisticsEnabled: ");
		result.append(statisticsEnabled);
		result.append(", transports: ");
		result.append(transports);
		result.append(", reliableMessagingEnabled: ");
		result.append(reliableMessagingEnabled);
		result.append(", securityEnabled: ");
		result.append(securityEnabled);
		result.append(", wsdlType: ");
		result.append(wsdlType);
		result.append(", wsdlXML: ");
		result.append(wsdlXML);
		result.append(", wsdlURL: ");
		result.append(wsdlURL);
		result.append(')');
		return result.toString();
	}

} //ProxyServiceImpl
