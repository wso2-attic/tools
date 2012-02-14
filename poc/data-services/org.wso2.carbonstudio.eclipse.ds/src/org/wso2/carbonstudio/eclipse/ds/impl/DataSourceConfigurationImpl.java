/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Source Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl#getConfigurationProperties
 * <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DataSourceConfigurationImpl extends EObjectImpl implements DataSourceConfiguration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurationProperties()
	 * <em>Configuration Properties</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfigurationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProperty> configurationProperties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DataSourceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.DATA_SOURCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.DATA_SOURCE_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ConfigurationProperty> getConfigurationProperties() {
		if (configurationProperties == null) {
			configurationProperties = new EObjectContainmentEList<ConfigurationProperty>(
					ConfigurationProperty.class, this,
					DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES);
		}
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES:
			return ((InternalEList<?>) getConfigurationProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.DATA_SOURCE_CONFIGURATION__ID:
			return getId();
		case DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES:
			return getConfigurationProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.DATA_SOURCE_CONFIGURATION__ID:
			setId((String) newValue);
			return;
		case DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES:
			getConfigurationProperties().clear();
			getConfigurationProperties().addAll(
					(Collection<? extends ConfigurationProperty>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DsPackage.DATA_SOURCE_CONFIGURATION__ID:
			setId(ID_EDEFAULT);
			return;
		case DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES:
			getConfigurationProperties().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DsPackage.DATA_SOURCE_CONFIGURATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DsPackage.DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES:
			return configurationProperties != null && !configurationProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // DataSourceConfigurationImpl
