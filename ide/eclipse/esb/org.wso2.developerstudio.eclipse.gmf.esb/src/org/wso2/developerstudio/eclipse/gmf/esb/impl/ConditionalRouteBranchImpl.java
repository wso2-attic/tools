/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Route Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl#isBreakAfterRoute <em>Break After Route</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl#getEvaluatorExpression <em>Evaluator Expression</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl#getTargetSequence <em>Target Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalRouteBranchImpl extends EsbNodeImpl implements ConditionalRouteBranch {
	/**
	 * The default value of the '{@link #isBreakAfterRoute() <em>Break After Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakAfterRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAK_AFTER_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreakAfterRoute() <em>Break After Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakAfterRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean breakAfterRoute = BREAK_AFTER_ROUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluatorExpression() <em>Evaluator Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatorExpression()
	 * @generated
	 * @ordered
	 */
	protected EvaluatorExpressionProperty evaluatorExpression;

	/**
	 * The cached value of the '{@link #getTargetSequence() <em>Target Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSequence()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty targetSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalRouteBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.CONDITIONAL_ROUTE_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBreakAfterRoute() {
		return breakAfterRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakAfterRoute(boolean newBreakAfterRoute) {
		boolean oldBreakAfterRoute = breakAfterRoute;
		breakAfterRoute = newBreakAfterRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_AFTER_ROUTE, oldBreakAfterRoute, breakAfterRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluatorExpressionProperty getEvaluatorExpression() {
		if (evaluatorExpression != null && evaluatorExpression.eIsProxy()) {
			InternalEObject oldEvaluatorExpression = (InternalEObject)evaluatorExpression;
			evaluatorExpression = (EvaluatorExpressionProperty)eResolveProxy(oldEvaluatorExpression);
			if (evaluatorExpression != oldEvaluatorExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION, oldEvaluatorExpression, evaluatorExpression));
			}
		}
		return evaluatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluatorExpressionProperty basicGetEvaluatorExpression() {
		return evaluatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluatorExpression(EvaluatorExpressionProperty newEvaluatorExpression) {
		EvaluatorExpressionProperty oldEvaluatorExpression = evaluatorExpression;
		evaluatorExpression = newEvaluatorExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION, oldEvaluatorExpression, evaluatorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getTargetSequence() {
		if (targetSequence != null && targetSequence.eIsProxy()) {
			InternalEObject oldTargetSequence = (InternalEObject)targetSequence;
			targetSequence = (RegistryKeyProperty)eResolveProxy(oldTargetSequence);
			if (targetSequence != oldTargetSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE, oldTargetSequence, targetSequence));
			}
		}
		return targetSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty basicGetTargetSequence() {
		return targetSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSequence(RegistryKeyProperty newTargetSequence) {
		RegistryKeyProperty oldTargetSequence = targetSequence;
		targetSequence = newTargetSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE, oldTargetSequence, targetSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_AFTER_ROUTE:
				return isBreakAfterRoute();
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION:
				if (resolve) return getEvaluatorExpression();
				return basicGetEvaluatorExpression();
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE:
				if (resolve) return getTargetSequence();
				return basicGetTargetSequence();
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_AFTER_ROUTE:
				setBreakAfterRoute((Boolean)newValue);
				return;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION:
				setEvaluatorExpression((EvaluatorExpressionProperty)newValue);
				return;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE:
				setTargetSequence((RegistryKeyProperty)newValue);
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_AFTER_ROUTE:
				setBreakAfterRoute(BREAK_AFTER_ROUTE_EDEFAULT);
				return;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION:
				setEvaluatorExpression((EvaluatorExpressionProperty)null);
				return;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE:
				setTargetSequence((RegistryKeyProperty)null);
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_AFTER_ROUTE:
				return breakAfterRoute != BREAK_AFTER_ROUTE_EDEFAULT;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__EVALUATOR_EXPRESSION:
				return evaluatorExpression != null;
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__TARGET_SEQUENCE:
				return targetSequence != null;
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
		result.append(" (breakAfterRoute: ");
		result.append(breakAfterRoute);
		result.append(')');
		return result.toString();
	}

} //ConditionalRouteBranchImpl
