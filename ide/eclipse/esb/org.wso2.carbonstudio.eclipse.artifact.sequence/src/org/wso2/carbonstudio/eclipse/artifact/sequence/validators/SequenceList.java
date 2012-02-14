package org.wso2.carbonstudio.eclipse.artifact.sequence.validators;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.wso2.carbonstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class SequenceList extends AbstractListDataProvider{

	
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		List<OMElement> availableSeqList = ((SequenceModel)model).getAvailableSeqList();
		if(availableSeqList != null){
			for (OMElement omElement : availableSeqList) {
				String name = omElement.getAttributeValue(new QName("name"));
				list.add(createListData(name, omElement));
			}
		}
		return list;
	}

}
