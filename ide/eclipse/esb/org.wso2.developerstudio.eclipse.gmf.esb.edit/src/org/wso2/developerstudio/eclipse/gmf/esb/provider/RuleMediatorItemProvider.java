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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleMediatorItemProvider
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
	public RuleMediatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__RULE_SET_CONFIGURATION);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__FACTS_CONFIGURATION);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__RESULTS_CONFIGURATION);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__OUTPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.RULE_MEDIATOR__MEDIATOR_FLOW);
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
	 * This returns RuleMediator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RuleMediator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public String getText(Object object) {
		RuleMediator ruleMediator = (RuleMediator)object;
		return getString("_UI_RuleMediator_type") + " " + ruleMediator.isReverse();
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

		switch (notification.getFeatureID(RuleMediator.class)) {
			case EsbPackage.RULE_MEDIATOR__RULE_SET_CONFIGURATION:
			case EsbPackage.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION:
			case EsbPackage.RULE_MEDIATOR__FACTS_CONFIGURATION:
			case EsbPackage.RULE_MEDIATOR__RESULTS_CONFIGURATION:
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION:
			case EsbPackage.RULE_MEDIATOR__INPUT_CONNECTOR:
			case EsbPackage.RULE_MEDIATOR__OUTPUT_CONNECTOR:
			case EsbPackage.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR:
			case EsbPackage.RULE_MEDIATOR__MEDIATOR_FLOW:
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
				(EsbPackage.Literals.RULE_MEDIATOR__RULE_SET_CONFIGURATION,
				 EsbFactory.eINSTANCE.createRuleSetConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__RULE_SESSION_CONFIGURATION,
				 EsbFactory.eINSTANCE.createRuleSessionConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__FACTS_CONFIGURATION,
				 EsbFactory.eINSTANCE.createRuleFactsConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__RESULTS_CONFIGURATION,
				 EsbFactory.eINSTANCE.createRuleResultsConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__CHILD_MEDIATORS_CONFIGURATION,
				 EsbFactory.eINSTANCE.createRuleChildMediatorsConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createRuleMediatorInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createRuleMediatorOutputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__CHILD_MEDIATORS_OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createRuleMediatorChildMediatorsOutputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.RULE_MEDIATOR__MEDIATOR_FLOW,
				 EsbFactory.eINSTANCE.createMediatorFlow()));
	}

}
