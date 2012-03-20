/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory
 * @model kind="package"
 * @generated
 */
public interface EsbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/wso2/developerstudio/eclipse/gmf/esb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsbPackage eINSTANCE = org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbDiagramImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbDiagram()
	 * @generated
	 */
	int ESB_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_DIAGRAM__SERVER = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_DIAGRAM__TEST = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbNodeImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbNode()
	 * @generated
	 */
	int ESB_NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbElementImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbElement()
	 * @generated
	 */
	int ESB_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_ELEMENT_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbServerImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbServer()
	 * @generated
	 */
	int ESB_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SERVER__CHILDREN = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Mediator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SERVER__MESSAGE_MEDIATOR = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SERVER_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__REVERSE = ESB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = ESB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbConnector()
	 * @generated
	 */
	int ESB_CONNECTOR = 5;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.InputConnectorImpl <em>Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.InputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getInputConnector()
	 * @generated
	 */
	int INPUT_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__INCOMING_LINKS = ESB_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR_FEATURE_COUNT = ESB_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOutputConnector()
	 * @generated
	 */
	int OUTPUT_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__OUTGOING_LINK = ESB_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR_FEATURE_COUNT = ESB_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AdditionalOutputConnectorImpl <em>Additional Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AdditionalOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAdditionalOutputConnector()
	 * @generated
	 */
	int ADDITIONAL_OUTPUT_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OUTPUT_CONNECTOR__OUTGOING_LINK = ESB_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OUTPUT_CONNECTOR_FEATURE_COUNT = ESB_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbLinkImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbLink()
	 * @generated
	 */
	int ESB_LINK = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 10;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__END_POINT_NAME = ESB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ANONYMOUS = ESB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = ESB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl <em>Proxy Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyService()
	 * @generated
	 */
	int PROXY_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__OUTPUT_CONNECTOR = ESB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__INPUT_CONNECTOR = ESB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__NAME = ESB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pinned Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__PINNED_SERVERS = ESB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_GROUP = ESB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__TRACE_ENABLED = ESB_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__STATISTICS_ENABLED = ESB_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__TRANSPORTS = ESB_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED = ESB_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SECURITY_ENABLED = ESB_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Wsdl Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__WSDL_TYPE = ESB_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Wsdl XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__WSDL_XML = ESB_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wsdl URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__WSDL_URL = ESB_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Wsdl Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__WSDL_KEY = ESB_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Service Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_PARAMETERS = ESB_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Service Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_POLICIES = ESB_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SEQUENCE_CONTAINER = ESB_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Endpoint Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__ENDPOINT_CONTAINER = ESB_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Proxy Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_FEATURE_COUNT = ESB_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyOutputConnectorImpl <em>Proxy Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyOutputConnector()
	 * @generated
	 */
	int PROXY_OUTPUT_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Proxy Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyInputConnectorImpl <em>Proxy Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyInputConnector()
	 * @generated
	 */
	int PROXY_INPUT_CONNECTOR = 13;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Proxy Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceParameterImpl <em>Proxy Service Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceParameterImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceParameter()
	 * @generated
	 */
	int PROXY_SERVICE_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Proxy Service Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServicePolicyImpl <em>Proxy Service Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServicePolicyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServicePolicy()
	 * @generated
	 */
	int PROXY_SERVICE_POLICY = 15;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__POLICY_KEY = 0;

	/**
	 * The number of structural features of the '<em>Proxy Service Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceInSequenceImpl <em>Proxy Service In Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceInSequenceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceInSequence()
	 * @generated
	 */
	int PROXY_SERVICE_IN_SEQUENCE = 16;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_IN_SEQUENCE__CHILDREN = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Service In Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_IN_SEQUENCE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceOutSequenceImpl <em>Proxy Service Out Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceOutSequenceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceOutSequence()
	 * @generated
	 */
	int PROXY_SERVICE_OUT_SEQUENCE = 17;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_OUT_SEQUENCE__CHILDREN = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Service Out Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_OUT_SEQUENCE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceContainerImpl <em>Proxy Service Sequence Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceContainerImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceSequenceContainer()
	 * @generated
	 */
	int PROXY_SERVICE_SEQUENCE_CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>In Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_SEQUENCE_CONTAINER__IN_SEQUENCE = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_SEQUENCE_CONTAINER__OUT_SEQUENCE = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proxy Service Sequence Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_SEQUENCE_CONTAINER_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceEndpointContainerImpl <em>Proxy Service Endpoint Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceEndpointContainerImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceEndpointContainer()
	 * @generated
	 */
	int PROXY_SERVICE_ENDPOINT_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_ENDPOINT_CONTAINER__CHILDREN = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Service Endpoint Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_ENDPOINT_CONTAINER_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractEndPointImpl <em>Abstract End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractEndPoint()
	 * @generated
	 */
	int ABSTRACT_END_POINT = 20;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__END_POINT_NAME = END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ANONYMOUS = END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SECURITY_ENABLED = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_ENABLED = END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_VERSION = END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER = END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__TIME_OUT_DURATION = END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__TIME_OUT_ACTION = END_POINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_ERROR_CODES = END_POINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_COUNT = END_POINT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_DELAY = END_POINT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_ERROR_CODES = END_POINT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION = END_POINT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION = END_POINT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR = END_POINT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY = END_POINT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SECURITY_POLICY = END_POINT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Abstract End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageMediatorImpl <em>Message Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageMediator()
	 * @generated
	 */
	int MESSAGE_MEDIATOR = 21;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MEDIATOR__INPUT_CONNECTOR = ESB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MEDIATOR__OUTPUT_CONNECTOR = ESB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MEDIATOR_FEATURE_COUNT = ESB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageInputConnectorImpl <em>Message Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageInputConnector()
	 * @generated
	 */
	int MESSAGE_INPUT_CONNECTOR = 22;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Message Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageOutputConnectorImpl <em>Message Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageOutputConnector()
	 * @generated
	 */
	int MESSAGE_OUTPUT_CONNECTOR = 23;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Message Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointImpl <em>Default End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPoint()
	 * @generated
	 */
	int DEFAULT_END_POINT = 24;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__END_POINT_NAME = ABSTRACT_END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ANONYMOUS = ABSTRACT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SECURITY_ENABLED = ABSTRACT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_ENABLED = ABSTRACT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_VERSION = ABSTRACT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__TIME_OUT_DURATION = ABSTRACT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__TIME_OUT_ACTION = ABSTRACT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_ERROR_CODES = ABSTRACT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_COUNT = ABSTRACT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_DELAY = ABSTRACT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SECURITY_POLICY = ABSTRACT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__INPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__OUTPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_FEATURE_COUNT = ABSTRACT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointInputConnectorImpl <em>Default End Point Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPointInputConnector()
	 * @generated
	 */
	int DEFAULT_END_POINT_INPUT_CONNECTOR = 25;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Default End Point Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointOutputConnectorImpl <em>Default End Point Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPointOutputConnector()
	 * @generated
	 */
	int DEFAULT_END_POINT_OUTPUT_CONNECTOR = 26;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Default End Point Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointImpl <em>Address End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPoint()
	 * @generated
	 */
	int ADDRESS_END_POINT = 27;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__END_POINT_NAME = ABSTRACT_END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ANONYMOUS = ABSTRACT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SECURITY_ENABLED = ABSTRACT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_ENABLED = ABSTRACT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_VERSION = ABSTRACT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__TIME_OUT_DURATION = ABSTRACT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__TIME_OUT_ACTION = ABSTRACT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_ERROR_CODES = ABSTRACT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_COUNT = ABSTRACT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_DELAY = ABSTRACT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SECURITY_POLICY = ABSTRACT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__INPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__OUTPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__URI = ABSTRACT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_FEATURE_COUNT = ABSTRACT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointInputConnectorImpl <em>Address End Point Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPointInputConnector()
	 * @generated
	 */
	int ADDRESS_END_POINT_INPUT_CONNECTOR = 28;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Address End Point Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointOutputConnectorImpl <em>Address End Point Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPointOutputConnector()
	 * @generated
	 */
	int ADDRESS_END_POINT_OUTPUT_CONNECTOR = 29;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Address End Point Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorImpl <em>Drop Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDropMediator()
	 * @generated
	 */
	int DROP_MEDIATOR = 30;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorInputConnectorImpl <em>Drop Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDropMediatorInputConnector()
	 * @generated
	 */
	int DROP_MEDIATOR_INPUT_CONNECTOR = 31;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Drop Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorImpl <em>Filter Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediator()
	 * @generated
	 */
	int FILTER_MEDIATOR = 32;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__CONDITION_TYPE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__REGEX = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pass Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__PASS_OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fail Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__FAIL_OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__XPATH = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__SOURCE = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Filter Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorInputConnectorImpl <em>Filter Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorInputConnector()
	 * @generated
	 */
	int FILTER_MEDIATOR_INPUT_CONNECTOR = 33;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Filter Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorPassOutputConnectorImpl <em>Filter Mediator Pass Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorPassOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorPassOutputConnector()
	 * @generated
	 */
	int FILTER_MEDIATOR_PASS_OUTPUT_CONNECTOR = 34;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_PASS_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Filter Mediator Pass Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_PASS_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorFailOutputConnectorImpl <em>Filter Mediator Fail Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorFailOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorFailOutputConnector()
	 * @generated
	 */
	int FILTER_MEDIATOR_FAIL_OUTPUT_CONNECTOR = 35;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_FAIL_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Filter Mediator Fail Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_FAIL_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 36;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>First Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__FIRST_INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__SECOND_INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeFirstInputConnectorImpl <em>Merge Node First Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeFirstInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeFirstInputConnector()
	 * @generated
	 */
	int MERGE_NODE_FIRST_INPUT_CONNECTOR = 37;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FIRST_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Merge Node First Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FIRST_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeSecondInputConnectorImpl <em>Merge Node Second Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeSecondInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeSecondInputConnector()
	 * @generated
	 */
	int MERGE_NODE_SECOND_INPUT_CONNECTOR = 38;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_SECOND_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Merge Node Second Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_SECOND_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeOutputConnectorImpl <em>Merge Node Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeOutputConnector()
	 * @generated
	 */
	int MERGE_NODE_OUTPUT_CONNECTOR = 39;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Merge Node Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorImpl <em>Log Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediator()
	 * @generated
	 */
	int LOG_MEDIATOR = 40;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Log Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_CATEGORY = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_LEVEL = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_SEPARATOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__PROPERTIES = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Log Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorInputConnectorImpl <em>Log Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediatorInputConnector()
	 * @generated
	 */
	int LOG_MEDIATOR_INPUT_CONNECTOR = 41;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Log Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorOutputConnectorImpl <em>Log Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediatorOutputConnector()
	 * @generated
	 */
	int LOG_MEDIATOR_OUTPUT_CONNECTOR = 42;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Log Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogPropertyImpl <em>Log Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogProperty()
	 * @generated
	 */
	int LOG_PROPERTY = 43;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RegistryKeyPropertyImpl <em>Registry Key Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RegistryKeyPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRegistryKeyProperty()
	 * @generated
	 */
	int REGISTRY_KEY_PROPERTY = 44;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorImpl <em>Property Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediator()
	 * @generated
	 */
	int PROPERTY_MEDIATOR = 45;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorInputConnectorImpl <em>Property Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediatorInputConnector()
	 * @generated
	 */
	int PROPERTY_MEDIATOR_INPUT_CONNECTOR = 46;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorOutputConnectorImpl <em>Property Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediatorOutputConnector()
	 * @generated
	 */
	int PROPERTY_MEDIATOR_OUTPUT_CONNECTOR = 47;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.NamespacedPropertyImpl <em>Namespaced Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.NamespacedPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getNamespacedProperty()
	 * @generated
	 */
	int NAMESPACED_PROPERTY = 48;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorImpl <em>Enrich Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediator()
	 * @generated
	 */
	int ENRICH_MEDIATOR = 49;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorInputConnectorImpl <em>Enrich Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediatorInputConnector()
	 * @generated
	 */
	int ENRICH_MEDIATOR_INPUT_CONNECTOR = 50;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorOutputConnectorImpl <em>Enrich Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediatorOutputConnector()
	 * @generated
	 */
	int ENRICH_MEDIATOR_OUTPUT_CONNECTOR = 51;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValueExpressionPropertyImpl <em>Abstract Name Value Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValueExpressionPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY = 52;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION = ESB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Name Value Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_VALUE_TYPE = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_EXPRESSION = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Log Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pretty Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__PRETTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__KEY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__FILTERS = 3;

	/**
	 * The number of structural features of the '<em>Registry Key Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_NAME = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_ACTION = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_SCOPE = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_TYPE = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_LITERAL = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__EXPRESSION = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__NAMESPACE_PREFIX = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__NAMESPACE = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_EXPRESSION = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value OM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_OM = MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Value String Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_STRING_PATTERN = MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value String Capturing Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP = MEDIATOR_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Property Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Property Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Property Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pretty Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PRETTY_NAME = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PROPERTY_NAME = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PROPERTY_VALUE = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__NAMESPACES = ESB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Namespaced Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Clone Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__CLONE_SOURCE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_TYPE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_XPATH = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_PROPERTY = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_XML = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_ACTION = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_TYPE = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_XPATH = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_PROPERTY = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Enrich Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Enrich Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Enrich Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractBooleanFeatureImpl <em>Abstract Boolean Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractBooleanFeatureImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractBooleanFeature()
	 * @generated
	 */
	int ABSTRACT_BOOLEAN_FEATURE = 53;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Boolean Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractLocationKeyResourceImpl <em>Abstract Location Key Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractLocationKeyResourceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractLocationKeyResource()
	 * @generated
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE = 54;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE__KEY = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Location Key Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorImpl <em>XSLT Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediator()
	 * @generated
	 */
	int XSLT_MEDIATOR = 55;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xslt Schema Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__XSLT_SCHEMA_KEY_TYPE = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xslt Static Schema Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__XSLT_STATIC_SCHEMA_KEY = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xslt Dynamic Schema Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__XSLT_DYNAMIC_SCHEMA_KEY = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xslt Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__XSLT_KEY = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__SOURCE_XPATH = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__PROPERTIES = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__FEATURES = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__RESOURCES = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>XSLT Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTPropertyImpl <em>XSLT Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTProperty()
	 * @generated
	 */
	int XSLT_PROPERTY = 56;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_VALUE_TYPE = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_EXPRESSION = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>XSLT Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTFeatureImpl <em>XSLT Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTFeatureImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTFeature()
	 * @generated
	 */
	int XSLT_FEATURE = 57;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__FEATURE_NAME = ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__FEATURE_ENABLED = ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED;

	/**
	 * The number of structural features of the '<em>XSLT Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE_FEATURE_COUNT = ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTResourceImpl <em>XSLT Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTResourceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTResource()
	 * @generated
	 */
	int XSLT_RESOURCE = 58;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__LOCATION = ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__KEY = ABSTRACT_LOCATION_KEY_RESOURCE__KEY;

	/**
	 * The number of structural features of the '<em>XSLT Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE_FEATURE_COUNT = ABSTRACT_LOCATION_KEY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorInputConnectorImpl <em>XSLT Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediatorInputConnector()
	 * @generated
	 */
	int XSLT_MEDIATOR_INPUT_CONNECTOR = 59;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>XSLT Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorOutputConnectorImpl <em>XSLT Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediatorOutputConnector()
	 * @generated
	 */
	int XSLT_MEDIATOR_OUTPUT_CONNECTOR = 60;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>XSLT Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl <em>Switch Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchMediator()
	 * @generated
	 */
	int SWITCH_MEDIATOR = 61;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__SOURCE_XPATH = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__SOURCE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__NAMESPACE = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__NAMESPACE_PREFIX = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Case Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__CASE_BRANCHES = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__DEFAULT_BRANCH = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Switch Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchCaseBranchOutputConnectorImpl <em>Switch Case Branch Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchCaseBranchOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchCaseBranchOutputConnector()
	 * @generated
	 */
	int SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR = 62;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The feature id for the '<em><b>Case Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR__CASE_REGEX = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Case Branch Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchDefaultBranchOutputConnectorImpl <em>Switch Default Branch Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchDefaultBranchOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchDefaultBranchOutputConnector()
	 * @generated
	 */
	int SWITCH_DEFAULT_BRANCH_OUTPUT_CONNECTOR = 63;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Switch Default Branch Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorInputConnectorImpl <em>Switch Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchMediatorInputConnector()
	 * @generated
	 */
	int SWITCH_MEDIATOR_INPUT_CONNECTOR = 64;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Switch Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceDiagramImpl <em>Sequence Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceDiagramImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceDiagram()
	 * @generated
	 */
	int SEQUENCE_DIAGRAM = 65;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM__SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Sequence Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequence()
	 * @generated
	 */
	int ESB_SEQUENCE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE__NAME = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE__INPUT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE__OUTPUT = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Mediators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE__CHILD_MEDIATORS = ESB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputImpl <em>Sequence Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceInput()
	 * @generated
	 */
	int ESB_SEQUENCE_INPUT = 67;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_INPUT__CONNECTOR = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_INPUT_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputImpl <em>Sequence Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceOutput()
	 * @generated
	 */
	int ESB_SEQUENCE_OUTPUT = 68;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_OUTPUT__CONNECTOR = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_OUTPUT_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputConnectorImpl <em>Sequence Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceInputConnector()
	 * @generated
	 */
	int ESB_SEQUENCE_INPUT_CONNECTOR = 69;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_INPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Sequence Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_INPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputConnectorImpl <em>Sequence Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceOutputConnector()
	 * @generated
	 */
	int ESB_SEQUENCE_OUTPUT_CONNECTOR = 70;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_OUTPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Sequence Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_SEQUENCE_OUTPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 71;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__KEY = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Included Mediators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INCLUDED_MEDIATORS = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceInputConnectorImpl <em>Sequence Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceInputConnector()
	 * @generated
	 */
	int SEQUENCE_INPUT_CONNECTOR = 72;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Sequence Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceOutputConnectorImpl <em>Sequence Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceOutputConnector()
	 * @generated
	 */
	int SEQUENCE_OUTPUT_CONNECTOR = 73;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Sequence Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorImpl <em>Event Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediator()
	 * @generated
	 */
	int EVENT_MEDIATOR = 74;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Topic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__TOPIC_TYPE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__STATIC_TOPIC = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__DYNAMIC_TOPIC = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__EVENT_EXPRESSION = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Event Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorInputConnectorImpl <em>Event Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediatorInputConnector()
	 * @generated
	 */
	int EVENT_MEDIATOR_INPUT_CONNECTOR = 75;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Event Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorOutputConnectorImpl <em>Event Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediatorOutputConnector()
	 * @generated
	 */
	int EVENT_MEDIATOR_OUTPUT_CONNECTOR = 76;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Event Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValuePropertyImpl <em>Abstract Name Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValuePropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractNameValueProperty()
	 * @generated
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY = 77;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Name Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl <em>Entitlement Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediator()
	 * @generated
	 */
	int ENTITLEMENT_MEDIATOR = 78;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__SERVER_URL = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__USERNAME = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__PASSWORD = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entitlement Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorInputConnectorImpl <em>Entitlement Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediatorInputConnector()
	 * @generated
	 */
	int ENTITLEMENT_MEDIATOR_INPUT_CONNECTOR = 79;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Entitlement Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorOutputConnectorImpl <em>Entitlement Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediatorOutputConnector()
	 * @generated
	 */
	int ENTITLEMENT_MEDIATOR_OUTPUT_CONNECTOR = 80;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Entitlement Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl <em>Enqueue Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnqueueMediator()
	 * @generated
	 */
	int ENQUEUE_MEDIATOR = 81;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__EXECUTOR = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__PRIORITY = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__SEQUENCE_KEY = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enqueue Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorImpl <em>Class Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediator()
	 * @generated
	 */
	int CLASS_MEDIATOR = 82;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__CLASS_NAME = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__PROPERTIES = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorInputConnectorImpl <em>Class Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediatorInputConnector()
	 * @generated
	 */
	int CLASS_MEDIATOR_INPUT_CONNECTOR = 83;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Class Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorOutputConnectorImpl <em>Class Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediatorOutputConnector()
	 * @generated
	 */
	int CLASS_MEDIATOR_OUTPUT_CONNECTOR = 84;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Class Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassPropertyImpl <em>Class Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassProperty()
	 * @generated
	 */
	int CLASS_PROPERTY = 85;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Class Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorImpl <em>Spring Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediator()
	 * @generated
	 */
	int SPRING_MEDIATOR = 86;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Bean Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__BEAN_NAME = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__CONFIGURATION_KEY = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Spring Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorInputConnectorImpl <em>Spring Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediatorInputConnector()
	 * @generated
	 */
	int SPRING_MEDIATOR_INPUT_CONNECTOR = 87;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Spring Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorOutputConnectorImpl <em>Spring Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediatorOutputConnector()
	 * @generated
	 */
	int SPRING_MEDIATOR_OUTPUT_CONNECTOR = 88;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Spring Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl <em>Validate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateMediator()
	 * @generated
	 */
	int VALIDATE_MEDIATOR = 89;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__SOURCE_XPATH = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Fail Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__ON_FAIL_BRANCH = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__FEATURES = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__SCHEMAS = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Validate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateOnFailBranchImpl <em>Validate On Fail Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateOnFailBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateOnFailBranch()
	 * @generated
	 */
	int VALIDATE_ON_FAIL_BRANCH = 90;

	/**
	 * The number of structural features of the '<em>Validate On Fail Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateFeatureImpl <em>Validate Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateFeatureImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateFeature()
	 * @generated
	 */
	int VALIDATE_FEATURE = 91;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__FEATURE_NAME = ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__FEATURE_ENABLED = ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED;

	/**
	 * The number of structural features of the '<em>Validate Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_FEATURE_COUNT = ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateSchemaImpl <em>Validate Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateSchemaImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateSchema()
	 * @generated
	 */
	int VALIDATE_SCHEMA = 92;

	/**
	 * The feature id for the '<em><b>Validate Static Schema Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__VALIDATE_STATIC_SCHEMA_KEY = 0;

	/**
	 * The feature id for the '<em><b>Validate Dynamic Schema Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__VALIDATE_DYNAMIC_SCHEMA_KEY = 1;

	/**
	 * The feature id for the '<em><b>Validate Schema Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__VALIDATE_SCHEMA_KEY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Validate Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl <em>Script Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediator()
	 * @generated
	 */
	int SCRIPT_MEDIATOR = 93;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_TYPE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_LANGUAGE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mediate Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__MEDIATE_FUNCTION = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_KEY = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Script Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_BODY = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Script Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorInputConnectorImpl <em>Script Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediatorInputConnector()
	 * @generated
	 */
	int SCRIPT_MEDIATOR_INPUT_CONNECTOR = 94;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Script Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorOutputConnectorImpl <em>Script Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediatorOutputConnector()
	 * @generated
	 */
	int SCRIPT_MEDIATOR_OUTPUT_CONNECTOR = 95;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Script Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorImpl <em>Fault Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediator()
	 * @generated
	 */
	int FAULT_MEDIATOR = 96;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Soap Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__SOAP_VERSION = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mark As Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__MARK_AS_RESPONSE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Code Soap11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_CODE_SOAP11 = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault String Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_TYPE = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_VALUE = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault String Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_EXPRESSION = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_ACTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault Code Soap12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_CODE_SOAP12 = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fault Reason Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_TYPE = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault Reason Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_VALUE = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fault Reason Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_EXPRESSION = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__ROLE_NAME = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__NODE_NAME = MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fault Detail Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_TYPE = MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fault Detail Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_VALUE = MEDIATOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fault Detail Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_EXPRESSION = MEDIATOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Fault Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorInputConnectorImpl <em>Fault Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediatorInputConnector()
	 * @generated
	 */
	int FAULT_MEDIATOR_INPUT_CONNECTOR = 97;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Fault Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorOutputConnectorImpl <em>Fault Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediatorOutputConnector()
	 * @generated
	 */
	int FAULT_MEDIATOR_OUTPUT_CONNECTOR = 98;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Fault Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl <em>Aggregate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediator()
	 * @generated
	 */
	int AGGREGATE_MEDIATOR = 99;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Aggregate ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__AGGREGATE_ID = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Completion Min Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Completion Max Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Complete Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>On Complete Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__CHILDREN = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Aggregate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorInputConnectorImpl <em>Aggregate Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorInputConnector()
	 * @generated
	 */
	int AGGREGATE_MEDIATOR_INPUT_CONNECTOR = 100;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Aggregate Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOutputConnectorImpl <em>Aggregate Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorOutputConnector()
	 * @generated
	 */
	int AGGREGATE_MEDIATOR_OUTPUT_CONNECTOR = 101;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Aggregate Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOnCompleteOutputConnectorImpl <em>Aggregate Mediator On Complete Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOnCompleteOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorOnCompleteOutputConnector()
	 * @generated
	 */
	int AGGREGATE_MEDIATOR_ON_COMPLETE_OUTPUT_CONNECTOR = 102;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_ON_COMPLETE_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Aggregate Mediator On Complete Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_ON_COMPLETE_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl <em>Aggregate On Complete Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateOnCompleteBranch()
	 * @generated
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH = 103;

	/**
	 * The feature id for the '<em><b>Aggregation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY = 2;

	/**
	 * The number of structural features of the '<em>Aggregate On Complete Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl <em>Router Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouterMediator()
	 * @generated
	 */
	int ROUTER_MEDIATOR = 104;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Continue After Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__ROUTES = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterRouteImpl <em>Router Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterRouteImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouterRoute()
	 * @generated
	 */
	int ROUTER_ROUTE = 105;

	/**
	 * The feature id for the '<em><b>Break After Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__BREAK_AFTER_ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Route Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__ROUTE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Route Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__ROUTE_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Router Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouteTargetImpl <em>Route Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouteTargetImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouteTarget()
	 * @generated
	 */
	int ROUTE_TARGET = 106;

	/**
	 * The number of structural features of the '<em>Route Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorImpl <em>Clone Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediator()
	 * @generated
	 */
	int CLONE_MEDIATOR = 107;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Clone ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__CLONE_ID = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequential Mediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__SEQUENTIAL_MEDIATION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Continue Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__CONTINUE_PARENT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets Output Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__TARGETS_OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clone Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorInputConnectorImpl <em>Clone Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorInputConnector()
	 * @generated
	 */
	int CLONE_MEDIATOR_INPUT_CONNECTOR = 108;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Clone Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorOutputConnectorImpl <em>Clone Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorOutputConnector()
	 * @generated
	 */
	int CLONE_MEDIATOR_OUTPUT_CONNECTOR = 109;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Clone Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorTargetOutputConnectorImpl <em>Clone Mediator Target Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorTargetOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorTargetOutputConnector()
	 * @generated
	 */
	int CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR = 110;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR__SOAP_ACTION = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR__TO_ADDRESS = OUTPUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clone Mediator Target Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorImpl <em>Iterate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediator()
	 * @generated
	 */
	int ITERATE_MEDIATOR = 111;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Iterate ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ITERATE_ID = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequential Mediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__SEQUENTIAL_MEDIATION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Continue Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__CONTINUE_PARENT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preserve Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__PRESERVE_PAYLOAD = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Iterate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ITERATE_EXPRESSION = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attach Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ATTACH_PATH = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__TARGET = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Iterate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorInputConnectorImpl <em>Iterate Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediatorInputConnector()
	 * @generated
	 */
	int ITERATE_MEDIATOR_INPUT_CONNECTOR = 112;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Iterate Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorOutputConnectorImpl <em>Iterate Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediatorOutputConnector()
	 * @generated
	 */
	int ITERATE_MEDIATOR_OUTPUT_CONNECTOR = 113;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Iterate Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractCommonTargetImpl <em>Abstract Common Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractCommonTargetImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractCommonTarget()
	 * @generated
	 */
	int ABSTRACT_COMMON_TARGET = 115;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__SEQUENCE = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__SEQUENCE_KEY = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE = ESB_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__ENDPOINT = ESB_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__ENDPOINT_KEY = ESB_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Common Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateTargetImpl <em>Iterate Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateTargetImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateTarget()
	 * @generated
	 */
	int ITERATE_TARGET = 114;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE_TYPE = ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE = ABSTRACT_COMMON_TARGET__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE_KEY = ABSTRACT_COMMON_TARGET__SEQUENCE_KEY;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT_TYPE = ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT = ABSTRACT_COMMON_TARGET__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT_KEY = ABSTRACT_COMMON_TARGET__ENDPOINT_KEY;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SOAP_ACTION = ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__TO_ADDRESS = ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterate Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET_FEATURE_COUNT = ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorSequenceImpl <em>Mediator Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorSequenceImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMediatorSequence()
	 * @generated
	 */
	int MEDIATOR_SEQUENCE = 116;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__ANONYMOUS = ESB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__SEQUENCE_NAME = ESB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mediators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__MEDIATORS = ESB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__ON_ERROR = ESB_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__DESCRIPTION = ESB_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mediator Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE_FEATURE_COUNT = ESB_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorImpl <em>Cache Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediator()
	 * @generated
	 */
	int CACHE_MEDIATOR = 117;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Cache Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_ID = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_SCOPE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cache Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_ACTION = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hash Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__HASH_GENERATOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cache Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_TIMEOUT = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__MAX_MESSAGE_SIZE = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__IMPLEMENTATION_TYPE = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Entry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__MAX_ENTRY_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>On Hit Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__ON_HIT_BRANCH = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Cache Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorInputConnectorImpl <em>Cache Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediatorInputConnector()
	 * @generated
	 */
	int CACHE_MEDIATOR_INPUT_CONNECTOR = 118;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Cache Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorOutputConnectorImpl <em>Cache Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediatorOutputConnector()
	 * @generated
	 */
	int CACHE_MEDIATOR_OUTPUT_CONNECTOR = 119;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Cache Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl <em>Cache On Hit Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheOnHitBranch()
	 * @generated
	 */
	int CACHE_ON_HIT_BRANCH = 120;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__SEQUENCE_KEY = 1;

	/**
	 * The number of structural features of the '<em>Cache On Hit Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorImpl <em>XQuery Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediator()
	 * @generated
	 */
	int XQUERY_MEDIATOR = 121;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__VARIABLES = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__TARGET_XPATH = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Script Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__SCRIPT_KEY_TYPE = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Script Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__STATIC_SCRIPT_KEY = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dynamic Script Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__DYNAMIC_SCRIPT_KEY = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Query Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__QUERY_KEY = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>XQuery Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorInputConnectorImpl <em>XQuery Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediatorInputConnector()
	 * @generated
	 */
	int XQUERY_MEDIATOR_INPUT_CONNECTOR = 122;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>XQuery Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorOutputConnectorImpl <em>XQuery Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediatorOutputConnector()
	 * @generated
	 */
	int XQUERY_MEDIATOR_OUTPUT_CONNECTOR = 123;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>XQuery Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryVariableImpl <em>XQuery Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryVariableImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariable()
	 * @generated
	 */
	int XQUERY_VARIABLE = 124;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VARIABLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_KEY = 5;

	/**
	 * The number of structural features of the '<em>XQuery Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl <em>Callout Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediator()
	 * @generated
	 */
	int CALLOUT_MEDIATOR = 125;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__SERVICE_URL = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__SOAP_ACTION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path To Axis2xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PATH_TO_AXIS2XML = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path To Axis2 Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payload Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_TYPE = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payload Message Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payload Registry Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_TYPE = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Result Message Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result Context Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pass Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PASS_HEADERS = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Callout Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorInputConnectorImpl <em>Callout Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediatorInputConnector()
	 * @generated
	 */
	int CALLOUT_MEDIATOR_INPUT_CONNECTOR = 126;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Callout Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorOutputConnectorImpl <em>Callout Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediatorOutputConnector()
	 * @generated
	 */
	int CALLOUT_MEDIATOR_OUTPUT_CONNECTOR = 127;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Callout Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorImpl <em>RM Sequence Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediator()
	 * @generated
	 */
	int RM_SEQUENCE_MEDIATOR = 128;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Rm Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__CORRELATION_XPATH = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Message Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__LAST_MESSAGE_XPATH = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>RM Sequence Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorInputConnectorImpl <em>RM Sequence Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediatorInputConnector()
	 * @generated
	 */
	int RM_SEQUENCE_MEDIATOR_INPUT_CONNECTOR = 129;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>RM Sequence Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorOutputConnectorImpl <em>RM Sequence Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediatorOutputConnector()
	 * @generated
	 */
	int RM_SEQUENCE_MEDIATOR_OUTPUT_CONNECTOR = 130;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>RM Sequence Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorImpl <em>Transaction Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediator()
	 * @generated
	 */
	int TRANSACTION_MEDIATOR = 131;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__ACTION = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transaction Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorInputConnectorImpl <em>Transaction Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediatorInputConnector()
	 * @generated
	 */
	int TRANSACTION_MEDIATOR_INPUT_CONNECTOR = 132;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Transaction Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorOutputConnectorImpl <em>Transaction Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediatorOutputConnector()
	 * @generated
	 */
	int TRANSACTION_MEDIATOR_OUTPUT_CONNECTOR = 133;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Transaction Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorImpl <em>OAuth Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediator()
	 * @generated
	 */
	int OAUTH_MEDIATOR = 134;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Remote Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__REMOTE_SERVICE_URL = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OAuth Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorInputConnectorImpl <em>OAuth Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediatorInputConnector()
	 * @generated
	 */
	int OAUTH_MEDIATOR_INPUT_CONNECTOR = 135;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>OAuth Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorOutputConnectorImpl <em>OAuth Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediatorOutputConnector()
	 * @generated
	 */
	int OAUTH_MEDIATOR_OUTPUT_CONNECTOR = 136;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>OAuth Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleInMediatorImpl <em>Autoscale In Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleInMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAutoscaleInMediator()
	 * @generated
	 */
	int AUTOSCALE_IN_MEDIATOR = 137;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The number of structural features of the '<em>Autoscale In Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleOutMediatorImpl <em>Autoscale Out Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleOutMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAutoscaleOutMediator()
	 * @generated
	 */
	int AUTOSCALE_OUT_MEDIATOR = 138;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The number of structural features of the '<em>Autoscale Out Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorImpl <em>Header Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediator()
	 * @generated
	 */
	int HEADER_MEDIATOR = 139;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Header Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__HEADER_NAME = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__HEADER_ACTION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_TYPE = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_LITERAL = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_EXPRESSION = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Header Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorInputConnectorImpl <em>Header Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediatorInputConnector()
	 * @generated
	 */
	int HEADER_MEDIATOR_INPUT_CONNECTOR = 140;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Header Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorOutputConnectorImpl <em>Header Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediatorOutputConnector()
	 * @generated
	 */
	int HEADER_MEDIATOR_OUTPUT_CONNECTOR = 141;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Header Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl <em>Throttle Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediator()
	 * @generated
	 */
	int THROTTLE_MEDIATOR = 142;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__GROUP_ID = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__POLICY_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Accept Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Reject Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__ON_REJECT_BRANCH = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Throttle Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorInputConnectorImpl <em>Throttle Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediatorInputConnector()
	 * @generated
	 */
	int THROTTLE_MEDIATOR_INPUT_CONNECTOR = 143;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Throttle Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorOutputConnectorImpl <em>Throttle Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediatorOutputConnector()
	 * @generated
	 */
	int THROTTLE_MEDIATOR_OUTPUT_CONNECTOR = 144;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Throttle Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyConfigurationImpl <em>Throttle Policy Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyConfiguration()
	 * @generated
	 */
	int THROTTLE_POLICY_CONFIGURATION = 145;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Max Concurrent Access Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__MAX_CONCURRENT_ACCESS_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Policy Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_ENTRIES = 3;

	/**
	 * The number of structural features of the '<em>Throttle Policy Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyEntryImpl <em>Throttle Policy Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyEntryImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyEntry()
	 * @generated
	 */
	int THROTTLE_POLICY_ENTRY = 146;

	/**
	 * The feature id for the '<em><b>Throttle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__THROTTLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Throttle Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__THROTTLE_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__ACCESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Max Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__MAX_REQUEST_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Unit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__UNIT_TIME = 4;

	/**
	 * The feature id for the '<em><b>Prohibit Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__PROHIBIT_PERIOD = 5;

	/**
	 * The number of structural features of the '<em>Throttle Policy Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnAcceptBranchImpl <em>Throttle On Accept Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnAcceptBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleOnAcceptBranch()
	 * @generated
	 */
	int THROTTLE_ON_ACCEPT_BRANCH = 147;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_KEY = 1;

	/**
	 * The number of structural features of the '<em>Throttle On Accept Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnRejectBranchImpl <em>Throttle On Reject Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnRejectBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleOnRejectBranch()
	 * @generated
	 */
	int THROTTLE_ON_REJECT_BRANCH = 148;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__SEQUENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__SEQUENCE_KEY = 1;

	/**
	 * The number of structural features of the '<em>Throttle On Reject Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorImpl <em>Command Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediator()
	 * @generated
	 */
	int COMMAND_MEDIATOR = 149;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__CLASS_NAME = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__PROPERTIES = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Command Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorInputConnectorImpl <em>Command Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediatorInputConnector()
	 * @generated
	 */
	int COMMAND_MEDIATOR_INPUT_CONNECTOR = 150;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Command Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorOutputConnectorImpl <em>Command Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediatorOutputConnector()
	 * @generated
	 */
	int COMMAND_MEDIATOR_OUTPUT_CONNECTOR = 151;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Command Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandPropertyImpl <em>Command Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandProperty()
	 * @generated
	 */
	int COMMAND_PROPERTY = 152;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value Context Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_CONTEXT_PROPERTY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Value Message Element Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_MESSAGE_ELEMENT_XPATH = 4;

	/**
	 * The feature id for the '<em><b>Context Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__CONTEXT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Message Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__MESSAGE_ACTION = 6;

	/**
	 * The number of structural features of the '<em>Command Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractSqlExecutorMediatorImpl <em>Abstract Sql Executor Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractSqlExecutorMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractSqlExecutorMediator()
	 * @generated
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR = 153;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT = MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION = MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE = MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE = MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT = MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE = MEDIATOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS = MEDIATOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW = MEDIATOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE = MEDIATOR_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY = MEDIATOR_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE = MEDIATOR_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS = MEDIATOR_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Abstract Sql Executor Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlStatementImpl <em>Sql Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlStatementImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlStatement()
	 * @generated
	 */
	int SQL_STATEMENT = 154;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__QUERY_STRING = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Results Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__RESULTS_ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Sql Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlParameterDefinitionImpl <em>Sql Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlParameterDefinitionImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterDefinition()
	 * @generated
	 */
	int SQL_PARAMETER_DEFINITION = 155;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Sql Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlResultMappingImpl <em>Sql Result Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlResultMappingImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlResultMapping()
	 * @generated
	 */
	int SQL_RESULT_MAPPING = 156;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__COLUMN_ID = 1;

	/**
	 * The number of structural features of the '<em>Sql Result Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorImpl <em>DB Lookup Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediator()
	 * @generated
	 */
	int DB_LOOKUP_MEDIATOR = 157;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__REVERSE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DB_DRIVER = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_NAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_URL = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_USERNAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_PASSWORD = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_AUTOCOMMIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_ISOLATION = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXACTIVE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXWAIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MINIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_POOLSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_TESTONBORROW = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_TESTWHILEIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_VALIDATIONQUERY = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_INITIALSIZE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__SQL_STATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__INPUT_CONNECTOR = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__OUTPUT_CONNECTOR = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DB Lookup Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_FEATURE_COUNT = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorInputConnectorImpl <em>DB Lookup Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediatorInputConnector()
	 * @generated
	 */
	int DB_LOOKUP_MEDIATOR_INPUT_CONNECTOR = 158;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>DB Lookup Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorOutputConnectorImpl <em>DB Lookup Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediatorOutputConnector()
	 * @generated
	 */
	int DB_LOOKUP_MEDIATOR_OUTPUT_CONNECTOR = 159;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>DB Lookup Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorImpl <em>DB Report Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediator()
	 * @generated
	 */
	int DB_REPORT_MEDIATOR = 160;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__REVERSE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DB_DRIVER = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_NAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_URL = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_USERNAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_PASSWORD = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_AUTOCOMMIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_ISOLATION = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXACTIVE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXWAIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MINIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_POOLSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_TESTONBORROW = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_TESTWHILEIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_VALIDATIONQUERY = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_INITIALSIZE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__SQL_STATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Connection Use Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__INPUT_CONNECTOR = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__OUTPUT_CONNECTOR = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DB Report Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_FEATURE_COUNT = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorInputConnectorImpl <em>DB Report Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediatorInputConnector()
	 * @generated
	 */
	int DB_REPORT_MEDIATOR_INPUT_CONNECTOR = 161;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>DB Report Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorOutputConnectorImpl <em>DB Report Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediatorOutputConnector()
	 * @generated
	 */
	int DB_REPORT_MEDIATOR_OUTPUT_CONNECTOR = 162;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>DB Report Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl <em>Rule Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediator()
	 * @generated
	 */
	int RULE_MEDIATOR = 163;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Rule Set Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RULE_SET_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Session Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RULE_SESSION_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facts Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__FACTS_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Results Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RESULTS_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Mediators Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorInputConnectorImpl <em>Rule Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediatorInputConnector()
	 * @generated
	 */
	int RULE_MEDIATOR_INPUT_CONNECTOR = 164;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Rule Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorOutputConnectorImpl <em>Rule Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediatorOutputConnector()
	 * @generated
	 */
	int RULE_MEDIATOR_OUTPUT_CONNECTOR = 165;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Rule Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl <em>Rule Set Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSetConfiguration()
	 * @generated
	 */
	int RULE_SET_CONFIGURATION = 166;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Source Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_KEY = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Rule Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetCreationPropertyImpl <em>Rule Set Creation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetCreationPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSetCreationProperty()
	 * @generated
	 */
	int RULE_SET_CREATION_PROPERTY = 167;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Rule Set Creation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionConfigurationImpl <em>Rule Session Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSessionConfiguration()
	 * @generated
	 */
	int RULE_SESSION_CONFIGURATION = 168;

	/**
	 * The feature id for the '<em><b>Stateful Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__STATEFUL_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Rule Session Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionPropertyImpl <em>Rule Session Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionPropertyImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSessionProperty()
	 * @generated
	 */
	int RULE_SESSION_PROPERTY = 169;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Rule Session Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactsConfigurationImpl <em>Rule Facts Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactsConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactsConfiguration()
	 * @generated
	 */
	int RULE_FACTS_CONFIGURATION = 170;

	/**
	 * The feature id for the '<em><b>Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__FACTS = 0;

	/**
	 * The number of structural features of the '<em>Rule Facts Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactImpl <em>Rule Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFact()
	 * @generated
	 */
	int RULE_FACT = 171;

	/**
	 * The feature id for the '<em><b>Fact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Fact Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_CUSTOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Fact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_KEY = 6;

	/**
	 * The number of structural features of the '<em>Rule Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultsConfigurationImpl <em>Rule Results Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultsConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultsConfiguration()
	 * @generated
	 */
	int RULE_RESULTS_CONFIGURATION = 172;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__RESULTS = 0;

	/**
	 * The number of structural features of the '<em>Rule Results Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultImpl <em>Rule Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResult()
	 * @generated
	 */
	int RULE_RESULT = 173;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Result Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_CUSTOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_KEY = 6;

	/**
	 * The number of structural features of the '<em>Rule Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleChildMediatorsConfigurationImpl <em>Rule Child Mediators Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleChildMediatorsConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleChildMediatorsConfiguration()
	 * @generated
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION = 174;

	/**
	 * The number of structural features of the '<em>Rule Child Mediators Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl <em>Smooks Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediator()
	 * @generated
	 */
	int SMOOKS_MEDIATOR = 175;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__CONFIGURATION_KEY = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__INPUT = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__OUTPUT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Smooks Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorInputConnectorImpl <em>Smooks Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediatorInputConnector()
	 * @generated
	 */
	int SMOOKS_MEDIATOR_INPUT_CONNECTOR = 176;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Smooks Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorOutputConnectorImpl <em>Smooks Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediatorOutputConnector()
	 * @generated
	 */
	int SMOOKS_MEDIATOR_OUTPUT_CONNECTOR = 177;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Smooks Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksInConfigurationImpl <em>Smooks In Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksInConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksInConfiguration()
	 * @generated
	 */
	int SMOOKS_IN_CONFIGURATION = 178;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Smooks In Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl <em>Smooks Out Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksOutConfiguration()
	 * @generated
	 */
	int SMOOKS_OUT_CONFIGURATION = 179;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Output Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD = 4;

	/**
	 * The number of structural features of the '<em>Smooks Out Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl <em>Store Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getStoreMediator()
	 * @generated
	 */
	int STORE_MEDIATOR = 180;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Message Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MEDIATOR__MESSAGE_STORE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Store Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MEDIATOR__ON_STORE_SEQUENCE = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Store Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl <em>Conditional Route Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getConditionalRouteBranch()
	 * @generated
	 */
	int CONDITIONAL_ROUTE_BRANCH = 181;

	/**
	 * The feature id for the '<em><b>Break Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE = 0;

	/**
	 * The number of structural features of the '<em>Conditional Route Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE_BRANCH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl <em>Conditional Router Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getConditionalRouterMediator()
	 * @generated
	 */
	int CONDITIONAL_ROUTER_MEDIATOR = 182;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTER_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>Continue Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditional Route Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Router Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTER_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl <em>Send Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediator()
	 * @generated
	 */
	int SEND_MEDIATOR = 183;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__REVERSE = MEDIATOR__REVERSE;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__END_POINT = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__INPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__OUTPUT_CONNECTOR = MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receiving Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE = MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Static Receiving Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE = MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dynamic Receiving Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE = MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Send Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorInputConnectorImpl <em>Send Mediator Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediatorInputConnector()
	 * @generated
	 */
	int SEND_MEDIATOR_INPUT_CONNECTOR = 184;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Send Mediator Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorOutputConnectorImpl <em>Send Mediator Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediatorOutputConnector()
	 * @generated
	 */
	int SEND_MEDIATOR_OUTPUT_CONNECTOR = 185;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Send Mediator Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ParentEndPointImpl <em>Parent End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ParentEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getParentEndPoint()
	 * @generated
	 */
	int PARENT_END_POINT = 190;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__END_POINT_NAME = END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__ANONYMOUS = END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__CHILDREN = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointImpl <em>Failover End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPoint()
	 * @generated
	 */
	int FAILOVER_END_POINT = 186;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__END_POINT_NAME = PARENT_END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__ANONYMOUS = PARENT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__CHILDREN = PARENT_END_POINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__INPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__OUTPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>West Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__WEST_OUTPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failover End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_FEATURE_COUNT = PARENT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointInputConnectorImpl <em>Failover End Point Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointInputConnector()
	 * @generated
	 */
	int FAILOVER_END_POINT_INPUT_CONNECTOR = 187;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Failover End Point Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointOutputConnectorImpl <em>Failover End Point Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointOutputConnector()
	 * @generated
	 */
	int FAILOVER_END_POINT_OUTPUT_CONNECTOR = 188;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Failover End Point Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointWestOutputConnectorImpl <em>Failover End Point West Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointWestOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointWestOutputConnector()
	 * @generated
	 */
	int FAILOVER_END_POINT_WEST_OUTPUT_CONNECTOR = 189;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_WEST_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Failover End Point West Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_WEST_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointImpl <em>WSDL End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPoint()
	 * @generated
	 */
	int WSDL_END_POINT = 191;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__END_POINT_NAME = ABSTRACT_END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ANONYMOUS = ABSTRACT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SECURITY_ENABLED = ABSTRACT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_ENABLED = ABSTRACT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_VERSION = ABSTRACT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__TIME_OUT_DURATION = ABSTRACT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__TIME_OUT_ACTION = ABSTRACT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_ERROR_CODES = ABSTRACT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_COUNT = ABSTRACT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_DELAY = ABSTRACT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SECURITY_POLICY = ABSTRACT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>WSDL Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_DEFINITION = ABSTRACT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>WSDL Description</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_DESCRIPTION = ABSTRACT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__INPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__OUTPUT_CONNECTOR = ABSTRACT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wsdl Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_URI = ABSTRACT_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SERVICE = ABSTRACT_END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__PORT = ABSTRACT_END_POINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>WSDL End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_FEATURE_COUNT = ABSTRACT_END_POINT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDefinitionImpl <em>WSDL Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDefinitionImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLDefinition()
	 * @generated
	 */
	int WSDL_DEFINITION = 192;

	/**
	 * The number of structural features of the '<em>WSDL Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDescriptionImpl <em>WSDL Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDescriptionImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLDescription()
	 * @generated
	 */
	int WSDL_DESCRIPTION = 193;

	/**
	 * The number of structural features of the '<em>WSDL Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointInputConnectorImpl <em>WSDL End Point Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPointInputConnector()
	 * @generated
	 */
	int WSDL_END_POINT_INPUT_CONNECTOR = 194;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>WSDL End Point Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointOutputConnectorImpl <em>WSDL End Point Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPointOutputConnector()
	 * @generated
	 */
	int WSDL_END_POINT_OUTPUT_CONNECTOR = 195;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>WSDL End Point Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl <em>Load Balance End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPoint()
	 * @generated
	 */
	int LOAD_BALANCE_END_POINT = 196;

	/**
	 * The feature id for the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__END_POINT_NAME = PARENT_END_POINT__END_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__ANONYMOUS = PARENT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__CHILDREN = PARENT_END_POINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__SESSION = PARENT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__FAILOVER = PARENT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__POLICY = PARENT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__INPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>West Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR = PARENT_END_POINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Load Balance End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_FEATURE_COUNT = PARENT_END_POINT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointInputConnectorImpl <em>Load Balance End Point Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointInputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointInputConnector()
	 * @generated
	 */
	int LOAD_BALANCE_END_POINT_INPUT_CONNECTOR = 197;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_INPUT_CONNECTOR__INCOMING_LINKS = INPUT_CONNECTOR__INCOMING_LINKS;

	/**
	 * The number of structural features of the '<em>Load Balance End Point Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_INPUT_CONNECTOR_FEATURE_COUNT = INPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointOutputConnectorImpl <em>Load Balance End Point Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointOutputConnector()
	 * @generated
	 */
	int LOAD_BALANCE_END_POINT_OUTPUT_CONNECTOR = 198;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Load Balance End Point Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointWestOutputConnectorImpl <em>Load Balance End Point West Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointWestOutputConnectorImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointWestOutputConnector()
	 * @generated
	 */
	int LOAD_BALANCE_END_POINT_WEST_OUTPUT_CONNECTOR = 199;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_WEST_OUTPUT_CONNECTOR__OUTGOING_LINK = OUTPUT_CONNECTOR__OUTGOING_LINK;

	/**
	 * The number of structural features of the '<em>Load Balance End Point West Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_WEST_OUTPUT_CONNECTOR_FEATURE_COUNT = OUTPUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LocalEntryImpl <em>Local Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LocalEntryImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLocalEntry()
	 * @generated
	 */
	int LOCAL_ENTRY = 200;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__ENTRY_NAME = ESB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_TYPE = ESB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_LITERAL = ESB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_XML = ESB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_URL = ESB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Local Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY_FEATURE_COUNT = ESB_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SessionImpl
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 201;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyWsdlType()
	 * @generated
	 */
	int PROXY_WSDL_TYPE = 202;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType <em>Filter Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterConditionType()
	 * @generated
	 */
	int FILTER_CONDITION_TYPE = 203;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogCategory <em>Log Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogCategory
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogCategory()
	 * @generated
	 */
	int LOG_CATEGORY = 204;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogLevel <em>Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogLevel
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogLevel()
	 * @generated
	 */
	int LOG_LEVEL = 205;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointAddressingVersion()
	 * @generated
	 */
	int END_POINT_ADDRESSING_VERSION = 206;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointTimeOutAction()
	 * @generated
	 */
	int END_POINT_TIME_OUT_ACTION = 207;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat <em>End Point Message Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointMessageFormat()
	 * @generated
	 */
	int END_POINT_MESSAGE_FORMAT = 208;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointAttachmentOptimization()
	 * @generated
	 */
	int END_POINT_ATTACHMENT_OPTIMIZATION = 209;


	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType <em>Property Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyDataType()
	 * @generated
	 */
	int PROPERTY_DATA_TYPE = 210;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction <em>Property Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyAction()
	 * @generated
	 */
	int PROPERTY_ACTION = 211;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope <em>Property Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyScope()
	 * @generated
	 */
	int PROPERTY_SCOPE = 212;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType <em>Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyValueType()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE = 213;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType <em>Enrich Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichSourceType()
	 * @generated
	 */
	int ENRICH_SOURCE_TYPE = 214;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction <em>Enrich Target Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichTargetAction()
	 * @generated
	 */
	int ENRICH_TARGET_ACTION = 215;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType <em>Enrich Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichTargetType()
	 * @generated
	 */
	int ENRICH_TARGET_TYPE = 216;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType <em>Event Topic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventTopicType()
	 * @generated
	 */
	int EVENT_TOPIC_TYPE = 217;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptType <em>Script Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 218;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage <em>Script Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptLanguage()
	 * @generated
	 */
	int SCRIPT_LANGUAGE = 219;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion <em>Fault Soap Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultSoapVersion()
	 * @generated
	 */
	int FAULT_SOAP_VERSION = 220;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11 <em>Fault Code Soap11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultCodeSoap11()
	 * @generated
	 */
	int FAULT_CODE_SOAP11 = 221;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12 <em>Fault Code Soap12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultCodeSoap12()
	 * @generated
	 */
	int FAULT_CODE_SOAP12 = 222;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType <em>Fault String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultStringType()
	 * @generated
	 */
	int FAULT_STRING_TYPE = 223;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType <em>Fault Reason Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultReasonType()
	 * @generated
	 */
	int FAULT_REASON_TYPE = 224;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType <em>Fault Detail Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultDetailType()
	 * @generated
	 */
	int FAULT_DETAIL_TYPE = 225;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType <em>Aggregate Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateSequenceType()
	 * @generated
	 */
	int AGGREGATE_SEQUENCE_TYPE = 226;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType <em>Target Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTargetSequenceType()
	 * @generated
	 */
	int TARGET_SEQUENCE_TYPE = 227;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType <em>Target Endpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTargetEndpointType()
	 * @generated
	 */
	int TARGET_ENDPOINT_TYPE = 228;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType <em>Cache Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheSequenceType()
	 * @generated
	 */
	int CACHE_SEQUENCE_TYPE = 229;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType <em>Cache Implementation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheImplementationType()
	 * @generated
	 */
	int CACHE_IMPLEMENTATION_TYPE = 230;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheAction <em>Cache Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheAction()
	 * @generated
	 */
	int CACHE_ACTION = 231;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheScope <em>Cache Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheScope
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheScope()
	 * @generated
	 */
	int CACHE_SCOPE = 232;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType <em>XQuery Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariableType()
	 * @generated
	 */
	int XQUERY_VARIABLE_TYPE = 233;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType <em>XQuery Variable Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariableValueType()
	 * @generated
	 */
	int XQUERY_VARIABLE_VALUE_TYPE = 234;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType <em>Callout Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutPayloadType()
	 * @generated
	 */
	int CALLOUT_PAYLOAD_TYPE = 235;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType <em>Callout Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutResultType()
	 * @generated
	 */
	int CALLOUT_RESULT_TYPE = 236;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion <em>RM Spec Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSpecVersion()
	 * @generated
	 */
	int RM_SPEC_VERSION = 237;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType <em>RM Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceType()
	 * @generated
	 */
	int RM_SEQUENCE_TYPE = 238;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction <em>Transaction Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionAction()
	 * @generated
	 */
	int TRANSACTION_ACTION = 239;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction <em>Header Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderAction()
	 * @generated
	 */
	int HEADER_ACTION = 240;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType <em>Header Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderValueType()
	 * @generated
	 */
	int HEADER_VALUE_TYPE = 241;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType <em>Throttle Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyType()
	 * @generated
	 */
	int THROTTLE_POLICY_TYPE = 242;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType <em>Throttle Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleConditionType()
	 * @generated
	 */
	int THROTTLE_CONDITION_TYPE = 243;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType <em>Throttle Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleAccessType()
	 * @generated
	 */
	int THROTTLE_ACCESS_TYPE = 244;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType <em>Throttle Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleSequenceType()
	 * @generated
	 */
	int THROTTLE_SEQUENCE_TYPE = 245;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType <em>Command Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyValueType()
	 * @generated
	 */
	int COMMAND_PROPERTY_VALUE_TYPE = 246;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction <em>Command Property Message Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyMessageAction()
	 * @generated
	 */
	int COMMAND_PROPERTY_MESSAGE_ACTION = 247;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction <em>Command Property Context Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyContextAction()
	 * @generated
	 */
	int COMMAND_PROPERTY_CONTEXT_ACTION = 248;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorConnectionType()
	 * @generated
	 */
	int SQL_EXECUTOR_CONNECTION_TYPE = 249;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorDatasourceType()
	 * @generated
	 */
	int SQL_EXECUTOR_DATASOURCE_TYPE = 250;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorBooleanValue()
	 * @generated
	 */
	int SQL_EXECUTOR_BOOLEAN_VALUE = 251;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorIsolationLevel()
	 * @generated
	 */
	int SQL_EXECUTOR_ISOLATION_LEVEL = 252;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType <em>Sql Parameter Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterValueType()
	 * @generated
	 */
	int SQL_PARAMETER_VALUE_TYPE = 253;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType <em>Sql Parameter Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterDataType()
	 * @generated
	 */
	int SQL_PARAMETER_DATA_TYPE = 254;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType <em>Rule Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSourceType()
	 * @generated
	 */
	int RULE_SOURCE_TYPE = 255;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType <em>Rule Fact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactType()
	 * @generated
	 */
	int RULE_FACT_TYPE = 256;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType <em>Rule Fact Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactValueType()
	 * @generated
	 */
	int RULE_FACT_VALUE_TYPE = 257;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType <em>Rule Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultType()
	 * @generated
	 */
	int RULE_RESULT_TYPE = 258;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType <em>Rule Result Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultValueType()
	 * @generated
	 */
	int RULE_RESULT_VALUE_TYPE = 259;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType <em>Smooks IO Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksIODataType()
	 * @generated
	 */
	int SMOOKS_IO_DATA_TYPE = 260;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction <em>Expression Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getExpressionAction()
	 * @generated
	 */
	int EXPRESSION_ACTION = 261;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod <em>Output Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOutputMethod()
	 * @generated
	 */
	int OUTPUT_METHOD = 262;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType <em>Receiving Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getReceivingSequenceType()
	 * @generated
	 */
	int RECEIVING_SEQUENCE_TYPE = 263;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.KeyType <em>Key Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.KeyType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 264;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Type
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 265;

	/**
	 * The meta object id for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType <em>Local Entry Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLocalEntryValueType()
	 * @generated
	 */
	int LOCAL_ENTRY_VALUE_TYPE = 266;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 267;


	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram
	 * @generated
	 */
	EClass getEsbDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram#getServer()
	 * @see #getEsbDiagram()
	 * @generated
	 */
	EReference getEsbDiagram_Server();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram#getTest()
	 * @see #getEsbDiagram()
	 * @generated
	 */
	EAttribute getEsbDiagram_Test();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbNode
	 * @generated
	 */
	EClass getEsbNode();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbElement
	 * @generated
	 */
	EClass getEsbElement();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbServer
	 * @generated
	 */
	EClass getEsbServer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbServer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbServer#getChildren()
	 * @see #getEsbServer()
	 * @generated
	 */
	EReference getEsbServer_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbServer#getMessageMediator <em>Message Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbServer#getMessageMediator()
	 * @see #getEsbServer()
	 * @generated
	 */
	EReference getEsbServer_MessageMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.Mediator#isReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Mediator#isReverse()
	 * @see #getMediator()
	 * @generated
	 */
	EAttribute getMediator_Reverse();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbConnector
	 * @generated
	 */
	EClass getEsbConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.InputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.InputConnector
	 * @generated
	 */
	EClass getInputConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.InputConnector#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.InputConnector#getIncomingLinks()
	 * @see #getInputConnector()
	 * @generated
	 */
	EReference getInputConnector_IncomingLinks();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector
	 * @generated
	 */
	EClass getOutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector#getOutgoingLink <em>Outgoing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing Link</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector#getOutgoingLink()
	 * @see #getOutputConnector()
	 * @generated
	 */
	EReference getOutputConnector_OutgoingLink();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector <em>Additional Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector
	 * @generated
	 */
	EClass getAdditionalOutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector#getOutgoingLink <em>Outgoing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing Link</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector#getOutgoingLink()
	 * @see #getAdditionalOutputConnector()
	 * @generated
	 */
	EReference getAdditionalOutputConnector_OutgoingLink();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbLink
	 * @generated
	 */
	EClass getEsbLink();

	/**
	 * Returns the meta object for the container reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbLink#getSource()
	 * @see #getEsbLink()
	 * @generated
	 */
	EReference getEsbLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbLink#getTarget()
	 * @see #getEsbLink()
	 * @generated
	 */
	EReference getEsbLink_Target();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#getEndPointName <em>End Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#getEndPointName()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_EndPointName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isAnonymous()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Anonymous();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService <em>Proxy Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService
	 * @generated
	 */
	EClass getProxyService();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getOutputConnector()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_OutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getInputConnector()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_InputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getName()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getPinnedServers <em>Pinned Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinned Servers</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getPinnedServers()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_PinnedServers();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServiceGroup <em>Service Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Group</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServiceGroup()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_ServiceGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isTraceEnabled <em>Trace Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isTraceEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_TraceEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isStatisticsEnabled <em>Statistics Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statistics Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isStatisticsEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_StatisticsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getTransports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transports</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getTransports()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_Transports();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliable Messaging Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isReliableMessagingEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_ReliableMessagingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isSecurityEnabled <em>Security Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#isSecurityEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_SecurityEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlType <em>Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlType()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_WsdlType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlXML <em>Wsdl XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl XML</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlXML()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_WsdlXML();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlURL <em>Wsdl URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl URL</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlURL()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_WsdlURL();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlKey <em>Wsdl Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getWsdlKey()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_WsdlKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServiceParameters <em>Service Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Parameters</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServiceParameters()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_ServiceParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServicePolicies <em>Service Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Policies</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getServicePolicies()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_ServicePolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getSequenceContainer <em>Sequence Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Container</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getSequenceContainer()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_SequenceContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getEndpointContainer <em>Endpoint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Container</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyService#getEndpointContainer()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_EndpointContainer();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyOutputConnector <em>Proxy Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyOutputConnector
	 * @generated
	 */
	EClass getProxyOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyInputConnector <em>Proxy Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyInputConnector
	 * @generated
	 */
	EClass getProxyInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter <em>Proxy Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Parameter</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter
	 * @generated
	 */
	EClass getProxyServiceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter#getName()
	 * @see #getProxyServiceParameter()
	 * @generated
	 */
	EAttribute getProxyServiceParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter#getValue()
	 * @see #getProxyServiceParameter()
	 * @generated
	 */
	EAttribute getProxyServiceParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServicePolicy <em>Proxy Service Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Policy</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServicePolicy
	 * @generated
	 */
	EClass getProxyServicePolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServicePolicy#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServicePolicy#getPolicyKey()
	 * @see #getProxyServicePolicy()
	 * @generated
	 */
	EReference getProxyServicePolicy_PolicyKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceInSequence <em>Proxy Service In Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service In Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceInSequence
	 * @generated
	 */
	EClass getProxyServiceInSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceInSequence#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceInSequence#getChildren()
	 * @see #getProxyServiceInSequence()
	 * @generated
	 */
	EReference getProxyServiceInSequence_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceOutSequence <em>Proxy Service Out Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Out Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceOutSequence
	 * @generated
	 */
	EClass getProxyServiceOutSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceOutSequence#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceOutSequence#getChildren()
	 * @see #getProxyServiceOutSequence()
	 * @generated
	 */
	EReference getProxyServiceOutSequence_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer <em>Proxy Service Sequence Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Sequence Container</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer
	 * @generated
	 */
	EClass getProxyServiceSequenceContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer#getInSequence <em>In Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer#getInSequence()
	 * @see #getProxyServiceSequenceContainer()
	 * @generated
	 */
	EReference getProxyServiceSequenceContainer_InSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer#getOutSequence <em>Out Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceContainer#getOutSequence()
	 * @see #getProxyServiceSequenceContainer()
	 * @generated
	 */
	EReference getProxyServiceSequenceContainer_OutSequence();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer <em>Proxy Service Endpoint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Endpoint Container</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer
	 * @generated
	 */
	EClass getProxyServiceEndpointContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceEndpointContainer#getChildren()
	 * @see #getProxyServiceEndpointContainer()
	 * @generated
	 */
	EReference getProxyServiceEndpointContainer_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint <em>Abstract End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint
	 * @generated
	 */
	EClass getAbstractEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliable Messaging Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isReliableMessagingEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_ReliableMessagingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isSecurityEnabled <em>Security Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isSecurityEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_SecurityEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isAddressingEnabled <em>Addressing Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isAddressingEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_AddressingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getAddressingVersion <em>Addressing Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getAddressingVersion()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_AddressingVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isAddressingSeparateListener <em>Addressing Separate Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Separate Listener</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#isAddressingSeparateListener()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_AddressingSeparateListener();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getTimeOutDuration <em>Time Out Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out Duration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getTimeOutDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_TimeOutDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getTimeOutAction <em>Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getTimeOutAction()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_TimeOutAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryErrorCodes <em>Retry Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Error Codes</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryErrorCodes()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_RetryErrorCodes();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryCount <em>Retry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Count</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryCount()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_RetryCount();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryDelay <em>Retry Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Delay</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getRetryDelay()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_RetryDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendErrorCodes <em>Suspend Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Error Codes</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendErrorCodes()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_SuspendErrorCodes();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendInitialDuration <em>Suspend Initial Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Initial Duration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendInitialDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_SuspendInitialDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendMaximumDuration <em>Suspend Maximum Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Maximum Duration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendMaximumDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_SuspendMaximumDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendProgressionFactor <em>Suspend Progression Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Progression Factor</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSuspendProgressionFactor()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EAttribute getAbstractEndPoint_SuspendProgressionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getReliableMessagingPolicy <em>Reliable Messaging Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reliable Messaging Policy</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getReliableMessagingPolicy()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EReference getAbstractEndPoint_ReliableMessagingPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSecurityPolicy <em>Security Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Policy</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint#getSecurityPolicy()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
	EReference getAbstractEndPoint_SecurityPolicy();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator <em>Message Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator
	 * @generated
	 */
	EClass getMessageMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator#getInputConnector()
	 * @see #getMessageMediator()
	 * @generated
	 */
	EReference getMessageMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator#getOutputConnector()
	 * @see #getMessageMediator()
	 * @generated
	 */
	EReference getMessageMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MessageInputConnector <em>Message Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MessageInputConnector
	 * @generated
	 */
	EClass getMessageInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MessageOutputConnector <em>Message Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MessageOutputConnector
	 * @generated
	 */
	EClass getMessageOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint <em>Default End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint
	 * @generated
	 */
	EClass getDefaultEndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint#getInputConnector()
	 * @see #getDefaultEndPoint()
	 * @generated
	 */
	EReference getDefaultEndPoint_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint#getOutputConnector()
	 * @see #getDefaultEndPoint()
	 * @generated
	 */
	EReference getDefaultEndPoint_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPointInputConnector <em>Default End Point Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default End Point Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPointInputConnector
	 * @generated
	 */
	EClass getDefaultEndPointInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPointOutputConnector <em>Default End Point Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default End Point Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPointOutputConnector
	 * @generated
	 */
	EClass getDefaultEndPointOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint <em>Address End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint
	 * @generated
	 */
	EClass getAddressEndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getInputConnector()
	 * @see #getAddressEndPoint()
	 * @generated
	 */
	EReference getAddressEndPoint_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getOutputConnector()
	 * @see #getAddressEndPoint()
	 * @generated
	 */
	EReference getAddressEndPoint_OutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint#getURI()
	 * @see #getAddressEndPoint()
	 * @generated
	 */
	EAttribute getAddressEndPoint_URI();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPointInputConnector <em>Address End Point Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address End Point Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPointInputConnector
	 * @generated
	 */
	EClass getAddressEndPointInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPointOutputConnector <em>Address End Point Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address End Point Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPointOutputConnector
	 * @generated
	 */
	EClass getAddressEndPointOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DropMediator <em>Drop Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DropMediator
	 * @generated
	 */
	EClass getDropMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DropMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DropMediator#getInputConnector()
	 * @see #getDropMediator()
	 * @generated
	 */
	EReference getDropMediator_InputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DropMediatorInputConnector <em>Drop Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DropMediatorInputConnector
	 * @generated
	 */
	EClass getDropMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator <em>Filter Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator
	 * @generated
	 */
	EClass getFilterMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getConditionType()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EAttribute getFilterMediator_ConditionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getSource()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getRegex()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EAttribute getFilterMediator_Regex();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getXpath()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_Xpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getInputConnector()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getPassOutputConnector <em>Pass Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pass Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getPassOutputConnector()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_PassOutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getFailOutputConnector <em>Fail Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fail Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator#getFailOutputConnector()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_FailOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorInputConnector <em>Filter Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorInputConnector
	 * @generated
	 */
	EClass getFilterMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorPassOutputConnector <em>Filter Mediator Pass Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mediator Pass Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorPassOutputConnector
	 * @generated
	 */
	EClass getFilterMediatorPassOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorFailOutputConnector <em>Filter Mediator Fail Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mediator Fail Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorFailOutputConnector
	 * @generated
	 */
	EClass getFilterMediatorFailOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getFirstInputConnector <em>First Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getFirstInputConnector()
	 * @see #getMergeNode()
	 * @generated
	 */
	EReference getMergeNode_FirstInputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getSecondInputConnector <em>Second Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getSecondInputConnector()
	 * @see #getMergeNode()
	 * @generated
	 */
	EReference getMergeNode_SecondInputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNode#getOutputConnector()
	 * @see #getMergeNode()
	 * @generated
	 */
	EReference getMergeNode_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeFirstInputConnector <em>Merge Node First Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node First Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeFirstInputConnector
	 * @generated
	 */
	EClass getMergeNodeFirstInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeSecondInputConnector <em>Merge Node Second Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Second Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeSecondInputConnector
	 * @generated
	 */
	EClass getMergeNodeSecondInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeOutputConnector <em>Merge Node Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MergeNodeOutputConnector
	 * @generated
	 */
	EClass getMergeNodeOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator <em>Log Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator
	 * @generated
	 */
	EClass getLogMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogCategory <em>Log Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Category</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogCategory()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogLevel()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogSeparator <em>Log Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Separator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getLogSeparator()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogSeparator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getInputConnector()
	 * @see #getLogMediator()
	 * @generated
	 */
	EReference getLogMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getOutputConnector()
	 * @see #getLogMediator()
	 * @generated
	 */
	EReference getLogMediator_OutputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediator#getProperties()
	 * @see #getLogMediator()
	 * @generated
	 */
	EReference getLogMediator_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediatorInputConnector <em>Log Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediatorInputConnector
	 * @generated
	 */
	EClass getLogMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediatorOutputConnector <em>Log Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogMediatorOutputConnector
	 * @generated
	 */
	EClass getLogMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogProperty <em>Log Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogProperty
	 * @generated
	 */
	EClass getLogProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty <em>Registry Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Key Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty
	 * @generated
	 */
	EClass getRegistryKeyProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getPrettyName <em>Pretty Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pretty Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getPrettyName()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_PrettyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getKeyName()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getKeyValue()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_KeyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty#getFilters()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_Filters();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator <em>Property Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator
	 * @generated
	 */
	EClass getPropertyMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyName()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyDataType <em>Property Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Data Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyDataType()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyAction <em>Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyAction()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyScope <em>Property Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Scope</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getPropertyScope()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyScope();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueType()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueLiteral()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getExpression()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getNamespacePrefix()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_NamespacePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getNamespace()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueExpression()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EReference getPropertyMediator_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueOM <em>Value OM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value OM</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueOM()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueOM();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueStringPattern <em>Value String Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String Pattern</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueStringPattern()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueStringPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueStringCapturingGroup <em>Value String Capturing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String Capturing Group</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getValueStringCapturingGroup()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueStringCapturingGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getInputConnector()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EReference getPropertyMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator#getOutputConnector()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EReference getPropertyMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorInputConnector <em>Property Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorInputConnector
	 * @generated
	 */
	EClass getPropertyMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector <em>Property Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector
	 * @generated
	 */
	EClass getPropertyMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty <em>Namespaced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespaced Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty
	 * @generated
	 */
	EClass getNamespacedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPrettyName <em>Pretty Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pretty Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPrettyName()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PrettyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPropertyName()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getPropertyValue()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespaces</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty#getNamespaces()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_Namespaces();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator <em>Enrich Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrich Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator
	 * @generated
	 */
	EClass getEnrichMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#isCloneSource <em>Clone Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clone Source</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#isCloneSource()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_CloneSource();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceType()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceXpath()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_SourceXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceProperty()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceXML <em>Source XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source XML</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getSourceXML()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceXML();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetAction <em>Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetAction()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetType()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetXpath <em>Target Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetXpath()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_TargetXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getTargetProperty()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getInputConnector()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator#getOutputConnector()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediatorInputConnector <em>Enrich Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrich Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediatorInputConnector
	 * @generated
	 */
	EClass getEnrichMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediatorOutputConnector <em>Enrich Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrich Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediatorOutputConnector
	 * @generated
	 */
	EClass getEnrichMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty <em>Abstract Name Value Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Value Expression Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty
	 * @generated
	 */
	EClass getAbstractNameValueExpressionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyName()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyValueType()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyValue()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueExpressionProperty#getPropertyExpression()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EReference getAbstractNameValueExpressionProperty_PropertyExpression();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature <em>Abstract Boolean Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Boolean Feature</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature
	 * @generated
	 */
	EClass getAbstractBooleanFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature#getFeatureName()
	 * @see #getAbstractBooleanFeature()
	 * @generated
	 */
	EAttribute getAbstractBooleanFeature_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature#isFeatureEnabled <em>Feature Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractBooleanFeature#isFeatureEnabled()
	 * @see #getAbstractBooleanFeature()
	 * @generated
	 */
	EAttribute getAbstractBooleanFeature_FeatureEnabled();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource <em>Abstract Location Key Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Location Key Resource</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource
	 * @generated
	 */
	EClass getAbstractLocationKeyResource();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource#getLocation()
	 * @see #getAbstractLocationKeyResource()
	 * @generated
	 */
	EAttribute getAbstractLocationKeyResource_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractLocationKeyResource#getKey()
	 * @see #getAbstractLocationKeyResource()
	 * @generated
	 */
	EReference getAbstractLocationKeyResource_Key();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator <em>XSLT Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator
	 * @generated
	 */
	EClass getXSLTMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getInputConnector()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getOutputConnector()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_OutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltSchemaKeyType <em>Xslt Schema Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xslt Schema Key Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltSchemaKeyType()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EAttribute getXSLTMediator_XsltSchemaKeyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltStaticSchemaKey <em>Xslt Static Schema Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xslt Static Schema Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltStaticSchemaKey()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_XsltStaticSchemaKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltDynamicSchemaKey <em>Xslt Dynamic Schema Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xslt Dynamic Schema Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltDynamicSchemaKey()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_XsltDynamicSchemaKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltKey <em>Xslt Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xslt Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getXsltKey()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_XsltKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getSourceXPath <em>Source XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source XPath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getSourceXPath()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_SourceXPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getProperties()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getFeatures()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator#getResources()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Resources();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty <em>XSLT Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty
	 * @generated
	 */
	EClass getXSLTProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature <em>XSLT Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Feature</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature
	 * @generated
	 */
	EClass getXSLTFeature();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource <em>XSLT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Resource</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource
	 * @generated
	 */
	EClass getXSLTResource();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorInputConnector <em>XSLT Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorInputConnector
	 * @generated
	 */
	EClass getXSLTMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorOutputConnector <em>XSLT Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorOutputConnector
	 * @generated
	 */
	EClass getXSLTMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator <em>Switch Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator
	 * @generated
	 */
	EClass getSwitchMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getSourceXpath()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_SourceXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getSource()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EAttribute getSwitchMediator_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getNamespace()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EAttribute getSwitchMediator_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getNamespacePrefix()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EAttribute getSwitchMediator_NamespacePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getCaseBranches <em>Case Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Branches</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getCaseBranches()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_CaseBranches();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getDefaultBranch <em>Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getDefaultBranch()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_DefaultBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator#getInputConnector()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_InputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector <em>Switch Case Branch Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Branch Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector
	 * @generated
	 */
	EClass getSwitchCaseBranchOutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector#getCaseRegex <em>Case Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Regex</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector#getCaseRegex()
	 * @see #getSwitchCaseBranchOutputConnector()
	 * @generated
	 */
	EAttribute getSwitchCaseBranchOutputConnector_CaseRegex();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchDefaultBranchOutputConnector <em>Switch Default Branch Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Default Branch Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchDefaultBranchOutputConnector
	 * @generated
	 */
	EClass getSwitchDefaultBranchOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorInputConnector <em>Switch Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorInputConnector
	 * @generated
	 */
	EClass getSwitchMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SequenceDiagram <em>Sequence Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Diagram</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SequenceDiagram
	 * @generated
	 */
	EClass getSequenceDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SequenceDiagram#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SequenceDiagram#getSequence()
	 * @see #getSequenceDiagram()
	 * @generated
	 */
	EReference getSequenceDiagram_Sequence();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence
	 * @generated
	 */
	EClass getEsbSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getName()
	 * @see #getEsbSequence()
	 * @generated
	 */
	EAttribute getEsbSequence_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getInput()
	 * @see #getEsbSequence()
	 * @generated
	 */
	EReference getEsbSequence_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getOutput()
	 * @see #getEsbSequence()
	 * @generated
	 */
	EReference getEsbSequence_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getChildMediators <em>Child Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Mediators</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence#getChildMediators()
	 * @see #getEsbSequence()
	 * @generated
	 */
	EReference getEsbSequence_ChildMediators();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInput <em>Sequence Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Input</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInput
	 * @generated
	 */
	EClass getEsbSequenceInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInput#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInput#getConnector()
	 * @see #getEsbSequenceInput()
	 * @generated
	 */
	EReference getEsbSequenceInput_Connector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutput <em>Sequence Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Output</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutput
	 * @generated
	 */
	EClass getEsbSequenceOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutput#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutput#getConnector()
	 * @see #getEsbSequenceOutput()
	 * @generated
	 */
	EReference getEsbSequenceOutput_Connector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInputConnector <em>Sequence Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceInputConnector
	 * @generated
	 */
	EClass getEsbSequenceInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutputConnector <em>Sequence Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbSequenceOutputConnector
	 * @generated
	 */
	EClass getEsbSequenceOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getKey()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getInputConnector()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getOutputConnector()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_OutputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getIncludedMediators <em>Included Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Mediators</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Sequence#getIncludedMediators()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_IncludedMediators();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector <em>Sequence Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector
	 * @generated
	 */
	EClass getSequenceInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SequenceOutputConnector <em>Sequence Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SequenceOutputConnector
	 * @generated
	 */
	EClass getSequenceOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator <em>Event Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator
	 * @generated
	 */
	EClass getEventMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getTopicType <em>Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getTopicType()
	 * @see #getEventMediator()
	 * @generated
	 */
	EAttribute getEventMediator_TopicType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getStaticTopic <em>Static Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Topic</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getStaticTopic()
	 * @see #getEventMediator()
	 * @generated
	 */
	EAttribute getEventMediator_StaticTopic();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getDynamicTopic <em>Dynamic Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Topic</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getDynamicTopic()
	 * @see #getEventMediator()
	 * @generated
	 */
	EReference getEventMediator_DynamicTopic();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getEventExpression <em>Event Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getEventExpression()
	 * @see #getEventMediator()
	 * @generated
	 */
	EReference getEventMediator_EventExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getInputConnector()
	 * @see #getEventMediator()
	 * @generated
	 */
	EReference getEventMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediator#getOutputConnector()
	 * @see #getEventMediator()
	 * @generated
	 */
	EReference getEventMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediatorInputConnector <em>Event Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediatorInputConnector
	 * @generated
	 */
	EClass getEventMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventMediatorOutputConnector <em>Event Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventMediatorOutputConnector
	 * @generated
	 */
	EClass getEventMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty <em>Abstract Name Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Value Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty
	 * @generated
	 */
	EClass getAbstractNameValueProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty#getPropertyName()
	 * @see #getAbstractNameValueProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractNameValueProperty#getPropertyValue()
	 * @see #getAbstractNameValueProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueProperty_PropertyValue();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator <em>Entitlement Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entitlement Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator
	 * @generated
	 */
	EClass getEntitlementMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getServerURL()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_ServerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getUsername()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getPassword()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getInputConnector()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EReference getEntitlementMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator#getOutputConnector()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EReference getEntitlementMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorInputConnector <em>Entitlement Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entitlement Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorInputConnector
	 * @generated
	 */
	EClass getEntitlementMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorOutputConnector <em>Entitlement Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entitlement Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediatorOutputConnector
	 * @generated
	 */
	EClass getEntitlementMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator <em>Enqueue Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enqueue Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator
	 * @generated
	 */
	EClass getEnqueueMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getExecutor()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EAttribute getEnqueueMediator_Executor();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getPriority()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EAttribute getEnqueueMediator_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getSequenceKey()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EReference getEnqueueMediator_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator <em>Class Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator
	 * @generated
	 */
	EClass getClassMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getClassName()
	 * @see #getClassMediator()
	 * @generated
	 */
	EAttribute getClassMediator_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getProperties()
	 * @see #getClassMediator()
	 * @generated
	 */
	EReference getClassMediator_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getInputConnector()
	 * @see #getClassMediator()
	 * @generated
	 */
	EReference getClassMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediator#getOutputConnector()
	 * @see #getClassMediator()
	 * @generated
	 */
	EReference getClassMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediatorInputConnector <em>Class Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediatorInputConnector
	 * @generated
	 */
	EClass getClassMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassMediatorOutputConnector <em>Class Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassMediatorOutputConnector
	 * @generated
	 */
	EClass getClassMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ClassProperty <em>Class Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ClassProperty
	 * @generated
	 */
	EClass getClassProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator <em>Spring Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator
	 * @generated
	 */
	EClass getSpringMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getBeanName <em>Bean Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getBeanName()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EAttribute getSpringMediator_BeanName();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getConfigurationKey()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EReference getSpringMediator_ConfigurationKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getInputConnector()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EReference getSpringMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator#getOutputConnector()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EReference getSpringMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediatorInputConnector <em>Spring Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediatorInputConnector
	 * @generated
	 */
	EClass getSpringMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SpringMediatorOutputConnector <em>Spring Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SpringMediatorOutputConnector
	 * @generated
	 */
	EClass getSpringMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator <em>Validate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator
	 * @generated
	 */
	EClass getValidateMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getSourceXpath()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_SourceXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getOnFailBranch <em>On Fail Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Fail Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getOnFailBranch()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_OnFailBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getFeatures()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator#getSchemas()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_Schemas();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateOnFailBranch <em>Validate On Fail Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate On Fail Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateOnFailBranch
	 * @generated
	 */
	EClass getValidateOnFailBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateFeature <em>Validate Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Feature</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateFeature
	 * @generated
	 */
	EClass getValidateFeature();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema <em>Validate Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Schema</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema
	 * @generated
	 */
	EClass getValidateSchema();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateStaticSchemaKey <em>Validate Static Schema Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validate Static Schema Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateStaticSchemaKey()
	 * @see #getValidateSchema()
	 * @generated
	 */
	EReference getValidateSchema_ValidateStaticSchemaKey();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateDynamicSchemaKey <em>Validate Dynamic Schema Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validate Dynamic Schema Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateDynamicSchemaKey()
	 * @see #getValidateSchema()
	 * @generated
	 */
	EReference getValidateSchema_ValidateDynamicSchemaKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateSchemaKeyType <em>Validate Schema Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate Schema Key Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema#getValidateSchemaKeyType()
	 * @see #getValidateSchema()
	 * @generated
	 */
	EAttribute getValidateSchema_ValidateSchemaKeyType();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator <em>Script Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator
	 * @generated
	 */
	EClass getScriptMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptType()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Language</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptLanguage()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getMediateFunction <em>Mediate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediate Function</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getMediateFunction()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_MediateFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptKey <em>Script Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptKey()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EReference getScriptMediator_ScriptKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptBody <em>Script Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Body</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getScriptBody()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getInputConnector()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EReference getScriptMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator#getOutputConnector()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EReference getScriptMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorInputConnector <em>Script Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorInputConnector
	 * @generated
	 */
	EClass getScriptMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorOutputConnector <em>Script Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorOutputConnector
	 * @generated
	 */
	EClass getScriptMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator <em>Fault Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator
	 * @generated
	 */
	EClass getFaultMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getSoapVersion <em>Soap Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getSoapVersion()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_SoapVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#isMarkAsResponse <em>Mark As Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark As Response</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#isMarkAsResponse()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_MarkAsResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultCodeSoap11 <em>Fault Code Soap11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Code Soap11</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultCodeSoap11()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultCodeSoap11();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringType <em>Fault String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault String Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringValue <em>Fault String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault String Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultStringValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringExpression <em>Fault String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault String Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultStringExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultActor <em>Fault Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Actor</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultActor()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultActor();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultCodeSoap12 <em>Fault Code Soap12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Code Soap12</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultCodeSoap12()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultCodeSoap12();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonType <em>Fault Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Reason Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultReasonType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonValue <em>Fault Reason Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Reason Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultReasonValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonExpression <em>Fault Reason Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Reason Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultReasonExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultReasonExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getRoleName()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getNodeName()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailType <em>Fault Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Detail Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultDetailType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailValue <em>Fault Detail Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Detail Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultDetailValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailExpression <em>Fault Detail Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Detail Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getFaultDetailExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultDetailExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getInputConnector()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator#getOutputConnector()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediatorInputConnector <em>Fault Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediatorInputConnector
	 * @generated
	 */
	EClass getFaultMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultMediatorOutputConnector <em>Fault Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultMediatorOutputConnector
	 * @generated
	 */
	EClass getFaultMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator <em>Aggregate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator
	 * @generated
	 */
	EClass getAggregateMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getAggregateID <em>Aggregate ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate ID</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getAggregateID()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_AggregateID();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCorrelationExpression <em>Correlation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCorrelationExpression()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_CorrelationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionTimeout <em>Completion Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Timeout</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionTimeout()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMinMessages <em>Completion Min Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Min Messages</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMinMessages()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionMinMessages();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMaxMessages <em>Completion Max Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Max Messages</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMaxMessages()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionMaxMessages();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteBranch <em>On Complete Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Complete Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteBranch()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_OnCompleteBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getInputConnector()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOutputConnector()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_OutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteOutputConnector <em>On Complete Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Complete Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteOutputConnector()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_OnCompleteOutputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getChildren()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorInputConnector <em>Aggregate Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorInputConnector
	 * @generated
	 */
	EClass getAggregateMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorOutputConnector <em>Aggregate Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorOutputConnector
	 * @generated
	 */
	EClass getAggregateMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorOnCompleteOutputConnector <em>Aggregate Mediator On Complete Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Mediator On Complete Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediatorOnCompleteOutputConnector
	 * @generated
	 */
	EClass getAggregateMediatorOnCompleteOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch <em>Aggregate On Complete Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate On Complete Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch
	 * @generated
	 */
	EClass getAggregateOnCompleteBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getAggregationExpression <em>Aggregation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregation Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getAggregationExpression()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EReference getAggregateOnCompleteBranch_AggregationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceType()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EAttribute getAggregateOnCompleteBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceKey()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EReference getAggregateOnCompleteBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator <em>Router Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator
	 * @generated
	 */
	EClass getRouterMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#isContinueAfterRouting <em>Continue After Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue After Routing</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#isContinueAfterRouting()
	 * @see #getRouterMediator()
	 * @generated
	 */
	EAttribute getRouterMediator_ContinueAfterRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#getRoutes()
	 * @see #getRouterMediator()
	 * @generated
	 */
	EReference getRouterMediator_Routes();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute <em>Router Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Route</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute
	 * @generated
	 */
	EClass getRouterRoute();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#isBreakAfterRoute <em>Break After Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break After Route</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#isBreakAfterRoute()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EAttribute getRouterRoute_BreakAfterRoute();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getRouteExpression <em>Route Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getRouteExpression()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EReference getRouterRoute_RouteExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getRoutePattern <em>Route Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Pattern</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getRoutePattern()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EAttribute getRouterRoute_RoutePattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute#getTarget()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EReference getRouterRoute_Target();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouteTarget <em>Route Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RouteTarget
	 * @generated
	 */
	EClass getRouteTarget();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator <em>Clone Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator
	 * @generated
	 */
	EClass getCloneMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getCloneID <em>Clone ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clone ID</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getCloneID()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EAttribute getCloneMediator_CloneID();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#isSequentialMediation <em>Sequential Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequential Mediation</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#isSequentialMediation()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EAttribute getCloneMediator_SequentialMediation();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#isContinueParent <em>Continue Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue Parent</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#isContinueParent()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EAttribute getCloneMediator_ContinueParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getTargetsOutputConnector <em>Targets Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getTargetsOutputConnector()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EReference getCloneMediator_TargetsOutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getInputConnector()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EReference getCloneMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator#getOutputConnector()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EReference getCloneMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorInputConnector <em>Clone Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorInputConnector
	 * @generated
	 */
	EClass getCloneMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorOutputConnector <em>Clone Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorOutputConnector
	 * @generated
	 */
	EClass getCloneMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector <em>Clone Mediator Target Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Mediator Target Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector
	 * @generated
	 */
	EClass getCloneMediatorTargetOutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getSoapAction()
	 * @see #getCloneMediatorTargetOutputConnector()
	 * @generated
	 */
	EAttribute getCloneMediatorTargetOutputConnector_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getToAddress <em>To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Address</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getToAddress()
	 * @see #getCloneMediatorTargetOutputConnector()
	 * @generated
	 */
	EAttribute getCloneMediatorTargetOutputConnector_ToAddress();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator <em>Iterate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator
	 * @generated
	 */
	EClass getIterateMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getIterateID <em>Iterate ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterate ID</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getIterateID()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_IterateID();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isSequentialMediation <em>Sequential Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequential Mediation</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isSequentialMediation()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_SequentialMediation();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isContinueParent <em>Continue Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue Parent</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isContinueParent()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_ContinueParent();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isPreservePayload <em>Preserve Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preserve Payload</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#isPreservePayload()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_PreservePayload();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getIterateExpression <em>Iterate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterate Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getIterateExpression()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_IterateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getAttachPath <em>Attach Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach Path</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getAttachPath()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_AttachPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getTarget()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getInputConnector()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator#getOutputConnector()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediatorInputConnector <em>Iterate Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediatorInputConnector
	 * @generated
	 */
	EClass getIterateMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateMediatorOutputConnector <em>Iterate Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateMediatorOutputConnector
	 * @generated
	 */
	EClass getIterateMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget <em>Iterate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget
	 * @generated
	 */
	EClass getIterateTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget#getSoapAction()
	 * @see #getIterateTarget()
	 * @generated
	 */
	EAttribute getIterateTarget_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget#getToAddress <em>To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Address</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.IterateTarget#getToAddress()
	 * @see #getIterateTarget()
	 * @generated
	 */
	EAttribute getIterateTarget_ToAddress();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget <em>Abstract Common Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Common Target</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget
	 * @generated
	 */
	EClass getAbstractCommonTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequenceType()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EAttribute getAbstractCommonTarget_SequenceType();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequence()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getSequenceKey()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_SequenceKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpointType()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EAttribute getAbstractCommonTarget_EndpointType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpoint()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpointKey <em>Endpoint Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractCommonTarget#getEndpointKey()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_EndpointKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence <em>Mediator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence
	 * @generated
	 */
	EClass getMediatorSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#isAnonymous()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EAttribute getMediatorSequence_Anonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getSequenceName()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EAttribute getMediatorSequence_SequenceName();

	/**
	 * Returns the meta object for the reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getMediators <em>Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mediators</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getMediators()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EReference getMediatorSequence_Mediators();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Error</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getOnError()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EReference getMediatorSequence_OnError();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.MediatorSequence#getDescription()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EAttribute getMediatorSequence_Description();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator <em>Cache Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator
	 * @generated
	 */
	EClass getCacheMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheId <em>Cache Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Id</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheId()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheId();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheScope <em>Cache Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Scope</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheScope()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheScope();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheAction <em>Cache Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheAction()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getHashGenerator <em>Hash Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Generator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getHashGenerator()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_HashGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheTimeout <em>Cache Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Timeout</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getCacheTimeout()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getMaxMessageSize <em>Max Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Size</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getMaxMessageSize()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_MaxMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getImplementationType()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getMaxEntryCount <em>Max Entry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Entry Count</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getMaxEntryCount()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_MaxEntryCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getOnHitBranch <em>On Hit Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Hit Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getOnHitBranch()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EReference getCacheMediator_OnHitBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getInputConnector()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EReference getCacheMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator#getOutputConnector()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EReference getCacheMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediatorInputConnector <em>Cache Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediatorInputConnector
	 * @generated
	 */
	EClass getCacheMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheMediatorOutputConnector <em>Cache Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheMediatorOutputConnector
	 * @generated
	 */
	EClass getCacheMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch <em>Cache On Hit Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache On Hit Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch
	 * @generated
	 */
	EClass getCacheOnHitBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceType()
	 * @see #getCacheOnHitBranch()
	 * @generated
	 */
	EAttribute getCacheOnHitBranch_SequenceType();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceKey()
	 * @see #getCacheOnHitBranch()
	 * @generated
	 */
	EReference getCacheOnHitBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator <em>XQuery Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator
	 * @generated
	 */
	EClass getXQueryMediator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getVariables()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getTargetXPath <em>Target XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target XPath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getTargetXPath()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_TargetXPath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getScriptKeyType <em>Script Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Key Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getScriptKeyType()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EAttribute getXQueryMediator_ScriptKeyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getStaticScriptKey <em>Static Script Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Script Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getStaticScriptKey()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_StaticScriptKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getDynamicScriptKey <em>Dynamic Script Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Script Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getDynamicScriptKey()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_DynamicScriptKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getQueryKey <em>Query Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getQueryKey()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_QueryKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getInputConnector()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator#getOutputConnector()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediatorInputConnector <em>XQuery Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediatorInputConnector
	 * @generated
	 */
	EClass getXQueryMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediatorOutputConnector <em>XQuery Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediatorOutputConnector
	 * @generated
	 */
	EClass getXQueryMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable <em>XQuery Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Variable</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable
	 * @generated
	 */
	EClass getXQueryVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getVariableName()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getVariableType()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_VariableType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueType()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueLiteral()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueExpression()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EReference getXQueryVariable_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable#getValueKey()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EReference getXQueryVariable_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator <em>Callout Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callout Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator
	 * @generated
	 */
	EClass getCalloutMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getServiceURL <em>Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URL</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getServiceURL()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ServiceURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getSoapAction()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPathToAxis2xml <em>Path To Axis2xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Axis2xml</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPathToAxis2xml()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PathToAxis2xml();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPathToAxis2Repository <em>Path To Axis2 Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Axis2 Repository</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPathToAxis2Repository()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PathToAxis2Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadType()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PayloadType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadMessageXpath <em>Payload Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Message Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadMessageXpath()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_PayloadMessageXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadRegistryKey <em>Payload Registry Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Registry Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getPayloadRegistryKey()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_PayloadRegistryKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultType()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ResultType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultMessageXpath <em>Result Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Message Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultMessageXpath()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_ResultMessageXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultContextProperty <em>Result Context Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Context Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getResultContextProperty()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ResultContextProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#isPassHeaders <em>Pass Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Headers</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#isPassHeaders()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PassHeaders();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getInputConnector()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator#getOutputConnector()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediatorInputConnector <em>Callout Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callout Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediatorInputConnector
	 * @generated
	 */
	EClass getCalloutMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediatorOutputConnector <em>Callout Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callout Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediatorOutputConnector
	 * @generated
	 */
	EClass getCalloutMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator <em>RM Sequence Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Sequence Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator
	 * @generated
	 */
	EClass getRMSequenceMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getRmSpecVersion <em>Rm Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm Spec Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getRmSpecVersion()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EAttribute getRMSequenceMediator_RmSpecVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getSequenceType()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EAttribute getRMSequenceMediator_SequenceType();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getCorrelationXpath <em>Correlation Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getCorrelationXpath()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_CorrelationXpath();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getLastMessageXpath <em>Last Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Message Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getLastMessageXpath()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_LastMessageXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getInputConnector()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator#getOutputConnector()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediatorInputConnector <em>RM Sequence Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Sequence Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediatorInputConnector
	 * @generated
	 */
	EClass getRMSequenceMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediatorOutputConnector <em>RM Sequence Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Sequence Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediatorOutputConnector
	 * @generated
	 */
	EClass getRMSequenceMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator <em>Transaction Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator
	 * @generated
	 */
	EClass getTransactionMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getAction()
	 * @see #getTransactionMediator()
	 * @generated
	 */
	EAttribute getTransactionMediator_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getInputConnector()
	 * @see #getTransactionMediator()
	 * @generated
	 */
	EReference getTransactionMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator#getOutputConnector()
	 * @see #getTransactionMediator()
	 * @generated
	 */
	EReference getTransactionMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediatorInputConnector <em>Transaction Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediatorInputConnector
	 * @generated
	 */
	EClass getTransactionMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediatorOutputConnector <em>Transaction Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediatorOutputConnector
	 * @generated
	 */
	EClass getTransactionMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator <em>OAuth Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator
	 * @generated
	 */
	EClass getOAuthMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getRemoteServiceUrl <em>Remote Service Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Service Url</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getRemoteServiceUrl()
	 * @see #getOAuthMediator()
	 * @generated
	 */
	EAttribute getOAuthMediator_RemoteServiceUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getInputConnector()
	 * @see #getOAuthMediator()
	 * @generated
	 */
	EReference getOAuthMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator#getOutputConnector()
	 * @see #getOAuthMediator()
	 * @generated
	 */
	EReference getOAuthMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediatorInputConnector <em>OAuth Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediatorInputConnector
	 * @generated
	 */
	EClass getOAuthMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediatorOutputConnector <em>OAuth Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediatorOutputConnector
	 * @generated
	 */
	EClass getOAuthMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AutoscaleInMediator <em>Autoscale In Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autoscale In Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AutoscaleInMediator
	 * @generated
	 */
	EClass getAutoscaleInMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AutoscaleOutMediator <em>Autoscale Out Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autoscale Out Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AutoscaleOutMediator
	 * @generated
	 */
	EClass getAutoscaleOutMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator <em>Header Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator
	 * @generated
	 */
	EClass getHeaderMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getHeaderName <em>Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getHeaderName()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_HeaderName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getHeaderAction <em>Header Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getHeaderAction()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_HeaderAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueType()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueLiteral()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getValueExpression()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getInputConnector()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator#getOutputConnector()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorInputConnector <em>Header Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorInputConnector
	 * @generated
	 */
	EClass getHeaderMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorOutputConnector <em>Header Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorOutputConnector
	 * @generated
	 */
	EClass getHeaderMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator <em>Throttle Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator
	 * @generated
	 */
	EClass getThrottleMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getGroupId()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EAttribute getThrottleMediator_GroupId();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getPolicyConfiguration <em>Policy Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getPolicyConfiguration()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_PolicyConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOnAcceptBranch <em>On Accept Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Accept Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOnAcceptBranch()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_OnAcceptBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOnRejectBranch <em>On Reject Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Reject Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOnRejectBranch()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_OnRejectBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getInputConnector()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator#getOutputConnector()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorInputConnector <em>Throttle Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorInputConnector
	 * @generated
	 */
	EClass getThrottleMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorOutputConnector <em>Throttle Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorOutputConnector
	 * @generated
	 */
	EClass getThrottleMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration <em>Throttle Policy Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Policy Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration
	 * @generated
	 */
	EClass getThrottlePolicyConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyType()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EAttribute getThrottlePolicyConfiguration_PolicyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyKey()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EReference getThrottlePolicyConfiguration_PolicyKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getMaxConcurrentAccessCount <em>Max Concurrent Access Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Access Count</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getMaxConcurrentAccessCount()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EAttribute getThrottlePolicyConfiguration_MaxConcurrentAccessCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyEntries <em>Policy Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Entries</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration#getPolicyEntries()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EReference getThrottlePolicyConfiguration_PolicyEntries();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry <em>Throttle Policy Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Policy Entry</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry
	 * @generated
	 */
	EClass getThrottlePolicyEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getThrottleType <em>Throttle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getThrottleType()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ThrottleType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getThrottleRange <em>Throttle Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Range</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getThrottleRange()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ThrottleRange();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getAccessType()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getMaxRequestCount <em>Max Request Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Request Count</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getMaxRequestCount()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_MaxRequestCount();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getUnitTime <em>Unit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Time</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getUnitTime()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_UnitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getProhibitPeriod <em>Prohibit Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prohibit Period</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry#getProhibitPeriod()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ProhibitPeriod();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch <em>Throttle On Accept Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle On Accept Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch
	 * @generated
	 */
	EClass getThrottleOnAcceptBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch#getSequenceType()
	 * @see #getThrottleOnAcceptBranch()
	 * @generated
	 */
	EAttribute getThrottleOnAcceptBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch#getSequenceKey()
	 * @see #getThrottleOnAcceptBranch()
	 * @generated
	 */
	EReference getThrottleOnAcceptBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch <em>Throttle On Reject Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle On Reject Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch
	 * @generated
	 */
	EClass getThrottleOnRejectBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch#getSequenceType()
	 * @see #getThrottleOnRejectBranch()
	 * @generated
	 */
	EAttribute getThrottleOnRejectBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch#getSequenceKey()
	 * @see #getThrottleOnRejectBranch()
	 * @generated
	 */
	EReference getThrottleOnRejectBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator <em>Command Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator
	 * @generated
	 */
	EClass getCommandMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getClassName()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EAttribute getCommandMediator_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getProperties()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EReference getCommandMediator_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getInputConnector()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EReference getCommandMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator#getOutputConnector()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EReference getCommandMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediatorInputConnector <em>Command Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediatorInputConnector
	 * @generated
	 */
	EClass getCommandMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandMediatorOutputConnector <em>Command Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandMediatorOutputConnector
	 * @generated
	 */
	EClass getCommandMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty <em>Command Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty
	 * @generated
	 */
	EClass getCommandProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getPropertyName()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueType()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueLiteral()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueContextPropertyName <em>Value Context Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Context Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueContextPropertyName()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueContextPropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueMessageElementXpath <em>Value Message Element Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Message Element Xpath</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getValueMessageElementXpath()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EReference getCommandProperty_ValueMessageElementXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getContextAction <em>Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getContextAction()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ContextAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getMessageAction <em>Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty#getMessageAction()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_MessageAction();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator <em>Abstract Sql Executor Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sql Executor Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator
	 * @generated
	 */
	EClass getAbstractSqlExecutorMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionType()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsType <em>Connection Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsType()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbDriver <em>Connection Db Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Db Driver</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbDriver()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDbDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsInitialContext <em>Connection Ds Initial Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Initial Context</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsInitialContext()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsInitialContext();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsName <em>Connection Ds Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsName()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionURL <em>Connection URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection URL</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionURL()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionUsername <em>Connection Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Username</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionUsername()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionPassword <em>Connection Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Password</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionPassword()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyAutocommit <em>Property Autocommit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Autocommit</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyAutocommit()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyAutocommit();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyIsolation <em>Property Isolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Isolation</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyIsolation()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyIsolation();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxactive <em>Property Maxactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxactive</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxactive()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxactive();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxidle <em>Property Maxidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxidle</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxopenstatements <em>Property Maxopenstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxopenstatements</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxopenstatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxopenstatements();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxwait <em>Property Maxwait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxwait</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxwait()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxwait();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMinidle <em>Property Minidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Minidle</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMinidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMinidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyPoolstatements <em>Property Poolstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Poolstatements</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyPoolstatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyPoolstatements();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestonborrow <em>Property Testonborrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Testonborrow</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestonborrow()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyTestonborrow();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestwhileidle <em>Property Testwhileidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Testwhileidle</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestwhileidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyTestwhileidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyValidationquery <em>Property Validationquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Validationquery</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyValidationquery()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyValidationquery();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyInitialsize <em>Property Initialsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Initialsize</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyInitialsize()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyInitialsize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getSqlStatements <em>Sql Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Statements</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getSqlStatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EReference getAbstractSqlExecutorMediator_SqlStatements();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement <em>Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Statement</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement
	 * @generated
	 */
	EClass getSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query String</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getQueryString()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EAttribute getSqlStatement_QueryString();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getParameters()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EReference getSqlStatement_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#isResultsEnabled <em>Results Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Enabled</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#isResultsEnabled()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EAttribute getSqlStatement_ResultsEnabled();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement#getResults()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EReference getSqlStatement_Results();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition <em>Sql Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Parameter Definition</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition
	 * @generated
	 */
	EClass getSqlParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getDataType()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueType()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueLiteral()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDefinition#getValueExpression()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EReference getSqlParameterDefinition_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping <em>Sql Result Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Mapping</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping
	 * @generated
	 */
	EClass getSqlResultMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping#getPropertyName()
	 * @see #getSqlResultMapping()
	 * @generated
	 */
	EAttribute getSqlResultMapping_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping#getColumnId <em>Column Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Id</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlResultMapping#getColumnId()
	 * @see #getSqlResultMapping()
	 * @generated
	 */
	EAttribute getSqlResultMapping_ColumnId();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator <em>DB Lookup Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Lookup Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator
	 * @generated
	 */
	EClass getDBLookupMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator#getInputConnector()
	 * @see #getDBLookupMediator()
	 * @generated
	 */
	EReference getDBLookupMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator#getOutputConnector()
	 * @see #getDBLookupMediator()
	 * @generated
	 */
	EReference getDBLookupMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediatorInputConnector <em>DB Lookup Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Lookup Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediatorInputConnector
	 * @generated
	 */
	EClass getDBLookupMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediatorOutputConnector <em>DB Lookup Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Lookup Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediatorOutputConnector
	 * @generated
	 */
	EClass getDBLookupMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator <em>DB Report Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Report Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator
	 * @generated
	 */
	EClass getDBReportMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#isConnectionUseTransaction <em>Connection Use Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Use Transaction</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#isConnectionUseTransaction()
	 * @see #getDBReportMediator()
	 * @generated
	 */
	EAttribute getDBReportMediator_ConnectionUseTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#getInputConnector()
	 * @see #getDBReportMediator()
	 * @generated
	 */
	EReference getDBReportMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator#getOutputConnector()
	 * @see #getDBReportMediator()
	 * @generated
	 */
	EReference getDBReportMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediatorInputConnector <em>DB Report Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Report Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediatorInputConnector
	 * @generated
	 */
	EClass getDBReportMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediatorOutputConnector <em>DB Report Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Report Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediatorOutputConnector
	 * @generated
	 */
	EClass getDBReportMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator <em>Rule Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator
	 * @generated
	 */
	EClass getRuleMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetConfiguration <em>Rule Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Set Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_RuleSetConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSessionConfiguration <em>Rule Session Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Session Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSessionConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_RuleSessionConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facts Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_FactsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Results Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_ResultsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Mediators Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_ChildMediatorsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getInputConnector()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorInputConnector <em>Rule Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorInputConnector
	 * @generated
	 */
	EClass getRuleMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorOutputConnector <em>Rule Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorOutputConnector
	 * @generated
	 */
	EClass getRuleMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration <em>Rule Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration
	 * @generated
	 */
	EClass getRuleSetConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceType()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EAttribute getRuleSetConfiguration_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceCode <em>Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Code</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceCode()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EAttribute getRuleSetConfiguration_SourceCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceKey <em>Source Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceKey()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EReference getRuleSetConfiguration_SourceKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration#getProperties()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EReference getRuleSetConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty <em>Rule Set Creation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set Creation Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty
	 * @generated
	 */
	EClass getRuleSetCreationProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration <em>Rule Session Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Session Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration
	 * @generated
	 */
	EClass getRuleSessionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#isStatefulSession <em>Stateful Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateful Session</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#isStatefulSession()
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 */
	EAttribute getRuleSessionConfiguration_StatefulSession();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#getProperties()
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 */
	EReference getRuleSessionConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionProperty <em>Rule Session Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Session Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionProperty
	 * @generated
	 */
	EClass getRuleSessionProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration <em>Rule Facts Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Facts Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration
	 * @generated
	 */
	EClass getRuleFactsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration#getFacts()
	 * @see #getRuleFactsConfiguration()
	 * @generated
	 */
	EReference getRuleFactsConfiguration_Facts();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact <em>Rule Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Fact</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact
	 * @generated
	 */
	EClass getRuleFact();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactCustomType <em>Fact Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Custom Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactCustomType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactCustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactName <em>Fact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getFactName()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueLiteral()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueExpression()
	 * @see #getRuleFact()
	 * @generated
	 */
	EReference getRuleFact_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFact#getValueKey()
	 * @see #getRuleFact()
	 * @generated
	 */
	EReference getRuleFact_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration <em>Rule Results Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Results Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration
	 * @generated
	 */
	EClass getRuleResultsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration#getResults()
	 * @see #getRuleResultsConfiguration()
	 * @generated
	 */
	EReference getRuleResultsConfiguration_Results();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult <em>Rule Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Result</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult
	 * @generated
	 */
	EClass getRuleResult();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultCustomType <em>Result Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Custom Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultCustomType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultCustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultName <em>Result Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getResultName()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueLiteral()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueExpression()
	 * @see #getRuleResult()
	 * @generated
	 */
	EReference getRuleResult_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResult#getValueKey()
	 * @see #getRuleResult()
	 * @generated
	 */
	EReference getRuleResult_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleChildMediatorsConfiguration <em>Rule Child Mediators Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Child Mediators Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleChildMediatorsConfiguration
	 * @generated
	 */
	EClass getRuleChildMediatorsConfiguration();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator <em>Smooks Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator
	 * @generated
	 */
	EClass getSmooksMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Key</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getConfigurationKey()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_ConfigurationKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getInput()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getOutput()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getInputConnector()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator#getOutputConnector()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_OutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorInputConnector <em>Smooks Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorInputConnector
	 * @generated
	 */
	EClass getSmooksMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorOutputConnector <em>Smooks Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorOutputConnector
	 * @generated
	 */
	EClass getSmooksMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration <em>Smooks In Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks In Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration
	 * @generated
	 */
	EClass getSmooksInConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration#getType()
	 * @see #getSmooksInConfiguration()
	 * @generated
	 */
	EAttribute getSmooksInConfiguration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration#getExpression()
	 * @see #getSmooksInConfiguration()
	 * @generated
	 */
	EReference getSmooksInConfiguration_Expression();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration <em>Smooks Out Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Out Configuration</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration
	 * @generated
	 */
	EClass getSmooksOutConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getType()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getExpression()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EReference getSmooksOutConfiguration_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getProperty()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getAction()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getOutputMethod <em>Output Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Method</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration#getOutputMethod()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_OutputMethod();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator <em>Store Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator
	 * @generated
	 */
	EClass getStoreMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator#getMessageStore <em>Message Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Store</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator#getMessageStore()
	 * @see #getStoreMediator()
	 * @generated
	 */
	EAttribute getStoreMediator_MessageStore();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator#getOnStoreSequence <em>On Store Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Store Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator#getOnStoreSequence()
	 * @see #getStoreMediator()
	 * @generated
	 */
	EReference getStoreMediator_OnStoreSequence();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch <em>Conditional Route Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Route Branch</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch
	 * @generated
	 */
	EClass getConditionalRouteBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch#isBreakRoute <em>Break Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Route</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch#isBreakRoute()
	 * @see #getConditionalRouteBranch()
	 * @generated
	 */
	EAttribute getConditionalRouteBranch_BreakRoute();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator <em>Conditional Router Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Router Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator
	 * @generated
	 */
	EClass getConditionalRouterMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#isContinueRoute <em>Continue Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue Route</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#isContinueRoute()
	 * @see #getConditionalRouterMediator()
	 * @generated
	 */
	EAttribute getConditionalRouterMediator_ContinueRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#getConditionalRouteBranches <em>Conditional Route Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Route Branches</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#getConditionalRouteBranches()
	 * @see #getConditionalRouterMediator()
	 * @generated
	 */
	EReference getConditionalRouterMediator_ConditionalRouteBranches();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator <em>Send Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Mediator</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator
	 * @generated
	 */
	EClass getSendMediator();

	/**
	 * Returns the meta object for the reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getEndPoint()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_EndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getInputConnector()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getOutputConnector()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_OutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getReceivingSequenceType <em>Receiving Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiving Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getReceivingSequenceType()
	 * @see #getSendMediator()
	 * @generated
	 */
	EAttribute getSendMediator_ReceivingSequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getStaticReceivingSequence <em>Static Receiving Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Receiving Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getStaticReceivingSequence()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_StaticReceivingSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getDynamicReceivingSequence <em>Dynamic Receiving Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Receiving Sequence</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediator#getDynamicReceivingSequence()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_DynamicReceivingSequence();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorInputConnector <em>Send Mediator Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Mediator Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorInputConnector
	 * @generated
	 */
	EClass getSendMediatorInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorOutputConnector <em>Send Mediator Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Mediator Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorOutputConnector
	 * @generated
	 */
	EClass getSendMediatorOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint <em>Failover End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint
	 * @generated
	 */
	EClass getFailoverEndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getInputConnector()
	 * @see #getFailoverEndPoint()
	 * @generated
	 */
	EReference getFailoverEndPoint_InputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getOutputConnector()
	 * @see #getFailoverEndPoint()
	 * @generated
	 */
	EReference getFailoverEndPoint_OutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getWestOutputConnector <em>West Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>West Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint#getWestOutputConnector()
	 * @see #getFailoverEndPoint()
	 * @generated
	 */
	EReference getFailoverEndPoint_WestOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointInputConnector <em>Failover End Point Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover End Point Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointInputConnector
	 * @generated
	 */
	EClass getFailoverEndPointInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector <em>Failover End Point Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover End Point Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector
	 * @generated
	 */
	EClass getFailoverEndPointOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointWestOutputConnector <em>Failover End Point West Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover End Point West Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointWestOutputConnector
	 * @generated
	 */
	EClass getFailoverEndPointWestOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.ParentEndPoint <em>Parent End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ParentEndPoint
	 * @generated
	 */
	EClass getParentEndPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.ParentEndPoint#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ParentEndPoint#getChildren()
	 * @see #getParentEndPoint()
	 * @generated
	 */
	EReference getParentEndPoint_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint <em>WSDL End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint
	 * @generated
	 */
	EClass getWSDLEndPoint();

	/**
	 * Returns the meta object for the reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWSDLDefinition <em>WSDL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>WSDL Definition</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWSDLDefinition()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EReference getWSDLEndPoint_WSDLDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWSDLDescription <em>WSDL Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>WSDL Description</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWSDLDescription()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EReference getWSDLEndPoint_WSDLDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getInputConnector()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EReference getWSDLEndPoint_InputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getOutputConnector()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EReference getWSDLEndPoint_OutputConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWsdlUri <em>Wsdl Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Uri</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getWsdlUri()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EAttribute getWSDLEndPoint_WsdlUri();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getService()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EAttribute getWSDLEndPoint_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint#getPort()
	 * @see #getWSDLEndPoint()
	 * @generated
	 */
	EAttribute getWSDLEndPoint_Port();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLDefinition <em>WSDL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Definition</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLDefinition
	 * @generated
	 */
	EClass getWSDLDefinition();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLDescription <em>WSDL Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Description</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLDescription
	 * @generated
	 */
	EClass getWSDLDescription();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPointInputConnector <em>WSDL End Point Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL End Point Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPointInputConnector
	 * @generated
	 */
	EClass getWSDLEndPointInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPointOutputConnector <em>WSDL End Point Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL End Point Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPointOutputConnector
	 * @generated
	 */
	EClass getWSDLEndPointOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint <em>Load Balance End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balance End Point</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint
	 * @generated
	 */
	EClass getLoadBalanceEndPoint();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getSession()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EReference getLoadBalanceEndPoint_Session();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#isFailover <em>Failover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failover</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#isFailover()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EAttribute getLoadBalanceEndPoint_Failover();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getPolicy()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EAttribute getLoadBalanceEndPoint_Policy();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getInputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getInputConnector()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EReference getLoadBalanceEndPoint_InputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getOutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getOutputConnector()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EReference getLoadBalanceEndPoint_OutputConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getWestOutputConnector <em>West Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>West Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getWestOutputConnector()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
	EReference getLoadBalanceEndPoint_WestOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointInputConnector <em>Load Balance End Point Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balance End Point Input Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointInputConnector
	 * @generated
	 */
	EClass getLoadBalanceEndPointInputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector <em>Load Balance End Point Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balance End Point Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector
	 * @generated
	 */
	EClass getLoadBalanceEndPointOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector <em>Load Balance End Point West Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balance End Point West Output Connector</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector
	 * @generated
	 */
	EClass getLoadBalanceEndPointWestOutputConnector();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry <em>Local Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Entry</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry
	 * @generated
	 */
	EClass getLocalEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getEntryName <em>Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Name</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getEntryName()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_EntryName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueType()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueLiteral()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueXML <em>Value XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value XML</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueXML()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueXML();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueURL <em>Value URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URL</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry#getValueURL()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueURL();

	/**
	 * Returns the meta object for class '{@link org.wso2.developerstudio.eclipse.gmf.esb.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.developerstudio.eclipse.gmf.esb.Session#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Session#getType()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Type();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proxy Wsdl Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType
	 * @generated
	 */
	EEnum getProxyWsdlType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType <em>Filter Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Condition Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType
	 * @generated
	 */
	EEnum getFilterConditionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogCategory <em>Log Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Category</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogCategory
	 * @generated
	 */
	EEnum getLogCategory();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Level</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogLevel
	 * @generated
	 */
	EEnum getLogLevel();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Addressing Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion
	 * @generated
	 */
	EEnum getEndPointAddressingVersion();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Time Out Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction
	 * @generated
	 */
	EEnum getEndPointTimeOutAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat <em>End Point Message Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Message Format</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat
	 * @generated
	 */
	EEnum getEndPointMessageFormat();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Attachment Optimization</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization
	 * @generated
	 */
	EEnum getEndPointAttachmentOptimization();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType <em>Property Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Data Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType
	 * @generated
	 */
	EEnum getPropertyDataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction <em>Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction
	 * @generated
	 */
	EEnum getPropertyAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope <em>Property Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Scope</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope
	 * @generated
	 */
	EEnum getPropertyScope();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType
	 * @generated
	 */
	EEnum getPropertyValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType <em>Enrich Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Source Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType
	 * @generated
	 */
	EEnum getEnrichSourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction <em>Enrich Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Target Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction
	 * @generated
	 */
	EEnum getEnrichTargetAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType <em>Enrich Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Target Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType
	 * @generated
	 */
	EEnum getEnrichTargetType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType <em>Event Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Topic Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType
	 * @generated
	 */
	EEnum getEventTopicType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptType
	 * @generated
	 */
	EEnum getScriptType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Language</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage
	 * @generated
	 */
	EEnum getScriptLanguage();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion <em>Fault Soap Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Soap Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion
	 * @generated
	 */
	EEnum getFaultSoapVersion();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11 <em>Fault Code Soap11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Code Soap11</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11
	 * @generated
	 */
	EEnum getFaultCodeSoap11();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12 <em>Fault Code Soap12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Code Soap12</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12
	 * @generated
	 */
	EEnum getFaultCodeSoap12();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType <em>Fault String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault String Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType
	 * @generated
	 */
	EEnum getFaultStringType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType <em>Fault Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Reason Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType
	 * @generated
	 */
	EEnum getFaultReasonType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType <em>Fault Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Detail Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType
	 * @generated
	 */
	EEnum getFaultDetailType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType <em>Aggregate Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregate Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType
	 * @generated
	 */
	EEnum getAggregateSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType <em>Target Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType
	 * @generated
	 */
	EEnum getTargetSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType <em>Target Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Endpoint Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType
	 * @generated
	 */
	EEnum getTargetEndpointType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType <em>Cache Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType
	 * @generated
	 */
	EEnum getCacheSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType <em>Cache Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Implementation Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType
	 * @generated
	 */
	EEnum getCacheImplementationType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheAction <em>Cache Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheAction
	 * @generated
	 */
	EEnum getCacheAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheScope <em>Cache Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Scope</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheScope
	 * @generated
	 */
	EEnum getCacheScope();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType <em>XQuery Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XQuery Variable Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType
	 * @generated
	 */
	EEnum getXQueryVariableType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType <em>XQuery Variable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XQuery Variable Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType
	 * @generated
	 */
	EEnum getXQueryVariableValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType <em>Callout Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callout Payload Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType
	 * @generated
	 */
	EEnum getCalloutPayloadType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType <em>Callout Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callout Result Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType
	 * @generated
	 */
	EEnum getCalloutResultType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion <em>RM Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RM Spec Version</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion
	 * @generated
	 */
	EEnum getRMSpecVersion();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType <em>RM Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RM Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType
	 * @generated
	 */
	EEnum getRMSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction <em>Transaction Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction
	 * @generated
	 */
	EEnum getTransactionAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction <em>Header Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Header Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction
	 * @generated
	 */
	EEnum getHeaderAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType <em>Header Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Header Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType
	 * @generated
	 */
	EEnum getHeaderValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType <em>Throttle Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Policy Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType
	 * @generated
	 */
	EEnum getThrottlePolicyType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType <em>Throttle Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Condition Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType
	 * @generated
	 */
	EEnum getThrottleConditionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType <em>Throttle Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Access Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType
	 * @generated
	 */
	EEnum getThrottleAccessType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType <em>Throttle Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType
	 * @generated
	 */
	EEnum getThrottleSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType <em>Command Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType
	 * @generated
	 */
	EEnum getCommandPropertyValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction <em>Command Property Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Message Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction
	 * @generated
	 */
	EEnum getCommandPropertyMessageAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction <em>Command Property Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Context Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction
	 * @generated
	 */
	EEnum getCommandPropertyContextAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Connection Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType
	 * @generated
	 */
	EEnum getSqlExecutorConnectionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Datasource Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType
	 * @generated
	 */
	EEnum getSqlExecutorDatasourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Boolean Value</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
	 * @generated
	 */
	EEnum getSqlExecutorBooleanValue();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Isolation Level</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel
	 * @generated
	 */
	EEnum getSqlExecutorIsolationLevel();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType <em>Sql Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Parameter Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType
	 * @generated
	 */
	EEnum getSqlParameterValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType <em>Sql Parameter Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Parameter Data Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType
	 * @generated
	 */
	EEnum getSqlParameterDataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType <em>Rule Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Source Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType
	 * @generated
	 */
	EEnum getRuleSourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType <em>Rule Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Fact Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType
	 * @generated
	 */
	EEnum getRuleFactType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType <em>Rule Fact Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Fact Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType
	 * @generated
	 */
	EEnum getRuleFactValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType <em>Rule Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Result Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType
	 * @generated
	 */
	EEnum getRuleResultType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType <em>Rule Result Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Result Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType
	 * @generated
	 */
	EEnum getRuleResultValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType <em>Smooks IO Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Smooks IO Data Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType
	 * @generated
	 */
	EEnum getSmooksIODataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Action</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction
	 * @generated
	 */
	EEnum getExpressionAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod <em>Output Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Method</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod
	 * @generated
	 */
	EEnum getOutputMethod();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType <em>Receiving Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Receiving Sequence Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType
	 * @generated
	 */
	EEnum getReceivingSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.KeyType
	 * @generated
	 */
	EEnum getKeyType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType <em>Local Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Local Entry Value Type</em>'.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType
	 * @generated
	 */
	EEnum getLocalEntryValueType();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsbFactory getEsbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbDiagramImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbDiagram()
		 * @generated
		 */
		EClass ESB_DIAGRAM = eINSTANCE.getEsbDiagram();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_DIAGRAM__SERVER = eINSTANCE.getEsbDiagram_Server();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESB_DIAGRAM__TEST = eINSTANCE.getEsbDiagram_Test();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbNodeImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbNode()
		 * @generated
		 */
		EClass ESB_NODE = eINSTANCE.getEsbNode();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbElementImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbElement()
		 * @generated
		 */
		EClass ESB_ELEMENT = eINSTANCE.getEsbElement();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbServerImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbServer()
		 * @generated
		 */
		EClass ESB_SERVER = eINSTANCE.getEsbServer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SERVER__CHILDREN = eINSTANCE.getEsbServer_Children();

		/**
		 * The meta object literal for the '<em><b>Message Mediator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SERVER__MESSAGE_MEDIATOR = eINSTANCE.getEsbServer_MessageMediator();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR__REVERSE = eINSTANCE.getMediator_Reverse();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbConnector()
		 * @generated
		 */
		EClass ESB_CONNECTOR = eINSTANCE.getEsbConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.InputConnectorImpl <em>Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.InputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getInputConnector()
		 * @generated
		 */
		EClass INPUT_CONNECTOR = eINSTANCE.getInputConnector();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONNECTOR__INCOMING_LINKS = eINSTANCE.getInputConnector_IncomingLinks();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOutputConnector()
		 * @generated
		 */
		EClass OUTPUT_CONNECTOR = eINSTANCE.getOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Outgoing Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CONNECTOR__OUTGOING_LINK = eINSTANCE.getOutputConnector_OutgoingLink();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AdditionalOutputConnectorImpl <em>Additional Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AdditionalOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAdditionalOutputConnector()
		 * @generated
		 */
		EClass ADDITIONAL_OUTPUT_CONNECTOR = eINSTANCE.getAdditionalOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Outgoing Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_OUTPUT_CONNECTOR__OUTGOING_LINK = eINSTANCE.getAdditionalOutputConnector_OutgoingLink();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbLinkImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbLink()
		 * @generated
		 */
		EClass ESB_LINK = eINSTANCE.getEsbLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_LINK__SOURCE = eINSTANCE.getEsbLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_LINK__TARGET = eINSTANCE.getEsbLink_Target();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>End Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__END_POINT_NAME = eINSTANCE.getEndPoint_EndPointName();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__ANONYMOUS = eINSTANCE.getEndPoint_Anonymous();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl <em>Proxy Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyService()
		 * @generated
		 */
		EClass PROXY_SERVICE = eINSTANCE.getProxyService();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__OUTPUT_CONNECTOR = eINSTANCE.getProxyService_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__INPUT_CONNECTOR = eINSTANCE.getProxyService_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__NAME = eINSTANCE.getProxyService_Name();

		/**
		 * The meta object literal for the '<em><b>Pinned Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__PINNED_SERVERS = eINSTANCE.getProxyService_PinnedServers();

		/**
		 * The meta object literal for the '<em><b>Service Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__SERVICE_GROUP = eINSTANCE.getProxyService_ServiceGroup();

		/**
		 * The meta object literal for the '<em><b>Trace Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__TRACE_ENABLED = eINSTANCE.getProxyService_TraceEnabled();

		/**
		 * The meta object literal for the '<em><b>Statistics Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__STATISTICS_ENABLED = eINSTANCE.getProxyService_StatisticsEnabled();

		/**
		 * The meta object literal for the '<em><b>Transports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__TRANSPORTS = eINSTANCE.getProxyService_Transports();

		/**
		 * The meta object literal for the '<em><b>Reliable Messaging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED = eINSTANCE.getProxyService_ReliableMessagingEnabled();

		/**
		 * The meta object literal for the '<em><b>Security Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__SECURITY_ENABLED = eINSTANCE.getProxyService_SecurityEnabled();

		/**
		 * The meta object literal for the '<em><b>Wsdl Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__WSDL_TYPE = eINSTANCE.getProxyService_WsdlType();

		/**
		 * The meta object literal for the '<em><b>Wsdl XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__WSDL_XML = eINSTANCE.getProxyService_WsdlXML();

		/**
		 * The meta object literal for the '<em><b>Wsdl URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__WSDL_URL = eINSTANCE.getProxyService_WsdlURL();

		/**
		 * The meta object literal for the '<em><b>Wsdl Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__WSDL_KEY = eINSTANCE.getProxyService_WsdlKey();

		/**
		 * The meta object literal for the '<em><b>Service Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__SERVICE_PARAMETERS = eINSTANCE.getProxyService_ServiceParameters();

		/**
		 * The meta object literal for the '<em><b>Service Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__SERVICE_POLICIES = eINSTANCE.getProxyService_ServicePolicies();

		/**
		 * The meta object literal for the '<em><b>Sequence Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__SEQUENCE_CONTAINER = eINSTANCE.getProxyService_SequenceContainer();

		/**
		 * The meta object literal for the '<em><b>Endpoint Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__ENDPOINT_CONTAINER = eINSTANCE.getProxyService_EndpointContainer();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyOutputConnectorImpl <em>Proxy Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyOutputConnector()
		 * @generated
		 */
		EClass PROXY_OUTPUT_CONNECTOR = eINSTANCE.getProxyOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyInputConnectorImpl <em>Proxy Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyInputConnector()
		 * @generated
		 */
		EClass PROXY_INPUT_CONNECTOR = eINSTANCE.getProxyInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceParameterImpl <em>Proxy Service Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceParameterImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceParameter()
		 * @generated
		 */
		EClass PROXY_SERVICE_PARAMETER = eINSTANCE.getProxyServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE_PARAMETER__NAME = eINSTANCE.getProxyServiceParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE_PARAMETER__VALUE = eINSTANCE.getProxyServiceParameter_Value();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServicePolicyImpl <em>Proxy Service Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServicePolicyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServicePolicy()
		 * @generated
		 */
		EClass PROXY_SERVICE_POLICY = eINSTANCE.getProxyServicePolicy();

		/**
		 * The meta object literal for the '<em><b>Policy Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_POLICY__POLICY_KEY = eINSTANCE.getProxyServicePolicy_PolicyKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceInSequenceImpl <em>Proxy Service In Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceInSequenceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceInSequence()
		 * @generated
		 */
		EClass PROXY_SERVICE_IN_SEQUENCE = eINSTANCE.getProxyServiceInSequence();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_IN_SEQUENCE__CHILDREN = eINSTANCE.getProxyServiceInSequence_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceOutSequenceImpl <em>Proxy Service Out Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceOutSequenceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceOutSequence()
		 * @generated
		 */
		EClass PROXY_SERVICE_OUT_SEQUENCE = eINSTANCE.getProxyServiceOutSequence();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_OUT_SEQUENCE__CHILDREN = eINSTANCE.getProxyServiceOutSequence_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceContainerImpl <em>Proxy Service Sequence Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceSequenceContainerImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceSequenceContainer()
		 * @generated
		 */
		EClass PROXY_SERVICE_SEQUENCE_CONTAINER = eINSTANCE.getProxyServiceSequenceContainer();

		/**
		 * The meta object literal for the '<em><b>In Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_SEQUENCE_CONTAINER__IN_SEQUENCE = eINSTANCE.getProxyServiceSequenceContainer_InSequence();

		/**
		 * The meta object literal for the '<em><b>Out Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_SEQUENCE_CONTAINER__OUT_SEQUENCE = eINSTANCE.getProxyServiceSequenceContainer_OutSequence();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceEndpointContainerImpl <em>Proxy Service Endpoint Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ProxyServiceEndpointContainerImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyServiceEndpointContainer()
		 * @generated
		 */
		EClass PROXY_SERVICE_ENDPOINT_CONTAINER = eINSTANCE.getProxyServiceEndpointContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_ENDPOINT_CONTAINER__CHILDREN = eINSTANCE.getProxyServiceEndpointContainer_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractEndPointImpl <em>Abstract End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractEndPoint()
		 * @generated
		 */
		EClass ABSTRACT_END_POINT = eINSTANCE.getAbstractEndPoint();

		/**
		 * The meta object literal for the '<em><b>Reliable Messaging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED = eINSTANCE.getAbstractEndPoint_ReliableMessagingEnabled();

		/**
		 * The meta object literal for the '<em><b>Security Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__SECURITY_ENABLED = eINSTANCE.getAbstractEndPoint_SecurityEnabled();

		/**
		 * The meta object literal for the '<em><b>Addressing Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__ADDRESSING_ENABLED = eINSTANCE.getAbstractEndPoint_AddressingEnabled();

		/**
		 * The meta object literal for the '<em><b>Addressing Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__ADDRESSING_VERSION = eINSTANCE.getAbstractEndPoint_AddressingVersion();

		/**
		 * The meta object literal for the '<em><b>Addressing Separate Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER = eINSTANCE.getAbstractEndPoint_AddressingSeparateListener();

		/**
		 * The meta object literal for the '<em><b>Time Out Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__TIME_OUT_DURATION = eINSTANCE.getAbstractEndPoint_TimeOutDuration();

		/**
		 * The meta object literal for the '<em><b>Time Out Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__TIME_OUT_ACTION = eINSTANCE.getAbstractEndPoint_TimeOutAction();

		/**
		 * The meta object literal for the '<em><b>Retry Error Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__RETRY_ERROR_CODES = eINSTANCE.getAbstractEndPoint_RetryErrorCodes();

		/**
		 * The meta object literal for the '<em><b>Retry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__RETRY_COUNT = eINSTANCE.getAbstractEndPoint_RetryCount();

		/**
		 * The meta object literal for the '<em><b>Retry Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__RETRY_DELAY = eINSTANCE.getAbstractEndPoint_RetryDelay();

		/**
		 * The meta object literal for the '<em><b>Suspend Error Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__SUSPEND_ERROR_CODES = eINSTANCE.getAbstractEndPoint_SuspendErrorCodes();

		/**
		 * The meta object literal for the '<em><b>Suspend Initial Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION = eINSTANCE.getAbstractEndPoint_SuspendInitialDuration();

		/**
		 * The meta object literal for the '<em><b>Suspend Maximum Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION = eINSTANCE.getAbstractEndPoint_SuspendMaximumDuration();

		/**
		 * The meta object literal for the '<em><b>Suspend Progression Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR = eINSTANCE.getAbstractEndPoint_SuspendProgressionFactor();

		/**
		 * The meta object literal for the '<em><b>Reliable Messaging Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY = eINSTANCE.getAbstractEndPoint_ReliableMessagingPolicy();

		/**
		 * The meta object literal for the '<em><b>Security Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_END_POINT__SECURITY_POLICY = eINSTANCE.getAbstractEndPoint_SecurityPolicy();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageMediatorImpl <em>Message Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageMediator()
		 * @generated
		 */
		EClass MESSAGE_MEDIATOR = eINSTANCE.getMessageMediator();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getMessageMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getMessageMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageInputConnectorImpl <em>Message Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageInputConnector()
		 * @generated
		 */
		EClass MESSAGE_INPUT_CONNECTOR = eINSTANCE.getMessageInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageOutputConnectorImpl <em>Message Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMessageOutputConnector()
		 * @generated
		 */
		EClass MESSAGE_OUTPUT_CONNECTOR = eINSTANCE.getMessageOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointImpl <em>Default End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPoint()
		 * @generated
		 */
		EClass DEFAULT_END_POINT = eINSTANCE.getDefaultEndPoint();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_END_POINT__INPUT_CONNECTOR = eINSTANCE.getDefaultEndPoint_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_END_POINT__OUTPUT_CONNECTOR = eINSTANCE.getDefaultEndPoint_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointInputConnectorImpl <em>Default End Point Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPointInputConnector()
		 * @generated
		 */
		EClass DEFAULT_END_POINT_INPUT_CONNECTOR = eINSTANCE.getDefaultEndPointInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointOutputConnectorImpl <em>Default End Point Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DefaultEndPointOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDefaultEndPointOutputConnector()
		 * @generated
		 */
		EClass DEFAULT_END_POINT_OUTPUT_CONNECTOR = eINSTANCE.getDefaultEndPointOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointImpl <em>Address End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPoint()
		 * @generated
		 */
		EClass ADDRESS_END_POINT = eINSTANCE.getAddressEndPoint();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_END_POINT__INPUT_CONNECTOR = eINSTANCE.getAddressEndPoint_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_END_POINT__OUTPUT_CONNECTOR = eINSTANCE.getAddressEndPoint_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_END_POINT__URI = eINSTANCE.getAddressEndPoint_URI();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointInputConnectorImpl <em>Address End Point Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPointInputConnector()
		 * @generated
		 */
		EClass ADDRESS_END_POINT_INPUT_CONNECTOR = eINSTANCE.getAddressEndPointInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointOutputConnectorImpl <em>Address End Point Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AddressEndPointOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAddressEndPointOutputConnector()
		 * @generated
		 */
		EClass ADDRESS_END_POINT_OUTPUT_CONNECTOR = eINSTANCE.getAddressEndPointOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorImpl <em>Drop Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDropMediator()
		 * @generated
		 */
		EClass DROP_MEDIATOR = eINSTANCE.getDropMediator();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getDropMediator_InputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorInputConnectorImpl <em>Drop Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DropMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDropMediatorInputConnector()
		 * @generated
		 */
		EClass DROP_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getDropMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorImpl <em>Filter Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediator()
		 * @generated
		 */
		EClass FILTER_MEDIATOR = eINSTANCE.getFilterMediator();

		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MEDIATOR__CONDITION_TYPE = eINSTANCE.getFilterMediator_ConditionType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__SOURCE = eINSTANCE.getFilterMediator_Source();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MEDIATOR__REGEX = eINSTANCE.getFilterMediator_Regex();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__XPATH = eINSTANCE.getFilterMediator_Xpath();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getFilterMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Pass Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__PASS_OUTPUT_CONNECTOR = eINSTANCE.getFilterMediator_PassOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Fail Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__FAIL_OUTPUT_CONNECTOR = eINSTANCE.getFilterMediator_FailOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorInputConnectorImpl <em>Filter Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorInputConnector()
		 * @generated
		 */
		EClass FILTER_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getFilterMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorPassOutputConnectorImpl <em>Filter Mediator Pass Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorPassOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorPassOutputConnector()
		 * @generated
		 */
		EClass FILTER_MEDIATOR_PASS_OUTPUT_CONNECTOR = eINSTANCE.getFilterMediatorPassOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorFailOutputConnectorImpl <em>Filter Mediator Fail Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FilterMediatorFailOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterMediatorFailOutputConnector()
		 * @generated
		 */
		EClass FILTER_MEDIATOR_FAIL_OUTPUT_CONNECTOR = eINSTANCE.getFilterMediatorFailOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '<em><b>First Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_NODE__FIRST_INPUT_CONNECTOR = eINSTANCE.getMergeNode_FirstInputConnector();

		/**
		 * The meta object literal for the '<em><b>Second Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_NODE__SECOND_INPUT_CONNECTOR = eINSTANCE.getMergeNode_SecondInputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_NODE__OUTPUT_CONNECTOR = eINSTANCE.getMergeNode_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeFirstInputConnectorImpl <em>Merge Node First Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeFirstInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeFirstInputConnector()
		 * @generated
		 */
		EClass MERGE_NODE_FIRST_INPUT_CONNECTOR = eINSTANCE.getMergeNodeFirstInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeSecondInputConnectorImpl <em>Merge Node Second Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeSecondInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeSecondInputConnector()
		 * @generated
		 */
		EClass MERGE_NODE_SECOND_INPUT_CONNECTOR = eINSTANCE.getMergeNodeSecondInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeOutputConnectorImpl <em>Merge Node Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MergeNodeOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMergeNodeOutputConnector()
		 * @generated
		 */
		EClass MERGE_NODE_OUTPUT_CONNECTOR = eINSTANCE.getMergeNodeOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorImpl <em>Log Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediator()
		 * @generated
		 */
		EClass LOG_MEDIATOR = eINSTANCE.getLogMediator();

		/**
		 * The meta object literal for the '<em><b>Log Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_CATEGORY = eINSTANCE.getLogMediator_LogCategory();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_LEVEL = eINSTANCE.getLogMediator_LogLevel();

		/**
		 * The meta object literal for the '<em><b>Log Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_SEPARATOR = eINSTANCE.getLogMediator_LogSeparator();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getLogMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getLogMediator_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MEDIATOR__PROPERTIES = eINSTANCE.getLogMediator_Properties();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorInputConnectorImpl <em>Log Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediatorInputConnector()
		 * @generated
		 */
		EClass LOG_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getLogMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorOutputConnectorImpl <em>Log Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogMediatorOutputConnector()
		 * @generated
		 */
		EClass LOG_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getLogMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LogPropertyImpl <em>Log Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LogPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogProperty()
		 * @generated
		 */
		EClass LOG_PROPERTY = eINSTANCE.getLogProperty();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RegistryKeyPropertyImpl <em>Registry Key Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RegistryKeyPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRegistryKeyProperty()
		 * @generated
		 */
		EClass REGISTRY_KEY_PROPERTY = eINSTANCE.getRegistryKeyProperty();

		/**
		 * The meta object literal for the '<em><b>Pretty Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__PRETTY_NAME = eINSTANCE.getRegistryKeyProperty_PrettyName();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__KEY_NAME = eINSTANCE.getRegistryKeyProperty_KeyName();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__KEY_VALUE = eINSTANCE.getRegistryKeyProperty_KeyValue();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__FILTERS = eINSTANCE.getRegistryKeyProperty_Filters();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorImpl <em>Property Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediator()
		 * @generated
		 */
		EClass PROPERTY_MEDIATOR = eINSTANCE.getPropertyMediator();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_NAME = eINSTANCE.getPropertyMediator_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE = eINSTANCE.getPropertyMediator_PropertyDataType();

		/**
		 * The meta object literal for the '<em><b>Property Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_ACTION = eINSTANCE.getPropertyMediator_PropertyAction();

		/**
		 * The meta object literal for the '<em><b>Property Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_SCOPE = eINSTANCE.getPropertyMediator_PropertyScope();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_TYPE = eINSTANCE.getPropertyMediator_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_LITERAL = eINSTANCE.getPropertyMediator_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__EXPRESSION = eINSTANCE.getPropertyMediator_Expression();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__NAMESPACE_PREFIX = eINSTANCE.getPropertyMediator_NamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__NAMESPACE = eINSTANCE.getPropertyMediator_Namespace();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MEDIATOR__VALUE_EXPRESSION = eINSTANCE.getPropertyMediator_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value OM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_OM = eINSTANCE.getPropertyMediator_ValueOM();

		/**
		 * The meta object literal for the '<em><b>Value String Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_STRING_PATTERN = eINSTANCE.getPropertyMediator_ValueStringPattern();

		/**
		 * The meta object literal for the '<em><b>Value String Capturing Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP = eINSTANCE.getPropertyMediator_ValueStringCapturingGroup();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getPropertyMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getPropertyMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorInputConnectorImpl <em>Property Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediatorInputConnector()
		 * @generated
		 */
		EClass PROPERTY_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getPropertyMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorOutputConnectorImpl <em>Property Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.PropertyMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyMediatorOutputConnector()
		 * @generated
		 */
		EClass PROPERTY_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getPropertyMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.NamespacedPropertyImpl <em>Namespaced Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.NamespacedPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getNamespacedProperty()
		 * @generated
		 */
		EClass NAMESPACED_PROPERTY = eINSTANCE.getNamespacedProperty();

		/**
		 * The meta object literal for the '<em><b>Pretty Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PRETTY_NAME = eINSTANCE.getNamespacedProperty_PrettyName();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PROPERTY_NAME = eINSTANCE.getNamespacedProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PROPERTY_VALUE = eINSTANCE.getNamespacedProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__NAMESPACES = eINSTANCE.getNamespacedProperty_Namespaces();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorImpl <em>Enrich Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediator()
		 * @generated
		 */
		EClass ENRICH_MEDIATOR = eINSTANCE.getEnrichMediator();

		/**
		 * The meta object literal for the '<em><b>Clone Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__CLONE_SOURCE = eINSTANCE.getEnrichMediator_CloneSource();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_TYPE = eINSTANCE.getEnrichMediator_SourceType();

		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__SOURCE_XPATH = eINSTANCE.getEnrichMediator_SourceXpath();

		/**
		 * The meta object literal for the '<em><b>Source Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_PROPERTY = eINSTANCE.getEnrichMediator_SourceProperty();

		/**
		 * The meta object literal for the '<em><b>Source XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_XML = eINSTANCE.getEnrichMediator_SourceXML();

		/**
		 * The meta object literal for the '<em><b>Target Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_ACTION = eINSTANCE.getEnrichMediator_TargetAction();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_TYPE = eINSTANCE.getEnrichMediator_TargetType();

		/**
		 * The meta object literal for the '<em><b>Target Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__TARGET_XPATH = eINSTANCE.getEnrichMediator_TargetXpath();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_PROPERTY = eINSTANCE.getEnrichMediator_TargetProperty();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getEnrichMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getEnrichMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorInputConnectorImpl <em>Enrich Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediatorInputConnector()
		 * @generated
		 */
		EClass ENRICH_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getEnrichMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorOutputConnectorImpl <em>Enrich Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnrichMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichMediatorOutputConnector()
		 * @generated
		 */
		EClass ENRICH_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getEnrichMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValueExpressionPropertyImpl <em>Abstract Name Value Expression Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValueExpressionPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractNameValueExpressionProperty()
		 * @generated
		 */
		EClass ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY = eINSTANCE.getAbstractNameValueExpressionProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyValueType();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Property Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyExpression();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractBooleanFeatureImpl <em>Abstract Boolean Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractBooleanFeatureImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractBooleanFeature()
		 * @generated
		 */
		EClass ABSTRACT_BOOLEAN_FEATURE = eINSTANCE.getAbstractBooleanFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME = eINSTANCE.getAbstractBooleanFeature_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Feature Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED = eINSTANCE.getAbstractBooleanFeature_FeatureEnabled();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractLocationKeyResourceImpl <em>Abstract Location Key Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractLocationKeyResourceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractLocationKeyResource()
		 * @generated
		 */
		EClass ABSTRACT_LOCATION_KEY_RESOURCE = eINSTANCE.getAbstractLocationKeyResource();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION = eINSTANCE.getAbstractLocationKeyResource_Location();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LOCATION_KEY_RESOURCE__KEY = eINSTANCE.getAbstractLocationKeyResource_Key();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorImpl <em>XSLT Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediator()
		 * @generated
		 */
		EClass XSLT_MEDIATOR = eINSTANCE.getXSLTMediator();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getXSLTMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getXSLTMediator_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Xslt Schema Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSLT_MEDIATOR__XSLT_SCHEMA_KEY_TYPE = eINSTANCE.getXSLTMediator_XsltSchemaKeyType();

		/**
		 * The meta object literal for the '<em><b>Xslt Static Schema Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__XSLT_STATIC_SCHEMA_KEY = eINSTANCE.getXSLTMediator_XsltStaticSchemaKey();

		/**
		 * The meta object literal for the '<em><b>Xslt Dynamic Schema Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__XSLT_DYNAMIC_SCHEMA_KEY = eINSTANCE.getXSLTMediator_XsltDynamicSchemaKey();

		/**
		 * The meta object literal for the '<em><b>Xslt Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__XSLT_KEY = eINSTANCE.getXSLTMediator_XsltKey();

		/**
		 * The meta object literal for the '<em><b>Source XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__SOURCE_XPATH = eINSTANCE.getXSLTMediator_SourceXPath();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__PROPERTIES = eINSTANCE.getXSLTMediator_Properties();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__FEATURES = eINSTANCE.getXSLTMediator_Features();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__RESOURCES = eINSTANCE.getXSLTMediator_Resources();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTPropertyImpl <em>XSLT Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTProperty()
		 * @generated
		 */
		EClass XSLT_PROPERTY = eINSTANCE.getXSLTProperty();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTFeatureImpl <em>XSLT Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTFeatureImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTFeature()
		 * @generated
		 */
		EClass XSLT_FEATURE = eINSTANCE.getXSLTFeature();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTResourceImpl <em>XSLT Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTResourceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTResource()
		 * @generated
		 */
		EClass XSLT_RESOURCE = eINSTANCE.getXSLTResource();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorInputConnectorImpl <em>XSLT Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediatorInputConnector()
		 * @generated
		 */
		EClass XSLT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getXSLTMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorOutputConnectorImpl <em>XSLT Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XSLTMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXSLTMediatorOutputConnector()
		 * @generated
		 */
		EClass XSLT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getXSLTMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl <em>Switch Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchMediator()
		 * @generated
		 */
		EClass SWITCH_MEDIATOR = eINSTANCE.getSwitchMediator();

		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__SOURCE_XPATH = eINSTANCE.getSwitchMediator_SourceXpath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_MEDIATOR__SOURCE = eINSTANCE.getSwitchMediator_Source();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_MEDIATOR__NAMESPACE = eINSTANCE.getSwitchMediator_Namespace();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_MEDIATOR__NAMESPACE_PREFIX = eINSTANCE.getSwitchMediator_NamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Case Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__CASE_BRANCHES = eINSTANCE.getSwitchMediator_CaseBranches();

		/**
		 * The meta object literal for the '<em><b>Default Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__DEFAULT_BRANCH = eINSTANCE.getSwitchMediator_DefaultBranch();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getSwitchMediator_InputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchCaseBranchOutputConnectorImpl <em>Switch Case Branch Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchCaseBranchOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchCaseBranchOutputConnector()
		 * @generated
		 */
		EClass SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR = eINSTANCE.getSwitchCaseBranchOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Case Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR__CASE_REGEX = eINSTANCE.getSwitchCaseBranchOutputConnector_CaseRegex();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchDefaultBranchOutputConnectorImpl <em>Switch Default Branch Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchDefaultBranchOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchDefaultBranchOutputConnector()
		 * @generated
		 */
		EClass SWITCH_DEFAULT_BRANCH_OUTPUT_CONNECTOR = eINSTANCE.getSwitchDefaultBranchOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorInputConnectorImpl <em>Switch Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSwitchMediatorInputConnector()
		 * @generated
		 */
		EClass SWITCH_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getSwitchMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceDiagramImpl <em>Sequence Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceDiagramImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceDiagram()
		 * @generated
		 */
		EClass SEQUENCE_DIAGRAM = eINSTANCE.getSequenceDiagram();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_DIAGRAM__SEQUENCE = eINSTANCE.getSequenceDiagram_Sequence();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequence()
		 * @generated
		 */
		EClass ESB_SEQUENCE = eINSTANCE.getEsbSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESB_SEQUENCE__NAME = eINSTANCE.getEsbSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SEQUENCE__INPUT = eINSTANCE.getEsbSequence_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SEQUENCE__OUTPUT = eINSTANCE.getEsbSequence_Output();

		/**
		 * The meta object literal for the '<em><b>Child Mediators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SEQUENCE__CHILD_MEDIATORS = eINSTANCE.getEsbSequence_ChildMediators();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputImpl <em>Sequence Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceInput()
		 * @generated
		 */
		EClass ESB_SEQUENCE_INPUT = eINSTANCE.getEsbSequenceInput();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SEQUENCE_INPUT__CONNECTOR = eINSTANCE.getEsbSequenceInput_Connector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputImpl <em>Sequence Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceOutput()
		 * @generated
		 */
		EClass ESB_SEQUENCE_OUTPUT = eINSTANCE.getEsbSequenceOutput();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_SEQUENCE_OUTPUT__CONNECTOR = eINSTANCE.getEsbSequenceOutput_Connector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputConnectorImpl <em>Sequence Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceInputConnector()
		 * @generated
		 */
		EClass ESB_SEQUENCE_INPUT_CONNECTOR = eINSTANCE.getEsbSequenceInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputConnectorImpl <em>Sequence Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbSequenceOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEsbSequenceOutputConnector()
		 * @generated
		 */
		EClass ESB_SEQUENCE_OUTPUT_CONNECTOR = eINSTANCE.getEsbSequenceOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__KEY = eINSTANCE.getSequence_Key();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__INPUT_CONNECTOR = eINSTANCE.getSequence_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__OUTPUT_CONNECTOR = eINSTANCE.getSequence_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Included Mediators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__INCLUDED_MEDIATORS = eINSTANCE.getSequence_IncludedMediators();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceInputConnectorImpl <em>Sequence Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceInputConnector()
		 * @generated
		 */
		EClass SEQUENCE_INPUT_CONNECTOR = eINSTANCE.getSequenceInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceOutputConnectorImpl <em>Sequence Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSequenceOutputConnector()
		 * @generated
		 */
		EClass SEQUENCE_OUTPUT_CONNECTOR = eINSTANCE.getSequenceOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorImpl <em>Event Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediator()
		 * @generated
		 */
		EClass EVENT_MEDIATOR = eINSTANCE.getEventMediator();

		/**
		 * The meta object literal for the '<em><b>Topic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MEDIATOR__TOPIC_TYPE = eINSTANCE.getEventMediator_TopicType();

		/**
		 * The meta object literal for the '<em><b>Static Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MEDIATOR__STATIC_TOPIC = eINSTANCE.getEventMediator_StaticTopic();

		/**
		 * The meta object literal for the '<em><b>Dynamic Topic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MEDIATOR__DYNAMIC_TOPIC = eINSTANCE.getEventMediator_DynamicTopic();

		/**
		 * The meta object literal for the '<em><b>Event Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MEDIATOR__EVENT_EXPRESSION = eINSTANCE.getEventMediator_EventExpression();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getEventMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getEventMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorInputConnectorImpl <em>Event Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediatorInputConnector()
		 * @generated
		 */
		EClass EVENT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getEventMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorOutputConnectorImpl <em>Event Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EventMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventMediatorOutputConnector()
		 * @generated
		 */
		EClass EVENT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getEventMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValuePropertyImpl <em>Abstract Name Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractNameValuePropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractNameValueProperty()
		 * @generated
		 */
		EClass ABSTRACT_NAME_VALUE_PROPERTY = eINSTANCE.getAbstractNameValueProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME = eINSTANCE.getAbstractNameValueProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE = eINSTANCE.getAbstractNameValueProperty_PropertyValue();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl <em>Entitlement Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediator()
		 * @generated
		 */
		EClass ENTITLEMENT_MEDIATOR = eINSTANCE.getEntitlementMediator();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__SERVER_URL = eINSTANCE.getEntitlementMediator_ServerURL();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__USERNAME = eINSTANCE.getEntitlementMediator_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__PASSWORD = eINSTANCE.getEntitlementMediator_Password();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getEntitlementMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getEntitlementMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorInputConnectorImpl <em>Entitlement Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediatorInputConnector()
		 * @generated
		 */
		EClass ENTITLEMENT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getEntitlementMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorOutputConnectorImpl <em>Entitlement Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EntitlementMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEntitlementMediatorOutputConnector()
		 * @generated
		 */
		EClass ENTITLEMENT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getEntitlementMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl <em>Enqueue Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnqueueMediator()
		 * @generated
		 */
		EClass ENQUEUE_MEDIATOR = eINSTANCE.getEnqueueMediator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENQUEUE_MEDIATOR__EXECUTOR = eINSTANCE.getEnqueueMediator_Executor();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENQUEUE_MEDIATOR__PRIORITY = eINSTANCE.getEnqueueMediator_Priority();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENQUEUE_MEDIATOR__SEQUENCE_KEY = eINSTANCE.getEnqueueMediator_SequenceKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorImpl <em>Class Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediator()
		 * @generated
		 */
		EClass CLASS_MEDIATOR = eINSTANCE.getClassMediator();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MEDIATOR__CLASS_NAME = eINSTANCE.getClassMediator_ClassName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MEDIATOR__PROPERTIES = eINSTANCE.getClassMediator_Properties();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getClassMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getClassMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorInputConnectorImpl <em>Class Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediatorInputConnector()
		 * @generated
		 */
		EClass CLASS_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getClassMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorOutputConnectorImpl <em>Class Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassMediatorOutputConnector()
		 * @generated
		 */
		EClass CLASS_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getClassMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassPropertyImpl <em>Class Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ClassPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getClassProperty()
		 * @generated
		 */
		EClass CLASS_PROPERTY = eINSTANCE.getClassProperty();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorImpl <em>Spring Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediator()
		 * @generated
		 */
		EClass SPRING_MEDIATOR = eINSTANCE.getSpringMediator();

		/**
		 * The meta object literal for the '<em><b>Bean Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_MEDIATOR__BEAN_NAME = eINSTANCE.getSpringMediator_BeanName();

		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_MEDIATOR__CONFIGURATION_KEY = eINSTANCE.getSpringMediator_ConfigurationKey();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getSpringMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getSpringMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorInputConnectorImpl <em>Spring Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediatorInputConnector()
		 * @generated
		 */
		EClass SPRING_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getSpringMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorOutputConnectorImpl <em>Spring Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SpringMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSpringMediatorOutputConnector()
		 * @generated
		 */
		EClass SPRING_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getSpringMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl <em>Validate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateMediator()
		 * @generated
		 */
		EClass VALIDATE_MEDIATOR = eINSTANCE.getValidateMediator();

		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__SOURCE_XPATH = eINSTANCE.getValidateMediator_SourceXpath();

		/**
		 * The meta object literal for the '<em><b>On Fail Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__ON_FAIL_BRANCH = eINSTANCE.getValidateMediator_OnFailBranch();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__FEATURES = eINSTANCE.getValidateMediator_Features();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__SCHEMAS = eINSTANCE.getValidateMediator_Schemas();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateOnFailBranchImpl <em>Validate On Fail Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateOnFailBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateOnFailBranch()
		 * @generated
		 */
		EClass VALIDATE_ON_FAIL_BRANCH = eINSTANCE.getValidateOnFailBranch();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateFeatureImpl <em>Validate Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateFeatureImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateFeature()
		 * @generated
		 */
		EClass VALIDATE_FEATURE = eINSTANCE.getValidateFeature();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateSchemaImpl <em>Validate Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateSchemaImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getValidateSchema()
		 * @generated
		 */
		EClass VALIDATE_SCHEMA = eINSTANCE.getValidateSchema();

		/**
		 * The meta object literal for the '<em><b>Validate Static Schema Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_SCHEMA__VALIDATE_STATIC_SCHEMA_KEY = eINSTANCE.getValidateSchema_ValidateStaticSchemaKey();

		/**
		 * The meta object literal for the '<em><b>Validate Dynamic Schema Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_SCHEMA__VALIDATE_DYNAMIC_SCHEMA_KEY = eINSTANCE.getValidateSchema_ValidateDynamicSchemaKey();

		/**
		 * The meta object literal for the '<em><b>Validate Schema Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE_SCHEMA__VALIDATE_SCHEMA_KEY_TYPE = eINSTANCE.getValidateSchema_ValidateSchemaKeyType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl <em>Script Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediator()
		 * @generated
		 */
		EClass SCRIPT_MEDIATOR = eINSTANCE.getScriptMediator();

		/**
		 * The meta object literal for the '<em><b>Script Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_TYPE = eINSTANCE.getScriptMediator_ScriptType();

		/**
		 * The meta object literal for the '<em><b>Script Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_LANGUAGE = eINSTANCE.getScriptMediator_ScriptLanguage();

		/**
		 * The meta object literal for the '<em><b>Mediate Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__MEDIATE_FUNCTION = eINSTANCE.getScriptMediator_MediateFunction();

		/**
		 * The meta object literal for the '<em><b>Script Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MEDIATOR__SCRIPT_KEY = eINSTANCE.getScriptMediator_ScriptKey();

		/**
		 * The meta object literal for the '<em><b>Script Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_BODY = eINSTANCE.getScriptMediator_ScriptBody();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getScriptMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getScriptMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorInputConnectorImpl <em>Script Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediatorInputConnector()
		 * @generated
		 */
		EClass SCRIPT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getScriptMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorOutputConnectorImpl <em>Script Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptMediatorOutputConnector()
		 * @generated
		 */
		EClass SCRIPT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getScriptMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorImpl <em>Fault Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediator()
		 * @generated
		 */
		EClass FAULT_MEDIATOR = eINSTANCE.getFaultMediator();

		/**
		 * The meta object literal for the '<em><b>Soap Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__SOAP_VERSION = eINSTANCE.getFaultMediator_SoapVersion();

		/**
		 * The meta object literal for the '<em><b>Mark As Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__MARK_AS_RESPONSE = eINSTANCE.getFaultMediator_MarkAsResponse();

		/**
		 * The meta object literal for the '<em><b>Fault Code Soap11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_CODE_SOAP11 = eINSTANCE.getFaultMediator_FaultCodeSoap11();

		/**
		 * The meta object literal for the '<em><b>Fault String Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_STRING_TYPE = eINSTANCE.getFaultMediator_FaultStringType();

		/**
		 * The meta object literal for the '<em><b>Fault String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_STRING_VALUE = eINSTANCE.getFaultMediator_FaultStringValue();

		/**
		 * The meta object literal for the '<em><b>Fault String Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_STRING_EXPRESSION = eINSTANCE.getFaultMediator_FaultStringExpression();

		/**
		 * The meta object literal for the '<em><b>Fault Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_ACTOR = eINSTANCE.getFaultMediator_FaultActor();

		/**
		 * The meta object literal for the '<em><b>Fault Code Soap12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_CODE_SOAP12 = eINSTANCE.getFaultMediator_FaultCodeSoap12();

		/**
		 * The meta object literal for the '<em><b>Fault Reason Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_REASON_TYPE = eINSTANCE.getFaultMediator_FaultReasonType();

		/**
		 * The meta object literal for the '<em><b>Fault Reason Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_REASON_VALUE = eINSTANCE.getFaultMediator_FaultReasonValue();

		/**
		 * The meta object literal for the '<em><b>Fault Reason Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_REASON_EXPRESSION = eINSTANCE.getFaultMediator_FaultReasonExpression();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__ROLE_NAME = eINSTANCE.getFaultMediator_RoleName();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__NODE_NAME = eINSTANCE.getFaultMediator_NodeName();

		/**
		 * The meta object literal for the '<em><b>Fault Detail Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_DETAIL_TYPE = eINSTANCE.getFaultMediator_FaultDetailType();

		/**
		 * The meta object literal for the '<em><b>Fault Detail Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_DETAIL_VALUE = eINSTANCE.getFaultMediator_FaultDetailValue();

		/**
		 * The meta object literal for the '<em><b>Fault Detail Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_DETAIL_EXPRESSION = eINSTANCE.getFaultMediator_FaultDetailExpression();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getFaultMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getFaultMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorInputConnectorImpl <em>Fault Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediatorInputConnector()
		 * @generated
		 */
		EClass FAULT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getFaultMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorOutputConnectorImpl <em>Fault Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FaultMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultMediatorOutputConnector()
		 * @generated
		 */
		EClass FAULT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getFaultMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl <em>Aggregate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediator()
		 * @generated
		 */
		EClass AGGREGATE_MEDIATOR = eINSTANCE.getAggregateMediator();

		/**
		 * The meta object literal for the '<em><b>Aggregate ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__AGGREGATE_ID = eINSTANCE.getAggregateMediator_AggregateID();

		/**
		 * The meta object literal for the '<em><b>Correlation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION = eINSTANCE.getAggregateMediator_CorrelationExpression();

		/**
		 * The meta object literal for the '<em><b>Completion Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT = eINSTANCE.getAggregateMediator_CompletionTimeout();

		/**
		 * The meta object literal for the '<em><b>Completion Min Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES = eINSTANCE.getAggregateMediator_CompletionMinMessages();

		/**
		 * The meta object literal for the '<em><b>Completion Max Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES = eINSTANCE.getAggregateMediator_CompletionMaxMessages();

		/**
		 * The meta object literal for the '<em><b>On Complete Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH = eINSTANCE.getAggregateMediator_OnCompleteBranch();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getAggregateMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getAggregateMediator_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>On Complete Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR = eINSTANCE.getAggregateMediator_OnCompleteOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__CHILDREN = eINSTANCE.getAggregateMediator_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorInputConnectorImpl <em>Aggregate Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorInputConnector()
		 * @generated
		 */
		EClass AGGREGATE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getAggregateMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOutputConnectorImpl <em>Aggregate Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorOutputConnector()
		 * @generated
		 */
		EClass AGGREGATE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getAggregateMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOnCompleteOutputConnectorImpl <em>Aggregate Mediator On Complete Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateMediatorOnCompleteOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateMediatorOnCompleteOutputConnector()
		 * @generated
		 */
		EClass AGGREGATE_MEDIATOR_ON_COMPLETE_OUTPUT_CONNECTOR = eINSTANCE.getAggregateMediatorOnCompleteOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl <em>Aggregate On Complete Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateOnCompleteBranch()
		 * @generated
		 */
		EClass AGGREGATE_ON_COMPLETE_BRANCH = eINSTANCE.getAggregateOnCompleteBranch();

		/**
		 * The meta object literal for the '<em><b>Aggregation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION = eINSTANCE.getAggregateOnCompleteBranch_AggregationExpression();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE = eINSTANCE.getAggregateOnCompleteBranch_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY = eINSTANCE.getAggregateOnCompleteBranch_SequenceKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl <em>Router Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouterMediator()
		 * @generated
		 */
		EClass ROUTER_MEDIATOR = eINSTANCE.getRouterMediator();

		/**
		 * The meta object literal for the '<em><b>Continue After Routing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING = eINSTANCE.getRouterMediator_ContinueAfterRouting();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_MEDIATOR__ROUTES = eINSTANCE.getRouterMediator_Routes();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterRouteImpl <em>Router Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterRouteImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouterRoute()
		 * @generated
		 */
		EClass ROUTER_ROUTE = eINSTANCE.getRouterRoute();

		/**
		 * The meta object literal for the '<em><b>Break After Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_ROUTE__BREAK_AFTER_ROUTE = eINSTANCE.getRouterRoute_BreakAfterRoute();

		/**
		 * The meta object literal for the '<em><b>Route Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_ROUTE__ROUTE_EXPRESSION = eINSTANCE.getRouterRoute_RouteExpression();

		/**
		 * The meta object literal for the '<em><b>Route Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_ROUTE__ROUTE_PATTERN = eINSTANCE.getRouterRoute_RoutePattern();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_ROUTE__TARGET = eINSTANCE.getRouterRoute_Target();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouteTargetImpl <em>Route Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RouteTargetImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRouteTarget()
		 * @generated
		 */
		EClass ROUTE_TARGET = eINSTANCE.getRouteTarget();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorImpl <em>Clone Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediator()
		 * @generated
		 */
		EClass CLONE_MEDIATOR = eINSTANCE.getCloneMediator();

		/**
		 * The meta object literal for the '<em><b>Clone ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR__CLONE_ID = eINSTANCE.getCloneMediator_CloneID();

		/**
		 * The meta object literal for the '<em><b>Sequential Mediation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR__SEQUENTIAL_MEDIATION = eINSTANCE.getCloneMediator_SequentialMediation();

		/**
		 * The meta object literal for the '<em><b>Continue Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR__CONTINUE_PARENT = eINSTANCE.getCloneMediator_ContinueParent();

		/**
		 * The meta object literal for the '<em><b>Targets Output Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONE_MEDIATOR__TARGETS_OUTPUT_CONNECTOR = eINSTANCE.getCloneMediator_TargetsOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getCloneMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getCloneMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorInputConnectorImpl <em>Clone Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorInputConnector()
		 * @generated
		 */
		EClass CLONE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getCloneMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorOutputConnectorImpl <em>Clone Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorOutputConnector()
		 * @generated
		 */
		EClass CLONE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getCloneMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorTargetOutputConnectorImpl <em>Clone Mediator Target Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CloneMediatorTargetOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCloneMediatorTargetOutputConnector()
		 * @generated
		 */
		EClass CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR = eINSTANCE.getCloneMediatorTargetOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR__SOAP_ACTION = eINSTANCE.getCloneMediatorTargetOutputConnector_SoapAction();

		/**
		 * The meta object literal for the '<em><b>To Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR__TO_ADDRESS = eINSTANCE.getCloneMediatorTargetOutputConnector_ToAddress();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorImpl <em>Iterate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediator()
		 * @generated
		 */
		EClass ITERATE_MEDIATOR = eINSTANCE.getIterateMediator();

		/**
		 * The meta object literal for the '<em><b>Iterate ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__ITERATE_ID = eINSTANCE.getIterateMediator_IterateID();

		/**
		 * The meta object literal for the '<em><b>Sequential Mediation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__SEQUENTIAL_MEDIATION = eINSTANCE.getIterateMediator_SequentialMediation();

		/**
		 * The meta object literal for the '<em><b>Continue Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__CONTINUE_PARENT = eINSTANCE.getIterateMediator_ContinueParent();

		/**
		 * The meta object literal for the '<em><b>Preserve Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__PRESERVE_PAYLOAD = eINSTANCE.getIterateMediator_PreservePayload();

		/**
		 * The meta object literal for the '<em><b>Iterate Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__ITERATE_EXPRESSION = eINSTANCE.getIterateMediator_IterateExpression();

		/**
		 * The meta object literal for the '<em><b>Attach Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__ATTACH_PATH = eINSTANCE.getIterateMediator_AttachPath();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__TARGET = eINSTANCE.getIterateMediator_Target();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getIterateMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getIterateMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorInputConnectorImpl <em>Iterate Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediatorInputConnector()
		 * @generated
		 */
		EClass ITERATE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getIterateMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorOutputConnectorImpl <em>Iterate Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateMediatorOutputConnector()
		 * @generated
		 */
		EClass ITERATE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getIterateMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateTargetImpl <em>Iterate Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.IterateTargetImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getIterateTarget()
		 * @generated
		 */
		EClass ITERATE_TARGET = eINSTANCE.getIterateTarget();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TARGET__SOAP_ACTION = eINSTANCE.getIterateTarget_SoapAction();

		/**
		 * The meta object literal for the '<em><b>To Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TARGET__TO_ADDRESS = eINSTANCE.getIterateTarget_ToAddress();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractCommonTargetImpl <em>Abstract Common Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractCommonTargetImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractCommonTarget()
		 * @generated
		 */
		EClass ABSTRACT_COMMON_TARGET = eINSTANCE.getAbstractCommonTarget();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE = eINSTANCE.getAbstractCommonTarget_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__SEQUENCE = eINSTANCE.getAbstractCommonTarget_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__SEQUENCE_KEY = eINSTANCE.getAbstractCommonTarget_SequenceKey();

		/**
		 * The meta object literal for the '<em><b>Endpoint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE = eINSTANCE.getAbstractCommonTarget_EndpointType();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__ENDPOINT = eINSTANCE.getAbstractCommonTarget_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__ENDPOINT_KEY = eINSTANCE.getAbstractCommonTarget_EndpointKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorSequenceImpl <em>Mediator Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.MediatorSequenceImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMediatorSequence()
		 * @generated
		 */
		EClass MEDIATOR_SEQUENCE = eINSTANCE.getMediatorSequence();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_SEQUENCE__ANONYMOUS = eINSTANCE.getMediatorSequence_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_SEQUENCE__SEQUENCE_NAME = eINSTANCE.getMediatorSequence_SequenceName();

		/**
		 * The meta object literal for the '<em><b>Mediators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_SEQUENCE__MEDIATORS = eINSTANCE.getMediatorSequence_Mediators();

		/**
		 * The meta object literal for the '<em><b>On Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_SEQUENCE__ON_ERROR = eINSTANCE.getMediatorSequence_OnError();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_SEQUENCE__DESCRIPTION = eINSTANCE.getMediatorSequence_Description();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorImpl <em>Cache Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediator()
		 * @generated
		 */
		EClass CACHE_MEDIATOR = eINSTANCE.getCacheMediator();

		/**
		 * The meta object literal for the '<em><b>Cache Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_ID = eINSTANCE.getCacheMediator_CacheId();

		/**
		 * The meta object literal for the '<em><b>Cache Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_SCOPE = eINSTANCE.getCacheMediator_CacheScope();

		/**
		 * The meta object literal for the '<em><b>Cache Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_ACTION = eINSTANCE.getCacheMediator_CacheAction();

		/**
		 * The meta object literal for the '<em><b>Hash Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__HASH_GENERATOR = eINSTANCE.getCacheMediator_HashGenerator();

		/**
		 * The meta object literal for the '<em><b>Cache Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_TIMEOUT = eINSTANCE.getCacheMediator_CacheTimeout();

		/**
		 * The meta object literal for the '<em><b>Max Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__MAX_MESSAGE_SIZE = eINSTANCE.getCacheMediator_MaxMessageSize();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__IMPLEMENTATION_TYPE = eINSTANCE.getCacheMediator_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Max Entry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__MAX_ENTRY_COUNT = eINSTANCE.getCacheMediator_MaxEntryCount();

		/**
		 * The meta object literal for the '<em><b>On Hit Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_MEDIATOR__ON_HIT_BRANCH = eINSTANCE.getCacheMediator_OnHitBranch();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getCacheMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getCacheMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorInputConnectorImpl <em>Cache Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediatorInputConnector()
		 * @generated
		 */
		EClass CACHE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getCacheMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorOutputConnectorImpl <em>Cache Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheMediatorOutputConnector()
		 * @generated
		 */
		EClass CACHE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getCacheMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl <em>Cache On Hit Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheOnHitBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheOnHitBranch()
		 * @generated
		 */
		EClass CACHE_ON_HIT_BRANCH = eINSTANCE.getCacheOnHitBranch();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getCacheOnHitBranch_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_ON_HIT_BRANCH__SEQUENCE_KEY = eINSTANCE.getCacheOnHitBranch_SequenceKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorImpl <em>XQuery Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediator()
		 * @generated
		 */
		EClass XQUERY_MEDIATOR = eINSTANCE.getXQueryMediator();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__VARIABLES = eINSTANCE.getXQueryMediator_Variables();

		/**
		 * The meta object literal for the '<em><b>Target XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__TARGET_XPATH = eINSTANCE.getXQueryMediator_TargetXPath();

		/**
		 * The meta object literal for the '<em><b>Script Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_MEDIATOR__SCRIPT_KEY_TYPE = eINSTANCE.getXQueryMediator_ScriptKeyType();

		/**
		 * The meta object literal for the '<em><b>Static Script Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__STATIC_SCRIPT_KEY = eINSTANCE.getXQueryMediator_StaticScriptKey();

		/**
		 * The meta object literal for the '<em><b>Dynamic Script Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__DYNAMIC_SCRIPT_KEY = eINSTANCE.getXQueryMediator_DynamicScriptKey();

		/**
		 * The meta object literal for the '<em><b>Query Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__QUERY_KEY = eINSTANCE.getXQueryMediator_QueryKey();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getXQueryMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getXQueryMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorInputConnectorImpl <em>XQuery Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediatorInputConnector()
		 * @generated
		 */
		EClass XQUERY_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getXQueryMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorOutputConnectorImpl <em>XQuery Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryMediatorOutputConnector()
		 * @generated
		 */
		EClass XQUERY_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getXQueryMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryVariableImpl <em>XQuery Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.XQueryVariableImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariable()
		 * @generated
		 */
		EClass XQUERY_VARIABLE = eINSTANCE.getXQueryVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VARIABLE_NAME = eINSTANCE.getXQueryVariable_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VARIABLE_TYPE = eINSTANCE.getXQueryVariable_VariableType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VALUE_TYPE = eINSTANCE.getXQueryVariable_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VALUE_LITERAL = eINSTANCE.getXQueryVariable_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_VARIABLE__VALUE_EXPRESSION = eINSTANCE.getXQueryVariable_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_VARIABLE__VALUE_KEY = eINSTANCE.getXQueryVariable_ValueKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl <em>Callout Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediator()
		 * @generated
		 */
		EClass CALLOUT_MEDIATOR = eINSTANCE.getCalloutMediator();

		/**
		 * The meta object literal for the '<em><b>Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__SERVICE_URL = eINSTANCE.getCalloutMediator_ServiceURL();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__SOAP_ACTION = eINSTANCE.getCalloutMediator_SoapAction();

		/**
		 * The meta object literal for the '<em><b>Path To Axis2xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PATH_TO_AXIS2XML = eINSTANCE.getCalloutMediator_PathToAxis2xml();

		/**
		 * The meta object literal for the '<em><b>Path To Axis2 Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY = eINSTANCE.getCalloutMediator_PathToAxis2Repository();

		/**
		 * The meta object literal for the '<em><b>Payload Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PAYLOAD_TYPE = eINSTANCE.getCalloutMediator_PayloadType();

		/**
		 * The meta object literal for the '<em><b>Payload Message Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH = eINSTANCE.getCalloutMediator_PayloadMessageXpath();

		/**
		 * The meta object literal for the '<em><b>Payload Registry Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY = eINSTANCE.getCalloutMediator_PayloadRegistryKey();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__RESULT_TYPE = eINSTANCE.getCalloutMediator_ResultType();

		/**
		 * The meta object literal for the '<em><b>Result Message Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH = eINSTANCE.getCalloutMediator_ResultMessageXpath();

		/**
		 * The meta object literal for the '<em><b>Result Context Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY = eINSTANCE.getCalloutMediator_ResultContextProperty();

		/**
		 * The meta object literal for the '<em><b>Pass Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PASS_HEADERS = eINSTANCE.getCalloutMediator_PassHeaders();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getCalloutMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getCalloutMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorInputConnectorImpl <em>Callout Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediatorInputConnector()
		 * @generated
		 */
		EClass CALLOUT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getCalloutMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorOutputConnectorImpl <em>Callout Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CalloutMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutMediatorOutputConnector()
		 * @generated
		 */
		EClass CALLOUT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getCalloutMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorImpl <em>RM Sequence Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediator()
		 * @generated
		 */
		EClass RM_SEQUENCE_MEDIATOR = eINSTANCE.getRMSequenceMediator();

		/**
		 * The meta object literal for the '<em><b>Rm Spec Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION = eINSTANCE.getRMSequenceMediator_RmSpecVersion();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE = eINSTANCE.getRMSequenceMediator_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Correlation Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__CORRELATION_XPATH = eINSTANCE.getRMSequenceMediator_CorrelationXpath();

		/**
		 * The meta object literal for the '<em><b>Last Message Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__LAST_MESSAGE_XPATH = eINSTANCE.getRMSequenceMediator_LastMessageXpath();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getRMSequenceMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getRMSequenceMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorInputConnectorImpl <em>RM Sequence Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediatorInputConnector()
		 * @generated
		 */
		EClass RM_SEQUENCE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getRMSequenceMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorOutputConnectorImpl <em>RM Sequence Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RMSequenceMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceMediatorOutputConnector()
		 * @generated
		 */
		EClass RM_SEQUENCE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getRMSequenceMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorImpl <em>Transaction Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediator()
		 * @generated
		 */
		EClass TRANSACTION_MEDIATOR = eINSTANCE.getTransactionMediator();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_MEDIATOR__ACTION = eINSTANCE.getTransactionMediator_Action();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getTransactionMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getTransactionMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorInputConnectorImpl <em>Transaction Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediatorInputConnector()
		 * @generated
		 */
		EClass TRANSACTION_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getTransactionMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorOutputConnectorImpl <em>Transaction Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.TransactionMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionMediatorOutputConnector()
		 * @generated
		 */
		EClass TRANSACTION_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getTransactionMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorImpl <em>OAuth Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediator()
		 * @generated
		 */
		EClass OAUTH_MEDIATOR = eINSTANCE.getOAuthMediator();

		/**
		 * The meta object literal for the '<em><b>Remote Service Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_MEDIATOR__REMOTE_SERVICE_URL = eINSTANCE.getOAuthMediator_RemoteServiceUrl();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getOAuthMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getOAuthMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorInputConnectorImpl <em>OAuth Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediatorInputConnector()
		 * @generated
		 */
		EClass OAUTH_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getOAuthMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorOutputConnectorImpl <em>OAuth Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.OAuthMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOAuthMediatorOutputConnector()
		 * @generated
		 */
		EClass OAUTH_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getOAuthMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleInMediatorImpl <em>Autoscale In Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleInMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAutoscaleInMediator()
		 * @generated
		 */
		EClass AUTOSCALE_IN_MEDIATOR = eINSTANCE.getAutoscaleInMediator();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleOutMediatorImpl <em>Autoscale Out Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AutoscaleOutMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAutoscaleOutMediator()
		 * @generated
		 */
		EClass AUTOSCALE_OUT_MEDIATOR = eINSTANCE.getAutoscaleOutMediator();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorImpl <em>Header Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediator()
		 * @generated
		 */
		EClass HEADER_MEDIATOR = eINSTANCE.getHeaderMediator();

		/**
		 * The meta object literal for the '<em><b>Header Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__HEADER_NAME = eINSTANCE.getHeaderMediator_HeaderName();

		/**
		 * The meta object literal for the '<em><b>Header Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__HEADER_ACTION = eINSTANCE.getHeaderMediator_HeaderAction();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__VALUE_TYPE = eINSTANCE.getHeaderMediator_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__VALUE_LITERAL = eINSTANCE.getHeaderMediator_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__VALUE_EXPRESSION = eINSTANCE.getHeaderMediator_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getHeaderMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getHeaderMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorInputConnectorImpl <em>Header Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediatorInputConnector()
		 * @generated
		 */
		EClass HEADER_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getHeaderMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorOutputConnectorImpl <em>Header Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.HeaderMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderMediatorOutputConnector()
		 * @generated
		 */
		EClass HEADER_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getHeaderMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl <em>Throttle Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediator()
		 * @generated
		 */
		EClass THROTTLE_MEDIATOR = eINSTANCE.getThrottleMediator();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_MEDIATOR__GROUP_ID = eINSTANCE.getThrottleMediator_GroupId();

		/**
		 * The meta object literal for the '<em><b>Policy Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__POLICY_CONFIGURATION = eINSTANCE.getThrottleMediator_PolicyConfiguration();

		/**
		 * The meta object literal for the '<em><b>On Accept Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH = eINSTANCE.getThrottleMediator_OnAcceptBranch();

		/**
		 * The meta object literal for the '<em><b>On Reject Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__ON_REJECT_BRANCH = eINSTANCE.getThrottleMediator_OnRejectBranch();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getThrottleMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getThrottleMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorInputConnectorImpl <em>Throttle Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediatorInputConnector()
		 * @generated
		 */
		EClass THROTTLE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getThrottleMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorOutputConnectorImpl <em>Throttle Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleMediatorOutputConnector()
		 * @generated
		 */
		EClass THROTTLE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getThrottleMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyConfigurationImpl <em>Throttle Policy Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyConfiguration()
		 * @generated
		 */
		EClass THROTTLE_POLICY_CONFIGURATION = eINSTANCE.getThrottlePolicyConfiguration();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_CONFIGURATION__POLICY_TYPE = eINSTANCE.getThrottlePolicyConfiguration_PolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_POLICY_CONFIGURATION__POLICY_KEY = eINSTANCE.getThrottlePolicyConfiguration_PolicyKey();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Access Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_CONFIGURATION__MAX_CONCURRENT_ACCESS_COUNT = eINSTANCE.getThrottlePolicyConfiguration_MaxConcurrentAccessCount();

		/**
		 * The meta object literal for the '<em><b>Policy Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_POLICY_CONFIGURATION__POLICY_ENTRIES = eINSTANCE.getThrottlePolicyConfiguration_PolicyEntries();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyEntryImpl <em>Throttle Policy Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottlePolicyEntryImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyEntry()
		 * @generated
		 */
		EClass THROTTLE_POLICY_ENTRY = eINSTANCE.getThrottlePolicyEntry();

		/**
		 * The meta object literal for the '<em><b>Throttle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__THROTTLE_TYPE = eINSTANCE.getThrottlePolicyEntry_ThrottleType();

		/**
		 * The meta object literal for the '<em><b>Throttle Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__THROTTLE_RANGE = eINSTANCE.getThrottlePolicyEntry_ThrottleRange();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__ACCESS_TYPE = eINSTANCE.getThrottlePolicyEntry_AccessType();

		/**
		 * The meta object literal for the '<em><b>Max Request Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__MAX_REQUEST_COUNT = eINSTANCE.getThrottlePolicyEntry_MaxRequestCount();

		/**
		 * The meta object literal for the '<em><b>Unit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__UNIT_TIME = eINSTANCE.getThrottlePolicyEntry_UnitTime();

		/**
		 * The meta object literal for the '<em><b>Prohibit Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__PROHIBIT_PERIOD = eINSTANCE.getThrottlePolicyEntry_ProhibitPeriod();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnAcceptBranchImpl <em>Throttle On Accept Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnAcceptBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleOnAcceptBranch()
		 * @generated
		 */
		EClass THROTTLE_ON_ACCEPT_BRANCH = eINSTANCE.getThrottleOnAcceptBranch();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getThrottleOnAcceptBranch_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_KEY = eINSTANCE.getThrottleOnAcceptBranch_SequenceKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnRejectBranchImpl <em>Throttle On Reject Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleOnRejectBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleOnRejectBranch()
		 * @generated
		 */
		EClass THROTTLE_ON_REJECT_BRANCH = eINSTANCE.getThrottleOnRejectBranch();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_ON_REJECT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getThrottleOnRejectBranch_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_ON_REJECT_BRANCH__SEQUENCE_KEY = eINSTANCE.getThrottleOnRejectBranch_SequenceKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorImpl <em>Command Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediator()
		 * @generated
		 */
		EClass COMMAND_MEDIATOR = eINSTANCE.getCommandMediator();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_MEDIATOR__CLASS_NAME = eINSTANCE.getCommandMediator_ClassName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_MEDIATOR__PROPERTIES = eINSTANCE.getCommandMediator_Properties();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getCommandMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getCommandMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorInputConnectorImpl <em>Command Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediatorInputConnector()
		 * @generated
		 */
		EClass COMMAND_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getCommandMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorOutputConnectorImpl <em>Command Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandMediatorOutputConnector()
		 * @generated
		 */
		EClass COMMAND_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getCommandMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandPropertyImpl <em>Command Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.CommandPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandProperty()
		 * @generated
		 */
		EClass COMMAND_PROPERTY = eINSTANCE.getCommandProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__PROPERTY_NAME = eINSTANCE.getCommandProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_TYPE = eINSTANCE.getCommandProperty_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_LITERAL = eINSTANCE.getCommandProperty_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Context Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_CONTEXT_PROPERTY_NAME = eINSTANCE.getCommandProperty_ValueContextPropertyName();

		/**
		 * The meta object literal for the '<em><b>Value Message Element Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PROPERTY__VALUE_MESSAGE_ELEMENT_XPATH = eINSTANCE.getCommandProperty_ValueMessageElementXpath();

		/**
		 * The meta object literal for the '<em><b>Context Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__CONTEXT_ACTION = eINSTANCE.getCommandProperty_ContextAction();

		/**
		 * The meta object literal for the '<em><b>Message Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__MESSAGE_ACTION = eINSTANCE.getCommandProperty_MessageAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractSqlExecutorMediatorImpl <em>Abstract Sql Executor Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.AbstractSqlExecutorMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAbstractSqlExecutorMediator()
		 * @generated
		 */
		EClass ABSTRACT_SQL_EXECUTOR_MEDIATOR = eINSTANCE.getAbstractSqlExecutorMediator();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Connection Ds Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsType();

		/**
		 * The meta object literal for the '<em><b>Connection Db Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDbDriver();

		/**
		 * The meta object literal for the '<em><b>Connection Ds Initial Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsInitialContext();

		/**
		 * The meta object literal for the '<em><b>Connection Ds Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsName();

		/**
		 * The meta object literal for the '<em><b>Connection URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionURL();

		/**
		 * The meta object literal for the '<em><b>Connection Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionUsername();

		/**
		 * The meta object literal for the '<em><b>Connection Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionPassword();

		/**
		 * The meta object literal for the '<em><b>Property Autocommit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT = eINSTANCE.getAbstractSqlExecutorMediator_PropertyAutocommit();

		/**
		 * The meta object literal for the '<em><b>Property Isolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION = eINSTANCE.getAbstractSqlExecutorMediator_PropertyIsolation();

		/**
		 * The meta object literal for the '<em><b>Property Maxactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxactive();

		/**
		 * The meta object literal for the '<em><b>Property Maxidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxidle();

		/**
		 * The meta object literal for the '<em><b>Property Maxopenstatements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxopenstatements();

		/**
		 * The meta object literal for the '<em><b>Property Maxwait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxwait();

		/**
		 * The meta object literal for the '<em><b>Property Minidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMinidle();

		/**
		 * The meta object literal for the '<em><b>Property Poolstatements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_PropertyPoolstatements();

		/**
		 * The meta object literal for the '<em><b>Property Testonborrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW = eINSTANCE.getAbstractSqlExecutorMediator_PropertyTestonborrow();

		/**
		 * The meta object literal for the '<em><b>Property Testwhileidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyTestwhileidle();

		/**
		 * The meta object literal for the '<em><b>Property Validationquery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY = eINSTANCE.getAbstractSqlExecutorMediator_PropertyValidationquery();

		/**
		 * The meta object literal for the '<em><b>Property Initialsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyInitialsize();

		/**
		 * The meta object literal for the '<em><b>Sql Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_SqlStatements();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlStatementImpl <em>Sql Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlStatementImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlStatement()
		 * @generated
		 */
		EClass SQL_STATEMENT = eINSTANCE.getSqlStatement();

		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__QUERY_STRING = eINSTANCE.getSqlStatement_QueryString();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STATEMENT__PARAMETERS = eINSTANCE.getSqlStatement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Results Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__RESULTS_ENABLED = eINSTANCE.getSqlStatement_ResultsEnabled();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STATEMENT__RESULTS = eINSTANCE.getSqlStatement_Results();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlParameterDefinitionImpl <em>Sql Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlParameterDefinitionImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterDefinition()
		 * @generated
		 */
		EClass SQL_PARAMETER_DEFINITION = eINSTANCE.getSqlParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__DATA_TYPE = eINSTANCE.getSqlParameterDefinition_DataType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__VALUE_TYPE = eINSTANCE.getSqlParameterDefinition_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__VALUE_LITERAL = eINSTANCE.getSqlParameterDefinition_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_PARAMETER_DEFINITION__VALUE_EXPRESSION = eINSTANCE.getSqlParameterDefinition_ValueExpression();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlResultMappingImpl <em>Sql Result Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SqlResultMappingImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlResultMapping()
		 * @generated
		 */
		EClass SQL_RESULT_MAPPING = eINSTANCE.getSqlResultMapping();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_RESULT_MAPPING__PROPERTY_NAME = eINSTANCE.getSqlResultMapping_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Column Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_RESULT_MAPPING__COLUMN_ID = eINSTANCE.getSqlResultMapping_ColumnId();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorImpl <em>DB Lookup Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediator()
		 * @generated
		 */
		EClass DB_LOOKUP_MEDIATOR = eINSTANCE.getDBLookupMediator();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_LOOKUP_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getDBLookupMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_LOOKUP_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getDBLookupMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorInputConnectorImpl <em>DB Lookup Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediatorInputConnector()
		 * @generated
		 */
		EClass DB_LOOKUP_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getDBLookupMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorOutputConnectorImpl <em>DB Lookup Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBLookupMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBLookupMediatorOutputConnector()
		 * @generated
		 */
		EClass DB_LOOKUP_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getDBLookupMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorImpl <em>DB Report Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediator()
		 * @generated
		 */
		EClass DB_REPORT_MEDIATOR = eINSTANCE.getDBReportMediator();

		/**
		 * The meta object literal for the '<em><b>Connection Use Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION = eINSTANCE.getDBReportMediator_ConnectionUseTransaction();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_REPORT_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getDBReportMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_REPORT_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getDBReportMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorInputConnectorImpl <em>DB Report Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediatorInputConnector()
		 * @generated
		 */
		EClass DB_REPORT_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getDBReportMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorOutputConnectorImpl <em>DB Report Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.DBReportMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getDBReportMediatorOutputConnector()
		 * @generated
		 */
		EClass DB_REPORT_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getDBReportMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl <em>Rule Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediator()
		 * @generated
		 */
		EClass RULE_MEDIATOR = eINSTANCE.getRuleMediator();

		/**
		 * The meta object literal for the '<em><b>Rule Set Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RULE_SET_CONFIGURATION = eINSTANCE.getRuleMediator_RuleSetConfiguration();

		/**
		 * The meta object literal for the '<em><b>Rule Session Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RULE_SESSION_CONFIGURATION = eINSTANCE.getRuleMediator_RuleSessionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Facts Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__FACTS_CONFIGURATION = eINSTANCE.getRuleMediator_FactsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Results Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RESULTS_CONFIGURATION = eINSTANCE.getRuleMediator_ResultsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Child Mediators Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION = eINSTANCE.getRuleMediator_ChildMediatorsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getRuleMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getRuleMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorInputConnectorImpl <em>Rule Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediatorInputConnector()
		 * @generated
		 */
		EClass RULE_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getRuleMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorOutputConnectorImpl <em>Rule Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleMediatorOutputConnector()
		 * @generated
		 */
		EClass RULE_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getRuleMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl <em>Rule Set Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSetConfiguration()
		 * @generated
		 */
		EClass RULE_SET_CONFIGURATION = eINSTANCE.getRuleSetConfiguration();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET_CONFIGURATION__SOURCE_TYPE = eINSTANCE.getRuleSetConfiguration_SourceType();

		/**
		 * The meta object literal for the '<em><b>Source Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET_CONFIGURATION__SOURCE_CODE = eINSTANCE.getRuleSetConfiguration_SourceCode();

		/**
		 * The meta object literal for the '<em><b>Source Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET_CONFIGURATION__SOURCE_KEY = eINSTANCE.getRuleSetConfiguration_SourceKey();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET_CONFIGURATION__PROPERTIES = eINSTANCE.getRuleSetConfiguration_Properties();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetCreationPropertyImpl <em>Rule Set Creation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetCreationPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSetCreationProperty()
		 * @generated
		 */
		EClass RULE_SET_CREATION_PROPERTY = eINSTANCE.getRuleSetCreationProperty();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionConfigurationImpl <em>Rule Session Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSessionConfiguration()
		 * @generated
		 */
		EClass RULE_SESSION_CONFIGURATION = eINSTANCE.getRuleSessionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Stateful Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SESSION_CONFIGURATION__STATEFUL_SESSION = eINSTANCE.getRuleSessionConfiguration_StatefulSession();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SESSION_CONFIGURATION__PROPERTIES = eINSTANCE.getRuleSessionConfiguration_Properties();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionPropertyImpl <em>Rule Session Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSessionPropertyImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSessionProperty()
		 * @generated
		 */
		EClass RULE_SESSION_PROPERTY = eINSTANCE.getRuleSessionProperty();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactsConfigurationImpl <em>Rule Facts Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactsConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactsConfiguration()
		 * @generated
		 */
		EClass RULE_FACTS_CONFIGURATION = eINSTANCE.getRuleFactsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTS_CONFIGURATION__FACTS = eINSTANCE.getRuleFactsConfiguration_Facts();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactImpl <em>Rule Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleFactImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFact()
		 * @generated
		 */
		EClass RULE_FACT = eINSTANCE.getRuleFact();

		/**
		 * The meta object literal for the '<em><b>Fact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_TYPE = eINSTANCE.getRuleFact_FactType();

		/**
		 * The meta object literal for the '<em><b>Fact Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_CUSTOM_TYPE = eINSTANCE.getRuleFact_FactCustomType();

		/**
		 * The meta object literal for the '<em><b>Fact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_NAME = eINSTANCE.getRuleFact_FactName();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__VALUE_TYPE = eINSTANCE.getRuleFact_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__VALUE_LITERAL = eINSTANCE.getRuleFact_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACT__VALUE_EXPRESSION = eINSTANCE.getRuleFact_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACT__VALUE_KEY = eINSTANCE.getRuleFact_ValueKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultsConfigurationImpl <em>Rule Results Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultsConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultsConfiguration()
		 * @generated
		 */
		EClass RULE_RESULTS_CONFIGURATION = eINSTANCE.getRuleResultsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULTS_CONFIGURATION__RESULTS = eINSTANCE.getRuleResultsConfiguration_Results();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultImpl <em>Rule Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleResultImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResult()
		 * @generated
		 */
		EClass RULE_RESULT = eINSTANCE.getRuleResult();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_TYPE = eINSTANCE.getRuleResult_ResultType();

		/**
		 * The meta object literal for the '<em><b>Result Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_CUSTOM_TYPE = eINSTANCE.getRuleResult_ResultCustomType();

		/**
		 * The meta object literal for the '<em><b>Result Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_NAME = eINSTANCE.getRuleResult_ResultName();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__VALUE_TYPE = eINSTANCE.getRuleResult_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__VALUE_LITERAL = eINSTANCE.getRuleResult_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULT__VALUE_EXPRESSION = eINSTANCE.getRuleResult_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULT__VALUE_KEY = eINSTANCE.getRuleResult_ValueKey();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleChildMediatorsConfigurationImpl <em>Rule Child Mediators Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleChildMediatorsConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleChildMediatorsConfiguration()
		 * @generated
		 */
		EClass RULE_CHILD_MEDIATORS_CONFIGURATION = eINSTANCE.getRuleChildMediatorsConfiguration();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl <em>Smooks Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediator()
		 * @generated
		 */
		EClass SMOOKS_MEDIATOR = eINSTANCE.getSmooksMediator();

		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__CONFIGURATION_KEY = eINSTANCE.getSmooksMediator_ConfigurationKey();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__INPUT = eINSTANCE.getSmooksMediator_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__OUTPUT = eINSTANCE.getSmooksMediator_Output();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getSmooksMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getSmooksMediator_OutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorInputConnectorImpl <em>Smooks Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediatorInputConnector()
		 * @generated
		 */
		EClass SMOOKS_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getSmooksMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorOutputConnectorImpl <em>Smooks Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksMediatorOutputConnector()
		 * @generated
		 */
		EClass SMOOKS_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getSmooksMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksInConfigurationImpl <em>Smooks In Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksInConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksInConfiguration()
		 * @generated
		 */
		EClass SMOOKS_IN_CONFIGURATION = eINSTANCE.getSmooksInConfiguration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_IN_CONFIGURATION__TYPE = eINSTANCE.getSmooksInConfiguration_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_IN_CONFIGURATION__EXPRESSION = eINSTANCE.getSmooksInConfiguration_Expression();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl <em>Smooks Out Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksOutConfiguration()
		 * @generated
		 */
		EClass SMOOKS_OUT_CONFIGURATION = eINSTANCE.getSmooksOutConfiguration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__TYPE = eINSTANCE.getSmooksOutConfiguration_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_OUT_CONFIGURATION__EXPRESSION = eINSTANCE.getSmooksOutConfiguration_Expression();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__PROPERTY = eINSTANCE.getSmooksOutConfiguration_Property();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__ACTION = eINSTANCE.getSmooksOutConfiguration_Action();

		/**
		 * The meta object literal for the '<em><b>Output Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD = eINSTANCE.getSmooksOutConfiguration_OutputMethod();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl <em>Store Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.StoreMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getStoreMediator()
		 * @generated
		 */
		EClass STORE_MEDIATOR = eINSTANCE.getStoreMediator();

		/**
		 * The meta object literal for the '<em><b>Message Store</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_MEDIATOR__MESSAGE_STORE = eINSTANCE.getStoreMediator_MessageStore();

		/**
		 * The meta object literal for the '<em><b>On Store Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_MEDIATOR__ON_STORE_SEQUENCE = eINSTANCE.getStoreMediator_OnStoreSequence();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl <em>Conditional Route Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getConditionalRouteBranch()
		 * @generated
		 */
		EClass CONDITIONAL_ROUTE_BRANCH = eINSTANCE.getConditionalRouteBranch();

		/**
		 * The meta object literal for the '<em><b>Break Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE = eINSTANCE.getConditionalRouteBranch_BreakRoute();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl <em>Conditional Router Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getConditionalRouterMediator()
		 * @generated
		 */
		EClass CONDITIONAL_ROUTER_MEDIATOR = eINSTANCE.getConditionalRouterMediator();

		/**
		 * The meta object literal for the '<em><b>Continue Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE = eINSTANCE.getConditionalRouterMediator_ContinueRoute();

		/**
		 * The meta object literal for the '<em><b>Conditional Route Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES = eINSTANCE.getConditionalRouterMediator_ConditionalRouteBranches();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl <em>Send Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediator()
		 * @generated
		 */
		EClass SEND_MEDIATOR = eINSTANCE.getSendMediator();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__END_POINT = eINSTANCE.getSendMediator_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__INPUT_CONNECTOR = eINSTANCE.getSendMediator_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__OUTPUT_CONNECTOR = eINSTANCE.getSendMediator_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Receiving Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE = eINSTANCE.getSendMediator_ReceivingSequenceType();

		/**
		 * The meta object literal for the '<em><b>Static Receiving Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE = eINSTANCE.getSendMediator_StaticReceivingSequence();

		/**
		 * The meta object literal for the '<em><b>Dynamic Receiving Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE = eINSTANCE.getSendMediator_DynamicReceivingSequence();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorInputConnectorImpl <em>Send Mediator Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediatorInputConnector()
		 * @generated
		 */
		EClass SEND_MEDIATOR_INPUT_CONNECTOR = eINSTANCE.getSendMediatorInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorOutputConnectorImpl <em>Send Mediator Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSendMediatorOutputConnector()
		 * @generated
		 */
		EClass SEND_MEDIATOR_OUTPUT_CONNECTOR = eINSTANCE.getSendMediatorOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointImpl <em>Failover End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPoint()
		 * @generated
		 */
		EClass FAILOVER_END_POINT = eINSTANCE.getFailoverEndPoint();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILOVER_END_POINT__INPUT_CONNECTOR = eINSTANCE.getFailoverEndPoint_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILOVER_END_POINT__OUTPUT_CONNECTOR = eINSTANCE.getFailoverEndPoint_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>West Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILOVER_END_POINT__WEST_OUTPUT_CONNECTOR = eINSTANCE.getFailoverEndPoint_WestOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointInputConnectorImpl <em>Failover End Point Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointInputConnector()
		 * @generated
		 */
		EClass FAILOVER_END_POINT_INPUT_CONNECTOR = eINSTANCE.getFailoverEndPointInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointOutputConnectorImpl <em>Failover End Point Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointOutputConnector()
		 * @generated
		 */
		EClass FAILOVER_END_POINT_OUTPUT_CONNECTOR = eINSTANCE.getFailoverEndPointOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointWestOutputConnectorImpl <em>Failover End Point West Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.FailoverEndPointWestOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFailoverEndPointWestOutputConnector()
		 * @generated
		 */
		EClass FAILOVER_END_POINT_WEST_OUTPUT_CONNECTOR = eINSTANCE.getFailoverEndPointWestOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ParentEndPointImpl <em>Parent End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.ParentEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getParentEndPoint()
		 * @generated
		 */
		EClass PARENT_END_POINT = eINSTANCE.getParentEndPoint();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_END_POINT__CHILDREN = eINSTANCE.getParentEndPoint_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointImpl <em>WSDL End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPoint()
		 * @generated
		 */
		EClass WSDL_END_POINT = eINSTANCE.getWSDLEndPoint();

		/**
		 * The meta object literal for the '<em><b>WSDL Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_END_POINT__WSDL_DEFINITION = eINSTANCE.getWSDLEndPoint_WSDLDefinition();

		/**
		 * The meta object literal for the '<em><b>WSDL Description</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_END_POINT__WSDL_DESCRIPTION = eINSTANCE.getWSDLEndPoint_WSDLDescription();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_END_POINT__INPUT_CONNECTOR = eINSTANCE.getWSDLEndPoint_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_END_POINT__OUTPUT_CONNECTOR = eINSTANCE.getWSDLEndPoint_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>Wsdl Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_END_POINT__WSDL_URI = eINSTANCE.getWSDLEndPoint_WsdlUri();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_END_POINT__SERVICE = eINSTANCE.getWSDLEndPoint_Service();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_END_POINT__PORT = eINSTANCE.getWSDLEndPoint_Port();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDefinitionImpl <em>WSDL Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDefinitionImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLDefinition()
		 * @generated
		 */
		EClass WSDL_DEFINITION = eINSTANCE.getWSDLDefinition();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDescriptionImpl <em>WSDL Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLDescriptionImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLDescription()
		 * @generated
		 */
		EClass WSDL_DESCRIPTION = eINSTANCE.getWSDLDescription();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointInputConnectorImpl <em>WSDL End Point Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPointInputConnector()
		 * @generated
		 */
		EClass WSDL_END_POINT_INPUT_CONNECTOR = eINSTANCE.getWSDLEndPointInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointOutputConnectorImpl <em>WSDL End Point Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.WSDLEndPointOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getWSDLEndPointOutputConnector()
		 * @generated
		 */
		EClass WSDL_END_POINT_OUTPUT_CONNECTOR = eINSTANCE.getWSDLEndPointOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl <em>Load Balance End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPoint()
		 * @generated
		 */
		EClass LOAD_BALANCE_END_POINT = eINSTANCE.getLoadBalanceEndPoint();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCE_END_POINT__SESSION = eINSTANCE.getLoadBalanceEndPoint_Session();

		/**
		 * The meta object literal for the '<em><b>Failover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCE_END_POINT__FAILOVER = eINSTANCE.getLoadBalanceEndPoint_Failover();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCE_END_POINT__POLICY = eINSTANCE.getLoadBalanceEndPoint_Policy();

		/**
		 * The meta object literal for the '<em><b>Input Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCE_END_POINT__INPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPoint_InputConnector();

		/**
		 * The meta object literal for the '<em><b>Output Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPoint_OutputConnector();

		/**
		 * The meta object literal for the '<em><b>West Output Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPoint_WestOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointInputConnectorImpl <em>Load Balance End Point Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointInputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointInputConnector()
		 * @generated
		 */
		EClass LOAD_BALANCE_END_POINT_INPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPointInputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointOutputConnectorImpl <em>Load Balance End Point Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointOutputConnector()
		 * @generated
		 */
		EClass LOAD_BALANCE_END_POINT_OUTPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPointOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointWestOutputConnectorImpl <em>Load Balance End Point West Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointWestOutputConnectorImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLoadBalanceEndPointWestOutputConnector()
		 * @generated
		 */
		EClass LOAD_BALANCE_END_POINT_WEST_OUTPUT_CONNECTOR = eINSTANCE.getLoadBalanceEndPointWestOutputConnector();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LocalEntryImpl <em>Local Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.LocalEntryImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLocalEntry()
		 * @generated
		 */
		EClass LOCAL_ENTRY = eINSTANCE.getLocalEntry();

		/**
		 * The meta object literal for the '<em><b>Entry Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__ENTRY_NAME = eINSTANCE.getLocalEntry_EntryName();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_TYPE = eINSTANCE.getLocalEntry_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_LITERAL = eINSTANCE.getLocalEntry_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Value XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_XML = eINSTANCE.getLocalEntry_ValueXML();

		/**
		 * The meta object literal for the '<em><b>Value URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_URL = eINSTANCE.getLocalEntry_ValueURL();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.SessionImpl
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__TYPE = eINSTANCE.getSession_Type();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ProxyWsdlType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getProxyWsdlType()
		 * @generated
		 */
		EEnum PROXY_WSDL_TYPE = eINSTANCE.getProxyWsdlType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType <em>Filter Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFilterConditionType()
		 * @generated
		 */
		EEnum FILTER_CONDITION_TYPE = eINSTANCE.getFilterConditionType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogCategory <em>Log Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogCategory
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogCategory()
		 * @generated
		 */
		EEnum LOG_CATEGORY = eINSTANCE.getLogCategory();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LogLevel <em>Log Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.LogLevel
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLogLevel()
		 * @generated
		 */
		EEnum LOG_LEVEL = eINSTANCE.getLogLevel();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointAddressingVersion()
		 * @generated
		 */
		EEnum END_POINT_ADDRESSING_VERSION = eINSTANCE.getEndPointAddressingVersion();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointTimeOutAction()
		 * @generated
		 */
		EEnum END_POINT_TIME_OUT_ACTION = eINSTANCE.getEndPointTimeOutAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat <em>End Point Message Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointMessageFormat()
		 * @generated
		 */
		EEnum END_POINT_MESSAGE_FORMAT = eINSTANCE.getEndPointMessageFormat();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEndPointAttachmentOptimization()
		 * @generated
		 */
		EEnum END_POINT_ATTACHMENT_OPTIMIZATION = eINSTANCE.getEndPointAttachmentOptimization();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType <em>Property Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyDataType()
		 * @generated
		 */
		EEnum PROPERTY_DATA_TYPE = eINSTANCE.getPropertyDataType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction <em>Property Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyAction()
		 * @generated
		 */
		EEnum PROPERTY_ACTION = eINSTANCE.getPropertyAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope <em>Property Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyScope()
		 * @generated
		 */
		EEnum PROPERTY_SCOPE = eINSTANCE.getPropertyScope();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType <em>Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getPropertyValueType()
		 * @generated
		 */
		EEnum PROPERTY_VALUE_TYPE = eINSTANCE.getPropertyValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType <em>Enrich Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichSourceType()
		 * @generated
		 */
		EEnum ENRICH_SOURCE_TYPE = eINSTANCE.getEnrichSourceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction <em>Enrich Target Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichTargetAction()
		 * @generated
		 */
		EEnum ENRICH_TARGET_ACTION = eINSTANCE.getEnrichTargetAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType <em>Enrich Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEnrichTargetType()
		 * @generated
		 */
		EEnum ENRICH_TARGET_TYPE = eINSTANCE.getEnrichTargetType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType <em>Event Topic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.EventTopicType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getEventTopicType()
		 * @generated
		 */
		EEnum EVENT_TOPIC_TYPE = eINSTANCE.getEventTopicType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptType <em>Script Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptType()
		 * @generated
		 */
		EEnum SCRIPT_TYPE = eINSTANCE.getScriptType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage <em>Script Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getScriptLanguage()
		 * @generated
		 */
		EEnum SCRIPT_LANGUAGE = eINSTANCE.getScriptLanguage();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion <em>Fault Soap Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultSoapVersion
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultSoapVersion()
		 * @generated
		 */
		EEnum FAULT_SOAP_VERSION = eINSTANCE.getFaultSoapVersion();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11 <em>Fault Code Soap11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap11
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultCodeSoap11()
		 * @generated
		 */
		EEnum FAULT_CODE_SOAP11 = eINSTANCE.getFaultCodeSoap11();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12 <em>Fault Code Soap12</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultCodeSoap12
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultCodeSoap12()
		 * @generated
		 */
		EEnum FAULT_CODE_SOAP12 = eINSTANCE.getFaultCodeSoap12();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType <em>Fault String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultStringType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultStringType()
		 * @generated
		 */
		EEnum FAULT_STRING_TYPE = eINSTANCE.getFaultStringType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType <em>Fault Reason Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultReasonType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultReasonType()
		 * @generated
		 */
		EEnum FAULT_REASON_TYPE = eINSTANCE.getFaultReasonType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType <em>Fault Detail Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.FaultDetailType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getFaultDetailType()
		 * @generated
		 */
		EEnum FAULT_DETAIL_TYPE = eINSTANCE.getFaultDetailType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType <em>Aggregate Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getAggregateSequenceType()
		 * @generated
		 */
		EEnum AGGREGATE_SEQUENCE_TYPE = eINSTANCE.getAggregateSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType <em>Target Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTargetSequenceType()
		 * @generated
		 */
		EEnum TARGET_SEQUENCE_TYPE = eINSTANCE.getTargetSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType <em>Target Endpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTargetEndpointType()
		 * @generated
		 */
		EEnum TARGET_ENDPOINT_TYPE = eINSTANCE.getTargetEndpointType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType <em>Cache Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheSequenceType()
		 * @generated
		 */
		EEnum CACHE_SEQUENCE_TYPE = eINSTANCE.getCacheSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType <em>Cache Implementation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheImplementationType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheImplementationType()
		 * @generated
		 */
		EEnum CACHE_IMPLEMENTATION_TYPE = eINSTANCE.getCacheImplementationType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheAction <em>Cache Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheAction()
		 * @generated
		 */
		EEnum CACHE_ACTION = eINSTANCE.getCacheAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CacheScope <em>Cache Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CacheScope
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCacheScope()
		 * @generated
		 */
		EEnum CACHE_SCOPE = eINSTANCE.getCacheScope();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType <em>XQuery Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariableType()
		 * @generated
		 */
		EEnum XQUERY_VARIABLE_TYPE = eINSTANCE.getXQueryVariableType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType <em>XQuery Variable Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariableValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getXQueryVariableValueType()
		 * @generated
		 */
		EEnum XQUERY_VARIABLE_VALUE_TYPE = eINSTANCE.getXQueryVariableValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType <em>Callout Payload Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutPayloadType()
		 * @generated
		 */
		EEnum CALLOUT_PAYLOAD_TYPE = eINSTANCE.getCalloutPayloadType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType <em>Callout Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCalloutResultType()
		 * @generated
		 */
		EEnum CALLOUT_RESULT_TYPE = eINSTANCE.getCalloutResultType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion <em>RM Spec Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSpecVersion()
		 * @generated
		 */
		EEnum RM_SPEC_VERSION = eINSTANCE.getRMSpecVersion();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType <em>RM Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRMSequenceType()
		 * @generated
		 */
		EEnum RM_SEQUENCE_TYPE = eINSTANCE.getRMSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction <em>Transaction Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.TransactionAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getTransactionAction()
		 * @generated
		 */
		EEnum TRANSACTION_ACTION = eINSTANCE.getTransactionAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction <em>Header Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderAction()
		 * @generated
		 */
		EEnum HEADER_ACTION = eINSTANCE.getHeaderAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType <em>Header Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getHeaderValueType()
		 * @generated
		 */
		EEnum HEADER_VALUE_TYPE = eINSTANCE.getHeaderValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType <em>Throttle Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottlePolicyType()
		 * @generated
		 */
		EEnum THROTTLE_POLICY_TYPE = eINSTANCE.getThrottlePolicyType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType <em>Throttle Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleConditionType()
		 * @generated
		 */
		EEnum THROTTLE_CONDITION_TYPE = eINSTANCE.getThrottleConditionType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType <em>Throttle Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleAccessType()
		 * @generated
		 */
		EEnum THROTTLE_ACCESS_TYPE = eINSTANCE.getThrottleAccessType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType <em>Throttle Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ThrottleSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getThrottleSequenceType()
		 * @generated
		 */
		EEnum THROTTLE_SEQUENCE_TYPE = eINSTANCE.getThrottleSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType <em>Command Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyValueType()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_VALUE_TYPE = eINSTANCE.getCommandPropertyValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction <em>Command Property Message Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyMessageAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyMessageAction()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_MESSAGE_ACTION = eINSTANCE.getCommandPropertyMessageAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction <em>Command Property Context Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.CommandPropertyContextAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getCommandPropertyContextAction()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_CONTEXT_ACTION = eINSTANCE.getCommandPropertyContextAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorConnectionType()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_CONNECTION_TYPE = eINSTANCE.getSqlExecutorConnectionType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorDatasourceType()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_DATASOURCE_TYPE = eINSTANCE.getSqlExecutorDatasourceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorBooleanValue()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_BOOLEAN_VALUE = eINSTANCE.getSqlExecutorBooleanValue();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlExecutorIsolationLevel()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_ISOLATION_LEVEL = eINSTANCE.getSqlExecutorIsolationLevel();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType <em>Sql Parameter Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterValueType()
		 * @generated
		 */
		EEnum SQL_PARAMETER_VALUE_TYPE = eINSTANCE.getSqlParameterValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType <em>Sql Parameter Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlParameterDataType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSqlParameterDataType()
		 * @generated
		 */
		EEnum SQL_PARAMETER_DATA_TYPE = eINSTANCE.getSqlParameterDataType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType <em>Rule Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleSourceType()
		 * @generated
		 */
		EEnum RULE_SOURCE_TYPE = eINSTANCE.getRuleSourceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType <em>Rule Fact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactType()
		 * @generated
		 */
		EEnum RULE_FACT_TYPE = eINSTANCE.getRuleFactType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType <em>Rule Fact Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleFactValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleFactValueType()
		 * @generated
		 */
		EEnum RULE_FACT_VALUE_TYPE = eINSTANCE.getRuleFactValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType <em>Rule Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultType()
		 * @generated
		 */
		EEnum RULE_RESULT_TYPE = eINSTANCE.getRuleResultType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType <em>Rule Result Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleResultValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getRuleResultValueType()
		 * @generated
		 */
		EEnum RULE_RESULT_VALUE_TYPE = eINSTANCE.getRuleResultValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType <em>Smooks IO Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getSmooksIODataType()
		 * @generated
		 */
		EEnum SMOOKS_IO_DATA_TYPE = eINSTANCE.getSmooksIODataType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction <em>Expression Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getExpressionAction()
		 * @generated
		 */
		EEnum EXPRESSION_ACTION = eINSTANCE.getExpressionAction();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod <em>Output Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getOutputMethod()
		 * @generated
		 */
		EEnum OUTPUT_METHOD = eINSTANCE.getOutputMethod();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType <em>Receiving Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getReceivingSequenceType()
		 * @generated
		 */
		EEnum RECEIVING_SEQUENCE_TYPE = eINSTANCE.getReceivingSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.KeyType <em>Key Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.KeyType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getKeyType()
		 * @generated
		 */
		EEnum KEY_TYPE = eINSTANCE.getKeyType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.Type
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType <em>Local Entry Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.LocalEntryValueType
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getLocalEntryValueType()
		 * @generated
		 */
		EEnum LOCAL_ENTRY_VALUE_TYPE = eINSTANCE.getLocalEntryValueType();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //EsbPackage
