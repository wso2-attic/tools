package org.wso2.maven.registry.handler.utils;

import java.util.List;

public class RegistryHandlerUtils {
	public static String filterMethodList(List<String> methodsList) {
		String filterMethodsListString = "Filter." + methodsList.get(0);
		for (int i = 1; i < methodsList.size(); i++) {
			filterMethodsListString += ", Filter." + methodsList.get(i);
		}
		return filterMethodsListString;
	}
}
