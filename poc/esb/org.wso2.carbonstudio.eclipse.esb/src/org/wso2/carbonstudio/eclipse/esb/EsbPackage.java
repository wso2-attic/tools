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
package org.wso2.carbonstudio.eclipse.esb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.wso2.carbonstudio.eclipse.esb.EsbFactory
 * @model kind="package"
 * @generated
 */
public interface EsbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/wso2/carbonstudio/eclipse/esb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsbPackage eINSTANCE = org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl <em>Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getModelObject()
	 * @generated
	 */
	int MODEL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_OBJECT__OBJECT_STATE = 0;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_OBJECT__SOURCE_TEXT = 1;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT__DEFAULT_NAMESPACE = 2;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT__ADDITIONAL_NAMESPACES = 3;

				/**
	 * The number of structural features of the '<em>Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.NamespaceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 1;

				/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = 0;

				/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = 1;

				/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.SynapseConfigurationImpl <em>Synapse Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.SynapseConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getSynapseConfiguration()
	 * @generated
	 */
	int SYNAPSE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYNAPSE_CONFIGURATION__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYNAPSE_CONFIGURATION__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNAPSE_CONFIGURATION__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNAPSE_CONFIGURATION__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Configuration Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNAPSE_CONFIGURATION__CONFIGURATION_ELEMENTS = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synapse Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNAPSE_CONFIGURATION_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ConfigurationElementImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getConfigurationElement()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION_ELEMENT__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION_ELEMENT__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The number of structural features of the '<em>Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEDIATOR__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEDIATOR__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ParentMediatorImpl <em>Parent Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ParentMediatorImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getParentMediator()
	 * @generated
	 */
	int PARENT_MEDIATOR = 10;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorSequenceImpl <em>Mediator Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorSequenceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediatorSequence()
	 * @generated
	 */
	int MEDIATOR_SEQUENCE = 8;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPoint()
	 * @generated
	 */
    int END_POINT = 6;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl <em>Unknown Object</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getUnknownObject()
	 * @generated
	 */
    int UNKNOWN_OBJECT = 7;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractEndPointImpl <em>Abstract End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractEndPoint()
	 * @generated
	 */
    int ABSTRACT_END_POINT = 18;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractDefaultEndPointImpl <em>Abstract Default End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractDefaultEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractDefaultEndPoint()
	 * @generated
	 */
    int ABSTRACT_DEFAULT_END_POINT = 19;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DefaultEndPointImpl <em>Default End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.DefaultEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDefaultEndPoint()
	 * @generated
	 */
    int DEFAULT_END_POINT = 20;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AddressEndPointImpl <em>Address End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AddressEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAddressEndPoint()
	 * @generated
	 */
    int ADDRESS_END_POINT = 21;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.WsdlEndPointImpl <em>Wsdl End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.WsdlEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getWsdlEndPoint()
	 * @generated
	 */
    int WSDL_END_POINT = 22;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ParentEndPointImpl <em>Parent End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ParentEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getParentEndPoint()
	 * @generated
	 */
    int PARENT_END_POINT = 23;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.FailoverEndPointImpl <em>Failover End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.FailoverEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getFailoverEndPoint()
	 * @generated
	 */
    int FAILOVER_END_POINT = 24;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.LoadBalanceEndPointImpl <em>Load Balance End Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.LoadBalanceEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceEndPoint()
	 * @generated
	 */
    int LOAD_BALANCE_END_POINT = 25;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.EndPointReferenceImpl <em>End Point Reference</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EndPointReferenceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointReference()
	 * @generated
	 */
    int END_POINT_REFERENCE = 5;

    /**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT_REFERENCE__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT_REFERENCE__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_REFERENCE__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_REFERENCE__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The number of structural features of the '<em>End Point Reference</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT_REFERENCE_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ANONYMOUS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ENDPOINT_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int END_POINT_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNKNOWN_OBJECT__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNKNOWN_OBJECT__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__ANONYMOUS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__ENDPOINT_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Unknown Object</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNKNOWN_OBJECT_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE__ANONYMOUS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE__SEQUENCE_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Mediators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE__MEDIATORS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>On Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_SEQUENCE__ON_ERROR = CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Mediator Sequence</em>' class.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int MEDIATOR_SEQUENCE_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 4;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValuePropertyImpl <em>Abstract Name Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValuePropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractNameValueProperty()
	 * @generated
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY = 13;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValueExpressionPropertyImpl <em>Abstract Name Value Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValueExpressionPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY = 14;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractBooleanFeatureImpl <em>Abstract Boolean Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractBooleanFeatureImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractBooleanFeature()
	 * @generated
	 */
	int ABSTRACT_BOOLEAN_FEATURE = 15;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractLocationKeyResourceImpl <em>Abstract Location Key Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractLocationKeyResourceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractLocationKeyResource()
	 * @generated
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE = 16;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractCommonTargetImpl <em>Abstract Common Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractCommonTargetImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractCommonTarget()
	 * @generated
	 */
	int ABSTRACT_COMMON_TARGET = 17;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.XPathEndPointReferenceImpl <em>XPath End Point Reference</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.XPathEndPointReferenceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getXPathEndPointReference()
	 * @generated
	 */
    int XPATH_END_POINT_REFERENCE = 28;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorBranchImpl <em>Mediator Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorBranchImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediatorBranch()
	 * @generated
	 */
	int MEDIATOR_BRANCH = 9;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEDIATOR_BRANCH__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEDIATOR_BRANCH__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_BRANCH__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_BRANCH__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_BRANCH__CHILDREN = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mediator Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_BRANCH_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MEDIATOR__OBJECT_STATE = MEDIATOR__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MEDIATOR__SOURCE_TEXT = MEDIATOR__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MEDIATOR__DEFAULT_NAMESPACE = MEDIATOR__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MEDIATOR__ADDITIONAL_NAMESPACES = MEDIATOR__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PARENT_MEDIATOR__CHILDREN = MEDIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent Mediator</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PARENT_MEDIATOR_FEATURE_COUNT = MEDIATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.NamespacedPropertyImpl <em>Namespaced Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.NamespacedPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getNamespacedProperty()
	 * @generated
	 */
	int NAMESPACED_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMESPACED_PROPERTY__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

    /**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMESPACED_PROPERTY__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

    /**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Pretty Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PRETTY_NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PROPERTY_NAME = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__PROPERTY_VALUE = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY__NAMESPACES = MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Namespaced Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_PROPERTY_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyPropertyImpl <em>Registry Key Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getRegistryKeyProperty()
	 * @generated
	 */
	int REGISTRY_KEY_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Pretty Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__PRETTY_NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__KEY_NAME = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__KEY_VALUE = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY__FILTERS = MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Registry Key Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_PROPERTY_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_PROPERTY__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_PROPERTY__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_PROPERTY__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Name Value Property</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION = MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Name Value Expression Property</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_BOOLEAN_FEATURE__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_BOOLEAN_FEATURE__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOOLEAN_FEATURE__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOOLEAN_FEATURE__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Boolean Feature</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_BOOLEAN_FEATURE_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_LOCATION_KEY_RESOURCE__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_LOCATION_KEY_RESOURCE__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOCATION_KEY_RESOURCE__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_LOCATION_KEY_RESOURCE__KEY = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Location Key Resource</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_LOCATION_KEY_RESOURCE_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_TARGET__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__SEQUENCE = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__SEQUENCE_KEY = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE = MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__ENDPOINT = MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET__ENDPOINT_KEY = MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Common Target</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_COMMON_TARGET_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__OBJECT_STATE = END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SOURCE_TEXT = END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__DEFAULT_NAMESPACE = END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDITIONAL_NAMESPACES = END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_END_POINT__ANONYMOUS = END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_END_POINT__ENDPOINT_NAME = END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SECURITY_ENABLED = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_ENABLED = END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_VERSION = END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER = END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__TIME_OUT_DURATION = END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__TIME_OUT_ACTION = END_POINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_ERROR_CODES = END_POINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_COUNT = END_POINT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RETRY_DELAY = END_POINT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_ERROR_CODES = END_POINT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION = END_POINT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION = END_POINT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR = END_POINT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY = END_POINT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT__SECURITY_POLICY = END_POINT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Abstract End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__OBJECT_STATE = ABSTRACT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SOURCE_TEXT = ABSTRACT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__DEFAULT_NAMESPACE = ABSTRACT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ADDITIONAL_NAMESPACES = ABSTRACT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_DEFAULT_END_POINT__ANONYMOUS = ABSTRACT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ABSTRACT_DEFAULT_END_POINT__ENDPOINT_NAME = ABSTRACT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SECURITY_ENABLED = ABSTRACT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ADDRESSING_ENABLED = ABSTRACT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ADDRESSING_VERSION = ABSTRACT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__TIME_OUT_DURATION = ABSTRACT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__TIME_OUT_ACTION = ABSTRACT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__RETRY_ERROR_CODES = ABSTRACT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__RETRY_COUNT = ABSTRACT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__RETRY_DELAY = ABSTRACT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__SECURITY_POLICY = ABSTRACT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Message Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__MESSAGE_FORMAT = ABSTRACT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attachment Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ATTACHMENT_OPTIMIZATION = ABSTRACT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__ENCODING = ABSTRACT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__STATISTICS_ENABLED = ABSTRACT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT__TRACE_ENABLED = ABSTRACT_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Default End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFAULT_END_POINT_FEATURE_COUNT = ABSTRACT_END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__OBJECT_STATE = ABSTRACT_DEFAULT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SOURCE_TEXT = ABSTRACT_DEFAULT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__DEFAULT_NAMESPACE = ABSTRACT_DEFAULT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDITIONAL_NAMESPACES = ABSTRACT_DEFAULT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int DEFAULT_END_POINT__ANONYMOUS = ABSTRACT_DEFAULT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int DEFAULT_END_POINT__ENDPOINT_NAME = ABSTRACT_DEFAULT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SECURITY_ENABLED = ABSTRACT_DEFAULT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_ENABLED = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_VERSION = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__TIME_OUT_DURATION = ABSTRACT_DEFAULT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__TIME_OUT_ACTION = ABSTRACT_DEFAULT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_ERROR_CODES = ABSTRACT_DEFAULT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_COUNT = ABSTRACT_DEFAULT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RETRY_DELAY = ABSTRACT_DEFAULT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_DEFAULT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_DEFAULT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_DEFAULT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_DEFAULT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__SECURITY_POLICY = ABSTRACT_DEFAULT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Message Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__MESSAGE_FORMAT = ABSTRACT_DEFAULT_END_POINT__MESSAGE_FORMAT;

	/**
	 * The feature id for the '<em><b>Attachment Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ATTACHMENT_OPTIMIZATION = ABSTRACT_DEFAULT_END_POINT__ATTACHMENT_OPTIMIZATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__ENCODING = ABSTRACT_DEFAULT_END_POINT__ENCODING;

	/**
	 * The feature id for the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__STATISTICS_ENABLED = ABSTRACT_DEFAULT_END_POINT__STATISTICS_ENABLED;

	/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT__TRACE_ENABLED = ABSTRACT_DEFAULT_END_POINT__TRACE_ENABLED;

	/**
	 * The number of structural features of the '<em>Default End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_END_POINT_FEATURE_COUNT = ABSTRACT_DEFAULT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__OBJECT_STATE = ABSTRACT_DEFAULT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SOURCE_TEXT = ABSTRACT_DEFAULT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__DEFAULT_NAMESPACE = ABSTRACT_DEFAULT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDITIONAL_NAMESPACES = ABSTRACT_DEFAULT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ADDRESS_END_POINT__ANONYMOUS = ABSTRACT_DEFAULT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int ADDRESS_END_POINT__ENDPOINT_NAME = ABSTRACT_DEFAULT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SECURITY_ENABLED = ABSTRACT_DEFAULT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_ENABLED = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_VERSION = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_DEFAULT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__TIME_OUT_DURATION = ABSTRACT_DEFAULT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__TIME_OUT_ACTION = ABSTRACT_DEFAULT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_ERROR_CODES = ABSTRACT_DEFAULT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_COUNT = ABSTRACT_DEFAULT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RETRY_DELAY = ABSTRACT_DEFAULT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_DEFAULT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_DEFAULT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_DEFAULT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_DEFAULT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_DEFAULT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__SECURITY_POLICY = ABSTRACT_DEFAULT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Message Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__MESSAGE_FORMAT = ABSTRACT_DEFAULT_END_POINT__MESSAGE_FORMAT;

	/**
	 * The feature id for the '<em><b>Attachment Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ATTACHMENT_OPTIMIZATION = ABSTRACT_DEFAULT_END_POINT__ATTACHMENT_OPTIMIZATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__ENCODING = ABSTRACT_DEFAULT_END_POINT__ENCODING;

	/**
	 * The feature id for the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__STATISTICS_ENABLED = ABSTRACT_DEFAULT_END_POINT__STATISTICS_ENABLED;

	/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__TRACE_ENABLED = ABSTRACT_DEFAULT_END_POINT__TRACE_ENABLED;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT__URI = ABSTRACT_DEFAULT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_END_POINT_FEATURE_COUNT = ABSTRACT_DEFAULT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__OBJECT_STATE = ABSTRACT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SOURCE_TEXT = ABSTRACT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__DEFAULT_NAMESPACE = ABSTRACT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDITIONAL_NAMESPACES = ABSTRACT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int WSDL_END_POINT__ANONYMOUS = ABSTRACT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int WSDL_END_POINT__ENDPOINT_NAME = ABSTRACT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RELIABLE_MESSAGING_ENABLED = ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SECURITY_ENABLED = ABSTRACT_END_POINT__SECURITY_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_ENABLED = ABSTRACT_END_POINT__ADDRESSING_ENABLED;

	/**
	 * The feature id for the '<em><b>Addressing Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_VERSION = ABSTRACT_END_POINT__ADDRESSING_VERSION;

	/**
	 * The feature id for the '<em><b>Addressing Separate Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__ADDRESSING_SEPARATE_LISTENER = ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER;

	/**
	 * The feature id for the '<em><b>Time Out Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__TIME_OUT_DURATION = ABSTRACT_END_POINT__TIME_OUT_DURATION;

	/**
	 * The feature id for the '<em><b>Time Out Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__TIME_OUT_ACTION = ABSTRACT_END_POINT__TIME_OUT_ACTION;

	/**
	 * The feature id for the '<em><b>Retry Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_ERROR_CODES = ABSTRACT_END_POINT__RETRY_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_COUNT = ABSTRACT_END_POINT__RETRY_COUNT;

	/**
	 * The feature id for the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RETRY_DELAY = ABSTRACT_END_POINT__RETRY_DELAY;

	/**
	 * The feature id for the '<em><b>Suspend Error Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_ERROR_CODES = ABSTRACT_END_POINT__SUSPEND_ERROR_CODES;

	/**
	 * The feature id for the '<em><b>Suspend Initial Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_INITIAL_DURATION = ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Maximum Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_MAXIMUM_DURATION = ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION;

	/**
	 * The feature id for the '<em><b>Suspend Progression Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SUSPEND_PROGRESSION_FACTOR = ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Reliable Messaging Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__RELIABLE_MESSAGING_POLICY = ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SECURITY_POLICY = ABSTRACT_END_POINT__SECURITY_POLICY;

	/**
	 * The feature id for the '<em><b>Wsdl Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_TYPE = ABSTRACT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wsdl URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_URI = ABSTRACT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsdl XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__WSDL_XML = ABSTRACT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__SERVICE = ABSTRACT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT__PORT = ABSTRACT_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Wsdl End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_END_POINT_FEATURE_COUNT = ABSTRACT_END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__OBJECT_STATE = END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__SOURCE_TEXT = END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__DEFAULT_NAMESPACE = END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__ADDITIONAL_NAMESPACES = END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PARENT_END_POINT__ANONYMOUS = END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PARENT_END_POINT__ENDPOINT_NAME = END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT__CHILDREN = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__OBJECT_STATE = PARENT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__SOURCE_TEXT = PARENT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__DEFAULT_NAMESPACE = PARENT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__ADDITIONAL_NAMESPACES = PARENT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int FAILOVER_END_POINT__ANONYMOUS = PARENT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int FAILOVER_END_POINT__ENDPOINT_NAME = PARENT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT__CHILDREN = PARENT_END_POINT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Failover End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_END_POINT_FEATURE_COUNT = PARENT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__OBJECT_STATE = PARENT_END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__SOURCE_TEXT = PARENT_END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__DEFAULT_NAMESPACE = PARENT_END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__ADDITIONAL_NAMESPACES = PARENT_END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int LOAD_BALANCE_END_POINT__ANONYMOUS = PARENT_END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int LOAD_BALANCE_END_POINT__ENDPOINT_NAME = PARENT_END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__CHILDREN = PARENT_END_POINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__ALGORITHM = PARENT_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__SESSION_TYPE = PARENT_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT__SESSION_TIMEOUT = PARENT_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Load Balance End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCE_END_POINT_FEATURE_COUNT = PARENT_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalanceEndPointImpl <em>Dynamic Load Balance End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalanceEndPointImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDynamicLoadBalanceEndPoint()
	 * @generated
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT = 26;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__OBJECT_STATE = END_POINT__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__SOURCE_TEXT = END_POINT__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__DEFAULT_NAMESPACE = END_POINT__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__ADDITIONAL_NAMESPACES = END_POINT__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__ANONYMOUS = END_POINT__ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__ENDPOINT_NAME = END_POINT__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__ALGORITHM = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failover Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__FAILOVER_ENABLED = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Membership Handler Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__MEMBERSHIP_HANDLER_CLASS = END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT__PROPERTIES = END_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dynamic Load Balance End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalancePropertyImpl <em>Dynamic Load Balance Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalancePropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDynamicLoadBalanceProperty()
	 * @generated
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__OBJECT_STATE = ABSTRACT_NAME_VALUE_PROPERTY__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__SOURCE_TEXT = ABSTRACT_NAME_VALUE_PROPERTY__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__DEFAULT_NAMESPACE = ABSTRACT_NAME_VALUE_PROPERTY__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__ADDITIONAL_NAMESPACES = ABSTRACT_NAME_VALUE_PROPERTY__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__PROPERTY_NAME = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY__PROPERTY_VALUE = ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE;

	/**
	 * The number of structural features of the '<em>Dynamic Load Balance Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LOAD_BALANCE_PROPERTY_FEATURE_COUNT = ABSTRACT_NAME_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE__OBJECT_STATE = END_POINT_REFERENCE__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE__SOURCE_TEXT = END_POINT_REFERENCE__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE__DEFAULT_NAMESPACE = END_POINT_REFERENCE__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE__ADDITIONAL_NAMESPACES = END_POINT_REFERENCE__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Endpoint Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE__ENDPOINT_XPATH = END_POINT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XPath End Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_END_POINT_REFERENCE_FEATURE_COUNT = END_POINT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyEndPointReferenceImpl <em>Registry Key End Point Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyEndPointReferenceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getRegistryKeyEndPointReference()
	 * @generated
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE__OBJECT_STATE = END_POINT_REFERENCE__OBJECT_STATE;

	/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE__SOURCE_TEXT = END_POINT_REFERENCE__SOURCE_TEXT;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE__DEFAULT_NAMESPACE = END_POINT_REFERENCE__DEFAULT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE__ADDITIONAL_NAMESPACES = END_POINT_REFERENCE__ADDITIONAL_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE__ENDPOINT_KEY = END_POINT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Key End Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_KEY_END_POINT_REFERENCE_FEATURE_COUNT = END_POINT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceImpl <em>Proxy Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyService()
	 * @generated
	 */
	int PROXY_SERVICE = 30;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlConfigurationImpl <em>Proxy Wsdl Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlConfiguration()
	 * @generated
	 */
	int PROXY_WSDL_CONFIGURATION = 31;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlResourceImpl <em>Proxy Wsdl Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlResourceImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlResource()
	 * @generated
	 */
	int PROXY_WSDL_RESOURCE = 32;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceParameterImpl <em>Proxy Service Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceParameterImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyServiceParameter()
	 * @generated
	 */
	int PROXY_SERVICE_PARAMETER = 33;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServicePolicyImpl <em>Proxy Service Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServicePolicyImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyServicePolicy()
	 * @generated
	 */
	int PROXY_SERVICE_POLICY = 34;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractProxySequenceConfigurationImpl <em>Abstract Proxy Sequence Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractProxySequenceConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractProxySequenceConfiguration()
	 * @generated
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION = 35;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyInSequenceConfigurationImpl <em>Proxy In Sequence Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyInSequenceConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyInSequenceConfiguration()
	 * @generated
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION = 36;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyEndpointConfigurationImpl <em>Proxy Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyEndpointConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyEndpointConfiguration()
	 * @generated
	 */
	int PROXY_ENDPOINT_CONFIGURATION = 37;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyOutSequenceConfigurationImpl <em>Proxy Out Sequence Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyOutSequenceConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyOutSequenceConfiguration()
	 * @generated
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION = 38;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyFaultSequenceConfigurationImpl <em>Proxy Fault Sequence Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyFaultSequenceConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyFaultSequenceConfiguration()
	 * @generated
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION = 39;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Pinned Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__PINNED_SERVERS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Service Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_GROUP = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__TRACE_ENABLED = CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__STATISTICS_ENABLED = CONFIGURATION_ELEMENT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Transports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__TRANSPORTS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 5;

				/**
	 * The feature id for the '<em><b>Reliable Messaging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED = CONFIGURATION_ELEMENT_FEATURE_COUNT + 6;

				/**
	 * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SECURITY_ENABLED = CONFIGURATION_ELEMENT_FEATURE_COUNT + 7;

				/**
	 * The feature id for the '<em><b>Wsdl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__WSDL_CONFIGURATION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 8;

				/**
	 * The feature id for the '<em><b>In Sequence Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__IN_SEQUENCE_CONFIGURATION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 9;

				/**
	 * The feature id for the '<em><b>Endpoint Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__ENDPOINT_CONFIGURATION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 10;

				/**
	 * The feature id for the '<em><b>Out Sequence Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__OUT_SEQUENCE_CONFIGURATION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 11;

				/**
	 * The feature id for the '<em><b>Fault Sequence Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__FAULT_SEQUENCE_CONFIGURATION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 12;

				/**
	 * The feature id for the '<em><b>Service Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_PARAMETERS = CONFIGURATION_ELEMENT_FEATURE_COUNT + 13;

				/**
	 * The feature id for the '<em><b>Service Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE__SERVICE_POLICIES = CONFIGURATION_ELEMENT_FEATURE_COUNT + 14;

				/**
	 * The number of structural features of the '<em>Proxy Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 15;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Wsdl Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__WSDL_TYPE = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Wsdl XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__WSDL_XML = MODEL_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Wsdl URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__WSDL_URL = MODEL_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Wsdl Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__WSDL_KEY = MODEL_OBJECT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Wsdl Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION__WSDL_RESOURCES = MODEL_OBJECT_FEATURE_COUNT + 4;

				/**
	 * The number of structural features of the '<em>Proxy Wsdl Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_CONFIGURATION_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 5;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__OBJECT_STATE = ABSTRACT_LOCATION_KEY_RESOURCE__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__SOURCE_TEXT = ABSTRACT_LOCATION_KEY_RESOURCE__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__DEFAULT_NAMESPACE = ABSTRACT_LOCATION_KEY_RESOURCE__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__ADDITIONAL_NAMESPACES = ABSTRACT_LOCATION_KEY_RESOURCE__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__LOCATION = ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION;

				/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE__KEY = ABSTRACT_LOCATION_KEY_RESOURCE__KEY;

				/**
	 * The number of structural features of the '<em>Proxy Wsdl Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_WSDL_RESOURCE_FEATURE_COUNT = ABSTRACT_LOCATION_KEY_RESOURCE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__NAME = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER__VALUE = MODEL_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Proxy Service Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_PARAMETER_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY__POLICY_KEY = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Proxy Service Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SERVICE_POLICY_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Inline Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE = MODEL_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_KEY = MODEL_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_NAME = MODEL_OBJECT_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Abstract Proxy Sequence Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROXY_SEQUENCE_CONFIGURATION_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__OBJECT_STATE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__SOURCE_TEXT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE;

				/**
	 * The feature id for the '<em><b>Inline Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE;

				/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__SEQUENCE_KEY = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_KEY;

				/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION__SEQUENCE_NAME = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_NAME;

				/**
	 * The number of structural features of the '<em>Proxy In Sequence Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_IN_SEQUENCE_CONFIGURATION_FEATURE_COUNT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__OBJECT_STATE = MODEL_OBJECT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__SOURCE_TEXT = MODEL_OBJECT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__DEFAULT_NAMESPACE = MODEL_OBJECT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__ADDITIONAL_NAMESPACES = MODEL_OBJECT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_TYPE = MODEL_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Inline Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__INLINE_ENDPOINT = MODEL_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Endpoint Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_KEY = MODEL_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_NAME = MODEL_OBJECT_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Proxy Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_ENDPOINT_CONFIGURATION_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__OBJECT_STATE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__SOURCE_TEXT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE;

				/**
	 * The feature id for the '<em><b>Inline Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE;

				/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__SEQUENCE_KEY = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_KEY;

				/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION__SEQUENCE_NAME = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_NAME;

				/**
	 * The number of structural features of the '<em>Proxy Out Sequence Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OUT_SEQUENCE_CONFIGURATION_FEATURE_COUNT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__OBJECT_STATE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__SOURCE_TEXT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Sequence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE;

				/**
	 * The feature id for the '<em><b>Inline Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE;

				/**
	 * The feature id for the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__SEQUENCE_KEY = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_KEY;

				/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION__SEQUENCE_NAME = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_NAME;

				/**
	 * The number of structural features of the '<em>Proxy Fault Sequence Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FAULT_SEQUENCE_CONFIGURATION_FEATURE_COUNT = ABSTRACT_PROXY_SEQUENCE_CONFIGURATION_FEATURE_COUNT + 0;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.LocalEntryImpl <em>Local Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.LocalEntryImpl
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLocalEntry()
	 * @generated
	 */
	int LOCAL_ENTRY = 40;

				/**
	 * The feature id for the '<em><b>Object State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__OBJECT_STATE = CONFIGURATION_ELEMENT__OBJECT_STATE;

				/**
	 * The feature id for the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__SOURCE_TEXT = CONFIGURATION_ELEMENT__SOURCE_TEXT;

				/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__DEFAULT_NAMESPACE = CONFIGURATION_ELEMENT__DEFAULT_NAMESPACE;

				/**
	 * The feature id for the '<em><b>Additional Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__ADDITIONAL_NAMESPACES = CONFIGURATION_ELEMENT__ADDITIONAL_NAMESPACES;

				/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__ENTRY_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_TYPE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_LITERAL = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Value XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_XML = CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Value URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY__VALUE_URL = CONFIGURATION_ELEMENT_FEATURE_COUNT + 4;

				/**
	 * The number of structural features of the '<em>Local Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENTRY_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 5;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.ModelObjectState <em>Model Object State</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObjectState
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getModelObjectState()
	 * @generated
	 */
    int MODEL_OBJECT_STATE = 41;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.PropertyValueType <em>Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.PropertyValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getPropertyValueType()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE = 42;

				/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointAddressingVersion()
	 * @generated
	 */
    int END_POINT_ADDRESSING_VERSION = 45;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointTimeOutAction()
	 * @generated
	 */
    int END_POINT_TIME_OUT_ACTION = 46;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat <em>End Point Message Format</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointMessageFormat()
	 * @generated
	 */
    int END_POINT_MESSAGE_FORMAT = 47;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointAttachmentOptimization()
	 * @generated
	 */
    int END_POINT_ATTACHMENT_OPTIMIZATION = 48;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType <em>End Point Wsdl Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointWsdlType()
	 * @generated
	 */
    int END_POINT_WSDL_TYPE = 49;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm <em>Load Balance Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceAlgorithm()
	 * @generated
	 */
    int LOAD_BALANCE_ALGORITHM = 50;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType <em>Load Balance Session Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceSessionType()
	 * @generated
	 */
    int LOAD_BALANCE_SESSION_TYPE = 51;

    /**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlType()
	 * @generated
	 */
	int PROXY_WSDL_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxySequenceType <em>Proxy Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxySequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxySequenceType()
	 * @generated
	 */
	int PROXY_SEQUENCE_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType <em>Proxy Endpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyEndpointType()
	 * @generated
	 */
	int PROXY_ENDPOINT_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType <em>Local Entry Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLocalEntryValueType()
	 * @generated
	 */
	int LOCAL_ENTRY_VALUE_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.TargetSequenceType <em>Target Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.TargetSequenceType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getTargetSequenceType()
	 * @generated
	 */
	int TARGET_SEQUENCE_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.wso2.carbonstudio.eclipse.esb.TargetEndpointType <em>Target Endpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.carbonstudio.eclipse.esb.TargetEndpointType
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getTargetEndpointType()
	 * @generated
	 */
	int TARGET_ENDPOINT_TYPE = 44;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 56;

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject <em>Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Object</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject
	 * @generated
	 */
	EClass getModelObject();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject#getObjectState <em>Object State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object State</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject#getObjectState()
	 * @see #getModelObject()
	 * @generated
	 */
    EAttribute getModelObject_ObjectState();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject#getSourceText <em>Source Text</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Text</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject#getSourceText()
	 * @see #getModelObject()
	 * @generated
	 */
    EAttribute getModelObject_SourceText();

    /**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject#getDefaultNamespace <em>Default Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Namespace</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject#getDefaultNamespace()
	 * @see #getModelObject()
	 * @generated
	 */
	EReference getModelObject_DefaultNamespace();

				/**
	 * Returns the meta object for the reference list '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject#getAdditionalNamespaces <em>Additional Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Namespaces</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject#getAdditionalNamespaces()
	 * @see #getModelObject()
	 * @generated
	 */
	EReference getModelObject_AdditionalNamespaces();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.Namespace
	 * @generated
	 */
	EClass getNamespace();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.Namespace#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.Namespace#getUri()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Uri();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.SynapseConfiguration <em>Synapse Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synapse Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.SynapseConfiguration
	 * @generated
	 */
	EClass getSynapseConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.SynapseConfiguration#getConfigurationElements <em>Configuration Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Elements</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.SynapseConfiguration#getConfigurationElements()
	 * @see #getSynapseConfiguration()
	 * @generated
	 */
	EReference getSynapseConfiguration_ConfigurationElements();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ConfigurationElement <em>Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Element</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ConfigurationElement
	 * @generated
	 */
	EClass getConfigurationElement();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.NamespacedProperty <em>Namespaced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespaced Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.NamespacedProperty
	 * @generated
	 */
	EClass getNamespacedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPrettyName <em>Pretty Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pretty Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPrettyName()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PrettyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPropertyName()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getPropertyValue()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespaces</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.NamespacedProperty#getNamespaces()
	 * @see #getNamespacedProperty()
	 * @generated
	 */
	EAttribute getNamespacedProperty_Namespaces();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty <em>Registry Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Key Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty
	 * @generated
	 */
	EClass getRegistryKeyProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getPrettyName <em>Pretty Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pretty Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getPrettyName()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_PrettyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getKeyName()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getKeyValue()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_KeyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty#getFilters()
	 * @see #getRegistryKeyProperty()
	 * @generated
	 */
	EAttribute getRegistryKeyProperty_Filters();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService <em>Proxy Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService
	 * @generated
	 */
	EClass getProxyService();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getName()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_Name();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getServiceGroup <em>Service Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Group</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getServiceGroup()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_ServiceGroup();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getPinnedServers <em>Pinned Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinned Servers</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getPinnedServers()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_PinnedServers();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#isTraceEnabled <em>Trace Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#isTraceEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_TraceEnabled();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#isStatisticsEnabled <em>Statistics Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statistics Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#isStatisticsEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_StatisticsEnabled();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getTransports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transports</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getTransports()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_Transports();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliable Messaging Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#isReliableMessagingEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_ReliableMessagingEnabled();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#isSecurityEnabled <em>Security Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#isSecurityEnabled()
	 * @see #getProxyService()
	 * @generated
	 */
	EAttribute getProxyService_SecurityEnabled();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getWsdlConfiguration <em>Wsdl Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getWsdlConfiguration()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_WsdlConfiguration();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getInSequenceConfiguration <em>In Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getInSequenceConfiguration()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_InSequenceConfiguration();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getEndpointConfiguration <em>Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getEndpointConfiguration()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_EndpointConfiguration();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getOutSequenceConfiguration <em>Out Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getOutSequenceConfiguration()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_OutSequenceConfiguration();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getFaultSequenceConfiguration <em>Fault Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getFaultSequenceConfiguration()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_FaultSequenceConfiguration();

				/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getServiceParameters <em>Service Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Parameters</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getServiceParameters()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_ServiceParameters();

				/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.ProxyService#getServicePolicies <em>Service Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Policies</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyService#getServicePolicies()
	 * @see #getProxyService()
	 * @generated
	 */
	EReference getProxyService_ServicePolicies();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlResource <em>Proxy Wsdl Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Wsdl Resource</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlResource
	 * @generated
	 */
	EClass getProxyWsdlResource();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter <em>Proxy Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Parameter</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter
	 * @generated
	 */
	EClass getProxyServiceParameter();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter#getName()
	 * @see #getProxyServiceParameter()
	 * @generated
	 */
	EAttribute getProxyServiceParameter_Name();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyServiceParameter#getValue()
	 * @see #getProxyServiceParameter()
	 * @generated
	 */
	EAttribute getProxyServiceParameter_Value();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyServicePolicy <em>Proxy Service Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Service Policy</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyServicePolicy
	 * @generated
	 */
	EClass getProxyServicePolicy();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyServicePolicy#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyServicePolicy#getPolicyKey()
	 * @see #getProxyServicePolicy()
	 * @generated
	 */
	EReference getProxyServicePolicy_PolicyKey();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration <em>Abstract Proxy Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Proxy Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration
	 * @generated
	 */
	EClass getAbstractProxySequenceConfiguration();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceType()
	 * @see #getAbstractProxySequenceConfiguration()
	 * @generated
	 */
	EAttribute getAbstractProxySequenceConfiguration_SequenceType();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getInlineSequence <em>Inline Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline Sequence</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getInlineSequence()
	 * @see #getAbstractProxySequenceConfiguration()
	 * @generated
	 */
	EReference getAbstractProxySequenceConfiguration_InlineSequence();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceKey()
	 * @see #getAbstractProxySequenceConfiguration()
	 * @generated
	 */
	EReference getAbstractProxySequenceConfiguration_SequenceKey();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractProxySequenceConfiguration#getSequenceName()
	 * @see #getAbstractProxySequenceConfiguration()
	 * @generated
	 */
	EAttribute getAbstractProxySequenceConfiguration_SequenceName();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyInSequenceConfiguration <em>Proxy In Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy In Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyInSequenceConfiguration
	 * @generated
	 */
	EClass getProxyInSequenceConfiguration();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration <em>Proxy Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Endpoint Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration
	 * @generated
	 */
	EClass getProxyEndpointConfiguration();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointType()
	 * @see #getProxyEndpointConfiguration()
	 * @generated
	 */
	EAttribute getProxyEndpointConfiguration_EndpointType();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getInlineEndpoint <em>Inline Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline Endpoint</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getInlineEndpoint()
	 * @see #getProxyEndpointConfiguration()
	 * @generated
	 */
	EReference getProxyEndpointConfiguration_InlineEndpoint();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointKey <em>Endpoint Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointKey()
	 * @see #getProxyEndpointConfiguration()
	 * @generated
	 */
	EReference getProxyEndpointConfiguration_EndpointKey();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointName <em>Endpoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointConfiguration#getEndpointName()
	 * @see #getProxyEndpointConfiguration()
	 * @generated
	 */
	EAttribute getProxyEndpointConfiguration_EndpointName();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyOutSequenceConfiguration <em>Proxy Out Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Out Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyOutSequenceConfiguration
	 * @generated
	 */
	EClass getProxyOutSequenceConfiguration();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyFaultSequenceConfiguration <em>Proxy Fault Sequence Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Fault Sequence Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyFaultSequenceConfiguration
	 * @generated
	 */
	EClass getProxyFaultSequenceConfiguration();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry <em>Local Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Entry</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry
	 * @generated
	 */
	EClass getLocalEntry();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry#getEntryName <em>Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry#getEntryName()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_EntryName();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueType()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueType();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueLiteral()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueLiteral();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueXML <em>Value XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value XML</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueXML()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueXML();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueURL <em>Value URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URL</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntry#getValueURL()
	 * @see #getLocalEntry()
	 * @generated
	 */
	EAttribute getLocalEntry_ValueURL();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration <em>Proxy Wsdl Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Wsdl Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration
	 * @generated
	 */
	EClass getProxyWsdlConfiguration();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlType <em>Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlType()
	 * @see #getProxyWsdlConfiguration()
	 * @generated
	 */
	EAttribute getProxyWsdlConfiguration_WsdlType();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlXML <em>Wsdl XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl XML</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlXML()
	 * @see #getProxyWsdlConfiguration()
	 * @generated
	 */
	EAttribute getProxyWsdlConfiguration_WsdlXML();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlURL <em>Wsdl URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl URL</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlURL()
	 * @see #getProxyWsdlConfiguration()
	 * @generated
	 */
	EAttribute getProxyWsdlConfiguration_WsdlURL();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlKey <em>Wsdl Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlKey()
	 * @see #getProxyWsdlConfiguration()
	 * @generated
	 */
	EReference getProxyWsdlConfiguration_WsdlKey();

				/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlResources <em>Wsdl Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsdl Resources</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlConfiguration#getWsdlResources()
	 * @see #getProxyWsdlConfiguration()
	 * @generated
	 */
	EReference getProxyWsdlConfiguration_WsdlResources();

				/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.ModelObjectState <em>Model Object State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Object State</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObjectState
	 * @generated
	 */
    EEnum getModelObjectState();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.PropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.PropertyValueType
	 * @generated
	 */
	EEnum getPropertyValueType();

				/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Addressing Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion
	 * @generated
	 */
    EEnum getEndPointAddressingVersion();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Time Out Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction
	 * @generated
	 */
    EEnum getEndPointTimeOutAction();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat <em>End Point Message Format</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Message Format</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat
	 * @generated
	 */
    EEnum getEndPointMessageFormat();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Attachment Optimization</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization
	 * @generated
	 */
    EEnum getEndPointAttachmentOptimization();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType <em>End Point Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Point Wsdl Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType
	 * @generated
	 */
    EEnum getEndPointWsdlType();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm <em>Load Balance Algorithm</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Balance Algorithm</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm
	 * @generated
	 */
    EEnum getLoadBalanceAlgorithm();

    /**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType <em>Load Balance Session Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Balance Session Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType
	 * @generated
	 */
    EEnum getLoadBalanceSessionType();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.MediatorBranch <em>Mediator Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Branch</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorBranch
	 * @generated
	 */
	EClass getMediatorBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.MediatorBranch#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorBranch#getChildren()
	 * @see #getMediatorBranch()
	 * @generated
	 */
	EReference getMediatorBranch_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence <em>Mediator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Sequence</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorSequence
	 * @generated
	 */
	EClass getMediatorSequence();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorSequence#isAnonymous()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EAttribute getMediatorSequence_Anonymous();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getSequenceName()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EAttribute getMediatorSequence_SequenceName();

				/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getMediators <em>Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mediators</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getMediators()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EReference getMediatorSequence_Mediators();

	/**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Error</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorSequence#getOnError()
	 * @see #getMediatorSequence()
	 * @generated
	 */
	EReference getMediatorSequence_OnError();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ParentMediator <em>Parent Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Mediator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ParentMediator
	 * @generated
	 */
	EClass getParentMediator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.ParentMediator#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ParentMediator#getChildren()
	 * @see #getParentMediator()
	 * @generated
	 */
	EReference getParentMediator_Children();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty <em>Abstract Name Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Value Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty
	 * @generated
	 */
	EClass getAbstractNameValueProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty#getPropertyName()
	 * @see #getAbstractNameValueProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty#getPropertyValue()
	 * @see #getAbstractNameValueProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueProperty_PropertyValue();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty <em>Abstract Name Value Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Value Expression Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty
	 * @generated
	 */
	EClass getAbstractNameValueExpressionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyName()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyValueType()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyValue()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EAttribute getAbstractNameValueExpressionProperty_PropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty#getPropertyExpression()
	 * @see #getAbstractNameValueExpressionProperty()
	 * @generated
	 */
	EReference getAbstractNameValueExpressionProperty_PropertyExpression();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature <em>Abstract Boolean Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Boolean Feature</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature
	 * @generated
	 */
	EClass getAbstractBooleanFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature#getFeatureName()
	 * @see #getAbstractBooleanFeature()
	 * @generated
	 */
	EAttribute getAbstractBooleanFeature_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature#isFeatureEnabled <em>Feature Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature#isFeatureEnabled()
	 * @see #getAbstractBooleanFeature()
	 * @generated
	 */
	EAttribute getAbstractBooleanFeature_FeatureEnabled();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource <em>Abstract Location Key Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Location Key Resource</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource
	 * @generated
	 */
	EClass getAbstractLocationKeyResource();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource#getLocation()
	 * @see #getAbstractLocationKeyResource()
	 * @generated
	 */
	EAttribute getAbstractLocationKeyResource_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource#getKey()
	 * @see #getAbstractLocationKeyResource()
	 * @generated
	 */
	EReference getAbstractLocationKeyResource_Key();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget <em>Abstract Common Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Common Target</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget
	 * @generated
	 */
	EClass getAbstractCommonTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequenceType()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EAttribute getAbstractCommonTarget_SequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequence()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequenceKey <em>Sequence Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getSequenceKey()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_SequenceKey();

	/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpointType()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EAttribute getAbstractCommonTarget_EndpointType();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpoint()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpointKey <em>Endpoint Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget#getEndpointKey()
	 * @see #getAbstractCommonTarget()
	 * @generated
	 */
	EReference getAbstractCommonTarget_EndpointKey();

	/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPoint
	 * @generated
	 */
    EClass getEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.EndPoint#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPoint#isAnonymous()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Anonymous();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.EndPoint#getEndpointName <em>Endpoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPoint#getEndpointName()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_EndpointName();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.UnknownObject <em>Unknown Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Object</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.UnknownObject
	 * @generated
	 */
    EClass getUnknownObject();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint <em>Abstract End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint
	 * @generated
	 */
    EClass getAbstractEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isReliableMessagingEnabled <em>Reliable Messaging Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliable Messaging Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isReliableMessagingEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_ReliableMessagingEnabled();

    /**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getReliableMessagingPolicy <em>Reliable Messaging Policy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reliable Messaging Policy</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getReliableMessagingPolicy()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EReference getAbstractEndPoint_ReliableMessagingPolicy();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isSecurityEnabled <em>Security Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isSecurityEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_SecurityEnabled();

    /**
	 * Returns the meta object for the reference '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSecurityPolicy <em>Security Policy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Policy</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSecurityPolicy()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EReference getAbstractEndPoint_SecurityPolicy();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint <em>Abstract Default End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Default End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint
	 * @generated
	 */
    EClass getAbstractDefaultEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getMessageFormat <em>Message Format</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Format</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getMessageFormat()
	 * @see #getAbstractDefaultEndPoint()
	 * @generated
	 */
    EAttribute getAbstractDefaultEndPoint_MessageFormat();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getAttachmentOptimization <em>Attachment Optimization</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Optimization</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getAttachmentOptimization()
	 * @see #getAbstractDefaultEndPoint()
	 * @generated
	 */
    EAttribute getAbstractDefaultEndPoint_AttachmentOptimization();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#getEncoding()
	 * @see #getAbstractDefaultEndPoint()
	 * @generated
	 */
    EAttribute getAbstractDefaultEndPoint_Encoding();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#isStatisticsEnabled <em>Statistics Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statistics Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#isStatisticsEnabled()
	 * @see #getAbstractDefaultEndPoint()
	 * @generated
	 */
    EAttribute getAbstractDefaultEndPoint_StatisticsEnabled();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#isTraceEnabled <em>Trace Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractDefaultEndPoint#isTraceEnabled()
	 * @see #getAbstractDefaultEndPoint()
	 * @generated
	 */
    EAttribute getAbstractDefaultEndPoint_TraceEnabled();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.DefaultEndPoint <em>Default End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DefaultEndPoint
	 * @generated
	 */
    EClass getDefaultEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isAddressingEnabled <em>Addressing Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isAddressingEnabled()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_AddressingEnabled();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getAddressingVersion <em>Addressing Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Version</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getAddressingVersion()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_AddressingVersion();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isAddressingSeparateListener <em>Addressing Separate Listener</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addressing Separate Listener</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#isAddressingSeparateListener()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_AddressingSeparateListener();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getTimeOutDuration <em>Time Out Duration</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out Duration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getTimeOutDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_TimeOutDuration();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getTimeOutAction <em>Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out Action</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getTimeOutAction()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_TimeOutAction();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryErrorCodes <em>Retry Error Codes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Error Codes</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryErrorCodes()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_RetryErrorCodes();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryCount <em>Retry Count</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryCount()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_RetryCount();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryDelay <em>Retry Delay</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Delay</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getRetryDelay()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_RetryDelay();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendErrorCodes <em>Suspend Error Codes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Error Codes</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendErrorCodes()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_SuspendErrorCodes();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendInitialDuration <em>Suspend Initial Duration</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Initial Duration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendInitialDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_SuspendInitialDuration();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendMaximumDuration <em>Suspend Maximum Duration</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Maximum Duration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendMaximumDuration()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_SuspendMaximumDuration();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendProgressionFactor <em>Suspend Progression Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Progression Factor</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractEndPoint#getSuspendProgressionFactor()
	 * @see #getAbstractEndPoint()
	 * @generated
	 */
    EAttribute getAbstractEndPoint_SuspendProgressionFactor();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.AddressEndPoint <em>Address End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AddressEndPoint
	 * @generated
	 */
    EClass getAddressEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.AddressEndPoint#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.AddressEndPoint#getUri()
	 * @see #getAddressEndPoint()
	 * @generated
	 */
    EAttribute getAddressEndPoint_Uri();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint <em>Wsdl End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint
	 * @generated
	 */
    EClass getWsdlEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlType <em>Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlType()
	 * @see #getWsdlEndPoint()
	 * @generated
	 */
    EAttribute getWsdlEndPoint_WsdlType();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlURI <em>Wsdl URI</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl URI</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlURI()
	 * @see #getWsdlEndPoint()
	 * @generated
	 */
    EAttribute getWsdlEndPoint_WsdlURI();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlXML <em>Wsdl XML</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl XML</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getWsdlXML()
	 * @see #getWsdlEndPoint()
	 * @generated
	 */
    EAttribute getWsdlEndPoint_WsdlXML();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getService()
	 * @see #getWsdlEndPoint()
	 * @generated
	 */
    EAttribute getWsdlEndPoint_Service();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.WsdlEndPoint#getPort()
	 * @see #getWsdlEndPoint()
	 * @generated
	 */
    EAttribute getWsdlEndPoint_Port();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.ParentEndPoint <em>Parent End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ParentEndPoint
	 * @generated
	 */
    EClass getParentEndPoint();

    /**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.ParentEndPoint#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ParentEndPoint#getChildren()
	 * @see #getParentEndPoint()
	 * @generated
	 */
    EReference getParentEndPoint_Children();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.FailoverEndPoint <em>Failover End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.FailoverEndPoint
	 * @generated
	 */
    EClass getFailoverEndPoint();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint <em>Load Balance End Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balance End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint
	 * @generated
	 */
    EClass getLoadBalanceEndPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getAlgorithm()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
    EAttribute getLoadBalanceEndPoint_Algorithm();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getSessionType()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
    EAttribute getLoadBalanceEndPoint_SessionType();

    /**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Timeout</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceEndPoint#getSessionTimeout()
	 * @see #getLoadBalanceEndPoint()
	 * @generated
	 */
    EAttribute getLoadBalanceEndPoint_SessionTimeout();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint <em>Dynamic Load Balance End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Load Balance End Point</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint
	 * @generated
	 */
	EClass getDynamicLoadBalanceEndPoint();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getAlgorithm()
	 * @see #getDynamicLoadBalanceEndPoint()
	 * @generated
	 */
	EAttribute getDynamicLoadBalanceEndPoint_Algorithm();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#isFailoverEnabled <em>Failover Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failover Enabled</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#isFailoverEnabled()
	 * @see #getDynamicLoadBalanceEndPoint()
	 * @generated
	 */
	EAttribute getDynamicLoadBalanceEndPoint_FailoverEnabled();

				/**
	 * Returns the meta object for the attribute '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getMembershipHandlerClass <em>Membership Handler Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Membership Handler Class</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getMembershipHandlerClass()
	 * @see #getDynamicLoadBalanceEndPoint()
	 * @generated
	 */
	EAttribute getDynamicLoadBalanceEndPoint_MembershipHandlerClass();

				/**
	 * Returns the meta object for the containment reference list '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceEndPoint#getProperties()
	 * @see #getDynamicLoadBalanceEndPoint()
	 * @generated
	 */
	EReference getDynamicLoadBalanceEndPoint_Properties();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceProperty <em>Dynamic Load Balance Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Load Balance Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.DynamicLoadBalanceProperty
	 * @generated
	 */
	EClass getDynamicLoadBalanceProperty();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.EndPointReference <em>End Point Reference</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Reference</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.EndPointReference
	 * @generated
	 */
    EClass getEndPointReference();

    /**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.XPathEndPointReference <em>XPath End Point Reference</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPath End Point Reference</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.XPathEndPointReference
	 * @generated
	 */
    EClass getXPathEndPointReference();

    /**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.XPathEndPointReference#getEndpointXpath <em>Endpoint Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Xpath</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.XPathEndPointReference#getEndpointXpath()
	 * @see #getXPathEndPointReference()
	 * @generated
	 */
	EReference getXPathEndPointReference_EndpointXpath();

				/**
	 * Returns the meta object for class '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyEndPointReference <em>Registry Key End Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Key End Point Reference</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyEndPointReference
	 * @generated
	 */
	EClass getRegistryKeyEndPointReference();

				/**
	 * Returns the meta object for the containment reference '{@link org.wso2.carbonstudio.eclipse.esb.RegistryKeyEndPointReference#getEndpointKey <em>Endpoint Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Key</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.RegistryKeyEndPointReference#getEndpointKey()
	 * @see #getRegistryKeyEndPointReference()
	 * @generated
	 */
	EReference getRegistryKeyEndPointReference_EndpointKey();

				/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proxy Wsdl Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType
	 * @generated
	 */
	EEnum getProxyWsdlType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.ProxySequenceType <em>Proxy Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proxy Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxySequenceType
	 * @generated
	 */
	EEnum getProxySequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType <em>Proxy Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proxy Endpoint Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType
	 * @generated
	 */
	EEnum getProxyEndpointType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType <em>Local Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Local Entry Value Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType
	 * @generated
	 */
	EEnum getLocalEntryValueType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.TargetSequenceType <em>Target Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Sequence Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.TargetSequenceType
	 * @generated
	 */
	EEnum getTargetSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.wso2.carbonstudio.eclipse.esb.TargetEndpointType <em>Target Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Endpoint Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.esb.TargetEndpointType
	 * @generated
	 */
	EEnum getTargetEndpointType();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsbFactory getEsbFactory();

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
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl <em>Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getModelObject()
		 * @generated
		 */
		EClass MODEL_OBJECT = eINSTANCE.getModelObject();

		/**
		 * The meta object literal for the '<em><b>Object State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MODEL_OBJECT__OBJECT_STATE = eINSTANCE.getModelObject_ObjectState();

        /**
		 * The meta object literal for the '<em><b>Source Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MODEL_OBJECT__SOURCE_TEXT = eINSTANCE.getModelObject_SourceText();

        /**
		 * The meta object literal for the '<em><b>Default Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OBJECT__DEFAULT_NAMESPACE = eINSTANCE.getModelObject_DefaultNamespace();

								/**
		 * The meta object literal for the '<em><b>Additional Namespaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OBJECT__ADDITIONAL_NAMESPACES = eINSTANCE.getModelObject_AdditionalNamespaces();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.NamespaceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

								/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PREFIX = eINSTANCE.getNamespace_Prefix();

								/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__URI = eINSTANCE.getNamespace_Uri();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.SynapseConfigurationImpl <em>Synapse Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.SynapseConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getSynapseConfiguration()
		 * @generated
		 */
		EClass SYNAPSE_CONFIGURATION = eINSTANCE.getSynapseConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNAPSE_CONFIGURATION__CONFIGURATION_ELEMENTS = eINSTANCE.getSynapseConfiguration_ConfigurationElements();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ConfigurationElementImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getConfigurationElement()
		 * @generated
		 */
		EClass CONFIGURATION_ELEMENT = eINSTANCE.getConfigurationElement();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.NamespacedPropertyImpl <em>Namespaced Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.NamespacedPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getNamespacedProperty()
		 * @generated
		 */
		EClass NAMESPACED_PROPERTY = eINSTANCE.getNamespacedProperty();

		/**
		 * The meta object literal for the '<em><b>Pretty Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PRETTY_NAME = eINSTANCE.getNamespacedProperty_PrettyName();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PROPERTY_NAME = eINSTANCE.getNamespacedProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__PROPERTY_VALUE = eINSTANCE.getNamespacedProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_PROPERTY__NAMESPACES = eINSTANCE.getNamespacedProperty_Namespaces();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyPropertyImpl <em>Registry Key Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getRegistryKeyProperty()
		 * @generated
		 */
		EClass REGISTRY_KEY_PROPERTY = eINSTANCE.getRegistryKeyProperty();

		/**
		 * The meta object literal for the '<em><b>Pretty Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__PRETTY_NAME = eINSTANCE.getRegistryKeyProperty_PrettyName();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__KEY_NAME = eINSTANCE.getRegistryKeyProperty_KeyName();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__KEY_VALUE = eINSTANCE.getRegistryKeyProperty_KeyValue();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_KEY_PROPERTY__FILTERS = eINSTANCE.getRegistryKeyProperty_Filters();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceImpl <em>Proxy Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyService()
		 * @generated
		 */
		EClass PROXY_SERVICE = eINSTANCE.getProxyService();

								/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__NAME = eINSTANCE.getProxyService_Name();

								/**
		 * The meta object literal for the '<em><b>Service Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__SERVICE_GROUP = eINSTANCE.getProxyService_ServiceGroup();

								/**
		 * The meta object literal for the '<em><b>Pinned Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__PINNED_SERVERS = eINSTANCE.getProxyService_PinnedServers();

								/**
		 * The meta object literal for the '<em><b>Trace Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__TRACE_ENABLED = eINSTANCE.getProxyService_TraceEnabled();

								/**
		 * The meta object literal for the '<em><b>Statistics Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__STATISTICS_ENABLED = eINSTANCE.getProxyService_StatisticsEnabled();

								/**
		 * The meta object literal for the '<em><b>Transports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__TRANSPORTS = eINSTANCE.getProxyService_Transports();

								/**
		 * The meta object literal for the '<em><b>Reliable Messaging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__RELIABLE_MESSAGING_ENABLED = eINSTANCE.getProxyService_ReliableMessagingEnabled();

								/**
		 * The meta object literal for the '<em><b>Security Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE__SECURITY_ENABLED = eINSTANCE.getProxyService_SecurityEnabled();

								/**
		 * The meta object literal for the '<em><b>Wsdl Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__WSDL_CONFIGURATION = eINSTANCE.getProxyService_WsdlConfiguration();

								/**
		 * The meta object literal for the '<em><b>In Sequence Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__IN_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyService_InSequenceConfiguration();

								/**
		 * The meta object literal for the '<em><b>Endpoint Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__ENDPOINT_CONFIGURATION = eINSTANCE.getProxyService_EndpointConfiguration();

								/**
		 * The meta object literal for the '<em><b>Out Sequence Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__OUT_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyService_OutSequenceConfiguration();

								/**
		 * The meta object literal for the '<em><b>Fault Sequence Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__FAULT_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyService_FaultSequenceConfiguration();

								/**
		 * The meta object literal for the '<em><b>Service Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__SERVICE_PARAMETERS = eINSTANCE.getProxyService_ServiceParameters();

								/**
		 * The meta object literal for the '<em><b>Service Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE__SERVICE_POLICIES = eINSTANCE.getProxyService_ServicePolicies();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlResourceImpl <em>Proxy Wsdl Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlResourceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlResource()
		 * @generated
		 */
		EClass PROXY_WSDL_RESOURCE = eINSTANCE.getProxyWsdlResource();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceParameterImpl <em>Proxy Service Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServiceParameterImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyServiceParameter()
		 * @generated
		 */
		EClass PROXY_SERVICE_PARAMETER = eINSTANCE.getProxyServiceParameter();

								/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE_PARAMETER__NAME = eINSTANCE.getProxyServiceParameter_Name();

								/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_SERVICE_PARAMETER__VALUE = eINSTANCE.getProxyServiceParameter_Value();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyServicePolicyImpl <em>Proxy Service Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyServicePolicyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyServicePolicy()
		 * @generated
		 */
		EClass PROXY_SERVICE_POLICY = eINSTANCE.getProxyServicePolicy();

								/**
		 * The meta object literal for the '<em><b>Policy Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SERVICE_POLICY__POLICY_KEY = eINSTANCE.getProxyServicePolicy_PolicyKey();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractProxySequenceConfigurationImpl <em>Abstract Proxy Sequence Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractProxySequenceConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractProxySequenceConfiguration()
		 * @generated
		 */
		EClass ABSTRACT_PROXY_SEQUENCE_CONFIGURATION = eINSTANCE.getAbstractProxySequenceConfiguration();

								/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_TYPE = eINSTANCE.getAbstractProxySequenceConfiguration_SequenceType();

								/**
		 * The meta object literal for the '<em><b>Inline Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__INLINE_SEQUENCE = eINSTANCE.getAbstractProxySequenceConfiguration_InlineSequence();

								/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_KEY = eINSTANCE.getAbstractProxySequenceConfiguration_SequenceKey();

								/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROXY_SEQUENCE_CONFIGURATION__SEQUENCE_NAME = eINSTANCE.getAbstractProxySequenceConfiguration_SequenceName();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyInSequenceConfigurationImpl <em>Proxy In Sequence Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyInSequenceConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyInSequenceConfiguration()
		 * @generated
		 */
		EClass PROXY_IN_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyInSequenceConfiguration();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyEndpointConfigurationImpl <em>Proxy Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyEndpointConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyEndpointConfiguration()
		 * @generated
		 */
		EClass PROXY_ENDPOINT_CONFIGURATION = eINSTANCE.getProxyEndpointConfiguration();

								/**
		 * The meta object literal for the '<em><b>Endpoint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_TYPE = eINSTANCE.getProxyEndpointConfiguration_EndpointType();

								/**
		 * The meta object literal for the '<em><b>Inline Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_ENDPOINT_CONFIGURATION__INLINE_ENDPOINT = eINSTANCE.getProxyEndpointConfiguration_InlineEndpoint();

								/**
		 * The meta object literal for the '<em><b>Endpoint Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_KEY = eINSTANCE.getProxyEndpointConfiguration_EndpointKey();

								/**
		 * The meta object literal for the '<em><b>Endpoint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_ENDPOINT_CONFIGURATION__ENDPOINT_NAME = eINSTANCE.getProxyEndpointConfiguration_EndpointName();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyOutSequenceConfigurationImpl <em>Proxy Out Sequence Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyOutSequenceConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyOutSequenceConfiguration()
		 * @generated
		 */
		EClass PROXY_OUT_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyOutSequenceConfiguration();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyFaultSequenceConfigurationImpl <em>Proxy Fault Sequence Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyFaultSequenceConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyFaultSequenceConfiguration()
		 * @generated
		 */
		EClass PROXY_FAULT_SEQUENCE_CONFIGURATION = eINSTANCE.getProxyFaultSequenceConfiguration();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.LocalEntryImpl <em>Local Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.LocalEntryImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLocalEntry()
		 * @generated
		 */
		EClass LOCAL_ENTRY = eINSTANCE.getLocalEntry();

								/**
		 * The meta object literal for the '<em><b>Entry Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__ENTRY_NAME = eINSTANCE.getLocalEntry_EntryName();

								/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_TYPE = eINSTANCE.getLocalEntry_ValueType();

								/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_LITERAL = eINSTANCE.getLocalEntry_ValueLiteral();

								/**
		 * The meta object literal for the '<em><b>Value XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_XML = eINSTANCE.getLocalEntry_ValueXML();

								/**
		 * The meta object literal for the '<em><b>Value URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ENTRY__VALUE_URL = eINSTANCE.getLocalEntry_ValueURL();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlConfigurationImpl <em>Proxy Wsdl Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ProxyWsdlConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlConfiguration()
		 * @generated
		 */
		EClass PROXY_WSDL_CONFIGURATION = eINSTANCE.getProxyWsdlConfiguration();

								/**
		 * The meta object literal for the '<em><b>Wsdl Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_WSDL_CONFIGURATION__WSDL_TYPE = eINSTANCE.getProxyWsdlConfiguration_WsdlType();

								/**
		 * The meta object literal for the '<em><b>Wsdl XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_WSDL_CONFIGURATION__WSDL_XML = eINSTANCE.getProxyWsdlConfiguration_WsdlXML();

								/**
		 * The meta object literal for the '<em><b>Wsdl URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_WSDL_CONFIGURATION__WSDL_URL = eINSTANCE.getProxyWsdlConfiguration_WsdlURL();

								/**
		 * The meta object literal for the '<em><b>Wsdl Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_WSDL_CONFIGURATION__WSDL_KEY = eINSTANCE.getProxyWsdlConfiguration_WsdlKey();

								/**
		 * The meta object literal for the '<em><b>Wsdl Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_WSDL_CONFIGURATION__WSDL_RESOURCES = eINSTANCE.getProxyWsdlConfiguration_WsdlResources();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.ModelObjectState <em>Model Object State</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.ModelObjectState
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getModelObjectState()
		 * @generated
		 */
        EEnum MODEL_OBJECT_STATE = eINSTANCE.getModelObjectState();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.PropertyValueType <em>Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.PropertyValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getPropertyValueType()
		 * @generated
		 */
		EEnum PROPERTY_VALUE_TYPE = eINSTANCE.getPropertyValueType();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion <em>End Point Addressing Version</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAddressingVersion
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointAddressingVersion()
		 * @generated
		 */
        EEnum END_POINT_ADDRESSING_VERSION = eINSTANCE.getEndPointAddressingVersion();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction <em>End Point Time Out Action</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.EndPointTimeOutAction
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointTimeOutAction()
		 * @generated
		 */
        EEnum END_POINT_TIME_OUT_ACTION = eINSTANCE.getEndPointTimeOutAction();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat <em>End Point Message Format</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.EndPointMessageFormat
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointMessageFormat()
		 * @generated
		 */
        EEnum END_POINT_MESSAGE_FORMAT = eINSTANCE.getEndPointMessageFormat();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization <em>End Point Attachment Optimization</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.EndPointAttachmentOptimization
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointAttachmentOptimization()
		 * @generated
		 */
        EEnum END_POINT_ATTACHMENT_OPTIMIZATION = eINSTANCE.getEndPointAttachmentOptimization();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType <em>End Point Wsdl Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.EndPointWsdlType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointWsdlType()
		 * @generated
		 */
        EEnum END_POINT_WSDL_TYPE = eINSTANCE.getEndPointWsdlType();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm <em>Load Balance Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceAlgorithm
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceAlgorithm()
		 * @generated
		 */
        EEnum LOAD_BALANCE_ALGORITHM = eINSTANCE.getLoadBalanceAlgorithm();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType <em>Load Balance Session Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.LoadBalanceSessionType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceSessionType()
		 * @generated
		 */
        EEnum LOAD_BALANCE_SESSION_TYPE = eINSTANCE.getLoadBalanceSessionType();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorSequenceImpl <em>Mediator Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorSequenceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediatorSequence()
		 * @generated
		 */
		EClass MEDIATOR_SEQUENCE = eINSTANCE.getMediatorSequence();

								/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_SEQUENCE__ANONYMOUS = eINSTANCE.getMediatorSequence_Anonymous();

								/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_SEQUENCE__SEQUENCE_NAME = eINSTANCE.getMediatorSequence_SequenceName();

								/**
		 * The meta object literal for the '<em><b>Mediators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_SEQUENCE__MEDIATORS = eINSTANCE.getMediatorSequence_Mediators();

		/**
		 * The meta object literal for the '<em><b>On Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_SEQUENCE__ON_ERROR = eINSTANCE.getMediatorSequence_OnError();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPoint()
		 * @generated
		 */
        EClass END_POINT = eINSTANCE.getEndPoint();

        /**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__ANONYMOUS = eINSTANCE.getEndPoint_Anonymous();

								/**
		 * The meta object literal for the '<em><b>Endpoint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__ENDPOINT_NAME = eINSTANCE.getEndPoint_EndpointName();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl <em>Unknown Object</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getUnknownObject()
		 * @generated
		 */
        EClass UNKNOWN_OBJECT = eINSTANCE.getUnknownObject();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractEndPointImpl <em>Abstract End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractEndPoint()
		 * @generated
		 */
        EClass ABSTRACT_END_POINT = eINSTANCE.getAbstractEndPoint();

        /**
		 * The meta object literal for the '<em><b>Reliable Messaging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED = eINSTANCE.getAbstractEndPoint_ReliableMessagingEnabled();

        /**
		 * The meta object literal for the '<em><b>Reliable Messaging Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY = eINSTANCE.getAbstractEndPoint_ReliableMessagingPolicy();

        /**
		 * The meta object literal for the '<em><b>Security Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__SECURITY_ENABLED = eINSTANCE.getAbstractEndPoint_SecurityEnabled();

        /**
		 * The meta object literal for the '<em><b>Security Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ABSTRACT_END_POINT__SECURITY_POLICY = eINSTANCE.getAbstractEndPoint_SecurityPolicy();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractDefaultEndPointImpl <em>Abstract Default End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractDefaultEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractDefaultEndPoint()
		 * @generated
		 */
        EClass ABSTRACT_DEFAULT_END_POINT = eINSTANCE.getAbstractDefaultEndPoint();

        /**
		 * The meta object literal for the '<em><b>Message Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_DEFAULT_END_POINT__MESSAGE_FORMAT = eINSTANCE.getAbstractDefaultEndPoint_MessageFormat();

        /**
		 * The meta object literal for the '<em><b>Attachment Optimization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_DEFAULT_END_POINT__ATTACHMENT_OPTIMIZATION = eINSTANCE.getAbstractDefaultEndPoint_AttachmentOptimization();

        /**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_DEFAULT_END_POINT__ENCODING = eINSTANCE.getAbstractDefaultEndPoint_Encoding();

        /**
		 * The meta object literal for the '<em><b>Statistics Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_DEFAULT_END_POINT__STATISTICS_ENABLED = eINSTANCE.getAbstractDefaultEndPoint_StatisticsEnabled();

        /**
		 * The meta object literal for the '<em><b>Trace Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_DEFAULT_END_POINT__TRACE_ENABLED = eINSTANCE.getAbstractDefaultEndPoint_TraceEnabled();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DefaultEndPointImpl <em>Default End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.DefaultEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDefaultEndPoint()
		 * @generated
		 */
        EClass DEFAULT_END_POINT = eINSTANCE.getDefaultEndPoint();

        /**
		 * The meta object literal for the '<em><b>Addressing Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__ADDRESSING_ENABLED = eINSTANCE.getAbstractEndPoint_AddressingEnabled();

        /**
		 * The meta object literal for the '<em><b>Addressing Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__ADDRESSING_VERSION = eINSTANCE.getAbstractEndPoint_AddressingVersion();

        /**
		 * The meta object literal for the '<em><b>Addressing Separate Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER = eINSTANCE.getAbstractEndPoint_AddressingSeparateListener();

        /**
		 * The meta object literal for the '<em><b>Time Out Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__TIME_OUT_DURATION = eINSTANCE.getAbstractEndPoint_TimeOutDuration();

        /**
		 * The meta object literal for the '<em><b>Time Out Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__TIME_OUT_ACTION = eINSTANCE.getAbstractEndPoint_TimeOutAction();

        /**
		 * The meta object literal for the '<em><b>Retry Error Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__RETRY_ERROR_CODES = eINSTANCE.getAbstractEndPoint_RetryErrorCodes();

        /**
		 * The meta object literal for the '<em><b>Retry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__RETRY_COUNT = eINSTANCE.getAbstractEndPoint_RetryCount();

        /**
		 * The meta object literal for the '<em><b>Retry Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__RETRY_DELAY = eINSTANCE.getAbstractEndPoint_RetryDelay();

        /**
		 * The meta object literal for the '<em><b>Suspend Error Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__SUSPEND_ERROR_CODES = eINSTANCE.getAbstractEndPoint_SuspendErrorCodes();

        /**
		 * The meta object literal for the '<em><b>Suspend Initial Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION = eINSTANCE.getAbstractEndPoint_SuspendInitialDuration();

        /**
		 * The meta object literal for the '<em><b>Suspend Maximum Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION = eINSTANCE.getAbstractEndPoint_SuspendMaximumDuration();

        /**
		 * The meta object literal for the '<em><b>Suspend Progression Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR = eINSTANCE.getAbstractEndPoint_SuspendProgressionFactor();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AddressEndPointImpl <em>Address End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AddressEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAddressEndPoint()
		 * @generated
		 */
        EClass ADDRESS_END_POINT = eINSTANCE.getAddressEndPoint();

        /**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ADDRESS_END_POINT__URI = eINSTANCE.getAddressEndPoint_Uri();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.WsdlEndPointImpl <em>Wsdl End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.WsdlEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getWsdlEndPoint()
		 * @generated
		 */
        EClass WSDL_END_POINT = eINSTANCE.getWsdlEndPoint();

        /**
		 * The meta object literal for the '<em><b>Wsdl Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute WSDL_END_POINT__WSDL_TYPE = eINSTANCE.getWsdlEndPoint_WsdlType();

        /**
		 * The meta object literal for the '<em><b>Wsdl URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute WSDL_END_POINT__WSDL_URI = eINSTANCE.getWsdlEndPoint_WsdlURI();

        /**
		 * The meta object literal for the '<em><b>Wsdl XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute WSDL_END_POINT__WSDL_XML = eINSTANCE.getWsdlEndPoint_WsdlXML();

        /**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute WSDL_END_POINT__SERVICE = eINSTANCE.getWsdlEndPoint_Service();

        /**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute WSDL_END_POINT__PORT = eINSTANCE.getWsdlEndPoint_Port();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ParentEndPointImpl <em>Parent End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ParentEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getParentEndPoint()
		 * @generated
		 */
        EClass PARENT_END_POINT = eINSTANCE.getParentEndPoint();

        /**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARENT_END_POINT__CHILDREN = eINSTANCE.getParentEndPoint_Children();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.FailoverEndPointImpl <em>Failover End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.FailoverEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getFailoverEndPoint()
		 * @generated
		 */
        EClass FAILOVER_END_POINT = eINSTANCE.getFailoverEndPoint();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.LoadBalanceEndPointImpl <em>Load Balance End Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.LoadBalanceEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLoadBalanceEndPoint()
		 * @generated
		 */
        EClass LOAD_BALANCE_END_POINT = eINSTANCE.getLoadBalanceEndPoint();

        /**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LOAD_BALANCE_END_POINT__ALGORITHM = eINSTANCE.getLoadBalanceEndPoint_Algorithm();

        /**
		 * The meta object literal for the '<em><b>Session Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LOAD_BALANCE_END_POINT__SESSION_TYPE = eINSTANCE.getLoadBalanceEndPoint_SessionType();

        /**
		 * The meta object literal for the '<em><b>Session Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LOAD_BALANCE_END_POINT__SESSION_TIMEOUT = eINSTANCE.getLoadBalanceEndPoint_SessionTimeout();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalanceEndPointImpl <em>Dynamic Load Balance End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalanceEndPointImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDynamicLoadBalanceEndPoint()
		 * @generated
		 */
		EClass DYNAMIC_LOAD_BALANCE_END_POINT = eINSTANCE.getDynamicLoadBalanceEndPoint();

								/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LOAD_BALANCE_END_POINT__ALGORITHM = eINSTANCE.getDynamicLoadBalanceEndPoint_Algorithm();

								/**
		 * The meta object literal for the '<em><b>Failover Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LOAD_BALANCE_END_POINT__FAILOVER_ENABLED = eINSTANCE.getDynamicLoadBalanceEndPoint_FailoverEnabled();

								/**
		 * The meta object literal for the '<em><b>Membership Handler Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LOAD_BALANCE_END_POINT__MEMBERSHIP_HANDLER_CLASS = eINSTANCE.getDynamicLoadBalanceEndPoint_MembershipHandlerClass();

								/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_LOAD_BALANCE_END_POINT__PROPERTIES = eINSTANCE.getDynamicLoadBalanceEndPoint_Properties();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalancePropertyImpl <em>Dynamic Load Balance Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.DynamicLoadBalancePropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getDynamicLoadBalanceProperty()
		 * @generated
		 */
		EClass DYNAMIC_LOAD_BALANCE_PROPERTY = eINSTANCE.getDynamicLoadBalanceProperty();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.EndPointReferenceImpl <em>End Point Reference</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EndPointReferenceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getEndPointReference()
		 * @generated
		 */
        EClass END_POINT_REFERENCE = eINSTANCE.getEndPointReference();

        /**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.XPathEndPointReferenceImpl <em>XPath End Point Reference</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.XPathEndPointReferenceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getXPathEndPointReference()
		 * @generated
		 */
        EClass XPATH_END_POINT_REFERENCE = eINSTANCE.getXPathEndPointReference();

        /**
		 * The meta object literal for the '<em><b>Endpoint Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPATH_END_POINT_REFERENCE__ENDPOINT_XPATH = eINSTANCE.getXPathEndPointReference_EndpointXpath();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyEndPointReferenceImpl <em>Registry Key End Point Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.RegistryKeyEndPointReferenceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getRegistryKeyEndPointReference()
		 * @generated
		 */
		EClass REGISTRY_KEY_END_POINT_REFERENCE = eINSTANCE.getRegistryKeyEndPointReference();

								/**
		 * The meta object literal for the '<em><b>Endpoint Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_KEY_END_POINT_REFERENCE__ENDPOINT_KEY = eINSTANCE.getRegistryKeyEndPointReference_EndpointKey();

								/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.ParentMediatorImpl <em>Parent Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.ParentMediatorImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getParentMediator()
		 * @generated
		 */
		EClass PARENT_MEDIATOR = eINSTANCE.getParentMediator();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_MEDIATOR__CHILDREN = eINSTANCE.getParentMediator_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValuePropertyImpl <em>Abstract Name Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValuePropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractNameValueProperty()
		 * @generated
		 */
		EClass ABSTRACT_NAME_VALUE_PROPERTY = eINSTANCE.getAbstractNameValueProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_NAME = eINSTANCE.getAbstractNameValueProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_PROPERTY__PROPERTY_VALUE = eINSTANCE.getAbstractNameValueProperty_PropertyValue();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValueExpressionPropertyImpl <em>Abstract Name Value Expression Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractNameValueExpressionPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractNameValueExpressionProperty()
		 * @generated
		 */
		EClass ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY = eINSTANCE.getAbstractNameValueExpressionProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_NAME = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE_TYPE = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyValueType();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_VALUE = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Property Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NAME_VALUE_EXPRESSION_PROPERTY__PROPERTY_EXPRESSION = eINSTANCE.getAbstractNameValueExpressionProperty_PropertyExpression();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractBooleanFeatureImpl <em>Abstract Boolean Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractBooleanFeatureImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractBooleanFeature()
		 * @generated
		 */
		EClass ABSTRACT_BOOLEAN_FEATURE = eINSTANCE.getAbstractBooleanFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BOOLEAN_FEATURE__FEATURE_NAME = eINSTANCE.getAbstractBooleanFeature_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Feature Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BOOLEAN_FEATURE__FEATURE_ENABLED = eINSTANCE.getAbstractBooleanFeature_FeatureEnabled();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractLocationKeyResourceImpl <em>Abstract Location Key Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractLocationKeyResourceImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractLocationKeyResource()
		 * @generated
		 */
		EClass ABSTRACT_LOCATION_KEY_RESOURCE = eINSTANCE.getAbstractLocationKeyResource();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOCATION_KEY_RESOURCE__LOCATION = eINSTANCE.getAbstractLocationKeyResource_Location();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LOCATION_KEY_RESOURCE__KEY = eINSTANCE.getAbstractLocationKeyResource_Key();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.AbstractCommonTargetImpl <em>Abstract Common Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.AbstractCommonTargetImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getAbstractCommonTarget()
		 * @generated
		 */
		EClass ABSTRACT_COMMON_TARGET = eINSTANCE.getAbstractCommonTarget();

		/**
		 * The meta object literal for the '<em><b>Sequence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMON_TARGET__SEQUENCE_TYPE = eINSTANCE.getAbstractCommonTarget_SequenceType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__SEQUENCE = eINSTANCE.getAbstractCommonTarget_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__SEQUENCE_KEY = eINSTANCE.getAbstractCommonTarget_SequenceKey();

		/**
		 * The meta object literal for the '<em><b>Endpoint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMON_TARGET__ENDPOINT_TYPE = eINSTANCE.getAbstractCommonTarget_EndpointType();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__ENDPOINT = eINSTANCE.getAbstractCommonTarget_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_TARGET__ENDPOINT_KEY = eINSTANCE.getAbstractCommonTarget_EndpointKey();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.impl.MediatorBranchImpl <em>Mediator Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.MediatorBranchImpl
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMediatorBranch()
		 * @generated
		 */
		EClass MEDIATOR_BRANCH = eINSTANCE.getMediatorBranch();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_BRANCH__CHILDREN = eINSTANCE.getMediatorBranch_Children();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType <em>Proxy Wsdl Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.ProxyWsdlType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyWsdlType()
		 * @generated
		 */
		EEnum PROXY_WSDL_TYPE = eINSTANCE.getProxyWsdlType();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxySequenceType <em>Proxy Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.ProxySequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxySequenceType()
		 * @generated
		 */
		EEnum PROXY_SEQUENCE_TYPE = eINSTANCE.getProxySequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType <em>Proxy Endpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.ProxyEndpointType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getProxyEndpointType()
		 * @generated
		 */
		EEnum PROXY_ENDPOINT_TYPE = eINSTANCE.getProxyEndpointType();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType <em>Local Entry Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.LocalEntryValueType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getLocalEntryValueType()
		 * @generated
		 */
		EEnum LOCAL_ENTRY_VALUE_TYPE = eINSTANCE.getLocalEntryValueType();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.TargetSequenceType <em>Target Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.TargetSequenceType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getTargetSequenceType()
		 * @generated
		 */
		EEnum TARGET_SEQUENCE_TYPE = eINSTANCE.getTargetSequenceType();

		/**
		 * The meta object literal for the '{@link org.wso2.carbonstudio.eclipse.esb.TargetEndpointType <em>Target Endpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wso2.carbonstudio.eclipse.esb.TargetEndpointType
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getTargetEndpointType()
		 * @generated
		 */
		EEnum TARGET_ENDPOINT_TYPE = eINSTANCE.getTargetEndpointType();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.wso2.carbonstudio.eclipse.esb.impl.EsbPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //SequencePackage
