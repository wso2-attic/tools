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
import org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RouterRoute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl#isContinueAfterRouting <em>Continue After Routing</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RouterMediatorImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterMediatorImpl extends MediatorImpl implements RouterMediator {
	/**
	 * The default value of the '{@link #isContinueAfterRouting() <em>Continue After Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueAfterRouting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_AFTER_ROUTING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinueAfterRouting() <em>Continue After Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueAfterRouting()
	 * @generated
	 * @ordered
	 */
	protected boolean continueAfterRouting = CONTINUE_AFTER_ROUTING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<RouterRoute> routes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return EsbPackage.Literals.ROUTER_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinueAfterRouting() {
		return continueAfterRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueAfterRouting(boolean newContinueAfterRouting) {
		boolean oldContinueAfterRouting = continueAfterRouting;
		continueAfterRouting = newContinueAfterRouting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING, oldContinueAfterRouting, continueAfterRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouterRoute> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<RouterRoute>(RouterRoute.class, this, EsbPackage.ROUTER_MEDIATOR__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING:
				return isContinueAfterRouting();
			case EsbPackage.ROUTER_MEDIATOR__ROUTES:
				return getRoutes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING:
				setContinueAfterRouting((Boolean)newValue);
				return;
			case EsbPackage.ROUTER_MEDIATOR__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends RouterRoute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING:
				setContinueAfterRouting(CONTINUE_AFTER_ROUTING_EDEFAULT);
				return;
			case EsbPackage.ROUTER_MEDIATOR__ROUTES:
				getRoutes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING:
				return continueAfterRouting != CONTINUE_AFTER_ROUTING_EDEFAULT;
			case EsbPackage.ROUTER_MEDIATOR__ROUTES:
				return routes != null && !routes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (continueAfterRouting: ");
		result.append(continueAfterRouting);
		result.append(')');
		return result.toString();
	}

} //RouterMediatorImpl
