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
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmooksMediatorItemProvider
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
	public SmooksMediatorItemProvider(AdapterFactory adapterFactory) {
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
			addConfigurationKeyPropertyDescriptor(object);
		
			addConfigurationKeyPropertyDescriptor(object);
			addTypeInPropertyDescriptor(object);
	        addExpressionInPropertyDescriptor(object);
	        
	    	SmooksOutConfiguration outConfiguration=((SmooksMediator)object).getOutput();	

			addTypeOutPropertyDescriptor(object);
			addOutputMethodPropertyDescriptor(object);
			switch(outConfiguration.getOutputMethod()){
				case EXPRESSION:
					addExpressionOutPropertyDescriptor(object);
					addActionPropertyDescriptor(object);
					break;
				case PROPERTY:
					addPropertyPropertyDescriptor(object);	
			}

		return itemPropertyDescriptors;
	}
	
	protected void addConfigurationKeyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SmooksMediator_configurationKey_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SmooksMediator_configurationKey_feature", "_UI_SmooksMediator_type"),
                 EsbPackage.Literals.SMOOKS_MEDIATOR__CONFIGURATION_KEY,
                 true,
                 false,
                 false,
                 null,
                 "Key",
                 null));
    }
	
	protected void addTypeInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksInConfiguration_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksInConfiguration_type_feature", "_UI_SmooksInConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_IN_CONFIGURATION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Input",
				 null));
	}

	
	protected void addExpressionInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksInConfiguration_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksInConfiguration_expression_feature", "_UI_SmooksInConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_IN_CONFIGURATION__EXPRESSION,
				 true,
				 false,
				 true,
				 null,
				 "Input",
				 null));
	}
	
	protected void addOutputMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksOutConfiguration_outputMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksOutConfiguration_outputMethod_feature", "_UI_SmooksOutConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksOutConfiguration_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksOutConfiguration_action_feature", "_UI_SmooksOutConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	protected void addPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksOutConfiguration_property_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksOutConfiguration_property_feature", "_UI_SmooksOutConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION__PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	protected void addExpressionOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksOutConfiguration_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksOutConfiguration_expression_feature", "_UI_SmooksOutConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION__EXPRESSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	
	protected void addTypeOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmooksOutConfiguration_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmooksOutConfiguration_type_feature", "_UI_SmooksOutConfiguration_type"),
				 EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION__TYPE,
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
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsbPackage.Literals.SMOOKS_MEDIATOR__CONFIGURATION_KEY);
			childrenFeatures.add(EsbPackage.Literals.SMOOKS_MEDIATOR__INPUT);
			childrenFeatures.add(EsbPackage.Literals.SMOOKS_MEDIATOR__OUTPUT);
			childrenFeatures.add(EsbPackage.Literals.SMOOKS_MEDIATOR__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR);
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
	 * This returns SmooksMediator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SmooksMediator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public String getText(Object object) {
		SmooksMediator smooksMediator = (SmooksMediator)object;
		return getString("_UI_SmooksMediator_type") + " " + smooksMediator.isReverse();
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

		switch (notification.getFeatureID(SmooksMediator.class)) {
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
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
				(EsbPackage.Literals.SMOOKS_MEDIATOR__CONFIGURATION_KEY,
				 EsbFactory.eINSTANCE.createRegistryKeyProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.SMOOKS_MEDIATOR__INPUT,
				 EsbFactory.eINSTANCE.createSmooksInConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.SMOOKS_MEDIATOR__OUTPUT,
				 EsbFactory.eINSTANCE.createSmooksOutConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.SMOOKS_MEDIATOR__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createSmooksMediatorInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createSmooksMediatorOutputConnector()));
	}

}
