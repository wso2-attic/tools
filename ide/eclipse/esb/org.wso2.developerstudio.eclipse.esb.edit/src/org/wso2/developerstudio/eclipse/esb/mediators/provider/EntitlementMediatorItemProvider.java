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
package org.wso2.developerstudio.eclipse.esb.mediators.provider;


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
import org.wso2.developerstudio.eclipse.esb.mediators.EntitlementMediator;
import org.wso2.developerstudio.eclipse.esb.mediators.MediatorsPackage;
import org.wso2.developerstudio.eclipse.esb.provider.EsbEditPlugin;
import org.wso2.developerstudio.eclipse.esb.provider.MediatorItemProvider;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.esb.mediators.EntitlementMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntitlementMediatorItemProvider
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
	public EntitlementMediatorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addServerURLPropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Server URL feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addServerURLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_EntitlementMediator_serverURL_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_EntitlementMediator_serverURL_feature", "_UI_EntitlementMediator_type"),
                 MediatorsPackage.Literals.ENTITLEMENT_MEDIATOR__SERVER_URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_EntitlementMediator_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_EntitlementMediator_username_feature", "_UI_EntitlementMediator_type"),
                 MediatorsPackage.Literals.ENTITLEMENT_MEDIATOR__USERNAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_EntitlementMediator_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_EntitlementMediator_password_feature", "_UI_EntitlementMediator_type"),
                 MediatorsPackage.Literals.ENTITLEMENT_MEDIATOR__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This returns EntitlementMediator.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/EntitlementMediator"));
    }

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	
	public String getText(Object object) {
		
		return getString("_UI_EntitlementMediator_type");
			
	}

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(EntitlementMediator.class)) {
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME:
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
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
	
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

	/**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public ResourceLocator getResourceLocator() {
        return EsbEditPlugin.INSTANCE;
    }

}
