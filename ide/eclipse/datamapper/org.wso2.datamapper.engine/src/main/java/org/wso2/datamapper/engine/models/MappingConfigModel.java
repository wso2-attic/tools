package org.wso2.datamapper.engine.models;


public class MappingConfigModel {

	private String outputDataType;
	private String mappingFunctionType;

	public String getOutputDataType() {
		return outputDataType;
	}

	public void setOutputDataType(String outputDataType) {
		this.outputDataType = outputDataType;
	}

	public String getMappingFunctionType() {
		return mappingFunctionType;
	}

	public void setMappingFunctionType(String mappingFunctionType) {
		this.mappingFunctionType = mappingFunctionType;
	}

}
