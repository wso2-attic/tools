package org.wso2.developerstudio.eclipse.artifact.synapse.template;

import java.io.File;

import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class SynapseClassTemplate {

	public static String getSimpleTemplete() {
		try {
			StringBuffer buffer = new StringBuffer();
			// <definitions xmlns="http://ws.apache.org/ns/synapse"/>
			buffer.append("<definitions xmlns=");
			buffer.append("\"");
			buffer.append("http://ws.apache.org/ns/synapse");
			buffer.append("\" ");
			buffer.append("xmlns:xsi=");
			buffer.append("\"");
			buffer.append("http://www.w3.org/2001/XMLSchema-instance");
			buffer.append("\" ");
			buffer.append("xsi:schemaLocation=");
			buffer.append("\"");
			buffer.append("http://ws.apache.org/ns/synapse http://synapse.apache.org/ns/2010/04/configuration/synapse_config.xsd");
			buffer.append("\"");
			buffer.append(" />");

			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public static String getRichTemplate() {
		try {
			File resourceFile = new SynapseTemplateUtils()
					.getResourceFile("template/synapseConfig.temp");
			String fileContent = FileUtils.getContentAsString(resourceFile);
			return fileContent;
		} catch (Exception e) {
			return "";
		}
	}
}