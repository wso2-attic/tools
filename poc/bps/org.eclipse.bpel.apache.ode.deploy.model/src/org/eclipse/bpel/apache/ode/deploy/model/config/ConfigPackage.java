/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config;

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
 * @see config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wso2.org/bps/bpel/endpoint/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.eclipse.bpel.apache.ode.deploy.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link config.impl.AcceptGzipTypeImpl <em>Accept Gzip Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.AcceptGzipTypeImpl
	 * @see config.impl.ConfigPackageImpl#getAcceptGzipType()
	 * @generated
	 */
	int ACCEPT_GZIP_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_GZIP_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_GZIP_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Accept Gzip Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_GZIP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.AddressTypeImpl
	 * @see config.impl.ConfigPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ConnectionTimeoutTypeImpl <em>Connection Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ConnectionTimeoutTypeImpl
	 * @see config.impl.ConfigPackageImpl#getConnectionTimeoutType()
	 * @generated
	 */
	int CONNECTION_TIMEOUT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TIMEOUT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TIMEOUT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Connection Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TIMEOUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.DefaultHeadersTypeImpl <em>Default Headers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.DefaultHeadersTypeImpl
	 * @see config.impl.ConfigPackageImpl#getDefaultHeadersType()
	 * @generated
	 */
	int DEFAULT_HEADERS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_HEADERS_TYPE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_HEADERS_TYPE__ANY = 1;

	/**
	 * The number of structural features of the '<em>Default Headers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_HEADERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.EnableSecTypeImpl <em>Enable Sec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.EnableSecTypeImpl
	 * @see config.impl.ConfigPackageImpl#getEnableSecType()
	 * @generated
	 */
	int ENABLE_SEC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SEC_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Policy Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SEC_TYPE__POLICY_LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Enable Sec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SEC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.HeaderTypeImpl
	 * @see config.impl.ConfigPackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link config.impl.HttpOptionsTypeImpl <em>Http Options Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.HttpOptionsTypeImpl
	 * @see config.impl.ConfigPackageImpl#getHttpOptionsType()
	 * @generated
	 */
	int HTTP_OPTIONS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Request Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__REQUEST_CHUNK = 0;

	/**
	 * The feature id for the '<em><b>Protocol Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__PROTOCOL_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Request Gzip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__REQUEST_GZIP = 2;

	/**
	 * The feature id for the '<em><b>Accept Gzip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__ACCEPT_GZIP = 3;

	/**
	 * The feature id for the '<em><b>Protocol Content Charset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET = 4;

	/**
	 * The feature id for the '<em><b>Connection Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT = 5;

	/**
	 * The feature id for the '<em><b>Socket Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT = 6;

	/**
	 * The feature id for the '<em><b>Protocol Max Redirects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS = 7;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__PROXY = 8;

	/**
	 * The feature id for the '<em><b>Default Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__DEFAULT_HEADERS = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE__ANY = 10;

	/**
	 * The number of structural features of the '<em>Http Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPTIONS_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link config.impl.MexTimeoutTypeImpl <em>Mex Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.MexTimeoutTypeImpl
	 * @see config.impl.ConfigPackageImpl#getMexTimeoutType()
	 * @generated
	 */
	int MEX_TIMEOUT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEX_TIMEOUT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEX_TIMEOUT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mex Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEX_TIMEOUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ProtocolContentCharsetTypeImpl <em>Protocol Content Charset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ProtocolContentCharsetTypeImpl
	 * @see config.impl.ConfigPackageImpl#getProtocolContentCharsetType()
	 * @generated
	 */
	int PROTOCOL_CONTENT_CHARSET_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTENT_CHARSET_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTENT_CHARSET_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Protocol Content Charset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTENT_CHARSET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ProtocolMaxRedirectsTypeImpl <em>Protocol Max Redirects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ProtocolMaxRedirectsTypeImpl
	 * @see config.impl.ConfigPackageImpl#getProtocolMaxRedirectsType()
	 * @generated
	 */
	int PROTOCOL_MAX_REDIRECTS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MAX_REDIRECTS_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MAX_REDIRECTS_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Protocol Max Redirects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MAX_REDIRECTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ProtocolVersionTypeImpl <em>Protocol Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ProtocolVersionTypeImpl
	 * @see config.impl.ConfigPackageImpl#getProtocolVersionType()
	 * @generated
	 */
	int PROTOCOL_VERSION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_VERSION_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_VERSION_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Protocol Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_VERSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ProxyTypeImpl
	 * @see config.impl.ConfigPackageImpl#getProxyType()
	 * @generated
	 */
	int PROXY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__HOST = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__PORT = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE__USER = 5;

	/**
	 * The number of structural features of the '<em>Proxy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link config.impl.RequestChunkTypeImpl <em>Request Chunk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.RequestChunkTypeImpl
	 * @see config.impl.ConfigPackageImpl#getRequestChunkType()
	 * @generated
	 */
	int REQUEST_CHUNK_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CHUNK_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CHUNK_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Request Chunk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CHUNK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.RequestGzipTypeImpl <em>Request Gzip Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.RequestGzipTypeImpl
	 * @see config.impl.ConfigPackageImpl#getRequestGzipType()
	 * @generated
	 */
	int REQUEST_GZIP_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GZIP_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GZIP_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Request Gzip Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GZIP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.ServiceDescriptionTypeImpl
	 * @see config.impl.ConfigPackageImpl#getServiceDescriptionType()
	 * @generated
	 */
	int SERVICE_DESCRIPTION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Service Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.SocketTimeoutTypeImpl <em>Socket Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.SocketTimeoutTypeImpl
	 * @see config.impl.ConfigPackageImpl#getSocketTimeoutType()
	 * @generated
	 */
	int SOCKET_TIMEOUT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TIMEOUT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TIMEOUT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Socket Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TIMEOUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link config.impl.TEndpointImpl <em>TEndpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.TEndpointImpl
	 * @see config.impl.ConfigPackageImpl#getTEndpoint()
	 * @generated
	 */
	int TENDPOINT = 16;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__SERVICE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Enable Sec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__ENABLE_SEC = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Mex Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__MEX_TIMEOUT = 3;

	/**
	 * The feature id for the '<em><b>Http Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__HTTP_OPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__ANY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT__PORT = 7;

	/**
	 * The number of structural features of the '<em>TEndpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDPOINT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link config.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.DocumentRootImpl
	 * @see config.impl.ConfigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link config.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.ValueType
	 * @see config.impl.ConfigPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 18;

	/**
	 * The meta object id for the '<em>Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.ValueType
	 * @see config.impl.ConfigPackageImpl#getValueTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_OBJECT = 19;


	/**
	 * Returns the meta object for class '{@link config.AcceptGzipType <em>Accept Gzip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Gzip Type</em>'.
	 * @see config.AcceptGzipType
	 * @generated
	 */
	EClass getAcceptGzipType();

	/**
	 * Returns the meta object for the attribute list '{@link config.AcceptGzipType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.AcceptGzipType#getAny()
	 * @see #getAcceptGzipType()
	 * @generated
	 */
	EAttribute getAcceptGzipType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.AcceptGzipType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.AcceptGzipType#isValue()
	 * @see #getAcceptGzipType()
	 * @generated
	 */
	EAttribute getAcceptGzipType_Value();

	/**
	 * Returns the meta object for class '{@link config.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see config.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link config.AddressType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.AddressType#getAny()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.AddressType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see config.AddressType#getUri()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Uri();

	/**
	 * Returns the meta object for class '{@link config.ConnectionTimeoutType <em>Connection Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Timeout Type</em>'.
	 * @see config.ConnectionTimeoutType
	 * @generated
	 */
	EClass getConnectionTimeoutType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ConnectionTimeoutType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ConnectionTimeoutType#getAny()
	 * @see #getConnectionTimeoutType()
	 * @generated
	 */
	EAttribute getConnectionTimeoutType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ConnectionTimeoutType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.ConnectionTimeoutType#getValue()
	 * @see #getConnectionTimeoutType()
	 * @generated
	 */
	EAttribute getConnectionTimeoutType_Value();

	/**
	 * Returns the meta object for class '{@link config.DefaultHeadersType <em>Default Headers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Headers Type</em>'.
	 * @see config.DefaultHeadersType
	 * @generated
	 */
	EClass getDefaultHeadersType();

	/**
	 * Returns the meta object for the containment reference list '{@link config.DefaultHeadersType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see config.DefaultHeadersType#getHeader()
	 * @see #getDefaultHeadersType()
	 * @generated
	 */
	EReference getDefaultHeadersType_Header();

	/**
	 * Returns the meta object for the attribute list '{@link config.DefaultHeadersType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.DefaultHeadersType#getAny()
	 * @see #getDefaultHeadersType()
	 * @generated
	 */
	EAttribute getDefaultHeadersType_Any();

	/**
	 * Returns the meta object for class '{@link config.EnableSecType <em>Enable Sec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Sec Type</em>'.
	 * @see config.EnableSecType
	 * @generated
	 */
	EClass getEnableSecType();

	/**
	 * Returns the meta object for the attribute list '{@link config.EnableSecType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.EnableSecType#getAny()
	 * @see #getEnableSecType()
	 * @generated
	 */
	EAttribute getEnableSecType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.EnableSecType#getPolicyLocation <em>Policy Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Location</em>'.
	 * @see config.EnableSecType#getPolicyLocation()
	 * @see #getEnableSecType()
	 * @generated
	 */
	EAttribute getEnableSecType_PolicyLocation();

	/**
	 * Returns the meta object for class '{@link config.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see config.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the attribute list '{@link config.HeaderType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.HeaderType#getAny()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.HeaderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see config.HeaderType#getName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link config.HeaderType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.HeaderType#getValue()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Value();

	/**
	 * Returns the meta object for class '{@link config.HttpOptionsType <em>Http Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Options Type</em>'.
	 * @see config.HttpOptionsType
	 * @generated
	 */
	EClass getHttpOptionsType();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getRequestChunk <em>Request Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Chunk</em>'.
	 * @see config.HttpOptionsType#getRequestChunk()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_RequestChunk();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getProtocolVersion <em>Protocol Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol Version</em>'.
	 * @see config.HttpOptionsType#getProtocolVersion()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_ProtocolVersion();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getRequestGzip <em>Request Gzip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Gzip</em>'.
	 * @see config.HttpOptionsType#getRequestGzip()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_RequestGzip();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getAcceptGzip <em>Accept Gzip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accept Gzip</em>'.
	 * @see config.HttpOptionsType#getAcceptGzip()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_AcceptGzip();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getProtocolContentCharset <em>Protocol Content Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol Content Charset</em>'.
	 * @see config.HttpOptionsType#getProtocolContentCharset()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_ProtocolContentCharset();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getConnectionTimeout <em>Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Timeout</em>'.
	 * @see config.HttpOptionsType#getConnectionTimeout()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_ConnectionTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getSocketTimeout <em>Socket Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Socket Timeout</em>'.
	 * @see config.HttpOptionsType#getSocketTimeout()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_SocketTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getProtocolMaxRedirects <em>Protocol Max Redirects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol Max Redirects</em>'.
	 * @see config.HttpOptionsType#getProtocolMaxRedirects()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_ProtocolMaxRedirects();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proxy</em>'.
	 * @see config.HttpOptionsType#getProxy()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_Proxy();

	/**
	 * Returns the meta object for the containment reference '{@link config.HttpOptionsType#getDefaultHeaders <em>Default Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Headers</em>'.
	 * @see config.HttpOptionsType#getDefaultHeaders()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EReference getHttpOptionsType_DefaultHeaders();

	/**
	 * Returns the meta object for the attribute list '{@link config.HttpOptionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.HttpOptionsType#getAny()
	 * @see #getHttpOptionsType()
	 * @generated
	 */
	EAttribute getHttpOptionsType_Any();

	/**
	 * Returns the meta object for class '{@link config.MexTimeoutType <em>Mex Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mex Timeout Type</em>'.
	 * @see config.MexTimeoutType
	 * @generated
	 */
	EClass getMexTimeoutType();

	/**
	 * Returns the meta object for the attribute list '{@link config.MexTimeoutType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.MexTimeoutType#getAny()
	 * @see #getMexTimeoutType()
	 * @generated
	 */
	EAttribute getMexTimeoutType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.MexTimeoutType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.MexTimeoutType#getValue()
	 * @see #getMexTimeoutType()
	 * @generated
	 */
	EAttribute getMexTimeoutType_Value();

	/**
	 * Returns the meta object for class '{@link config.ProtocolContentCharsetType <em>Protocol Content Charset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Content Charset Type</em>'.
	 * @see config.ProtocolContentCharsetType
	 * @generated
	 */
	EClass getProtocolContentCharsetType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ProtocolContentCharsetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ProtocolContentCharsetType#getAny()
	 * @see #getProtocolContentCharsetType()
	 * @generated
	 */
	EAttribute getProtocolContentCharsetType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ProtocolContentCharsetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.ProtocolContentCharsetType#getValue()
	 * @see #getProtocolContentCharsetType()
	 * @generated
	 */
	EAttribute getProtocolContentCharsetType_Value();

	/**
	 * Returns the meta object for class '{@link config.ProtocolMaxRedirectsType <em>Protocol Max Redirects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Max Redirects Type</em>'.
	 * @see config.ProtocolMaxRedirectsType
	 * @generated
	 */
	EClass getProtocolMaxRedirectsType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ProtocolMaxRedirectsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ProtocolMaxRedirectsType#getAny()
	 * @see #getProtocolMaxRedirectsType()
	 * @generated
	 */
	EAttribute getProtocolMaxRedirectsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ProtocolMaxRedirectsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.ProtocolMaxRedirectsType#getValue()
	 * @see #getProtocolMaxRedirectsType()
	 * @generated
	 */
	EAttribute getProtocolMaxRedirectsType_Value();

	/**
	 * Returns the meta object for class '{@link config.ProtocolVersionType <em>Protocol Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Version Type</em>'.
	 * @see config.ProtocolVersionType
	 * @generated
	 */
	EClass getProtocolVersionType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ProtocolVersionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ProtocolVersionType#getAny()
	 * @see #getProtocolVersionType()
	 * @generated
	 */
	EAttribute getProtocolVersionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ProtocolVersionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.ProtocolVersionType#getValue()
	 * @see #getProtocolVersionType()
	 * @generated
	 */
	EAttribute getProtocolVersionType_Value();

	/**
	 * Returns the meta object for class '{@link config.ProxyType <em>Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Type</em>'.
	 * @see config.ProxyType
	 * @generated
	 */
	EClass getProxyType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ProxyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ProxyType#getAny()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ProxyType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see config.ProxyType#getDomain()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link config.ProxyType#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see config.ProxyType#getHost()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_Host();

	/**
	 * Returns the meta object for the attribute '{@link config.ProxyType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see config.ProxyType#getPassword()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_Password();

	/**
	 * Returns the meta object for the attribute '{@link config.ProxyType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see config.ProxyType#getPort()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_Port();

	/**
	 * Returns the meta object for the attribute '{@link config.ProxyType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see config.ProxyType#getUser()
	 * @see #getProxyType()
	 * @generated
	 */
	EAttribute getProxyType_User();

	/**
	 * Returns the meta object for class '{@link config.RequestChunkType <em>Request Chunk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Chunk Type</em>'.
	 * @see config.RequestChunkType
	 * @generated
	 */
	EClass getRequestChunkType();

	/**
	 * Returns the meta object for the attribute list '{@link config.RequestChunkType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.RequestChunkType#getAny()
	 * @see #getRequestChunkType()
	 * @generated
	 */
	EAttribute getRequestChunkType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.RequestChunkType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.RequestChunkType#isValue()
	 * @see #getRequestChunkType()
	 * @generated
	 */
	EAttribute getRequestChunkType_Value();

	/**
	 * Returns the meta object for class '{@link config.RequestGzipType <em>Request Gzip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Gzip Type</em>'.
	 * @see config.RequestGzipType
	 * @generated
	 */
	EClass getRequestGzipType();

	/**
	 * Returns the meta object for the attribute list '{@link config.RequestGzipType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.RequestGzipType#getAny()
	 * @see #getRequestGzipType()
	 * @generated
	 */
	EAttribute getRequestGzipType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.RequestGzipType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.RequestGzipType#isValue()
	 * @see #getRequestGzipType()
	 * @generated
	 */
	EAttribute getRequestGzipType_Value();

	/**
	 * Returns the meta object for class '{@link config.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description Type</em>'.
	 * @see config.ServiceDescriptionType
	 * @generated
	 */
	EClass getServiceDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link config.ServiceDescriptionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.ServiceDescriptionType#getAny()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.ServiceDescriptionType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see config.ServiceDescriptionType#getLocation()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_Location();

	/**
	 * Returns the meta object for class '{@link config.SocketTimeoutType <em>Socket Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket Timeout Type</em>'.
	 * @see config.SocketTimeoutType
	 * @generated
	 */
	EClass getSocketTimeoutType();

	/**
	 * Returns the meta object for the attribute list '{@link config.SocketTimeoutType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.SocketTimeoutType#getAny()
	 * @see #getSocketTimeoutType()
	 * @generated
	 */
	EAttribute getSocketTimeoutType_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.SocketTimeoutType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see config.SocketTimeoutType#getValue()
	 * @see #getSocketTimeoutType()
	 * @generated
	 */
	EAttribute getSocketTimeoutType_Value();

	/**
	 * Returns the meta object for class '{@link config.TEndpoint <em>TEndpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEndpoint</em>'.
	 * @see config.TEndpoint
	 * @generated
	 */
	EClass getTEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link config.TEndpoint#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Description</em>'.
	 * @see config.TEndpoint#getServiceDescription()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EReference getTEndpoint_ServiceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link config.TEndpoint#getEnableSec <em>Enable Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable Sec</em>'.
	 * @see config.TEndpoint#getEnableSec()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EReference getTEndpoint_EnableSec();

	/**
	 * Returns the meta object for the containment reference '{@link config.TEndpoint#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see config.TEndpoint#getAddress()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EReference getTEndpoint_Address();

	/**
	 * Returns the meta object for the containment reference '{@link config.TEndpoint#getMexTimeout <em>Mex Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mex Timeout</em>'.
	 * @see config.TEndpoint#getMexTimeout()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EReference getTEndpoint_MexTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link config.TEndpoint#getHttpOptions <em>Http Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Options</em>'.
	 * @see config.TEndpoint#getHttpOptions()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EReference getTEndpoint_HttpOptions();

	/**
	 * Returns the meta object for the attribute list '{@link config.TEndpoint#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see config.TEndpoint#getAny()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EAttribute getTEndpoint_Any();

	/**
	 * Returns the meta object for the attribute '{@link config.TEndpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see config.TEndpoint#getName()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EAttribute getTEndpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link config.TEndpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see config.TEndpoint#getPort()
	 * @see #getTEndpoint()
	 * @generated
	 */
	EAttribute getTEndpoint_Port();

	/**
	 * Returns the meta object for class '{@link config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see config.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link config.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see config.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link config.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see config.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link config.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see config.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link config.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see config.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for enum '{@link config.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see config.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for data type '{@link config.ValueType <em>Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Object</em>'.
	 * @see config.ValueType
	 * @model instanceClass="config.ValueType"
	 *        extendedMetaData="name='value_._type:Object' baseType='value_._type'"
	 * @generated
	 */
	EDataType getValueTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link config.impl.AcceptGzipTypeImpl <em>Accept Gzip Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.AcceptGzipTypeImpl
		 * @see config.impl.ConfigPackageImpl#getAcceptGzipType()
		 * @generated
		 */
		EClass ACCEPT_GZIP_TYPE = eINSTANCE.getAcceptGzipType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_GZIP_TYPE__ANY = eINSTANCE.getAcceptGzipType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_GZIP_TYPE__VALUE = eINSTANCE.getAcceptGzipType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.AddressTypeImpl
		 * @see config.impl.ConfigPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ANY = eINSTANCE.getAddressType_Any();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__URI = eINSTANCE.getAddressType_Uri();

		/**
		 * The meta object literal for the '{@link config.impl.ConnectionTimeoutTypeImpl <em>Connection Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ConnectionTimeoutTypeImpl
		 * @see config.impl.ConfigPackageImpl#getConnectionTimeoutType()
		 * @generated
		 */
		EClass CONNECTION_TIMEOUT_TYPE = eINSTANCE.getConnectionTimeoutType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TIMEOUT_TYPE__ANY = eINSTANCE.getConnectionTimeoutType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TIMEOUT_TYPE__VALUE = eINSTANCE.getConnectionTimeoutType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.DefaultHeadersTypeImpl <em>Default Headers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.DefaultHeadersTypeImpl
		 * @see config.impl.ConfigPackageImpl#getDefaultHeadersType()
		 * @generated
		 */
		EClass DEFAULT_HEADERS_TYPE = eINSTANCE.getDefaultHeadersType();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_HEADERS_TYPE__HEADER = eINSTANCE.getDefaultHeadersType_Header();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_HEADERS_TYPE__ANY = eINSTANCE.getDefaultHeadersType_Any();

		/**
		 * The meta object literal for the '{@link config.impl.EnableSecTypeImpl <em>Enable Sec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.EnableSecTypeImpl
		 * @see config.impl.ConfigPackageImpl#getEnableSecType()
		 * @generated
		 */
		EClass ENABLE_SEC_TYPE = eINSTANCE.getEnableSecType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SEC_TYPE__ANY = eINSTANCE.getEnableSecType_Any();

		/**
		 * The meta object literal for the '<em><b>Policy Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SEC_TYPE__POLICY_LOCATION = eINSTANCE.getEnableSecType_PolicyLocation();

		/**
		 * The meta object literal for the '{@link config.impl.HeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.HeaderTypeImpl
		 * @see config.impl.ConfigPackageImpl#getHeaderType()
		 * @generated
		 */
		EClass HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__ANY = eINSTANCE.getHeaderType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__NAME = eINSTANCE.getHeaderType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__VALUE = eINSTANCE.getHeaderType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.HttpOptionsTypeImpl <em>Http Options Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.HttpOptionsTypeImpl
		 * @see config.impl.ConfigPackageImpl#getHttpOptionsType()
		 * @generated
		 */
		EClass HTTP_OPTIONS_TYPE = eINSTANCE.getHttpOptionsType();

		/**
		 * The meta object literal for the '<em><b>Request Chunk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__REQUEST_CHUNK = eINSTANCE.getHttpOptionsType_RequestChunk();

		/**
		 * The meta object literal for the '<em><b>Protocol Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__PROTOCOL_VERSION = eINSTANCE.getHttpOptionsType_ProtocolVersion();

		/**
		 * The meta object literal for the '<em><b>Request Gzip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__REQUEST_GZIP = eINSTANCE.getHttpOptionsType_RequestGzip();

		/**
		 * The meta object literal for the '<em><b>Accept Gzip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__ACCEPT_GZIP = eINSTANCE.getHttpOptionsType_AcceptGzip();

		/**
		 * The meta object literal for the '<em><b>Protocol Content Charset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET = eINSTANCE.getHttpOptionsType_ProtocolContentCharset();

		/**
		 * The meta object literal for the '<em><b>Connection Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT = eINSTANCE.getHttpOptionsType_ConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Socket Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT = eINSTANCE.getHttpOptionsType_SocketTimeout();

		/**
		 * The meta object literal for the '<em><b>Protocol Max Redirects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS = eINSTANCE.getHttpOptionsType_ProtocolMaxRedirects();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__PROXY = eINSTANCE.getHttpOptionsType_Proxy();

		/**
		 * The meta object literal for the '<em><b>Default Headers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPTIONS_TYPE__DEFAULT_HEADERS = eINSTANCE.getHttpOptionsType_DefaultHeaders();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_OPTIONS_TYPE__ANY = eINSTANCE.getHttpOptionsType_Any();

		/**
		 * The meta object literal for the '{@link config.impl.MexTimeoutTypeImpl <em>Mex Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.MexTimeoutTypeImpl
		 * @see config.impl.ConfigPackageImpl#getMexTimeoutType()
		 * @generated
		 */
		EClass MEX_TIMEOUT_TYPE = eINSTANCE.getMexTimeoutType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEX_TIMEOUT_TYPE__ANY = eINSTANCE.getMexTimeoutType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEX_TIMEOUT_TYPE__VALUE = eINSTANCE.getMexTimeoutType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.ProtocolContentCharsetTypeImpl <em>Protocol Content Charset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ProtocolContentCharsetTypeImpl
		 * @see config.impl.ConfigPackageImpl#getProtocolContentCharsetType()
		 * @generated
		 */
		EClass PROTOCOL_CONTENT_CHARSET_TYPE = eINSTANCE.getProtocolContentCharsetType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_CONTENT_CHARSET_TYPE__ANY = eINSTANCE.getProtocolContentCharsetType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_CONTENT_CHARSET_TYPE__VALUE = eINSTANCE.getProtocolContentCharsetType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.ProtocolMaxRedirectsTypeImpl <em>Protocol Max Redirects Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ProtocolMaxRedirectsTypeImpl
		 * @see config.impl.ConfigPackageImpl#getProtocolMaxRedirectsType()
		 * @generated
		 */
		EClass PROTOCOL_MAX_REDIRECTS_TYPE = eINSTANCE.getProtocolMaxRedirectsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_MAX_REDIRECTS_TYPE__ANY = eINSTANCE.getProtocolMaxRedirectsType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_MAX_REDIRECTS_TYPE__VALUE = eINSTANCE.getProtocolMaxRedirectsType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.ProtocolVersionTypeImpl <em>Protocol Version Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ProtocolVersionTypeImpl
		 * @see config.impl.ConfigPackageImpl#getProtocolVersionType()
		 * @generated
		 */
		EClass PROTOCOL_VERSION_TYPE = eINSTANCE.getProtocolVersionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_VERSION_TYPE__ANY = eINSTANCE.getProtocolVersionType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_VERSION_TYPE__VALUE = eINSTANCE.getProtocolVersionType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ProxyTypeImpl
		 * @see config.impl.ConfigPackageImpl#getProxyType()
		 * @generated
		 */
		EClass PROXY_TYPE = eINSTANCE.getProxyType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__ANY = eINSTANCE.getProxyType_Any();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__DOMAIN = eINSTANCE.getProxyType_Domain();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__HOST = eINSTANCE.getProxyType_Host();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__PASSWORD = eINSTANCE.getProxyType_Password();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__PORT = eINSTANCE.getProxyType_Port();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_TYPE__USER = eINSTANCE.getProxyType_User();

		/**
		 * The meta object literal for the '{@link config.impl.RequestChunkTypeImpl <em>Request Chunk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.RequestChunkTypeImpl
		 * @see config.impl.ConfigPackageImpl#getRequestChunkType()
		 * @generated
		 */
		EClass REQUEST_CHUNK_TYPE = eINSTANCE.getRequestChunkType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CHUNK_TYPE__ANY = eINSTANCE.getRequestChunkType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CHUNK_TYPE__VALUE = eINSTANCE.getRequestChunkType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.RequestGzipTypeImpl <em>Request Gzip Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.RequestGzipTypeImpl
		 * @see config.impl.ConfigPackageImpl#getRequestGzipType()
		 * @generated
		 */
		EClass REQUEST_GZIP_TYPE = eINSTANCE.getRequestGzipType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_GZIP_TYPE__ANY = eINSTANCE.getRequestGzipType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_GZIP_TYPE__VALUE = eINSTANCE.getRequestGzipType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.ServiceDescriptionTypeImpl
		 * @see config.impl.ConfigPackageImpl#getServiceDescriptionType()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION_TYPE = eINSTANCE.getServiceDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__ANY = eINSTANCE.getServiceDescriptionType_Any();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__LOCATION = eINSTANCE.getServiceDescriptionType_Location();

		/**
		 * The meta object literal for the '{@link config.impl.SocketTimeoutTypeImpl <em>Socket Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.SocketTimeoutTypeImpl
		 * @see config.impl.ConfigPackageImpl#getSocketTimeoutType()
		 * @generated
		 */
		EClass SOCKET_TIMEOUT_TYPE = eINSTANCE.getSocketTimeoutType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_TIMEOUT_TYPE__ANY = eINSTANCE.getSocketTimeoutType_Any();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_TIMEOUT_TYPE__VALUE = eINSTANCE.getSocketTimeoutType_Value();

		/**
		 * The meta object literal for the '{@link config.impl.TEndpointImpl <em>TEndpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.TEndpointImpl
		 * @see config.impl.ConfigPackageImpl#getTEndpoint()
		 * @generated
		 */
		EClass TENDPOINT = eINSTANCE.getTEndpoint();

		/**
		 * The meta object literal for the '<em><b>Service Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDPOINT__SERVICE_DESCRIPTION = eINSTANCE.getTEndpoint_ServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Enable Sec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDPOINT__ENABLE_SEC = eINSTANCE.getTEndpoint_EnableSec();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDPOINT__ADDRESS = eINSTANCE.getTEndpoint_Address();

		/**
		 * The meta object literal for the '<em><b>Mex Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDPOINT__MEX_TIMEOUT = eINSTANCE.getTEndpoint_MexTimeout();

		/**
		 * The meta object literal for the '<em><b>Http Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDPOINT__HTTP_OPTIONS = eINSTANCE.getTEndpoint_HttpOptions();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDPOINT__ANY = eINSTANCE.getTEndpoint_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDPOINT__NAME = eINSTANCE.getTEndpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDPOINT__PORT = eINSTANCE.getTEndpoint_Port();

		/**
		 * The meta object literal for the '{@link config.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.DocumentRootImpl
		 * @see config.impl.ConfigPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT = eINSTANCE.getDocumentRoot_Endpoint();

		/**
		 * The meta object literal for the '{@link config.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.ValueType
		 * @see config.impl.ConfigPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em>Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.ValueType
		 * @see config.impl.ConfigPackageImpl#getValueTypeObject()
		 * @generated
		 */
		EDataType VALUE_TYPE_OBJECT = eINSTANCE.getValueTypeObject();

	}

} //ConfigPackage
