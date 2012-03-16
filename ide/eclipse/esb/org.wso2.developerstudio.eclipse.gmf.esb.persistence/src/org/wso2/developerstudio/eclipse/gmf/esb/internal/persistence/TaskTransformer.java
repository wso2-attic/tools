package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import org.apache.synapse.startup.quartz.SimpleQuartz;
import org.apache.synapse.task.TaskDescription;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class TaskTransformer {

	
	public void transform(TransformationInfo info, EsbNode subject,int startupCount)
	throws Exception {
		
	
		Assert.isTrue(
				subject instanceof org.wso2.developerstudio.eclipse.gmf.esb.Task,
				"Invalid subject.");
		org.wso2.developerstudio.eclipse.gmf.esb.Task visualTask = (org.wso2.developerstudio.eclipse.gmf.esb.Task) subject;

	
		org.apache.synapse.startup.quartz.SimpleQuartz s=new SimpleQuartz();
		s.setName("startup-"+startupCount);
		org.apache.synapse.task.TaskDescription taskDescription=new TaskDescription();		
		if(visualTask.getName()!=null){
			taskDescription.setName(visualTask.getName());
		}
		else{
			taskDescription.setName("Default");
		}
		
		taskDescription.setTaskClass(visualTask.getClass_());
		s.setTaskDescription(taskDescription);		
		info.getSynapseConfiguration().addStartup(s);
		
		
		
	}
}
