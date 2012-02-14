/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateOnCompleteBranch;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateSequenceType;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate On Complete Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl#getAggregationExpression <em>Aggregation Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.AggregateOnCompleteBranchImpl#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateOnCompleteBranchImpl extends EObjectImpl implements AggregateOnCompleteBranch {
	/**
	 * The cached value of the '{@link #getAggregationExpression() <em>Aggregation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationExpression()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty aggregationExpression;

	/**
	 * The default value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregateSequenceType SEQUENCE_TYPE_EDEFAULT = AggregateSequenceType.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected AggregateSequenceType sequenceType = SEQUENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSequenceKey() <em>Sequence Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty sequenceKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AggregateOnCompleteBranchImpl() {
		super();
		// Aggregate expression.
		NamespacedProperty aggregateExpression = EsbFactoryImpl.eINSTANCE.createNamespacedProperty();
		aggregateExpression.setPrettyName("Aggregation Expression");
		aggregateExpression.setPropertyName("expression");
		aggregateExpression.setPropertyValue("key");
		setAggregationExpression(aggregateExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.AGGREGATE_ON_COMPLETE_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getAggregationExpression() {
		return aggregationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationExpression(NamespacedProperty newAggregationExpression, NotificationChain msgs) {
		NamespacedProperty oldAggregationExpression = aggregationExpression;
		aggregationExpression = newAggregationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION, oldAggregationExpression, newAggregationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationExpression(NamespacedProperty newAggregationExpression) {
		if (newAggregationExpression != aggregationExpression) {
			NotificationChain msgs = null;
			if (aggregationExpression != null)
				msgs = ((InternalEObject)aggregationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION, null, msgs);
			if (newAggregationExpression != null)
				msgs = ((InternalEObject)newAggregationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION, null, msgs);
			msgs = basicSetAggregationExpression(newAggregationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION, newAggregationExpression, newAggregationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateSequenceType getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(AggregateSequenceType newSequenceType) {
		AggregateSequenceType oldSequenceType = sequenceType;
		sequenceType = newSequenceType == null ? SEQUENCE_TYPE_EDEFAULT : newSequenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE, oldSequenceType, sequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getSequenceKey() {
		return sequenceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceKey(RegistryKeyProperty newSequenceKey, NotificationChain msgs) {
		RegistryKeyProperty oldSequenceKey = sequenceKey;
		sequenceKey = newSequenceKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY, oldSequenceKey, newSequenceKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceKey(RegistryKeyProperty newSequenceKey) {
		if (newSequenceKey != sequenceKey) {
			NotificationChain msgs = null;
			if (sequenceKey != null)
				msgs = ((InternalEObject)sequenceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY, null, msgs);
			if (newSequenceKey != null)
				msgs = ((InternalEObject)newSequenceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY, null, msgs);
			msgs = basicSetSequenceKey(newSequenceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY, newSequenceKey, newSequenceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION:
				return basicSetAggregationExpression(null, msgs);
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY:
				return basicSetSequenceKey(null, msgs);
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
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION:
				return getAggregationExpression();
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE:
				return getSequenceType();
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY:
				return getSequenceKey();
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
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION:
				setAggregationExpression((NamespacedProperty)newValue);
				return;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE:
				setSequenceType((AggregateSequenceType)newValue);
				return;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY:
				setSequenceKey((RegistryKeyProperty)newValue);
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
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION:
				setAggregationExpression((NamespacedProperty)null);
				return;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE:
				setSequenceType(SEQUENCE_TYPE_EDEFAULT);
				return;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY:
				setSequenceKey((RegistryKeyProperty)null);
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
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION:
				return aggregationExpression != null;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE:
				return sequenceType != SEQUENCE_TYPE_EDEFAULT;
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY:
				return sequenceKey != null;
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
		result.append(" (sequenceType: ");
		result.append(sequenceType);
		result.append(')');
		return result.toString();
	}

} //AggregateOnCompleteBranchImpl
