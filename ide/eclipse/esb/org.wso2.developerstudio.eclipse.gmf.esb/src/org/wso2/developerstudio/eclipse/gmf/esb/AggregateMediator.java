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
 * A representation of the model object '<em><b>Aggregate Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getAggregateID <em>Aggregate ID</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMinMessages <em>Completion Min Messages</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMaxMessages <em>Completion Max Messages</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteBranch <em>On Complete Branch</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteOutputConnector <em>On Complete Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator()
 * @model
 * @generated
 */
public interface AggregateMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Aggregate ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate ID</em>' attribute.
	 * @see #setAggregateID(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_AggregateID()
	 * @model
	 * @generated
	 */
	String getAggregateID();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getAggregateID <em>Aggregate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate ID</em>' attribute.
	 * @see #getAggregateID()
	 * @generated
	 */
	void setAggregateID(String value);

	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(NamespacedProperty)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_CorrelationExpression()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getCorrelationExpression();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Completion Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Timeout</em>' attribute.
	 * @see #setCompletionTimeout(int)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_CompletionTimeout()
	 * @model
	 * @generated
	 */
	int getCompletionTimeout();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionTimeout <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Timeout</em>' attribute.
	 * @see #getCompletionTimeout()
	 * @generated
	 */
	void setCompletionTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Completion Min Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Min Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Min Messages</em>' attribute.
	 * @see #setCompletionMinMessages(int)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_CompletionMinMessages()
	 * @model
	 * @generated
	 */
	int getCompletionMinMessages();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMinMessages <em>Completion Min Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Min Messages</em>' attribute.
	 * @see #getCompletionMinMessages()
	 * @generated
	 */
	void setCompletionMinMessages(int value);

	/**
	 * Returns the value of the '<em><b>Completion Max Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Max Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Max Messages</em>' attribute.
	 * @see #setCompletionMaxMessages(int)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_CompletionMaxMessages()
	 * @model
	 * @generated
	 */
	int getCompletionMaxMessages();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getCompletionMaxMessages <em>Completion Max Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Max Messages</em>' attribute.
	 * @see #getCompletionMaxMessages()
	 * @generated
	 */
	void setCompletionMaxMessages(int value);

	/**
	 * Returns the value of the '<em><b>On Complete Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Complete Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Complete Branch</em>' containment reference.
	 * @see #setOnCompleteBranch(AggregateOnCompleteBranch)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_OnCompleteBranch()
	 * @model containment="true"
	 * @generated
	 */
	AggregateOnCompleteBranch getOnCompleteBranch();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteBranch <em>On Complete Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Complete Branch</em>' containment reference.
	 * @see #getOnCompleteBranch()
	 * @generated
	 */
	void setOnCompleteBranch(AggregateOnCompleteBranch value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(AggregateMediatorInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	AggregateMediatorInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(AggregateMediatorInputConnector value);

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(AggregateMediatorOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	AggregateMediatorOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(AggregateMediatorOutputConnector value);

	/**
	 * Returns the value of the '<em><b>On Complete Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Complete Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Complete Output Connector</em>' containment reference.
	 * @see #setOnCompleteOutputConnector(AggregateMediatorOnCompleteOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_OnCompleteOutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	AggregateMediatorOnCompleteOutputConnector getOnCompleteOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator#getOnCompleteOutputConnector <em>On Complete Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Complete Output Connector</em>' containment reference.
	 * @see #getOnCompleteOutputConnector()
	 * @generated
	 */
	void setOnCompleteOutputConnector(AggregateMediatorOnCompleteOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.EsbElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateMediator_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<EsbElement> getChildren();

} // AggregateMediator
