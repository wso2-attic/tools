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
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ServiceStatus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getName <em>
 * Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getBaseURI
 * <em>Base URI</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#isEnableBatchRequests
 * <em>Enable Batch Requests</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#isEnableBoxcarring
 * <em>Enable Boxcarring</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getServiceStatus
 * <em>Service Status</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getDataSources
 * <em>Data Sources</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getQueries
 * <em>Queries</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getEventTriggers
 * <em>Event Triggers</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getOperations
 * <em>Operations</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl#getResources
 * <em>Resources</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DataServiceImpl extends EObjectImpl implements DataService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String baseURI = BASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableBatchRequests()
	 * <em>Enable Batch Requests</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isEnableBatchRequests()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_BATCH_REQUESTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableBatchRequests()
	 * <em>Enable Batch Requests</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isEnableBatchRequests()
	 * @generated
	 * @ordered
	 */
	protected boolean enableBatchRequests = ENABLE_BATCH_REQUESTS_EDEFAULT;

	/**
	 * This is true if the Enable Batch Requests attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean enableBatchRequestsESet;

	/**
	 * The default value of the '{@link #isEnableBoxcarring()
	 * <em>Enable Boxcarring</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isEnableBoxcarring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_BOXCARRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableBoxcarring()
	 * <em>Enable Boxcarring</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isEnableBoxcarring()
	 * @generated
	 * @ordered
	 */
	protected boolean enableBoxcarring = ENABLE_BOXCARRING_EDEFAULT;

	/**
	 * This is true if the Enable Boxcarring attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean enableBoxcarringESet;

	/**
	 * The default value of the '{@link #getServiceStatus()
	 * <em>Service Status</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getServiceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStatus SERVICE_STATUS_EDEFAULT = ServiceStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getServiceStatus()
	 * <em>Service Status</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getServiceStatus()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatus serviceStatus = SERVICE_STATUS_EDEFAULT;

	/**
	 * This is true if the Service Status attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean serviceStatusESet;

	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceConfiguration> dataSources;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * The cached value of the '{@link #getEventTriggers()
	 * <em>Event Triggers</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEventTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTrigger> eventTriggers;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.DATA_SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getBaseURI() {
		return baseURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBaseURI(String newBaseURI) {
		String oldBaseURI = baseURI;
		baseURI = newBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DATA_SERVICE__BASE_URI,
					oldBaseURI, baseURI));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnableBatchRequests() {
		return enableBatchRequests;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnableBatchRequests(boolean newEnableBatchRequests) {
		boolean oldEnableBatchRequests = enableBatchRequests;
		enableBatchRequests = newEnableBatchRequests;
		boolean oldEnableBatchRequestsESet = enableBatchRequestsESet;
		enableBatchRequestsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS, oldEnableBatchRequests,
					enableBatchRequests, !oldEnableBatchRequestsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetEnableBatchRequests() {
		boolean oldEnableBatchRequests = enableBatchRequests;
		boolean oldEnableBatchRequestsESet = enableBatchRequestsESet;
		enableBatchRequests = ENABLE_BATCH_REQUESTS_EDEFAULT;
		enableBatchRequestsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS, oldEnableBatchRequests,
					ENABLE_BATCH_REQUESTS_EDEFAULT, oldEnableBatchRequestsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetEnableBatchRequests() {
		return enableBatchRequestsESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnableBoxcarring() {
		return enableBoxcarring;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnableBoxcarring(boolean newEnableBoxcarring) {
		boolean oldEnableBoxcarring = enableBoxcarring;
		enableBoxcarring = newEnableBoxcarring;
		boolean oldEnableBoxcarringESet = enableBoxcarringESet;
		enableBoxcarringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.DATA_SERVICE__ENABLE_BOXCARRING, oldEnableBoxcarring,
					enableBoxcarring, !oldEnableBoxcarringESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetEnableBoxcarring() {
		boolean oldEnableBoxcarring = enableBoxcarring;
		boolean oldEnableBoxcarringESet = enableBoxcarringESet;
		enableBoxcarring = ENABLE_BOXCARRING_EDEFAULT;
		enableBoxcarringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.DATA_SERVICE__ENABLE_BOXCARRING, oldEnableBoxcarring,
					ENABLE_BOXCARRING_EDEFAULT, oldEnableBoxcarringESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetEnableBoxcarring() {
		return enableBoxcarringESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setServiceStatus(ServiceStatus newServiceStatus) {
		ServiceStatus oldServiceStatus = serviceStatus;
		serviceStatus = newServiceStatus == null ? SERVICE_STATUS_EDEFAULT : newServiceStatus;
		boolean oldServiceStatusESet = serviceStatusESet;
		serviceStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.DATA_SERVICE__SERVICE_STATUS, oldServiceStatus, serviceStatus,
					!oldServiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetServiceStatus() {
		ServiceStatus oldServiceStatus = serviceStatus;
		boolean oldServiceStatusESet = serviceStatusESet;
		serviceStatus = SERVICE_STATUS_EDEFAULT;
		serviceStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.DATA_SERVICE__SERVICE_STATUS, oldServiceStatus,
					SERVICE_STATUS_EDEFAULT, oldServiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetServiceStatus() {
		return serviceStatusESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DataSourceConfiguration> getDataSources() {
		if (dataSources == null) {
			dataSources = new EObjectContainmentEList<DataSourceConfiguration>(
					DataSourceConfiguration.class, this, DsPackage.DATA_SERVICE__DATA_SOURCES);
		}
		return dataSources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<Query>(Query.class, this,
					DsPackage.DATA_SERVICE__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EventTrigger> getEventTriggers() {
		if (eventTriggers == null) {
			eventTriggers = new EObjectContainmentEList<EventTrigger>(EventTrigger.class, this,
					DsPackage.DATA_SERVICE__EVENT_TRIGGERS);
		}
		return eventTriggers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					DsPackage.DATA_SERVICE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this,
					DsPackage.DATA_SERVICE__RESOURCES);
		}
		return resources;
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
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
			return ((InternalEList<?>) getDataSources()).basicRemove(otherEnd, msgs);
		case DsPackage.DATA_SERVICE__QUERIES:
			return ((InternalEList<?>) getQueries()).basicRemove(otherEnd, msgs);
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
			return ((InternalEList<?>) getEventTriggers()).basicRemove(otherEnd, msgs);
		case DsPackage.DATA_SERVICE__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case DsPackage.DATA_SERVICE__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
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
		case DsPackage.DATA_SERVICE__NAME:
			return getName();
		case DsPackage.DATA_SERVICE__DESCRIPTION:
			return getDescription();
		case DsPackage.DATA_SERVICE__BASE_URI:
			return getBaseURI();
		case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
			return isEnableBatchRequests();
		case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
			return isEnableBoxcarring();
		case DsPackage.DATA_SERVICE__SERVICE_STATUS:
			return getServiceStatus();
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
			return getDataSources();
		case DsPackage.DATA_SERVICE__QUERIES:
			return getQueries();
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
			return getEventTriggers();
		case DsPackage.DATA_SERVICE__OPERATIONS:
			return getOperations();
		case DsPackage.DATA_SERVICE__RESOURCES:
			return getResources();
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
		case DsPackage.DATA_SERVICE__NAME:
			setName((String) newValue);
			return;
		case DsPackage.DATA_SERVICE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DsPackage.DATA_SERVICE__BASE_URI:
			setBaseURI((String) newValue);
			return;
		case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
			setEnableBatchRequests((Boolean) newValue);
			return;
		case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
			setEnableBoxcarring((Boolean) newValue);
			return;
		case DsPackage.DATA_SERVICE__SERVICE_STATUS:
			setServiceStatus((ServiceStatus) newValue);
			return;
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
			getDataSources().clear();
			getDataSources().addAll((Collection<? extends DataSourceConfiguration>) newValue);
			return;
		case DsPackage.DATA_SERVICE__QUERIES:
			getQueries().clear();
			getQueries().addAll((Collection<? extends Query>) newValue);
			return;
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
			getEventTriggers().clear();
			getEventTriggers().addAll((Collection<? extends EventTrigger>) newValue);
			return;
		case DsPackage.DATA_SERVICE__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case DsPackage.DATA_SERVICE__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resource>) newValue);
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
		case DsPackage.DATA_SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DsPackage.DATA_SERVICE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DsPackage.DATA_SERVICE__BASE_URI:
			setBaseURI(BASE_URI_EDEFAULT);
			return;
		case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
			unsetEnableBatchRequests();
			return;
		case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
			unsetEnableBoxcarring();
			return;
		case DsPackage.DATA_SERVICE__SERVICE_STATUS:
			unsetServiceStatus();
			return;
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
			getDataSources().clear();
			return;
		case DsPackage.DATA_SERVICE__QUERIES:
			getQueries().clear();
			return;
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
			getEventTriggers().clear();
			return;
		case DsPackage.DATA_SERVICE__OPERATIONS:
			getOperations().clear();
			return;
		case DsPackage.DATA_SERVICE__RESOURCES:
			getResources().clear();
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
		case DsPackage.DATA_SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DsPackage.DATA_SERVICE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT
					.equals(description);
		case DsPackage.DATA_SERVICE__BASE_URI:
			return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
		case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
			return isSetEnableBatchRequests();
		case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
			return isSetEnableBoxcarring();
		case DsPackage.DATA_SERVICE__SERVICE_STATUS:
			return isSetServiceStatus();
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
			return dataSources != null && !dataSources.isEmpty();
		case DsPackage.DATA_SERVICE__QUERIES:
			return queries != null && !queries.isEmpty();
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
			return eventTriggers != null && !eventTriggers.isEmpty();
		case DsPackage.DATA_SERVICE__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case DsPackage.DATA_SERVICE__RESOURCES:
			return resources != null && !resources.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", baseURI: ");
		result.append(baseURI);
		result.append(", enableBatchRequests: ");
		if (enableBatchRequestsESet)
			result.append(enableBatchRequests);
		else
			result.append("<unset>");
		result.append(", enableBoxcarring: ");
		if (enableBoxcarringESet)
			result.append(enableBoxcarring);
		else
			result.append("<unset>");
		result.append(", serviceStatus: ");
		if (serviceStatusESet)
			result.append(serviceStatus);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DataServiceImpl
