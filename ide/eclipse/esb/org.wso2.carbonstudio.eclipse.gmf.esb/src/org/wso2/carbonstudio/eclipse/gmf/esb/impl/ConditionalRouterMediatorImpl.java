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

import org.wso2.carbonstudio.eclipse.gmf.esb.ConditionalRouteBranch;
import org.wso2.carbonstudio.eclipse.gmf.esb.ConditionalRouterMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Router Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl#isContinueRoute <em>Continue Route</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.ConditionalRouterMediatorImpl#getConditionalRouteBranches <em>Conditional Route Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalRouterMediatorImpl extends MediatorImpl implements ConditionalRouterMediator {
	/**
	 * The default value of the '{@link #isContinueRoute() <em>Continue Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinueRoute() <em>Continue Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean continueRoute = CONTINUE_ROUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionalRouteBranches() <em>Conditional Route Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalRouteBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalRouteBranch> conditionalRouteBranches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalRouterMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.CONDITIONAL_ROUTER_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinueRoute() {
		return continueRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueRoute(boolean newContinueRoute) {
		boolean oldContinueRoute = continueRoute;
		continueRoute = newContinueRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE, oldContinueRoute, continueRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalRouteBranch> getConditionalRouteBranches() {
		if (conditionalRouteBranches == null) {
			conditionalRouteBranches = new EObjectContainmentEList<ConditionalRouteBranch>(ConditionalRouteBranch.class, this, EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES);
		}
		return conditionalRouteBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES:
				return ((InternalEList<?>)getConditionalRouteBranches()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE:
				return isContinueRoute();
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES:
				return getConditionalRouteBranches();
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
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE:
				setContinueRoute((Boolean)newValue);
				return;
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES:
				getConditionalRouteBranches().clear();
				getConditionalRouteBranches().addAll((Collection<? extends ConditionalRouteBranch>)newValue);
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
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE:
				setContinueRoute(CONTINUE_ROUTE_EDEFAULT);
				return;
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES:
				getConditionalRouteBranches().clear();
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
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONTINUE_ROUTE:
				return continueRoute != CONTINUE_ROUTE_EDEFAULT;
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR__CONDITIONAL_ROUTE_BRANCHES:
				return conditionalRouteBranches != null && !conditionalRouteBranches.isEmpty();
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
		result.append(" (continueRoute: ");
		result.append(continueRoute);
		result.append(')');
		return result.toString();
	}

} //ConditionalRouterMediatorImpl
