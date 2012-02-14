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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Attribute Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl#getAttributeName
 * <em>Attribute Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl#getColumnName
 * <em>Column Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl#getQueryParam
 * <em>Query Param</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl#getRequiredRoles
 * <em>Required Roles</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl#getXsdType
 * <em>Xsd Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AttributeMappingImpl extends EObjectImpl implements AttributeMapping {
	/**
	 * The default value of the '{@link #getAttributeName()
	 * <em>Attribute Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName()
	 * <em>Attribute Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryParam() <em>Query Param</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQueryParam()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryParam() <em>Query Param</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQueryParam()
	 * @generated
	 * @ordered
	 */
	protected String queryParam = QUERY_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredRoles()
	 * <em>Required Roles</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredRoles()
	 * <em>Required Roles</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected String requiredRoles = REQUIRED_ROLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getXsdType() <em>Xsd Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdType() <em>Xsd Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected String xsdType = XSD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AttributeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.ATTRIBUTE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getQueryParam() {
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setQueryParam(String newQueryParam) {
		String oldQueryParam = queryParam;
		queryParam = newQueryParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM, oldQueryParam, queryParam));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRequiredRoles() {
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequiredRoles(String newRequiredRoles) {
		String oldRequiredRoles = requiredRoles;
		requiredRoles = newRequiredRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES, oldRequiredRoles, requiredRoles));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getXsdType() {
		return xsdType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setXsdType(String newXsdType) {
		String oldXsdType = xsdType;
		xsdType = newXsdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE, oldXsdType, xsdType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME:
			return getAttributeName();
		case DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME:
			return getColumnName();
		case DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM:
			return getQueryParam();
		case DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES:
			return getRequiredRoles();
		case DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE:
			return getXsdType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME:
			setAttributeName((String) newValue);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME:
			setColumnName((String) newValue);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM:
			setQueryParam((String) newValue);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES:
			setRequiredRoles((String) newValue);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE:
			setXsdType((String) newValue);
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
		case DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME:
			setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME:
			setColumnName(COLUMN_NAME_EDEFAULT);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM:
			setQueryParam(QUERY_PARAM_EDEFAULT);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES:
			setRequiredRoles(REQUIRED_ROLES_EDEFAULT);
			return;
		case DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE:
			setXsdType(XSD_TYPE_EDEFAULT);
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
		case DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME:
			return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null
					: !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
		case DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME:
			return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT
					.equals(columnName);
		case DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM:
			return QUERY_PARAM_EDEFAULT == null ? queryParam != null : !QUERY_PARAM_EDEFAULT
					.equals(queryParam);
		case DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES:
			return REQUIRED_ROLES_EDEFAULT == null ? requiredRoles != null
					: !REQUIRED_ROLES_EDEFAULT.equals(requiredRoles);
		case DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE:
			return XSD_TYPE_EDEFAULT == null ? xsdType != null : !XSD_TYPE_EDEFAULT.equals(xsdType);
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", queryParam: ");
		result.append(queryParam);
		result.append(", requiredRoles: ");
		result.append(requiredRoles);
		result.append(", xsdType: ");
		result.append(xsdType);
		result.append(')');
		return result.toString();
	}

} // AttributeMappingImpl
