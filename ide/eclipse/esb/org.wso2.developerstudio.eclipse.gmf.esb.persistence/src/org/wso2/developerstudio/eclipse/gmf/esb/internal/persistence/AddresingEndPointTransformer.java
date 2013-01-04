package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.AddressingEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class AddresingEndPointTransformer extends AbstractEndpointTransformer{

	public void transform(TransformationInfo information, EsbNode subject) throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof EndPoint, "Invalid subject");
		AddressingEndpoint visualEP = (AddressingEndpoint) subject;

		// Send the message.
		SendMediator sendMediator = null;
		if (information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) information.getParentSequence().getList()
			.get(information.getParentSequence().getList().size() - 1);
		} else if(information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.Sequence){
			sendMediator=null;
		} else {
			sendMediator = new SendMediator();
			information.getParentSequence().addChild(sendMediator);
		}		
/*		if(visualEP.isInLine()){
			information.getCurrentProxy().setTargetInLineEndpoint(create(visualEP,null));
		}else{
			if(sendMediator !=null){
				sendMediator.setEndpoint(create(visualEP,null));
			}
		}*/
		
		if(!information.isEndPointFound){
			information.isEndPointFound=true;
			information.firstEndPoint=visualEP;
		}
		
		if(visualEP.getOutputConnector().getOutgoingLink() !=null){
			InputConnector nextInputConnector=visualEP.getOutputConnector().getOutgoingLink().getTarget();
			if((!(nextInputConnector instanceof SequenceInputConnector))||
					((((Sequence)nextInputConnector.eContainer()).getOutputConnector().getOutgoingLink()!=null)&&(!(((Sequence)nextInputConnector.eContainer()).getOutputConnector().getOutgoingLink().getTarget().eContainer() instanceof EndPoint)))){
				information.setParentSequence(information.getOriginOutSequence());
				information.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
			}else if(visualEP.getInputConnector().getIncomingLinks().get(0).getSource().eContainer() instanceof Sequence){
				information.setParentSequence(information.getCurrentReferredSequence());
			}
		}
		
		try{
			List<EsbNode> transformedMediators = information.getTransformedMediators();
			EsbNode nextElement=(EsbNode) visualEP.getOutputConnector().getOutgoingLink().getTarget().eContainer();
			if(transformedMediators.contains(nextElement)){
				return;
			}
			transformedMediators.add(nextElement);
		}
		catch(NullPointerException e){
			MessageDialog
			.openError(
					Display.getCurrent().getActiveShell(),
					"Diagram Incomplete ! ",
					"Output connector of an Endpoint must be connected to an Recieve Sequence or Out Sequence.");
		}

		// Transform endpoint output data flow.
		// TODO: find out why this was commented out.
		// might want to check if the flow is connected back to initial proxy
		// service
		doTransform(information, visualEP.getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information, EsbNode subject,
			SequenceMediator sequence) throws Exception {
		
	}

}
