/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Event Trigger</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl#getId <em>
 * Id</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl#getExpression
 * <em>Expression</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl#getTargetTopic
 * <em>Target Topic</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl#getSubscriptionsList
 * <em>Subscriptions List</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl#getLanguage
 * <em>Language</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EventTriggerImpl extends EObjectImpl implements EventTrigger {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetTopic() <em>Target Topic</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetTopic() <em>Target Topic</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetTopic()
	 * @generated
	 * @ordered
	 */
	protected String targetTopic = TARGET_TOPIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriptionsList()
	 * <em>Subscriptions List</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getSubscriptionsList()
	 * @generated
	 * @ordered
	 */
	protected EventSubscriptionList subscriptionsList;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.EVENT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.EVENT_TRIGGER__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.EVENT_TRIGGER__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTargetTopic() {
		return targetTopic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTargetTopic(String newTargetTopic) {
		String oldTargetTopic = targetTopic;
		targetTopic = newTargetTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.EVENT_TRIGGER__TARGET_TOPIC, oldTargetTopic, targetTopic));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventSubscriptionList getSubscriptionsList() {
		return subscriptionsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionsList(EventSubscriptionList newSubscriptionsList,
			NotificationChain msgs) {
		EventSubscriptionList oldSubscriptionsList = subscriptionsList;
		subscriptionsList = newSubscriptionsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST, oldSubscriptionsList,
					newSubscriptionsList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSubscriptionsList(EventSubscriptionList newSubscriptionsList) {
		if (newSubscriptionsList != subscriptionsList) {
			NotificationChain msgs = null;
			if (subscriptionsList != null)
				msgs = ((InternalEObject) subscriptionsList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST, null,
						msgs);
			if (newSubscriptionsList != null)
				msgs = ((InternalEObject) newSubscriptionsList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST, null,
						msgs);
			msgs = basicSetSubscriptionsList(newSubscriptionsList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST, newSubscriptionsList,
					newSubscriptionsList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.EVENT_TRIGGER__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST:
			return basicSetSubscriptionsList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.EVENT_TRIGGER__ID:
			return getId();
		case DsPackage.EVENT_TRIGGER__EXPRESSION:
			return getExpression();
		case DsPackage.EVENT_TRIGGER__TARGET_TOPIC:
			return getTargetTopic();
		case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST:
			return getSubscriptionsList();
		case DsPackage.EVENT_TRIGGER__LANGUAGE:
			return getLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.EVENT_TRIGGER__ID:
			setId((String) newValue);
			return;
		case DsPackage.EVENT_TRIGGER__EXPRESSION:
			setExpression((String) newValue);
			return;
		case DsPackage.EVENT_TRIGGER__TARGET_TOPIC:
			setTargetTopic((String) newValue);
			return;
		case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST:
			setSubscriptionsList((EventSubscriptionList) newValue);
			return;
		case DsPackage.EVENT_TRIGGER__LANGUAGE:
			setLanguage((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DsPackage.EVENT_TRIGGER__ID:
			setId(ID_EDEFAULT);
			return;
		case DsPackage.EVENT_TRIGGER__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case DsPackage.EVENT_TRIGGER__TARGET_TOPIC:
			setTargetTopic(TARGET_TOPIC_EDEFAULT);
			return;
		case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST:
			setSubscriptionsList((EventSubscriptionList) null);
			return;
		case DsPackage.EVENT_TRIGGER__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DsPackage.EVENT_TRIGGER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DsPackage.EVENT_TRIGGER__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT
					.equals(expression);
		case DsPackage.EVENT_TRIGGER__TARGET_TOPIC:
			return TARGET_TOPIC_EDEFAULT == null ? targetTopic != null : !TARGET_TOPIC_EDEFAULT
					.equals(targetTopic);
		case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS_LIST:
			return subscriptionsList != null;
		case DsPackage.EVENT_TRIGGER__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT
					.equals(language);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", expression: ");
		result.append(expression);
		result.append(", targetTopic: ");
		result.append(targetTopic);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} // EventTriggerImpl
