/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.impl;

import org.eclipse.bpel.apache.ode.deploy.model.config.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory("http://wso2.org/bps/bpel/endpoint/config"); 
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigPackage.ACCEPT_GZIP_TYPE: return createAcceptGzipType();
			case ConfigPackage.ADDRESS_TYPE: return createAddressType();
			case ConfigPackage.CONNECTION_TIMEOUT_TYPE: return createConnectionTimeoutType();
			case ConfigPackage.DEFAULT_HEADERS_TYPE: return createDefaultHeadersType();
			case ConfigPackage.ENABLE_SEC_TYPE: return createEnableSecType();
			case ConfigPackage.HEADER_TYPE: return createHeaderType();
			case ConfigPackage.HTTP_OPTIONS_TYPE: return createHttpOptionsType();
			case ConfigPackage.MEX_TIMEOUT_TYPE: return createMexTimeoutType();
			case ConfigPackage.PROTOCOL_CONTENT_CHARSET_TYPE: return createProtocolContentCharsetType();
			case ConfigPackage.PROTOCOL_MAX_REDIRECTS_TYPE: return createProtocolMaxRedirectsType();
			case ConfigPackage.PROTOCOL_VERSION_TYPE: return createProtocolVersionType();
			case ConfigPackage.PROXY_TYPE: return createProxyType();
			case ConfigPackage.REQUEST_CHUNK_TYPE: return createRequestChunkType();
			case ConfigPackage.REQUEST_GZIP_TYPE: return createRequestGzipType();
			case ConfigPackage.SERVICE_DESCRIPTION_TYPE: return createServiceDescriptionType();
			case ConfigPackage.SOCKET_TIMEOUT_TYPE: return createSocketTimeoutType();
			case ConfigPackage.TENDPOINT: return createTEndpoint();
			case ConfigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			case ConfigPackage.VALUE_TYPE_OBJECT:
				return createValueTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			case ConfigPackage.VALUE_TYPE_OBJECT:
				return convertValueTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptGzipType createAcceptGzipType() {
		AcceptGzipTypeImpl acceptGzipType = new AcceptGzipTypeImpl();
		return acceptGzipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTimeoutType createConnectionTimeoutType() {
		ConnectionTimeoutTypeImpl connectionTimeoutType = new ConnectionTimeoutTypeImpl();
		return connectionTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultHeadersType createDefaultHeadersType() {
		DefaultHeadersTypeImpl defaultHeadersType = new DefaultHeadersTypeImpl();
		return defaultHeadersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableSecType createEnableSecType() {
		EnableSecTypeImpl enableSecType = new EnableSecTypeImpl();
		return enableSecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpOptionsType createHttpOptionsType() {
		HttpOptionsTypeImpl httpOptionsType = new HttpOptionsTypeImpl();
		return httpOptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MexTimeoutType createMexTimeoutType() {
		MexTimeoutTypeImpl mexTimeoutType = new MexTimeoutTypeImpl();
		return mexTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolContentCharsetType createProtocolContentCharsetType() {
		ProtocolContentCharsetTypeImpl protocolContentCharsetType = new ProtocolContentCharsetTypeImpl();
		return protocolContentCharsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolMaxRedirectsType createProtocolMaxRedirectsType() {
		ProtocolMaxRedirectsTypeImpl protocolMaxRedirectsType = new ProtocolMaxRedirectsTypeImpl();
		return protocolMaxRedirectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolVersionType createProtocolVersionType() {
		ProtocolVersionTypeImpl protocolVersionType = new ProtocolVersionTypeImpl();
		return protocolVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyType createProxyType() {
		ProxyTypeImpl proxyType = new ProxyTypeImpl();
		return proxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestChunkType createRequestChunkType() {
		RequestChunkTypeImpl requestChunkType = new RequestChunkTypeImpl();
		return requestChunkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGzipType createRequestGzipType() {
		RequestGzipTypeImpl requestGzipType = new RequestGzipTypeImpl();
		return requestGzipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType createServiceDescriptionType() {
		ServiceDescriptionTypeImpl serviceDescriptionType = new ServiceDescriptionTypeImpl();
		return serviceDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocketTimeoutType createSocketTimeoutType() {
		SocketTimeoutTypeImpl socketTimeoutType = new SocketTimeoutTypeImpl();
		return socketTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEndpoint createTEndpoint() {
		TEndpointImpl tEndpoint = new TEndpointImpl();
		return tEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
		ValueType result = ValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeFromString(ConfigPackage.Literals.VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeToString(ConfigPackage.Literals.VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
