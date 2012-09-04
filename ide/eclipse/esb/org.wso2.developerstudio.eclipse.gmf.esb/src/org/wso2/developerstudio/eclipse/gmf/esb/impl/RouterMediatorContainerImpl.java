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

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RouterMediatorContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.RouterTarget;
import org.wso2.developerstudio.eclipse.gmf.esb.RouterTargetContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Mediator Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorContainerImpl#getRouterTargetContainer <em>Router Target Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorContainerImpl#isBreakAfterRoute <em>Break After Route</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorContainerImpl#getRouteExpression <em>Route Expression</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorContainerImpl#getRoutePattern <em>Route Pattern</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorContainerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterMediatorContainerImpl extends EsbNodeImpl implements RouterMediatorContainer {
	/**
	 * The cached value of the '{@link #getRouterTargetContainer() <em>Router Target Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterTargetContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<RouterTargetContainer> routerTargetContainer;

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
	 * The cached value of the '{@link #getRouteExpression() <em>Route Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteExpression()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty routeExpression;
	/**
	 * The default value of the '{@link #getRoutePattern() <em>Route Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_PATTERN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoutePattern() <em>Route Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePattern()
	 * @generated
	 * @ordered
	 */
	protected String routePattern = ROUTE_PATTERN_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RouterTarget target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterMediatorContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.ROUTER_MEDIATOR_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouterTargetContainer> getRouterTargetContainer() {
		if (routerTargetContainer == null) {
			routerTargetContainer = new EObjectContainmentEList<RouterTargetContainer>(RouterTargetContainer.class, this, EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER);
		}
		return routerTargetContainer;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ROUTER_MEDIATOR_CONTAINER__BREAK_AFTER_ROUTE, oldBreakAfterRoute, breakAfterRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getRouteExpression() {
		if (routeExpression != null && routeExpression.eIsProxy()) {
			InternalEObject oldRouteExpression = (InternalEObject)routeExpression;
			routeExpression = (NamespacedProperty)eResolveProxy(oldRouteExpression);
			if (routeExpression != oldRouteExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION, oldRouteExpression, routeExpression));
			}
		}
		return routeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty basicGetRouteExpression() {
		return routeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteExpression(NamespacedProperty newRouteExpression) {
		NamespacedProperty oldRouteExpression = routeExpression;
		routeExpression = newRouteExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION, oldRouteExpression, routeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutePattern() {
		return routePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutePattern(String newRoutePattern) {
		String oldRoutePattern = routePattern;
		routePattern = newRoutePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_PATTERN, oldRoutePattern, routePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (RouterTarget)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RouterTarget newTarget) {
		RouterTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER:
				return ((InternalEList<?>)getRouterTargetContainer()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER:
				return getRouterTargetContainer();
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__BREAK_AFTER_ROUTE:
				return isBreakAfterRoute();
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION:
				if (resolve) return getRouteExpression();
				return basicGetRouteExpression();
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_PATTERN:
				return getRoutePattern();
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER:
				getRouterTargetContainer().clear();
				getRouterTargetContainer().addAll((Collection<? extends RouterTargetContainer>)newValue);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__BREAK_AFTER_ROUTE:
				setBreakAfterRoute((Boolean)newValue);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION:
				setRouteExpression((NamespacedProperty)newValue);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_PATTERN:
				setRoutePattern((String)newValue);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET:
				setTarget((RouterTarget)newValue);
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
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER:
				getRouterTargetContainer().clear();
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__BREAK_AFTER_ROUTE:
				setBreakAfterRoute(BREAK_AFTER_ROUTE_EDEFAULT);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION:
				setRouteExpression((NamespacedProperty)null);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_PATTERN:
				setRoutePattern(ROUTE_PATTERN_EDEFAULT);
				return;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET:
				setTarget((RouterTarget)null);
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
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTER_TARGET_CONTAINER:
				return routerTargetContainer != null && !routerTargetContainer.isEmpty();
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__BREAK_AFTER_ROUTE:
				return breakAfterRoute != BREAK_AFTER_ROUTE_EDEFAULT;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_EXPRESSION:
				return routeExpression != null;
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__ROUTE_PATTERN:
				return ROUTE_PATTERN_EDEFAULT == null ? routePattern != null : !ROUTE_PATTERN_EDEFAULT.equals(routePattern);
			case EsbPackage.ROUTER_MEDIATOR_CONTAINER__TARGET:
				return target != null;
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
		result.append(", routePattern: ");
		result.append(routePattern);
		result.append(')');
		return result.toString();
	}

} //RouterMediatorContainerImpl
