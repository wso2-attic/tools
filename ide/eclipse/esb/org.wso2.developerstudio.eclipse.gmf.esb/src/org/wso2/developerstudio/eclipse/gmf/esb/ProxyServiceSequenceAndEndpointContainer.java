/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Service Sequence And Endpoint Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceAndEndpointContainer#getSequenceContainer <em>Sequence Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceAndEndpointContainer#getEndpointContainer <em>Endpoint Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceSequenceAndEndpointContainer()
 * @model
 * @generated
 */
public interface ProxyServiceSequenceAndEndpointContainer extends EsbNode {
	/**
	 * Returns the value of the '<em><b>Sequence Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Container</em>' containment reference.
	 * @see #setSequenceContainer(ProxyServiceSequenceContainer)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceSequenceAndEndpointContainer_SequenceContainer()
	 * @model containment="true"
	 * @generated
	 */
	ProxyServiceSequenceContainer getSequenceContainer();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceAndEndpointContainer#getSequenceContainer <em>Sequence Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Container</em>' containment reference.
	 * @see #getSequenceContainer()
	 * @generated
	 */
	void setSequenceContainer(ProxyServiceSequenceContainer value);

	/**
	 * Returns the value of the '<em><b>Endpoint Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Container</em>' containment reference.
	 * @see #setEndpointContainer(ProxyServiceEndpointContainer)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceSequenceAndEndpointContainer_EndpointContainer()
	 * @model containment="true"
	 * @generated
	 */
	ProxyServiceEndpointContainer getEndpointContainer();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceSequenceAndEndpointContainer#getEndpointContainer <em>Endpoint Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Container</em>' containment reference.
	 * @see #getEndpointContainer()
	 * @generated
	 */
	void setEndpointContainer(ProxyServiceEndpointContainer value);

} // ProxyServiceSequenceAndEndpointContainer
