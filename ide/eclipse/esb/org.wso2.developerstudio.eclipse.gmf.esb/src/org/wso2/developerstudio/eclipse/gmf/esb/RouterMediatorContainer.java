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
 * A representation of the model object '<em><b>Router Mediator Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getRouterTargetContainer <em>Router Target Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#isBreakAfterRoute <em>Break After Route</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getRouteExpression <em>Route Expression</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getRoutePattern <em>Route Pattern</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer()
 * @model
 * @generated
 */
public interface RouterMediatorContainer extends EsbNode {
	/**
	 * Returns the value of the '<em><b>Router Target Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.RouterTargetContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Target Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Target Container</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer_RouterTargetContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouterTargetContainer> getRouterTargetContainer();

	/**
	 * Returns the value of the '<em><b>Break After Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break After Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break After Route</em>' attribute.
	 * @see #setBreakAfterRoute(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer_BreakAfterRoute()
	 * @model
	 * @generated
	 */
	boolean isBreakAfterRoute();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#isBreakAfterRoute <em>Break After Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break After Route</em>' attribute.
	 * @see #isBreakAfterRoute()
	 * @generated
	 */
	void setBreakAfterRoute(boolean value);

	/**
	 * Returns the value of the '<em><b>Route Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Expression</em>' reference.
	 * @see #setRouteExpression(NamespacedProperty)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer_RouteExpression()
	 * @model
	 * @generated
	 */
	NamespacedProperty getRouteExpression();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getRouteExpression <em>Route Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Expression</em>' reference.
	 * @see #getRouteExpression()
	 * @generated
	 */
	void setRouteExpression(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Route Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Pattern</em>' attribute.
	 * @see #setRoutePattern(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer_RoutePattern()
	 * @model
	 * @generated
	 */
	String getRoutePattern();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getRoutePattern <em>Route Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Pattern</em>' attribute.
	 * @see #getRoutePattern()
	 * @generated
	 */
	void setRoutePattern(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RouterTarget)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRouterMediatorContainer_Target()
	 * @model
	 * @generated
	 */
	RouterTarget getTarget();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RouterTarget value);

} // RouterMediatorContainer
