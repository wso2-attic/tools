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
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Query</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getId <em>Id</em>}
 * </li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getInputTriggerName
 * <em>Input Trigger Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getOutputTriggerName
 * <em>Output Trigger Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getDataSourceId
 * <em>Data Source Id</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getSqlStatement
 * <em>Sql Statement</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getPropertiesList
 * <em>Properties List</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getResultMapping
 * <em>Result Mapping</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getExcelQueries
 * <em>Excel Queries</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getGspreadQueries
 * <em>Gspread Queries</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getQueryParameters
 * <em>Query Parameters</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#isReturnRowId <em>
 * Return Row Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
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
	 * The default value of the '{@link #getInputTriggerName()
	 * <em>Input Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInputTriggerName()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TRIGGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputTriggerName()
	 * <em>Input Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInputTriggerName()
	 * @generated
	 * @ordered
	 */
	protected String inputTriggerName = INPUT_TRIGGER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputTriggerName()
	 * <em>Output Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutputTriggerName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_TRIGGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputTriggerName()
	 * <em>Output Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutputTriggerName()
	 * @generated
	 * @ordered
	 */
	protected String outputTriggerName = OUTPUT_TRIGGER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceId()
	 * <em>Data Source Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceId()
	 * <em>Data Source Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlStatement()
	 * <em>Sql Statement</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlStatement()
	 * <em>Sql Statement</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String sqlStatement = SQL_STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertiesList()
	 * <em>Properties List</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertiesList()
	 * @generated
	 * @ordered
	 */
	protected QueryPropertyList propertiesList;

	/**
	 * The cached value of the '{@link #getResultMapping()
	 * <em>Result Mapping</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResultMapping()
	 * @generated
	 * @ordered
	 */
	protected ResultMapping resultMapping;

	/**
	 * The cached value of the '{@link #getExcelQueries()
	 * <em>Excel Queries</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExcelQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcelQuery> excelQueries;

	/**
	 * The cached value of the '{@link #getGspreadQueries()
	 * <em>Gspread Queries</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGspreadQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<GSpreadQuery> gspreadQueries;

	/**
	 * The cached value of the '{@link #getQueryParameters()
	 * <em>Query Parameters</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQueryParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParameter> queryParameters;

	/**
	 * The default value of the '{@link #isReturnRowId() <em>Return Row Id</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isReturnRowId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_ROW_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnRowId() <em>Return Row Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isReturnRowId()
	 * @generated
	 * @ordered
	 */
	protected boolean returnRowId = RETURN_ROW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.QUERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getInputTriggerName() {
		return inputTriggerName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInputTriggerName(String newInputTriggerName) {
		String oldInputTriggerName = inputTriggerName;
		inputTriggerName = newInputTriggerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY__INPUT_TRIGGER_NAME, oldInputTriggerName, inputTriggerName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOutputTriggerName() {
		return outputTriggerName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutputTriggerName(String newOutputTriggerName) {
		String oldOutputTriggerName = outputTriggerName;
		outputTriggerName = newOutputTriggerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY__OUTPUT_TRIGGER_NAME, oldOutputTriggerName, outputTriggerName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDataSourceId(String newDataSourceId) {
		String oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__DATA_SOURCE_ID,
					oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSqlStatement() {
		return sqlStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSqlStatement(String newSqlStatement) {
		String oldSqlStatement = sqlStatement;
		sqlStatement = newSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__SQL_STATEMENT,
					oldSqlStatement, sqlStatement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryPropertyList getPropertiesList() {
		return propertiesList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPropertiesList(QueryPropertyList newPropertiesList,
			NotificationChain msgs) {
		QueryPropertyList oldPropertiesList = propertiesList;
		propertiesList = newPropertiesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY__PROPERTIES_LIST, oldPropertiesList, newPropertiesList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPropertiesList(QueryPropertyList newPropertiesList) {
		if (newPropertiesList != propertiesList) {
			NotificationChain msgs = null;
			if (propertiesList != null)
				msgs = ((InternalEObject) propertiesList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY__PROPERTIES_LIST, null, msgs);
			if (newPropertiesList != null)
				msgs = ((InternalEObject) newPropertiesList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY__PROPERTIES_LIST, null, msgs);
			msgs = basicSetPropertiesList(newPropertiesList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__PROPERTIES_LIST,
					newPropertiesList, newPropertiesList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResultMapping getResultMapping() {
		return resultMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResultMapping(ResultMapping newResultMapping,
			NotificationChain msgs) {
		ResultMapping oldResultMapping = resultMapping;
		resultMapping = newResultMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY__RESULT_MAPPING, oldResultMapping, newResultMapping);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResultMapping(ResultMapping newResultMapping) {
		if (newResultMapping != resultMapping) {
			NotificationChain msgs = null;
			if (resultMapping != null)
				msgs = ((InternalEObject) resultMapping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY__RESULT_MAPPING, null, msgs);
			if (newResultMapping != null)
				msgs = ((InternalEObject) newResultMapping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY__RESULT_MAPPING, null, msgs);
			msgs = basicSetResultMapping(newResultMapping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__RESULT_MAPPING,
					newResultMapping, newResultMapping));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExcelQuery> getExcelQueries() {
		if (excelQueries == null) {
			excelQueries = new EObjectContainmentEList<ExcelQuery>(ExcelQuery.class, this,
					DsPackage.QUERY__EXCEL_QUERIES);
		}
		return excelQueries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GSpreadQuery> getGspreadQueries() {
		if (gspreadQueries == null) {
			gspreadQueries = new EObjectContainmentEList<GSpreadQuery>(GSpreadQuery.class, this,
					DsPackage.QUERY__GSPREAD_QUERIES);
		}
		return gspreadQueries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<QueryParameter> getQueryParameters() {
		if (queryParameters == null) {
			queryParameters = new EObjectContainmentEList<QueryParameter>(QueryParameter.class,
					this, DsPackage.QUERY__QUERY_PARAMETERS);
		}
		return queryParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isReturnRowId() {
		return returnRowId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReturnRowId(boolean newReturnRowId) {
		boolean oldReturnRowId = returnRowId;
		returnRowId = newReturnRowId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__RETURN_ROW_ID,
					oldReturnRowId, returnRowId));
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
		case DsPackage.QUERY__PROPERTIES_LIST:
			return basicSetPropertiesList(null, msgs);
		case DsPackage.QUERY__RESULT_MAPPING:
			return basicSetResultMapping(null, msgs);
		case DsPackage.QUERY__EXCEL_QUERIES:
			return ((InternalEList<?>) getExcelQueries()).basicRemove(otherEnd, msgs);
		case DsPackage.QUERY__GSPREAD_QUERIES:
			return ((InternalEList<?>) getGspreadQueries()).basicRemove(otherEnd, msgs);
		case DsPackage.QUERY__QUERY_PARAMETERS:
			return ((InternalEList<?>) getQueryParameters()).basicRemove(otherEnd, msgs);
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
		case DsPackage.QUERY__ID:
			return getId();
		case DsPackage.QUERY__INPUT_TRIGGER_NAME:
			return getInputTriggerName();
		case DsPackage.QUERY__OUTPUT_TRIGGER_NAME:
			return getOutputTriggerName();
		case DsPackage.QUERY__DATA_SOURCE_ID:
			return getDataSourceId();
		case DsPackage.QUERY__SQL_STATEMENT:
			return getSqlStatement();
		case DsPackage.QUERY__PROPERTIES_LIST:
			return getPropertiesList();
		case DsPackage.QUERY__RESULT_MAPPING:
			return getResultMapping();
		case DsPackage.QUERY__EXCEL_QUERIES:
			return getExcelQueries();
		case DsPackage.QUERY__GSPREAD_QUERIES:
			return getGspreadQueries();
		case DsPackage.QUERY__QUERY_PARAMETERS:
			return getQueryParameters();
		case DsPackage.QUERY__RETURN_ROW_ID:
			return isReturnRowId();
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
		case DsPackage.QUERY__ID:
			setId((String) newValue);
			return;
		case DsPackage.QUERY__INPUT_TRIGGER_NAME:
			setInputTriggerName((String) newValue);
			return;
		case DsPackage.QUERY__OUTPUT_TRIGGER_NAME:
			setOutputTriggerName((String) newValue);
			return;
		case DsPackage.QUERY__DATA_SOURCE_ID:
			setDataSourceId((String) newValue);
			return;
		case DsPackage.QUERY__SQL_STATEMENT:
			setSqlStatement((String) newValue);
			return;
		case DsPackage.QUERY__PROPERTIES_LIST:
			setPropertiesList((QueryPropertyList) newValue);
			return;
		case DsPackage.QUERY__RESULT_MAPPING:
			setResultMapping((ResultMapping) newValue);
			return;
		case DsPackage.QUERY__EXCEL_QUERIES:
			getExcelQueries().clear();
			getExcelQueries().addAll((Collection<? extends ExcelQuery>) newValue);
			return;
		case DsPackage.QUERY__GSPREAD_QUERIES:
			getGspreadQueries().clear();
			getGspreadQueries().addAll((Collection<? extends GSpreadQuery>) newValue);
			return;
		case DsPackage.QUERY__QUERY_PARAMETERS:
			getQueryParameters().clear();
			getQueryParameters().addAll((Collection<? extends QueryParameter>) newValue);
			return;
		case DsPackage.QUERY__RETURN_ROW_ID:
			setReturnRowId((Boolean) newValue);
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
		case DsPackage.QUERY__ID:
			setId(ID_EDEFAULT);
			return;
		case DsPackage.QUERY__INPUT_TRIGGER_NAME:
			setInputTriggerName(INPUT_TRIGGER_NAME_EDEFAULT);
			return;
		case DsPackage.QUERY__OUTPUT_TRIGGER_NAME:
			setOutputTriggerName(OUTPUT_TRIGGER_NAME_EDEFAULT);
			return;
		case DsPackage.QUERY__DATA_SOURCE_ID:
			setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
			return;
		case DsPackage.QUERY__SQL_STATEMENT:
			setSqlStatement(SQL_STATEMENT_EDEFAULT);
			return;
		case DsPackage.QUERY__PROPERTIES_LIST:
			setPropertiesList((QueryPropertyList) null);
			return;
		case DsPackage.QUERY__RESULT_MAPPING:
			setResultMapping((ResultMapping) null);
			return;
		case DsPackage.QUERY__EXCEL_QUERIES:
			getExcelQueries().clear();
			return;
		case DsPackage.QUERY__GSPREAD_QUERIES:
			getGspreadQueries().clear();
			return;
		case DsPackage.QUERY__QUERY_PARAMETERS:
			getQueryParameters().clear();
			return;
		case DsPackage.QUERY__RETURN_ROW_ID:
			setReturnRowId(RETURN_ROW_ID_EDEFAULT);
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
		case DsPackage.QUERY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DsPackage.QUERY__INPUT_TRIGGER_NAME:
			return INPUT_TRIGGER_NAME_EDEFAULT == null ? inputTriggerName != null
					: !INPUT_TRIGGER_NAME_EDEFAULT.equals(inputTriggerName);
		case DsPackage.QUERY__OUTPUT_TRIGGER_NAME:
			return OUTPUT_TRIGGER_NAME_EDEFAULT == null ? outputTriggerName != null
					: !OUTPUT_TRIGGER_NAME_EDEFAULT.equals(outputTriggerName);
		case DsPackage.QUERY__DATA_SOURCE_ID:
			return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null
					: !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
		case DsPackage.QUERY__SQL_STATEMENT:
			return SQL_STATEMENT_EDEFAULT == null ? sqlStatement != null : !SQL_STATEMENT_EDEFAULT
					.equals(sqlStatement);
		case DsPackage.QUERY__PROPERTIES_LIST:
			return propertiesList != null;
		case DsPackage.QUERY__RESULT_MAPPING:
			return resultMapping != null;
		case DsPackage.QUERY__EXCEL_QUERIES:
			return excelQueries != null && !excelQueries.isEmpty();
		case DsPackage.QUERY__GSPREAD_QUERIES:
			return gspreadQueries != null && !gspreadQueries.isEmpty();
		case DsPackage.QUERY__QUERY_PARAMETERS:
			return queryParameters != null && !queryParameters.isEmpty();
		case DsPackage.QUERY__RETURN_ROW_ID:
			return returnRowId != RETURN_ROW_ID_EDEFAULT;
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
		result.append(", inputTriggerName: ");
		result.append(inputTriggerName);
		result.append(", outputTriggerName: ");
		result.append(outputTriggerName);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", sqlStatement: ");
		result.append(sqlStatement);
		result.append(", returnRowId: ");
		result.append(returnRowId);
		result.append(')');
		return result.toString();
	}

} // QueryImpl
