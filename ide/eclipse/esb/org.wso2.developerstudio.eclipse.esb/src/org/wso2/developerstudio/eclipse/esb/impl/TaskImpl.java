/**
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.eclipse.esb.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.Element;
import org.wso2.developerstudio.eclipse.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.esb.Task;
import org.wso2.developerstudio.eclipse.esb.TaskGroup;
import org.wso2.developerstudio.eclipse.esb.TaskImplementation;
import org.wso2.developerstudio.eclipse.esb.TaskTriggerType;
import org.wso2.developerstudio.eclipse.esb.util.ObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getTaskGroup <em>Task Group</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getTaskImplementationClass <em>Task Implementation Class</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getCron <em>Cron</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.impl.TaskImpl#getPinnedServers <em>Pinned Servers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends ConfigurationElementImpl implements Task {
	/**
	 * The default value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskName()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskName()
	 * @generated
	 * @ordered
	 */
	protected String taskName = TASK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskGroup() <em>Task Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_GROUP_EDEFAULT = "synapse.simple.quartz";

	/**
	 * The cached value of the '{@link #getTaskGroup() <em>Task Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroup()
	 * @generated
	 * @ordered
	 */
	protected String taskGroup = TASK_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskImplementationClass() <em>Task Implementation Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected TaskImplementation taskImplementationClass;

	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TaskTriggerType TRIGGER_TYPE_EDEFAULT = TaskTriggerType.SIMPLE;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TaskTriggerType triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected long count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERVAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected long interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected static final String CRON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected String cron = CRON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinnedServers() <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedServers()
	 * @generated
	 * @ordered
	 */
	protected static final String PINNED_SERVERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinnedServers() <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedServers()
	 * @generated
	 * @ordered
	 */
	protected String pinnedServers = PINNED_SERVERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskName(String newTaskName) {
		String oldTaskName = taskName;
		taskName = newTaskName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__TASK_NAME, oldTaskName, taskName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskGroup() {
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskGroup(String newTaskGroup) {
		String oldTaskGroup = taskGroup;
		taskGroup = newTaskGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__TASK_GROUP, oldTaskGroup, taskGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskImplementation getTaskImplementationClass() {
		return taskImplementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskImplementationClass(TaskImplementation newTaskImplementationClass, NotificationChain msgs) {
		TaskImplementation oldTaskImplementationClass = taskImplementationClass;
		taskImplementationClass = newTaskImplementationClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS, oldTaskImplementationClass, newTaskImplementationClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskImplementationClass(TaskImplementation newTaskImplementationClass) {
		if (newTaskImplementationClass != taskImplementationClass) {
			NotificationChain msgs = null;
			if (taskImplementationClass != null)
				msgs = ((InternalEObject)taskImplementationClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS, null, msgs);
			if (newTaskImplementationClass != null)
				msgs = ((InternalEObject)newTaskImplementationClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS, null, msgs);
			msgs = basicSetTaskImplementationClass(newTaskImplementationClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS, newTaskImplementationClass, newTaskImplementationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTriggerType getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(TaskTriggerType newTriggerType) {
		TaskTriggerType oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__TRIGGER_TYPE, oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(long newCount) {
		long oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(long newInterval) {
		long oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCron() {
		return cron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCron(String newCron) {
		String oldCron = cron;
		cron = newCron;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__CRON, oldCron, cron));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPinnedServers() {
		return pinnedServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinnedServers(String newPinnedServers) {
		String oldPinnedServers = pinnedServers;
		pinnedServers = newPinnedServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.TASK__PINNED_SERVERS, oldPinnedServers, pinnedServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS:
				return basicSetTaskImplementationClass(null, msgs);
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
			case EsbPackage.TASK__TASK_NAME:
				return getTaskName();
			case EsbPackage.TASK__TASK_GROUP:
				return getTaskGroup();
			case EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS:
				return getTaskImplementationClass();
			case EsbPackage.TASK__TRIGGER_TYPE:
				return getTriggerType();
			case EsbPackage.TASK__COUNT:
				return getCount();
			case EsbPackage.TASK__INTERVAL:
				return getInterval();
			case EsbPackage.TASK__CRON:
				return getCron();
			case EsbPackage.TASK__PINNED_SERVERS:
				return getPinnedServers();
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
			case EsbPackage.TASK__TASK_NAME:
				setTaskName((String)newValue);
				return;
			case EsbPackage.TASK__TASK_GROUP:
				setTaskGroup((String)newValue);
				return;
			case EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS:
				setTaskImplementationClass((TaskImplementation)newValue);
				return;
			case EsbPackage.TASK__TRIGGER_TYPE:
				setTriggerType((TaskTriggerType)newValue);
				return;
			case EsbPackage.TASK__COUNT:
				setCount((Long)newValue);
				return;
			case EsbPackage.TASK__INTERVAL:
				setInterval((Long)newValue);
				return;
			case EsbPackage.TASK__CRON:
				setCron((String)newValue);
				return;
			case EsbPackage.TASK__PINNED_SERVERS:
				setPinnedServers((String)newValue);
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
			case EsbPackage.TASK__TASK_NAME:
				setTaskName(TASK_NAME_EDEFAULT);
				return;
			case EsbPackage.TASK__TASK_GROUP:
				setTaskGroup(TASK_GROUP_EDEFAULT);
				return;
			case EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS:
				setTaskImplementationClass((TaskImplementation)null);
				return;
			case EsbPackage.TASK__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case EsbPackage.TASK__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case EsbPackage.TASK__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case EsbPackage.TASK__CRON:
				setCron(CRON_EDEFAULT);
				return;
			case EsbPackage.TASK__PINNED_SERVERS:
				setPinnedServers(PINNED_SERVERS_EDEFAULT);
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
			case EsbPackage.TASK__TASK_NAME:
				return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
			case EsbPackage.TASK__TASK_GROUP:
				return TASK_GROUP_EDEFAULT == null ? taskGroup != null : !TASK_GROUP_EDEFAULT.equals(taskGroup);
			case EsbPackage.TASK__TASK_IMPLEMENTATION_CLASS:
				return taskImplementationClass != null;
			case EsbPackage.TASK__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case EsbPackage.TASK__COUNT:
				return count != COUNT_EDEFAULT;
			case EsbPackage.TASK__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case EsbPackage.TASK__CRON:
				return CRON_EDEFAULT == null ? cron != null : !CRON_EDEFAULT.equals(cron);
			case EsbPackage.TASK__PINNED_SERVERS:
				return PINNED_SERVERS_EDEFAULT == null ? pinnedServers != null : !PINNED_SERVERS_EDEFAULT.equals(pinnedServers);
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
		result.append(" (TaskName: ");
		result.append(taskName);
		result.append(", TaskGroup: ");
		result.append(taskGroup);
		result.append(", TriggerType: ");
		result.append(triggerType);
		result.append(", Count: ");
		result.append(count);
		result.append(", Interval: ");
		result.append(interval);
		result.append(", Cron: ");
		result.append(cron);
		result.append(", PinnedServers: ");
		result.append(pinnedServers);
		result.append(')');
		return result.toString();
	}

	@Override
	public Map<String, ObjectValidator> validate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Element doSave(Element parent) throws Exception {
		// TODO Auto-generated method stub
		
		createChildElement(parent, "task");
		
		return null;
	}

} //TaskImpl
