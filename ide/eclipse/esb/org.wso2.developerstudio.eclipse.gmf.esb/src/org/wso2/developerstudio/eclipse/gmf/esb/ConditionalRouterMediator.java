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
 * A representation of the model object '<em><b>Conditional Router Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#isContinueRoute <em>Continue Route</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#getConditionalRouteBranches <em>Conditional Route Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getConditionalRouterMediator()
 * @model
 * @generated
 */
public interface ConditionalRouterMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Continue Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue Route</em>' attribute.
	 * @see #setContinueRoute(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getConditionalRouterMediator_ContinueRoute()
	 * @model
	 * @generated
	 */
	boolean isContinueRoute();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator#isContinueRoute <em>Continue Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue Route</em>' attribute.
	 * @see #isContinueRoute()
	 * @generated
	 */
	void setContinueRoute(boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Route Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Route Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Route Branches</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getConditionalRouterMediator_ConditionalRouteBranches()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalRouteBranch> getConditionalRouteBranches();

} // ConditionalRouterMediator
