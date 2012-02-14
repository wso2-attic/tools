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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl#getBeanName <em>Bean Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl#getConfigurationKey <em>Configuration Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpringMediatorImpl extends MediatorImpl implements SpringMediator {
	/**
	 * The default value of the '{@link #getBeanName() <em>Bean Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanName()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_NAME_EDEFAULT = "bean_name";

	/**
	 * The cached value of the '{@link #getBeanName() <em>Bean Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanName()
	 * @generated
	 * @ordered
	 */
	protected String beanName = BEAN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurationKey() <em>Configuration Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty configurationKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected SpringMediatorImpl() {
		super();
		
		// Spring configuration pointer.
		RegistryKeyProperty configurationKey = getEsbFactory().createRegistryKeyProperty();
		configurationKey.setPrettyName("Spring Configuration");
		configurationKey.setKeyName("key");
		configurationKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setConfigurationKey(configurationKey);
	}

	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		setBeanName(self.getAttribute("bean"));
		getConfigurationKey().load(self);
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "spring");
		self.setAttribute("bean", getBeanName());
		getConfigurationKey().save(self);
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.SPRING_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeanName() {
		return beanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanName(String newBeanName) {
		String oldBeanName = beanName;
		beanName = newBeanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.SPRING_MEDIATOR__BEAN_NAME, oldBeanName, beanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getConfigurationKey() {
		return configurationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationKey(RegistryKeyProperty newConfigurationKey, NotificationChain msgs) {
		RegistryKeyProperty oldConfigurationKey = configurationKey;
		configurationKey = newConfigurationKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY, oldConfigurationKey, newConfigurationKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationKey(RegistryKeyProperty newConfigurationKey) {
		if (newConfigurationKey != configurationKey) {
			NotificationChain msgs = null;
			if (configurationKey != null)
				msgs = ((InternalEObject)configurationKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY, null, msgs);
			if (newConfigurationKey != null)
				msgs = ((InternalEObject)newConfigurationKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY, null, msgs);
			msgs = basicSetConfigurationKey(newConfigurationKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY, newConfigurationKey, newConfigurationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY:
				return basicSetConfigurationKey(null, msgs);
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
			case MediatorPackage.SPRING_MEDIATOR__BEAN_NAME:
				return getBeanName();
			case MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY:
				return getConfigurationKey();
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
			case MediatorPackage.SPRING_MEDIATOR__BEAN_NAME:
				setBeanName((String)newValue);
				return;
			case MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY:
				setConfigurationKey((RegistryKeyProperty)newValue);
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
			case MediatorPackage.SPRING_MEDIATOR__BEAN_NAME:
				setBeanName(BEAN_NAME_EDEFAULT);
				return;
			case MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY:
				setConfigurationKey((RegistryKeyProperty)null);
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
			case MediatorPackage.SPRING_MEDIATOR__BEAN_NAME:
				return BEAN_NAME_EDEFAULT == null ? beanName != null : !BEAN_NAME_EDEFAULT.equals(beanName);
			case MediatorPackage.SPRING_MEDIATOR__CONFIGURATION_KEY:
				return configurationKey != null;
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
		result.append(" (beanName: ");
		result.append(beanName);
		result.append(')');
		return result.toString();
	}

} // SpringMediatorImpl
