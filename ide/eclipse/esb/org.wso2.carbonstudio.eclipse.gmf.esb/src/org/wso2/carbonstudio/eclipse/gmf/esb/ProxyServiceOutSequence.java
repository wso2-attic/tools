/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Service Out Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyServiceOutSequence#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceOutSequence()
 * @model
 * @generated
 */
public interface ProxyServiceOutSequence extends EsbNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.EsbElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceOutSequence_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<EsbElement> getChildren();

} // ProxyServiceOutSequence
