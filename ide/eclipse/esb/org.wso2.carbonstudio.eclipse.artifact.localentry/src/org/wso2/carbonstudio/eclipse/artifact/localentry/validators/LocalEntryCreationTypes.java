package org.wso2.carbonstudio.eclipse.artifact.localentry.validators;

import java.util.ArrayList;
import java.util.List;

import org.wso2.carbonstudio.eclipse.artifact.localentry.utils.LocalEntryArtifactConstants;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class LocalEntryCreationTypes extends AbstractListDataProvider{

	
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> epTypeList = new ArrayList<ListData>();
		epTypeList.add(createListData(LocalEntryArtifactConstants.TYPE_IN_LINE_TEXT_LE, 
				                      LocalEntryArtifactConstants.TYPE_IN_LINE_TEXT_LE));
		epTypeList.add(createListData(LocalEntryArtifactConstants.TYPE_IN_LINE_XML_LE,
									  LocalEntryArtifactConstants.TYPE_IN_LINE_XML_LE));
		epTypeList.add(createListData(LocalEntryArtifactConstants.TYPE_SOURCE_URL_LE,
									  LocalEntryArtifactConstants.TYPE_SOURCE_URL_LE));
		// TODO Auto-generated method stub
		return epTypeList;
	}



}
