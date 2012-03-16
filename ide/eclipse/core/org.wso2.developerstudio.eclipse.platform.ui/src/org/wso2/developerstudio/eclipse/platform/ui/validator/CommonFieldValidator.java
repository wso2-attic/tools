package org.wso2.developerstudio.eclipse.platform.ui.validator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;

public class CommonFieldValidator {

public static void validateJavaClassNameField(Object value) throws FieldValidationException{
	String className = value.toString();
	if ("".equals(className)) {
		throw new FieldValidationException("Class name cannot be empty");
	} else {
		if (!isJavaClassName(className)){
			throw new FieldValidationException("Class name is invalid");
		}
	}	
}

public static boolean isJavaClassName(String name){
	return name.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*");
}

public static boolean isJavaPackageName(String name){
	return name.matches("([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*");
}

public static void validateJavaPackageNameField(Object value) throws FieldValidationException{
	String packageName = value.toString();
	if ("".equals(packageName)) {
		throw new FieldValidationException("Package name cannot be empty");
	}
	else {
		if (!isJavaPackageName(packageName)){
			throw new FieldValidationException("Package name is invalid");
		}
	}
}

public static void validateProjectField(Object value) throws FieldValidationException{
	if (value == null) {
		throw new FieldValidationException("Project name cannot be empty");
	}
	String projectName = value.toString();
	if (projectName.trim().equals("")) {
		throw new FieldValidationException("Project name cannot be empty");
	}
	IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

	if (project.exists()) {
		throw new FieldValidationException("Project with the name '" + projectName +
		                                   "' already exists");
	}
}
	
}
