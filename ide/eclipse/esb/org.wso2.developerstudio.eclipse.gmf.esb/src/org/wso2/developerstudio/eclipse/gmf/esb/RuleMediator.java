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
 * A representation of the model object '<em><b>Rule Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetURI <em>Rule Set URI</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceType <em>Rule Set Source Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceCode <em>Rule Set Source Code</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceKey <em>Rule Set Source Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetProperties <em>Rule Set Properties</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#isStatefulSession <em>Stateful Session</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSessionProperties <em>Rule Session Properties</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsOutputConnector <em>Child Mediators Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getMediatorFlow <em>Mediator Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator()
 * @model
 * @generated
 */
public interface RuleMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Rule Set URI</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set URI</em>' attribute.
	 * @see #setRuleSetURI(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetURI()
	 * @model default=""
	 * @generated
	 */
	String getRuleSetURI();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetURI <em>Rule Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set URI</em>' attribute.
	 * @see #getRuleSetURI()
	 * @generated
	 */
	void setRuleSetURI(String value);

	/**
	 * Returns the value of the '<em><b>Rule Set Source Type</b></em>' attribute.
	 * The default value is <code>"INLINE"</code>.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set Source Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType
	 * @see #setRuleSetSourceType(RuleSourceType)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetSourceType()
	 * @model default="INLINE"
	 * @generated
	 */
	RuleSourceType getRuleSetSourceType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceType <em>Rule Set Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set Source Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType
	 * @see #getRuleSetSourceType()
	 * @generated
	 */
	void setRuleSetSourceType(RuleSourceType value);

	/**
	 * Returns the value of the '<em><b>Rule Set Source Code</b></em>' attribute.
	 * The default value is <code>"<code/>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set Source Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set Source Code</em>' attribute.
	 * @see #setRuleSetSourceCode(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetSourceCode()
	 * @model default="<code/>"
	 * @generated
	 */
	String getRuleSetSourceCode();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceCode <em>Rule Set Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set Source Code</em>' attribute.
	 * @see #getRuleSetSourceCode()
	 * @generated
	 */
	void setRuleSetSourceCode(String value);

	/**
	 * Returns the value of the '<em><b>Rule Set Source Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set Source Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set Source Key</em>' containment reference.
	 * @see #setRuleSetSourceKey(RegistryKeyProperty)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetSourceKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getRuleSetSourceKey();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getRuleSetSourceKey <em>Rule Set Source Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set Source Key</em>' containment reference.
	 * @see #getRuleSetSourceKey()
	 * @generated
	 */
	void setRuleSetSourceKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Rule Set Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set Properties</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSetProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleSetCreationProperty> getRuleSetProperties();

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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_StatefulSession()
	 * @model default="true"
	 * @generated
	 */
	boolean isStatefulSession();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#isStatefulSession <em>Stateful Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful Session</em>' attribute.
	 * @see #isStatefulSession()
	 * @generated
	 */
	void setStatefulSession(boolean value);

	/**
	 * Returns the value of the '<em><b>Rule Session Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Session Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Session Properties</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_RuleSessionProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleSessionProperty> getRuleSessionProperties();

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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_FactsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleFactsConfiguration getFactsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}' containment reference.
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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_ResultsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleResultsConfiguration getResultsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}' containment reference.
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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_ChildMediatorsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	RuleChildMediatorsConfiguration getChildMediatorsConfiguration();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}' containment reference.
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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	RuleMediatorInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getInputConnector <em>Input Connector</em>}' containment reference.
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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	RuleMediatorOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(RuleMediatorOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Child Mediators Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Mediators Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Mediators Output Connector</em>' containment reference.
	 * @see #setChildMediatorsOutputConnector(RuleMediatorChildMediatorsOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_ChildMediatorsOutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	RuleMediatorChildMediatorsOutputConnector getChildMediatorsOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getChildMediatorsOutputConnector <em>Child Mediators Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Mediators Output Connector</em>' containment reference.
	 * @see #getChildMediatorsOutputConnector()
	 * @generated
	 */
	void setChildMediatorsOutputConnector(RuleMediatorChildMediatorsOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Mediator Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediator Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator Flow</em>' containment reference.
	 * @see #setMediatorFlow(MediatorFlow)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getRuleMediator_MediatorFlow()
	 * @model containment="true"
	 * @generated
	 */
	MediatorFlow getMediatorFlow();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator#getMediatorFlow <em>Mediator Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator Flow</em>' containment reference.
	 * @see #getMediatorFlow()
	 * @generated
	 */
	void setMediatorFlow(MediatorFlow value);

} // RuleMediator
