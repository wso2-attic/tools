/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;


import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.carbon.rule.common.Fact;
import org.wso2.carbon.rule.common.Input;
import org.wso2.carbon.rule.common.Output;
import org.wso2.carbon.rule.common.RuleSet;
import org.wso2.carbon.rule.mediator.config.RuleMediatorConfig;
import org.wso2.carbon.rule.mediator.config.Source;
import org.wso2.carbon.rule.mediator.config.Target;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleActions;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFact;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleResult;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class RuleMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, RuleMediator> {

	@Override
	public RuleMediator createNode(IGraphicalEditPart part, AbstractMediator object) {
		Assert.isTrue(object instanceof RuleMediatorExt ,"Unsupported mediator passed in for deserialization");
		
		RuleMediatorExt   mediator = (RuleMediatorExt ) object;
		
		RuleMediator mediatorModel = (RuleMediator) DeserializerUtils.createNode(part, EsbElementTypes.RuleMediator_3523); 
		setElementToEdit(mediatorModel);
		
		RuleMediatorConfig ruleMediatorConfig = mediator.getRuleMediatorConfig();
		Input input = ruleMediatorConfig.getInput();
		if(input!=null){
			executeSetValueCommand(RULE_MEDIATOR__INPUT_WRAPPER_NAME, input.getWrapperElementName());
			executeSetValueCommand(RULE_MEDIATOR__INPUT_NAME_SPACE, input.getNameSpace());
			for (Fact fact : input.getFacts()) {
				RuleFact ruleFact = EsbFactory.eINSTANCE.createRuleFact();
				ruleFact.setFactName( fact.getElementName());
				ruleFact.setValueExpression(createNamespacedProperty(fact.getXpath(),fact.getPrefixToNamespaceMap()));
				//TODO: set type, etc
				executeAddValueCommand(mediatorModel.getFactsConfiguration().getFacts(), ruleFact);
			}
		}

		Output output = ruleMediatorConfig.getOutput();
		if(output!=null){
			executeSetValueCommand(RULE_MEDIATOR__OUTPUT_WRAPPER_NAME, output.getWrapperElementName());
			executeSetValueCommand(RULE_MEDIATOR__OUTPUT_NAME_SPACE, output.getNameSpace());
			for (Fact fact : output.getFacts()) {
				RuleResult ruleResult = EsbFactory.eINSTANCE.createRuleResult();
				ruleResult.setResultName( fact.getElementName());
				ruleResult.setValueExpression(createNamespacedProperty(fact.getXpath(),fact.getPrefixToNamespaceMap()));
				//TODO: set type, etc
				executeAddValueCommand(mediatorModel.getResultsConfiguration().getResults(), ruleResult);
			}
		}
		
		
		RuleSet ruleSet = ruleMediatorConfig.getRuleSet();
		if(ruleSet!=null){
			//TODO: 
		}
		
		Source source = ruleMediatorConfig.getSource();
		if(source!=null){
			executeSetValueCommand(RULE_MEDIATOR__SOURCE_VALUE, source.getValue());
			executeSetValueCommand(RULE_MEDIATOR__SOURCE_XPATH,
					createNamespacedProperty(source.getXpath(), source.getPrefixToNamespaceMap()));
		}
		Target target = ruleMediatorConfig.getTarget();
		if(target!=null){
			if("child".equals(target.getAction())){
				executeSetValueCommand(RULE_MEDIATOR__TARGET_ACTION, RuleActions.CHILD);
			} else if ("sibling".equals(target.getAction())){
				executeSetValueCommand(RULE_MEDIATOR__TARGET_ACTION, RuleActions.SIBLING);
			} else{
				executeSetValueCommand(RULE_MEDIATOR__TARGET_ACTION, RuleActions.REPLACE);
			}
			
			executeSetValueCommand(RULE_MEDIATOR__TARGET_VALUE, target.getValue());
			executeSetValueCommand(RULE_MEDIATOR__TARGET_XPATH,
					createNamespacedProperty(target.getXpath(), target.getPrefixToNamespaceMap()));
			executeSetValueCommand(RULE_MEDIATOR__TARGET_RESULT_XPATH,
					createNamespacedProperty(target.getResultXpath(), target.getPrefixToNamespaceMap()));
		}
		return mediatorModel;
	}

}
