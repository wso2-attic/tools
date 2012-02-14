/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config.util;

import org.eclipse.bpel.apache.ode.deploy.model.config.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see config.ConfigPackage
 * @generated
 */
public class ConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigSwitch<Adapter> modelSwitch =
		new ConfigSwitch<Adapter>() {
			@Override
			public Adapter caseAcceptGzipType(AcceptGzipType object) {
				return createAcceptGzipTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseConnectionTimeoutType(ConnectionTimeoutType object) {
				return createConnectionTimeoutTypeAdapter();
			}
			@Override
			public Adapter caseDefaultHeadersType(DefaultHeadersType object) {
				return createDefaultHeadersTypeAdapter();
			}
			@Override
			public Adapter caseEnableSecType(EnableSecType object) {
				return createEnableSecTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseHttpOptionsType(HttpOptionsType object) {
				return createHttpOptionsTypeAdapter();
			}
			@Override
			public Adapter caseMexTimeoutType(MexTimeoutType object) {
				return createMexTimeoutTypeAdapter();
			}
			@Override
			public Adapter caseProtocolContentCharsetType(ProtocolContentCharsetType object) {
				return createProtocolContentCharsetTypeAdapter();
			}
			@Override
			public Adapter caseProtocolMaxRedirectsType(ProtocolMaxRedirectsType object) {
				return createProtocolMaxRedirectsTypeAdapter();
			}
			@Override
			public Adapter caseProtocolVersionType(ProtocolVersionType object) {
				return createProtocolVersionTypeAdapter();
			}
			@Override
			public Adapter caseProxyType(ProxyType object) {
				return createProxyTypeAdapter();
			}
			@Override
			public Adapter caseRequestChunkType(RequestChunkType object) {
				return createRequestChunkTypeAdapter();
			}
			@Override
			public Adapter caseRequestGzipType(RequestGzipType object) {
				return createRequestGzipTypeAdapter();
			}
			@Override
			public Adapter caseServiceDescriptionType(ServiceDescriptionType object) {
				return createServiceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSocketTimeoutType(SocketTimeoutType object) {
				return createSocketTimeoutTypeAdapter();
			}
			@Override
			public Adapter caseTEndpoint(TEndpoint object) {
				return createTEndpointAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link config.AcceptGzipType <em>Accept Gzip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.AcceptGzipType
	 * @generated
	 */
	public Adapter createAcceptGzipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ConnectionTimeoutType <em>Connection Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ConnectionTimeoutType
	 * @generated
	 */
	public Adapter createConnectionTimeoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.DefaultHeadersType <em>Default Headers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.DefaultHeadersType
	 * @generated
	 */
	public Adapter createDefaultHeadersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.EnableSecType <em>Enable Sec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.EnableSecType
	 * @generated
	 */
	public Adapter createEnableSecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.HttpOptionsType <em>Http Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.HttpOptionsType
	 * @generated
	 */
	public Adapter createHttpOptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.MexTimeoutType <em>Mex Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.MexTimeoutType
	 * @generated
	 */
	public Adapter createMexTimeoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ProtocolContentCharsetType <em>Protocol Content Charset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ProtocolContentCharsetType
	 * @generated
	 */
	public Adapter createProtocolContentCharsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ProtocolMaxRedirectsType <em>Protocol Max Redirects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ProtocolMaxRedirectsType
	 * @generated
	 */
	public Adapter createProtocolMaxRedirectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ProtocolVersionType <em>Protocol Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ProtocolVersionType
	 * @generated
	 */
	public Adapter createProtocolVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ProxyType <em>Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ProxyType
	 * @generated
	 */
	public Adapter createProxyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.RequestChunkType <em>Request Chunk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.RequestChunkType
	 * @generated
	 */
	public Adapter createRequestChunkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.RequestGzipType <em>Request Gzip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.RequestGzipType
	 * @generated
	 */
	public Adapter createRequestGzipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.ServiceDescriptionType
	 * @generated
	 */
	public Adapter createServiceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.SocketTimeoutType <em>Socket Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.SocketTimeoutType
	 * @generated
	 */
	public Adapter createSocketTimeoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.TEndpoint <em>TEndpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.TEndpoint
	 * @generated
	 */
	public Adapter createTEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see config.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConfigAdapterFactory
