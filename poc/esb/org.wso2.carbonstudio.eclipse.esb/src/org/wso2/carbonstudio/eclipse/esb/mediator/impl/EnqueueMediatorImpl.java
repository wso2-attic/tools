/*
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
package org.wso2.carbonstudio.eclipse.esb.mediator.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enqueue Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl#getSequenceKey <em>Sequence Key</em>}</li>
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
	 */
    protected EnqueueMediatorImpl() {
		super();
		
		// Sequence key.
		RegistryKeyProperty sequenceKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only sequences media type
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)sequenceKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);

		sequenceKey.setPrettyName("Sequence Key");
		sequenceKey.setKeyName("sequence");
		sequenceKey.setKeyValue(DEFAULT_SEQUENCE_REFERENCE_REGISTRY_KEY);
		setSequenceKey(sequenceKey);
	}
    
	/**
	 * {@inheritDoc}
	 */
    public void doLoad(Element self) throws Exception {		
		setExecutor(self.getAttribute("executor"));
		setPriority(Integer.parseInt(self.getAttribute("priority")));
		getSequenceKey().load(self);				
    }

	/**
	 * {@inheritDoc}
	 */
    public Element doSave(Element parent) throws Exception {
		Element self =  createChildElement(parent, "enqueue");		
		self.setAttribute("executor", getExecutor());
		self.setAttribute("priority", Integer.toString(getPriority()));
		getSequenceKey().save(self);   						
		return self;
    }
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MediatorPackage.Literals.ENQUEUE_MEDIATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENQUEUE_MEDIATOR__EXECUTOR, oldExecutor, executor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENQUEUE_MEDIATOR__PRIORITY, oldPriority, priority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, oldSequenceKey, newSequenceKey);
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
				msgs = ((InternalEObject)sequenceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, null, msgs);
			if (newSequenceKey != null)
				msgs = ((InternalEObject)newSequenceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, null, msgs);
			msgs = basicSetSequenceKey(newSequenceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY, newSequenceKey, newSequenceKey));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case MediatorPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				return getExecutor();
			case MediatorPackage.ENQUEUE_MEDIATOR__PRIORITY:
				return getPriority();
			case MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case MediatorPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				setExecutor((String)newValue);
				return;
			case MediatorPackage.ENQUEUE_MEDIATOR__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case MediatorPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				setExecutor(EXECUTOR_EDEFAULT);
				return;
			case MediatorPackage.ENQUEUE_MEDIATOR__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
			case MediatorPackage.ENQUEUE_MEDIATOR__EXECUTOR:
				return EXECUTOR_EDEFAULT == null ? executor != null : !EXECUTOR_EDEFAULT.equals(executor);
			case MediatorPackage.ENQUEUE_MEDIATOR__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case MediatorPackage.ENQUEUE_MEDIATOR__SEQUENCE_KEY:
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
