package org.wso2.developerstudio.eclipse.artifact.synapse.validators;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.wso2.developerstudio.eclipse.artifact.synapse.model.SynapseModel;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class EsbArtifactList extends AbstractListDataProvider {

	public List<ListData> getListData(String modelProperty,ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		List<OMElement> availablePSList = ((SynapseModel)model).getAvailablePLESList();
		if(availablePSList != null){
			for (OMElement omElement : availablePSList) {
				String qName = omElement.getAttributeValue(new QName("name"));
				if(("".equals(qName))||(qName==null)){
					qName=omElement.getAttributeValue(new QName("key"));
				}
				qName = qName+" ["+omElement.getLocalName()+"]";
				list.add(createListData(qName, omElement));
			}
		}
		return list;
	}

}
