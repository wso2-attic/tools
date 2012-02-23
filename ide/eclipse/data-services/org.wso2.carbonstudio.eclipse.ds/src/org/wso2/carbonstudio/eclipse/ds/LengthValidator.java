/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getLengthValidator()
 * @model extendedMetaData="name='validateLength_._type' kind='empty'"
 * @generated
 */
public interface LengthValidator extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getLengthValidator_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaximum();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getLengthValidator_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinimum();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(BigInteger value);

} // LengthValidator
