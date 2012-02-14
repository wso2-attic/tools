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

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XQuery Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl#getQueryKey <em>Query Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl#getTargetXPath <em>Target XPath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XQueryMediatorImpl extends MediatorImpl implements XQueryMediator {
	/**
	 * The cached value of the '{@link #getQueryKey() <em>Query Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty queryKey;

	/**
	 * The cached value of the '{@link #getTargetXPath() <em>Target XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetXPath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty targetXPath;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<XQueryVariable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected XQueryMediatorImpl() {
		super();
		
		// Query key.
		RegistryKeyProperty queryKey = getEsbFactory().createRegistryKeyProperty();
		queryKey.setPrettyName("XQuery Key");
		queryKey.setKeyName("key");
		queryKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setQueryKey(queryKey);
		
		// Target XPath.
		NamespacedProperty targetXPath = getEsbFactory().createNamespacedProperty();
		targetXPath.setPrettyName("Target XPath");
		targetXPath.setPropertyName("target");
		setTargetXPath(targetXPath);
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		// Query key.
		if (self.hasAttribute("key")) {
			getQueryKey().load(self);
		} else {
			throw new Exception("An xquery mediator must have a query key property.");
		}
		
		// Target XPath.
		if (self.hasAttribute("target")) {
			getTargetXPath().load(self);
		}
		
		// Variables.
		loadObjects(self, "variable", XQueryVariable.class, new ObjectHandler<XQueryVariable>() {
			public void handle(XQueryVariable object) {
				getVariables().add(object);				
			}			
		});
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "xquery");
		
		// Query key.
		getQueryKey().save(self);
		
		// Target XPath.
		if (!StringUtils.isBlank(getTargetXPath().getPropertyValue())) {
			getTargetXPath().save(self);
		}
		
		// Variables.
		for (XQueryVariable variable : getVariables()) {
			variable.save(self);
		}
		
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.XQUERY_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getQueryKey() {
		return queryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryKey(RegistryKeyProperty newQueryKey, NotificationChain msgs) {
		RegistryKeyProperty oldQueryKey = queryKey;
		queryKey = newQueryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY, oldQueryKey, newQueryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryKey(RegistryKeyProperty newQueryKey) {
		if (newQueryKey != queryKey) {
			NotificationChain msgs = null;
			if (queryKey != null)
				msgs = ((InternalEObject)queryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY, null, msgs);
			if (newQueryKey != null)
				msgs = ((InternalEObject)newQueryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY, null, msgs);
			msgs = basicSetQueryKey(newQueryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY, newQueryKey, newQueryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getTargetXPath() {
		return targetXPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetXPath(NamespacedProperty newTargetXPath, NotificationChain msgs) {
		NamespacedProperty oldTargetXPath = targetXPath;
		targetXPath = newTargetXPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH, oldTargetXPath, newTargetXPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetXPath(NamespacedProperty newTargetXPath) {
		if (newTargetXPath != targetXPath) {
			NotificationChain msgs = null;
			if (targetXPath != null)
				msgs = ((InternalEObject)targetXPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH, null, msgs);
			if (newTargetXPath != null)
				msgs = ((InternalEObject)newTargetXPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH, null, msgs);
			msgs = basicSetTargetXPath(newTargetXPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH, newTargetXPath, newTargetXPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XQueryVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<XQueryVariable>(XQueryVariable.class, this, MediatorPackage.XQUERY_MEDIATOR__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY:
				return basicSetQueryKey(null, msgs);
			case MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH:
				return basicSetTargetXPath(null, msgs);
			case MediatorPackage.XQUERY_MEDIATOR__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY:
				return getQueryKey();
			case MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH:
				return getTargetXPath();
			case MediatorPackage.XQUERY_MEDIATOR__VARIABLES:
				return getVariables();
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
			case MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY:
				setQueryKey((RegistryKeyProperty)newValue);
				return;
			case MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH:
				setTargetXPath((NamespacedProperty)newValue);
				return;
			case MediatorPackage.XQUERY_MEDIATOR__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends XQueryVariable>)newValue);
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
			case MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY:
				setQueryKey((RegistryKeyProperty)null);
				return;
			case MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH:
				setTargetXPath((NamespacedProperty)null);
				return;
			case MediatorPackage.XQUERY_MEDIATOR__VARIABLES:
				getVariables().clear();
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
			case MediatorPackage.XQUERY_MEDIATOR__QUERY_KEY:
				return queryKey != null;
			case MediatorPackage.XQUERY_MEDIATOR__TARGET_XPATH:
				return targetXPath != null;
			case MediatorPackage.XQUERY_MEDIATOR__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XQueryMediatorImpl
