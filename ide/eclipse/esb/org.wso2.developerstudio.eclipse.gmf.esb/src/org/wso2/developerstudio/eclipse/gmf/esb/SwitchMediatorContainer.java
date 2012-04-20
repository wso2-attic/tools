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
 * A representation of the model object '<em><b>Switch Mediator Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorContainer#getSwitchCaseContainer <em>Switch Case Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorContainer#getSwitchDefaultContainer <em>Switch Default Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSwitchMediatorContainer()
 * @model
 * @generated
 */
public interface SwitchMediatorContainer extends EsbNode {
	/**
	 * Returns the value of the '<em><b>Switch Case Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Case Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Case Container</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSwitchMediatorContainer_SwitchCaseContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SwitchCaseContainer> getSwitchCaseContainer();

	/**
	 * Returns the value of the '<em><b>Switch Default Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Default Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Default Container</em>' containment reference.
	 * @see #setSwitchDefaultContainer(SwitchDefaultContainer)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSwitchMediatorContainer_SwitchDefaultContainer()
	 * @model containment="true"
	 * @generated
	 */
	SwitchDefaultContainer getSwitchDefaultContainer();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorContainer#getSwitchDefaultContainer <em>Switch Default Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Default Container</em>' containment reference.
	 * @see #getSwitchDefaultContainer()
	 * @generated
	 */
	void setSwitchDefaultContainer(SwitchDefaultContainer value);

} // SwitchMediatorContainer
