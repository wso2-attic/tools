/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Options Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link config.HttpOptionsType#getRequestChunk <em>Request Chunk</em>}</li>
 *   <li>{@link config.HttpOptionsType#getProtocolVersion <em>Protocol Version</em>}</li>
 *   <li>{@link config.HttpOptionsType#getRequestGzip <em>Request Gzip</em>}</li>
 *   <li>{@link config.HttpOptionsType#getAcceptGzip <em>Accept Gzip</em>}</li>
 *   <li>{@link config.HttpOptionsType#getProtocolContentCharset <em>Protocol Content Charset</em>}</li>
 *   <li>{@link config.HttpOptionsType#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link config.HttpOptionsType#getSocketTimeout <em>Socket Timeout</em>}</li>
 *   <li>{@link config.HttpOptionsType#getProtocolMaxRedirects <em>Protocol Max Redirects</em>}</li>
 *   <li>{@link config.HttpOptionsType#getProxy <em>Proxy</em>}</li>
 *   <li>{@link config.HttpOptionsType#getDefaultHeaders <em>Default Headers</em>}</li>
 *   <li>{@link config.HttpOptionsType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see config.ConfigPackage#getHttpOptionsType()
 * @model extendedMetaData="name='httpOptions_._type' kind='elementOnly'"
 * @generated
 */
public interface HttpOptionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Chunk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Chunk</em>' containment reference.
	 * @see #setRequestChunk(RequestChunkType)
	 * @see config.ConfigPackage#getHttpOptionsType_RequestChunk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request-chunk' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestChunkType getRequestChunk();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getRequestChunk <em>Request Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Chunk</em>' containment reference.
	 * @see #getRequestChunk()
	 * @generated
	 */
	void setRequestChunk(RequestChunkType value);

	/**
	 * Returns the value of the '<em><b>Protocol Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Version</em>' containment reference.
	 * @see #setProtocolVersion(ProtocolVersionType)
	 * @see config.ConfigPackage#getHttpOptionsType_ProtocolVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol-version' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolVersionType getProtocolVersion();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getProtocolVersion <em>Protocol Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Version</em>' containment reference.
	 * @see #getProtocolVersion()
	 * @generated
	 */
	void setProtocolVersion(ProtocolVersionType value);

	/**
	 * Returns the value of the '<em><b>Request Gzip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Gzip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Gzip</em>' containment reference.
	 * @see #setRequestGzip(RequestGzipType)
	 * @see config.ConfigPackage#getHttpOptionsType_RequestGzip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request-gzip' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestGzipType getRequestGzip();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getRequestGzip <em>Request Gzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Gzip</em>' containment reference.
	 * @see #getRequestGzip()
	 * @generated
	 */
	void setRequestGzip(RequestGzipType value);

	/**
	 * Returns the value of the '<em><b>Accept Gzip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Gzip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Gzip</em>' containment reference.
	 * @see #setAcceptGzip(AcceptGzipType)
	 * @see config.ConfigPackage#getHttpOptionsType_AcceptGzip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accept-gzip' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptGzipType getAcceptGzip();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getAcceptGzip <em>Accept Gzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Gzip</em>' containment reference.
	 * @see #getAcceptGzip()
	 * @generated
	 */
	void setAcceptGzip(AcceptGzipType value);

	/**
	 * Returns the value of the '<em><b>Protocol Content Charset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Content Charset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Content Charset</em>' containment reference.
	 * @see #setProtocolContentCharset(ProtocolContentCharsetType)
	 * @see config.ConfigPackage#getHttpOptionsType_ProtocolContentCharset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol-content-charset' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolContentCharsetType getProtocolContentCharset();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getProtocolContentCharset <em>Protocol Content Charset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Content Charset</em>' containment reference.
	 * @see #getProtocolContentCharset()
	 * @generated
	 */
	void setProtocolContentCharset(ProtocolContentCharsetType value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Timeout</em>' containment reference.
	 * @see #setConnectionTimeout(ConnectionTimeoutType)
	 * @see config.ConfigPackage#getHttpOptionsType_ConnectionTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connection-timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionTimeoutType getConnectionTimeout();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getConnectionTimeout <em>Connection Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout</em>' containment reference.
	 * @see #getConnectionTimeout()
	 * @generated
	 */
	void setConnectionTimeout(ConnectionTimeoutType value);

	/**
	 * Returns the value of the '<em><b>Socket Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Socket Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket Timeout</em>' containment reference.
	 * @see #setSocketTimeout(SocketTimeoutType)
	 * @see config.ConfigPackage#getHttpOptionsType_SocketTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='socket-timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	SocketTimeoutType getSocketTimeout();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getSocketTimeout <em>Socket Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket Timeout</em>' containment reference.
	 * @see #getSocketTimeout()
	 * @generated
	 */
	void setSocketTimeout(SocketTimeoutType value);

	/**
	 * Returns the value of the '<em><b>Protocol Max Redirects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Max Redirects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Max Redirects</em>' containment reference.
	 * @see #setProtocolMaxRedirects(ProtocolMaxRedirectsType)
	 * @see config.ConfigPackage#getHttpOptionsType_ProtocolMaxRedirects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol-max-redirects' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolMaxRedirectsType getProtocolMaxRedirects();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getProtocolMaxRedirects <em>Protocol Max Redirects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Max Redirects</em>' containment reference.
	 * @see #getProtocolMaxRedirects()
	 * @generated
	 */
	void setProtocolMaxRedirects(ProtocolMaxRedirectsType value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' containment reference.
	 * @see #setProxy(ProxyType)
	 * @see config.ConfigPackage#getHttpOptionsType_Proxy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace'"
	 * @generated
	 */
	ProxyType getProxy();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getProxy <em>Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' containment reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(ProxyType value);

	/**
	 * Returns the value of the '<em><b>Default Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Headers</em>' containment reference.
	 * @see #setDefaultHeaders(DefaultHeadersType)
	 * @see config.ConfigPackage#getHttpOptionsType_DefaultHeaders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-headers' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultHeadersType getDefaultHeaders();

	/**
	 * Sets the value of the '{@link config.HttpOptionsType#getDefaultHeaders <em>Default Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Headers</em>' containment reference.
	 * @see #getDefaultHeaders()
	 * @generated
	 */
	void setDefaultHeaders(DefaultHeadersType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see config.ConfigPackage#getHttpOptionsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // HttpOptionsType
