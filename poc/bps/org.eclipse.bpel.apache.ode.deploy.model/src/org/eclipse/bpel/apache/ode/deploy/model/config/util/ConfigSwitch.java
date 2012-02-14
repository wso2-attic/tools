/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.util;

import org.eclipse.bpel.apache.ode.deploy.model.config.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see config.ConfigPackage
 * @generated
 */
public class ConfigSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfigPackage.ACCEPT_GZIP_TYPE: {
				AcceptGzipType acceptGzipType = (AcceptGzipType)theEObject;
				T result = caseAcceptGzipType(acceptGzipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CONNECTION_TIMEOUT_TYPE: {
				ConnectionTimeoutType connectionTimeoutType = (ConnectionTimeoutType)theEObject;
				T result = caseConnectionTimeoutType(connectionTimeoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.DEFAULT_HEADERS_TYPE: {
				DefaultHeadersType defaultHeadersType = (DefaultHeadersType)theEObject;
				T result = caseDefaultHeadersType(defaultHeadersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ENABLE_SEC_TYPE: {
				EnableSecType enableSecType = (EnableSecType)theEObject;
				T result = caseEnableSecType(enableSecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.HTTP_OPTIONS_TYPE: {
				HttpOptionsType httpOptionsType = (HttpOptionsType)theEObject;
				T result = caseHttpOptionsType(httpOptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.MEX_TIMEOUT_TYPE: {
				MexTimeoutType mexTimeoutType = (MexTimeoutType)theEObject;
				T result = caseMexTimeoutType(mexTimeoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PROTOCOL_CONTENT_CHARSET_TYPE: {
				ProtocolContentCharsetType protocolContentCharsetType = (ProtocolContentCharsetType)theEObject;
				T result = caseProtocolContentCharsetType(protocolContentCharsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PROTOCOL_MAX_REDIRECTS_TYPE: {
				ProtocolMaxRedirectsType protocolMaxRedirectsType = (ProtocolMaxRedirectsType)theEObject;
				T result = caseProtocolMaxRedirectsType(protocolMaxRedirectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PROTOCOL_VERSION_TYPE: {
				ProtocolVersionType protocolVersionType = (ProtocolVersionType)theEObject;
				T result = caseProtocolVersionType(protocolVersionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PROXY_TYPE: {
				ProxyType proxyType = (ProxyType)theEObject;
				T result = caseProxyType(proxyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.REQUEST_CHUNK_TYPE: {
				RequestChunkType requestChunkType = (RequestChunkType)theEObject;
				T result = caseRequestChunkType(requestChunkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.REQUEST_GZIP_TYPE: {
				RequestGzipType requestGzipType = (RequestGzipType)theEObject;
				T result = caseRequestGzipType(requestGzipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.SERVICE_DESCRIPTION_TYPE: {
				ServiceDescriptionType serviceDescriptionType = (ServiceDescriptionType)theEObject;
				T result = caseServiceDescriptionType(serviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.SOCKET_TIMEOUT_TYPE: {
				SocketTimeoutType socketTimeoutType = (SocketTimeoutType)theEObject;
				T result = caseSocketTimeoutType(socketTimeoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.TENDPOINT: {
				TEndpoint tEndpoint = (TEndpoint)theEObject;
				T result = caseTEndpoint(tEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Gzip Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Gzip Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptGzipType(AcceptGzipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Timeout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionTimeoutType(ConnectionTimeoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Headers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Headers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultHeadersType(DefaultHeadersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Sec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableSecType(EnableSecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Options Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpOptionsType(HttpOptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mex Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mex Timeout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMexTimeoutType(MexTimeoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Content Charset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Content Charset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolContentCharsetType(ProtocolContentCharsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Max Redirects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Max Redirects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolMaxRedirectsType(ProtocolMaxRedirectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolVersionType(ProtocolVersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyType(ProxyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Chunk Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Chunk Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestChunkType(RequestChunkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Gzip Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Gzip Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGzipType(RequestGzipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptionType(ServiceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socket Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socket Timeout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocketTimeoutType(SocketTimeoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEndpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEndpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEndpoint(TEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ConfigSwitch
