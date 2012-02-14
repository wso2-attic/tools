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

import static org.wso2.carbonstudio.eclipse.ds.DsPackage.RESOURCE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DocumentRoot;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryProperty;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;
import org.wso2.carbonstudio.eclipse.ds.ServiceStatus;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DsPackageImpl extends EPackageImpl implements DsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass callQueryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass callQueryListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass configurationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass customValidatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataSourceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass doubleRangeValidatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eventSubscriptionListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass excelQueryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gSpreadQueryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass longRangeValidatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass patternValidatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass queryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass queryPropertyListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resultMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType serviceStatusObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsPackageImpl() {
		super(eNS_URI, DsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link DsPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsPackage init() {
		if (isInited)
			return (DsPackage) EPackage.Registry.INSTANCE.getEPackage(DsPackage.eNS_URI);

		// Obtain or create and register package
		DsPackageImpl theDsPackage = (DsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDsPackage.createPackageContents();

		// Initialize created meta-data
		theDsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsPackage.eNS_URI, theDsPackage);
		return theDsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeMapping_AttributeName() {
		return (EAttribute) attributeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeMapping_ColumnName() {
		return (EAttribute) attributeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeMapping_QueryParam() {
		return (EAttribute) attributeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeMapping_RequiredRoles() {
		return (EAttribute) attributeMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeMapping_XsdType() {
		return (EAttribute) attributeMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCallQuery() {
		return callQueryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCallQuery_Href() {
		return (EAttribute) callQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCallQuery_ParameterMappings() {
		return (EReference) callQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCallQueryList() {
		return callQueryListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCallQueryList_Queries() {
		return (EReference) callQueryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConfigurationProperty() {
		return configurationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Name() {
		return (EAttribute) configurationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Value() {
		return (EAttribute) configurationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCustomValidator() {
		return customValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCustomValidator_ClassName() {
		return (EAttribute) customValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_Name() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_Description() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_BaseURI() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_EnableBatchRequests() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_EnableBoxcarring() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataService_ServiceStatus() {
		return (EAttribute) dataServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataService_DataSources() {
		return (EReference) dataServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataService_Queries() {
		return (EReference) dataServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataService_EventTriggers() {
		return (EReference) dataServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataService_Operations() {
		return (EReference) dataServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataService_Resources() {
		return (EReference) dataServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataSourceConfiguration() {
		return dataSourceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataSourceConfiguration_Id() {
		return (EAttribute) dataSourceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataSourceConfiguration_ConfigurationProperties() {
		return (EReference) dataSourceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_Data() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDoubleRangeValidator() {
		return doubleRangeValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDoubleRangeValidator_MinValue() {
		return (EAttribute) doubleRangeValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDoubleRangeValidator_MaxValue() {
		return (EAttribute) doubleRangeValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElementMapping() {
		return elementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementMapping_ElementName() {
		return (EAttribute) elementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementMapping_ColumnName() {
		return (EAttribute) elementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementMapping_QueryParam() {
		return (EAttribute) elementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementMapping_RequiredRoles() {
		return (EAttribute) elementMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementMapping_XsdType() {
		return (EAttribute) elementMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEventSubscriptionList() {
		return eventSubscriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEventSubscriptionList_Subscriptions() {
		return (EAttribute) eventSubscriptionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEventTrigger() {
		return eventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEventTrigger_Id() {
		return (EAttribute) eventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEventTrigger_Expression() {
		return (EAttribute) eventTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEventTrigger_TargetTopic() {
		return (EAttribute) eventTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEventTrigger_SubscriptionsList() {
		return (EReference) eventTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEventTrigger_Language() {
		return (EAttribute) eventTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExcelQuery() {
		return excelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExcelQuery_WorkbookName() {
		return (EAttribute) excelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExcelQuery_StartingRow() {
		return (EAttribute) excelQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExcelQuery_MaxRowCount() {
		return (EAttribute) excelQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExcelQuery_HasHeader() {
		return (EAttribute) excelQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGSpreadQuery() {
		return gSpreadQueryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGSpreadQuery_WorksheetNumber() {
		return (EAttribute) gSpreadQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGSpreadQuery_StartingRow() {
		return (EAttribute) gSpreadQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGSpreadQuery_MaxRowCount() {
		return (EAttribute) gSpreadQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGSpreadQuery_HasHeader() {
		return (EAttribute) gSpreadQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLengthValidator() {
		return lengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLengthValidator_MinValue() {
		return (EAttribute) lengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLengthValidator_MaxValue() {
		return (EAttribute) lengthValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLongRangeValidator() {
		return longRangeValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLongRangeValidator_MinValue() {
		return (EAttribute) longRangeValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLongRangeValidator_MaxValue() {
		return (EAttribute) longRangeValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperation_CallQuery() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperation_CallQueryList() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getParameterMapping() {
		return parameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterMapping_ParameterName() {
		return (EAttribute) parameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterMapping_ColumnName() {
		return (EAttribute) parameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterMapping_QueryParam() {
		return (EAttribute) parameterMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPatternValidator() {
		return patternValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPatternValidator_PatternString() {
		return (EAttribute) patternValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_Id() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_InputTriggerName() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_OutputTriggerName() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_DataSourceId() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_SqlStatement() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuery_PropertiesList() {
		return (EReference) queryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuery_ResultMapping() {
		return (EReference) queryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuery_ExcelQueries() {
		return (EReference) queryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuery_GspreadQueries() {
		return (EReference) queryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuery_QueryParameters() {
		return (EReference) queryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQuery_ReturnRowId() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_Name() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_Type() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_SqlType() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_DefaultValue() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_Ordinal() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryParameter_ParamType() {
		return (EAttribute) queryParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryParameter_LongRangeValidator() {
		return (EReference) queryParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryParameter_DoubleRangeValidator() {
		return (EReference) queryParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryParameter_LengthValidator() {
		return (EReference) queryParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryParameter_PatternValidators() {
		return (EReference) queryParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryParameter_CustomValidators() {
		return (EReference) queryParameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getQueryProperty() {
		return queryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryProperty_Name() {
		return (EAttribute) queryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getQueryProperty_Value() {
		return (EAttribute) queryPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getQueryPropertyList() {
		return queryPropertyListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQueryPropertyList_Properties() {
		return (EReference) queryPropertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResource_Method() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResource_Path() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResource_CallQuery() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResource_CallQueryList() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResultMapping() {
		return resultMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResultMapping_ElementName() {
		return (EAttribute) resultMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResultMapping_RowName() {
		return (EAttribute) resultMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResultMapping_DefaultNamespace() {
		return (EAttribute) resultMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResultMapping_XsltPath() {
		return (EAttribute) resultMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResultMapping_OutputType() {
		return (EAttribute) resultMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResultMapping_ElementMappings() {
		return (EReference) resultMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResultMapping_AttributeMappings() {
		return (EReference) resultMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResultMapping_CallQueries() {
		return (EReference) resultMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getServiceStatusObject() {
		return serviceStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DsFactory getDsFactory() {
		return (DsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__ATTRIBUTE_NAME);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__COLUMN_NAME);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__QUERY_PARAM);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__REQUIRED_ROLES);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__XSD_TYPE);

		callQueryEClass = createEClass(CALL_QUERY);
		createEAttribute(callQueryEClass, CALL_QUERY__HREF);
		createEReference(callQueryEClass, CALL_QUERY__PARAMETER_MAPPINGS);

		callQueryListEClass = createEClass(CALL_QUERY_LIST);
		createEReference(callQueryListEClass, CALL_QUERY_LIST__QUERIES);

		configurationPropertyEClass = createEClass(CONFIGURATION_PROPERTY);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__NAME);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__VALUE);

		customValidatorEClass = createEClass(CUSTOM_VALIDATOR);
		createEAttribute(customValidatorEClass, CUSTOM_VALIDATOR__CLASS_NAME);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEAttribute(dataServiceEClass, DATA_SERVICE__NAME);
		createEAttribute(dataServiceEClass, DATA_SERVICE__DESCRIPTION);
		createEAttribute(dataServiceEClass, DATA_SERVICE__BASE_URI);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENABLE_BATCH_REQUESTS);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENABLE_BOXCARRING);
		createEAttribute(dataServiceEClass, DATA_SERVICE__SERVICE_STATUS);
		createEReference(dataServiceEClass, DATA_SERVICE__DATA_SOURCES);
		createEReference(dataServiceEClass, DATA_SERVICE__QUERIES);
		createEReference(dataServiceEClass, DATA_SERVICE__EVENT_TRIGGERS);
		createEReference(dataServiceEClass, DATA_SERVICE__OPERATIONS);
		createEReference(dataServiceEClass, DATA_SERVICE__RESOURCES);

		dataSourceConfigurationEClass = createEClass(DATA_SOURCE_CONFIGURATION);
		createEAttribute(dataSourceConfigurationEClass, DATA_SOURCE_CONFIGURATION__ID);
		createEReference(dataSourceConfigurationEClass,
				DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA);

		doubleRangeValidatorEClass = createEClass(DOUBLE_RANGE_VALIDATOR);
		createEAttribute(doubleRangeValidatorEClass, DOUBLE_RANGE_VALIDATOR__MIN_VALUE);
		createEAttribute(doubleRangeValidatorEClass, DOUBLE_RANGE_VALIDATOR__MAX_VALUE);

		elementMappingEClass = createEClass(ELEMENT_MAPPING);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__ELEMENT_NAME);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__COLUMN_NAME);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__QUERY_PARAM);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__REQUIRED_ROLES);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__XSD_TYPE);

		eventSubscriptionListEClass = createEClass(EVENT_SUBSCRIPTION_LIST);
		createEAttribute(eventSubscriptionListEClass, EVENT_SUBSCRIPTION_LIST__SUBSCRIPTIONS);

		eventTriggerEClass = createEClass(EVENT_TRIGGER);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__ID);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__EXPRESSION);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__TARGET_TOPIC);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__SUBSCRIPTIONS_LIST);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__LANGUAGE);

		excelQueryEClass = createEClass(EXCEL_QUERY);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__WORKBOOK_NAME);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__STARTING_ROW);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__MAX_ROW_COUNT);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__HAS_HEADER);

		gSpreadQueryEClass = createEClass(GSPREAD_QUERY);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__WORKSHEET_NUMBER);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__STARTING_ROW);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__MAX_ROW_COUNT);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__HAS_HEADER);

		lengthValidatorEClass = createEClass(LENGTH_VALIDATOR);
		createEAttribute(lengthValidatorEClass, LENGTH_VALIDATOR__MIN_VALUE);
		createEAttribute(lengthValidatorEClass, LENGTH_VALIDATOR__MAX_VALUE);

		longRangeValidatorEClass = createEClass(LONG_RANGE_VALIDATOR);
		createEAttribute(longRangeValidatorEClass, LONG_RANGE_VALIDATOR__MIN_VALUE);
		createEAttribute(longRangeValidatorEClass, LONG_RANGE_VALIDATOR__MAX_VALUE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__CALL_QUERY);
		createEReference(operationEClass, OPERATION__CALL_QUERY_LIST);

		parameterMappingEClass = createEClass(PARAMETER_MAPPING);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__PARAMETER_NAME);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__COLUMN_NAME);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__QUERY_PARAM);

		patternValidatorEClass = createEClass(PATTERN_VALIDATOR);
		createEAttribute(patternValidatorEClass, PATTERN_VALIDATOR__PATTERN_STRING);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__ID);
		createEAttribute(queryEClass, QUERY__INPUT_TRIGGER_NAME);
		createEAttribute(queryEClass, QUERY__OUTPUT_TRIGGER_NAME);
		createEAttribute(queryEClass, QUERY__DATA_SOURCE_ID);
		createEAttribute(queryEClass, QUERY__SQL_STATEMENT);
		createEReference(queryEClass, QUERY__PROPERTIES_LIST);
		createEReference(queryEClass, QUERY__RESULT_MAPPING);
		createEReference(queryEClass, QUERY__EXCEL_QUERIES);
		createEReference(queryEClass, QUERY__GSPREAD_QUERIES);
		createEReference(queryEClass, QUERY__QUERY_PARAMETERS);
		createEAttribute(queryEClass, QUERY__RETURN_ROW_ID);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__NAME);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__TYPE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__SQL_TYPE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__DEFAULT_VALUE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__ORDINAL);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__PARAM_TYPE);
		createEReference(queryParameterEClass, QUERY_PARAMETER__LONG_RANGE_VALIDATOR);
		createEReference(queryParameterEClass, QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR);
		createEReference(queryParameterEClass, QUERY_PARAMETER__LENGTH_VALIDATOR);
		createEReference(queryParameterEClass, QUERY_PARAMETER__PATTERN_VALIDATORS);
		createEReference(queryParameterEClass, QUERY_PARAMETER__CUSTOM_VALIDATORS);

		queryPropertyEClass = createEClass(QUERY_PROPERTY);
		createEAttribute(queryPropertyEClass, QUERY_PROPERTY__NAME);
		createEAttribute(queryPropertyEClass, QUERY_PROPERTY__VALUE);

		queryPropertyListEClass = createEClass(QUERY_PROPERTY_LIST);
		createEReference(queryPropertyListEClass, QUERY_PROPERTY_LIST__PROPERTIES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__METHOD);
		createEAttribute(resourceEClass, RESOURCE__PATH);
		createEReference(resourceEClass, RESOURCE__CALL_QUERY);
		createEReference(resourceEClass, RESOURCE__CALL_QUERY_LIST);

		resultMappingEClass = createEClass(RESULT_MAPPING);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__ELEMENT_NAME);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__ROW_NAME);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__DEFAULT_NAMESPACE);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__XSLT_PATH);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__OUTPUT_TYPE);
		createEReference(resultMappingEClass, RESULT_MAPPING__ELEMENT_MAPPINGS);
		createEReference(resultMappingEClass, RESULT_MAPPING__ATTRIBUTE_MAPPINGS);
		createEReference(resultMappingEClass, RESULT_MAPPING__CALL_QUERIES);

		// Create enums
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		serviceStatusObjectEDataType = createEDataType(SERVICE_STATUS_OBJECT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMapping_AttributeName(), theXMLTypePackage.getString(),
				"attributeName", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_ColumnName(), theXMLTypePackage.getString(),
				"columnName", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_QueryParam(), theXMLTypePackage.getString(),
				"queryParam", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_RequiredRoles(), theXMLTypePackage.getString(),
				"requiredRoles", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_XsdType(), theXMLTypePackage.getString(), "xsdType",
				null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callQueryEClass, CallQuery.class, "CallQuery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallQuery_Href(), theXMLTypePackage.getString(), "href", null, 1, 1,
				CallQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallQuery_ParameterMappings(), this.getParameterMapping(), null,
				"parameterMappings", null, 0, -1, CallQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(callQueryListEClass, CallQueryList.class, "CallQueryList", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallQueryList_Queries(), this.getCallQuery(), null, "queries", null, 1,
				-1, CallQueryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyEClass, ConfigurationProperty.class,
				"ConfigurationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationProperty_Name(), theXMLTypePackage.getString(), "name",
				null, 1, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Value(), theXMLTypePackage.getString(), "value",
				null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customValidatorEClass, CustomValidator.class, "CustomValidator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomValidator_ClassName(), theXMLTypePackage.getString(), "className",
				null, 1, 1, CustomValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataService_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_Description(), theXMLTypePackage.getString(), "description",
				null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_BaseURI(), theXMLTypePackage.getString(), "baseURI", null, 0,
				1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EnableBatchRequests(), theXMLTypePackage.getBoolean(),
				"enableBatchRequests", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EnableBoxcarring(), theXMLTypePackage.getBoolean(),
				"enableBoxcarring", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_ServiceStatus(), this.getServiceStatus(), "serviceStatus",
				null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_DataSources(), this.getDataSourceConfiguration(), null,
				"dataSources", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Queries(), this.getQuery(), null, "queries", null, 0, -1,
				DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_EventTriggers(), this.getEventTrigger(), null,
				"eventTriggers", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Operations(), this.getOperation(), null, "operations", null,
				0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Resources(), this.getResource(), null, "resources", null, 0,
				-1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceConfigurationEClass, DataSourceConfiguration.class,
				"DataSourceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceConfiguration_Id(), theXMLTypePackage.getString(), "id", null,
				1, 1, DataSourceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSourceConfiguration_ConfigurationProperties(),
				this.getConfigurationProperty(), null, "configurationProperties", null, 1, -1,
				DataSourceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null,
				0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(),
				null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(),
				ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1,
				null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Data(), this.getDataService(), null, "data", null, 0, -2,
				null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doubleRangeValidatorEClass, DoubleRangeValidator.class, "DoubleRangeValidator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleRangeValidator_MinValue(), theXMLTypePackage.getDouble(),
				"minValue", null, 0, 1, DoubleRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleRangeValidator_MaxValue(), theXMLTypePackage.getDouble(),
				"maxValue", null, 0, 1, DoubleRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementMappingEClass, ElementMapping.class, "ElementMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementMapping_ElementName(), theXMLTypePackage.getString(),
				"elementName", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_ColumnName(), theXMLTypePackage.getString(), "columnName",
				null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_QueryParam(), theXMLTypePackage.getString(), "queryParam",
				null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_RequiredRoles(), theXMLTypePackage.getString(),
				"requiredRoles", null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_XsdType(), theXMLTypePackage.getString(), "xsdType", null,
				0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSubscriptionListEClass, EventSubscriptionList.class,
				"EventSubscriptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventSubscriptionList_Subscriptions(), theXMLTypePackage.getString(),
				"subscriptions", null, 1, -1, EventSubscriptionList.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventTriggerEClass, EventTrigger.class, "EventTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventTrigger_Id(), theXMLTypePackage.getString(), "id", null, 1, 1,
				EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventTrigger_Expression(), theXMLTypePackage.getString(), "expression",
				null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventTrigger_TargetTopic(), theXMLTypePackage.getString(), "targetTopic",
				null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_SubscriptionsList(), this.getEventSubscriptionList(), null,
				"subscriptionsList", null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventTrigger_Language(), theXMLTypePackage.getString(), "language", null,
				0, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excelQueryEClass, ExcelQuery.class, "ExcelQuery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcelQuery_WorkbookName(), theXMLTypePackage.getString(), "workbookName",
				null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_StartingRow(), theXMLTypePackage.getUnsignedLong(),
				"startingRow", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_MaxRowCount(), theXMLTypePackage.getUnsignedLong(),
				"maxRowCount", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_HasHeader(), theXMLTypePackage.getBoolean(), "hasHeader",
				null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gSpreadQueryEClass, GSpreadQuery.class, "GSpreadQuery", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSpreadQuery_WorksheetNumber(), theXMLTypePackage.getUnsignedLong(),
				"worksheetNumber", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_StartingRow(), theXMLTypePackage.getUnsignedLong(),
				"startingRow", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_MaxRowCount(), theXMLTypePackage.getUnsignedLong(),
				"maxRowCount", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_HasHeader(), theXMLTypePackage.getBoolean(), "hasHeader",
				null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthValidatorEClass, LengthValidator.class, "LengthValidator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthValidator_MinValue(), theXMLTypePackage.getUnsignedLong(),
				"minValue", null, 0, 1, LengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthValidator_MaxValue(), theXMLTypePackage.getUnsignedLong(),
				"maxValue", null, 0, 1, LengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longRangeValidatorEClass, LongRangeValidator.class, "LongRangeValidator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongRangeValidator_MinValue(), theXMLTypePackage.getLong(), "minValue",
				null, 0, 1, LongRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongRangeValidator_MaxValue(), theXMLTypePackage.getLong(), "maxValue",
				null, 0, 1, LongRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_CallQuery(), this.getCallQuery(), null, "callQuery", null, 0,
				1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_CallQueryList(), this.getCallQueryList(), null,
				"callQueryList", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterMapping_ParameterName(), theXMLTypePackage.getString(),
				"parameterName", null, 1, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMapping_ColumnName(), theXMLTypePackage.getString(),
				"columnName", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMapping_QueryParam(), theXMLTypePackage.getString(),
				"queryParam", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternValidatorEClass, PatternValidator.class, "PatternValidator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternValidator_PatternString(), theXMLTypePackage.getString(),
				"patternString", null, 1, 1, PatternValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Query.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_InputTriggerName(), theXMLTypePackage.getString(),
				"inputTriggerName", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_OutputTriggerName(), theXMLTypePackage.getString(),
				"outputTriggerName", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_DataSourceId(), theXMLTypePackage.getString(), "dataSourceId",
				null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_SqlStatement(), theXMLTypePackage.getString(), "sqlStatement",
				null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_PropertiesList(), this.getQueryPropertyList(), null,
				"propertiesList", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ResultMapping(), this.getResultMapping(), null, "resultMapping",
				null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ExcelQueries(), this.getExcelQuery(), null, "excelQueries", null,
				0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_GspreadQueries(), this.getGSpreadQuery(), null, "gspreadQueries",
				null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_QueryParameters(), this.getQueryParameter(), null,
				"queryParameters", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_ReturnRowId(), theXMLTypePackage.getBoolean(), "returnRowId", null,
				0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParameter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Type(), theXMLTypePackage.getString(), "type", null, 0, 1,
				QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_SqlType(), theXMLTypePackage.getString(), "sqlType", null,
				1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_DefaultValue(), theXMLTypePackage.getString(),
				"defaultValue", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Ordinal(), theXMLTypePackage.getUnsignedInt(), "ordinal",
				null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_ParamType(), theXMLTypePackage.getString(), "paramType",
				null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_LongRangeValidator(), this.getLongRangeValidator(), null,
				"longRangeValidator", null, 0, 1, QueryParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_DoubleRangeValidator(), this.getDoubleRangeValidator(),
				null, "doubleRangeValidator", null, 0, 1, QueryParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_LengthValidator(), this.getLengthValidator(), null,
				"lengthValidator", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_PatternValidators(), this.getPatternValidator(), null,
				"patternValidators", null, 0, -1, QueryParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_CustomValidators(), this.getCustomValidator(), null,
				"customValidators", null, 0, -1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(queryPropertyEClass, QueryProperty.class, "QueryProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				QueryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryProperty_Value(), theXMLTypePackage.getString(), "value", null, 0,
				1, QueryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPropertyListEClass, QueryPropertyList.class, "QueryPropertyList",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryPropertyList_Properties(), this.getQueryProperty(), null,
				"properties", null, 0, 5, QueryPropertyList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Method(), theXMLTypePackage.getString(), "method", null, 1, 1,
				Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Path(), theXMLTypePackage.getString(), "path", null, 1, 1,
				Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_CallQuery(), this.getCallQuery(), null, "callQuery", null, 0, 1,
				Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_CallQueryList(), this.getCallQueryList(), null, "callQueryList",
				null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(resultMappingEClass, ResultMapping.class, "ResultMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultMapping_ElementName(), theXMLTypePackage.getString(),
				"elementName", null, 1, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_RowName(), theXMLTypePackage.getString(), "rowName", null,
				1, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_DefaultNamespace(), theXMLTypePackage.getString(),
				"defaultNamespace", null, 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_XsltPath(), theXMLTypePackage.getString(), "xsltPath",
				null, 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_OutputType(), theXMLTypePackage.getString(), "outputType",
				"", 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultMapping_ElementMappings(), this.getElementMapping(), null,
				"elementMappings", null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResultMapping_AttributeMappings(), this.getAttributeMapping(), null,
				"attributeMappings", null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResultMapping_CallQueries(), this.getCallQuery(), null, "callQueries",
				null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.INACTIVE);

		// Initialize data types
		initEDataType(serviceStatusObjectEDataType, ServiceStatus.class, "ServiceStatusObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(this, source, new String[] { "qualified", "false" });
		addAnnotation(attributeMappingEClass, source, new String[] { "name", "attribute_._type",
				"kind", "empty" });
		addAnnotation(getAttributeMapping_AttributeName(), source, new String[] { "kind",
				"attribute", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getAttributeMapping_ColumnName(), source, new String[] { "kind", "attribute",
				"name", "column", "namespace", "##targetNamespace" });
		addAnnotation(getAttributeMapping_QueryParam(), source, new String[] { "kind", "attribute",
				"name", "query-param", "namespace", "##targetNamespace" });
		addAnnotation(getAttributeMapping_RequiredRoles(), source, new String[] { "kind",
				"attribute", "name", "requiredRoles", "namespace", "##targetNamespace" });
		addAnnotation(getAttributeMapping_XsdType(), source, new String[] { "kind", "attribute",
				"name", "xsdType", "namespace", "##targetNamespace" });
		addAnnotation(callQueryEClass, source, new String[] { "name", "call-query_._type", "kind",
				"elementOnly" });
		addAnnotation(getCallQuery_Href(), source, new String[] { "kind", "attribute", "name",
				"href", "namespace", "##targetNamespace" });
		addAnnotation(getCallQuery_ParameterMappings(), source, new String[] { "kind", "element",
				"name", "with-param", "namespace", "##targetNamespace" });
		addAnnotation(callQueryListEClass, source, new String[] { "name",
				"call-query-group_._type", "kind", "elementOnly" });
		addAnnotation(getCallQueryList_Queries(), source, new String[] { "kind", "element", "name",
				"call-query", "namespace", "##targetNamespace" });
		addAnnotation(configurationPropertyEClass, source, new String[] { "name",
				"property_._type", "kind", "simple" });
		addAnnotation(getConfigurationProperty_Name(), source, new String[] { "kind", "attribute",
				"name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getConfigurationProperty_Value(), source, new String[] { "name", ":0",
				"kind", "simple" });
		addAnnotation(customValidatorEClass, source, new String[] { "name",
				"validateCustom_._type", "kind", "empty" });
		addAnnotation(getCustomValidator_ClassName(), source, new String[] { "kind", "attribute",
				"name", "class", "namespace", "##targetNamespace" });
		addAnnotation(dataServiceEClass, source, new String[] { "name", "data", "kind",
				"elementOnly" });
		addAnnotation(getDataService_Name(), source, new String[] { "kind", "attribute", "name",
				"name", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_Description(), source, new String[] { "kind", "element",
				"name", "description", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_BaseURI(), source, new String[] { "kind", "attribute", "name",
				"baseURI", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_EnableBatchRequests(), source, new String[] { "kind",
				"attribute", "name", "enableBatchRequests", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_EnableBoxcarring(), source, new String[] { "kind",
				"attribute", "name", "enableBoxcarring", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_ServiceStatus(), source, new String[] { "kind", "attribute",
				"name", "serviceStatus", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_DataSources(), source, new String[] { "kind", "element",
				"name", "config", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_Queries(), source, new String[] { "kind", "element", "name",
				"query", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_EventTriggers(), source, new String[] { "kind", "element",
				"name", "event-trigger", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_Operations(), source, new String[] { "kind", "element",
				"name", "operation", "namespace", "##targetNamespace" });
		addAnnotation(getDataService_Resources(), source, new String[] { "kind", "element", "name",
				"resource", "namespace", "##targetNamespace" });
		addAnnotation(dataSourceConfigurationEClass, source, new String[] { "name",
				"config_._type", "kind", "elementOnly" });
		addAnnotation(getDataSourceConfiguration_Id(), source, new String[] { "kind", "attribute",
				"name", "id", "namespace", "##targetNamespace" });
		addAnnotation(getDataSourceConfiguration_ConfigurationProperties(), source, new String[] {
				"kind", "element", "name", "property", "namespace", "##targetNamespace" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard",
				"name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] { "kind", "attribute",
				"name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] { "kind",
				"attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Data(), source, new String[] { "kind", "element", "name",
				"data", "namespace", "##targetNamespace" });
		addAnnotation(doubleRangeValidatorEClass, source, new String[] { "name",
				"validateDoubleRange_._type", "kind", "empty" });
		addAnnotation(getDoubleRangeValidator_MinValue(), source, new String[] { "kind",
				"attribute", "name", "minimum", "namespace", "##targetNamespace" });
		addAnnotation(getDoubleRangeValidator_MaxValue(), source, new String[] { "kind",
				"attribute", "name", "maximum", "namespace", "##targetNamespace" });
		addAnnotation(elementMappingEClass, source, new String[] { "name", "element_._type",
				"kind", "empty" });
		addAnnotation(getElementMapping_ElementName(), source, new String[] { "kind", "attribute",
				"name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getElementMapping_ColumnName(), source, new String[] { "kind", "attribute",
				"name", "column", "namespace", "##targetNamespace" });
		addAnnotation(getElementMapping_QueryParam(), source, new String[] { "kind", "attribute",
				"name", "query-param", "namespace", "##targetNamespace" });
		addAnnotation(getElementMapping_RequiredRoles(), source, new String[] { "kind",
				"attribute", "name", "requiredRoles", "namespace", "##targetNamespace" });
		addAnnotation(getElementMapping_XsdType(), source, new String[] { "kind", "attribute",
				"name", "xsdType", "namespace", "##targetNamespace" });
		addAnnotation(eventSubscriptionListEClass, source, new String[] { "name",
				"subscriptions_._type", "kind", "elementOnly" });
		addAnnotation(getEventSubscriptionList_Subscriptions(), source, new String[] { "kind",
				"element", "name", "subscription", "namespace", "##targetNamespace" });
		addAnnotation(eventTriggerEClass, source, new String[] { "name", "event-trigger_._type",
				"kind", "elementOnly" });
		addAnnotation(getEventTrigger_Id(), source, new String[] { "kind", "attribute", "name",
				"id", "namespace", "##targetNamespace" });
		addAnnotation(getEventTrigger_Expression(), source, new String[] { "kind", "element",
				"name", "expression", "namespace", "##targetNamespace" });
		addAnnotation(getEventTrigger_TargetTopic(), source, new String[] { "kind", "element",
				"name", "target-topic", "namespace", "##targetNamespace" });
		addAnnotation(getEventTrigger_SubscriptionsList(), source, new String[] { "kind",
				"element", "name", "subscriptions", "namespace", "##targetNamespace" });
		addAnnotation(getEventTrigger_Language(), source, new String[] { "kind", "attribute",
				"name", "language", "namespace", "##targetNamespace" });
		addAnnotation(excelQueryEClass, source, new String[] { "name", "excel_._type", "kind",
				"elementOnly" });
		addAnnotation(getExcelQuery_WorkbookName(), source, new String[] { "kind", "element",
				"name", "workbookname", "namespace", "##targetNamespace" });
		addAnnotation(getExcelQuery_StartingRow(), source, new String[] { "kind", "element",
				"name", "startingrow", "namespace", "##targetNamespace" });
		addAnnotation(getExcelQuery_MaxRowCount(), source, new String[] { "kind", "element",
				"name", "maxrowcount", "namespace", "##targetNamespace" });
		addAnnotation(getExcelQuery_HasHeader(), source, new String[] { "kind", "element", "name",
				"hasheader", "namespace", "##targetNamespace" });
		addAnnotation(gSpreadQueryEClass, source, new String[] { "name", "gspread_._type", "kind",
				"elementOnly" });
		addAnnotation(getGSpreadQuery_WorksheetNumber(), source, new String[] { "kind", "element",
				"name", "worksheetnumber", "namespace", "##targetNamespace" });
		addAnnotation(getGSpreadQuery_StartingRow(), source, new String[] { "kind", "element",
				"name", "startingrow", "namespace", "##targetNamespace" });
		addAnnotation(getGSpreadQuery_MaxRowCount(), source, new String[] { "kind", "element",
				"name", "maxrowcount", "namespace", "##targetNamespace" });
		addAnnotation(getGSpreadQuery_HasHeader(), source, new String[] { "kind", "element",
				"name", "hasheader", "namespace", "##targetNamespace" });
		addAnnotation(lengthValidatorEClass, source, new String[] { "name",
				"validateLength_._type", "kind", "empty" });
		addAnnotation(getLengthValidator_MinValue(), source, new String[] { "kind", "attribute",
				"name", "minimum", "namespace", "##targetNamespace" });
		addAnnotation(getLengthValidator_MaxValue(), source, new String[] { "kind", "attribute",
				"name", "maximum", "namespace", "##targetNamespace" });
		addAnnotation(longRangeValidatorEClass, source, new String[] { "name",
				"validateLongRange_._type", "kind", "empty" });
		addAnnotation(getLongRangeValidator_MinValue(), source, new String[] { "kind", "attribute",
				"name", "minimum", "namespace", "##targetNamespace" });
		addAnnotation(getLongRangeValidator_MaxValue(), source, new String[] { "kind", "attribute",
				"name", "maximum", "namespace", "##targetNamespace" });
		addAnnotation(operationEClass, source, new String[] { "name", "operation_._type", "kind",
				"elementOnly" });
		addAnnotation(getOperation_Name(), source, new String[] { "kind", "attribute", "name",
				"name", "namespace", "##targetNamespace" });
		addAnnotation(getOperation_CallQuery(), source, new String[] { "kind", "element", "name",
				"call-query", "namespace", "##targetNamespace" });
		addAnnotation(getOperation_CallQueryList(), source, new String[] { "kind", "element",
				"name", "call-query-group", "namespace", "##targetNamespace" });
		addAnnotation(parameterMappingEClass, source, new String[] { "name", "with-param_._type",
				"kind", "empty" });
		addAnnotation(getParameterMapping_ParameterName(), source, new String[] { "kind",
				"attribute", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getParameterMapping_ColumnName(), source, new String[] { "kind", "attribute",
				"name", "column", "namespace", "##targetNamespace" });
		addAnnotation(getParameterMapping_QueryParam(), source, new String[] { "kind", "attribute",
				"name", "query-param", "namespace", "##targetNamespace" });
		addAnnotation(patternValidatorEClass, source, new String[] { "name",
				"validatePattern_._type", "kind", "empty" });
		addAnnotation(getPatternValidator_PatternString(), source, new String[] { "kind",
				"attribute", "name", "pattern", "namespace", "##targetNamespace" });
		addAnnotation(queryEClass, source, new String[] { "name", "query_._type", "kind",
				"elementOnly" });
		addAnnotation(getQuery_Id(), source, new String[] { "kind", "attribute", "name", "id",
				"namespace", "##targetNamespace" });
		addAnnotation(getQuery_InputTriggerName(), source, new String[] { "kind", "attribute",
				"name", "input-event-trigger", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_OutputTriggerName(), source, new String[] { "kind", "attribute",
				"name", "output-event-trigger", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_DataSourceId(), source, new String[] { "kind", "attribute", "name",
				"useConfig", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_SqlStatement(), source, new String[] { "kind", "element", "name",
				"sql", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_PropertiesList(), source, new String[] { "kind", "element", "name",
				"properties", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_ResultMapping(), source, new String[] { "kind", "element", "name",
				"result", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_ExcelQueries(), source, new String[] { "kind", "element", "name",
				"excel", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_GspreadQueries(), source, new String[] { "kind", "element", "name",
				"gspread", "namespace", "##targetNamespace" });
		addAnnotation(getQuery_QueryParameters(), source, new String[] { "kind", "element", "name",
				"param", "namespace", "##targetNamespace" });
		addAnnotation(queryParameterEClass, source, new String[] { "name", "param_._type", "kind",
				"elementOnly" });
		addAnnotation(getQueryParameter_Name(), source, new String[] { "kind", "attribute", "name",
				"name", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_Type(), source, new String[] { "kind", "attribute", "name",
				"type", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_SqlType(), source, new String[] { "kind", "attribute",
				"name", "sqlType", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_DefaultValue(), source, new String[] { "kind", "attribute",
				"name", "defaultValue", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_Ordinal(), source, new String[] { "kind", "attribute",
				"name", "ordinal", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_ParamType(), source, new String[] { "kind", "attribute",
				"name", "paramType", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_LongRangeValidator(), source, new String[] { "kind",
				"element", "name", "validateLongRange", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_DoubleRangeValidator(), source, new String[] { "kind",
				"element", "name", "validateDoubleRange", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_LengthValidator(), source, new String[] { "kind",
				"element", "name", "validateLength", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_PatternValidators(), source, new String[] { "kind",
				"element", "name", "validatePattern", "namespace", "##targetNamespace" });
		addAnnotation(getQueryParameter_CustomValidators(), source, new String[] { "kind",
				"element", "name", "validateCustom", "namespace", "##targetNamespace" });
		addAnnotation(queryPropertyEClass, source, new String[] { "name", "property_._1_._type",
				"kind", "simple" });
		addAnnotation(getQueryProperty_Name(), source, new String[] { "kind", "attribute", "name",
				"name", "namespace", "##targetNamespace" });
		addAnnotation(getQueryProperty_Value(), source, new String[] { "name", ":0", "kind",
				"simple" });
		addAnnotation(queryPropertyListEClass, source, new String[] { "name", "properties_._type",
				"kind", "elementOnly" });
		addAnnotation(getQueryPropertyList_Properties(), source, new String[] { "kind", "element",
				"name", "property", "namespace", "##targetNamespace" });
		addAnnotation(resourceEClass, source, new String[] { "name", "resource_._type", "kind",
				"elementOnly" });
		addAnnotation(getResource_Method(), source, new String[] { "kind", "attribute", "name",
				"method", "namespace", "##targetNamespace" });
		addAnnotation(getResource_Path(), source, new String[] { "kind", "attribute", "name",
				"path", "namespace", "##targetNamespace" });
		addAnnotation(getResource_CallQuery(), source, new String[] { "kind", "element", "name",
				"call-query", "namespace", "##targetNamespace" });
		addAnnotation(getResource_CallQueryList(), source, new String[] { "kind", "element",
				"name", "call-query-group", "namespace", "##targetNamespace" });
		addAnnotation(resultMappingEClass, source, new String[] { "name", "result_._type", "kind",
				"elementOnly" });
		addAnnotation(getResultMapping_ElementName(), source, new String[] { "kind", "attribute",
				"name", "element", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_RowName(), source, new String[] { "kind", "attribute",
				"name", "rowName", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_DefaultNamespace(), source, new String[] { "kind",
				"attribute", "name", "defaultNamespace", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_XsltPath(), source, new String[] { "kind", "attribute",
				"name", "xsltPath", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_OutputType(), source, new String[] { "kind", "attribute",
				"name", "outputType", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_ElementMappings(), source, new String[] { "kind", "element",
				"name", "element", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_AttributeMappings(), source, new String[] { "kind",
				"element", "name", "attribute", "namespace", "##targetNamespace" });
		addAnnotation(getResultMapping_CallQueries(), source, new String[] { "kind", "element",
				"name", "call-query", "namespace", "##targetNamespace" });
		addAnnotation(serviceStatusEEnum, source, new String[] { "name", "serviceStatus_._type" });
		addAnnotation(serviceStatusObjectEDataType, source, new String[] { "name",
				"serviceStatus_._type:Object", "baseType", "serviceStatus_._type" });
	}

} // DsPackageImpl
