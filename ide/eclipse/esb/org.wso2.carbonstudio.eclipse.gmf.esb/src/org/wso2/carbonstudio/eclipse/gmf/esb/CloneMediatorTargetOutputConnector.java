/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone Mediator Target Output Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getSoapAction <em>Soap Action</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getToAddress <em>To Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCloneMediatorTargetOutputConnector()
 * @model
 * @generated
 */
public interface CloneMediatorTargetOutputConnector extends OutputConnector {
	/**
	 * Returns the value of the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Action</em>' attribute.
	 * @see #setSoapAction(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCloneMediatorTargetOutputConnector_SoapAction()
	 * @model
	 * @generated
	 */
	String getSoapAction();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getSoapAction <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Action</em>' attribute.
	 * @see #getSoapAction()
	 * @generated
	 */
	void setSoapAction(String value);

	/**
	 * Returns the value of the '<em><b>To Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Address</em>' attribute.
	 * @see #setToAddress(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCloneMediatorTargetOutputConnector_ToAddress()
	 * @model
	 * @generated
	 */
	String getToAddress();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector#getToAddress <em>To Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Address</em>' attribute.
	 * @see #getToAddress()
	 * @generated
	 */
	void setToAddress(String value);

} // CloneMediatorTargetOutputConnector
