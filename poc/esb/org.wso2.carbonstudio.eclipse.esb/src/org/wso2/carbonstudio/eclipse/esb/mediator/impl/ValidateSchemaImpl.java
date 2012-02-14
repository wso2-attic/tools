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
import org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema;
import org.wso2.carbonstudio.eclipse.platform.core.mediatype.PlatformMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateSchemaImpl#getSchemaKey <em>Schema Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidateSchemaImpl extends ModelObjectImpl implements ValidateSchema {
	/**
	 * The cached value of the '{@link #getSchemaKey() <em>Schema Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty schemaKey;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ValidateSchemaImpl() {
		super();
		
		// Schema key.
		RegistryKeyProperty schemaKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only sequences media type
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)schemaKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, PlatformMediaTypeConstants.MEDIA_TYPE_XSD);

		schemaKey.setPrettyName("Validate Schema");
		schemaKey.setKeyName("key");
		schemaKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setSchemaKey(schemaKey);
	}

	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		getSchemaKey().load(self);
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "schema");
		getSchemaKey().save(self);
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.VALIDATE_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getSchemaKey() {
		return schemaKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaKey(RegistryKeyProperty newSchemaKey, NotificationChain msgs) {
		RegistryKeyProperty oldSchemaKey = schemaKey;
		schemaKey = newSchemaKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY, oldSchemaKey, newSchemaKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaKey(RegistryKeyProperty newSchemaKey) {
		if (newSchemaKey != schemaKey) {
			NotificationChain msgs = null;
			if (schemaKey != null)
				msgs = ((InternalEObject)schemaKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY, null, msgs);
			if (newSchemaKey != null)
				msgs = ((InternalEObject)newSchemaKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY, null, msgs);
			msgs = basicSetSchemaKey(newSchemaKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY, newSchemaKey, newSchemaKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY:
				return basicSetSchemaKey(null, msgs);
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
			case MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY:
				return getSchemaKey();
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
			case MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY:
				setSchemaKey((RegistryKeyProperty)newValue);
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
			case MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY:
				setSchemaKey((RegistryKeyProperty)null);
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
			case MediatorPackage.VALIDATE_SCHEMA__SCHEMA_KEY:
				return schemaKey != null;
		}
		return super.eIsSet(featureID);
	}

} // ValidateSchemaImpl
