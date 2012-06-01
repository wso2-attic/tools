package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.ext.POJOCommandMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CommandMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createCommandMediator(information,subject));
		// Transform the Command mediator output data flow path.
		doTransform(information,
				((CommandMediator) subject).getOutputConnector());	
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild( createCommandMediator(information,subject));
		doTransformWithinSequence(information,((CommandMediator) subject).getOutputConnector().getOutgoingLink(),sequence);	

	}

	private POJOCommandMediator createCommandMediator(TransformationInfo information,EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof CommandMediator, "Invalid subject.");
		CommandMediator visualCommand = (CommandMediator) subject;
		String className = visualCommand.getClassName();
		POJOCommandMediator commandMediator =new POJOCommandMediator();
		Class clazz=null;
		Object o=null;
		try{
		clazz= Class.forName(className);
		}
		catch(ClassNotFoundException ex){
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Invalid Class Name ", "Enter a valid class name for Command Mediator.");			
		}
		commandMediator.setCommand(clazz);
		return commandMediator;
	}


}
