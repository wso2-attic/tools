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
 * A representation of the model object '<em><b>Enable Sec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link config.EnableSecType#getAny <em>Any</em>}</li>
 *   <li>{@link config.EnableSecType#getPolicyLocation <em>Policy Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see config.ConfigPackage#getEnableSecType()
 * @model extendedMetaData="name='enableSec_._type' kind='elementOnly'"
 * @generated
 */
public interface EnableSecType extends EObject {
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
	 * @see config.ConfigPackage#getEnableSecType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Policy Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Location</em>' attribute.
	 * @see #setPolicyLocation(String)
	 * @see config.ConfigPackage#getEnableSecType_PolicyLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='policyLocation'"
	 * @generated
	 */
	String getPolicyLocation();

	/**
	 * Sets the value of the '{@link config.EnableSecType#getPolicyLocation <em>Policy Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Location</em>' attribute.
	 * @see #getPolicyLocation()
	 * @generated
	 */
	void setPolicyLocation(String value);

} // EnableSecType
