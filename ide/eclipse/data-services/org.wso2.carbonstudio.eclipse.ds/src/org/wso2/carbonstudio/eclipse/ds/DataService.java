/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getDescription <em>Description</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getConfig <em>Config</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getQuery <em>Query</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getEventTrigger <em>Event Trigger</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getResource <em>Resource</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests <em>Enable Batch Requests</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring <em>Enable Boxcarring</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableDTP <em>Enable DTP</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceGroup <em>Service Group</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus <em>Service Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService()
 * @model extendedMetaData="name='data_._type' kind='elementOnly'"
 * @generated
 */
public interface DataService extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Description> getDescription();

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Config()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='config' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSourceConfiguration> getConfig();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Query()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Event Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Trigger</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EventTrigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventTrigger> getEventTrigger();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_BaseURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Enable Batch Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Batch Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Batch Requests</em>' attribute.
	 * @see #setEnableBatchRequests(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EnableBatchRequests()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='enableBatchRequests' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableBatchRequests();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests <em>Enable Batch Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Batch Requests</em>' attribute.
	 * @see #isEnableBatchRequests()
	 * @generated
	 */
	void setEnableBatchRequests(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Boxcarring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Boxcarring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Boxcarring</em>' attribute.
	 * @see #setEnableBoxcarring(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EnableBoxcarring()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='enableBoxcarring' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableBoxcarring();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring <em>Enable Boxcarring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Boxcarring</em>' attribute.
	 * @see #isEnableBoxcarring()
	 * @generated
	 */
	void setEnableBoxcarring(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable DTP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable DTP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable DTP</em>' attribute.
	 * @see #setEnableDTP(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_EnableDTP()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='enableDTP' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableDTP();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableDTP <em>Enable DTP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable DTP</em>' attribute.
	 * @see #isEnableDTP()
	 * @generated
	 */
	void setEnableDTP(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Group</em>' attribute.
	 * @see #setServiceGroup(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_ServiceGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceGroup();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceGroup <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Group</em>' attribute.
	 * @see #getServiceGroup()
	 * @generated
	 */
	void setServiceGroup(String value);

	/**
	 * Returns the value of the '<em><b>Service Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Status</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see #isSetServiceStatus()
	 * @see #unsetServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDataService_ServiceStatus()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='serviceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStatus getServiceStatus();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus <em>Service Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Status</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see #isSetServiceStatus()
	 * @see #unsetServiceStatus()
	 * @see #getServiceStatus()
	 * @generated
	 */
	void setServiceStatus(ServiceStatus value);

	/**
	 * Unsets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus <em>Service Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceStatus()
	 * @see #getServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @generated
	 */
	void unsetServiceStatus();

	/**
	 * Returns whether the value of the '{@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus <em>Service Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Status</em>' attribute is set.
	 * @see #unsetServiceStatus()
	 * @see #getServiceStatus()
	 * @see #setServiceStatus(ServiceStatus)
	 * @generated
	 */
	boolean isSetServiceStatus();

} // DataService
