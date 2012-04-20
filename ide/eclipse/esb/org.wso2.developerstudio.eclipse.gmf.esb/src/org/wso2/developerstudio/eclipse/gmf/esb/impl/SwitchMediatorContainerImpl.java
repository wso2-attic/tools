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
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchDefaultContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Mediator Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorContainerImpl#getSwitchCaseContainer <em>Switch Case Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SwitchMediatorContainerImpl#getSwitchDefaultContainer <em>Switch Default Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchMediatorContainerImpl extends EsbNodeImpl implements SwitchMediatorContainer {
	/**
	 * The cached value of the '{@link #getSwitchCaseContainer() <em>Switch Case Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchCaseContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchCaseContainer> switchCaseContainer;

	/**
	 * The cached value of the '{@link #getSwitchDefaultContainer() <em>Switch Default Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchDefaultContainer()
	 * @generated
	 * @ordered
	 */
	protected SwitchDefaultContainer switchDefaultContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchMediatorContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SWITCH_MEDIATOR_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchCaseContainer> getSwitchCaseContainer() {
		if (switchCaseContainer == null) {
			switchCaseContainer = new EObjectContainmentEList<SwitchCaseContainer>(SwitchCaseContainer.class, this, EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER);
		}
		return switchCaseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchDefaultContainer getSwitchDefaultContainer() {
		return switchDefaultContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchDefaultContainer(SwitchDefaultContainer newSwitchDefaultContainer, NotificationChain msgs) {
		SwitchDefaultContainer oldSwitchDefaultContainer = switchDefaultContainer;
		switchDefaultContainer = newSwitchDefaultContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER, oldSwitchDefaultContainer, newSwitchDefaultContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchDefaultContainer(SwitchDefaultContainer newSwitchDefaultContainer) {
		if (newSwitchDefaultContainer != switchDefaultContainer) {
			NotificationChain msgs = null;
			if (switchDefaultContainer != null)
				msgs = ((InternalEObject)switchDefaultContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER, null, msgs);
			if (newSwitchDefaultContainer != null)
				msgs = ((InternalEObject)newSwitchDefaultContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER, null, msgs);
			msgs = basicSetSwitchDefaultContainer(newSwitchDefaultContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER, newSwitchDefaultContainer, newSwitchDefaultContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER:
				return ((InternalEList<?>)getSwitchCaseContainer()).basicRemove(otherEnd, msgs);
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER:
				return basicSetSwitchDefaultContainer(null, msgs);
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
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER:
				return getSwitchCaseContainer();
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER:
				return getSwitchDefaultContainer();
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
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER:
				getSwitchCaseContainer().clear();
				getSwitchCaseContainer().addAll((Collection<? extends SwitchCaseContainer>)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER:
				setSwitchDefaultContainer((SwitchDefaultContainer)newValue);
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
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER:
				getSwitchCaseContainer().clear();
				return;
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER:
				setSwitchDefaultContainer((SwitchDefaultContainer)null);
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
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER:
				return switchCaseContainer != null && !switchCaseContainer.isEmpty();
			case EsbPackage.SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER:
				return switchDefaultContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchMediatorContainerImpl
