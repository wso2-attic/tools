/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#isContinueAfterRouting <em>Continue After Routing</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediator()
 * @model
 * @generated
 */
public interface RouterMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Continue After Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue After Routing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue After Routing</em>' attribute.
	 * @see #setContinueAfterRouting(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediator_ContinueAfterRouting()
	 * @model
	 * @generated
	 */
	boolean isContinueAfterRouting();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator#isContinueAfterRouting <em>Continue After Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue After Routing</em>' attribute.
	 * @see #isContinueAfterRouting()
	 * @generated
	 */
	void setContinueAfterRouting(boolean value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediator_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouterRoute> getRoutes();

} // RouterMediator
