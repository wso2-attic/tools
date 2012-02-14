package org.wso2.carbonstudio.eclipse.gmf.esb.persistence;

import java.util.HashMap;

import org.wso2.carbonstudio.eclipse.gmf.esb.EsbLink;

public interface SequenceInfo {
	
	public HashMap<String, EsbLink> sequenceMap=new HashMap<String, EsbLink>();
	public String SEQUENCE_LABEL="Sequence";
	public String SELECT="Select";
	
	
}
