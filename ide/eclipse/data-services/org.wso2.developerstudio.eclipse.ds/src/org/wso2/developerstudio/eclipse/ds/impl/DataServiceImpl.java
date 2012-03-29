/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.ds.DataService;
import org.wso2.developerstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.developerstudio.eclipse.ds.Description;
import org.wso2.developerstudio.eclipse.ds.DsPackage;
import org.wso2.developerstudio.eclipse.ds.EventTrigger;
import org.wso2.developerstudio.eclipse.ds.Operation;
import org.wso2.developerstudio.eclipse.ds.Query;
import org.wso2.developerstudio.eclipse.ds.Resource;
import org.wso2.developerstudio.eclipse.ds.ServiceStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getEventTrigger <em>Event Trigger</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#isEnableBatchRequests <em>Enable Batch Requests</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#isEnableBoxcarring <em>Enable Boxcarring</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#isEnableDTP <em>Enable DTP</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getServiceGroup <em>Service Group</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.DataServiceImpl#getServiceStatus <em>Service Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataServiceImpl extends EObjectImpl implements DataService {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> description;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceConfiguration> config;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> query;

	/**
	 * The cached value of the '{@link #getEventTrigger() <em>Event Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTrigger> eventTrigger;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String baseURI = BASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableBatchRequests() <em>Enable Batch Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBatchRequests()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_BATCH_REQUESTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableBatchRequests() <em>Enable Batch Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBatchRequests()
	 * @generated
	 * @ordered
	 */
	protected boolean enableBatchRequests = ENABLE_BATCH_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableBoxcarring() <em>Enable Boxcarring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBoxcarring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_BOXCARRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableBoxcarring() <em>Enable Boxcarring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBoxcarring()
	 * @generated
	 * @ordered
	 */
	protected boolean enableBoxcarring = ENABLE_BOXCARRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableDTP() <em>Enable DTP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDTP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DTP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableDTP() <em>Enable DTP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDTP()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDTP = ENABLE_DTP_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceGroup() <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceGroup() <em>Service Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected String serviceGroup = SERVICE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected String serviceNamespace = SERVICE_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceStatus() <em>Service Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStatus SERVICE_STATUS_EDEFAULT = ServiceStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getServiceStatus() <em>Service Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceStatus()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatus serviceStatus = SERVICE_STATUS_EDEFAULT;

	/**
	 * This is true if the Service Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return DsPackage.Literals.DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<Description>(Description.class, this, DsPackage.DATA_SERVICE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceConfiguration> getConfig() {
		if (config == null) {
			config = new EObjectContainmentEList<DataSourceConfiguration>(DataSourceConfiguration.class, this, DsPackage.DATA_SERVICE__CONFIG);
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		if (query == null) {
			query = new EObjectContainmentEList<Query>(Query.class, this, DsPackage.DATA_SERVICE__QUERY);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventTrigger> getEventTrigger() {
		if (eventTrigger == null) {
			eventTrigger = new EObjectContainmentEList<EventTrigger>(EventTrigger.class, this, DsPackage.DATA_SERVICE__EVENT_TRIGGER);
		}
		return eventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, DsPackage.DATA_SERVICE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, DsPackage.DATA_SERVICE__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURI() {
		return baseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURI(String newBaseURI) {
		String oldBaseURI = baseURI;
		baseURI = newBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__BASE_URI, oldBaseURI, baseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableBatchRequests() {
		return enableBatchRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableBatchRequests(boolean newEnableBatchRequests) {
		boolean oldEnableBatchRequests = enableBatchRequests;
		enableBatchRequests = newEnableBatchRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS, oldEnableBatchRequests, enableBatchRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableBoxcarring() {
		return enableBoxcarring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableBoxcarring(boolean newEnableBoxcarring) {
		boolean oldEnableBoxcarring = enableBoxcarring;
		enableBoxcarring = newEnableBoxcarring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__ENABLE_BOXCARRING, oldEnableBoxcarring, enableBoxcarring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableDTP() {
		return enableDTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableDTP(boolean newEnableDTP) {
		boolean oldEnableDTP = enableDTP;
		enableDTP = newEnableDTP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__ENABLE_DTP, oldEnableDTP, enableDTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceGroup() {
		return serviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceGroup(String newServiceGroup) {
		String oldServiceGroup = serviceGroup;
		serviceGroup = newServiceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__SERVICE_GROUP, oldServiceGroup, serviceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNamespace() {
		return serviceNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNamespace(String newServiceNamespace) {
		String oldServiceNamespace = serviceNamespace;
		serviceNamespace = newServiceNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__SERVICE_NAMESPACE, oldServiceNamespace, serviceNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceStatus(ServiceStatus newServiceStatus) {
		ServiceStatus oldServiceStatus = serviceStatus;
		serviceStatus = newServiceStatus == null ? SERVICE_STATUS_EDEFAULT : newServiceStatus;
		boolean oldServiceStatusESet = serviceStatusESet;
		serviceStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__SERVICE_STATUS, oldServiceStatus, serviceStatus, !oldServiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceStatus() {
		ServiceStatus oldServiceStatus = serviceStatus;
		boolean oldServiceStatusESet = serviceStatusESet;
		serviceStatus = SERVICE_STATUS_EDEFAULT;
		serviceStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DsPackage.DATA_SERVICE__SERVICE_STATUS, oldServiceStatus, SERVICE_STATUS_EDEFAULT, oldServiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceStatus() {
		return serviceStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.DATA_SERVICE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DsPackage.DATA_SERVICE__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case DsPackage.DATA_SERVICE__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
				return ((InternalEList<?>)getEventTrigger()).basicRemove(otherEnd, msgs);
			case DsPackage.DATA_SERVICE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case DsPackage.DATA_SERVICE__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.DATA_SERVICE__DESCRIPTION:
				return getDescription();
			case DsPackage.DATA_SERVICE__CONFIG:
				return getConfig();
			case DsPackage.DATA_SERVICE__QUERY:
				return getQuery();
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
				return getEventTrigger();
			case DsPackage.DATA_SERVICE__OPERATION:
				return getOperation();
			case DsPackage.DATA_SERVICE__RESOURCE:
				return getResource();
			case DsPackage.DATA_SERVICE__BASE_URI:
				return getBaseURI();
			case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
				return isEnableBatchRequests();
			case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
				return isEnableBoxcarring();
			case DsPackage.DATA_SERVICE__ENABLE_DTP:
				return isEnableDTP();
			case DsPackage.DATA_SERVICE__NAME:
				return getName();
			case DsPackage.DATA_SERVICE__SERVICE_GROUP:
				return getServiceGroup();
			case DsPackage.DATA_SERVICE__SERVICE_NAMESPACE:
				return getServiceNamespace();
			case DsPackage.DATA_SERVICE__SERVICE_STATUS:
				return getServiceStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsPackage.DATA_SERVICE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends Description>)newValue);
				return;
			case DsPackage.DATA_SERVICE__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends DataSourceConfiguration>)newValue);
				return;
			case DsPackage.DATA_SERVICE__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
				getEventTrigger().clear();
				getEventTrigger().addAll((Collection<? extends EventTrigger>)newValue);
				return;
			case DsPackage.DATA_SERVICE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case DsPackage.DATA_SERVICE__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case DsPackage.DATA_SERVICE__BASE_URI:
				setBaseURI((String)newValue);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
				setEnableBatchRequests((Boolean)newValue);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
				setEnableBoxcarring((Boolean)newValue);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_DTP:
				setEnableDTP((Boolean)newValue);
				return;
			case DsPackage.DATA_SERVICE__NAME:
				setName((String)newValue);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_GROUP:
				setServiceGroup((String)newValue);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_NAMESPACE:
				setServiceNamespace((String)newValue);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_STATUS:
				setServiceStatus((ServiceStatus)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsPackage.DATA_SERVICE__DESCRIPTION:
				getDescription().clear();
				return;
			case DsPackage.DATA_SERVICE__CONFIG:
				getConfig().clear();
				return;
			case DsPackage.DATA_SERVICE__QUERY:
				getQuery().clear();
				return;
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
				getEventTrigger().clear();
				return;
			case DsPackage.DATA_SERVICE__OPERATION:
				getOperation().clear();
				return;
			case DsPackage.DATA_SERVICE__RESOURCE:
				getResource().clear();
				return;
			case DsPackage.DATA_SERVICE__BASE_URI:
				setBaseURI(BASE_URI_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
				setEnableBatchRequests(ENABLE_BATCH_REQUESTS_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
				setEnableBoxcarring(ENABLE_BOXCARRING_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__ENABLE_DTP:
				setEnableDTP(ENABLE_DTP_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_GROUP:
				setServiceGroup(SERVICE_GROUP_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_NAMESPACE:
				setServiceNamespace(SERVICE_NAMESPACE_EDEFAULT);
				return;
			case DsPackage.DATA_SERVICE__SERVICE_STATUS:
				unsetServiceStatus();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsPackage.DATA_SERVICE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DsPackage.DATA_SERVICE__CONFIG:
				return config != null && !config.isEmpty();
			case DsPackage.DATA_SERVICE__QUERY:
				return query != null && !query.isEmpty();
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
				return eventTrigger != null && !eventTrigger.isEmpty();
			case DsPackage.DATA_SERVICE__OPERATION:
				return operation != null && !operation.isEmpty();
			case DsPackage.DATA_SERVICE__RESOURCE:
				return resource != null && !resource.isEmpty();
			case DsPackage.DATA_SERVICE__BASE_URI:
				return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
			case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
				return enableBatchRequests != ENABLE_BATCH_REQUESTS_EDEFAULT;
			case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
				return enableBoxcarring != ENABLE_BOXCARRING_EDEFAULT;
			case DsPackage.DATA_SERVICE__ENABLE_DTP:
				return enableDTP != ENABLE_DTP_EDEFAULT;
			case DsPackage.DATA_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsPackage.DATA_SERVICE__SERVICE_GROUP:
				return SERVICE_GROUP_EDEFAULT == null ? serviceGroup != null : !SERVICE_GROUP_EDEFAULT.equals(serviceGroup);
			case DsPackage.DATA_SERVICE__SERVICE_NAMESPACE:
				return SERVICE_NAMESPACE_EDEFAULT == null ? serviceNamespace != null : !SERVICE_NAMESPACE_EDEFAULT.equals(serviceNamespace);
			case DsPackage.DATA_SERVICE__SERVICE_STATUS:
				return isSetServiceStatus();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseURI: ");
		result.append(baseURI);
		result.append(", enableBatchRequests: ");
		result.append(enableBatchRequests);
		result.append(", enableBoxcarring: ");
		result.append(enableBoxcarring);
		result.append(", enableDTP: ");
		result.append(enableDTP);
		result.append(", name: ");
		result.append(name);
		result.append(", serviceGroup: ");
		result.append(serviceGroup);
		result.append(", serviceNamespace: ");
		result.append(serviceNamespace);
		result.append(", serviceStatus: ");
		if (serviceStatusESet) result.append(serviceStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataServiceImpl
