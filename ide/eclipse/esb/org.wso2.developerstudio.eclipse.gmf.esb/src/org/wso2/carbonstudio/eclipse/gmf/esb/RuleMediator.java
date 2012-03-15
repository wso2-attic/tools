/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getRuleSetConfiguration <em>Rule Set Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getRuleSessionConfiguration <em>Rule Session Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector <em>Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator()
 * @model
 * @generated
 */
public interface RuleMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Rule Set Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set Configuration</em>' containment reference.
	 * @see #setRuleSetConfiguration(RuleSetConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleSetConfiguration getRuleSetConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getRuleSetConfiguration <em>Rule Set Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set Configuration</em>' containment reference.
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	void setRuleSetConfiguration(RuleSetConfiguration value);

	/**
	 * Returns the value of the '<em><b>Rule Session Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Session Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Session Configuration</em>' containment reference.
	 * @see #setRuleSessionConfiguration(RuleSessionConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSessionConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleSessionConfiguration getRuleSessionConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getRuleSessionConfiguration <em>Rule Session Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Session Configuration</em>' containment reference.
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 */
	void setRuleSessionConfiguration(RuleSessionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Facts Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facts Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facts Configuration</em>' containment reference.
	 * @see #setFactsConfiguration(RuleFactsConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_FactsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleFactsConfiguration getFactsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facts Configuration</em>' containment reference.
	 * @see #getFactsConfiguration()
	 * @generated
	 */
	void setFactsConfiguration(RuleFactsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Results Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Configuration</em>' containment reference.
	 * @see #setResultsConfiguration(RuleResultsConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_ResultsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleResultsConfiguration getResultsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Configuration</em>' containment reference.
	 * @see #getResultsConfiguration()
	 * @generated
	 */
	void setResultsConfiguration(RuleResultsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Child Mediators Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Mediators Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Mediators Configuration</em>' containment reference.
	 * @see #setChildMediatorsConfiguration(RuleChildMediatorsConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_ChildMediatorsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleChildMediatorsConfiguration getChildMediatorsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Mediators Configuration</em>' containment reference.
	 * @see #getChildMediatorsConfiguration()
	 * @generated
	 */
	void setChildMediatorsConfiguration(RuleChildMediatorsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(RuleMediatorInputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	RuleMediatorInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(RuleMediatorInputConnector value);

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(RuleMediatorOutputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	RuleMediatorOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(RuleMediatorOutputConnector value);

} // RuleMediator
