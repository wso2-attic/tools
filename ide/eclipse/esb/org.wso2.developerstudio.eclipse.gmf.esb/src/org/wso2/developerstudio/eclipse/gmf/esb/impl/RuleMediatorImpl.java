/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleChildMediatorsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorChildMediatorsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetConfiguration <em>Rule Set Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSessionConfiguration <em>Rule Session Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getFactsConfiguration <em>Facts Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getResultsConfiguration <em>Results Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getChildMediatorsOutputConnector <em>Child Mediators Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getMediatorFlow <em>Mediator Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleMediatorImpl extends MediatorImpl implements RuleMediator {
	/**
	 * The cached value of the '{@link #getRuleSetConfiguration() <em>Rule Set Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RuleSetConfiguration ruleSetConfiguration;

	/**
	 * The cached value of the '{@link #getRuleSessionConfiguration() <em>Rule Session Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RuleSessionConfiguration ruleSessionConfiguration;

	/**
	 * The cached value of the '{@link #getFactsConfiguration() <em>Facts Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RuleFactsConfiguration factsConfiguration;

	/**
	 * The cached value of the '{@link #getResultsConfiguration() <em>Results Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RuleResultsConfiguration resultsConfiguration;

	/**
	 * The cached value of the '{@link #getChildMediatorsConfiguration() <em>Child Mediators Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildMediatorsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected RuleChildMediatorsConfiguration childMediatorsConfiguration;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected RuleMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected RuleMediatorOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getChildMediatorsOutputConnector() <em>Child Mediators Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildMediatorsOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected RuleMediatorChildMediatorsOutputConnector childMediatorsOutputConnector;

	/**
	 * The cached value of the '{@link #getMediatorFlow() <em>Mediator Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatorFlow()
	 * @generated
	 * @ordered
	 */
	protected MediatorFlow mediatorFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.RULE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSetConfiguration getRuleSetConfiguration() {
		return ruleSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleSetConfiguration(RuleSetConfiguration newRuleSetConfiguration, NotificationChain msgs) {
		RuleSetConfiguration oldRuleSetConfiguration = ruleSetConfiguration;
		ruleSetConfiguration = newRuleSetConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION, oldRuleSetConfiguration, newRuleSetConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSetConfiguration(RuleSetConfiguration newRuleSetConfiguration) {
		if (newRuleSetConfiguration != ruleSetConfiguration) {
			NotificationChain msgs = null;
			if (ruleSetConfiguration != null)
				msgs = ((InternalEObject)ruleSetConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION, null, msgs);
			if (newRuleSetConfiguration != null)
				msgs = ((InternalEObject)newRuleSetConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION, null, msgs);
			msgs = basicSetRuleSetConfiguration(newRuleSetConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION, newRuleSetConfiguration, newRuleSetConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSessionConfiguration getRuleSessionConfiguration() {
		return ruleSessionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleSessionConfiguration(RuleSessionConfiguration newRuleSessionConfiguration, NotificationChain msgs) {
		RuleSessionConfiguration oldRuleSessionConfiguration = ruleSessionConfiguration;
		ruleSessionConfiguration = newRuleSessionConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION, oldRuleSessionConfiguration, newRuleSessionConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSessionConfiguration(RuleSessionConfiguration newRuleSessionConfiguration) {
		if (newRuleSessionConfiguration != ruleSessionConfiguration) {
			NotificationChain msgs = null;
			if (ruleSessionConfiguration != null)
				msgs = ((InternalEObject)ruleSessionConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION, null, msgs);
			if (newRuleSessionConfiguration != null)
				msgs = ((InternalEObject)newRuleSessionConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION, null, msgs);
			msgs = basicSetRuleSessionConfiguration(newRuleSessionConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION, newRuleSessionConfiguration, newRuleSessionConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactsConfiguration getFactsConfiguration() {
		return factsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactsConfiguration(RuleFactsConfiguration newFactsConfiguration, NotificationChain msgs) {
		RuleFactsConfiguration oldFactsConfiguration = factsConfiguration;
		factsConfiguration = newFactsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION, oldFactsConfiguration, newFactsConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactsConfiguration(RuleFactsConfiguration newFactsConfiguration) {
		if (newFactsConfiguration != factsConfiguration) {
			NotificationChain msgs = null;
			if (factsConfiguration != null)
				msgs = ((InternalEObject)factsConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION, null, msgs);
			if (newFactsConfiguration != null)
				msgs = ((InternalEObject)newFactsConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION, null, msgs);
			msgs = basicSetFactsConfiguration(newFactsConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION, newFactsConfiguration, newFactsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResultsConfiguration getResultsConfiguration() {
		return resultsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultsConfiguration(RuleResultsConfiguration newResultsConfiguration, NotificationChain msgs) {
		RuleResultsConfiguration oldResultsConfiguration = resultsConfiguration;
		resultsConfiguration = newResultsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION, oldResultsConfiguration, newResultsConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsConfiguration(RuleResultsConfiguration newResultsConfiguration) {
		if (newResultsConfiguration != resultsConfiguration) {
			NotificationChain msgs = null;
			if (resultsConfiguration != null)
				msgs = ((InternalEObject)resultsConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION, null, msgs);
			if (newResultsConfiguration != null)
				msgs = ((InternalEObject)newResultsConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION, null, msgs);
			msgs = basicSetResultsConfiguration(newResultsConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION, newResultsConfiguration, newResultsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleChildMediatorsConfiguration getChildMediatorsConfiguration() {
		return childMediatorsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildMediatorsConfiguration(RuleChildMediatorsConfiguration newChildMediatorsConfiguration, NotificationChain msgs) {
		RuleChildMediatorsConfiguration oldChildMediatorsConfiguration = childMediatorsConfiguration;
		childMediatorsConfiguration = newChildMediatorsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION, oldChildMediatorsConfiguration, newChildMediatorsConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildMediatorsConfiguration(RuleChildMediatorsConfiguration newChildMediatorsConfiguration) {
		if (newChildMediatorsConfiguration != childMediatorsConfiguration) {
			NotificationChain msgs = null;
			if (childMediatorsConfiguration != null)
				msgs = ((InternalEObject)childMediatorsConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION, null, msgs);
			if (newChildMediatorsConfiguration != null)
				msgs = ((InternalEObject)newChildMediatorsConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION, null, msgs);
			msgs = basicSetChildMediatorsConfiguration(newChildMediatorsConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION, newChildMediatorsConfiguration, newChildMediatorsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(RuleMediatorInputConnector newInputConnector, NotificationChain msgs) {
		RuleMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(RuleMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(RuleMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		RuleMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(RuleMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleMediatorChildMediatorsOutputConnector getChildMediatorsOutputConnector() {
		return childMediatorsOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildMediatorsOutputConnector(RuleMediatorChildMediatorsOutputConnector newChildMediatorsOutputConnector, NotificationChain msgs) {
		RuleMediatorChildMediatorsOutputConnector oldChildMediatorsOutputConnector = childMediatorsOutputConnector;
		childMediatorsOutputConnector = newChildMediatorsOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR, oldChildMediatorsOutputConnector, newChildMediatorsOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildMediatorsOutputConnector(RuleMediatorChildMediatorsOutputConnector newChildMediatorsOutputConnector) {
		if (newChildMediatorsOutputConnector != childMediatorsOutputConnector) {
			NotificationChain msgs = null;
			if (childMediatorsOutputConnector != null)
				msgs = ((InternalEObject)childMediatorsOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR, null, msgs);
			if (newChildMediatorsOutputConnector != null)
				msgs = ((InternalEObject)newChildMediatorsOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetChildMediatorsOutputConnector(newChildMediatorsOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR, newChildMediatorsOutputConnector, newChildMediatorsOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorFlow getMediatorFlow() {
		return mediatorFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediatorFlow(MediatorFlow newMediatorFlow, NotificationChain msgs) {
		MediatorFlow oldMediatorFlow = mediatorFlow;
		mediatorFlow = newMediatorFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW, oldMediatorFlow, newMediatorFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatorFlow(MediatorFlow newMediatorFlow) {
		if (newMediatorFlow != mediatorFlow) {
			NotificationChain msgs = null;
			if (mediatorFlow != null)
				msgs = ((InternalEObject)mediatorFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW, null, msgs);
			if (newMediatorFlow != null)
				msgs = ((InternalEObject)newMediatorFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW, null, msgs);
			msgs = basicSetMediatorFlow(newMediatorFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW, newMediatorFlow, newMediatorFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
				return basicSetRuleSetConfiguration(null, msgs);
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
				return basicSetRuleSessionConfiguration(null, msgs);
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
				return basicSetFactsConfiguration(null, msgs);
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
				return basicSetResultsConfiguration(null, msgs);
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
				return basicSetChildMediatorsConfiguration(null, msgs);
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
				return basicSetChildMediatorsOutputConnector(null, msgs);
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
				return basicSetMediatorFlow(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
				return getRuleSetConfiguration();
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
				return getRuleSessionConfiguration();
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
				return getFactsConfiguration();
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
				return getResultsConfiguration();
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
				return getChildMediatorsConfiguration();
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
				return getChildMediatorsOutputConnector();
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
				return getMediatorFlow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
				setRuleSetConfiguration((RuleSetConfiguration)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
				setRuleSessionConfiguration((RuleSessionConfiguration)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
				setFactsConfiguration((RuleFactsConfiguration)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
				setResultsConfiguration((RuleResultsConfiguration)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
				setChildMediatorsConfiguration((RuleChildMediatorsConfiguration)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((RuleMediatorInputConnector)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((RuleMediatorOutputConnector)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
				setChildMediatorsOutputConnector((RuleMediatorChildMediatorsOutputConnector)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
				setMediatorFlow((MediatorFlow)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
				setRuleSetConfiguration((RuleSetConfiguration)null);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
				setRuleSessionConfiguration((RuleSessionConfiguration)null);
				return;
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
				setFactsConfiguration((RuleFactsConfiguration)null);
				return;
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
				setResultsConfiguration((RuleResultsConfiguration)null);
				return;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
				setChildMediatorsConfiguration((RuleChildMediatorsConfiguration)null);
				return;
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((RuleMediatorInputConnector)null);
				return;
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((RuleMediatorOutputConnector)null);
				return;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
				setChildMediatorsOutputConnector((RuleMediatorChildMediatorsOutputConnector)null);
				return;
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
				setMediatorFlow((MediatorFlow)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
				return ruleSetConfiguration != null;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
				return ruleSessionConfiguration != null;
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
				return factsConfiguration != null;
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
				return resultsConfiguration != null;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
				return childMediatorsConfiguration != null;
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
				return childMediatorsOutputConnector != null;
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
				return mediatorFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleMediatorImpl
