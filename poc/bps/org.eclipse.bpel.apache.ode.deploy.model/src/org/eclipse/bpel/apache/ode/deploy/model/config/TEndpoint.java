/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.apache.ode.deploy.model.config;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEndpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link config.TEndpoint#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link config.TEndpoint#getEnableSec <em>Enable Sec</em>}</li>
 *   <li>{@link config.TEndpoint#getAddress <em>Address</em>}</li>
 *   <li>{@link config.TEndpoint#getMexTimeout <em>Mex Timeout</em>}</li>
 *   <li>{@link config.TEndpoint#getHttpOptions <em>Http Options</em>}</li>
 *   <li>{@link config.TEndpoint#getAny <em>Any</em>}</li>
 *   <li>{@link config.TEndpoint#getName <em>Name</em>}</li>
 *   <li>{@link config.TEndpoint#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see config.ConfigPackage#getTEndpoint()
 * @model extendedMetaData="name='tEndpoint' kind='elementOnly'"
 * @generated
 */
public interface TEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Description</em>' containment reference.
	 * @see #setServiceDescription(ServiceDescriptionType)
	 * @see config.ConfigPackage#getTEndpoint_ServiceDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDescriptionType getServiceDescription();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getServiceDescription <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description</em>' containment reference.
	 * @see #getServiceDescription()
	 * @generated
	 */
	void setServiceDescription(ServiceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Enable Sec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Sec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Sec</em>' containment reference.
	 * @see #setEnableSec(EnableSecType)
	 * @see config.ConfigPackage#getTEndpoint_EnableSec()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableSec' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableSecType getEnableSec();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getEnableSec <em>Enable Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Sec</em>' containment reference.
	 * @see #getEnableSec()
	 * @generated
	 */
	void setEnableSec(EnableSecType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see config.ConfigPackage#getTEndpoint_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Mex Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mex Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mex Timeout</em>' containment reference.
	 * @see #setMexTimeout(MexTimeoutType)
	 * @see config.ConfigPackage#getTEndpoint_MexTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mex-timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	MexTimeoutType getMexTimeout();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getMexTimeout <em>Mex Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mex Timeout</em>' containment reference.
	 * @see #getMexTimeout()
	 * @generated
	 */
	void setMexTimeout(MexTimeoutType value);

	/**
	 * Returns the value of the '<em><b>Http Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Options</em>' containment reference.
	 * @see #setHttpOptions(HttpOptionsType)
	 * @see config.ConfigPackage#getTEndpoint_HttpOptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='httpOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	HttpOptionsType getHttpOptions();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getHttpOptions <em>Http Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Options</em>' containment reference.
	 * @see #getHttpOptions()
	 * @generated
	 */
	void setHttpOptions(HttpOptionsType value);

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
	 * @see config.ConfigPackage#getTEndpoint_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see config.ConfigPackage#getTEndpoint_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see config.ConfigPackage#getTEndpoint_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='port'"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link config.TEndpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

} // TEndpoint
