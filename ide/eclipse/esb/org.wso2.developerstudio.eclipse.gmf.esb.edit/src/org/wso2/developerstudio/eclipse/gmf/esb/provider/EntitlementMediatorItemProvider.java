/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator} object.
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
	 * @generated NOT
	 */
	
	
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
			super.getPropertyDescriptors(object);

			addServerURLPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
		
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
				 EsbPackage.Literals.ENTITLEMENT_MEDIATOR__SERVER_URL,
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
				 EsbPackage.Literals.ENTITLEMENT_MEDIATOR__USERNAME,
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
				 EsbPackage.Literals.ENTITLEMENT_MEDIATOR__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsbPackage.Literals.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
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
	 * @generated
	 */
	
	
	public String getText(Object object) {
		String label = ((EntitlementMediator)object).getUsername();
		return label == null || label.length() == 0 ?
			getString("_UI_EntitlementMediator_type") :
			getString("_UI_EntitlementMediator_type") + " " + label;
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
			case EsbPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
			case EsbPackage.ENTITLEMENT_MEDIATOR__USERNAME:
			case EsbPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsbPackage.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR:
			case EsbPackage.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.ENTITLEMENT_MEDIATOR__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createEntitlementMediatorInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.ENTITLEMENT_MEDIATOR__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createEntitlementMediatorOutputConnector()));
	}

}
