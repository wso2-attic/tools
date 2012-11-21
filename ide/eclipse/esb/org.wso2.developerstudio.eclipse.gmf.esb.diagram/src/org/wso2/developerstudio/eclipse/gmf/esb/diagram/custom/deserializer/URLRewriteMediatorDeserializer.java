package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.synapse.SynapseConstants;
import org.apache.synapse.commons.evaluators.Evaluator;
import org.apache.synapse.commons.evaluators.EvaluatorException;
import org.apache.synapse.commons.evaluators.config.EvaluatorFactoryFinder;
import org.apache.synapse.commons.evaluators.config.EvaluatorSerializerFinder;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.transform.url.RewriteAction;
import org.apache.synapse.mediators.transform.url.RewriteRule;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleActionType;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFragmentType;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRule;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRuleAction;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;
import org.apache.synapse.commons.evaluators.config.EvaluatorSerializer;

public class URLRewriteMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, URLRewriteMediator>{

	public URLRewriteMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.transform.url.URLRewriteMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.transform.url.URLRewriteMediator URLRewriteMediator = (org.apache.synapse.mediators.transform.url.URLRewriteMediator)mediator;
		
		URLRewriteMediator visualURLRewriteMediator = (URLRewriteMediator) DeserializerUtils.createNode(part, EsbElementTypes.URLRewriteMediator_3620);
		setElementToEdit(visualURLRewriteMediator);
		
		executeSetValueCommand(URL_REWRITE_MEDIATOR__IN_PROPERTY, URLRewriteMediator.getInputProperty());
		executeSetValueCommand(URL_REWRITE_MEDIATOR__OUT_PROPERTY, URLRewriteMediator.getOutputProperty());
		
		EList<URLRewriteRule> urlRewriteRules=new BasicEList<URLRewriteRule>();
		for(RewriteRule rewriteRule : URLRewriteMediator.getRules()){
			URLRewriteRule urlRewriteRule=EsbFactory.eINSTANCE.createURLRewriteRule();
			EvaluatorExpressionProperty evaluatorExpressionProperty= EsbFactory.eINSTANCE.createEvaluatorExpressionProperty();
			Evaluator evaluator=rewriteRule.getCondition();			
			String condition=null;
			OMFactory fac = OMAbstractFactory.getOMFactory();		
	        EvaluatorSerializer evaluatorSerializer =
                EvaluatorSerializerFinder.getInstance().getSerializer(evaluator.getName());
        if (evaluatorSerializer != null) {
            OMElement conditionElem = fac.createOMElement("condition", null);
            try {
                evaluatorSerializer.serialize(conditionElem, evaluator);
            } catch (EvaluatorException e) {
				e.printStackTrace();
            }
            condition = conditionElem.getFirstOMChild().toString();
        }
			evaluatorExpressionProperty.setEvaluatorValue(condition);
			urlRewriteRule.setUrlRewriteRuleCondition(evaluatorExpressionProperty);
			for(RewriteAction rewriteActions : rewriteRule.getActions()){
				URLRewriteRuleAction urlRewriteRuleAction=EsbFactory.eINSTANCE.createURLRewriteRuleAction();
				if(rewriteActions.getActionType()==0){
					urlRewriteRuleAction.setRuleAction(RuleActionType.SET);
				}else if(rewriteActions.getActionType()==1){
					urlRewriteRuleAction.setRuleAction(RuleActionType.APPEND);
				}else if(rewriteActions.getActionType()==2){
					urlRewriteRuleAction.setRuleAction(RuleActionType.PREPEND);
				}else if(rewriteActions.getActionType()==3){
					urlRewriteRuleAction.setRuleAction(RuleActionType.REPLACE);
				}else if(rewriteActions.getActionType()==4){
					urlRewriteRuleAction.setRuleAction(RuleActionType.REMOVE);
				}
				
				if(rewriteActions.getFragmentIndex()==0){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.PROTOCOL);
				}else if(rewriteActions.getFragmentIndex()==1){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.USER);
				}else if(rewriteActions.getFragmentIndex()==2){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.HOST);
				}else if(rewriteActions.getFragmentIndex()==3){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.PATH);
				}else if(rewriteActions.getFragmentIndex()==4){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.QUERY);
				}else if(rewriteActions.getFragmentIndex()==5){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.REF);
				}else if(rewriteActions.getFragmentIndex()==6){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.PORT);
				}else if(rewriteActions.getFragmentIndex()==7){
					urlRewriteRuleAction.setRuleFragment(RuleFragmentType.FULL);
				}
				
				urlRewriteRuleAction.setActionRegex(rewriteActions.getRegex());
				if(rewriteActions.getValue()!=null){
					urlRewriteRuleAction.setActionValue(rewriteActions.getValue());
				}else{
					urlRewriteRuleAction.setActionExpression(createNamespacedProperty(rewriteActions.getXpath()));
				}
				urlRewriteRule.getRewriteRuleAction().add(urlRewriteRuleAction);
			}
			urlRewriteRules.add(urlRewriteRule);
		}
		executeSetValueCommand(URL_REWRITE_MEDIATOR__URL_REWRITE_RULES, urlRewriteRules);
		
		return visualURLRewriteMediator;
	}

}
