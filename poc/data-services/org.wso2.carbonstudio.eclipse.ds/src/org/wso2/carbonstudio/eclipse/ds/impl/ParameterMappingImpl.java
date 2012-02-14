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
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Parameter Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl#getParameterName
 * <em>Parameter Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl#getColumnName
 * <em>Column Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl#getQueryParam
 * <em>Query Param</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterMappingImpl extends EObjectImpl implements ParameterMapping {
	/**
	 * The default value of the '{@link #getParameterName()
	 * <em>Parameter Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName()
	 * <em>Parameter Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.PARAMETER_MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.PARAMETER_MAPPING__PARAMETER_NAME, oldParameterName, parameterName));
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
					DsPackage.PARAMETER_MAPPING__COLUMN_NAME, oldColumnName, columnName));
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
					DsPackage.PARAMETER_MAPPING__QUERY_PARAM, oldQueryParam, queryParam));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.PARAMETER_MAPPING__PARAMETER_NAME:
			return getParameterName();
		case DsPackage.PARAMETER_MAPPING__COLUMN_NAME:
			return getColumnName();
		case DsPackage.PARAMETER_MAPPING__QUERY_PARAM:
			return getQueryParam();
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
		case DsPackage.PARAMETER_MAPPING__PARAMETER_NAME:
			setParameterName((String) newValue);
			return;
		case DsPackage.PARAMETER_MAPPING__COLUMN_NAME:
			setColumnName((String) newValue);
			return;
		case DsPackage.PARAMETER_MAPPING__QUERY_PARAM:
			setQueryParam((String) newValue);
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
		case DsPackage.PARAMETER_MAPPING__PARAMETER_NAME:
			setParameterName(PARAMETER_NAME_EDEFAULT);
			return;
		case DsPackage.PARAMETER_MAPPING__COLUMN_NAME:
			setColumnName(COLUMN_NAME_EDEFAULT);
			return;
		case DsPackage.PARAMETER_MAPPING__QUERY_PARAM:
			setQueryParam(QUERY_PARAM_EDEFAULT);
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
		case DsPackage.PARAMETER_MAPPING__PARAMETER_NAME:
			return PARAMETER_NAME_EDEFAULT == null ? parameterName != null
					: !PARAMETER_NAME_EDEFAULT.equals(parameterName);
		case DsPackage.PARAMETER_MAPPING__COLUMN_NAME:
			return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT
					.equals(columnName);
		case DsPackage.PARAMETER_MAPPING__QUERY_PARAM:
			return QUERY_PARAM_EDEFAULT == null ? queryParam != null : !QUERY_PARAM_EDEFAULT
					.equals(queryParam);
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
		result.append(" (parameterName: ");
		result.append(parameterName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", queryParam: ");
		result.append(queryParam);
		result.append(')');
		return result.toString();
	}

} // ParameterMappingImpl
