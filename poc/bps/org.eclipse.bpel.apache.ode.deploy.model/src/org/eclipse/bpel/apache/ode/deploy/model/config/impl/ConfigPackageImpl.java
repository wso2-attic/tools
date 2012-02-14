/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.impl;

import org.eclipse.bpel.apache.ode.deploy.model.dd.ddPackage;

import org.eclipse.bpel.apache.ode.deploy.model.dd.impl.ddPackageImpl;

import org.eclipse.bpel.apache.ode.deploy.model.config.*;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptGzipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTimeoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultHeadersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableSecTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpOptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mexTimeoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolContentCharsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolMaxRedirectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolVersionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestChunkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestGzipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socketTimeoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ddPackageImpl the_03Package = (ddPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ddPackage.eNS_URI) instanceof ddPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ddPackage.eNS_URI) : ddPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigPackage.createPackageContents();
		the_03Package.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();
		the_03Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptGzipType() {
		return acceptGzipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptGzipType_Any() {
		return (EAttribute)acceptGzipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptGzipType_Value() {
		return (EAttribute)acceptGzipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Any() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Uri() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionTimeoutType() {
		return connectionTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionTimeoutType_Any() {
		return (EAttribute)connectionTimeoutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionTimeoutType_Value() {
		return (EAttribute)connectionTimeoutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultHeadersType() {
		return defaultHeadersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultHeadersType_Header() {
		return (EReference)defaultHeadersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultHeadersType_Any() {
		return (EAttribute)defaultHeadersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableSecType() {
		return enableSecTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableSecType_Any() {
		return (EAttribute)enableSecTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableSecType_PolicyLocation() {
		return (EAttribute)enableSecTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Any() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Name() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Value() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpOptionsType() {
		return httpOptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_RequestChunk() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_ProtocolVersion() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_RequestGzip() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_AcceptGzip() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_ProtocolContentCharset() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_ConnectionTimeout() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_SocketTimeout() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_ProtocolMaxRedirects() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_Proxy() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOptionsType_DefaultHeaders() {
		return (EReference)httpOptionsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpOptionsType_Any() {
		return (EAttribute)httpOptionsTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMexTimeoutType() {
		return mexTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMexTimeoutType_Any() {
		return (EAttribute)mexTimeoutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMexTimeoutType_Value() {
		return (EAttribute)mexTimeoutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolContentCharsetType() {
		return protocolContentCharsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolContentCharsetType_Any() {
		return (EAttribute)protocolContentCharsetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolContentCharsetType_Value() {
		return (EAttribute)protocolContentCharsetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolMaxRedirectsType() {
		return protocolMaxRedirectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolMaxRedirectsType_Any() {
		return (EAttribute)protocolMaxRedirectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolMaxRedirectsType_Value() {
		return (EAttribute)protocolMaxRedirectsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolVersionType() {
		return protocolVersionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolVersionType_Any() {
		return (EAttribute)protocolVersionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolVersionType_Value() {
		return (EAttribute)protocolVersionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyType() {
		return proxyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_Any() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_Domain() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_Host() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_Password() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_Port() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyType_User() {
		return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestChunkType() {
		return requestChunkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestChunkType_Any() {
		return (EAttribute)requestChunkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestChunkType_Value() {
		return (EAttribute)requestChunkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestGzipType() {
		return requestGzipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestGzipType_Any() {
		return (EAttribute)requestGzipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestGzipType_Value() {
		return (EAttribute)requestGzipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptionType() {
		return serviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_Any() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_Location() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocketTimeoutType() {
		return socketTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocketTimeoutType_Any() {
		return (EAttribute)socketTimeoutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocketTimeoutType_Value() {
		return (EAttribute)socketTimeoutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEndpoint() {
		return tEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEndpoint_ServiceDescription() {
		return (EReference)tEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEndpoint_EnableSec() {
		return (EReference)tEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEndpoint_Address() {
		return (EReference)tEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEndpoint_MexTimeout() {
		return (EReference)tEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEndpoint_HttpOptions() {
		return (EReference)tEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEndpoint_Any() {
		return (EAttribute)tEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEndpoint_Name() {
		return (EAttribute)tEndpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEndpoint_Port() {
		return (EAttribute)tEndpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueType() {
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeObject() {
		return valueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		acceptGzipTypeEClass = createEClass(ACCEPT_GZIP_TYPE);
		createEAttribute(acceptGzipTypeEClass, ACCEPT_GZIP_TYPE__ANY);
		createEAttribute(acceptGzipTypeEClass, ACCEPT_GZIP_TYPE__VALUE);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__ANY);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__URI);

		connectionTimeoutTypeEClass = createEClass(CONNECTION_TIMEOUT_TYPE);
		createEAttribute(connectionTimeoutTypeEClass, CONNECTION_TIMEOUT_TYPE__ANY);
		createEAttribute(connectionTimeoutTypeEClass, CONNECTION_TIMEOUT_TYPE__VALUE);

		defaultHeadersTypeEClass = createEClass(DEFAULT_HEADERS_TYPE);
		createEReference(defaultHeadersTypeEClass, DEFAULT_HEADERS_TYPE__HEADER);
		createEAttribute(defaultHeadersTypeEClass, DEFAULT_HEADERS_TYPE__ANY);

		enableSecTypeEClass = createEClass(ENABLE_SEC_TYPE);
		createEAttribute(enableSecTypeEClass, ENABLE_SEC_TYPE__ANY);
		createEAttribute(enableSecTypeEClass, ENABLE_SEC_TYPE__POLICY_LOCATION);

		headerTypeEClass = createEClass(HEADER_TYPE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__ANY);
		createEAttribute(headerTypeEClass, HEADER_TYPE__NAME);
		createEAttribute(headerTypeEClass, HEADER_TYPE__VALUE);

		httpOptionsTypeEClass = createEClass(HTTP_OPTIONS_TYPE);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__REQUEST_CHUNK);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__PROTOCOL_VERSION);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__REQUEST_GZIP);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__ACCEPT_GZIP);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__PROXY);
		createEReference(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__DEFAULT_HEADERS);
		createEAttribute(httpOptionsTypeEClass, HTTP_OPTIONS_TYPE__ANY);

		mexTimeoutTypeEClass = createEClass(MEX_TIMEOUT_TYPE);
		createEAttribute(mexTimeoutTypeEClass, MEX_TIMEOUT_TYPE__ANY);
		createEAttribute(mexTimeoutTypeEClass, MEX_TIMEOUT_TYPE__VALUE);

		protocolContentCharsetTypeEClass = createEClass(PROTOCOL_CONTENT_CHARSET_TYPE);
		createEAttribute(protocolContentCharsetTypeEClass, PROTOCOL_CONTENT_CHARSET_TYPE__ANY);
		createEAttribute(protocolContentCharsetTypeEClass, PROTOCOL_CONTENT_CHARSET_TYPE__VALUE);

		protocolMaxRedirectsTypeEClass = createEClass(PROTOCOL_MAX_REDIRECTS_TYPE);
		createEAttribute(protocolMaxRedirectsTypeEClass, PROTOCOL_MAX_REDIRECTS_TYPE__ANY);
		createEAttribute(protocolMaxRedirectsTypeEClass, PROTOCOL_MAX_REDIRECTS_TYPE__VALUE);

		protocolVersionTypeEClass = createEClass(PROTOCOL_VERSION_TYPE);
		createEAttribute(protocolVersionTypeEClass, PROTOCOL_VERSION_TYPE__ANY);
		createEAttribute(protocolVersionTypeEClass, PROTOCOL_VERSION_TYPE__VALUE);

		proxyTypeEClass = createEClass(PROXY_TYPE);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__ANY);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__DOMAIN);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__HOST);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__PASSWORD);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__PORT);
		createEAttribute(proxyTypeEClass, PROXY_TYPE__USER);

		requestChunkTypeEClass = createEClass(REQUEST_CHUNK_TYPE);
		createEAttribute(requestChunkTypeEClass, REQUEST_CHUNK_TYPE__ANY);
		createEAttribute(requestChunkTypeEClass, REQUEST_CHUNK_TYPE__VALUE);

		requestGzipTypeEClass = createEClass(REQUEST_GZIP_TYPE);
		createEAttribute(requestGzipTypeEClass, REQUEST_GZIP_TYPE__ANY);
		createEAttribute(requestGzipTypeEClass, REQUEST_GZIP_TYPE__VALUE);

		serviceDescriptionTypeEClass = createEClass(SERVICE_DESCRIPTION_TYPE);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__ANY);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__LOCATION);

		socketTimeoutTypeEClass = createEClass(SOCKET_TIMEOUT_TYPE);
		createEAttribute(socketTimeoutTypeEClass, SOCKET_TIMEOUT_TYPE__ANY);
		createEAttribute(socketTimeoutTypeEClass, SOCKET_TIMEOUT_TYPE__VALUE);

		tEndpointEClass = createEClass(TENDPOINT);
		createEReference(tEndpointEClass, TENDPOINT__SERVICE_DESCRIPTION);
		createEReference(tEndpointEClass, TENDPOINT__ENABLE_SEC);
		createEReference(tEndpointEClass, TENDPOINT__ADDRESS);
		createEReference(tEndpointEClass, TENDPOINT__MEX_TIMEOUT);
		createEReference(tEndpointEClass, TENDPOINT__HTTP_OPTIONS);
		createEAttribute(tEndpointEClass, TENDPOINT__ANY);
		createEAttribute(tEndpointEClass, TENDPOINT__NAME);
		createEAttribute(tEndpointEClass, TENDPOINT__PORT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT);

		// Create enums
		valueTypeEEnum = createEEnum(VALUE_TYPE);

		// Create data types
		valueTypeObjectEDataType = createEDataType(VALUE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(acceptGzipTypeEClass, AcceptGzipType.class, "AcceptGzipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptGzipType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AcceptGzipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcceptGzipType_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, AcceptGzipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Uri(), theXMLTypePackage.getString(), "uri", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionTimeoutTypeEClass, ConnectionTimeoutType.class, "ConnectionTimeoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionTimeoutType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ConnectionTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionTimeoutType_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, ConnectionTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultHeadersTypeEClass, DefaultHeadersType.class, "DefaultHeadersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultHeadersType_Header(), this.getHeaderType(), null, "header", null, 1, -1, DefaultHeadersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultHeadersType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DefaultHeadersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enableSecTypeEClass, EnableSecType.class, "EnableSecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnableSecType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EnableSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableSecType_PolicyLocation(), theXMLTypePackage.getString(), "policyLocation", null, 1, 1, EnableSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerTypeEClass, HeaderType.class, "HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpOptionsTypeEClass, HttpOptionsType.class, "HttpOptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHttpOptionsType_RequestChunk(), this.getRequestChunkType(), null, "requestChunk", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_ProtocolVersion(), this.getProtocolVersionType(), null, "protocolVersion", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_RequestGzip(), this.getRequestGzipType(), null, "requestGzip", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_AcceptGzip(), this.getAcceptGzipType(), null, "acceptGzip", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_ProtocolContentCharset(), this.getProtocolContentCharsetType(), null, "protocolContentCharset", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_ConnectionTimeout(), this.getConnectionTimeoutType(), null, "connectionTimeout", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_SocketTimeout(), this.getSocketTimeoutType(), null, "socketTimeout", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_ProtocolMaxRedirects(), this.getProtocolMaxRedirectsType(), null, "protocolMaxRedirects", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_Proxy(), this.getProxyType(), null, "proxy", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpOptionsType_DefaultHeaders(), this.getDefaultHeadersType(), null, "defaultHeaders", null, 0, 1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpOptionsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, HttpOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mexTimeoutTypeEClass, MexTimeoutType.class, "MexTimeoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMexTimeoutType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, MexTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMexTimeoutType_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, MexTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolContentCharsetTypeEClass, ProtocolContentCharsetType.class, "ProtocolContentCharsetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolContentCharsetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ProtocolContentCharsetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolContentCharsetType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ProtocolContentCharsetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolMaxRedirectsTypeEClass, ProtocolMaxRedirectsType.class, "ProtocolMaxRedirectsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolMaxRedirectsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ProtocolMaxRedirectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolMaxRedirectsType_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, ProtocolMaxRedirectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolVersionTypeEClass, ProtocolVersionType.class, "ProtocolVersionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolVersionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ProtocolVersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolVersionType_Value(), this.getValueType(), "value", null, 1, 1, ProtocolVersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyTypeEClass, ProxyType.class, "ProxyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyType_Domain(), theXMLTypePackage.getString(), "domain", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyType_Host(), theXMLTypePackage.getString(), "host", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyType_Port(), theXMLTypePackage.getInt(), "port", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestChunkTypeEClass, RequestChunkType.class, "RequestChunkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestChunkType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RequestChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestChunkType_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, RequestChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestGzipTypeEClass, RequestGzipType.class, "RequestGzipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestGzipType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RequestGzipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestGzipType_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, RequestGzipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptionTypeEClass, ServiceDescriptionType.class, "ServiceDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescriptionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socketTimeoutTypeEClass, SocketTimeoutType.class, "SocketTimeoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocketTimeoutType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SocketTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocketTimeoutType_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, SocketTimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEndpointEClass, TEndpoint.class, "TEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEndpoint_ServiceDescription(), this.getServiceDescriptionType(), null, "serviceDescription", null, 0, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEndpoint_EnableSec(), this.getEnableSecType(), null, "enableSec", null, 0, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEndpoint_Address(), this.getAddressType(), null, "address", null, 0, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEndpoint_MexTimeout(), this.getMexTimeoutType(), null, "mexTimeout", null, 0, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEndpoint_HttpOptions(), this.getHttpOptionsType(), null, "httpOptions", null, 0, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEndpoint_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEndpoint_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEndpoint_Port(), theXMLTypePackage.getNCName(), "port", null, 1, 1, TEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endpoint(), this.getTEndpoint(), null, "endpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
		addEEnumLiteral(valueTypeEEnum, ValueType._10);
		addEEnumLiteral(valueTypeEEnum, ValueType._11);

		// Initialize data types
		initEDataType(valueTypeObjectEDataType, ValueType.class, "ValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (acceptGzipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "accept-gzip_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAcceptGzipType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getAcceptGzipType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (addressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "address_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getAddressType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (connectionTimeoutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "connection-timeout_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConnectionTimeoutType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getConnectionTimeoutType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (defaultHeadersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "default-headers_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDefaultHeadersType_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDefaultHeadersType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (enableSecTypeEClass, 
		   source, 
		   new String[] {
			 "name", "enableSec_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnableSecType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEnableSecType_PolicyLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "policyLocation"
		   });		
		addAnnotation
		  (headerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "header_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHeaderType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getHeaderType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getHeaderType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (httpOptionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "httpOptions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHttpOptionsType_RequestChunk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "request-chunk",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_ProtocolVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "protocol-version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_RequestGzip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "request-gzip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_AcceptGzip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accept-gzip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_ProtocolContentCharset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "protocol-content-charset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_ConnectionTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connection-timeout",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_SocketTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "socket-timeout",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_ProtocolMaxRedirects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "protocol-max-redirects",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_Proxy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "proxy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_DefaultHeaders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "default-headers",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHttpOptionsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "lax"
		   });		
		addAnnotation
		  (mexTimeoutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mex-timeout_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMexTimeoutType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getMexTimeoutType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (protocolContentCharsetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "protocol-content-charset_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProtocolContentCharsetType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getProtocolContentCharsetType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (protocolMaxRedirectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "protocol-max-redirects_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProtocolMaxRedirectsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getProtocolMaxRedirectsType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (protocolVersionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "protocol-version_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProtocolVersionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getProtocolVersionType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (proxyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "proxy_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProxyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getProxyType_Domain(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "domain"
		   });		
		addAnnotation
		  (getProxyType_Host(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "host"
		   });		
		addAnnotation
		  (getProxyType_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password"
		   });		
		addAnnotation
		  (getProxyType_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });		
		addAnnotation
		  (getProxyType_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user"
		   });		
		addAnnotation
		  (requestChunkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "request-chunk_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestChunkType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getRequestChunkType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (requestGzipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "request-gzip_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestGzipType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getRequestGzipType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (serviceDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "serviceDescription_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceDescriptionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getServiceDescriptionType_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location"
		   });		
		addAnnotation
		  (socketTimeoutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "socket-timeout_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSocketTimeoutType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSocketTimeoutType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (tEndpointEClass, 
		   source, 
		   new String[] {
			 "name", "tEndpoint",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTEndpoint_ServiceDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "serviceDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTEndpoint_EnableSec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enableSec",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTEndpoint_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTEndpoint_MexTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mex-timeout",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTEndpoint_HttpOptions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "httpOptions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTEndpoint_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getTEndpoint_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getTEndpoint_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });		
		addAnnotation
		  (valueTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "value_._type"
		   });		
		addAnnotation
		  (valueTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "value_._type:Object",
			 "baseType", "value_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Endpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endpoint",
			 "namespace", "##targetNamespace"
		   });
	}

} //ConfigPackageImpl
