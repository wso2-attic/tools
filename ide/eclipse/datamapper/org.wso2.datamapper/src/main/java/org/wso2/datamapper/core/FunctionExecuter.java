/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.datamapper.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.apache.avro.generic.GenericRecord;
import org.wso2.datamapper.parsers.MappingBaseListener;
import org.wso2.datamapper.parsers.MappingParser.ArgContext;
import org.wso2.datamapper.parsers.MappingParser.FuncidContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionContext;
import org.wso2.datamapper.parsers.MappingParser.OutputelementContext;
import org.wso2.datamapper.parsers.MappingParser.StatContext;

public class FunctionExecuter extends MappingBaseListener {

	private GenericRecord inRecord;
	private String outputElement;
	private String function;
	private Map<String,String> resultMap;
	private List<String> arglist;
	private String functionResult;
	
	public FunctionExecuter(){
		resultMap = new HashMap<String,String>();
	}
	
	@Override
	public void enterOutputelement(@NotNull OutputelementContext ctx) {
		this.outputElement = getChildElement(ctx.getText());
	}

	@Override
	public void exitStat(@NotNull StatContext ctx) {
		this.resultMap.put(this.outputElement, this.functionResult);
	}

	@Override
	public void enterFuncid(@NotNull FuncidContext ctx) {
		this.function = ctx.getText();
	}

	@Override
	public void enterFunction(@NotNull FunctionContext ctx) {
		this.arglist = new ArrayList<String>();
	}

	@Override
	public void exitFunction(@NotNull FunctionContext ctx) {
		StringBuilder result = new StringBuilder();
		
		if(this.function.equals("concat")){
			Iterator<String> argIt = this.arglist.listIterator();
			String temp;
			while (argIt.hasNext()) {
				temp = argIt.next();
				result.append(inRecord.get(getChildElement(temp))+" ");
			}
			this.functionResult = result.toString().trim();
		}
	}

	@Override
	public void enterArg(@NotNull ArgContext ctx) {
		this.arglist.add(ctx.getText());
	}
	
	public void setInputData(GenericRecord inData) {
		this.inRecord = inData;
	}

	private String getChildElement(String elementPath){
		String childElement = "";	
		String[] childElements = elementPath.split("[.]");
		
		for (String element : childElements) {
			childElement = element;
		}
		return childElement;
	}
	
	public Map<String,String> getResultMap() {
		return this.resultMap;
	}

}
