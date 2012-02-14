/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.impl;

import org.eclipse.bpel.apache.ode.deploy.model.config.AcceptGzipType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ConfigPackage;
import org.eclipse.bpel.apache.ode.deploy.model.config.ConnectionTimeoutType;
import org.eclipse.bpel.apache.ode.deploy.model.config.DefaultHeadersType;
import org.eclipse.bpel.apache.ode.deploy.model.config.HttpOptionsType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ProtocolContentCharsetType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ProtocolMaxRedirectsType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ProtocolVersionType;
import org.eclipse.bpel.apache.ode.deploy.model.config.ProxyType;
import org.eclipse.bpel.apache.ode.deploy.model.config.RequestChunkType;
import org.eclipse.bpel.apache.ode.deploy.model.config.RequestGzipType;
import org.eclipse.bpel.apache.ode.deploy.model.config.SocketTimeoutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Options Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getRequestChunk <em>Request Chunk</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getProtocolVersion <em>Protocol Version</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getRequestGzip <em>Request Gzip</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getAcceptGzip <em>Accept Gzip</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getProtocolContentCharset <em>Protocol Content Charset</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getSocketTimeout <em>Socket Timeout</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getProtocolMaxRedirects <em>Protocol Max Redirects</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getDefaultHeaders <em>Default Headers</em>}</li>
 *   <li>{@link config.impl.HttpOptionsTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpOptionsTypeImpl extends EObjectImpl implements HttpOptionsType {
	/**
	 * The cached value of the '{@link #getRequestChunk() <em>Request Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestChunk()
	 * @generated
	 * @ordered
	 */
	protected RequestChunkType requestChunk;

	/**
	 * The cached value of the '{@link #getProtocolVersion() <em>Protocol Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected ProtocolVersionType protocolVersion;

	/**
	 * The cached value of the '{@link #getRequestGzip() <em>Request Gzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestGzip()
	 * @generated
	 * @ordered
	 */
	protected RequestGzipType requestGzip;

	/**
	 * The cached value of the '{@link #getAcceptGzip() <em>Accept Gzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptGzip()
	 * @generated
	 * @ordered
	 */
	protected AcceptGzipType acceptGzip;

	/**
	 * The cached value of the '{@link #getProtocolContentCharset() <em>Protocol Content Charset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolContentCharset()
	 * @generated
	 * @ordered
	 */
	protected ProtocolContentCharsetType protocolContentCharset;

	/**
	 * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected ConnectionTimeoutType connectionTimeout;

	/**
	 * The cached value of the '{@link #getSocketTimeout() <em>Socket Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocketTimeout()
	 * @generated
	 * @ordered
	 */
	protected SocketTimeoutType socketTimeout;

	/**
	 * The cached value of the '{@link #getProtocolMaxRedirects() <em>Protocol Max Redirects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolMaxRedirects()
	 * @generated
	 * @ordered
	 */
	protected ProtocolMaxRedirectsType protocolMaxRedirects;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected ProxyType proxy;

	/**
	 * The cached value of the '{@link #getDefaultHeaders() <em>Default Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHeaders()
	 * @generated
	 * @ordered
	 */
	protected DefaultHeadersType defaultHeaders;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpOptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.HTTP_OPTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestChunkType getRequestChunk() {
		return requestChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestChunk(RequestChunkType newRequestChunk, NotificationChain msgs) {
		RequestChunkType oldRequestChunk = requestChunk;
		requestChunk = newRequestChunk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK, oldRequestChunk, newRequestChunk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestChunk(RequestChunkType newRequestChunk) {
		if (newRequestChunk != requestChunk) {
			NotificationChain msgs = null;
			if (requestChunk != null)
				msgs = ((InternalEObject)requestChunk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK, null, msgs);
			if (newRequestChunk != null)
				msgs = ((InternalEObject)newRequestChunk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK, null, msgs);
			msgs = basicSetRequestChunk(newRequestChunk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK, newRequestChunk, newRequestChunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolVersionType getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolVersion(ProtocolVersionType newProtocolVersion, NotificationChain msgs) {
		ProtocolVersionType oldProtocolVersion = protocolVersion;
		protocolVersion = newProtocolVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION, oldProtocolVersion, newProtocolVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolVersion(ProtocolVersionType newProtocolVersion) {
		if (newProtocolVersion != protocolVersion) {
			NotificationChain msgs = null;
			if (protocolVersion != null)
				msgs = ((InternalEObject)protocolVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION, null, msgs);
			if (newProtocolVersion != null)
				msgs = ((InternalEObject)newProtocolVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION, null, msgs);
			msgs = basicSetProtocolVersion(newProtocolVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION, newProtocolVersion, newProtocolVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGzipType getRequestGzip() {
		return requestGzip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestGzip(RequestGzipType newRequestGzip, NotificationChain msgs) {
		RequestGzipType oldRequestGzip = requestGzip;
		requestGzip = newRequestGzip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP, oldRequestGzip, newRequestGzip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestGzip(RequestGzipType newRequestGzip) {
		if (newRequestGzip != requestGzip) {
			NotificationChain msgs = null;
			if (requestGzip != null)
				msgs = ((InternalEObject)requestGzip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP, null, msgs);
			if (newRequestGzip != null)
				msgs = ((InternalEObject)newRequestGzip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP, null, msgs);
			msgs = basicSetRequestGzip(newRequestGzip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP, newRequestGzip, newRequestGzip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptGzipType getAcceptGzip() {
		return acceptGzip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptGzip(AcceptGzipType newAcceptGzip, NotificationChain msgs) {
		AcceptGzipType oldAcceptGzip = acceptGzip;
		acceptGzip = newAcceptGzip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP, oldAcceptGzip, newAcceptGzip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptGzip(AcceptGzipType newAcceptGzip) {
		if (newAcceptGzip != acceptGzip) {
			NotificationChain msgs = null;
			if (acceptGzip != null)
				msgs = ((InternalEObject)acceptGzip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP, null, msgs);
			if (newAcceptGzip != null)
				msgs = ((InternalEObject)newAcceptGzip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP, null, msgs);
			msgs = basicSetAcceptGzip(newAcceptGzip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP, newAcceptGzip, newAcceptGzip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolContentCharsetType getProtocolContentCharset() {
		return protocolContentCharset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolContentCharset(ProtocolContentCharsetType newProtocolContentCharset, NotificationChain msgs) {
		ProtocolContentCharsetType oldProtocolContentCharset = protocolContentCharset;
		protocolContentCharset = newProtocolContentCharset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET, oldProtocolContentCharset, newProtocolContentCharset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolContentCharset(ProtocolContentCharsetType newProtocolContentCharset) {
		if (newProtocolContentCharset != protocolContentCharset) {
			NotificationChain msgs = null;
			if (protocolContentCharset != null)
				msgs = ((InternalEObject)protocolContentCharset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET, null, msgs);
			if (newProtocolContentCharset != null)
				msgs = ((InternalEObject)newProtocolContentCharset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET, null, msgs);
			msgs = basicSetProtocolContentCharset(newProtocolContentCharset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET, newProtocolContentCharset, newProtocolContentCharset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTimeoutType getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionTimeout(ConnectionTimeoutType newConnectionTimeout, NotificationChain msgs) {
		ConnectionTimeoutType oldConnectionTimeout = connectionTimeout;
		connectionTimeout = newConnectionTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT, oldConnectionTimeout, newConnectionTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionTimeout(ConnectionTimeoutType newConnectionTimeout) {
		if (newConnectionTimeout != connectionTimeout) {
			NotificationChain msgs = null;
			if (connectionTimeout != null)
				msgs = ((InternalEObject)connectionTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT, null, msgs);
			if (newConnectionTimeout != null)
				msgs = ((InternalEObject)newConnectionTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT, null, msgs);
			msgs = basicSetConnectionTimeout(newConnectionTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT, newConnectionTimeout, newConnectionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocketTimeoutType getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSocketTimeout(SocketTimeoutType newSocketTimeout, NotificationChain msgs) {
		SocketTimeoutType oldSocketTimeout = socketTimeout;
		socketTimeout = newSocketTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT, oldSocketTimeout, newSocketTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocketTimeout(SocketTimeoutType newSocketTimeout) {
		if (newSocketTimeout != socketTimeout) {
			NotificationChain msgs = null;
			if (socketTimeout != null)
				msgs = ((InternalEObject)socketTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT, null, msgs);
			if (newSocketTimeout != null)
				msgs = ((InternalEObject)newSocketTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT, null, msgs);
			msgs = basicSetSocketTimeout(newSocketTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT, newSocketTimeout, newSocketTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolMaxRedirectsType getProtocolMaxRedirects() {
		return protocolMaxRedirects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolMaxRedirects(ProtocolMaxRedirectsType newProtocolMaxRedirects, NotificationChain msgs) {
		ProtocolMaxRedirectsType oldProtocolMaxRedirects = protocolMaxRedirects;
		protocolMaxRedirects = newProtocolMaxRedirects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS, oldProtocolMaxRedirects, newProtocolMaxRedirects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolMaxRedirects(ProtocolMaxRedirectsType newProtocolMaxRedirects) {
		if (newProtocolMaxRedirects != protocolMaxRedirects) {
			NotificationChain msgs = null;
			if (protocolMaxRedirects != null)
				msgs = ((InternalEObject)protocolMaxRedirects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS, null, msgs);
			if (newProtocolMaxRedirects != null)
				msgs = ((InternalEObject)newProtocolMaxRedirects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS, null, msgs);
			msgs = basicSetProtocolMaxRedirects(newProtocolMaxRedirects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS, newProtocolMaxRedirects, newProtocolMaxRedirects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyType getProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(ProxyType newProxy, NotificationChain msgs) {
		ProxyType oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROXY, oldProxy, newProxy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(ProxyType newProxy) {
		if (newProxy != proxy) {
			NotificationChain msgs = null;
			if (proxy != null)
				msgs = ((InternalEObject)proxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROXY, null, msgs);
			if (newProxy != null)
				msgs = ((InternalEObject)newProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__PROXY, null, msgs);
			msgs = basicSetProxy(newProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__PROXY, newProxy, newProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultHeadersType getDefaultHeaders() {
		return defaultHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultHeaders(DefaultHeadersType newDefaultHeaders, NotificationChain msgs) {
		DefaultHeadersType oldDefaultHeaders = defaultHeaders;
		defaultHeaders = newDefaultHeaders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS, oldDefaultHeaders, newDefaultHeaders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHeaders(DefaultHeadersType newDefaultHeaders) {
		if (newDefaultHeaders != defaultHeaders) {
			NotificationChain msgs = null;
			if (defaultHeaders != null)
				msgs = ((InternalEObject)defaultHeaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS, null, msgs);
			if (newDefaultHeaders != null)
				msgs = ((InternalEObject)newDefaultHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS, null, msgs);
			msgs = basicSetDefaultHeaders(newDefaultHeaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS, newDefaultHeaders, newDefaultHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ConfigPackage.HTTP_OPTIONS_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK:
				return basicSetRequestChunk(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION:
				return basicSetProtocolVersion(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP:
				return basicSetRequestGzip(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP:
				return basicSetAcceptGzip(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET:
				return basicSetProtocolContentCharset(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT:
				return basicSetConnectionTimeout(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT:
				return basicSetSocketTimeout(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS:
				return basicSetProtocolMaxRedirects(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROXY:
				return basicSetProxy(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS:
				return basicSetDefaultHeaders(null, msgs);
			case ConfigPackage.HTTP_OPTIONS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK:
				return getRequestChunk();
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION:
				return getProtocolVersion();
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP:
				return getRequestGzip();
			case ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP:
				return getAcceptGzip();
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET:
				return getProtocolContentCharset();
			case ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT:
				return getConnectionTimeout();
			case ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT:
				return getSocketTimeout();
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS:
				return getProtocolMaxRedirects();
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROXY:
				return getProxy();
			case ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS:
				return getDefaultHeaders();
			case ConfigPackage.HTTP_OPTIONS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK:
				setRequestChunk((RequestChunkType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION:
				setProtocolVersion((ProtocolVersionType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP:
				setRequestGzip((RequestGzipType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP:
				setAcceptGzip((AcceptGzipType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET:
				setProtocolContentCharset((ProtocolContentCharsetType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT:
				setConnectionTimeout((ConnectionTimeoutType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT:
				setSocketTimeout((SocketTimeoutType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS:
				setProtocolMaxRedirects((ProtocolMaxRedirectsType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROXY:
				setProxy((ProxyType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS:
				setDefaultHeaders((DefaultHeadersType)newValue);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK:
				setRequestChunk((RequestChunkType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION:
				setProtocolVersion((ProtocolVersionType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP:
				setRequestGzip((RequestGzipType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP:
				setAcceptGzip((AcceptGzipType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET:
				setProtocolContentCharset((ProtocolContentCharsetType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT:
				setConnectionTimeout((ConnectionTimeoutType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT:
				setSocketTimeout((SocketTimeoutType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS:
				setProtocolMaxRedirects((ProtocolMaxRedirectsType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROXY:
				setProxy((ProxyType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS:
				setDefaultHeaders((DefaultHeadersType)null);
				return;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ANY:
				getAny().clear();
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
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_CHUNK:
				return requestChunk != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_VERSION:
				return protocolVersion != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__REQUEST_GZIP:
				return requestGzip != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ACCEPT_GZIP:
				return acceptGzip != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_CONTENT_CHARSET:
				return protocolContentCharset != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__CONNECTION_TIMEOUT:
				return connectionTimeout != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__SOCKET_TIMEOUT:
				return socketTimeout != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROTOCOL_MAX_REDIRECTS:
				return protocolMaxRedirects != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__PROXY:
				return proxy != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__DEFAULT_HEADERS:
				return defaultHeaders != null;
			case ConfigPackage.HTTP_OPTIONS_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //HttpOptionsTypeImpl
