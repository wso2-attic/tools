/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getPinnedServers <em>Pinned Servers</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getServiceGroup <em>Service Group</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isTraceEnabled <em>Trace Enabled</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isStatisticsEnabled <em>Statistics Enabled</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getTransports <em>Transports</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlType <em>Wsdl Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlXML <em>Wsdl XML</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlURL <em>Wsdl URL</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlKey <em>Wsdl Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getServiceParameters <em>Service Parameters</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getServicePolicies <em>Service Policies</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getSequenceContainer <em>Sequence Container</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getEndpointContainer <em>Endpoint Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService()
 * @model
 * @generated
 */
public interface ProxyService extends EsbElement {
	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(ProxyOutputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	ProxyOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(ProxyOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(ProxyInputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	ProxyInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(ProxyInputConnector value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"proxy1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_Name()
	 * @model default="proxy1"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pinned Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned Servers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinned Servers</em>' attribute.
	 * @see #setPinnedServers(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_PinnedServers()
	 * @model
	 * @generated
	 */
	String getPinnedServers();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getPinnedServers <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinned Servers</em>' attribute.
	 * @see #getPinnedServers()
	 * @generated
	 */
	void setPinnedServers(String value);

	/**
	 * Returns the value of the '<em><b>Service Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Group</em>' attribute.
	 * @see #setServiceGroup(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_ServiceGroup()
	 * @model
	 * @generated
	 */
	String getServiceGroup();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getServiceGroup <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Group</em>' attribute.
	 * @see #getServiceGroup()
	 * @generated
	 */
	void setServiceGroup(String value);

	/**
	 * Returns the value of the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Enabled</em>' attribute.
	 * @see #setTraceEnabled(boolean)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_TraceEnabled()
	 * @model
	 * @generated
	 */
	boolean isTraceEnabled();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isTraceEnabled <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Enabled</em>' attribute.
	 * @see #isTraceEnabled()
	 * @generated
	 */
	void setTraceEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistics Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics Enabled</em>' attribute.
	 * @see #setStatisticsEnabled(boolean)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_StatisticsEnabled()
	 * @model
	 * @generated
	 */
	boolean isStatisticsEnabled();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isStatisticsEnabled <em>Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics Enabled</em>' attribute.
	 * @see #isStatisticsEnabled()
	 * @generated
	 */
	void setStatisticsEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Transports</b></em>' attribute.
	 * The default value is <code>"https,http"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transports</em>' attribute.
	 * @see #setTransports(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_Transports()
	 * @model default="https,http"
	 * @generated
	 */
	String getTransports();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getTransports <em>Transports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transports</em>' attribute.
	 * @see #getTransports()
	 * @generated
	 */
	void setTransports(String value);

	/**
	 * Returns the value of the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliable Messaging Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliable Messaging Enabled</em>' attribute.
	 * @see #setReliableMessagingEnabled(boolean)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_ReliableMessagingEnabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isReliableMessagingEnabled();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable Messaging Enabled</em>' attribute.
	 * @see #isReliableMessagingEnabled()
	 * @generated
	 */
	void setReliableMessagingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Security Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Enabled</em>' attribute.
	 * @see #setSecurityEnabled(boolean)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_SecurityEnabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isSecurityEnabled();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#isSecurityEnabled <em>Security Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Enabled</em>' attribute.
	 * @see #isSecurityEnabled()
	 * @generated
	 */
	void setSecurityEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Wsdl Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyWsdlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.ProxyWsdlType
	 * @see #setWsdlType(ProxyWsdlType)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_WsdlType()
	 * @model default="NONE"
	 * @generated
	 */
	ProxyWsdlType getWsdlType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlType <em>Wsdl Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.ProxyWsdlType
	 * @see #getWsdlType()
	 * @generated
	 */
	void setWsdlType(ProxyWsdlType value);

	/**
	 * Returns the value of the '<em><b>Wsdl XML</b></em>' attribute.
	 * The default value is <code>"<definitions/>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl XML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl XML</em>' attribute.
	 * @see #setWsdlXML(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_WsdlXML()
	 * @model default="<definitions/>"
	 * @generated
	 */
	String getWsdlXML();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlXML <em>Wsdl XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl XML</em>' attribute.
	 * @see #getWsdlXML()
	 * @generated
	 */
	void setWsdlXML(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl URL</b></em>' attribute.
	 * The default value is <code>"http://default/wsdl/url"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl URL</em>' attribute.
	 * @see #setWsdlURL(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_WsdlURL()
	 * @model default="http://default/wsdl/url"
	 * @generated
	 */
	String getWsdlURL();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlURL <em>Wsdl URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl URL</em>' attribute.
	 * @see #getWsdlURL()
	 * @generated
	 */
	void setWsdlURL(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Key</em>' containment reference.
	 * @see #setWsdlKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_WsdlKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getWsdlKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getWsdlKey <em>Wsdl Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Key</em>' containment reference.
	 * @see #getWsdlKey()
	 * @generated
	 */
	void setWsdlKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Service Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Parameters</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_ServiceParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProxyServiceParameter> getServiceParameters();

	/**
	 * Returns the value of the '<em><b>Service Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyServicePolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Policies</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_ServicePolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProxyServicePolicy> getServicePolicies();

	/**
	 * Returns the value of the '<em><b>Sequence Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Container</em>' containment reference.
	 * @see #setSequenceContainer(ProxyServiceSequenceContainer)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_SequenceContainer()
	 * @model containment="true"
	 * @generated
	 */
	ProxyServiceSequenceContainer getSequenceContainer();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getSequenceContainer <em>Sequence Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Container</em>' containment reference.
	 * @see #getSequenceContainer()
	 * @generated
	 */
	void setSequenceContainer(ProxyServiceSequenceContainer value);

	/**
	 * Returns the value of the '<em><b>Endpoint Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Container</em>' containment reference.
	 * @see #setEndpointContainer(ProxyServiceEndpointContainer)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyService_EndpointContainer()
	 * @model containment="true"
	 * @generated
	 */
	ProxyServiceEndpointContainer getEndpointContainer();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService#getEndpointContainer <em>Endpoint Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Container</em>' containment reference.
	 * @see #getEndpointContainer()
	 * @generated
	 */
	void setEndpointContainer(ProxyServiceEndpointContainer value);

} // ProxyService
