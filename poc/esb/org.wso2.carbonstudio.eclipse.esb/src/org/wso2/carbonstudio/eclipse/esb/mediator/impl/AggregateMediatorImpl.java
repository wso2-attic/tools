/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.esb.mediator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl#getCompletionMinMessages <em>Completion Min Messages</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl#getCompletionMaxMessages <em>Completion Max Messages</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl#getOnCompleteBranch <em>On Complete Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateMediatorImpl extends MediatorImpl implements AggregateMediator {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AggregateMediatorImpl() {
		super();
		
		// Correlation expression.
		NamespacedProperty correlateOnExpression = getEsbFactory().createNamespacedProperty();
		correlateOnExpression.setPrettyName("Correlation Expression");
		correlateOnExpression.setPropertyName("expression");
		setCorrelationExpression(correlateOnExpression);
		setOnCompleteBranch(getMediatorFactory().createAggregateOnCompleteBranch());
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		// Correlation expression.
		Element correlateElem = getChildElement(self, "correlateOn");
		if (correlateElem != null) {
			getCorrelationExpression().load(correlateElem);
		}

		// Completion condition.
		Element completionElem = getChildElement(self, "completeCondition");
		if (completionElem != null) {
			// Timeout.
			if (completionElem.hasAttribute("timeout")) {
				setCompletionTimeout(Integer.parseInt(completionElem.getAttribute("timeout")));				
			}
			
			// Message count.
			Element messageCountElem = getChildElement(completionElem, "messageCount");
			if (messageCountElem != null) {
				setCompletionMaxMessages(Integer.parseInt(messageCountElem.getAttribute("max")));						
				setCompletionMinMessages(Integer.parseInt(messageCountElem.getAttribute("min")));					
			}									
		}
		
		// OnComplete branch.
		loadObject(self, "onComplete", AggregateOnCompleteBranch.class, false,
				new ObjectHandler<AggregateOnCompleteBranch>() {
					public void handle(AggregateOnCompleteBranch object) {
						setOnCompleteBranch(object);
					}
				});		
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "aggregate");
		
		// Correlation expression. If the expression is empty, don't put the tag
		String correlationValue = getCorrelationExpression().getPropertyValue();
		if (correlationValue!=null && !correlationValue.trim().equals("")){
			Element correlateElem = createChildElement(self, "correlateOn");
			getCorrelationExpression().save(correlateElem);
		}

		// Completion condition.
		Element completionElem = createChildElement(self, "completeCondition");
		{
			// Timeout.
			completionElem.setAttribute("timeout", Integer.toString(getCompletionTimeout()));

			// Message count.
			Element messageCountElem = createChildElement(completionElem, "messageCount");
			messageCountElem.setAttribute("max", Integer.toString(getCompletionMaxMessages()));
			messageCountElem.setAttribute("min", Integer.toString(getCompletionMinMessages()));
		}

		// OnComplete branch.
		if (getOnCompleteBranch() != null) {
			getOnCompleteBranch().save(self);
		}
		
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.AGGREGATE_MEDIATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT, oldCompletionTimeout, completionTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES, oldCompletionMinMessages, completionMinMessages));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES, oldCompletionMaxMessages, completionMaxMessages));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
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
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, oldOnCompleteBranch, newOnCompleteBranch);
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
				msgs = ((InternalEObject)onCompleteBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, null, msgs);
			if (newOnCompleteBranch != null)
				msgs = ((InternalEObject)newOnCompleteBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, null, msgs);
			msgs = basicSetOnCompleteBranch(newOnCompleteBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH, newOnCompleteBranch, newOnCompleteBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
			case MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return basicSetOnCompleteBranch(null, msgs);
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
			case MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				return getCompletionTimeout();
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				return getCompletionMinMessages();
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				return getCompletionMaxMessages();
			case MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return getOnCompleteBranch();
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
			case MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				setCorrelationExpression((NamespacedProperty)newValue);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				setCompletionTimeout((Integer)newValue);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				setCompletionMinMessages((Integer)newValue);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				setCompletionMaxMessages((Integer)newValue);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				setOnCompleteBranch((AggregateOnCompleteBranch)newValue);
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
			case MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				setCorrelationExpression((NamespacedProperty)null);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				setCompletionTimeout(COMPLETION_TIMEOUT_EDEFAULT);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				setCompletionMinMessages(COMPLETION_MIN_MESSAGES_EDEFAULT);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				setCompletionMaxMessages(COMPLETION_MAX_MESSAGES_EDEFAULT);
				return;
			case MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				setOnCompleteBranch((AggregateOnCompleteBranch)null);
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
			case MediatorPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
				return correlationExpression != null;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
				return completionTimeout != COMPLETION_TIMEOUT_EDEFAULT;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
				return completionMinMessages != COMPLETION_MIN_MESSAGES_EDEFAULT;
			case MediatorPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
				return completionMaxMessages != COMPLETION_MAX_MESSAGES_EDEFAULT;
			case MediatorPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH:
				return onCompleteBranch != null;
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
		result.append(" (completionTimeout: ");
		result.append(completionTimeout);
		result.append(", completionMinMessages: ");
		result.append(completionMinMessages);
		result.append(", completionMaxMessages: ");
		result.append(completionMaxMessages);
		result.append(')');
		return result.toString();
	}

} //AggregateMediatorImpl
