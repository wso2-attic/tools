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

import org.wso2.developerstudio.eclipse.gmf.esb.APIResource;
import org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APIResourceItemProvider
	extends EsbNodeItemProvider
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
	public APIResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		APIResource apiResource = (APIResource) object;
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
			super.getPropertyDescriptors(object);

			addUrlStylePropertyDescriptor(object);
			
			if(apiResource.getUrlStyle().equals(ApiResourceUrlStyle.URI_TEMPLATE)){
				addUriTemplatePropertyDescriptor(object);
			} else if (apiResource.getUrlStyle().equals(ApiResourceUrlStyle.URL_MAPPING)){
				addUrlMappingPropertyDescriptor(object);
			}
			
			addAllowGetPropertyDescriptor(object);
			addAllowPostPropertyDescriptor(object);
			addAllowPutPropertyDescriptor(object);
			addAllowDeletePropertyDescriptor(object);
			addAllowOptionsPropertyDescriptor(object);
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_urlStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_urlStyle_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__URL_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BasicPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_uriTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_uriTemplate_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__URI_TEMPLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BasicPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Url Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_urlMapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_urlMapping_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__URL_MAPPING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BasicPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Get feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowGetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_allowGet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_allowGet_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__ALLOW_GET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_MethodsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Post feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowPostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_allowPost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_allowPost_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__ALLOW_POST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_MethodsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Put feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowPutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_allowPut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_allowPut_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__ALLOW_PUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_MethodsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_allowDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_allowDelete_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__ALLOW_DELETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_MethodsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIResource_allowOptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIResource_allowOptions_feature", "_UI_APIResource_type"),
				 EsbPackage.Literals.API_RESOURCE__ALLOW_OPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_MethodsPropertyCategory"),
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsbPackage.Literals.API_RESOURCE__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.API_RESOURCE__OUTPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.API_RESOURCE__FAULT_INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.API_RESOURCE__CONTAINER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns APIResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APIResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ApiResourceUrlStyle labelValue = ((APIResource)object).getUrlStyle();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_APIResource_type") :
			getString("_UI_APIResource_type") + " " + label;
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

		switch (notification.getFeatureID(APIResource.class)) {
			case EsbPackage.API_RESOURCE__URL_STYLE:
			case EsbPackage.API_RESOURCE__URI_TEMPLATE:
			case EsbPackage.API_RESOURCE__URL_MAPPING:
			case EsbPackage.API_RESOURCE__ALLOW_GET:
			case EsbPackage.API_RESOURCE__ALLOW_POST:
			case EsbPackage.API_RESOURCE__ALLOW_PUT:
			case EsbPackage.API_RESOURCE__ALLOW_DELETE:
			case EsbPackage.API_RESOURCE__ALLOW_OPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
			case EsbPackage.API_RESOURCE__CONTAINER:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.API_RESOURCE__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAPIResourceInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.API_RESOURCE__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAPIResourceOutputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.API_RESOURCE__FAULT_INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAPIResourceFaultInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.API_RESOURCE__CONTAINER,
				 EsbFactory.eINSTANCE.createProxyServiceContainer()));
	}

}
