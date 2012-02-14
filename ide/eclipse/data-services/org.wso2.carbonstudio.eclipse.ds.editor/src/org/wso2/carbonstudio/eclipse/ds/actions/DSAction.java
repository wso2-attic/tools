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
package org.wso2.carbonstudio.eclipse.ds.actions;

import java.net.URL;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryProperty;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;
import org.wso2.carbonstudio.eclipse.ds.provider.DsEditPlugin;

/**
 * The Class DSAction implements general actions under the elements.
 */
public class DSAction extends StaticSelectionCommandAction {

	/** The selection. */
	private ISelection selection;

	/** The new child descriptors. */
	private Collection<?> newChildDescriptors;

	/** The image url. */
	private String imageURL;

	/** The command name. */
	private String commandName;

	/**
	 * Instantiates a new dS action.
	 * 
	 * @param selection
	 *            the selection
	 * @param domain
	 *            the domain
	 * @param newChildDescriptors
	 *            the new child descriptors
	 * @param commandName
	 *            the command name
	 */
	public DSAction(ISelection selection, EditingDomain domain, Collection<?> newChildDescriptors,
			String commandName) {
		super(domain);
		this.selection = selection;
		this.newChildDescriptors = newChildDescriptors;
		this.commandName = commandName;
		configureAction(this.selection);
		this.setText(commandName);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction#
	 * getDefaultImageDescriptor()
	 */
	
	protected ImageDescriptor getDefaultImageDescriptor() {

		if (commandName.equals(DSActionConstants.ADD_CONFIG_PROPERTY_ACTION)) {
			imageURL = "wso2/property";
		}
		if (commandName.equals(DSActionConstants.ADD_SUBSCRIPTION_ACTION)) {
			imageURL = "wso2/subscription";
		}

		if (commandName.equals(DSActionConstants.ADD_EVENT_TRIGGER_ACTION)) {
			imageURL = "wso2/event-trigger";
		}

		if (commandName.equals(DSActionConstants.ADD_INPUT_MAPPING_ACTION)) {
			imageURL = "wso2/param";
		}

		if (commandName.equals(DSActionConstants.ADD_LONG_RANGE_VALIDATOR_ACTION)) {
			imageURL = "wso2/validateLongRange";
		}

		if (commandName.equals(DSActionConstants.ADD_DOUBLE_RANGE_VALIDATOR_ACTION)) {
			imageURL = "wso2/validateDoubleRange";
		}

		if (commandName.equals(DSActionConstants.ADD_LENGTH_VALIDATOR_ACTION)) {
			imageURL = "wso2/validateLength";
		}

		if (commandName.equals(DSActionConstants.ADD_PATTERN_VALIDATOR_ACTION)) {
			imageURL = "wso2/validatePatterns";
		}

		if (commandName.equals(DSActionConstants.ADD_CUSTOM_VALIDATOR_ACTION)) {
			imageURL = "wso2/validateCustom";
		}

		if (commandName.equals(DSActionConstants.ADD_OPERATION_ACTION)) {
			imageURL = "wso2/operation";
		}

		if (commandName.equals(DSActionConstants.ADD_RESOURCE_ACTION)) {
			imageURL = "wso2/resource";
		}

		if (commandName.equals(DSActionConstants.ADD_RESULT_ACTION)) {
			imageURL = "wso2/result";
		}

		if (commandName.equals(DSActionConstants.ADD_OUTPUT_MAPPING_ELEMENT_ACTION)) {
			imageURL = "wso2/element";
		}

		if (commandName.equals(DSActionConstants.ADD_OUTPUT_MAPPING_ATTRIBUTE_ACTION)) {
			imageURL = "full/obj16/AttributeMapping";
		}

		if (commandName.equals(DSActionConstants.ADD_OUTPUT_MAPPING_CALL_QUERY_ACTION)) {
			imageURL = "wso2/call-query";
		}

		if (commandName.equals(DSActionConstants.ADD_INPUT_MAPPING_ACTION)) {
			imageURL = "wso2/with-param";
		}

		if (commandName.equals(DSActionConstants.ADD_OUTPUT_MAPPING_CALL_QUERY_GROUP_ACTION)) {
			imageURL = "wso2/call-query-group";
		}

		if (commandName.equals(DSActionConstants.ADD_QUERY_PROPERTY_LIST_ACTION)) {
			imageURL = "wso2/properties";
		}

		if (commandName.equals(DSActionConstants.ADD_QUERY_PROPERTY_ACTION)) {
			imageURL = "wso2/property";
		}

		URL url = (URL) DsEditPlugin.INSTANCE.getImage(imageURL);
		return ImageDescriptor.createFromURL(url);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction#
	 * createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * java.util.Collection)
	 */
	
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		if (collection.size() == 1 && newChildDescriptors != null) {
			// owner is the element that was selected
			Object owner = collection.iterator().next();

			for (Object descriptor : newChildDescriptors) {
				CommandParameter param = (CommandParameter) descriptor;
				EObject childObj = param.getEValue();

				if (childObj instanceof ConfigurationProperty
						&& commandName.equals(DSActionConstants.ADD_CONFIG_PROPERTY_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof EventTrigger
						&& commandName.equals(DSActionConstants.ADD_EVENT_TRIGGER_ACTION)
						&& !(owner instanceof DataSourceConfiguration)) {
					return getChildCommand(param, collection, ((Query) owner).eContainer());
				}

				if (childObj instanceof EventSubscriptionList
						&& commandName.equals(DSActionConstants.ADD_SUBSCRIPTION_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof QueryParameter
						&& commandName.equals(DSActionConstants.ADD_INPUT_MAPPING_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof LongRangeValidator
						&& commandName.equals(DSActionConstants.ADD_LONG_RANGE_VALIDATOR_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof DoubleRangeValidator
						&& commandName.equals(DSActionConstants.ADD_DOUBLE_RANGE_VALIDATOR_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof LengthValidator
						&& commandName.equals(DSActionConstants.ADD_LENGTH_VALIDATOR_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof PatternValidator
						&& commandName.equals(DSActionConstants.ADD_PATTERN_VALIDATOR_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof CustomValidator
						&& commandName.equals(DSActionConstants.ADD_CUSTOM_VALIDATOR_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof Operation
						&& commandName.equals(DSActionConstants.ADD_OPERATION_ACTION)) {

					CompoundCommand compoundCmd = new CompoundCommand(commandName);
					compoundCmd.append(getChildCommand(param, collection,
							((DataSourceConfiguration) owner).eContainer()));

					Operation owner2 = (Operation) childObj;
					CallQuery callQuery = DsFactory.eINSTANCE.createCallQuery();
					CommandParameter param2 = new CommandParameter(owner2,
							DsPackage.Literals.OPERATION__CALL_QUERY, callQuery);
					compoundCmd.append(getChildCommand(param2, collection, owner2));
					return compoundCmd;

				}

				if (childObj instanceof Resource
						&& commandName.equals(DSActionConstants.ADD_RESOURCE_ACTION)) {

					CompoundCommand compoundCmd = new CompoundCommand(commandName);
					compoundCmd.append(getChildCommand(param, collection,
							((DataSourceConfiguration) owner).eContainer()));

					Resource owner2 = (Resource) childObj;
					CallQuery callQuery = DsFactory.eINSTANCE.createCallQuery();
					CommandParameter param2 = new CommandParameter(owner2,
							DsPackage.Literals.RESOURCE__CALL_QUERY, callQuery);
					compoundCmd.append(getChildCommand(param2, collection, owner2));
					return compoundCmd;
				}

				if (childObj instanceof ResultMapping
						&& commandName.equals(DSActionConstants.ADD_RESULT_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof ElementMapping
						&& commandName.equals(DSActionConstants.ADD_OUTPUT_MAPPING_ELEMENT_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof AttributeMapping
						&& commandName
								.equals(DSActionConstants.ADD_OUTPUT_MAPPING_ATTRIBUTE_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof CallQuery
						&& commandName
								.equals(DSActionConstants.ADD_OUTPUT_MAPPING_CALL_QUERY_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof CallQueryList
						&& commandName
								.equals(DSActionConstants.ADD_OUTPUT_MAPPING_CALL_QUERY_GROUP_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof ParameterMapping
						&& commandName.equals(DSActionConstants.ADD_INPUT_MAPPING_ACTION)) {
					return getChildCommand(param, collection, owner);
				}

				if (childObj instanceof QueryPropertyList
						&& commandName.equals(DSActionConstants.ADD_QUERY_PROPERTY_LIST_ACTION)) {
					CompoundCommand compoundCmd = new CompoundCommand(commandName);
					compoundCmd.append(getChildCommand(param, collection, owner));

					QueryPropertyList owner2 = (QueryPropertyList) childObj;
					QueryProperty queryProperty = DsFactory.eINSTANCE.createQueryProperty();
					CommandParameter param2 = new CommandParameter(owner2,
							DsPackage.Literals.QUERY_PROPERTY_LIST__PROPERTY, queryProperty);

					compoundCmd.append(getChildCommand(param2, collection, owner2));
					return compoundCmd;

				}

				if (childObj instanceof QueryProperty
						&& commandName.equals(DSActionConstants.ADD_QUERY_PROPERTY_ACTION)) {
					return getChildCommand(param, collection, owner);
				}
			}
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * Gets the child command.
	 * 
	 * @param descriptor
	 *            the descriptor
	 * @param collection
	 *            the collection
	 * @param owner
	 *            the owner
	 * @return the child command
	 */
	public Command getChildCommand(CommandParameter descriptor, Collection<?> collection,
			Object owner) {

		Command cmd = CreateChildCommand.create(editingDomain, owner, descriptor, collection);
		return cmd;
	}
}
