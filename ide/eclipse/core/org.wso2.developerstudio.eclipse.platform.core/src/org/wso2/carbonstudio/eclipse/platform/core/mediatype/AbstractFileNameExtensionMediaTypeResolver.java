package org.wso2.carbonstudio.eclipse.platform.core.mediatype;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.IMediaTypeFromFileNameResolver;

public abstract class AbstractFileNameExtensionMediaTypeResolver  implements IMediaTypeFromFileNameResolver{
	protected boolean hasExtension(String fileName, String extension){
		if (!extension.startsWith(".")){
			extension="."+extension;
		}
		return fileName.toLowerCase().endsWith(extension);
	}
}
