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
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Service</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getName <em>Name
 * </em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getDescription <em>
 * Description</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI <em>Base
 * URI</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests
 * <em>Enable Batch Requests</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring
 * <em>Enable Boxcarring</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus <em>
 * Service Status</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getDataSources <em>
 * Data Sources</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getQueries <em>
 * Queries</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getEventTriggers <em>
 * Event Triggers</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getOperations <em>
 * Operations</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getResources <em>
 * Resources</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService()
 * @model extendedMetaData="name='data' kind='elementOnly'"
 * @generated
 */
public interface DataService extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData=
	 *        "kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_BaseURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='baseURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI
	 * <em>Base URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Enable Batch Requests</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Batch Requests</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enable Batch Requests</em>' attribute.
	 * @see #isSetEnableBatchRequests()
	 * @see #unsetEnableBatchRequests()
	 * @see #setEnableBatchRequests(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EnableBatchRequests()
	 * @model unsettable="true"
	 *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData=
	 *        "kind='attribute' name='enableBatchRequests' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableBatchRequests();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests
	 * <em>Enable Batch Requests</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enable Batch Requests</em>'
	 *            attribute.
	 * @see #isSetEnableBatchRequests()
	 * @see #unsetEnableBatchRequests()
	 * @see #isEnableBatchRequests()
	 * @generated
	 */
	void setEnableBatchRequests(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests
	 * <em>Enable Batch Requests</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetEnableBatchRequests()
	 * @see #isEnableBatchRequests()
	 * @see #setEnableBatchRequests(boolean)
	 * @generated
	 */
	void unsetEnableBatchRequests();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests
	 * <em>Enable Batch Requests</em>}' attribute is set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Enable Batch Requests</em>'
	 *         attribute is set.
	 * @see #unsetEnableBatchRequests()
	 * @see #isEnableBatchRequests()
	 * @see #setEnableBatchRequests(boolean)
	 * @generated
	 */
	boolean isSetEnableBatchRequests();

	/**
	 * Returns the value of the '<em><b>Enable Boxcarring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Boxcarring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enable Boxcarring</em>' attribute.
	 * @see #isSetEnableBoxcarring()
	 * @see #unsetEnableBoxcarring()
	 * @see #setEnableBoxcarring(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EnableBoxcarring()
	 * @model unsettable="true"
	 *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData=
	 *        "kind='attribute' name='enableBoxcarring' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableBoxcarring();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring
	 * <em>Enable Boxcarring</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enable Boxcarring</em>' attribute.
	 * @see #isSetEnableBoxcarring()
	 * @see #unsetEnableBoxcarring()
	 * @see #isEnableBoxcarring()
	 * @generated
	 */
	void setEnableBoxcarring(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring
	 * <em>Enable Boxcarring</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetEnableBoxcarring()
	 * @see #isEnableBoxcarring()
	 * @see #setEnableBoxcarring(boolean)
	 * @generated
	 */
	void unsetEnableBoxcarring();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring
	 * <em>Enable Boxcarring</em>}' attribute is set. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Enable Boxcarring</em>' attribute
	 *         is set.
	 * @see #unsetEnableBoxcarring()
	 * @see #isEnableBoxcarring()
	 * @see #setEnableBoxcarring(boolean)
	 * @generated
	 */
	boolean isSetEnableBoxcarring();

	/**
	 * Returns the value of the '<em><b>Service Status</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Status</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see #isSetServiceStatus()
	 * @see #unsetServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_ServiceStatus()
	 * @model unsettable="true" extendedMetaData=
	 *        "kind='attribute' name='serviceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStatus getServiceStatus();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus
	 * <em>Service Status</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Service Status</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see #isSetServiceStatus()
	 * @see #unsetServiceStatus()
	 * @see #getServiceStatus()
	 * @generated
	 */
	void setServiceStatus(ServiceStatus value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus
	 * <em>Service Status</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetServiceStatus()
	 * @see #getServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @generated
	 */
	void unsetServiceStatus();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus
	 * <em>Service Status</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Service Status</em>' attribute is
	 *         set.
	 * @see #unsetServiceStatus()
	 * @see #getServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @generated
	 */
	boolean isSetServiceStatus();

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sources</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Sources</em>' containment reference
	 *         list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_DataSources()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='config' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSourceConfiguration> getDataSources();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Queries()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Event Triggers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Triggers</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Event Triggers</em>' containment reference
	 *         list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EventTriggers()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventTrigger> getEventTriggers();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operations</em>' containment reference
	 *         list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Operations()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Resources()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getResources();

} // DataService
