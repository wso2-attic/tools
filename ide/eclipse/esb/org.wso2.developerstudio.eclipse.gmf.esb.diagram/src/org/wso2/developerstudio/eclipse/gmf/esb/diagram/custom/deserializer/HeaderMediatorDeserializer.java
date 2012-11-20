package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.HashMap;
import java.util.Map;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class HeaderMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, HeaderMediator>{
	
	public HeaderMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.transform.HeaderMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.transform.HeaderMediator headerMediator = (org.apache.synapse.mediators.transform.HeaderMediator)mediator;
		
		HeaderMediator visualHeaderMediator = (HeaderMediator) DeserializerUtils.createNode(part, EsbElementTypes.HeaderMediator_3516);
		setElementToEdit(visualHeaderMediator);		
		
		if(!((headerMediator.getQName().getNamespaceURI()==null)||(headerMediator.getQName().getNamespaceURI().equals("")))){
			Map<String, String> namespaces=new HashMap<String, String>();
			namespaces.put(headerMediator.getQName().getPrefix(),headerMediator.getQName().getNamespaceURI());
			NamespacedProperty nsp=visualHeaderMediator.getHeaderName();	
			executeSetValueCommand(nsp, NAMESPACED_PROPERTY__PROPERTY_VALUE, headerMediator.getQName().getLocalPart());
			executeSetValueCommand(nsp, NAMESPACED_PROPERTY__NAMESPACES, namespaces);
		}else{				
			NamespacedProperty nsp=visualHeaderMediator.getHeaderName();
			executeSetValueCommand(nsp, NAMESPACED_PROPERTY__PROPERTY_VALUE, headerMediator.getQName().getLocalPart());
		}
		
		if (headerMediator.getAction() == 0) {
			executeSetValueCommand(HEADER_MEDIATOR__HEADER_ACTION, HeaderAction.SET);
		} else if (headerMediator.getAction() == 1) {
			executeSetValueCommand(HEADER_MEDIATOR__HEADER_ACTION, HeaderAction.REMOVE);
		}
		
		if(headerMediator.getExpression() ==null){
			executeSetValueCommand(HEADER_MEDIATOR__VALUE_LITERAL, headerMediator.getValue());
			executeSetValueCommand(HEADER_MEDIATOR__VALUE_TYPE, HeaderValueType.LITERAL);
		}else{							
				SynapseXPath xpath  = headerMediator.getExpression();				
				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();				
				nsp.setPropertyValue(xpath.toString());				
				if (xpath.getNamespaces() != null) {
					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();
					nsp.setNamespaces(map);
				}				
				executeSetValueCommand(HEADER_MEDIATOR__VALUE_EXPRESSION, nsp);
				executeSetValueCommand(HEADER_MEDIATOR__VALUE_TYPE, HeaderValueType.EXPRESSION);
		}		
		return visualHeaderMediator;
	}

}
