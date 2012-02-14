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
 * A representation of the model object '<em><b>GSpread Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetnumber <em>Worksheetnumber</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingrow <em>Startingrow</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxrowcount <em>Maxrowcount</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasheader <em>Hasheader</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery()
 * @model extendedMetaData="name='gspread_._type' kind='elementOnly'"
 * @generated
 */
public interface GSpreadQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Worksheetnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksheetnumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksheetnumber</em>' attribute.
	 * @see #setWorksheetnumber(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_Worksheetnumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='element' name='worksheetnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWorksheetnumber();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetnumber <em>Worksheetnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksheetnumber</em>' attribute.
	 * @see #getWorksheetnumber()
	 * @generated
	 */
	void setWorksheetnumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Startingrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startingrow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startingrow</em>' attribute.
	 * @see #setStartingrow(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_Startingrow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='element' name='startingrow' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartingrow();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingrow <em>Startingrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startingrow</em>' attribute.
	 * @see #getStartingrow()
	 * @generated
	 */
	void setStartingrow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maxrowcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxrowcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxrowcount</em>' attribute.
	 * @see #setMaxrowcount(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_Maxrowcount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='element' name='maxrowcount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxrowcount();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxrowcount <em>Maxrowcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxrowcount</em>' attribute.
	 * @see #getMaxrowcount()
	 * @generated
	 */
	void setMaxrowcount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Hasheader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasheader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasheader</em>' attribute.
	 * @see #isSetHasheader()
	 * @see #unsetHasheader()
	 * @see #setHasheader(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_Hasheader()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='hasheader' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHasheader();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasheader <em>Hasheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasheader</em>' attribute.
	 * @see #isSetHasheader()
	 * @see #unsetHasheader()
	 * @see #isHasheader()
	 * @generated
	 */
	void setHasheader(boolean value);

	/**
	 * Unsets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasheader <em>Hasheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasheader()
	 * @see #isHasheader()
	 * @see #setHasheader(boolean)
	 * @generated
	 */
	void unsetHasheader();

	/**
	 * Returns whether the value of the '{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasheader <em>Hasheader</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hasheader</em>' attribute is set.
	 * @see #unsetHasheader()
	 * @see #isHasheader()
	 * @see #setHasheader(boolean)
	 * @generated
	 */
	boolean isSetHasheader();

} // GSpreadQuery
