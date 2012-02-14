/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediatorOnCompleteOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateOnCompleteBranch;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.NamespacedProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getAggregateID <em>Aggregate ID</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getCompletionMinMessages <em>Completion Min Messages</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getCompletionMaxMessages <em>Completion Max Messages</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getOnCompleteBranch <em>On Complete Branch</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getOnCompleteOutputConnector <em>On Complete Output Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateMediatorImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateMediatorImpl extends MediatorImpl implements AggregateMediator {
	/**
	 * The default value of the '{@link #getAggregateID() <em>Aggregate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateID()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregateID() <em>Aggregate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateID()
	 * @generated
	 * @ordered
	 */
	protected String aggregateID = AGGREGATE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty correlationExpression;

	/**
	 * The default value of the '{@link #getCompletionTimeout() <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompletionTimeout() <em>Completion Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int completionTimeout = COMPLETION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionMinMessages() <em>Completion Min Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionMinMessages()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_MIN_MESSAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompletionMinMessages() <em>Completion Min Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionMinMessages()
	 * @generated
	 * @ordered
	 */
	protected int completionMinMessages = COMPLETION_MIN_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionMaxMessages() <em>Completion Max Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionMaxMessages()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_MAX_MESSAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompletionMaxMessages() <em>Completion Max Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionMaxMessages()
	 * @generated
	 * @ordered
	 */
	protected int completionMaxMessages = COMPLETION_MAX_MESSAGES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnCompleteBranch() <em>On Complete Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCompleteBranch()
	 * @generated
	 * @ordered
	 */
	protected AggregateOnCompleteBranch onCompleteBranch;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected AggregateMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected AggregateMediatorOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getOnCompleteOutputConnector() <em>On Complete Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCompleteOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected AggregateMediatorOnCompleteOutputConnector onCompleteOutputConnector;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<EsbElement> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AggregateMediatorImpl() {
		super();	
		// Correlation expression.
		NamespacedProperty correlateOnExpression = EsbFactoryImpl.eINSTANCE.createNamespacedProperty();
		correlateOnExpression.setPrettyName("Correlation Expression");
		correlateOnExpression.setPropertyName("expression");
		setCorrelationExpression(correlateOnExpression);		
		AggregateOnCompleteBranch onComplete=EsbFactoryImpl.eINSTANCE.createAggregateOnCompleteBranch();
		setOnCompleteBranch(onComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.AGGREGATE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregateID() {
		return aggregateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateID(String newAggregateID) {
		String oldAggregateID = aggregateID;
		aggregateID = newAggregateID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID, oldAggregateID, aggregateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getCorrelationExpression() {
		return correlationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationExpression(NamespacedProperty newCorrelationExpression, NotificationChain msgs) {
		NamespacedProperty oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationExpression(NamespacedProperty newCorrelationExpression) {
		if (newCorrelationExpression != correlationExpression) {
			NotificationChain msgs = null;
			if (correlationExpression != null)
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionTimeout() {
		return completionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionTimeout(int newCompletionTimeout) {
		int oldCompletionTimeout = completionTimeout;
		completionTimeout = newCompletionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT, oldCompletionTimeout, completionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionMinMessages() {
		return completionMinMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionMinMessages(int newCompletionMinMessages) {
		int oldCompletionMinMessages = completionMinMessages;
		completionMinMessages = newCompletionMinMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES, oldCompletionMinMessages, completionMinMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionMaxMessages() {
		return completionMaxMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionMaxMessages(int newCompletionMaxMessages) {
		int oldCompletionMaxMessages = completionMaxMessages;
		completionMaxMessages = newCompletionMaxMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES, oldCompletionMaxMessages, completionMaxMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateOnCompleteBranch getOnCompleteBranch() {
		return onCompleteBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCompleteBranch(AggregateOnCompleteBranch newOnCompleteBranch, NotificationChain msgs) {
		AggregateOnCompleteBranch oldOnCompleteBranch = onCompleteBranch;
		onCompleteBranch = newOnCompleteBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, oldOnCompleteBranch, newOnCompleteBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCompleteBranch(AggregateOnCompleteBranch newOnCompleteBranch) {
		if (newOnCompleteBranch != onCompleteBranch) {
			NotificationChain msgs = null;
			if (onCompleteBranch != null)
				msgs = ((InternalEObject)onCompleteBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, null, msgs);
			if (newOnCompleteBranch != null)
				msgs = ((InternalEObject)newOnCompleteBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, null, msgs);
			msgs = basicSetOnCompleteBranch(newOnCompleteBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, newOnCompleteBranch, newOnCompleteBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(AggregateMediatorInputConnector newInputConnector, NotificationChain msgs) {
		AggregateMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(AggregateMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(AggregateMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		AggregateMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(AggregateMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorOnCompleteOutputConnector getOnCompleteOutputConnector() {
		return onCompleteOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCompleteOutputConnector(AggregateMediatorOnCompleteOutputConnector newOnCompleteOutputConnector, NotificationChain msgs) {
		AggregateMediatorOnCompleteOutputConnector oldOnCompleteOutputConnector = onCompleteOutputConnector;
		onCompleteOutputConnector = newOnCompleteOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR, oldOnCompleteOutputConnector, newOnCompleteOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCompleteOutputConnector(AggregateMediatorOnCompleteOutputConnector newOnCompleteOutputConnector) {
		if (newOnCompleteOutputConnector != onCompleteOutputConnector) {
			NotificationChain msgs = null;
			if (onCompleteOutputConnector != null)
				msgs = ((InternalEObject)onCompleteOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR, null, msgs);
			if (newOnCompleteOutputConnector != null)
				msgs = ((InternalEObject)newOnCompleteOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOnCompleteOutputConnector(newOnCompleteOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR, newOnCompleteOutputConnector, newOnCompleteOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EsbElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<EsbElement>(EsbElement.class, this, EsbPackage.AGGREGATE_MEDIATOR__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return basicSetOnCompleteBranch(null, msgs);
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
				return basicSetOnCompleteOutputConnector(null, msgs);
			case EsbPackage.AGGREGATE_MEDIATOR__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID:
				return getAggregateID();
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				return getCompletionTimeout();
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				return getCompletionMinMessages();
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				return getCompletionMaxMessages();
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return getOnCompleteBranch();
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
				return getOnCompleteOutputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR__CHILDREN:
				return getChildren();
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
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID:
				setAggregateID((String)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				setCorrelationExpression((NamespacedProperty)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				setCompletionTimeout((Integer)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				setCompletionMinMessages((Integer)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				setCompletionMaxMessages((Integer)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				setOnCompleteBranch((AggregateOnCompleteBranch)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((AggregateMediatorInputConnector)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((AggregateMediatorOutputConnector)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
				setOnCompleteOutputConnector((AggregateMediatorOnCompleteOutputConnector)newValue);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends EsbElement>)newValue);
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
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID:
				setAggregateID(AGGREGATE_ID_EDEFAULT);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				setCorrelationExpression((NamespacedProperty)null);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				setCompletionTimeout(COMPLETION_TIMEOUT_EDEFAULT);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				setCompletionMinMessages(COMPLETION_MIN_MESSAGES_EDEFAULT);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				setCompletionMaxMessages(COMPLETION_MAX_MESSAGES_EDEFAULT);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				setOnCompleteBranch((AggregateOnCompleteBranch)null);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((AggregateMediatorInputConnector)null);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((AggregateMediatorOutputConnector)null);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
				setOnCompleteOutputConnector((AggregateMediatorOnCompleteOutputConnector)null);
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__CHILDREN:
				getChildren().clear();
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
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID:
				return AGGREGATE_ID_EDEFAULT == null ? aggregateID != null : !AGGREGATE_ID_EDEFAULT.equals(aggregateID);
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return correlationExpression != null;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				return completionTimeout != COMPLETION_TIMEOUT_EDEFAULT;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				return completionMinMessages != COMPLETION_MIN_MESSAGES_EDEFAULT;
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				return completionMaxMessages != COMPLETION_MAX_MESSAGES_EDEFAULT;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return onCompleteBranch != null;
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
				return onCompleteOutputConnector != null;
			case EsbPackage.AGGREGATE_MEDIATOR__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (aggregateID: ");
		result.append(aggregateID);
		result.append(", completionTimeout: ");
		result.append(completionTimeout);
		result.append(", completionMinMessages: ");
		result.append(completionMinMessages);
		result.append(", completionMaxMessages: ");
		result.append(completionMaxMessages);
		result.append(')');
		return result.toString();
	}

} //AggregateMediatorImpl
