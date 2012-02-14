/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.carbonstudio.eclipse.gmf.esb.EnqueueMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enqueue Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.EnqueueMediatorImpl#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnqueueMediatorImpl extends MediatorImpl implements EnqueueMediator {
	/**
	 * The default value of the '{@link #getExecutor() <em>Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTOR_EDEFAULT = "executor_name";

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected String executor = EXECUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

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
	 * @generated
	 */
	protected EnqueueMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.ENQUEUE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(String newExecutor) {
		String oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENQUEUE_MEDIATOR__EXECUTOR, oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENQUEUE_MEDIATOR__PRIORITY, oldPriority, priority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, oldSequenceKey, newSequenceKey);
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
				msgs = ((InternalEObject)sequenceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, null, msgs);
			if (newSequenceKey != null)
				msgs = ((InternalEObject)newSequenceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, null, msgs);
			msgs = basicSetSequenceKey(newSequenceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, newSequenceKey, newSequenceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case EsbPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				return getExecutor();
			case EsbPackage.ENQUEUE_MEDIATOR__PRIORITY:
				return getPriority();
			case EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case EsbPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				setExecutor((String)newValue);
				return;
			case EsbPackage.ENQUEUE_MEDIATOR__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case EsbPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				setExecutor(EXECUTOR_EDEFAULT);
				return;
			case EsbPackage.ENQUEUE_MEDIATOR__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case EsbPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				return EXECUTOR_EDEFAULT == null ? executor != null : !EXECUTOR_EDEFAULT.equals(executor);
			case EsbPackage.ENQUEUE_MEDIATOR__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case EsbPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
		result.append(" (executor: ");
		result.append(executor);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //EnqueueMediatorImpl
