/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throttle Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getPolicyConfiguration <em>Policy Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOnAcceptBranch <em>On Accept Branch</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOnRejectBranch <em>On Reject Branch</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOutputConnector <em>Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator()
 * @model
 * @generated
 */
public interface ThrottleMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * The default value is <code>"group_id"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_GroupId()
	 * @model default="group_id"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Policy Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Configuration</em>' containment reference.
	 * @see #setPolicyConfiguration(ThrottlePolicyConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_PolicyConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	ThrottlePolicyConfiguration getPolicyConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getPolicyConfiguration <em>Policy Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Configuration</em>' containment reference.
	 * @see #getPolicyConfiguration()
	 * @generated
	 */
	void setPolicyConfiguration(ThrottlePolicyConfiguration value);

	/**
	 * Returns the value of the '<em><b>On Accept Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Accept Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Accept Branch</em>' containment reference.
	 * @see #setOnAcceptBranch(ThrottleOnAcceptBranch)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_OnAcceptBranch()
	 * @model containment="true"
	 * @generated
	 */
	ThrottleOnAcceptBranch getOnAcceptBranch();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOnAcceptBranch <em>On Accept Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Accept Branch</em>' containment reference.
	 * @see #getOnAcceptBranch()
	 * @generated
	 */
	void setOnAcceptBranch(ThrottleOnAcceptBranch value);

	/**
	 * Returns the value of the '<em><b>On Reject Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Reject Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Reject Branch</em>' containment reference.
	 * @see #setOnRejectBranch(ThrottleOnRejectBranch)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_OnRejectBranch()
	 * @model containment="true"
	 * @generated
	 */
	ThrottleOnRejectBranch getOnRejectBranch();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOnRejectBranch <em>On Reject Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Reject Branch</em>' containment reference.
	 * @see #getOnRejectBranch()
	 * @generated
	 */
	void setOnRejectBranch(ThrottleOnRejectBranch value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(ThrottleMediatorInputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	ThrottleMediatorInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(ThrottleMediatorInputConnector value);

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(ThrottleMediatorOutputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getThrottleMediator_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	ThrottleMediatorOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.ThrottleMediator#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(ThrottleMediatorOutputConnector value);

} // ThrottleMediator
