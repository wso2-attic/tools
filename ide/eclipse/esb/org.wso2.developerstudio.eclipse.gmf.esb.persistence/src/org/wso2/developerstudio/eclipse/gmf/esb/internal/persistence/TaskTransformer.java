package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import org.apache.synapse.startup.quartz.SimpleQuartz;
import org.apache.synapse.task.TaskDescription;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class TaskTransformer {

	
	public void transform(TransformationInfo info, EsbNode subject,int startupCount)
	throws Exception {
		create((org.wso2.developerstudio.eclipse.gmf.esb.Task)subject);		
	}
	
	public TaskDescription create(org.wso2.developerstudio.eclipse.gmf.esb.Task visualTask){	
		org.apache.synapse.startup.quartz.SimpleQuartz s=new SimpleQuartz();
		org.apache.synapse.task.TaskDescription taskDescription=new TaskDescription();		
		if(visualTask.getTaskName()!=null){
			taskDescription.setName(visualTask.getTaskName());
		}
		else{
			taskDescription.setName("Default");
		}
		s.setTaskDescription(taskDescription);		
		
		return taskDescription;		
	}
}
