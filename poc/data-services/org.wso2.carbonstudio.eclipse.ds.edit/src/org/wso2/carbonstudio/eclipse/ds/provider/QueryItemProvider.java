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
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.provider.choiceListProvider.DSPropertyDescriptor;

/**
 * This is the item provider adapter for a
 * {@link org.wso2.carbonstudio.eclipse.ds.Query} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class QueryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addDataSourceIdPropertyDescriptor(object);
			addSqlStatementPropertyDescriptor(object);
			addInputTriggerNamePropertyDescriptor(object);
			addOutputTriggerNamePropertyDescriptor(object);
			addReturnRowIdPropertyDescriptor(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Query_id_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_Query_id_feature",
						"_UI_Query_type"), DsPackage.Literals.QUERY__ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Trigger Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addInputTriggerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Query_inputTriggerName_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Query_inputTriggerName_feature", "_UI_Query_type"),
				DsPackage.Literals.QUERY__INPUT_TRIGGER_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.eventId));
	}

	/**
	 * This adds a property descriptor for the Output Trigger Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addOutputTriggerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Query_outputTriggerName_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Query_outputTriggerName_feature", "_UI_Query_type"),
				DsPackage.Literals.QUERY__OUTPUT_TRIGGER_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.eventId));
	}

	/**
	 * This adds a property descriptor for the Data Source Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addDataSourceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Query_dataSourceId_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_Query_dataSourceId_feature",
						"_UI_Query_type"), DsPackage.Literals.QUERY__DATA_SOURCE_ID, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.configId));
	}

	/**
	 * This adds a property descriptor for the Sql Statement feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addSqlStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Query_sqlStatement_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_Query_sqlStatement_feature",
						"_UI_Query_type"), DsPackage.Literals.QUERY__SQL_STATEMENT, true, true,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Return Row Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReturnRowIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Query_returnRowId_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Query_returnRowId_feature",
						"_UI_Query_type"), DsPackage.Literals.QUERY__RETURN_ROW_ID, true, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(DsPackage.Literals.QUERY__PROPERTIES_LIST);
			childrenFeatures.add(DsPackage.Literals.QUERY__RESULT_MAPPING);
			childrenFeatures.add(DsPackage.Literals.QUERY__EXCEL_QUERIES);
			childrenFeatures.add(DsPackage.Literals.QUERY__GSPREAD_QUERIES);
			childrenFeatures.add(DsPackage.Literals.QUERY__QUERY_PARAMETERS);
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
	 * This returns query.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/query"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public String getText(Object object) {
		String label = ((Query) object).getId();
		String type = " (" + getString("_UI_Query_type") + ")";
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

		switch (notification.getFeatureID(Query.class)) {
		case DsPackage.QUERY__ID:
		case DsPackage.QUERY__INPUT_TRIGGER_NAME:
		case DsPackage.QUERY__OUTPUT_TRIGGER_NAME:
		case DsPackage.QUERY__DATA_SOURCE_ID:
		case DsPackage.QUERY__SQL_STATEMENT:
		case DsPackage.QUERY__RETURN_ROW_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					false, true));
			return;
		case DsPackage.QUERY__PROPERTIES_LIST:
		case DsPackage.QUERY__RESULT_MAPPING:
		case DsPackage.QUERY__EXCEL_QUERIES:
		case DsPackage.QUERY__GSPREAD_QUERIES:
		case DsPackage.QUERY__QUERY_PARAMETERS:
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

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.QUERY__PROPERTIES_LIST,
				DsFactory.eINSTANCE.createQueryPropertyList()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.QUERY__RESULT_MAPPING,
				DsFactory.eINSTANCE.createResultMapping()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.QUERY__EXCEL_QUERIES,
				DsFactory.eINSTANCE.createExcelQuery()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.QUERY__GSPREAD_QUERIES,
				DsFactory.eINSTANCE.createGSpreadQuery()));

		newChildDescriptors.add(createChildParameter(DsPackage.Literals.QUERY__QUERY_PARAMETERS,
				DsFactory.eINSTANCE.createQueryParameter()));
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
