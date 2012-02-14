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
package org.wso2.carbonstudio.eclipse.ds.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.wso2.carbonstudio.eclipse.ds.DataService} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataServiceItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataServiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addBaseURIPropertyDescriptor(object);
			addEnableBatchRequestsPropertyDescriptor(object);
			addEnableBoxcarringPropertyDescriptor(object);
			addServiceStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_name_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_DataService_name_feature",
						"_UI_DataService_type"), DsPackage.Literals.DATA_SERVICE__NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_description_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataService_description_feature", "_UI_DataService_type"),
				DsPackage.Literals.DATA_SERVICE__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Base URI feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addBaseURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_baseURI_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_DataService_baseURI_feature",
						"_UI_DataService_type"), DsPackage.Literals.DATA_SERVICE__BASE_URI, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Batch Requests feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addEnableBatchRequestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_enableBatchRequests_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataService_enableBatchRequests_feature", "_UI_DataService_type"),
				DsPackage.Literals.DATA_SERVICE__ENABLE_BATCH_REQUESTS, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Boxcarring feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addEnableBoxcarringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_enableBoxcarring_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataService_enableBoxcarring_feature", "_UI_DataService_type"),
				DsPackage.Literals.DATA_SERVICE__ENABLE_BOXCARRING, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service Status feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addServiceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataService_serviceStatus_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataService_serviceStatus_feature", "_UI_DataService_type"),
				DsPackage.Literals.DATA_SERVICE__SERVICE_STATUS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__DATA_SOURCES);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__QUERIES);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__EVENT_TRIGGERS);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__OPERATIONS);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__RESOURCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns data.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/data"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataService) object).getName();
		String type = " (" + getString("_UI_DataService_type") + ")";
		return label != null ? label.toString() + type : type;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataService.class)) {
		case DsPackage.DATA_SERVICE__NAME:
		case DsPackage.DATA_SERVICE__DESCRIPTION:
		case DsPackage.DATA_SERVICE__BASE_URI:
		case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
		case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
		case DsPackage.DATA_SERVICE__SERVICE_STATUS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					false, true));
			return;
		case DsPackage.DATA_SERVICE__DATA_SOURCES:
		case DsPackage.DATA_SERVICE__QUERIES:
		case DsPackage.DATA_SERVICE__EVENT_TRIGGERS:
		case DsPackage.DATA_SERVICE__OPERATIONS:
		case DsPackage.DATA_SERVICE__RESOURCES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.DATA_SERVICE__DATA_SOURCES,
				DsFactory.eINSTANCE.createDataSourceConfiguration()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.DATA_SERVICE__QUERIES,
				DsFactory.eINSTANCE.createQuery()));

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.DATA_SERVICE__EVENT_TRIGGERS,
				DsFactory.eINSTANCE.createEventTrigger()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.DATA_SERVICE__OPERATIONS,
				DsFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.DATA_SERVICE__RESOURCES,
				DsFactory.eINSTANCE.createResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DsEditPlugin.INSTANCE;
	}

}
