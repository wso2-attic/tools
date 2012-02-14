/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see config.ConfigPackage
 * @generated
 */
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = org.eclipse.bpel.apache.ode.deploy.model.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accept Gzip Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Gzip Type</em>'.
	 * @generated
	 */
	AcceptGzipType createAcceptGzipType();

	/**
	 * Returns a new object of class '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Type</em>'.
	 * @generated
	 */
	AddressType createAddressType();

	/**
	 * Returns a new object of class '<em>Connection Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Timeout Type</em>'.
	 * @generated
	 */
	ConnectionTimeoutType createConnectionTimeoutType();

	/**
	 * Returns a new object of class '<em>Default Headers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Headers Type</em>'.
	 * @generated
	 */
	DefaultHeadersType createDefaultHeadersType();

	/**
	 * Returns a new object of class '<em>Enable Sec Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Sec Type</em>'.
	 * @generated
	 */
	EnableSecType createEnableSecType();

	/**
	 * Returns a new object of class '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Type</em>'.
	 * @generated
	 */
	HeaderType createHeaderType();

	/**
	 * Returns a new object of class '<em>Http Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Options Type</em>'.
	 * @generated
	 */
	HttpOptionsType createHttpOptionsType();

	/**
	 * Returns a new object of class '<em>Mex Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mex Timeout Type</em>'.
	 * @generated
	 */
	MexTimeoutType createMexTimeoutType();

	/**
	 * Returns a new object of class '<em>Protocol Content Charset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Content Charset Type</em>'.
	 * @generated
	 */
	ProtocolContentCharsetType createProtocolContentCharsetType();

	/**
	 * Returns a new object of class '<em>Protocol Max Redirects Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Max Redirects Type</em>'.
	 * @generated
	 */
	ProtocolMaxRedirectsType createProtocolMaxRedirectsType();

	/**
	 * Returns a new object of class '<em>Protocol Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Version Type</em>'.
	 * @generated
	 */
	ProtocolVersionType createProtocolVersionType();

	/**
	 * Returns a new object of class '<em>Proxy Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Type</em>'.
	 * @generated
	 */
	ProxyType createProxyType();

	/**
	 * Returns a new object of class '<em>Request Chunk Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Chunk Type</em>'.
	 * @generated
	 */
	RequestChunkType createRequestChunkType();

	/**
	 * Returns a new object of class '<em>Request Gzip Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Gzip Type</em>'.
	 * @generated
	 */
	RequestGzipType createRequestGzipType();

	/**
	 * Returns a new object of class '<em>Service Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Description Type</em>'.
	 * @generated
	 */
	ServiceDescriptionType createServiceDescriptionType();

	/**
	 * Returns a new object of class '<em>Socket Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socket Timeout Type</em>'.
	 * @generated
	 */
	SocketTimeoutType createSocketTimeoutType();

	/**
	 * Returns a new object of class '<em>TEndpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEndpoint</em>'.
	 * @generated
	 */
	TEndpoint createTEndpoint();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

} //ConfigFactory
