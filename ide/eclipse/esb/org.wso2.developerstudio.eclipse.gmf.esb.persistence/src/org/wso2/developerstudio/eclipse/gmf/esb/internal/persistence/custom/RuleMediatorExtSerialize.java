package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom;

import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.Mediator;
import org.apache.synapse.config.xml.AbstractMediatorSerializer;
import org.eclipse.emf.common.util.EList;
import org.wso2.carbon.rule.common.Fact;
import org.wso2.carbon.rule.common.Input;
import org.wso2.carbon.rule.common.Output;
import org.wso2.carbon.rule.common.RuleSet;
import org.wso2.carbon.rule.mediator.config.RuleMediatorConfig;
import org.wso2.carbon.rule.mediator.config.Source;
import org.wso2.carbon.rule.mediator.config.Target;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFact;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFactsConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleResult;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleResultsConfiguration;

public class RuleMediatorExtSerialize extends AbstractMediatorSerializer{

  

public String getMediatorClassName() {
		// TODO Auto-generated method stub
		return RuleMediatorExt.class.getName();
	}

	@Override
	protected OMElement serializeSpecificMediator(Mediator m) {
		
		RuleMediatorExt mediatorExt = (RuleMediatorExt)m;
		RuleMediator visualRule = (RuleMediator)mediatorExt.getSubject();
		RuleFactsConfiguration factsConfiguration = visualRule.getFactsConfiguration();
		EList<RuleFact> facts = factsConfiguration.getFacts();
		List<Fact> factsList = new ArrayList<Fact>();
		for (RuleFact ruleFact : facts) {
			Fact fact = new Fact();
			fact.setElementName(visualRule.getInputWrapperName());
			fact.setNamespace(visualRule.getInputNameSpace());
			fact.setPrefixToNamespaceMap(ruleFact.getValueExpression().getNamespaces());
			fact.setType(ruleFact.getFactName());
			fact.setTypeClass(ruleFact.getFactType().getClass());
			fact.setXpath(ruleFact.getValueExpression().getPropertyValue());
			factsList.add(fact);
		}
		Input input = new Input();
		input.setFacts(factsList);
		input.setNameSpace(visualRule.getInputNameSpace());
		input.setWrapperElementName(visualRule.getInputWrapperName());
		
        RuleResultsConfiguration resultsConfiguration = visualRule.getResultsConfiguration();
        EList<RuleResult> results = resultsConfiguration.getResults();
        List<Fact> resultfactsList = new ArrayList<Fact>();
        for (RuleResult ruleResult : results) {
        	Fact fact = new Fact();
			fact.setElementName(visualRule.getOutputWrapperName());
			fact.setNamespace(visualRule.getOutputNameSpace());
			fact.setPrefixToNamespaceMap(ruleResult.getValueExpression().getNamespaces());
			fact.setType(ruleResult.getResultName());
			fact.setTypeClass(ruleResult.getResultType().getClass());
			fact.setXpath(ruleResult.getValueExpression().getPropertyValue());
			resultfactsList.add(fact);
        }
        
        Output output = new Output();
        output.setFacts(resultfactsList);
        output.setNameSpace(visualRule.getOutputNameSpace());
        output.setWrapperElementName(visualRule.getOutputWrapperName());
        
        Target target = new Target();
        target.setAction(visualRule.getTargetAction().getLiteral());
        target.setPrefixToNamespaceMap(visualRule.getTargetResultXpath().getNamespaces());
        target.setResultXpath(visualRule.getTargetResultXpath().getPropertyValue());
        target.setValue(visualRule.getTargetValue());
        target.setXpath(visualRule.getTargetXpath().getPropertyValue());
        
        Source source = new Source();
        source.setPrefixToNamespaceMap(visualRule.getSourceXpath().getNamespaces());
        source.setValue(visualRule.getSourceValue());
        source.setXpath(visualRule.getSourceXpath().getPropertyValue());
        
        RuleSet ruleSet = new RuleSet();
        
		
		RuleMediatorConfig config = new RuleMediatorConfig();
		config.setInput(input);
		config.setOutput(output);
		config.setRuleSet(ruleSet);
		config.setSource(source);
		config.setTarget(target);
		OMElement om = config.toOM();
		
		return om;
	}

}
