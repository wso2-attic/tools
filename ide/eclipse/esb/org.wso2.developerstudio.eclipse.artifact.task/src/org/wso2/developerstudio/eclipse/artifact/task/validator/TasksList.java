package org.wso2.developerstudio.eclipse.artifact.task.validator;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.wso2.developerstudio.eclipse.artifact.task.model.TaskModel;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider.ListData;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class TasksList extends AbstractListDataProvider{
	@Override
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		List<OMElement> availableSeqList = ((TaskModel)model).getAvailableTaskslist();
		if(availableSeqList != null){
			for (OMElement omElement : availableSeqList) {
				String name = omElement.getAttributeValue(new QName("name"));
				list.add(createListData(name, omElement));
			}
		}
		return list;
	}
}
