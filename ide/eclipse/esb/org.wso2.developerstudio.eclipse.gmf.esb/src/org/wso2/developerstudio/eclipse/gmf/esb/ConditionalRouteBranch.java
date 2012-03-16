/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Route Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch#isBreakRoute <em>Break Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getConditionalRouteBranch()
 * @model
 * @generated
 */
public interface ConditionalRouteBranch extends EObject {
	/**
	 * Returns the value of the '<em><b>Break Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Route</em>' attribute.
	 * @see #setBreakRoute(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getConditionalRouteBranch_BreakRoute()
	 * @model
	 * @generated
	 */
	boolean isBreakRoute();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch#isBreakRoute <em>Break Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Route</em>' attribute.
	 * @see #isBreakRoute()
	 * @generated
	 */
	void setBreakRoute(boolean value);

} // ConditionalRouteBranch
