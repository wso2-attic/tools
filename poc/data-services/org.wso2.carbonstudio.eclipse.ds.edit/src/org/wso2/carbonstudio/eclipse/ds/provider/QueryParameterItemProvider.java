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
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.provider.choiceListProvider.DSPropertyDescriptor;

/**
 * This is the item provider adapter for a
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class QueryParameterItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryParameterItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addSqlTypePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addOrdinalPropertyDescriptor(object);
			addParamTypePropertyDescriptor(object);
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
				getString("_UI_QueryParameter_name_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_QueryParameter_name_feature",
						"_UI_QueryParameter_type"), DsPackage.Literals.QUERY_PARAMETER__NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_QueryParameter_type_feature_display"),
				getString("_UI_PropertyDescriptor_description", "_UI_QueryParameter_type_feature",
						"_UI_QueryParameter_type"), DsPackage.Literals.QUERY_PARAMETER__TYPE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.inOutType));
	}

	/**
	 * This adds a property descriptor for the Sql Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addSqlTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_QueryParameter_sqlType_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueryParameter_sqlType_feature", "_UI_QueryParameter_type"),
				DsPackage.Literals.QUERY_PARAMETER__SQL_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.sqlType));
	}

	/**
	 * This adds a property descriptor for the Default Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_QueryParameter_defaultValue_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueryParameter_defaultValue_feature", "_UI_QueryParameter_type"),
				DsPackage.Literals.QUERY_PARAMETER__DEFAULT_VALUE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ordinal feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addOrdinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_QueryParameter_ordinal_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueryParameter_ordinal_feature", "_UI_QueryParameter_type"),
				DsPackage.Literals.QUERY_PARAMETER__ORDINAL, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Param Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addParamTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_QueryParameter_paramType_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueryParameter_paramType_feature", "_UI_QueryParameter_type"),
				DsPackage.Literals.QUERY_PARAMETER__PARAM_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.paramType));
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
			childrenFeatures.add(DsPackage.Literals.QUERY_PARAMETER__LONG_RANGE_VALIDATOR);
			childrenFeatures.add(DsPackage.Literals.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR);
			childrenFeatures.add(DsPackage.Literals.QUERY_PARAMETER__LENGTH_VALIDATOR);
			childrenFeatures.add(DsPackage.Literals.QUERY_PARAMETER__PATTERN_VALIDATORS);
			childrenFeatures.add(DsPackage.Literals.QUERY_PARAMETER__CUSTOM_VALIDATORS);
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
	 * This returns param.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/param"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public String getText(Object object) {
		String label = ((QueryParameter) object).getName();
		String type = " (" + getString("_UI_QueryParameter_type") + ")";
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

		switch (notification.getFeatureID(QueryParameter.class)) {
		case DsPackage.QUERY_PARAMETER__NAME:
		case DsPackage.QUERY_PARAMETER__TYPE:
		case DsPackage.QUERY_PARAMETER__SQL_TYPE:
		case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
		case DsPackage.QUERY_PARAMETER__ORDINAL:
		case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					false, true));
			return;
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
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

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.QUERY_PARAMETER__LONG_RANGE_VALIDATOR,
				DsFactory.eINSTANCE.createLongRangeValidator()));

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR,
				DsFactory.eINSTANCE.createDoubleRangeValidator()));

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.QUERY_PARAMETER__LENGTH_VALIDATOR,
				DsFactory.eINSTANCE.createLengthValidator()));

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.QUERY_PARAMETER__PATTERN_VALIDATORS,
				DsFactory.eINSTANCE.createPatternValidator()));

		newChildDescriptors.add(createChildParameter(
				DsPackage.Literals.QUERY_PARAMETER__CUSTOM_VALIDATORS,
				DsFactory.eINSTANCE.createCustomValidator()));
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
