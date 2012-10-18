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
import org.wso2.developerstudio.eclipse.gmf.esb.TaskImplementation;
import org.wso2.developerstudio.eclipse.gmf.esb.TaskProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TaskImplementationImpl#getTaskImplementation <em>Task Implementation</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.TaskImplementationImpl#getTaskProperties <em>Task Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImplementationImpl extends EsbNodeImpl implements TaskImplementation {
	/**
	 * The default value of the '{@link #getTaskImplementation() <em>Task Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskImplementation() <em>Task Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImplementation()
	 * @generated
	 * @ordered
	 */
	protected String taskImplementation = TASK_IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskProperties() <em>Task Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskProperty> taskProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.TASK_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskImplementation() {
		return taskImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskImplementation(String newTaskImplementation) {
		String oldTaskImplementation = taskImplementation;
		taskImplementation = newTaskImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK_IMPLEMENTATION__TASK_IMPLEMENTATION, oldTaskImplementation, taskImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskProperty> getTaskProperties() {
		if (taskProperties == null) {
			taskProperties = new EObjectContainmentEList<TaskProperty>(TaskProperty.class, this, EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES);
		}
		return taskProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES:
				return ((InternalEList<?>)getTaskProperties()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.TASK_IMPLEMENTATION__TASK_IMPLEMENTATION:
				return getTaskImplementation();
			case EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES:
				return getTaskProperties();
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
			case EsbPackage.TASK_IMPLEMENTATION__TASK_IMPLEMENTATION:
				setTaskImplementation((String)newValue);
				return;
			case EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES:
				getTaskProperties().clear();
				getTaskProperties().addAll((Collection<? extends TaskProperty>)newValue);
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
			case EsbPackage.TASK_IMPLEMENTATION__TASK_IMPLEMENTATION:
				setTaskImplementation(TASK_IMPLEMENTATION_EDEFAULT);
				return;
			case EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES:
				getTaskProperties().clear();
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
			case EsbPackage.TASK_IMPLEMENTATION__TASK_IMPLEMENTATION:
				return TASK_IMPLEMENTATION_EDEFAULT == null ? taskImplementation != null : !TASK_IMPLEMENTATION_EDEFAULT.equals(taskImplementation);
			case EsbPackage.TASK_IMPLEMENTATION__TASK_PROPERTIES:
				return taskProperties != null && !taskProperties.isEmpty();
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
		result.append(" (taskImplementation: ");
		result.append(taskImplementation);
		result.append(')');
		return result.toString();
	}

} //TaskImplementationImpl
