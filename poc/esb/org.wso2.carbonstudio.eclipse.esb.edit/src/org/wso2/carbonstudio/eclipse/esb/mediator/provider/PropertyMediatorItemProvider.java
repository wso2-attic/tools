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
package org.wso2.carbonstudio.eclipse.esb.mediator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.PropertyAction;
import org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.PropertyValueType;
import org.wso2.carbonstudio.eclipse.esb.provider.EsbEditPlugin;
import org.wso2.carbonstudio.eclipse.esb.provider.MediatorItemProvider;

/**
 * This is the item provider adapter for a {@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyMediatorItemProvider
	extends MediatorItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMediatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		PropertyMediator property = (PropertyMediator) object;
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
		super.getPropertyDescriptors(object);
		
		addPropertyNamePropertyDescriptor(object);
		addPropertyActionPropertyDescriptor(object);				
						
		if (property.getPropertyAction().equals(PropertyAction.SET)) {
			addPropertyDataTypePropertyDescriptor(object);
			addValueTypePropertyDescriptor(object);
			if (property.getValueType().equals(PropertyValueType.LITERAL)) {
				switch (property.getPropertyDataType()) {
					case OM: {
						addValueOMPropertyDescriptor(object);
						break;
					}

					case STRING: {
						addValueLiteralPropertyDescriptor(object);
						addValueStringPatternPropertyDescriptor(object);
						addValueStringCapturingGroupPropertyDescriptor(object);
						break;
					}

					default: {
						addValueLiteralPropertyDescriptor(object);
					}
				}
			} else {
				addValueExpressionPropertyDescriptor(object);
			}
		}								
		
		addPropertyScopePropertyDescriptor(object);		
		
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_propertyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_propertyName_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__PROPERTY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_propertyDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_propertyDataType_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_propertyAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_propertyAction_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__PROPERTY_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueType_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueLiteral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueLiteral_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_LITERAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueExpression_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value OM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueOMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueOM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueOM_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_OM,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value String Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueStringPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueStringPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueStringPattern_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_STRING_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value String Capturing Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueStringCapturingGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_valueStringCapturingGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_valueStringCapturingGroup_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyMediator_propertyScope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyMediator_propertyScope_feature", "_UI_PropertyMediator_type"),
				 MediatorPackage.Literals.PROPERTY_MEDIATOR__PROPERTY_SCOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PropertyMediator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyMediator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PropertyMediator_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PropertyMediator.class)) {
			case MediatorPackage.PROPERTY_MEDIATOR__PROPERTY_NAME:
			case MediatorPackage.PROPERTY_MEDIATOR__PROPERTY_DATA_TYPE:
			case MediatorPackage.PROPERTY_MEDIATOR__PROPERTY_ACTION:
			case MediatorPackage.PROPERTY_MEDIATOR__PROPERTY_SCOPE:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_TYPE:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_LITERAL:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_EXPRESSION:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_OM:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_STRING_PATTERN:
			case MediatorPackage.PROPERTY_MEDIATOR__VALUE_STRING_CAPTURING_GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EsbEditPlugin.INSTANCE;
	}

}
