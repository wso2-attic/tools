package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSpecVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class RMSequenceMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, RMSequenceMediator>{
	
	  private static final String WSRM_SpecVersion_1_0 = "Spec_2005_02";
	  private static final String WSRM_SpecVersion_1_1 = "Spec_2007_02";
	
	public RMSequenceMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.RMSequenceMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.builtin.RMSequenceMediator RMSequenceMediator = (org.apache.synapse.mediators.builtin.RMSequenceMediator)mediator;
		
		RMSequenceMediator visualRMSequenceMediator = (RMSequenceMediator) DeserializerUtils.createNode(part, EsbElementTypes.RMSequenceMediator_3522);
		setElementToEdit(visualRMSequenceMediator);
		
		if(WSRM_SpecVersion_1_0.equals(RMSequenceMediator.getVersion())){
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION, RMSpecVersion.VERSION_10);
		}else if(WSRM_SpecVersion_1_1.equals(RMSequenceMediator.getVersion())){
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__RM_SPEC_VERSION, RMSpecVersion.VERSION_11);
		}
		if(RMSequenceMediator.isSingle()){
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE, RMSequenceType.SINGLE_MESSAGE);
		}else{
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__SEQUENCE_TYPE, RMSequenceType.CORRELATED_SEQUENCE);
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__CORRELATION_XPATH, createNamespacedProperty(RMSequenceMediator.getCorrelation()));
			executeSetValueCommand(RM_SEQUENCE_MEDIATOR__LAST_MESSAGE_XPATH, createNamespacedProperty(RMSequenceMediator.getLastMessage()));
		}
		
		return visualRMSequenceMediator;
	}

}
