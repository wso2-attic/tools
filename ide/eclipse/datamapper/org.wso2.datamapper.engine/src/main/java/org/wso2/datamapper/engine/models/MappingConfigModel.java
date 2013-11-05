package org.wso2.datamapper.engine.models;


public class MappingConfigModel {

	private String inputDataType;
	private String mappingFunctionType;

	public String getInputDataType() {
		return inputDataType;
	}

	public void setInputDataType(String inputDataType) {
		this.inputDataType = inputDataType;
	}

	public String getMappingFunctionType() {
		return mappingFunctionType;
	}

	public void setMappingFunctionType(String mappingFunctionType) {
		this.mappingFunctionType = mappingFunctionType;
	}

}
