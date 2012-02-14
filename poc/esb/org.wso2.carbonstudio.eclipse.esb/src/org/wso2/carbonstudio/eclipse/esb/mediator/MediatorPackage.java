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
package org.wso2.carbonstudio.eclipse.esb.mediator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.wso2.carbonstudio.eclipse.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorFactory
 * @model kind="package"
 * @generated
 */
public interface MediatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mediator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/wso2/carbonstudio/eclipse/esb/mediator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mediator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MediatorPackage eINSTANCE = org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.InMediatorImpl <em>In Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.InMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getInMediator()
	 * @generated
	 */
	int IN_MEDIATOR = 0;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR__OBJECT_STATE = EsbPackage.PARENT_MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR__SOURCE_TEXT = EsbPackage.PARENT_MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.PARENT_MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.PARENT_MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR__CHILDREN = EsbPackage.PARENT_MEDIATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>In Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEDIATOR_FEATURE_COUNT = EsbPackage.PARENT_MEDIATOR_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.OutMediatorImpl <em>Out Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.OutMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOutMediator()
	 * @generated
	 */
	int OUT_MEDIATOR = 1;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR__OBJECT_STATE = EsbPackage.PARENT_MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR__SOURCE_TEXT = EsbPackage.PARENT_MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.PARENT_MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.PARENT_MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR__CHILDREN = EsbPackage.PARENT_MEDIATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Out Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MEDIATOR_FEATURE_COUNT = EsbPackage.PARENT_MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DropMediatorImpl <em>Drop Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DropMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDropMediator()
	 * @generated
	 */
	int DROP_MEDIATOR = 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The number of structural features of the '<em>Drop Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl <em>Send Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSendMediator()
	 * @generated
	 */
	int SEND_MEDIATOR = 3;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__ANONYMOUS_END_POINT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR__END_POINT_REFERENCE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogMediatorImpl <em>Log Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogMediator()
	 * @generated
	 */
	int LOG_MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Log Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_CATEGORY = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_LEVEL = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__LOG_SEPARATOR = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR__PROPERTIES = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Log Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogPropertyImpl <em>Log Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogProperty()
	 * @generated
	 */
	int LOG_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__OBJECT_STATE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__SOURCE_TEXT = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_NAME = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_VALUE_TYPE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_VALUE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY__PROPERTY_EXPRESSION = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Log Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PROPERTY_FEATURE_COUNT = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterMediatorImpl <em>Filter Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterMediator()
	 * @generated
	 */
	int FILTER_MEDIATOR = 6;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__CONDITION_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__FILTER_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__FILTER_SOURCE = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__FILTER_REGEX = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__THEN_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR__ELSE_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Filter Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterThenBranchImpl <em>Filter Then Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterThenBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterThenBranch()
	 * @generated
	 */
	int FILTER_THEN_BRANCH = 7;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The number of structural features of the '<em>Filter Then Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_THEN_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterElseBranchImpl <em>Filter Else Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterElseBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterElseBranch()
	 * @generated
	 */
	int FILTER_ELSE_BRANCH = 8;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The number of structural features of the '<em>Filter Else Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ELSE_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchMediatorImpl <em>Switch Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchMediator()
	 * @generated
	 */
	int SWITCH_MEDIATOR = 9;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__SOURCE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__CASE_BRANCHES = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR__DEFAULT_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchCaseBranchImpl <em>Switch Case Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchCaseBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchCaseBranch()
	 * @generated
	 */
	int SWITCH_CASE_BRANCH = 10;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The feature id for the '<em><b>Case Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH__CASE_REGEX = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Case Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchDefaultBranchImpl <em>Switch Default Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchDefaultBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchDefaultBranch()
	 * @generated
	 */
	int SWITCH_DEFAULT_BRANCH = 11;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The number of structural features of the '<em>Switch Default Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EntitlementMediatorImpl <em>Entitlement Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EntitlementMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEntitlementMediator()
	 * @generated
	 */
	int ENTITLEMENT_MEDIATOR = 12;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__SERVER_URL = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__USERNAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR__PASSWORD = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entitlement Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl <em>Enqueue Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnqueueMediator()
	 * @generated
	 */
	int ENQUEUE_MEDIATOR = 13;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__EXECUTOR = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__PRIORITY = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR__SEQUENCE_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enqueue Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassMediatorImpl <em>Class Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getClassMediator()
	 * @generated
	 */
	int CLASS_MEDIATOR = 14;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__CLASS_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR__PROPERTIES = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassPropertyImpl <em>Class Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getClassProperty()
	 * @generated
	 */
	int CLASS_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__OBJECT_STATE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__SOURCE_TEXT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__PROPERTY_NAME = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY__PROPERTY_VALUE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Class Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PROPERTY_FEATURE_COUNT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl <em>Spring Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSpringMediator()
	 * @generated
	 */
	int SPRING_MEDIATOR = 16;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Bean Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__BEAN_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR__CONFIGURATION_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spring Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateMediatorImpl <em>Validate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateMediator()
	 * @generated
	 */
	int VALIDATE_MEDIATOR = 17;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__SOURCE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Fail Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__ON_FAIL_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__FEATURES = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR__SCHEMAS = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Validate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateOnFailBranchImpl <em>Validate On Fail Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateOnFailBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateOnFailBranch()
	 * @generated
	 */
	int VALIDATE_ON_FAIL_BRANCH = 18;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The number of structural features of the '<em>Validate On Fail Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ON_FAIL_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateFeatureImpl <em>Validate Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateFeatureImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateFeature()
	 * @generated
	 */
	int VALIDATE_FEATURE = 19;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__OBJECT_STATE = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__SOURCE_TEXT = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__FEATURE_NAME = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE__FEATURE_ENABLED = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED;

	/**
	 * The number of structural features of the '<em>Validate Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_FEATURE_COUNT = EsbPackage.ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateSchemaImpl <em>Validate Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateSchemaImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateSchema()
	 * @generated
	 */
	int VALIDATE_SCHEMA = 20;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Schema Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA__SCHEMA_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validate Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_SCHEMA_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ScriptMediatorImpl <em>Script Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ScriptMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptMediator()
	 * @generated
	 */
	int SCRIPT_MEDIATOR = 21;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_LANGUAGE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mediate Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__MEDIATE_FUNCTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Script Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR__SCRIPT_BODY = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Script Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksMediatorImpl <em>Smooks Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksMediator()
	 * @generated
	 */
	int SMOOKS_MEDIATOR = 76;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksInConfigurationImpl <em>Smooks In Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksInConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksInConfiguration()
	 * @generated
	 */
	int SMOOKS_IN_CONFIGURATION = 77;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl <em>Enrich Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichMediator()
	 * @generated
	 */
	int ENRICH_MEDIATOR = 22;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Clone Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__CLONE_SOURCE = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_PROPERTY = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__SOURCE_XML = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR__TARGET_PROPERTY = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Enrich Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENRICH_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FaultMediatorImpl <em>Fault Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FaultMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultMediator()
	 * @generated
	 */
	int FAULT_MEDIATOR = 23;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Soap Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__SOAP_VERSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Code Soap11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_CODE_SOAP11 = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault String Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_VALUE = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault String Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_STRING_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_ACTOR = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault Code Soap12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_CODE_SOAP12 = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault Reason Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fault Reason Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_VALUE = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault Reason Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_REASON_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__ROLE_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__NODE_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fault Detail Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fault Detail Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_VALUE = EsbPackage.MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fault Detail Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR__FAULT_DETAIL_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Fault Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl <em>Aggregate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateMediator()
	 * @generated
	 */
	int AGGREGATE_MEDIATOR = 24;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Completion Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Min Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Completion Max Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Complete Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Aggregate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateOnCompleteBranchImpl <em>Aggregate On Complete Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateOnCompleteBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateOnCompleteBranch()
	 * @generated
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH = 25;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregate On Complete Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ON_COMPLETE_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterMediatorImpl <em>Router Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouterMediator()
	 * @generated
	 */
	int ROUTER_MEDIATOR = 26;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Continue After Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR__ROUTES = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterRouteImpl <em>Router Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterRouteImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouterRoute()
	 * @generated
	 */
	int ROUTER_ROUTE = 27;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Break After Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__BREAK_AFTER_ROUTE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__ROUTE_EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__ROUTE_PATTERN = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE__TARGET = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Router Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ROUTE_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouteTargetImpl <em>Route Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouteTargetImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouteTarget()
	 * @generated
	 */
	int ROUTE_TARGET = 28;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__OBJECT_STATE = EsbPackage.ABSTRACT_COMMON_TARGET__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__SOURCE_TEXT = EsbPackage.ABSTRACT_COMMON_TARGET__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_COMMON_TARGET__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_COMMON_TARGET__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__SEQUENCE_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__SEQUENCE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__SEQUENCE_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_KEY;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__ENDPOINT_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__ENDPOINT = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET__ENDPOINT_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_KEY;

	/**
	 * The number of structural features of the '<em>Route Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TARGET_FEATURE_COUNT = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl <em>Clone Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCloneMediator()
	 * @generated
	 */
	int CLONE_MEDIATOR = 29;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Continue Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__CONTINUE_PARENT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR__TARGETS = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clone Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneTargetImpl <em>Clone Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneTargetImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCloneTarget()
	 * @generated
	 */
	int CLONE_TARGET = 30;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__OBJECT_STATE = EsbPackage.ABSTRACT_COMMON_TARGET__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__SOURCE_TEXT = EsbPackage.ABSTRACT_COMMON_TARGET__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_COMMON_TARGET__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_COMMON_TARGET__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__SEQUENCE_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__SEQUENCE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__SEQUENCE_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_KEY;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__ENDPOINT_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__ENDPOINT = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__ENDPOINT_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_KEY;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__SOAP_ACTION = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET__TO_ADDRESS = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clone Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_TARGET_FEATURE_COUNT = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateMediatorImpl <em>Iterate Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getIterateMediator()
	 * @generated
	 */
	int ITERATE_MEDIATOR = 31;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Continue Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__CONTINUE_PARENT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preserve Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__PRESERVE_PAYLOAD = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ITERATE_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attach Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__ATTACH_PATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR__TARGET = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Iterate Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateTargetImpl <em>Iterate Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateTargetImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getIterateTarget()
	 * @generated
	 */
	int ITERATE_TARGET = 32;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__OBJECT_STATE = EsbPackage.ABSTRACT_COMMON_TARGET__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SOURCE_TEXT = EsbPackage.ABSTRACT_COMMON_TARGET__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_COMMON_TARGET__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_COMMON_TARGET__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SEQUENCE_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__SEQUENCE_KEY;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT_TYPE = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__ENDPOINT_KEY = EsbPackage.ABSTRACT_COMMON_TARGET__ENDPOINT_KEY;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__SOAP_ACTION = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET__TO_ADDRESS = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterate Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_TARGET_FEATURE_COUNT = EsbPackage.ABSTRACT_COMMON_TARGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheMediatorImpl <em>Cache Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheMediator()
	 * @generated
	 */
	int CACHE_MEDIATOR = 33;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Cache Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_ID = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_SCOPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cache Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hash Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__HASH_GENERATOR = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cache Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__CACHE_TIMEOUT = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__MAX_MESSAGE_SIZE = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__IMPLEMENTATION_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Entry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__MAX_ENTRY_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>On Hit Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR__ON_HIT_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Cache Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheOnHitBranchImpl <em>Cache On Hit Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheOnHitBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheOnHitBranch()
	 * @generated
	 */
	int CACHE_ON_HIT_BRANCH = 34;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH__SEQUENCE_KEY = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cache On Hit Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_ON_HIT_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl <em>XSLT Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTMediator()
	 * @generated
	 */
	int XSLT_MEDIATOR = 35;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Xslt Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__XSLT_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__SOURCE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__PROPERTIES = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__FEATURES = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR__RESOURCES = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XSLT Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTPropertyImpl <em>XSLT Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTProperty()
	 * @generated
	 */
	int XSLT_PROPERTY = 36;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__OBJECT_STATE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__SOURCE_TEXT = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_NAME = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_VALUE_TYPE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_VALUE = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY__PROPERTY_EXPRESSION = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>XSLT Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_PROPERTY_FEATURE_COUNT = EsbPackage.ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTFeatureImpl <em>XSLT Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTFeatureImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTFeature()
	 * @generated
	 */
	int XSLT_FEATURE = 37;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__OBJECT_STATE = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__SOURCE_TEXT = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__FEATURE_NAME = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE__FEATURE_ENABLED = EsbPackage.ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED;

	/**
	 * The number of structural features of the '<em>XSLT Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_FEATURE_FEATURE_COUNT = EsbPackage.ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTResourceImpl <em>XSLT Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTResourceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTResource()
	 * @generated
	 */
	int XSLT_RESOURCE = 38;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__OBJECT_STATE = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__SOURCE_TEXT = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__LOCATION = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE__KEY = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE__KEY;

	/**
	 * The number of structural features of the '<em>XSLT Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_RESOURCE_FEATURE_COUNT = EsbPackage.ABSTRACT_LOCATION_KEY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl <em>XQuery Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryMediator()
	 * @generated
	 */
	int XQUERY_MEDIATOR = 39;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Query Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__QUERY_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__TARGET_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR__VARIABLES = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XQuery Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryVariableImpl <em>XQuery Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryVariableImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariable()
	 * @generated
	 */
	int XQUERY_VARIABLE = 40;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VARIABLE_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VARIABLE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_LITERAL = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE__VALUE_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XQuery Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XQUERY_VARIABLE_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CalloutMediatorImpl <em>Callout Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CalloutMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutMediator()
	 * @generated
	 */
	int CALLOUT_MEDIATOR = 41;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__SERVICE_URL = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__SOAP_ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path To Axis2xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PATH_TO_AXIS2XML = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path To Axis2 Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payload Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payload Message Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payload Registry Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Result Message Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result Context Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Callout Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RMSequenceMediatorImpl <em>RM Sequence Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RMSequenceMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSequenceMediator()
	 * @generated
	 */
	int RM_SEQUENCE_MEDIATOR = 42;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Rm Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__CORRELATION_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Message Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR__LAST_MESSAGE_XPATH = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>RM Sequence Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_SEQUENCE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.TransactionMediatorImpl <em>Transaction Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.TransactionMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getTransactionMediator()
	 * @generated
	 */
	int TRANSACTION_MEDIATOR = 43;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR__ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.PropertyMediatorImpl <em>Property Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.PropertyMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyMediator()
	 * @generated
	 */
	int PROPERTY_MEDIATOR = 44;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__PROPERTY_SCOPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_LITERAL = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value OM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_OM = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value String Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_STRING_PATTERN = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value String Capturing Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Property Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.OAuthMediatorImpl <em>OAuth Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.OAuthMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOAuthMediator()
	 * @generated
	 */
	int OAUTH_MEDIATOR = 45;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Remote Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR__REMOTE_SERVICE_URL = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OAuth Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleInMediatorImpl <em>Autoscale In Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleInMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAutoscaleInMediator()
	 * @generated
	 */
	int AUTOSCALE_IN_MEDIATOR = 46;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The number of structural features of the '<em>Autoscale In Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_IN_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleOutMediatorImpl <em>Autoscale Out Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleOutMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAutoscaleOutMediator()
	 * @generated
	 */
	int AUTOSCALE_OUT_MEDIATOR = 47;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The number of structural features of the '<em>Autoscale Out Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSCALE_OUT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.HeaderMediatorImpl <em>Header Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.HeaderMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderMediator()
	 * @generated
	 */
	int HEADER_MEDIATOR = 48;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Header Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__HEADER_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__HEADER_ACTION = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_LITERAL = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR__VALUE_EXPRESSION = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Header Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleMediatorImpl <em>Throttle Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleMediator()
	 * @generated
	 */
	int THROTTLE_MEDIATOR = 49;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__GROUP_ID = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__POLICY_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Accept Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Reject Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR__ON_REJECT_BRANCH = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Throttle Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyConfigurationImpl <em>Throttle Policy Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyConfiguration()
	 * @generated
	 */
	int THROTTLE_POLICY_CONFIGURATION = 50;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Concurrent Access Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__MAX_CONCURRENT_ACCESS_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Policy Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION__POLICY_ENTRIES = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Throttle Policy Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnAcceptBranchImpl <em>Throttle On Accept Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnAcceptBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleOnAcceptBranch()
	 * @generated
	 */
	int THROTTLE_ON_ACCEPT_BRANCH = 52;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnRejectBranchImpl <em>Throttle On Reject Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnRejectBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleOnRejectBranch()
	 * @generated
	 */
	int THROTTLE_ON_REJECT_BRANCH = 53;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyEntryImpl <em>Throttle Policy Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyEntryImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyEntry()
	 * @generated
	 */
	int THROTTLE_POLICY_ENTRY = 51;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Throttle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__THROTTLE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Throttle Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__THROTTLE_RANGE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__ACCESS_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__MAX_REQUEST_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__UNIT_TIME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prohibit Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY__PROHIBIT_PERIOD = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Throttle Policy Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_POLICY_ENTRY_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_TYPE = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_KEY = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throttle On Accept Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_ACCEPT_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__SEQUENCE_TYPE = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH__SEQUENCE_KEY = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throttle On Reject Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLE_ON_REJECT_BRANCH_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandMediatorImpl <em>Command Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandMediator()
	 * @generated
	 */
	int COMMAND_MEDIATOR = 54;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__CLASS_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR__PROPERTIES = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandPropertyImpl <em>Command Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandProperty()
	 * @generated
	 */
	int COMMAND_PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__PROPERTY_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_LITERAL = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Context Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_CONTEXT_PROPERTY_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Message Element Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE_MESSAGE_ELEMENT_XPATH = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__CONTEXT_ACTION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__MESSAGE_ACTION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Command Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EventMediatorImpl <em>Event Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EventMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEventMediator()
	 * @generated
	 */
	int EVENT_MEDIATOR = 56;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Event Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR__EVENT_SOURCE_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AbstractSqlExecutorMediatorImpl <em>Abstract Sql Executor Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AbstractSqlExecutorMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAbstractSqlExecutorMediator()
	 * @generated
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR = 57;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME = EsbPackage.MEDIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD = EsbPackage.MEDIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT = EsbPackage.MEDIATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE = EsbPackage.MEDIATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE = EsbPackage.MEDIATOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = EsbPackage.MEDIATOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT = EsbPackage.MEDIATOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE = EsbPackage.MEDIATOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS = EsbPackage.MEDIATOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW = EsbPackage.MEDIATOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE = EsbPackage.MEDIATOR_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY = EsbPackage.MEDIATOR_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE = EsbPackage.MEDIATOR_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS = EsbPackage.MEDIATOR_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Abstract Sql Executor Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlStatementImpl <em>Sql Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlStatementImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlStatement()
	 * @generated
	 */
	int SQL_STATEMENT = 58;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__QUERY_STRING = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__PARAMETERS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__RESULTS_ENABLED = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__RESULTS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sql Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlParameterDefinitionImpl <em>Sql Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlParameterDefinitionImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterDefinition()
	 * @generated
	 */
	int SQL_PARAMETER_DEFINITION = 59;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__DATA_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_LITERAL = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION__VALUE_EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sql Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_DEFINITION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlResultMappingImpl <em>Sql Result Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlResultMappingImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlResultMapping()
	 * @generated
	 */
	int SQL_RESULT_MAPPING = 60;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__PROPERTY_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING__COLUMN_ID = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sql Result Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_MAPPING_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBLookupMediatorImpl <em>DB Lookup Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBLookupMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDBLookupMediator()
	 * @generated
	 */
	int DB_LOOKUP_MEDIATOR = 61;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__OBJECT_STATE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__SOURCE_TEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__DEFAULT_NAMESPACE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__ADDITIONAL_NAMESPACES = ABSTRACT_SQL_EXECUTOR_MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DB_DRIVER = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_DS_NAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_URL = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_USERNAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__CONNECTION_PASSWORD = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_AUTOCOMMIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_ISOLATION = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXACTIVE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MAXWAIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_MINIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_POOLSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_TESTONBORROW = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_TESTWHILEIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_VALIDATIONQUERY = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__PROPERTY_INITIALSIZE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR__SQL_STATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS;

	/**
	 * The number of structural features of the '<em>DB Lookup Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LOOKUP_MEDIATOR_FEATURE_COUNT = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBReportMediatorImpl <em>DB Report Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBReportMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDBReportMediator()
	 * @generated
	 */
	int DB_REPORT_MEDIATOR = 62;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__OBJECT_STATE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__SOURCE_TEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__DEFAULT_NAMESPACE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__ADDITIONAL_NAMESPACES = ABSTRACT_SQL_EXECUTOR_MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Ds Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_TYPE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Db Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DB_DRIVER = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER;

	/**
	 * The feature id for the '<em><b>Connection Ds Initial Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Connection Ds Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_DS_NAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_URL = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL;

	/**
	 * The feature id for the '<em><b>Connection Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_USERNAME = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_PASSWORD = ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD;

	/**
	 * The feature id for the '<em><b>Property Autocommit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_AUTOCOMMIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT;

	/**
	 * The feature id for the '<em><b>Property Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_ISOLATION = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION;

	/**
	 * The feature id for the '<em><b>Property Maxactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXACTIVE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE;

	/**
	 * The feature id for the '<em><b>Property Maxidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE;

	/**
	 * The feature id for the '<em><b>Property Maxopenstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Maxwait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MAXWAIT = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT;

	/**
	 * The feature id for the '<em><b>Property Minidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_MINIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE;

	/**
	 * The feature id for the '<em><b>Property Poolstatements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_POOLSTATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS;

	/**
	 * The feature id for the '<em><b>Property Testonborrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_TESTONBORROW = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW;

	/**
	 * The feature id for the '<em><b>Property Testwhileidle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_TESTWHILEIDLE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE;

	/**
	 * The feature id for the '<em><b>Property Validationquery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_VALIDATIONQUERY = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY;

	/**
	 * The feature id for the '<em><b>Property Initialsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__PROPERTY_INITIALSIZE = ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE;

	/**
	 * The feature id for the '<em><b>Sql Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__SQL_STATEMENTS = ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Connection Use Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DB Report Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_REPORT_MEDIATOR_FEATURE_COUNT = ABSTRACT_SQL_EXECUTOR_MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleMediatorImpl <em>Rule Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleMediator()
	 * @generated
	 */
	int RULE_MEDIATOR = 63;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Rule Set Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RULE_SET_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Session Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RULE_SESSION_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facts Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__FACTS_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Results Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__RESULTS_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Mediators Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION = EsbPackage.MEDIATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl <em>Rule Set Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSetConfiguration()
	 * @generated
	 */
	int RULE_SET_CONFIGURATION = 64;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_CODE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__SOURCE_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION__PROPERTIES = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rule Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetCreationPropertyImpl <em>Rule Set Creation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetCreationPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSetCreationProperty()
	 * @generated
	 */
	int RULE_SET_CREATION_PROPERTY = 65;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__OBJECT_STATE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__SOURCE_TEXT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__PROPERTY_NAME = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY__PROPERTY_VALUE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Rule Set Creation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_CREATION_PROPERTY_FEATURE_COUNT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionConfigurationImpl <em>Rule Session Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSessionConfiguration()
	 * @generated
	 */
	int RULE_SESSION_CONFIGURATION = 66;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Stateful Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__STATEFUL_SESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION__PROPERTIES = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Session Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionPropertyImpl <em>Rule Session Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSessionProperty()
	 * @generated
	 */
	int RULE_SESSION_PROPERTY = 67;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__OBJECT_STATE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__SOURCE_TEXT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__DEFAULT_NAMESPACE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__ADDITIONAL_NAMESPACES = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__PROPERTY_NAME = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY__PROPERTY_VALUE = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Rule Session Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SESSION_PROPERTY_FEATURE_COUNT = EsbPackage.ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactsConfigurationImpl <em>Rule Facts Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactsConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactsConfiguration()
	 * @generated
	 */
	int RULE_FACTS_CONFIGURATION = 68;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION__FACTS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Facts Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTS_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactImpl <em>Rule Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFact()
	 * @generated
	 */
	int RULE_FACT = 69;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Fact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_CUSTOM_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__FACT_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_LITERAL = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT__VALUE_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACT_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultsConfigurationImpl <em>Rule Results Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultsConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultsConfiguration()
	 * @generated
	 */
	int RULE_RESULTS_CONFIGURATION = 70;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION__RESULTS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Results Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULTS_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultImpl <em>Rule Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResult()
	 * @generated
	 */
	int RULE_RESULT = 71;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_CUSTOM_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__RESULT_NAME = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_LITERAL = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT__VALUE_KEY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESULT_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleChildMediatorsConfigurationImpl <em>Rule Child Mediators Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleChildMediatorsConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleChildMediatorsConfiguration()
	 * @generated
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION = 72;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION__OBJECT_STATE = EsbPackage.MEDIATOR_BRANCH__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION__SOURCE_TEXT = EsbPackage.MEDIATOR_BRANCH__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR_BRANCH__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION__CHILDREN = EsbPackage.MEDIATOR_BRANCH__CHILDREN;

	/**
	 * The number of structural features of the '<em>Rule Child Mediators Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CHILD_MEDIATORS_CONFIGURATION_FEATURE_COUNT = EsbPackage.MEDIATOR_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SequenceMediatorImpl <em>Sequence Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SequenceMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSequenceMediator()
	 * @generated
	 */
	int SEQUENCE_MEDIATOR = 73;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR__SEQUENCE_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.BuilderMediatorImpl <em>Builder Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.BuilderMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getBuilderMediator()
	 * @generated
	 */
	int BUILDER_MEDIATOR = 74;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Message Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR__MESSAGE_BUILDERS = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.MessageBuilderImpl <em>Message Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MessageBuilderImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getMessageBuilder()
	 * @generated
	 */
	int MESSAGE_BUILDER = 75;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__CONTENT_TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__BUILDER_CLASS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formatter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER__FORMATTER_CLASS = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDER_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__OBJECT_STATE = EsbPackage.MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__SOURCE_TEXT = EsbPackage.MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__DEFAULT_NAMESPACE = EsbPackage.MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__ADDITIONAL_NAMESPACES = EsbPackage.MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__CONFIGURATION_KEY = EsbPackage.MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__INPUT = EsbPackage.MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR__OUTPUT = EsbPackage.MEDIATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Smooks Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_MEDIATOR_FEATURE_COUNT = EsbPackage.MEDIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION__EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Smooks In Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_IN_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksOutConfigurationImpl <em>Smooks Out Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksOutConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksOutConfiguration()
	 * @generated
	 */
	int SMOOKS_OUT_CONFIGURATION = 78;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__OBJECT_STATE = EsbPackage.MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__SOURCE_TEXT = EsbPackage.MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__DEFAULT_NAMESPACE = EsbPackage.MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__ADDITIONAL_NAMESPACES = EsbPackage.MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__TYPE = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__EXPRESSION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__PROPERTY = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__ACTION = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Smooks Out Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_OUT_CONFIGURATION_FEATURE_COUNT = EsbPackage.MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory <em>Log Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogCategory()
	 * @generated
	 */
	int LOG_CATEGORY = 79;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel <em>Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogLevel()
	 * @generated
	 */
	int LOG_LEVEL = 80;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType <em>Filter Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterConditionType()
	 * @generated
	 */

	int FILTER_CONDITION_TYPE = 81;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType <em>Script Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 82;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage <em>Script Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptLanguage()
	 * @generated
	 */
	int SCRIPT_LANGUAGE = 83;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType <em>Enrich Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichSourceType()
	 * @generated
	 */
	int ENRICH_SOURCE_TYPE = 84;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction <em>Enrich Target Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichTargetAction()
	 * @generated
	 */
	int ENRICH_TARGET_ACTION = 85;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType <em>Enrich Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichTargetType()
	 * @generated
	 */
	int ENRICH_TARGET_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion <em>Fault Soap Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultSoapVersion()
	 * @generated
	 */
	int FAULT_SOAP_VERSION = 87;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11 <em>Fault Code Soap11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultCodeSoap11()
	 * @generated
	 */
	int FAULT_CODE_SOAP11 = 88;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12 <em>Fault Code Soap12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultCodeSoap12()
	 * @generated
	 */
	int FAULT_CODE_SOAP12 = 89;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType <em>Fault String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultStringType()
	 * @generated
	 */
	int FAULT_STRING_TYPE = 90;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType <em>Fault Reason Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultReasonType()
	 * @generated
	 */
	int FAULT_REASON_TYPE = 91;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType <em>Fault Detail Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultDetailType()
	 * @generated
	 */
	int FAULT_DETAIL_TYPE = 92;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType <em>Aggregate Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateSequenceType()
	 * @generated
	 */
	int AGGREGATE_SEQUENCE_TYPE = 93;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType <em>Cache Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheSequenceType()
	 * @generated
	 */
	int CACHE_SEQUENCE_TYPE = 94;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType <em>Cache Implementation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheImplementationType()
	 * @generated
	 */
	int CACHE_IMPLEMENTATION_TYPE = 95;
	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction <em>Cache Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheAction()
	 * @generated
	 */
	int CACHE_ACTION = 96;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope <em>Cache Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheScope()
	 * @generated
	 */
	int CACHE_SCOPE = 97;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType <em>XQuery Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariableType()
	 * @generated
	 */
	int XQUERY_VARIABLE_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType <em>XQuery Variable Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariableValueType()
	 * @generated
	 */
	int XQUERY_VARIABLE_VALUE_TYPE = 99;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType <em>Callout Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutPayloadType()
	 * @generated
	 */
	int CALLOUT_PAYLOAD_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType <em>Callout Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutResultType()
	 * @generated
	 */
	int CALLOUT_RESULT_TYPE = 101;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion <em>RM Spec Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSpecVersion()
	 * @generated
	 */
	int RM_SPEC_VERSION = 102;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType <em>RM Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSequenceType()
	 * @generated
	 */
	int RM_SEQUENCE_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction <em>Transaction Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getTransactionAction()
	 * @generated
	 */
	int TRANSACTION_ACTION = 104;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType <em>Property Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyDataType()
	 * @generated
	 */
	int PROPERTY_DATA_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction <em>Property Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyAction()
	 * @generated
	 */
	int PROPERTY_ACTION = 106;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType <em>Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyValueType()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE = 108;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope <em>Property Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyScope()
	 * @generated
	 */
	int PROPERTY_SCOPE = 107;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction <em>Header Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderAction()
	 * @generated
	 */
	int HEADER_ACTION = 109;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType <em>Header Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderValueType()
	 * @generated
	 */
	int HEADER_VALUE_TYPE = 110;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType <em>Throttle Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyType()
	 * @generated
	 */
	int THROTTLE_POLICY_TYPE = 111;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType <em>Throttle Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleConditionType()
	 * @generated
	 */
	int THROTTLE_CONDITION_TYPE = 112;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType <em>Throttle Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleAccessType()
	 * @generated
	 */
	int THROTTLE_ACCESS_TYPE = 113;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType <em>Throttle Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleSequenceType()
	 * @generated
	 */
	int THROTTLE_SEQUENCE_TYPE = 114;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType <em>Command Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyValueType()
	 * @generated
	 */
	int COMMAND_PROPERTY_VALUE_TYPE = 115;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction <em>Command Property Message Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyMessageAction()
	 * @generated
	 */
	int COMMAND_PROPERTY_MESSAGE_ACTION = 116;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction <em>Command Property Context Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyContextAction()
	 * @generated
	 */
	int COMMAND_PROPERTY_CONTEXT_ACTION = 117;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorConnectionType()
	 * @generated
	 */
	int SQL_EXECUTOR_CONNECTION_TYPE = 118;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorDatasourceType()
	 * @generated
	 */
	int SQL_EXECUTOR_DATASOURCE_TYPE = 119;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorBooleanValue()
	 * @generated
	 */
	int SQL_EXECUTOR_BOOLEAN_VALUE = 120;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorIsolationLevel()
	 * @generated
	 */
	int SQL_EXECUTOR_ISOLATION_LEVEL = 121;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType <em>Sql Parameter Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterValueType()
	 * @generated
	 */
	int SQL_PARAMETER_VALUE_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType <em>Sql Parameter Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterDataType()
	 * @generated
	 */
	int SQL_PARAMETER_DATA_TYPE = 123;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType <em>Rule Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSourceType()
	 * @generated
	 */
	int RULE_SOURCE_TYPE = 124;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType <em>Rule Fact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactType()
	 * @generated
	 */
	int RULE_FACT_TYPE = 125;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType <em>Rule Fact Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactValueType()
	 * @generated
	 */
	int RULE_FACT_VALUE_TYPE = 126;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType <em>Rule Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultType()
	 * @generated
	 */
	int RULE_RESULT_TYPE = 127;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType <em>Rule Result Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultValueType()
	 * @generated
	 */
	int RULE_RESULT_VALUE_TYPE = 128;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType <em>Smooks IO Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksIODataType()
	 * @generated
	 */
	int SMOOKS_IO_DATA_TYPE = 129;


	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction <em>Expression Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getExpressionAction()
	 * @generated
	 */
	int EXPRESSION_ACTION = 130;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod <em>Output Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOutputMethod()
	 * @generated
	 */
	int OUTPUT_METHOD = 131;


	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.InMediator <em>In Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.InMediator
	 * @generated
	 */
	EClass getInMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator <em>Out Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator
	 * @generated
	 */
	EClass getOutMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DropMediator <em>Drop Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DropMediator
	 * @generated
	 */
	EClass getDropMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator <em>Send Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator
	 * @generated
	 */
	EClass getSendMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getAnonymousEndPoint <em>Anonymous End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getAnonymousEndPoint()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_AnonymousEndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getEndPointReference <em>End Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point Reference</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator#getEndPointReference()
	 * @see #getSendMediator()
	 * @generated
	 */
	EReference getSendMediator_EndPointReference();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator <em>Log Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator
	 * @generated
	 */
	EClass getLogMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogCategory <em>Log Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Category</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogCategory()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogLevel()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogSeparator <em>Log Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Separator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getLogSeparator()
	 * @see #getLogMediator()
	 * @generated
	 */
	EAttribute getLogMediator_LogSeparator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator#getProperties()
	 * @see #getLogMediator()
	 * @generated
	 */
	EReference getLogMediator_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogProperty <em>Log Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogProperty
	 * @generated
	 */
	EClass getLogProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator <em>Filter Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator
	 * @generated
	 */
	EClass getFilterMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getConditionType()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EAttribute getFilterMediator_ConditionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterXpath <em>Filter Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterXpath()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_FilterXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterSource <em>Filter Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Source</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterSource()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_FilterSource();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterRegex <em>Filter Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Regex</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getFilterRegex()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EAttribute getFilterMediator_FilterRegex();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getThenBranch <em>Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getThenBranch()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_ThenBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getElseBranch <em>Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator#getElseBranch()
	 * @see #getFilterMediator()
	 * @generated
	 */
	EReference getFilterMediator_ElseBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterThenBranch <em>Filter Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Then Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterThenBranch
	 * @generated
	 */
	EClass getFilterThenBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterElseBranch <em>Filter Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Else Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterElseBranch
	 * @generated
	 */
	EClass getFilterElseBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator <em>Switch Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator
	 * @generated
	 */
	EClass getSwitchMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getSourceXpath()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_SourceXpath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getCaseBranches <em>Case Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Branches</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getCaseBranches()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_CaseBranches();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getDefaultBranch <em>Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator#getDefaultBranch()
	 * @see #getSwitchMediator()
	 * @generated
	 */
	EReference getSwitchMediator_DefaultBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch <em>Switch Case Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch
	 * @generated
	 */
	EClass getSwitchCaseBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch#getCaseRegex <em>Case Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Regex</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch#getCaseRegex()
	 * @see #getSwitchCaseBranch()
	 * @generated
	 */
	EAttribute getSwitchCaseBranch_CaseRegex();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchDefaultBranch <em>Switch Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Default Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchDefaultBranch
	 * @generated
	 */
	EClass getSwitchDefaultBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator <em>Entitlement Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entitlement Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator
	 * @generated
	 */
	EClass getEntitlementMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getServerURL()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_ServerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getUsername()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator#getPassword()
	 * @see #getEntitlementMediator()
	 * @generated
	 */
	EAttribute getEntitlementMediator_Password();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator <em>Enqueue Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enqueue Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator
	 * @generated
	 */
	EClass getEnqueueMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getExecutor()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EAttribute getEnqueueMediator_Executor();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getPriority()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EAttribute getEnqueueMediator_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator#getSequenceKey()
	 * @see #getEnqueueMediator()
	 * @generated
	 */
	EReference getEnqueueMediator_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator <em>Class Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator
	 * @generated
	 */
	EClass getClassMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator#getClassName()
	 * @see #getClassMediator()
	 * @generated
	 */
	EAttribute getClassMediator_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator#getProperties()
	 * @see #getClassMediator()
	 * @generated
	 */
	EReference getClassMediator_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassProperty <em>Class Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassProperty
	 * @generated
	 */
	EClass getClassProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator <em>Spring Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator
	 * @generated
	 */
	EClass getSpringMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator#getBeanName <em>Bean Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator#getBeanName()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EAttribute getSpringMediator_BeanName();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator#getConfigurationKey()
	 * @see #getSpringMediator()
	 * @generated
	 */
	EReference getSpringMediator_ConfigurationKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator <em>Validate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator
	 * @generated
	 */
	EClass getValidateMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getSourceXpath()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_SourceXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getOnFailBranch <em>On Fail Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Fail Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getOnFailBranch()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_OnFailBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getFeatures()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator#getSchemas()
	 * @see #getValidateMediator()
	 * @generated
	 */
	EReference getValidateMediator_Schemas();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateOnFailBranch <em>Validate On Fail Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate On Fail Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateOnFailBranch
	 * @generated
	 */
	EClass getValidateOnFailBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateFeature <em>Validate Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Feature</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateFeature
	 * @generated
	 */
	EClass getValidateFeature();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema <em>Validate Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Schema</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema
	 * @generated
	 */
	EClass getValidateSchema();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema#getSchemaKey <em>Schema Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema#getSchemaKey()
	 * @see #getValidateSchema()
	 * @generated
	 */
	EReference getValidateSchema_SchemaKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator <em>Script Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator
	 * @generated
	 */
	EClass getScriptMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptType()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Language</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptLanguage()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getMediateFunction <em>Mediate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediate Function</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getMediateFunction()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_MediateFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptKey <em>Script Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptKey()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EReference getScriptMediator_ScriptKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptBody <em>Script Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Body</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator#getScriptBody()
	 * @see #getScriptMediator()
	 * @generated
	 */
	EAttribute getScriptMediator_ScriptBody();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator <em>Smooks Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator
	 * @generated
	 */
	EClass getSmooksMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getConfigurationKey()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_ConfigurationKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getInput()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getOutput()
	 * @see #getSmooksMediator()
	 * @generated
	 */
	EReference getSmooksMediator_Output();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration <em>Smooks In Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks In Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration
	 * @generated
	 */
	EClass getSmooksInConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration#getType()
	 * @see #getSmooksInConfiguration()
	 * @generated
	 */
	EAttribute getSmooksInConfiguration_Type();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration#getExpression()
	 * @see #getSmooksInConfiguration()
	 * @generated
	 */
	EReference getSmooksInConfiguration_Expression();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration <em>Smooks Out Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Out Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration
	 * @generated
	 */
	EClass getSmooksOutConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getType()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Type();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getExpression()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EReference getSmooksOutConfiguration_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getProperty()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getAction()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getOutputMethod <em>Output Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Method</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration#getOutputMethod()
	 * @see #getSmooksOutConfiguration()
	 * @generated
	 */
	EAttribute getSmooksOutConfiguration_OutputMethod();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator <em>Enrich Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrich Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator
	 * @generated
	 */
	EClass getEnrichMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#isCloneSource <em>Clone Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clone Source</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#isCloneSource()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_CloneSource();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceType()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXpath <em>Source Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXpath()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_SourceXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceProperty()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXML <em>Source XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source XML</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getSourceXML()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_SourceXML();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetAction <em>Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetAction()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetType()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetXpath <em>Target Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetXpath()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EReference getEnrichMediator_TargetXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator#getTargetProperty()
	 * @see #getEnrichMediator()
	 * @generated
	 */
	EAttribute getEnrichMediator_TargetProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator <em>Fault Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator
	 * @generated
	 */
	EClass getFaultMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getSoapVersion <em>Soap Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getSoapVersion()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_SoapVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultCodeSoap11 <em>Fault Code Soap11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Code Soap11</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultCodeSoap11()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultCodeSoap11();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultCodeSoap12 <em>Fault Code Soap12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Code Soap12</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultCodeSoap12()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultCodeSoap12();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonType <em>Fault Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Reason Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultReasonType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonValue <em>Fault Reason Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Reason Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultReasonValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonExpression <em>Fault Reason Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Reason Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultReasonExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultReasonExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getRoleName()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getNodeName()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailType <em>Fault Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Detail Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultDetailType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailValue <em>Fault Detail Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Detail Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultDetailValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailExpression <em>Fault Detail Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Detail Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultDetailExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultDetailExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringType <em>Fault String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault String Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringType()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringValue <em>Fault String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault String Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringValue()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultStringValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringExpression <em>Fault String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault String Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultStringExpression()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EReference getFaultMediator_FaultStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultActor <em>Fault Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Actor</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator#getFaultActor()
	 * @see #getFaultMediator()
	 * @generated
	 */
	EAttribute getFaultMediator_FaultActor();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator <em>Aggregate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator
	 * @generated
	 */
	EClass getAggregateMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionTimeout <em>Completion Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Timeout</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionTimeout()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionMinMessages <em>Completion Min Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Min Messages</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionMinMessages()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionMinMessages();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionMaxMessages <em>Completion Max Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Max Messages</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCompletionMaxMessages()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EAttribute getAggregateMediator_CompletionMaxMessages();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCorrelationExpression <em>Correlation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getCorrelationExpression()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_CorrelationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getOnCompleteBranch <em>On Complete Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Complete Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator#getOnCompleteBranch()
	 * @see #getAggregateMediator()
	 * @generated
	 */
	EReference getAggregateMediator_OnCompleteBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch <em>Aggregate On Complete Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate On Complete Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch
	 * @generated
	 */
	EClass getAggregateOnCompleteBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getAggregationExpression <em>Aggregation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregation Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getAggregationExpression()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EReference getAggregateOnCompleteBranch_AggregationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getSequenceType()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EAttribute getAggregateOnCompleteBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch#getSequenceKey()
	 * @see #getAggregateOnCompleteBranch()
	 * @generated
	 */
	EReference getAggregateOnCompleteBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator <em>Router Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator
	 * @generated
	 */
	EClass getRouterMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator#isContinueAfterRouting <em>Continue After Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue After Routing</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator#isContinueAfterRouting()
	 * @see #getRouterMediator()
	 * @generated
	 */
	EAttribute getRouterMediator_ContinueAfterRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator#getRoutes()
	 * @see #getRouterMediator()
	 * @generated
	 */
	EReference getRouterMediator_Routes();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute <em>Router Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Route</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute
	 * @generated
	 */
	EClass getRouterRoute();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#isBreakAfterRoute <em>Break After Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break After Route</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#isBreakAfterRoute()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EAttribute getRouterRoute_BreakAfterRoute();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getRouteExpression <em>Route Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getRouteExpression()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EReference getRouterRoute_RouteExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getRoutePattern <em>Route Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Pattern</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getRoutePattern()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EAttribute getRouterRoute_RoutePattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute#getTarget()
	 * @see #getRouterRoute()
	 * @generated
	 */
	EReference getRouterRoute_Target();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget <em>Route Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget
	 * @generated
	 */
	EClass getRouteTarget();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator <em>Clone Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator
	 * @generated
	 */
	EClass getCloneMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#isContinueParent <em>Continue Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue Parent</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#isContinueParent()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EAttribute getCloneMediator_ContinueParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator#getTargets()
	 * @see #getCloneMediator()
	 * @generated
	 */
	EReference getCloneMediator_Targets();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget <em>Clone Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget
	 * @generated
	 */
	EClass getCloneTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget#getSoapAction()
	 * @see #getCloneTarget()
	 * @generated
	 */
	EAttribute getCloneTarget_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget#getToAddress <em>To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Address</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget#getToAddress()
	 * @see #getCloneTarget()
	 * @generated
	 */
	EAttribute getCloneTarget_ToAddress();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator <em>Iterate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator
	 * @generated
	 */
	EClass getIterateMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isContinueParent <em>Continue Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue Parent</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isContinueParent()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_ContinueParent();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isPreservePayload <em>Preserve Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preserve Payload</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#isPreservePayload()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EAttribute getIterateMediator_PreservePayload();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getIterateExpression <em>Iterate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterate Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getIterateExpression()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_IterateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getAttachPath <em>Attach Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach Path</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getAttachPath()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_AttachPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator#getTarget()
	 * @see #getIterateMediator()
	 * @generated
	 */
	EReference getIterateMediator_Target();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget <em>Iterate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget
	 * @generated
	 */
	EClass getIterateTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget#getSoapAction()
	 * @see #getIterateTarget()
	 * @generated
	 */
	EAttribute getIterateTarget_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget#getToAddress <em>To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Address</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget#getToAddress()
	 * @see #getIterateTarget()
	 * @generated
	 */
	EAttribute getIterateTarget_ToAddress();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator <em>Cache Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator
	 * @generated
	 */
	EClass getCacheMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheId <em>Cache Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheId()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheId();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheScope <em>Cache Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Scope</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheScope()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheScope();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheAction <em>Cache Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheAction()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getHashGenerator <em>Hash Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Generator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getHashGenerator()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_HashGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheTimeout <em>Cache Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Timeout</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getCacheTimeout()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_CacheTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getMaxMessageSize <em>Max Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Size</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getMaxMessageSize()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_MaxMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getImplementationType()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getMaxEntryCount <em>Max Entry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Entry Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getMaxEntryCount()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EAttribute getCacheMediator_MaxEntryCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getOnHitBranch <em>On Hit Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Hit Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator#getOnHitBranch()
	 * @see #getCacheMediator()
	 * @generated
	 */
	EReference getCacheMediator_OnHitBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch <em>Cache On Hit Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache On Hit Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch
	 * @generated
	 */
	EClass getCacheOnHitBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch#getSequenceType()
	 * @see #getCacheOnHitBranch()
	 * @generated
	 */
	EAttribute getCacheOnHitBranch_SequenceType();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch#getSequenceKey()
	 * @see #getCacheOnHitBranch()
	 * @generated
	 */
	EReference getCacheOnHitBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator <em>XSLT Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator
	 * @generated
	 */
	EClass getXSLTMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getXsltKey <em>Xslt Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xslt Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getXsltKey()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_XsltKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getSourceXPath <em>Source XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source XPath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getSourceXPath()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_SourceXPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getProperties()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getFeatures()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator#getResources()
	 * @see #getXSLTMediator()
	 * @generated
	 */
	EReference getXSLTMediator_Resources();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty <em>XSLT Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty
	 * @generated
	 */
	EClass getXSLTProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature <em>XSLT Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Feature</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature
	 * @generated
	 */
	EClass getXSLTFeature();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource <em>XSLT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSLT Resource</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource
	 * @generated
	 */
	EClass getXSLTResource();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator <em>XQuery Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator
	 * @generated
	 */
	EClass getXQueryMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getQueryKey <em>Query Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getQueryKey()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_QueryKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getTargetXPath <em>Target XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target XPath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getTargetXPath()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_TargetXPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator#getVariables()
	 * @see #getXQueryMediator()
	 * @generated
	 */
	EReference getXQueryMediator_Variables();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable <em>XQuery Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XQuery Variable</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable
	 * @generated
	 */
	EClass getXQueryVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getVariableName()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getVariableType()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_VariableType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueType()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueLiteral()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EAttribute getXQueryVariable_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueExpression()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EReference getXQueryVariable_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable#getValueKey()
	 * @see #getXQueryVariable()
	 * @generated
	 */
	EReference getXQueryVariable_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator <em>Callout Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callout Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator
	 * @generated
	 */
	EClass getCalloutMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getServiceURL <em>Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URL</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getServiceURL()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ServiceURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getSoapAction()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPathToAxis2xml <em>Path To Axis2xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Axis2xml</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPathToAxis2xml()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PathToAxis2xml();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPathToAxis2Repository <em>Path To Axis2 Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Axis2 Repository</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPathToAxis2Repository()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PathToAxis2Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadType()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_PayloadType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadMessageXpath <em>Payload Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Message Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadMessageXpath()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_PayloadMessageXpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadRegistryKey <em>Payload Registry Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Registry Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getPayloadRegistryKey()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_PayloadRegistryKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultType()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ResultType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultMessageXpath <em>Result Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Message Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultMessageXpath()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EReference getCalloutMediator_ResultMessageXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultContextProperty <em>Result Context Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Context Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator#getResultContextProperty()
	 * @see #getCalloutMediator()
	 * @generated
	 */
	EAttribute getCalloutMediator_ResultContextProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator <em>RM Sequence Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Sequence Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator
	 * @generated
	 */
	EClass getRMSequenceMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getRmSpecVersion <em>Rm Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm Spec Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getRmSpecVersion()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EAttribute getRMSequenceMediator_RmSpecVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getSequenceType()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EAttribute getRMSequenceMediator_SequenceType();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getCorrelationXpath <em>Correlation Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getCorrelationXpath()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_CorrelationXpath();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getLastMessageXpath <em>Last Message Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Message Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator#getLastMessageXpath()
	 * @see #getRMSequenceMediator()
	 * @generated
	 */
	EReference getRMSequenceMediator_LastMessageXpath();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator <em>Transaction Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator
	 * @generated
	 */
	EClass getTransactionMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator#getAction()
	 * @see #getTransactionMediator()
	 * @generated
	 */
	EAttribute getTransactionMediator_Action();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator <em>Property Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator
	 * @generated
	 */
	EClass getPropertyMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyName()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyDataType <em>Property Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Data Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyDataType()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyAction <em>Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyAction()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueType()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueLiteral()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueExpression()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EReference getPropertyMediator_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueOM <em>Value OM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value OM</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueOM()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueOM();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueStringPattern <em>Value String Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String Pattern</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueStringPattern()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueStringPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueStringCapturingGroup <em>Value String Capturing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String Capturing Group</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getValueStringCapturingGroup()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_ValueStringCapturingGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyScope <em>Property Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Scope</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator#getPropertyScope()
	 * @see #getPropertyMediator()
	 * @generated
	 */
	EAttribute getPropertyMediator_PropertyScope();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator <em>OAuth Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator
	 * @generated
	 */
	EClass getOAuthMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator#getRemoteServiceUrl <em>Remote Service Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Service Url</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator#getRemoteServiceUrl()
	 * @see #getOAuthMediator()
	 * @generated
	 */
	EAttribute getOAuthMediator_RemoteServiceUrl();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleInMediator <em>Autoscale In Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autoscale In Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleInMediator
	 * @generated
	 */
	EClass getAutoscaleInMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleOutMediator <em>Autoscale Out Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autoscale Out Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleOutMediator
	 * @generated
	 */
	EClass getAutoscaleOutMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator <em>Header Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator
	 * @generated
	 */
	EClass getHeaderMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getHeaderName <em>Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getHeaderName()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_HeaderName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getHeaderAction <em>Header Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getHeaderAction()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_HeaderAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueType()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueLiteral()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EAttribute getHeaderMediator_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator#getValueExpression()
	 * @see #getHeaderMediator()
	 * @generated
	 */
	EReference getHeaderMediator_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator <em>Throttle Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator
	 * @generated
	 */
	EClass getThrottleMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getOnAcceptBranch <em>On Accept Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Accept Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getOnAcceptBranch()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_OnAcceptBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getOnRejectBranch <em>On Reject Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Reject Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getOnRejectBranch()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_OnRejectBranch();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration <em>Throttle Policy Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Policy Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration
	 * @generated
	 */
	EClass getThrottlePolicyConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyType()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EAttribute getThrottlePolicyConfiguration_PolicyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyKey()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EReference getThrottlePolicyConfiguration_PolicyKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getMaxConcurrentAccessCount <em>Max Concurrent Access Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Access Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getMaxConcurrentAccessCount()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EAttribute getThrottlePolicyConfiguration_MaxConcurrentAccessCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyEntries <em>Policy Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Entries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration#getPolicyEntries()
	 * @see #getThrottlePolicyConfiguration()
	 * @generated
	 */
	EReference getThrottlePolicyConfiguration_PolicyEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getGroupId()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EAttribute getThrottleMediator_GroupId();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getPolicyConfiguration <em>Policy Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator#getPolicyConfiguration()
	 * @see #getThrottleMediator()
	 * @generated
	 */
	EReference getThrottleMediator_PolicyConfiguration();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch <em>Throttle On Accept Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle On Accept Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch
	 * @generated
	 */
	EClass getThrottleOnAcceptBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch#getSequenceType()
	 * @see #getThrottleOnAcceptBranch()
	 * @generated
	 */
	EAttribute getThrottleOnAcceptBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch#getSequenceKey()
	 * @see #getThrottleOnAcceptBranch()
	 * @generated
	 */
	EReference getThrottleOnAcceptBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch <em>Throttle On Reject Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle On Reject Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch
	 * @generated
	 */
	EClass getThrottleOnRejectBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch#getSequenceType()
	 * @see #getThrottleOnRejectBranch()
	 * @generated
	 */
	EAttribute getThrottleOnRejectBranch_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch#getSequenceKey()
	 * @see #getThrottleOnRejectBranch()
	 * @generated
	 */
	EReference getThrottleOnRejectBranch_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry <em>Throttle Policy Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttle Policy Entry</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry
	 * @generated
	 */
	EClass getThrottlePolicyEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getThrottleType <em>Throttle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getThrottleType()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ThrottleType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getThrottleRange <em>Throttle Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Range</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getThrottleRange()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ThrottleRange();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getAccessType()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getMaxRequestCount <em>Max Request Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Request Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getMaxRequestCount()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_MaxRequestCount();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getUnitTime <em>Unit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Time</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getUnitTime()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_UnitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getProhibitPeriod <em>Prohibit Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prohibit Period</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry#getProhibitPeriod()
	 * @see #getThrottlePolicyEntry()
	 * @generated
	 */
	EAttribute getThrottlePolicyEntry_ProhibitPeriod();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator <em>Command Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator
	 * @generated
	 */
	EClass getCommandMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator#getClassName()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EAttribute getCommandMediator_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator#getProperties()
	 * @see #getCommandMediator()
	 * @generated
	 */
	EReference getCommandMediator_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty <em>Command Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty
	 * @generated
	 */
	EClass getCommandProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getPropertyName()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueType()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueLiteral()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueContextPropertyName <em>Value Context Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Context Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueContextPropertyName()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ValueContextPropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueMessageElementXpath <em>Value Message Element Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Message Element Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getValueMessageElementXpath()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EReference getCommandProperty_ValueMessageElementXpath();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getContextAction <em>Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getContextAction()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_ContextAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getMessageAction <em>Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty#getMessageAction()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_MessageAction();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator <em>Event Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator
	 * @generated
	 */
	EClass getEventMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator#getEventSourceName <em>Event Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Source Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator#getEventSourceName()
	 * @see #getEventMediator()
	 * @generated
	 */
	EAttribute getEventMediator_EventSourceName();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator <em>Abstract Sql Executor Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sql Executor Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator
	 * @generated
	 */
	EClass getAbstractSqlExecutorMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionType()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsType <em>Connection Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsType()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDbDriver <em>Connection Db Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Db Driver</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDbDriver()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDbDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsInitialContext <em>Connection Ds Initial Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Initial Context</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsInitialContext()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsInitialContext();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsName <em>Connection Ds Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Ds Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionDsName()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionDsName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionURL <em>Connection URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection URL</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionURL()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionURL();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionUsername <em>Connection Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Username</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionUsername()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionPassword <em>Connection Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Password</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getConnectionPassword()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_ConnectionPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyAutocommit <em>Property Autocommit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Autocommit</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyAutocommit()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyAutocommit();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyIsolation <em>Property Isolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Isolation</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyIsolation()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyIsolation();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxactive <em>Property Maxactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxactive</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxactive()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxactive();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxidle <em>Property Maxidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxidle</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxopenstatements <em>Property Maxopenstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxopenstatements</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxopenstatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxopenstatements();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxwait <em>Property Maxwait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Maxwait</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMaxwait()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMaxwait();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMinidle <em>Property Minidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Minidle</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyMinidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyMinidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyPoolstatements <em>Property Poolstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Poolstatements</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyPoolstatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyPoolstatements();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyTestonborrow <em>Property Testonborrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Testonborrow</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyTestonborrow()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyTestonborrow();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyTestwhileidle <em>Property Testwhileidle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Testwhileidle</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyTestwhileidle()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyTestwhileidle();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyValidationquery <em>Property Validationquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Validationquery</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyValidationquery()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyValidationquery();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyInitialsize <em>Property Initialsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Initialsize</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getPropertyInitialsize()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EAttribute getAbstractSqlExecutorMediator_PropertyInitialsize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getSqlStatements <em>Sql Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Statements</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator#getSqlStatements()
	 * @see #getAbstractSqlExecutorMediator()
	 * @generated
	 */
	EReference getAbstractSqlExecutorMediator_SqlStatements();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement <em>Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Statement</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement
	 * @generated
	 */
	EClass getSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query String</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getQueryString()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EAttribute getSqlStatement_QueryString();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getParameters()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EReference getSqlStatement_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#isResultsEnabled <em>Results Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#isResultsEnabled()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EAttribute getSqlStatement_ResultsEnabled();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement#getResults()
	 * @see #getSqlStatement()
	 * @generated
	 */
	EReference getSqlStatement_Results();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition <em>Sql Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Parameter Definition</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition
	 * @generated
	 */
	EClass getSqlParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getDataType()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueType()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueLiteral()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EAttribute getSqlParameterDefinition_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition#getValueExpression()
	 * @see #getSqlParameterDefinition()
	 * @generated
	 */
	EReference getSqlParameterDefinition_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping <em>Sql Result Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping
	 * @generated
	 */
	EClass getSqlResultMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping#getPropertyName()
	 * @see #getSqlResultMapping()
	 * @generated
	 */
	EAttribute getSqlResultMapping_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping#getColumnId <em>Column Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping#getColumnId()
	 * @see #getSqlResultMapping()
	 * @generated
	 */
	EAttribute getSqlResultMapping_ColumnId();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DBLookupMediator <em>DB Lookup Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Lookup Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DBLookupMediator
	 * @generated
	 */
	EClass getDBLookupMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator <em>DB Report Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Report Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator
	 * @generated
	 */
	EClass getDBReportMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator#isConnectionUseTransaction <em>Connection Use Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Use Transaction</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator#isConnectionUseTransaction()
	 * @see #getDBReportMediator()
	 * @generated
	 */
	EAttribute getDBReportMediator_ConnectionUseTransaction();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator <em>Rule Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator
	 * @generated
	 */
	EClass getRuleMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getRuleSetConfiguration <em>Rule Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Set Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getRuleSetConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_RuleSetConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getRuleSessionConfiguration <em>Rule Session Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Session Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getRuleSessionConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_RuleSessionConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getFactsConfiguration <em>Facts Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facts Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getFactsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_FactsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getResultsConfiguration <em>Results Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Results Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getResultsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_ResultsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getChildMediatorsConfiguration <em>Child Mediators Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Mediators Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator#getChildMediatorsConfiguration()
	 * @see #getRuleMediator()
	 * @generated
	 */
	EReference getRuleMediator_ChildMediatorsConfiguration();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration <em>Rule Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration
	 * @generated
	 */
	EClass getRuleSetConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceType()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EAttribute getRuleSetConfiguration_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceCode <em>Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Code</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceCode()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EAttribute getRuleSetConfiguration_SourceCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceKey <em>Source Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getSourceKey()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EReference getRuleSetConfiguration_SourceKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration#getProperties()
	 * @see #getRuleSetConfiguration()
	 * @generated
	 */
	EReference getRuleSetConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty <em>Rule Set Creation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set Creation Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty
	 * @generated
	 */
	EClass getRuleSetCreationProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration <em>Rule Session Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Session Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration
	 * @generated
	 */
	EClass getRuleSessionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration#isStatefulSession <em>Stateful Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateful Session</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration#isStatefulSession()
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 */
	EAttribute getRuleSessionConfiguration_StatefulSession();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration#getProperties()
	 * @see #getRuleSessionConfiguration()
	 * @generated
	 */
	EReference getRuleSessionConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionProperty <em>Rule Session Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Session Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionProperty
	 * @generated
	 */
	EClass getRuleSessionProperty();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration <em>Rule Facts Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Facts Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration
	 * @generated
	 */
	EClass getRuleFactsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration#getFacts()
	 * @see #getRuleFactsConfiguration()
	 * @generated
	 */
	EReference getRuleFactsConfiguration_Facts();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact <em>Rule Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Fact</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact
	 * @generated
	 */
	EClass getRuleFact();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactCustomType <em>Fact Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Custom Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactCustomType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactCustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactName <em>Fact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getFactName()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_FactName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueType()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueLiteral()
	 * @see #getRuleFact()
	 * @generated
	 */
	EAttribute getRuleFact_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueExpression()
	 * @see #getRuleFact()
	 * @generated
	 */
	EReference getRuleFact_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact#getValueKey()
	 * @see #getRuleFact()
	 * @generated
	 */
	EReference getRuleFact_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration <em>Rule Results Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Results Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration
	 * @generated
	 */
	EClass getRuleResultsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration#getResults()
	 * @see #getRuleResultsConfiguration()
	 * @generated
	 */
	EReference getRuleResultsConfiguration_Results();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult <em>Rule Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Result</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult
	 * @generated
	 */
	EClass getRuleResult();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultCustomType <em>Result Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Custom Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultCustomType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultCustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultName <em>Result Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getResultName()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ResultName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueType()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueLiteral()
	 * @see #getRuleResult()
	 * @generated
	 */
	EAttribute getRuleResult_ValueLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueExpression()
	 * @see #getRuleResult()
	 * @generated
	 */
	EReference getRuleResult_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueKey <em>Value Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult#getValueKey()
	 * @see #getRuleResult()
	 * @generated
	 */
	EReference getRuleResult_ValueKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleChildMediatorsConfiguration <em>Rule Child Mediators Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Child Mediators Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleChildMediatorsConfiguration
	 * @generated
	 */
	EClass getRuleChildMediatorsConfiguration();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator <em>Sequence Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator
	 * @generated
	 */
	EClass getSequenceMediator();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator#getSequenceKey()
	 * @see #getSequenceMediator()
	 * @generated
	 */
	EReference getSequenceMediator_SequenceKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator <em>Builder Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator
	 * @generated
	 */
	EClass getBuilderMediator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator#getMessageBuilders <em>Message Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Builders</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator#getMessageBuilders()
	 * @see #getBuilderMediator()
	 * @generated
	 */
	EReference getBuilderMediator_MessageBuilders();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder <em>Message Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Builder</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder
	 * @generated
	 */
	EClass getMessageBuilder();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getContentType()
	 * @see #getMessageBuilder()
	 * @generated
	 */
	EAttribute getMessageBuilder_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getBuilderClass <em>Builder Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder Class</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getBuilderClass()
	 * @see #getMessageBuilder()
	 * @generated
	 */
	EAttribute getMessageBuilder_BuilderClass();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getFormatterClass <em>Formatter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatter Class</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder#getFormatterClass()
	 * @see #getMessageBuilder()
	 * @generated
	 */
	EAttribute getMessageBuilder_FormatterClass();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory <em>Log Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Category</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory
	 * @generated
	 */
	EEnum getLogCategory();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Level</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel
	 * @generated
	 */
	EEnum getLogLevel();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType <em>Filter Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Condition Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType
	 * @generated
	 */
	EEnum getFilterConditionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType
	 * @generated
	 */
	EEnum getScriptType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Language</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage
	 * @generated
	 */
	EEnum getScriptLanguage();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType <em>Enrich Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Source Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType
	 * @generated
	 */
	EEnum getEnrichSourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction <em>Enrich Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Target Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction
	 * @generated
	 */
	EEnum getEnrichTargetAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType <em>Enrich Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enrich Target Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType
	 * @generated
	 */
	EEnum getEnrichTargetType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion <em>Fault Soap Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Soap Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion
	 * @generated
	 */
	EEnum getFaultSoapVersion();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11 <em>Fault Code Soap11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Code Soap11</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11
	 * @generated
	 */
	EEnum getFaultCodeSoap11();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12 <em>Fault Code Soap12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Code Soap12</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12
	 * @generated
	 */
	EEnum getFaultCodeSoap12();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType <em>Fault String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault String Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType
	 * @generated
	 */
	EEnum getFaultStringType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType <em>Fault Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Reason Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType
	 * @generated
	 */
	EEnum getFaultReasonType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType <em>Fault Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Detail Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType
	 * @generated
	 */
	EEnum getFaultDetailType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType <em>Aggregate Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregate Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType
	 * @generated
	 */
	EEnum getAggregateSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType <em>Cache Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType
	 * @generated
	 */
	EEnum getCacheSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType <em>Cache Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Implementation Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType
	 * @generated
	 */
	EEnum getCacheImplementationType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction <em>Cache Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction
	 * @generated
	 */
	EEnum getCacheAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope <em>Cache Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Scope</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope
	 * @generated
	 */
	EEnum getCacheScope();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType <em>XQuery Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XQuery Variable Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType
	 * @generated
	 */
	EEnum getXQueryVariableType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType <em>XQuery Variable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XQuery Variable Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType
	 * @generated
	 */
	EEnum getXQueryVariableValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType <em>Callout Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callout Payload Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType
	 * @generated
	 */
	EEnum getCalloutPayloadType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType <em>Callout Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callout Result Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType
	 * @generated
	 */
	EEnum getCalloutResultType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion <em>RM Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RM Spec Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion
	 * @generated
	 */
	EEnum getRMSpecVersion();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType <em>RM Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RM Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType
	 * @generated
	 */
	EEnum getRMSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction <em>Transaction Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction
	 * @generated
	 */
	EEnum getTransactionAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType <em>Property Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Data Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType
	 * @generated
	 */
	EEnum getPropertyDataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction <em>Property Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction
	 * @generated
	 */
	EEnum getPropertyAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType
	 * @generated
	 */
	EEnum getPropertyValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope <em>Property Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Scope</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope
	 * @generated
	 */
	EEnum getPropertyScope();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction <em>Header Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Header Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction
	 * @generated
	 */
	EEnum getHeaderAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType <em>Header Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Header Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType
	 * @generated
	 */
	EEnum getHeaderValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType <em>Throttle Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Policy Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType
	 * @generated
	 */
	EEnum getThrottlePolicyType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType <em>Throttle Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Condition Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType
	 * @generated
	 */
	EEnum getThrottleConditionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType <em>Throttle Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Access Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType
	 * @generated
	 */
	EEnum getThrottleAccessType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType <em>Throttle Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throttle Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType
	 * @generated
	 */
	EEnum getThrottleSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType <em>Command Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType
	 * @generated
	 */
	EEnum getCommandPropertyValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction <em>Command Property Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Message Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction
	 * @generated
	 */
	EEnum getCommandPropertyMessageAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction <em>Command Property Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Property Context Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction
	 * @generated
	 */
	EEnum getCommandPropertyContextAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Connection Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType
	 * @generated
	 */
	EEnum getSqlExecutorConnectionType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Datasource Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType
	 * @generated
	 */
	EEnum getSqlExecutorDatasourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Boolean Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue
	 * @generated
	 */
	EEnum getSqlExecutorBooleanValue();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Executor Isolation Level</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel
	 * @generated
	 */
	EEnum getSqlExecutorIsolationLevel();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType <em>Sql Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Parameter Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType
	 * @generated
	 */
	EEnum getSqlParameterValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType <em>Sql Parameter Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Parameter Data Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType
	 * @generated
	 */
	EEnum getSqlParameterDataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType <em>Rule Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Source Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType
	 * @generated
	 */
	EEnum getRuleSourceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType <em>Rule Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Fact Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType
	 * @generated
	 */
	EEnum getRuleFactType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType <em>Rule Fact Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Fact Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType
	 * @generated
	 */
	EEnum getRuleFactValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType <em>Rule Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Result Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType
	 * @generated
	 */
	EEnum getRuleResultType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType <em>Rule Result Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Result Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType
	 * @generated
	 */
	EEnum getRuleResultValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType <em>Smooks IO Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Smooks IO Data Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType
	 * @generated
	 */
	EEnum getSmooksIODataType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction
	 * @generated
	 */
	EEnum getExpressionAction();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod <em>Output Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Method</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod
	 * @generated
	 */
	EEnum getOutputMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MediatorFactory getMediatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.InMediatorImpl <em>In Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.InMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getInMediator()
		 * @generated
		 */
		EClass IN_MEDIATOR = eINSTANCE.getInMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.OutMediatorImpl <em>Out Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.OutMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOutMediator()
		 * @generated
		 */
		EClass OUT_MEDIATOR = eINSTANCE.getOutMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DropMediatorImpl <em>Drop Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DropMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDropMediator()
		 * @generated
		 */
		EClass DROP_MEDIATOR = eINSTANCE.getDropMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl <em>Send Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSendMediator()
		 * @generated
		 */
		EClass SEND_MEDIATOR = eINSTANCE.getSendMediator();
		/**
		 * The meta object literal for the '<em><b>Anonymous End Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__ANONYMOUS_END_POINT = eINSTANCE.getSendMediator_AnonymousEndPoint();
		/**
		 * The meta object literal for the '<em><b>End Point Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MEDIATOR__END_POINT_REFERENCE = eINSTANCE.getSendMediator_EndPointReference();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogMediatorImpl <em>Log Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogMediator()
		 * @generated
		 */
		EClass LOG_MEDIATOR = eINSTANCE.getLogMediator();
		/**
		 * The meta object literal for the '<em><b>Log Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_CATEGORY = eINSTANCE.getLogMediator_LogCategory();
		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_LEVEL = eINSTANCE.getLogMediator_LogLevel();
		/**
		 * The meta object literal for the '<em><b>Log Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MEDIATOR__LOG_SEPARATOR = eINSTANCE.getLogMediator_LogSeparator();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MEDIATOR__PROPERTIES = eINSTANCE.getLogMediator_Properties();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogPropertyImpl <em>Log Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.LogPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogProperty()
		 * @generated
		 */
		EClass LOG_PROPERTY = eINSTANCE.getLogProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterMediatorImpl <em>Filter Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterMediator()
		 * @generated
		 */
		EClass FILTER_MEDIATOR = eINSTANCE.getFilterMediator();
		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MEDIATOR__CONDITION_TYPE = eINSTANCE.getFilterMediator_ConditionType();
		/**
		 * The meta object literal for the '<em><b>Filter Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__FILTER_XPATH = eINSTANCE.getFilterMediator_FilterXpath();
		/**
		 * The meta object literal for the '<em><b>Filter Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__FILTER_SOURCE = eINSTANCE.getFilterMediator_FilterSource();
		/**
		 * The meta object literal for the '<em><b>Filter Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MEDIATOR__FILTER_REGEX = eINSTANCE.getFilterMediator_FilterRegex();
		/**
		 * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__THEN_BRANCH = eINSTANCE.getFilterMediator_ThenBranch();
		/**
		 * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MEDIATOR__ELSE_BRANCH = eINSTANCE.getFilterMediator_ElseBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterThenBranchImpl <em>Filter Then Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterThenBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterThenBranch()
		 * @generated
		 */
		EClass FILTER_THEN_BRANCH = eINSTANCE.getFilterThenBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterElseBranchImpl <em>Filter Else Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FilterElseBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterElseBranch()
		 * @generated
		 */
		EClass FILTER_ELSE_BRANCH = eINSTANCE.getFilterElseBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchMediatorImpl <em>Switch Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchMediator()
		 * @generated
		 */
		EClass SWITCH_MEDIATOR = eINSTANCE.getSwitchMediator();
		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__SOURCE_XPATH = eINSTANCE.getSwitchMediator_SourceXpath();
		/**
		 * The meta object literal for the '<em><b>Case Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__CASE_BRANCHES = eINSTANCE.getSwitchMediator_CaseBranches();
		/**
		 * The meta object literal for the '<em><b>Default Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_MEDIATOR__DEFAULT_BRANCH = eINSTANCE.getSwitchMediator_DefaultBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchCaseBranchImpl <em>Switch Case Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchCaseBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchCaseBranch()
		 * @generated
		 */
		EClass SWITCH_CASE_BRANCH = eINSTANCE.getSwitchCaseBranch();
		/**
		 * The meta object literal for the '<em><b>Case Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_CASE_BRANCH__CASE_REGEX = eINSTANCE.getSwitchCaseBranch_CaseRegex();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchDefaultBranchImpl <em>Switch Default Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SwitchDefaultBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSwitchDefaultBranch()
		 * @generated
		 */
		EClass SWITCH_DEFAULT_BRANCH = eINSTANCE.getSwitchDefaultBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EntitlementMediatorImpl <em>Entitlement Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EntitlementMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEntitlementMediator()
		 * @generated
		 */
		EClass ENTITLEMENT_MEDIATOR = eINSTANCE.getEntitlementMediator();
		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__SERVER_URL = eINSTANCE.getEntitlementMediator_ServerURL();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__USERNAME = eINSTANCE.getEntitlementMediator_Username();
		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITLEMENT_MEDIATOR__PASSWORD = eINSTANCE.getEntitlementMediator_Password();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl <em>Enqueue Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnqueueMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnqueueMediator()
		 * @generated
		 */
		EClass ENQUEUE_MEDIATOR = eINSTANCE.getEnqueueMediator();
		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENQUEUE_MEDIATOR__EXECUTOR = eINSTANCE.getEnqueueMediator_Executor();
		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENQUEUE_MEDIATOR__PRIORITY = eINSTANCE.getEnqueueMediator_Priority();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENQUEUE_MEDIATOR__SEQUENCE_KEY = eINSTANCE.getEnqueueMediator_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassMediatorImpl <em>Class Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getClassMediator()
		 * @generated
		 */
		EClass CLASS_MEDIATOR = eINSTANCE.getClassMediator();
		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MEDIATOR__CLASS_NAME = eINSTANCE.getClassMediator_ClassName();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MEDIATOR__PROPERTIES = eINSTANCE.getClassMediator_Properties();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassPropertyImpl <em>Class Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ClassPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getClassProperty()
		 * @generated
		 */
		EClass CLASS_PROPERTY = eINSTANCE.getClassProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl <em>Spring Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SpringMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSpringMediator()
		 * @generated
		 */
		EClass SPRING_MEDIATOR = eINSTANCE.getSpringMediator();
		/**
		 * The meta object literal for the '<em><b>Bean Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_MEDIATOR__BEAN_NAME = eINSTANCE.getSpringMediator_BeanName();
		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_MEDIATOR__CONFIGURATION_KEY = eINSTANCE.getSpringMediator_ConfigurationKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateMediatorImpl <em>Validate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateMediator()
		 * @generated
		 */
		EClass VALIDATE_MEDIATOR = eINSTANCE.getValidateMediator();
		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__SOURCE_XPATH = eINSTANCE.getValidateMediator_SourceXpath();
		/**
		 * The meta object literal for the '<em><b>On Fail Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__ON_FAIL_BRANCH = eINSTANCE.getValidateMediator_OnFailBranch();
		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__FEATURES = eINSTANCE.getValidateMediator_Features();
		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_MEDIATOR__SCHEMAS = eINSTANCE.getValidateMediator_Schemas();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateOnFailBranchImpl <em>Validate On Fail Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateOnFailBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateOnFailBranch()
		 * @generated
		 */
		EClass VALIDATE_ON_FAIL_BRANCH = eINSTANCE.getValidateOnFailBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateFeatureImpl <em>Validate Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateFeatureImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateFeature()
		 * @generated
		 */
		EClass VALIDATE_FEATURE = eINSTANCE.getValidateFeature();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateSchemaImpl <em>Validate Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ValidateSchemaImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getValidateSchema()
		 * @generated
		 */
		EClass VALIDATE_SCHEMA = eINSTANCE.getValidateSchema();
		/**
		 * The meta object literal for the '<em><b>Schema Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE_SCHEMA__SCHEMA_KEY = eINSTANCE.getValidateSchema_SchemaKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ScriptMediatorImpl <em>Script Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ScriptMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptMediator()
		 * @generated
		 */
		EClass SCRIPT_MEDIATOR = eINSTANCE.getScriptMediator();
		/**
		 * The meta object literal for the '<em><b>Script Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_TYPE = eINSTANCE.getScriptMediator_ScriptType();
		/**
		 * The meta object literal for the '<em><b>Script Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_LANGUAGE = eINSTANCE.getScriptMediator_ScriptLanguage();
		/**
		 * The meta object literal for the '<em><b>Mediate Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__MEDIATE_FUNCTION = eINSTANCE.getScriptMediator_MediateFunction();
		/**
		 * The meta object literal for the '<em><b>Script Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MEDIATOR__SCRIPT_KEY = eINSTANCE.getScriptMediator_ScriptKey();
		/**
		 * The meta object literal for the '<em><b>Script Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MEDIATOR__SCRIPT_BODY = eINSTANCE.getScriptMediator_ScriptBody();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksMediatorImpl <em>Smooks Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksMediator()
		 * @generated
		 */
		EClass SMOOKS_MEDIATOR = eINSTANCE.getSmooksMediator();
		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__CONFIGURATION_KEY = eINSTANCE.getSmooksMediator_ConfigurationKey();
		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__INPUT = eINSTANCE.getSmooksMediator_Input();
		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_MEDIATOR__OUTPUT = eINSTANCE.getSmooksMediator_Output();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksInConfigurationImpl <em>Smooks In Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksInConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksInConfiguration()
		 * @generated
		 */
		EClass SMOOKS_IN_CONFIGURATION = eINSTANCE.getSmooksInConfiguration();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_IN_CONFIGURATION__TYPE = eINSTANCE.getSmooksInConfiguration_Type();
		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_IN_CONFIGURATION__EXPRESSION = eINSTANCE.getSmooksInConfiguration_Expression();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksOutConfigurationImpl <em>Smooks Out Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SmooksOutConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksOutConfiguration()
		 * @generated
		 */
		EClass SMOOKS_OUT_CONFIGURATION = eINSTANCE.getSmooksOutConfiguration();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__TYPE = eINSTANCE.getSmooksOutConfiguration_Type();
		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMOOKS_OUT_CONFIGURATION__EXPRESSION = eINSTANCE.getSmooksOutConfiguration_Expression();
		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__PROPERTY = eINSTANCE.getSmooksOutConfiguration_Property();
		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__ACTION = eINSTANCE.getSmooksOutConfiguration_Action();
		/**
		 * The meta object literal for the '<em><b>Output Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD = eINSTANCE.getSmooksOutConfiguration_OutputMethod();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl <em>Enrich Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichMediator()
		 * @generated
		 */
		EClass ENRICH_MEDIATOR = eINSTANCE.getEnrichMediator();
		/**
		 * The meta object literal for the '<em><b>Clone Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__CLONE_SOURCE = eINSTANCE.getEnrichMediator_CloneSource();
		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_TYPE = eINSTANCE.getEnrichMediator_SourceType();
		/**
		 * The meta object literal for the '<em><b>Source Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__SOURCE_XPATH = eINSTANCE.getEnrichMediator_SourceXpath();
		/**
		 * The meta object literal for the '<em><b>Source Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_PROPERTY = eINSTANCE.getEnrichMediator_SourceProperty();
		/**
		 * The meta object literal for the '<em><b>Source XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__SOURCE_XML = eINSTANCE.getEnrichMediator_SourceXML();
		/**
		 * The meta object literal for the '<em><b>Target Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_ACTION = eINSTANCE.getEnrichMediator_TargetAction();
		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_TYPE = eINSTANCE.getEnrichMediator_TargetType();
		/**
		 * The meta object literal for the '<em><b>Target Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENRICH_MEDIATOR__TARGET_XPATH = eINSTANCE.getEnrichMediator_TargetXpath();
		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENRICH_MEDIATOR__TARGET_PROPERTY = eINSTANCE.getEnrichMediator_TargetProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.FaultMediatorImpl <em>Fault Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.FaultMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultMediator()
		 * @generated
		 */
		EClass FAULT_MEDIATOR = eINSTANCE.getFaultMediator();
		/**
		 * The meta object literal for the '<em><b>Soap Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__SOAP_VERSION = eINSTANCE.getFaultMediator_SoapVersion();
		/**
		 * The meta object literal for the '<em><b>Fault Code Soap11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_CODE_SOAP11 = eINSTANCE.getFaultMediator_FaultCodeSoap11();
		/**
		 * The meta object literal for the '<em><b>Fault Code Soap12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_CODE_SOAP12 = eINSTANCE.getFaultMediator_FaultCodeSoap12();
		/**
		 * The meta object literal for the '<em><b>Fault Reason Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_REASON_TYPE = eINSTANCE.getFaultMediator_FaultReasonType();
		/**
		 * The meta object literal for the '<em><b>Fault Reason Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_REASON_VALUE = eINSTANCE.getFaultMediator_FaultReasonValue();
		/**
		 * The meta object literal for the '<em><b>Fault Reason Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_REASON_EXPRESSION = eINSTANCE.getFaultMediator_FaultReasonExpression();
		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__ROLE_NAME = eINSTANCE.getFaultMediator_RoleName();
		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__NODE_NAME = eINSTANCE.getFaultMediator_NodeName();
		/**
		 * The meta object literal for the '<em><b>Fault Detail Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_DETAIL_TYPE = eINSTANCE.getFaultMediator_FaultDetailType();
		/**
		 * The meta object literal for the '<em><b>Fault Detail Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_DETAIL_VALUE = eINSTANCE.getFaultMediator_FaultDetailValue();
		/**
		 * The meta object literal for the '<em><b>Fault Detail Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_DETAIL_EXPRESSION = eINSTANCE.getFaultMediator_FaultDetailExpression();
		/**
		 * The meta object literal for the '<em><b>Fault String Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_STRING_TYPE = eINSTANCE.getFaultMediator_FaultStringType();
		/**
		 * The meta object literal for the '<em><b>Fault String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_STRING_VALUE = eINSTANCE.getFaultMediator_FaultStringValue();
		/**
		 * The meta object literal for the '<em><b>Fault String Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_MEDIATOR__FAULT_STRING_EXPRESSION = eINSTANCE.getFaultMediator_FaultStringExpression();
		/**
		 * The meta object literal for the '<em><b>Fault Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_MEDIATOR__FAULT_ACTOR = eINSTANCE.getFaultMediator_FaultActor();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl <em>Aggregate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateMediator()
		 * @generated
		 */
		EClass AGGREGATE_MEDIATOR = eINSTANCE.getAggregateMediator();
		/**
		 * The meta object literal for the '<em><b>Completion Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT = eINSTANCE.getAggregateMediator_CompletionTimeout();
		/**
		 * The meta object literal for the '<em><b>Completion Min Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES = eINSTANCE.getAggregateMediator_CompletionMinMessages();
		/**
		 * The meta object literal for the '<em><b>Completion Max Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES = eINSTANCE.getAggregateMediator_CompletionMaxMessages();
		/**
		 * The meta object literal for the '<em><b>Correlation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION = eINSTANCE.getAggregateMediator_CorrelationExpression();
		/**
		 * The meta object literal for the '<em><b>On Complete Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_MEDIATOR__ON_COMPLETE_BRANCH = eINSTANCE.getAggregateMediator_OnCompleteBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateOnCompleteBranchImpl <em>Aggregate On Complete Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AggregateOnCompleteBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateOnCompleteBranch()
		 * @generated
		 */
		EClass AGGREGATE_ON_COMPLETE_BRANCH = eINSTANCE.getAggregateOnCompleteBranch();
		/**
		 * The meta object literal for the '<em><b>Aggregation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_ON_COMPLETE_BRANCH__AGGREGATION_EXPRESSION = eINSTANCE.getAggregateOnCompleteBranch_AggregationExpression();
		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_TYPE = eINSTANCE.getAggregateOnCompleteBranch_SequenceType();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_ON_COMPLETE_BRANCH__SEQUENCE_KEY = eINSTANCE.getAggregateOnCompleteBranch_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterMediatorImpl <em>Router Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouterMediator()
		 * @generated
		 */
		EClass ROUTER_MEDIATOR = eINSTANCE.getRouterMediator();
		/**
		 * The meta object literal for the '<em><b>Continue After Routing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_MEDIATOR__CONTINUE_AFTER_ROUTING = eINSTANCE.getRouterMediator_ContinueAfterRouting();
		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_MEDIATOR__ROUTES = eINSTANCE.getRouterMediator_Routes();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterRouteImpl <em>Router Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouterRouteImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouterRoute()
		 * @generated
		 */
		EClass ROUTER_ROUTE = eINSTANCE.getRouterRoute();
		/**
		 * The meta object literal for the '<em><b>Break After Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_ROUTE__BREAK_AFTER_ROUTE = eINSTANCE.getRouterRoute_BreakAfterRoute();
		/**
		 * The meta object literal for the '<em><b>Route Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_ROUTE__ROUTE_EXPRESSION = eINSTANCE.getRouterRoute_RouteExpression();
		/**
		 * The meta object literal for the '<em><b>Route Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_ROUTE__ROUTE_PATTERN = eINSTANCE.getRouterRoute_RoutePattern();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_ROUTE__TARGET = eINSTANCE.getRouterRoute_Target();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouteTargetImpl <em>Route Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RouteTargetImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRouteTarget()
		 * @generated
		 */
		EClass ROUTE_TARGET = eINSTANCE.getRouteTarget();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl <em>Clone Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCloneMediator()
		 * @generated
		 */
		EClass CLONE_MEDIATOR = eINSTANCE.getCloneMediator();
		/**
		 * The meta object literal for the '<em><b>Continue Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_MEDIATOR__CONTINUE_PARENT = eINSTANCE.getCloneMediator_ContinueParent();
		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONE_MEDIATOR__TARGETS = eINSTANCE.getCloneMediator_Targets();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneTargetImpl <em>Clone Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneTargetImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCloneTarget()
		 * @generated
		 */
		EClass CLONE_TARGET = eINSTANCE.getCloneTarget();
		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_TARGET__SOAP_ACTION = eINSTANCE.getCloneTarget_SoapAction();
		/**
		 * The meta object literal for the '<em><b>To Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_TARGET__TO_ADDRESS = eINSTANCE.getCloneTarget_ToAddress();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateMediatorImpl <em>Iterate Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getIterateMediator()
		 * @generated
		 */
		EClass ITERATE_MEDIATOR = eINSTANCE.getIterateMediator();
		/**
		 * The meta object literal for the '<em><b>Continue Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__CONTINUE_PARENT = eINSTANCE.getIterateMediator_ContinueParent();
		/**
		 * The meta object literal for the '<em><b>Preserve Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_MEDIATOR__PRESERVE_PAYLOAD = eINSTANCE.getIterateMediator_PreservePayload();
		/**
		 * The meta object literal for the '<em><b>Iterate Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__ITERATE_EXPRESSION = eINSTANCE.getIterateMediator_IterateExpression();
		/**
		 * The meta object literal for the '<em><b>Attach Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__ATTACH_PATH = eINSTANCE.getIterateMediator_AttachPath();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_MEDIATOR__TARGET = eINSTANCE.getIterateMediator_Target();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateTargetImpl <em>Iterate Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.IterateTargetImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getIterateTarget()
		 * @generated
		 */
		EClass ITERATE_TARGET = eINSTANCE.getIterateTarget();
		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TARGET__SOAP_ACTION = eINSTANCE.getIterateTarget_SoapAction();
		/**
		 * The meta object literal for the '<em><b>To Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE_TARGET__TO_ADDRESS = eINSTANCE.getIterateTarget_ToAddress();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheMediatorImpl <em>Cache Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheMediator()
		 * @generated
		 */
		EClass CACHE_MEDIATOR = eINSTANCE.getCacheMediator();
		/**
		 * The meta object literal for the '<em><b>Cache Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_ID = eINSTANCE.getCacheMediator_CacheId();
		/**
		 * The meta object literal for the '<em><b>Cache Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_SCOPE = eINSTANCE.getCacheMediator_CacheScope();
		/**
		 * The meta object literal for the '<em><b>Cache Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_ACTION = eINSTANCE.getCacheMediator_CacheAction();
		/**
		 * The meta object literal for the '<em><b>Hash Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__HASH_GENERATOR = eINSTANCE.getCacheMediator_HashGenerator();
		/**
		 * The meta object literal for the '<em><b>Cache Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__CACHE_TIMEOUT = eINSTANCE.getCacheMediator_CacheTimeout();
		/**
		 * The meta object literal for the '<em><b>Max Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__MAX_MESSAGE_SIZE = eINSTANCE.getCacheMediator_MaxMessageSize();
		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__IMPLEMENTATION_TYPE = eINSTANCE.getCacheMediator_ImplementationType();
		/**
		 * The meta object literal for the '<em><b>Max Entry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_MEDIATOR__MAX_ENTRY_COUNT = eINSTANCE.getCacheMediator_MaxEntryCount();
		/**
		 * The meta object literal for the '<em><b>On Hit Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_MEDIATOR__ON_HIT_BRANCH = eINSTANCE.getCacheMediator_OnHitBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheOnHitBranchImpl <em>Cache On Hit Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CacheOnHitBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheOnHitBranch()
		 * @generated
		 */
		EClass CACHE_ON_HIT_BRANCH = eINSTANCE.getCacheOnHitBranch();
		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_ON_HIT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getCacheOnHitBranch_SequenceType();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_ON_HIT_BRANCH__SEQUENCE_KEY = eINSTANCE.getCacheOnHitBranch_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl <em>XSLT Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTMediator()
		 * @generated
		 */
		EClass XSLT_MEDIATOR = eINSTANCE.getXSLTMediator();
		/**
		 * The meta object literal for the '<em><b>Xslt Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__XSLT_KEY = eINSTANCE.getXSLTMediator_XsltKey();
		/**
		 * The meta object literal for the '<em><b>Source XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__SOURCE_XPATH = eINSTANCE.getXSLTMediator_SourceXPath();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__PROPERTIES = eINSTANCE.getXSLTMediator_Properties();
		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__FEATURES = eINSTANCE.getXSLTMediator_Features();
		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSLT_MEDIATOR__RESOURCES = eINSTANCE.getXSLTMediator_Resources();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTPropertyImpl <em>XSLT Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTProperty()
		 * @generated
		 */
		EClass XSLT_PROPERTY = eINSTANCE.getXSLTProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTFeatureImpl <em>XSLT Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTFeatureImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTFeature()
		 * @generated
		 */
		EClass XSLT_FEATURE = eINSTANCE.getXSLTFeature();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTResourceImpl <em>XSLT Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTResourceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXSLTResource()
		 * @generated
		 */
		EClass XSLT_RESOURCE = eINSTANCE.getXSLTResource();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl <em>XQuery Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryMediator()
		 * @generated
		 */
		EClass XQUERY_MEDIATOR = eINSTANCE.getXQueryMediator();
		/**
		 * The meta object literal for the '<em><b>Query Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__QUERY_KEY = eINSTANCE.getXQueryMediator_QueryKey();
		/**
		 * The meta object literal for the '<em><b>Target XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__TARGET_XPATH = eINSTANCE.getXQueryMediator_TargetXPath();
		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_MEDIATOR__VARIABLES = eINSTANCE.getXQueryMediator_Variables();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryVariableImpl <em>XQuery Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.XQueryVariableImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariable()
		 * @generated
		 */
		EClass XQUERY_VARIABLE = eINSTANCE.getXQueryVariable();
		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VARIABLE_NAME = eINSTANCE.getXQueryVariable_VariableName();
		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VARIABLE_TYPE = eINSTANCE.getXQueryVariable_VariableType();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VALUE_TYPE = eINSTANCE.getXQueryVariable_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XQUERY_VARIABLE__VALUE_LITERAL = eINSTANCE.getXQueryVariable_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_VARIABLE__VALUE_EXPRESSION = eINSTANCE.getXQueryVariable_ValueExpression();
		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XQUERY_VARIABLE__VALUE_KEY = eINSTANCE.getXQueryVariable_ValueKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CalloutMediatorImpl <em>Callout Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CalloutMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutMediator()
		 * @generated
		 */
		EClass CALLOUT_MEDIATOR = eINSTANCE.getCalloutMediator();
		/**
		 * The meta object literal for the '<em><b>Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__SERVICE_URL = eINSTANCE.getCalloutMediator_ServiceURL();
		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__SOAP_ACTION = eINSTANCE.getCalloutMediator_SoapAction();
		/**
		 * The meta object literal for the '<em><b>Path To Axis2xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PATH_TO_AXIS2XML = eINSTANCE.getCalloutMediator_PathToAxis2xml();
		/**
		 * The meta object literal for the '<em><b>Path To Axis2 Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY = eINSTANCE.getCalloutMediator_PathToAxis2Repository();
		/**
		 * The meta object literal for the '<em><b>Payload Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__PAYLOAD_TYPE = eINSTANCE.getCalloutMediator_PayloadType();
		/**
		 * The meta object literal for the '<em><b>Payload Message Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH = eINSTANCE.getCalloutMediator_PayloadMessageXpath();
		/**
		 * The meta object literal for the '<em><b>Payload Registry Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__PAYLOAD_REGISTRY_KEY = eINSTANCE.getCalloutMediator_PayloadRegistryKey();
		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__RESULT_TYPE = eINSTANCE.getCalloutMediator_ResultType();
		/**
		 * The meta object literal for the '<em><b>Result Message Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH = eINSTANCE.getCalloutMediator_ResultMessageXpath();
		/**
		 * The meta object literal for the '<em><b>Result Context Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY = eINSTANCE.getCalloutMediator_ResultContextProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RMSequenceMediatorImpl <em>RM Sequence Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RMSequenceMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSequenceMediator()
		 * @generated
		 */
		EClass RM_SEQUENCE_MEDIATOR = eINSTANCE.getRMSequenceMediator();
		/**
		 * The meta object literal for the '<em><b>Rm Spec Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION = eINSTANCE.getRMSequenceMediator_RmSpecVersion();
		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE = eINSTANCE.getRMSequenceMediator_SequenceType();
		/**
		 * The meta object literal for the '<em><b>Correlation Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__CORRELATION_XPATH = eINSTANCE.getRMSequenceMediator_CorrelationXpath();
		/**
		 * The meta object literal for the '<em><b>Last Message Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_SEQUENCE_MEDIATOR__LAST_MESSAGE_XPATH = eINSTANCE.getRMSequenceMediator_LastMessageXpath();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.TransactionMediatorImpl <em>Transaction Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.TransactionMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getTransactionMediator()
		 * @generated
		 */
		EClass TRANSACTION_MEDIATOR = eINSTANCE.getTransactionMediator();
		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_MEDIATOR__ACTION = eINSTANCE.getTransactionMediator_Action();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.PropertyMediatorImpl <em>Property Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.PropertyMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyMediator()
		 * @generated
		 */
		EClass PROPERTY_MEDIATOR = eINSTANCE.getPropertyMediator();
		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_NAME = eINSTANCE.getPropertyMediator_PropertyName();
		/**
		 * The meta object literal for the '<em><b>Property Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE = eINSTANCE.getPropertyMediator_PropertyDataType();
		/**
		 * The meta object literal for the '<em><b>Property Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_ACTION = eINSTANCE.getPropertyMediator_PropertyAction();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_TYPE = eINSTANCE.getPropertyMediator_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_LITERAL = eINSTANCE.getPropertyMediator_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MEDIATOR__VALUE_EXPRESSION = eINSTANCE.getPropertyMediator_ValueExpression();
		/**
		 * The meta object literal for the '<em><b>Value OM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_OM = eINSTANCE.getPropertyMediator_ValueOM();
		/**
		 * The meta object literal for the '<em><b>Value String Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_STRING_PATTERN = eINSTANCE.getPropertyMediator_ValueStringPattern();
		/**
		 * The meta object literal for the '<em><b>Value String Capturing Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP = eINSTANCE.getPropertyMediator_ValueStringCapturingGroup();
		/**
		 * The meta object literal for the '<em><b>Property Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MEDIATOR__PROPERTY_SCOPE = eINSTANCE.getPropertyMediator_PropertyScope();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.OAuthMediatorImpl <em>OAuth Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.OAuthMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOAuthMediator()
		 * @generated
		 */
		EClass OAUTH_MEDIATOR = eINSTANCE.getOAuthMediator();
		/**
		 * The meta object literal for the '<em><b>Remote Service Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_MEDIATOR__REMOTE_SERVICE_URL = eINSTANCE.getOAuthMediator_RemoteServiceUrl();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleInMediatorImpl <em>Autoscale In Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleInMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAutoscaleInMediator()
		 * @generated
		 */
		EClass AUTOSCALE_IN_MEDIATOR = eINSTANCE.getAutoscaleInMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleOutMediatorImpl <em>Autoscale Out Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AutoscaleOutMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAutoscaleOutMediator()
		 * @generated
		 */
		EClass AUTOSCALE_OUT_MEDIATOR = eINSTANCE.getAutoscaleOutMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.HeaderMediatorImpl <em>Header Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.HeaderMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderMediator()
		 * @generated
		 */
		EClass HEADER_MEDIATOR = eINSTANCE.getHeaderMediator();
		/**
		 * The meta object literal for the '<em><b>Header Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__HEADER_NAME = eINSTANCE.getHeaderMediator_HeaderName();
		/**
		 * The meta object literal for the '<em><b>Header Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__HEADER_ACTION = eINSTANCE.getHeaderMediator_HeaderAction();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__VALUE_TYPE = eINSTANCE.getHeaderMediator_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_MEDIATOR__VALUE_LITERAL = eINSTANCE.getHeaderMediator_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_MEDIATOR__VALUE_EXPRESSION = eINSTANCE.getHeaderMediator_ValueExpression();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleMediatorImpl <em>Throttle Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleMediator()
		 * @generated
		 */
		EClass THROTTLE_MEDIATOR = eINSTANCE.getThrottleMediator();
		/**
		 * The meta object literal for the '<em><b>On Accept Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH = eINSTANCE.getThrottleMediator_OnAcceptBranch();
		/**
		 * The meta object literal for the '<em><b>On Reject Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__ON_REJECT_BRANCH = eINSTANCE.getThrottleMediator_OnRejectBranch();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyConfigurationImpl <em>Throttle Policy Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyConfiguration()
		 * @generated
		 */
		EClass THROTTLE_POLICY_CONFIGURATION = eINSTANCE.getThrottlePolicyConfiguration();
		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_CONFIGURATION__POLICY_TYPE = eINSTANCE.getThrottlePolicyConfiguration_PolicyType();
		/**
		 * The meta object literal for the '<em><b>Policy Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_POLICY_CONFIGURATION__POLICY_KEY = eINSTANCE.getThrottlePolicyConfiguration_PolicyKey();
		/**
		 * The meta object literal for the '<em><b>Max Concurrent Access Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_CONFIGURATION__MAX_CONCURRENT_ACCESS_COUNT = eINSTANCE.getThrottlePolicyConfiguration_MaxConcurrentAccessCount();
		/**
		 * The meta object literal for the '<em><b>Policy Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_POLICY_CONFIGURATION__POLICY_ENTRIES = eINSTANCE.getThrottlePolicyConfiguration_PolicyEntries();
		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_MEDIATOR__GROUP_ID = eINSTANCE.getThrottleMediator_GroupId();
		/**
		 * The meta object literal for the '<em><b>Policy Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_MEDIATOR__POLICY_CONFIGURATION = eINSTANCE.getThrottleMediator_PolicyConfiguration();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnAcceptBranchImpl <em>Throttle On Accept Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnAcceptBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleOnAcceptBranch()
		 * @generated
		 */
		EClass THROTTLE_ON_ACCEPT_BRANCH = eINSTANCE.getThrottleOnAcceptBranch();
		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getThrottleOnAcceptBranch_SequenceType();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_ON_ACCEPT_BRANCH__SEQUENCE_KEY = eINSTANCE.getThrottleOnAcceptBranch_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnRejectBranchImpl <em>Throttle On Reject Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottleOnRejectBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleOnRejectBranch()
		 * @generated
		 */
		EClass THROTTLE_ON_REJECT_BRANCH = eINSTANCE.getThrottleOnRejectBranch();
		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_ON_REJECT_BRANCH__SEQUENCE_TYPE = eINSTANCE.getThrottleOnRejectBranch_SequenceType();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLE_ON_REJECT_BRANCH__SEQUENCE_KEY = eINSTANCE.getThrottleOnRejectBranch_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyEntryImpl <em>Throttle Policy Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.ThrottlePolicyEntryImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyEntry()
		 * @generated
		 */
		EClass THROTTLE_POLICY_ENTRY = eINSTANCE.getThrottlePolicyEntry();
		/**
		 * The meta object literal for the '<em><b>Throttle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__THROTTLE_TYPE = eINSTANCE.getThrottlePolicyEntry_ThrottleType();
		/**
		 * The meta object literal for the '<em><b>Throttle Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__THROTTLE_RANGE = eINSTANCE.getThrottlePolicyEntry_ThrottleRange();
		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__ACCESS_TYPE = eINSTANCE.getThrottlePolicyEntry_AccessType();
		/**
		 * The meta object literal for the '<em><b>Max Request Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__MAX_REQUEST_COUNT = eINSTANCE.getThrottlePolicyEntry_MaxRequestCount();
		/**
		 * The meta object literal for the '<em><b>Unit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__UNIT_TIME = eINSTANCE.getThrottlePolicyEntry_UnitTime();
		/**
		 * The meta object literal for the '<em><b>Prohibit Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROTTLE_POLICY_ENTRY__PROHIBIT_PERIOD = eINSTANCE.getThrottlePolicyEntry_ProhibitPeriod();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandMediatorImpl <em>Command Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandMediator()
		 * @generated
		 */
		EClass COMMAND_MEDIATOR = eINSTANCE.getCommandMediator();
		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_MEDIATOR__CLASS_NAME = eINSTANCE.getCommandMediator_ClassName();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_MEDIATOR__PROPERTIES = eINSTANCE.getCommandMediator_Properties();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandPropertyImpl <em>Command Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.CommandPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandProperty()
		 * @generated
		 */
		EClass COMMAND_PROPERTY = eINSTANCE.getCommandProperty();
		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__PROPERTY_NAME = eINSTANCE.getCommandProperty_PropertyName();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_TYPE = eINSTANCE.getCommandProperty_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_LITERAL = eINSTANCE.getCommandProperty_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Context Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE_CONTEXT_PROPERTY_NAME = eINSTANCE.getCommandProperty_ValueContextPropertyName();
		/**
		 * The meta object literal for the '<em><b>Value Message Element Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PROPERTY__VALUE_MESSAGE_ELEMENT_XPATH = eINSTANCE.getCommandProperty_ValueMessageElementXpath();
		/**
		 * The meta object literal for the '<em><b>Context Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__CONTEXT_ACTION = eINSTANCE.getCommandProperty_ContextAction();
		/**
		 * The meta object literal for the '<em><b>Message Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__MESSAGE_ACTION = eINSTANCE.getCommandProperty_MessageAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EventMediatorImpl <em>Event Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.EventMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEventMediator()
		 * @generated
		 */
		EClass EVENT_MEDIATOR = eINSTANCE.getEventMediator();
		/**
		 * The meta object literal for the '<em><b>Event Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MEDIATOR__EVENT_SOURCE_NAME = eINSTANCE.getEventMediator_EventSourceName();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.AbstractSqlExecutorMediatorImpl <em>Abstract Sql Executor Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.AbstractSqlExecutorMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAbstractSqlExecutorMediator()
		 * @generated
		 */
		EClass ABSTRACT_SQL_EXECUTOR_MEDIATOR = eINSTANCE.getAbstractSqlExecutorMediator();
		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_TYPE = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionType();
		/**
		 * The meta object literal for the '<em><b>Connection Ds Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_TYPE = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsType();
		/**
		 * The meta object literal for the '<em><b>Connection Db Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DB_DRIVER = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDbDriver();
		/**
		 * The meta object literal for the '<em><b>Connection Ds Initial Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_INITIAL_CONTEXT = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsInitialContext();
		/**
		 * The meta object literal for the '<em><b>Connection Ds Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_DS_NAME = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionDsName();
		/**
		 * The meta object literal for the '<em><b>Connection URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_URL = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionURL();
		/**
		 * The meta object literal for the '<em><b>Connection Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_USERNAME = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionUsername();
		/**
		 * The meta object literal for the '<em><b>Connection Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__CONNECTION_PASSWORD = eINSTANCE.getAbstractSqlExecutorMediator_ConnectionPassword();
		/**
		 * The meta object literal for the '<em><b>Property Autocommit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_AUTOCOMMIT = eINSTANCE.getAbstractSqlExecutorMediator_PropertyAutocommit();
		/**
		 * The meta object literal for the '<em><b>Property Isolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_ISOLATION = eINSTANCE.getAbstractSqlExecutorMediator_PropertyIsolation();
		/**
		 * The meta object literal for the '<em><b>Property Maxactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXACTIVE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxactive();
		/**
		 * The meta object literal for the '<em><b>Property Maxidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxidle();
		/**
		 * The meta object literal for the '<em><b>Property Maxopenstatements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXOPENSTATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxopenstatements();
		/**
		 * The meta object literal for the '<em><b>Property Maxwait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MAXWAIT = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMaxwait();
		/**
		 * The meta object literal for the '<em><b>Property Minidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_MINIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyMinidle();
		/**
		 * The meta object literal for the '<em><b>Property Poolstatements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_POOLSTATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_PropertyPoolstatements();
		/**
		 * The meta object literal for the '<em><b>Property Testonborrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTONBORROW = eINSTANCE.getAbstractSqlExecutorMediator_PropertyTestonborrow();
		/**
		 * The meta object literal for the '<em><b>Property Testwhileidle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_TESTWHILEIDLE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyTestwhileidle();
		/**
		 * The meta object literal for the '<em><b>Property Validationquery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_VALIDATIONQUERY = eINSTANCE.getAbstractSqlExecutorMediator_PropertyValidationquery();
		/**
		 * The meta object literal for the '<em><b>Property Initialsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SQL_EXECUTOR_MEDIATOR__PROPERTY_INITIALSIZE = eINSTANCE.getAbstractSqlExecutorMediator_PropertyInitialsize();
		/**
		 * The meta object literal for the '<em><b>Sql Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQL_EXECUTOR_MEDIATOR__SQL_STATEMENTS = eINSTANCE.getAbstractSqlExecutorMediator_SqlStatements();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlStatementImpl <em>Sql Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlStatementImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlStatement()
		 * @generated
		 */
		EClass SQL_STATEMENT = eINSTANCE.getSqlStatement();
		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__QUERY_STRING = eINSTANCE.getSqlStatement_QueryString();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STATEMENT__PARAMETERS = eINSTANCE.getSqlStatement_Parameters();
		/**
		 * The meta object literal for the '<em><b>Results Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__RESULTS_ENABLED = eINSTANCE.getSqlStatement_ResultsEnabled();
		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STATEMENT__RESULTS = eINSTANCE.getSqlStatement_Results();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlParameterDefinitionImpl <em>Sql Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlParameterDefinitionImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterDefinition()
		 * @generated
		 */
		EClass SQL_PARAMETER_DEFINITION = eINSTANCE.getSqlParameterDefinition();
		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__DATA_TYPE = eINSTANCE.getSqlParameterDefinition_DataType();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__VALUE_TYPE = eINSTANCE.getSqlParameterDefinition_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER_DEFINITION__VALUE_LITERAL = eINSTANCE.getSqlParameterDefinition_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_PARAMETER_DEFINITION__VALUE_EXPRESSION = eINSTANCE.getSqlParameterDefinition_ValueExpression();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlResultMappingImpl <em>Sql Result Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SqlResultMappingImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlResultMapping()
		 * @generated
		 */
		EClass SQL_RESULT_MAPPING = eINSTANCE.getSqlResultMapping();
		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_RESULT_MAPPING__PROPERTY_NAME = eINSTANCE.getSqlResultMapping_PropertyName();
		/**
		 * The meta object literal for the '<em><b>Column Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_RESULT_MAPPING__COLUMN_ID = eINSTANCE.getSqlResultMapping_ColumnId();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBLookupMediatorImpl <em>DB Lookup Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBLookupMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDBLookupMediator()
		 * @generated
		 */
		EClass DB_LOOKUP_MEDIATOR = eINSTANCE.getDBLookupMediator();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBReportMediatorImpl <em>DB Report Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.DBReportMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getDBReportMediator()
		 * @generated
		 */
		EClass DB_REPORT_MEDIATOR = eINSTANCE.getDBReportMediator();
		/**
		 * The meta object literal for the '<em><b>Connection Use Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION = eINSTANCE.getDBReportMediator_ConnectionUseTransaction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleMediatorImpl <em>Rule Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleMediator()
		 * @generated
		 */
		EClass RULE_MEDIATOR = eINSTANCE.getRuleMediator();
		/**
		 * The meta object literal for the '<em><b>Rule Set Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RULE_SET_CONFIGURATION = eINSTANCE.getRuleMediator_RuleSetConfiguration();
		/**
		 * The meta object literal for the '<em><b>Rule Session Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RULE_SESSION_CONFIGURATION = eINSTANCE.getRuleMediator_RuleSessionConfiguration();
		/**
		 * The meta object literal for the '<em><b>Facts Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__FACTS_CONFIGURATION = eINSTANCE.getRuleMediator_FactsConfiguration();
		/**
		 * The meta object literal for the '<em><b>Results Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__RESULTS_CONFIGURATION = eINSTANCE.getRuleMediator_ResultsConfiguration();
		/**
		 * The meta object literal for the '<em><b>Child Mediators Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION = eINSTANCE.getRuleMediator_ChildMediatorsConfiguration();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl <em>Rule Set Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSetConfiguration()
		 * @generated
		 */
		EClass RULE_SET_CONFIGURATION = eINSTANCE.getRuleSetConfiguration();
		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET_CONFIGURATION__SOURCE_TYPE = eINSTANCE.getRuleSetConfiguration_SourceType();
		/**
		 * The meta object literal for the '<em><b>Source Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET_CONFIGURATION__SOURCE_CODE = eINSTANCE.getRuleSetConfiguration_SourceCode();
		/**
		 * The meta object literal for the '<em><b>Source Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET_CONFIGURATION__SOURCE_KEY = eINSTANCE.getRuleSetConfiguration_SourceKey();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET_CONFIGURATION__PROPERTIES = eINSTANCE.getRuleSetConfiguration_Properties();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetCreationPropertyImpl <em>Rule Set Creation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetCreationPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSetCreationProperty()
		 * @generated
		 */
		EClass RULE_SET_CREATION_PROPERTY = eINSTANCE.getRuleSetCreationProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionConfigurationImpl <em>Rule Session Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSessionConfiguration()
		 * @generated
		 */
		EClass RULE_SESSION_CONFIGURATION = eINSTANCE.getRuleSessionConfiguration();
		/**
		 * The meta object literal for the '<em><b>Stateful Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SESSION_CONFIGURATION__STATEFUL_SESSION = eINSTANCE.getRuleSessionConfiguration_StatefulSession();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SESSION_CONFIGURATION__PROPERTIES = eINSTANCE.getRuleSessionConfiguration_Properties();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionPropertyImpl <em>Rule Session Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSessionPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSessionProperty()
		 * @generated
		 */
		EClass RULE_SESSION_PROPERTY = eINSTANCE.getRuleSessionProperty();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactsConfigurationImpl <em>Rule Facts Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactsConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactsConfiguration()
		 * @generated
		 */
		EClass RULE_FACTS_CONFIGURATION = eINSTANCE.getRuleFactsConfiguration();
		/**
		 * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTS_CONFIGURATION__FACTS = eINSTANCE.getRuleFactsConfiguration_Facts();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactImpl <em>Rule Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleFactImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFact()
		 * @generated
		 */
		EClass RULE_FACT = eINSTANCE.getRuleFact();
		/**
		 * The meta object literal for the '<em><b>Fact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_TYPE = eINSTANCE.getRuleFact_FactType();
		/**
		 * The meta object literal for the '<em><b>Fact Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_CUSTOM_TYPE = eINSTANCE.getRuleFact_FactCustomType();
		/**
		 * The meta object literal for the '<em><b>Fact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__FACT_NAME = eINSTANCE.getRuleFact_FactName();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__VALUE_TYPE = eINSTANCE.getRuleFact_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FACT__VALUE_LITERAL = eINSTANCE.getRuleFact_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACT__VALUE_EXPRESSION = eINSTANCE.getRuleFact_ValueExpression();
		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACT__VALUE_KEY = eINSTANCE.getRuleFact_ValueKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultsConfigurationImpl <em>Rule Results Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultsConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultsConfiguration()
		 * @generated
		 */
		EClass RULE_RESULTS_CONFIGURATION = eINSTANCE.getRuleResultsConfiguration();
		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULTS_CONFIGURATION__RESULTS = eINSTANCE.getRuleResultsConfiguration_Results();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultImpl <em>Rule Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleResultImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResult()
		 * @generated
		 */
		EClass RULE_RESULT = eINSTANCE.getRuleResult();
		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_TYPE = eINSTANCE.getRuleResult_ResultType();
		/**
		 * The meta object literal for the '<em><b>Result Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_CUSTOM_TYPE = eINSTANCE.getRuleResult_ResultCustomType();
		/**
		 * The meta object literal for the '<em><b>Result Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__RESULT_NAME = eINSTANCE.getRuleResult_ResultName();
		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__VALUE_TYPE = eINSTANCE.getRuleResult_ValueType();
		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_RESULT__VALUE_LITERAL = eINSTANCE.getRuleResult_ValueLiteral();
		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULT__VALUE_EXPRESSION = eINSTANCE.getRuleResult_ValueExpression();
		/**
		 * The meta object literal for the '<em><b>Value Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESULT__VALUE_KEY = eINSTANCE.getRuleResult_ValueKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleChildMediatorsConfigurationImpl <em>Rule Child Mediators Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleChildMediatorsConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleChildMediatorsConfiguration()
		 * @generated
		 */
		EClass RULE_CHILD_MEDIATORS_CONFIGURATION = eINSTANCE.getRuleChildMediatorsConfiguration();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SequenceMediatorImpl <em>Sequence Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.SequenceMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSequenceMediator()
		 * @generated
		 */
		EClass SEQUENCE_MEDIATOR = eINSTANCE.getSequenceMediator();
		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MEDIATOR__SEQUENCE_KEY = eINSTANCE.getSequenceMediator_SequenceKey();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.BuilderMediatorImpl <em>Builder Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.BuilderMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getBuilderMediator()
		 * @generated
		 */
		EClass BUILDER_MEDIATOR = eINSTANCE.getBuilderMediator();
		/**
		 * The meta object literal for the '<em><b>Message Builders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_MEDIATOR__MESSAGE_BUILDERS = eINSTANCE.getBuilderMediator_MessageBuilders();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.MessageBuilderImpl <em>Message Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MessageBuilderImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getMessageBuilder()
		 * @generated
		 */
		EClass MESSAGE_BUILDER = eINSTANCE.getMessageBuilder();
		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BUILDER__CONTENT_TYPE = eINSTANCE.getMessageBuilder_ContentType();
		/**
		 * The meta object literal for the '<em><b>Builder Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BUILDER__BUILDER_CLASS = eINSTANCE.getMessageBuilder_BuilderClass();
		/**
		 * The meta object literal for the '<em><b>Formatter Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BUILDER__FORMATTER_CLASS = eINSTANCE.getMessageBuilder_FormatterClass();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory <em>Log Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogCategory
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogCategory()
		 * @generated
		 */
		EEnum LOG_CATEGORY = eINSTANCE.getLogCategory();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel <em>Log Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogLevel
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getLogLevel()
		 * @generated
		 */
		EEnum LOG_LEVEL = eINSTANCE.getLogLevel();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType <em>Filter Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterConditionType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFilterConditionType()
		 * @generated
		 */
		EEnum FILTER_CONDITION_TYPE = eINSTANCE.getFilterConditionType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType <em>Script Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptType()
		 * @generated
		 */
		EEnum SCRIPT_TYPE = eINSTANCE.getScriptType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage <em>Script Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptLanguage
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getScriptLanguage()
		 * @generated
		 */
		EEnum SCRIPT_LANGUAGE = eINSTANCE.getScriptLanguage();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType <em>Enrich Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichSourceType()
		 * @generated
		 */
		EEnum ENRICH_SOURCE_TYPE = eINSTANCE.getEnrichSourceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction <em>Enrich Target Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichTargetAction()
		 * @generated
		 */
		EEnum ENRICH_TARGET_ACTION = eINSTANCE.getEnrichTargetAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType <em>Enrich Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getEnrichTargetType()
		 * @generated
		 */
		EEnum ENRICH_TARGET_TYPE = eINSTANCE.getEnrichTargetType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion <em>Fault Soap Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultSoapVersion
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultSoapVersion()
		 * @generated
		 */
		EEnum FAULT_SOAP_VERSION = eINSTANCE.getFaultSoapVersion();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11 <em>Fault Code Soap11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap11
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultCodeSoap11()
		 * @generated
		 */
		EEnum FAULT_CODE_SOAP11 = eINSTANCE.getFaultCodeSoap11();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12 <em>Fault Code Soap12</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultCodeSoap12
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultCodeSoap12()
		 * @generated
		 */
		EEnum FAULT_CODE_SOAP12 = eINSTANCE.getFaultCodeSoap12();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType <em>Fault String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultStringType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultStringType()
		 * @generated
		 */
		EEnum FAULT_STRING_TYPE = eINSTANCE.getFaultStringType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType <em>Fault Reason Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultReasonType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultReasonType()
		 * @generated
		 */
		EEnum FAULT_REASON_TYPE = eINSTANCE.getFaultReasonType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType <em>Fault Detail Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultDetailType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getFaultDetailType()
		 * @generated
		 */
		EEnum FAULT_DETAIL_TYPE = eINSTANCE.getFaultDetailType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType <em>Aggregate Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateSequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getAggregateSequenceType()
		 * @generated
		 */
		EEnum AGGREGATE_SEQUENCE_TYPE = eINSTANCE.getAggregateSequenceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType <em>Cache Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheSequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheSequenceType()
		 * @generated
		 */
		EEnum CACHE_SEQUENCE_TYPE = eINSTANCE.getCacheSequenceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType <em>Cache Implementation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheImplementationType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheImplementationType()
		 * @generated
		 */
		EEnum CACHE_IMPLEMENTATION_TYPE = eINSTANCE.getCacheImplementationType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction <em>Cache Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheAction()
		 * @generated
		 */
		EEnum CACHE_ACTION = eINSTANCE.getCacheAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope <em>Cache Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheScope
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCacheScope()
		 * @generated
		 */
		EEnum CACHE_SCOPE = eINSTANCE.getCacheScope();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType <em>XQuery Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariableType()
		 * @generated
		 */
		EEnum XQUERY_VARIABLE_TYPE = eINSTANCE.getXQueryVariableType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType <em>XQuery Variable Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariableValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getXQueryVariableValueType()
		 * @generated
		 */
		EEnum XQUERY_VARIABLE_VALUE_TYPE = eINSTANCE.getXQueryVariableValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType <em>Callout Payload Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutPayloadType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutPayloadType()
		 * @generated
		 */
		EEnum CALLOUT_PAYLOAD_TYPE = eINSTANCE.getCalloutPayloadType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType <em>Callout Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutResultType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCalloutResultType()
		 * @generated
		 */
		EEnum CALLOUT_RESULT_TYPE = eINSTANCE.getCalloutResultType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion <em>RM Spec Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSpecVersion
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSpecVersion()
		 * @generated
		 */
		EEnum RM_SPEC_VERSION = eINSTANCE.getRMSpecVersion();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType <em>RM Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRMSequenceType()
		 * @generated
		 */
		EEnum RM_SEQUENCE_TYPE = eINSTANCE.getRMSequenceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction <em>Transaction Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getTransactionAction()
		 * @generated
		 */
		EEnum TRANSACTION_ACTION = eINSTANCE.getTransactionAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType <em>Property Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyDataType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyDataType()
		 * @generated
		 */
		EEnum PROPERTY_DATA_TYPE = eINSTANCE.getPropertyDataType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction <em>Property Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyAction()
		 * @generated
		 */
		EEnum PROPERTY_ACTION = eINSTANCE.getPropertyAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType <em>Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyValueType()
		 * @generated
		 */
		EEnum PROPERTY_VALUE_TYPE = eINSTANCE.getPropertyValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope <em>Property Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyScope
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getPropertyScope()
		 * @generated
		 */
		EEnum PROPERTY_SCOPE = eINSTANCE.getPropertyScope();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction <em>Header Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderAction()
		 * @generated
		 */
		EEnum HEADER_ACTION = eINSTANCE.getHeaderAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType <em>Header Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getHeaderValueType()
		 * @generated
		 */
		EEnum HEADER_VALUE_TYPE = eINSTANCE.getHeaderValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType <em>Throttle Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottlePolicyType()
		 * @generated
		 */
		EEnum THROTTLE_POLICY_TYPE = eINSTANCE.getThrottlePolicyType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType <em>Throttle Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleConditionType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleConditionType()
		 * @generated
		 */
		EEnum THROTTLE_CONDITION_TYPE = eINSTANCE.getThrottleConditionType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType <em>Throttle Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleAccessType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleAccessType()
		 * @generated
		 */
		EEnum THROTTLE_ACCESS_TYPE = eINSTANCE.getThrottleAccessType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType <em>Throttle Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleSequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getThrottleSequenceType()
		 * @generated
		 */
		EEnum THROTTLE_SEQUENCE_TYPE = eINSTANCE.getThrottleSequenceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType <em>Command Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyValueType()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_VALUE_TYPE = eINSTANCE.getCommandPropertyValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction <em>Command Property Message Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyMessageAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyMessageAction()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_MESSAGE_ACTION = eINSTANCE.getCommandPropertyMessageAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction <em>Command Property Context Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandPropertyContextAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getCommandPropertyContextAction()
		 * @generated
		 */
		EEnum COMMAND_PROPERTY_CONTEXT_ACTION = eINSTANCE.getCommandPropertyContextAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType <em>Sql Executor Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorConnectionType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorConnectionType()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_CONNECTION_TYPE = eINSTANCE.getSqlExecutorConnectionType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType <em>Sql Executor Datasource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorDatasourceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorDatasourceType()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_DATASOURCE_TYPE = eINSTANCE.getSqlExecutorDatasourceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue <em>Sql Executor Boolean Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorBooleanValue
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorBooleanValue()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_BOOLEAN_VALUE = eINSTANCE.getSqlExecutorBooleanValue();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel <em>Sql Executor Isolation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlExecutorIsolationLevel
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlExecutorIsolationLevel()
		 * @generated
		 */
		EEnum SQL_EXECUTOR_ISOLATION_LEVEL = eINSTANCE.getSqlExecutorIsolationLevel();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType <em>Sql Parameter Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterValueType()
		 * @generated
		 */
		EEnum SQL_PARAMETER_VALUE_TYPE = eINSTANCE.getSqlParameterValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType <em>Sql Parameter Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDataType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSqlParameterDataType()
		 * @generated
		 */
		EEnum SQL_PARAMETER_DATA_TYPE = eINSTANCE.getSqlParameterDataType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType <em>Rule Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleSourceType()
		 * @generated
		 */
		EEnum RULE_SOURCE_TYPE = eINSTANCE.getRuleSourceType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType <em>Rule Fact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactType()
		 * @generated
		 */
		EEnum RULE_FACT_TYPE = eINSTANCE.getRuleFactType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType <em>Rule Fact Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleFactValueType()
		 * @generated
		 */
		EEnum RULE_FACT_VALUE_TYPE = eINSTANCE.getRuleFactValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType <em>Rule Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultType()
		 * @generated
		 */
		EEnum RULE_RESULT_TYPE = eINSTANCE.getRuleResultType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType <em>Rule Result Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getRuleResultValueType()
		 * @generated
		 */
		EEnum RULE_RESULT_VALUE_TYPE = eINSTANCE.getRuleResultValueType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType <em>Smooks IO Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksIODataType
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getSmooksIODataType()
		 * @generated
		 */
		EEnum SMOOKS_IO_DATA_TYPE = eINSTANCE.getSmooksIODataType();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction <em>Expression Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ExpressionAction
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getExpressionAction()
		 * @generated
		 */
		EEnum EXPRESSION_ACTION = eINSTANCE.getExpressionAction();
		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod <em>Output Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OutputMethod
		 * @see org.wso2.carbonstudio.eclipse.esb.mediator.impl.MediatorPackageImpl#getOutputMethod()
		 * @generated
		 */
		EEnum OUTPUT_METHOD = eINSTANCE.getOutputMethod();

	}

} //MediatorPackage
