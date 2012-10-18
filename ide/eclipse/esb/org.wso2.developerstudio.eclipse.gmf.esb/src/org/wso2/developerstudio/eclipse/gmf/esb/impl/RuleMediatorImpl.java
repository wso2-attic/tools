/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleActions;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleChildMediatorsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorChildMediatorsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSessionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSource;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetURI <em>Rule Set URI</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetSourceType <em>Rule Set Source Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetSourceCode <em>Rule Set Source Code</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetSourceKey <em>Rule Set Source Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSetProperties <em>Rule Set Properties</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#isStatefulSession <em>Stateful Session</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getRuleSessionProperties <em>Rule Session Properties</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getFactsConfiguration <em>Facts Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getResultsConfiguration <em>Results Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getChildMediatorsOutputConnector <em>Child Mediators Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getMediatorFlow <em>Mediator Flow</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getSourceValue <em>Source Value</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getSourceXpath <em>Source Xpath</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getTargetResultXpath <em>Target Result Xpath</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getTargetXpath <em>Target Xpath</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleMediatorImpl#getTargetAction <em>Target Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleMediatorImpl extends MediatorImpl implements RuleMediator {
	/**
	 * The default value of the '{@link #getRuleSetURI() <em>Rule Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_SET_URI_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRuleSetURI() <em>Rule Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetURI()
	 * @generated
	 * @ordered
	 */
	protected String ruleSetURI = RULE_SET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleSetSourceType() <em>Rule Set Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleSourceType RULE_SET_SOURCE_TYPE_EDEFAULT = RuleSourceType.INLINE;

	/**
	 * The cached value of the '{@link #getRuleSetSourceType() <em>Rule Set Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetSourceType()
	 * @generated
	 * @ordered
	 */
	protected RuleSourceType ruleSetSourceType = RULE_SET_SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleSetSourceCode() <em>Rule Set Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetSourceCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_SET_SOURCE_CODE_EDEFAULT = "<code/>";

	/**
	 * The cached value of the '{@link #getRuleSetSourceCode() <em>Rule Set Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetSourceCode()
	 * @generated
	 * @ordered
	 */
	protected String ruleSetSourceCode = RULE_SET_SOURCE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleSetSourceKey() <em>Rule Set Source Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetSourceKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty ruleSetSourceKey;

	/**
	 * The cached value of the '{@link #getRuleSetProperties() <em>Rule Set Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSetProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSetCreationProperty> ruleSetProperties;

	/**
	 * The default value of the '{@link #isStatefulSession() <em>Stateful Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatefulSession()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATEFUL_SESSION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStatefulSession() <em>Stateful Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatefulSession()
	 * @generated
	 * @ordered
	 */
	protected boolean statefulSession = STATEFUL_SESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleSessionProperties() <em>Rule Session Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSessionProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSessionProperty> ruleSessionProperties;

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
	 * The default value of the '{@link #getSourceValue() <em>Source Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSourceValue() <em>Source Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceValue()
	 * @generated
	 * @ordered
	 */
	protected String sourceValue = SOURCE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceXpath() <em>Source Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty sourceXpath;

	/**
	 * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected String targetValue = TARGET_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetResultXpath() <em>Target Result Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetResultXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty targetResultXpath;

	/**
	 * The cached value of the '{@link #getTargetXpath() <em>Target Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty targetXpath;

	/**
	 * The default value of the '{@link #getTargetAction() <em>Target Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAction()
	 * @generated
	 * @ordered
	 */
	protected static final RuleActions TARGET_ACTION_EDEFAULT = RuleActions.REPLACE;

	/**
	 * The cached value of the '{@link #getTargetAction() <em>Target Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAction()
	 * @generated
	 * @ordered
	 */
	protected RuleActions targetAction = TARGET_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RuleMediatorImpl() {
		super();
		RegistryKeyProperty ruleSetSourceKey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
		ruleSetSourceKey.setKeyName("ruleSet-SourceKey");
		ruleSetSourceKey.setPrettyName("ruleSet-SourceKey");
		ruleSetSourceKey.setKeyValue("/default/key");
		setRuleSetSourceKey(ruleSetSourceKey);
		
		NamespacedProperty evaluatorExpressionProperty = EsbFactory.eINSTANCE.createNamespacedProperty();
		evaluatorExpressionProperty.setPrettyName("source Xpath");
		setSourceXpath(evaluatorExpressionProperty);
		evaluatorExpressionProperty = EsbFactory.eINSTANCE.createNamespacedProperty();
		evaluatorExpressionProperty.setPrettyName("target Result Xpath");
		setTargetResultXpath(evaluatorExpressionProperty);
		evaluatorExpressionProperty = EsbFactory.eINSTANCE.createNamespacedProperty();
		evaluatorExpressionProperty.setPrettyName("target Xpath");
		setTargetXpath(evaluatorExpressionProperty);
 
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
	public String getRuleSetURI() {
		return ruleSetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSetURI(String newRuleSetURI) {
		String oldRuleSetURI = ruleSetURI;
		ruleSetURI = newRuleSetURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_URI, oldRuleSetURI, ruleSetURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSourceType getRuleSetSourceType() {
		return ruleSetSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSetSourceType(RuleSourceType newRuleSetSourceType) {
		RuleSourceType oldRuleSetSourceType = ruleSetSourceType;
		ruleSetSourceType = newRuleSetSourceType == null ? RULE_SET_SOURCE_TYPE_EDEFAULT : newRuleSetSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_TYPE, oldRuleSetSourceType, ruleSetSourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleSetSourceCode() {
		return ruleSetSourceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSetSourceCode(String newRuleSetSourceCode) {
		String oldRuleSetSourceCode = ruleSetSourceCode;
		ruleSetSourceCode = newRuleSetSourceCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_CODE, oldRuleSetSourceCode, ruleSetSourceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getRuleSetSourceKey() {
		return ruleSetSourceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleSetSourceKey(RegistryKeyProperty newRuleSetSourceKey, NotificationChain msgs) {
		RegistryKeyProperty oldRuleSetSourceKey = ruleSetSourceKey;
		ruleSetSourceKey = newRuleSetSourceKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY, oldRuleSetSourceKey, newRuleSetSourceKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleSetSourceKey(RegistryKeyProperty newRuleSetSourceKey) {
		if (newRuleSetSourceKey != ruleSetSourceKey) {
			NotificationChain msgs = null;
			if (ruleSetSourceKey != null)
				msgs = ((InternalEObject)ruleSetSourceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY, null, msgs);
			if (newRuleSetSourceKey != null)
				msgs = ((InternalEObject)newRuleSetSourceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY, null, msgs);
			msgs = basicSetRuleSetSourceKey(newRuleSetSourceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY, newRuleSetSourceKey, newRuleSetSourceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSetCreationProperty> getRuleSetProperties() {
		if (ruleSetProperties == null) {
			ruleSetProperties = new EObjectContainmentEList<RuleSetCreationProperty>(RuleSetCreationProperty.class, this, EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES);
		}
		return ruleSetProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatefulSession() {
		return statefulSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatefulSession(boolean newStatefulSession) {
		boolean oldStatefulSession = statefulSession;
		statefulSession = newStatefulSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__STATEFUL_SESSION, oldStatefulSession, statefulSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSessionProperty> getRuleSessionProperties() {
		if (ruleSessionProperties == null) {
			ruleSessionProperties = new EObjectContainmentEList<RuleSessionProperty>(RuleSessionProperty.class, this, EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES);
		}
		return ruleSessionProperties;
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
	public String getSourceValue() {
		return sourceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceValue(String newSourceValue) {
		String oldSourceValue = sourceValue;
		sourceValue = newSourceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__SOURCE_VALUE, oldSourceValue, sourceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getSourceXpath() {
		return sourceXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceXpath(NamespacedProperty newSourceXpath, NotificationChain msgs) {
		NamespacedProperty oldSourceXpath = sourceXpath;
		sourceXpath = newSourceXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__SOURCE_XPATH, oldSourceXpath, newSourceXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceXpath(NamespacedProperty newSourceXpath) {
		if (newSourceXpath != sourceXpath) {
			NotificationChain msgs = null;
			if (sourceXpath != null)
				msgs = ((InternalEObject)sourceXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__SOURCE_XPATH, null, msgs);
			if (newSourceXpath != null)
				msgs = ((InternalEObject)newSourceXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__SOURCE_XPATH, null, msgs);
			msgs = basicSetSourceXpath(newSourceXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__SOURCE_XPATH, newSourceXpath, newSourceXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(String newTargetValue) {
		String oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getTargetResultXpath() {
		return targetResultXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetResultXpath(NamespacedProperty newTargetResultXpath, NotificationChain msgs) {
		NamespacedProperty oldTargetResultXpath = targetResultXpath;
		targetResultXpath = newTargetResultXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH, oldTargetResultXpath, newTargetResultXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetResultXpath(NamespacedProperty newTargetResultXpath) {
		if (newTargetResultXpath != targetResultXpath) {
			NotificationChain msgs = null;
			if (targetResultXpath != null)
				msgs = ((InternalEObject)targetResultXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH, null, msgs);
			if (newTargetResultXpath != null)
				msgs = ((InternalEObject)newTargetResultXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH, null, msgs);
			msgs = basicSetTargetResultXpath(newTargetResultXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH, newTargetResultXpath, newTargetResultXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getTargetXpath() {
		return targetXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetXpath(NamespacedProperty newTargetXpath, NotificationChain msgs) {
		NamespacedProperty oldTargetXpath = targetXpath;
		targetXpath = newTargetXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_XPATH, oldTargetXpath, newTargetXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetXpath(NamespacedProperty newTargetXpath) {
		if (newTargetXpath != targetXpath) {
			NotificationChain msgs = null;
			if (targetXpath != null)
				msgs = ((InternalEObject)targetXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__TARGET_XPATH, null, msgs);
			if (newTargetXpath != null)
				msgs = ((InternalEObject)newTargetXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_MEDIATOR__TARGET_XPATH, null, msgs);
			msgs = basicSetTargetXpath(newTargetXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_XPATH, newTargetXpath, newTargetXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleActions getTargetAction() {
		return targetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAction(RuleActions newTargetAction) {
		RuleActions oldTargetAction = targetAction;
		targetAction = newTargetAction == null ? TARGET_ACTION_EDEFAULT : newTargetAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_MEDIATOR__TARGET_ACTION, oldTargetAction, targetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY:
				return basicSetRuleSetSourceKey(null, msgs);
			case EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES:
				return ((InternalEList<?>)getRuleSetProperties()).basicRemove(otherEnd, msgs);
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES:
				return ((InternalEList<?>)getRuleSessionProperties()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.RULE_MEDIATOR__SOURCE_XPATH:
				return basicSetSourceXpath(null, msgs);
			case EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH:
				return basicSetTargetResultXpath(null, msgs);
			case EsbPackage.RULE_MEDIATOR__TARGET_XPATH:
				return basicSetTargetXpath(null, msgs);
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
			case EsbPackage.RULE_MEDIATOR__RULE_SET_URI:
				return getRuleSetURI();
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_TYPE:
				return getRuleSetSourceType();
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_CODE:
				return getRuleSetSourceCode();
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY:
				return getRuleSetSourceKey();
			case EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES:
				return getRuleSetProperties();
			case EsbPackage.RULE_MEDIATOR__STATEFUL_SESSION:
				return isStatefulSession();
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES:
				return getRuleSessionProperties();
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
			case EsbPackage.RULE_MEDIATOR__SOURCE_VALUE:
				return getSourceValue();
			case EsbPackage.RULE_MEDIATOR__SOURCE_XPATH:
				return getSourceXpath();
			case EsbPackage.RULE_MEDIATOR__TARGET_VALUE:
				return getTargetValue();
			case EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH:
				return getTargetResultXpath();
			case EsbPackage.RULE_MEDIATOR__TARGET_XPATH:
				return getTargetXpath();
			case EsbPackage.RULE_MEDIATOR__TARGET_ACTION:
				return getTargetAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_URI:
				setRuleSetURI((String)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_TYPE:
				setRuleSetSourceType((RuleSourceType)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_CODE:
				setRuleSetSourceCode((String)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY:
				setRuleSetSourceKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES:
				getRuleSetProperties().clear();
				getRuleSetProperties().addAll((Collection<? extends RuleSetCreationProperty>)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__STATEFUL_SESSION:
				setStatefulSession((Boolean)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES:
				getRuleSessionProperties().clear();
				getRuleSessionProperties().addAll((Collection<? extends RuleSessionProperty>)newValue);
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
			case EsbPackage.RULE_MEDIATOR__SOURCE_VALUE:
				setSourceValue((String)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_VALUE:
				setTargetValue((String)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH:
				setTargetResultXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_XPATH:
				setTargetXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_ACTION:
				setTargetAction((RuleActions)newValue);
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
			case EsbPackage.RULE_MEDIATOR__RULE_SET_URI:
				setRuleSetURI(RULE_SET_URI_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_TYPE:
				setRuleSetSourceType(RULE_SET_SOURCE_TYPE_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_CODE:
				setRuleSetSourceCode(RULE_SET_SOURCE_CODE_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY:
				setRuleSetSourceKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES:
				getRuleSetProperties().clear();
				return;
			case EsbPackage.RULE_MEDIATOR__STATEFUL_SESSION:
				setStatefulSession(STATEFUL_SESSION_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES:
				getRuleSessionProperties().clear();
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
			case EsbPackage.RULE_MEDIATOR__SOURCE_VALUE:
				setSourceValue(SOURCE_VALUE_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)null);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_VALUE:
				setTargetValue(TARGET_VALUE_EDEFAULT);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH:
				setTargetResultXpath((NamespacedProperty)null);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_XPATH:
				setTargetXpath((NamespacedProperty)null);
				return;
			case EsbPackage.RULE_MEDIATOR__TARGET_ACTION:
				setTargetAction(TARGET_ACTION_EDEFAULT);
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
			case EsbPackage.RULE_MEDIATOR__RULE_SET_URI:
				return RULE_SET_URI_EDEFAULT == null ? ruleSetURI != null : !RULE_SET_URI_EDEFAULT.equals(ruleSetURI);
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_TYPE:
				return ruleSetSourceType != RULE_SET_SOURCE_TYPE_EDEFAULT;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_CODE:
				return RULE_SET_SOURCE_CODE_EDEFAULT == null ? ruleSetSourceCode != null : !RULE_SET_SOURCE_CODE_EDEFAULT.equals(ruleSetSourceCode);
			case EsbPackage.RULE_MEDIATOR__RULE_SET_SOURCE_KEY:
				return ruleSetSourceKey != null;
			case EsbPackage.RULE_MEDIATOR__RULE_SET_PROPERTIES:
				return ruleSetProperties != null && !ruleSetProperties.isEmpty();
			case EsbPackage.RULE_MEDIATOR__STATEFUL_SESSION:
				return statefulSession != STATEFUL_SESSION_EDEFAULT;
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_PROPERTIES:
				return ruleSessionProperties != null && !ruleSessionProperties.isEmpty();
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
			case EsbPackage.RULE_MEDIATOR__SOURCE_VALUE:
				return SOURCE_VALUE_EDEFAULT == null ? sourceValue != null : !SOURCE_VALUE_EDEFAULT.equals(sourceValue);
			case EsbPackage.RULE_MEDIATOR__SOURCE_XPATH:
				return sourceXpath != null;
			case EsbPackage.RULE_MEDIATOR__TARGET_VALUE:
				return TARGET_VALUE_EDEFAULT == null ? targetValue != null : !TARGET_VALUE_EDEFAULT.equals(targetValue);
			case EsbPackage.RULE_MEDIATOR__TARGET_RESULT_XPATH:
				return targetResultXpath != null;
			case EsbPackage.RULE_MEDIATOR__TARGET_XPATH:
				return targetXpath != null;
			case EsbPackage.RULE_MEDIATOR__TARGET_ACTION:
				return targetAction != TARGET_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (RuleSetURI: ");
		result.append(ruleSetURI);
		result.append(", ruleSetSourceType: ");
		result.append(ruleSetSourceType);
		result.append(", ruleSetSourceCode: ");
		result.append(ruleSetSourceCode);
		result.append(", statefulSession: ");
		result.append(statefulSession);
		result.append(", sourceValue: ");
		result.append(sourceValue);
		result.append(", targetValue: ");
		result.append(targetValue);
		result.append(", targetAction: ");
		result.append(targetAction);
		result.append(')');
		return result.toString();
	}

} //RuleMediatorImpl
