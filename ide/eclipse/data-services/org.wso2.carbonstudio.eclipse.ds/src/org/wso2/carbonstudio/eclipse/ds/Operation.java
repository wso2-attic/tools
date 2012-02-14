/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQueryGroup <em>Call Query Group</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Operation#isDisableStreaming <em>Disable Streaming</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Operation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getOperation()
 * @model extendedMetaData="name='operation_._type' kind='elementOnly'"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Call Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Query</em>' containment reference.
	 * @see #setCallQuery(CallQuery)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getOperation_CallQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='call-query' namespace='##targetNamespace'"
	 * @generated
	 */
	CallQuery getCallQuery();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQuery <em>Call Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Query</em>' containment reference.
	 * @see #getCallQuery()
	 * @generated
	 */
	void setCallQuery(CallQuery value);

	/**
	 * Returns the value of the '<em><b>Call Query Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Query Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Query Group</em>' containment reference.
	 * @see #setCallQueryGroup(CallQueryList)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getOperation_CallQueryGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='call-query-group' namespace='##targetNamespace'"
	 * @generated
	 */
	CallQueryList getCallQueryGroup();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQueryGroup <em>Call Query Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Query Group</em>' containment reference.
	 * @see #getCallQueryGroup()
	 * @generated
	 */
	void setCallQueryGroup(CallQueryList value);

	/**
	 * Returns the value of the '<em><b>Disable Streaming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Streaming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Streaming</em>' attribute.
	 * @see #isSetDisableStreaming()
	 * @see #unsetDisableStreaming()
	 * @see #setDisableStreaming(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getOperation_DisableStreaming()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='disableStreaming' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDisableStreaming();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#isDisableStreaming <em>Disable Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Streaming</em>' attribute.
	 * @see #isSetDisableStreaming()
	 * @see #unsetDisableStreaming()
	 * @see #isDisableStreaming()
	 * @generated
	 */
	void setDisableStreaming(boolean value);

	/**
	 * Unsets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#isDisableStreaming <em>Disable Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisableStreaming()
	 * @see #isDisableStreaming()
	 * @see #setDisableStreaming(boolean)
	 * @generated
	 */
	void unsetDisableStreaming();

	/**
	 * Returns whether the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#isDisableStreaming <em>Disable Streaming</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Streaming</em>' attribute is set.
	 * @see #unsetDisableStreaming()
	 * @see #isDisableStreaming()
	 * @see #setDisableStreaming(boolean)
	 * @generated
	 */
	boolean isSetDisableStreaming();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getOperation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operation
