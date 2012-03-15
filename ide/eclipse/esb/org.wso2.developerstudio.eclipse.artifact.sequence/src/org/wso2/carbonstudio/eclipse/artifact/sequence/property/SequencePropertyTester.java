package org.wso2.carbonstudio.eclipse.artifact.sequence.property;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class SequencePropertyTester extends PropertyTester{

	public boolean test(Object obj, String arg1, Object[] arg2, Object arg3) {
		if(obj instanceof IFile){
			try {
				File file = ((IFile)obj).getLocation().toFile();
				String content = FileUtils.getContentAsString(file);
				if(content.contains("<sequence")){
					return true;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
