/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Session Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#isStatefulSession <em>Stateful Session</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleSessionConfiguration()
 * @model
 * @generated
 */
public interface RuleSessionConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Stateful Session</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateful Session</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateful Session</em>' attribute.
	 * @see #setStatefulSession(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleSessionConfiguration_StatefulSession()
	 * @model default="true"
	 * @generated
	 */
	boolean isStatefulSession();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration#isStatefulSession <em>Stateful Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful Session</em>' attribute.
	 * @see #isStatefulSession()
	 * @generated
	 */
	void setStatefulSession(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleSessionConfiguration_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleSessionProperty> getProperties();

} // RuleSessionConfiguration
