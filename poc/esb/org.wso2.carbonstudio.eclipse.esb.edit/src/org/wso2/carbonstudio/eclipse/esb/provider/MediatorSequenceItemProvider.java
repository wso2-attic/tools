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
package org.wso2.carbonstudio.eclipse.esb.provider;


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
import org.wso2.carbonstudio.eclipse.esb.EsbFactory;
import org.wso2.carbonstudio.eclipse.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.esb.MediatorSequence;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorFactory;

/**
 * This is the item provider adapter for a {@link org.wso2.carbonstudio.eclipse.esb.MediatorSequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MediatorSequenceItemProvider
	extends ConfigurationElementItemProvider
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
	public MediatorSequenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		MediatorSequence sequence = (MediatorSequence) object;
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
		super.getPropertyDescriptors(object);

		if (!sequence.isAnonymous()) {
			addSequenceNamePropertyDescriptor(object);
		}
		
		addOnErrorPropertyDescriptor(object);
		
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sequence Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediatorSequence_sequenceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediatorSequence_sequenceName_feature", "_UI_MediatorSequence_type"),
				 EsbPackage.Literals.MEDIATOR_SEQUENCE__SEQUENCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediatorSequence_onError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediatorSequence_onError_feature", "_UI_MediatorSequence_type"),
				 EsbPackage.Literals.MEDIATOR_SEQUENCE__ON_ERROR,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS);
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
	 * This returns MediatorSequence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MediatorSequence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getText(Object object) {
		MediatorSequence sequence = (MediatorSequence) object;
		String name = sequence.isAnonymous() ? getString("_UI_Anonymous_label") 
				: sequence.getSequenceName();
		return String.format("%s [%s]", name, getString("_UI_MediatorSequence_qualifier"));
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

		switch (notification.getFeatureID(MediatorSequence.class)) {
			case EsbPackage.MEDIATOR_SEQUENCE__ANONYMOUS:
			case EsbPackage.MEDIATOR_SEQUENCE__SEQUENCE_NAME:
			case EsbPackage.MEDIATOR_SEQUENCE__ON_ERROR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsbPackage.MEDIATOR_SEQUENCE__MEDIATORS:
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
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createInMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createOutMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createDropMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createSendMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createLogMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createFilterMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createSwitchMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createEntitlementMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createEnqueueMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createClassMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createSpringMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createValidateMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createScriptMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createSmooksMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createEnrichMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createFaultMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createAggregateMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createRouterMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createCloneMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createIterateMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createCacheMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createXSLTMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createXQueryMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createCalloutMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createRMSequenceMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createTransactionMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createPropertyMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createOAuthMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createAutoscaleInMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createAutoscaleOutMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createHeaderMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createThrottleMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createCommandMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createEventMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createDBLookupMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createDBReportMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createRuleMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createSequenceMediator()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.MEDIATOR_SEQUENCE__MEDIATORS,
				 MediatorFactory.eINSTANCE.createBuilderMediator()));
	}

}
