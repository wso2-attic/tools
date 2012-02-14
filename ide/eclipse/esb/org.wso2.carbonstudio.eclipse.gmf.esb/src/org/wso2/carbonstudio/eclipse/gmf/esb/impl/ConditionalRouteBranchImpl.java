/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.carbonstudio.eclipse.gmf.esb.ConditionalRouteBranch;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Route Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.ConditionalRouteBranchImpl#isBreakRoute <em>Break Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalRouteBranchImpl extends EObjectImpl implements ConditionalRouteBranch {
	/**
	 * The default value of the '{@link #isBreakRoute() <em>Break Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAK_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreakRoute() <em>Break Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean breakRoute = BREAK_ROUTE_EDEFAULT;

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
	public boolean isBreakRoute() {
		return breakRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakRoute(boolean newBreakRoute) {
		boolean oldBreakRoute = breakRoute;
		breakRoute = newBreakRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE, oldBreakRoute, breakRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE:
				return isBreakRoute();
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE:
				setBreakRoute((Boolean)newValue);
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE:
				setBreakRoute(BREAK_ROUTE_EDEFAULT);
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
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH__BREAK_ROUTE:
				return breakRoute != BREAK_ROUTE_EDEFAULT;
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
		result.append(" (breakRoute: ");
		result.append(breakRoute);
		result.append(')');
		return result.toString();
	}

} //ConditionalRouteBranchImpl
