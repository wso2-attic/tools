/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Output Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector#getOutgoingLink <em>Outgoing Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAdditionalOutputConnector()
 * @model abstract="true"
 * @generated
 */
public interface AdditionalOutputConnector extends EsbConnector {
	/**
	 * Returns the value of the '<em><b>Outgoing Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Link</em>' containment reference.
	 * @see #setOutgoingLink(EsbLink)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAdditionalOutputConnector_OutgoingLink()
	 * @model containment="true"
	 * @generated
	 */
	EsbLink getOutgoingLink();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AdditionalOutputConnector#getOutgoingLink <em>Outgoing Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Link</em>' containment reference.
	 * @see #getOutgoingLink()
	 * @generated
	 */
	void setOutgoingLink(EsbLink value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean shouldConnect(InputConnector targetEnd);

} // AdditionalOutputConnector
