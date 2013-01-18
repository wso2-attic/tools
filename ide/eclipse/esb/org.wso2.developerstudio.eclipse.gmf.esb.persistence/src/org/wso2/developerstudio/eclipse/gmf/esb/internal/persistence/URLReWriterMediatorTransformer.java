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

package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.synapse.commons.evaluators.Evaluator;
import org.apache.synapse.commons.evaluators.config.EvaluatorFactoryFinder;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.transform.url.RewriteAction;
import org.apache.synapse.mediators.transform.url.RewriteRule;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRule;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRuleAction;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class URLReWriterMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createURLRewriteMediator(information,subject));
		// Transform the property mediator output data flow path.
		doTransform(information,((URLRewriteMediator) subject).getOutputConnector());		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createURLRewriteMediator(information,subject));
		doTransformWithinSequence(information,((URLRewriteMediator) subject).getOutputConnector().getOutgoingLink(),sequence);

		
	}

	private org.apache.synapse.mediators.transform.url.URLRewriteMediator createURLRewriteMediator(TransformationInfo information,EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof URLRewriteMediator, "Invalid subject.");
		URLRewriteMediator visualUrlRewriter = (URLRewriteMediator) subject;
		org.apache.synapse.mediators.transform.url.URLRewriteMediator urlReWriterMediator =new org.apache.synapse.mediators.transform.url.URLRewriteMediator();
		{
			urlReWriterMediator.setInputProperty(visualUrlRewriter.getInProperty());
			urlReWriterMediator.setOutputProperty(visualUrlRewriter.getOutProperty());
			EList<URLRewriteRule> urlRewriteRules = visualUrlRewriter.getUrlRewriteRules();
			for (URLRewriteRule urlRewriteRule : urlRewriteRules) {
				 RewriteRule rule = new RewriteRule();
				 EvaluatorExpressionProperty ruleCondition = urlRewriteRule.getUrlRewriteRuleCondition();
				 if (ruleCondition!=null) {
					 
					 if(StringUtils.isBlank(ruleCondition
								.getEvaluatorValue())){
						 try {
							OMElement evaluatorExpressionOM = AXIOMUtil.stringToOM(ruleCondition
									.getEvaluatorValue());
							Evaluator evaluator = EvaluatorFactoryFinder.getInstance()
									.getEvaluator(evaluatorExpressionOM);
							rule.setCondition(evaluator);
						} catch (Exception e) {
							log.error("Ignoring invalid condition configuration", e);
						}
					 } else{
						 log.warn("Ignoring blank condition configuration");
					 }
					
				}
				EList<URLRewriteRuleAction> rewriteRuleAction = urlRewriteRule.getRewriteRuleAction();
		         for (URLRewriteRuleAction urlRewriteRuleAction : rewriteRuleAction) {
		        	 RewriteAction rewriteAction = new RewriteAction();
		        	 rewriteAction.setActionType(urlRewriteRuleAction.getRuleAction().getValue());
		        	 rewriteAction.setFragmentIndex(urlRewriteRuleAction.getRuleFragment().getValue());
		        	 rewriteAction.setRegex(urlRewriteRuleAction.getActionRegex());
		        	 if(null==urlRewriteRuleAction.getActionValue()){
		        		 rewriteAction.setXpath(new SynapseXPath(urlRewriteRuleAction.getActionExpression().getPropertyValue()));
		        	 }else{
		        		 rewriteAction.setValue(urlRewriteRuleAction.getActionValue()); 
		        	 }
					 rule.getActions().add(rewriteAction);
				}
		        
		         urlReWriterMediator.addRule(rule);
			}
		}
		return urlReWriterMediator;
	}
}
