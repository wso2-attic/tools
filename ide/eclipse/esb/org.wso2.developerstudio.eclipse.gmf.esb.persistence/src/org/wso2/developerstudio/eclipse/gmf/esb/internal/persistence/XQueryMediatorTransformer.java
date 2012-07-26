package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class XQueryMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {		
		information.getParentSequence().addChild(createXQueryMediator(subject));
		// Transform the XQuery mediator output data flow path.
		doTransform(information,
				((XQueryMediator)subject).getOutputConnector());
		
		
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createXQueryMediator(subject));
		doTransformWithinSequence(information,((XQueryMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.xquery.XQueryMediator createXQueryMediator(EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof XQueryMediator, "Invalid subject.");
		XQueryMediator visualXQuery = (XQueryMediator)subject;
		org.apache.synapse.mediators.xquery.XQueryMediator xqueryMediator=new org.apache.synapse.mediators.xquery.XQueryMediator();		
		{
			if(visualXQuery.getTargetXPath().getPropertyValue()!=null && !visualXQuery.getTargetXPath().getPropertyValue().equals("")){
			SynapseXPath expression=new SynapseXPath(visualXQuery.getTargetXPath().getPropertyValue());	
			xqueryMediator.setTarget(expression);
			}
			Value key;			
			if(visualXQuery.getScriptKeyType().compareTo(KeyType.STATIC)==0){
				key=new Value(visualXQuery.getStaticScriptKey().getKeyValue());
			}
			else{
				SynapseXPath expression=new SynapseXPath(visualXQuery.getDynamicScriptKey().getPropertyValue());	
				key=new Value(expression);
			}
			xqueryMediator.setQueryKey(key);
			
		}
		return xqueryMediator;
	}

}
