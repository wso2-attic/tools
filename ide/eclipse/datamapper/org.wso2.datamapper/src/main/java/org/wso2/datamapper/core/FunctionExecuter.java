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

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.parsers.MappingBaseListener;
import org.wso2.datamapper.parsers.MappingParser.ArgContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionnameContext;
import org.wso2.datamapper.parsers.MappingParser.OutputelementContext;
import org.wso2.datamapper.core.InputDataHandler;

public class FunctionExecuter extends MappingBaseListener {

	private String outputElement;
	private String funcName;
	private List<OMElement> tempArgList;
	private Map<String,List<String>> resultMap;
	private InputDataHandler inputHandler;
	private List<String> outputList;

	public FunctionExecuter(String inputFileType, File inputFile) {
		tempArgList = new ArrayList<OMElement>();
		resultMap = new HashMap<String, List<String>>();
		inputHandler = new InputDataHandler(inputFileType);
		inputHandler.setInputFile(inputFile);
	}

	public Map<String, List<String>> getResultMap() {
		return resultMap;
	}

	@Override
	public void enterFunction(@NotNull FunctionContext ctx) {
		outputList = new ArrayList<String>();
	}

	@Override
	public void exitArg(@NotNull ArgContext ctx) {
		super.exitArg(ctx);
		String arg = ctx.getText();	
		
		List<OMElement> functionParameterList = inputHandler.getInputvalues(arg);
		OMElement oldElement;
		OMElement newElement;
			
		if(tempArgList.size() > 0){
			Iterator<OMElement> oldElementIterator = tempArgList.listIterator();
			Iterator<OMElement> newElementIterator = functionParameterList.listIterator();
			
			while (oldElementIterator.hasNext() && newElementIterator.hasNext()) {
				oldElement = oldElementIterator.next();
				newElement = newElementIterator.next();
				
				if(this.funcName.equals("concat")){
					outputList.add(oldElement.getText().concat(" "+newElement.getText()));
				}	
			}
			tempArgList = new ArrayList<OMElement>();
		}else{
			tempArgList = functionParameterList;
		}
	}

	@Override
	public void exitFunction(@NotNull FunctionContext ctx) {		
		System.out.println(this.outputElement+" == "+this.outputList);
		resultMap.put(this.outputElement, this.outputList);
		this.outputList = null;
	}

	@Override
	public void exitOutputelement(@NotNull OutputelementContext ctx) {
		this.outputElement = ctx.getText();
	}

	@Override
	public void exitFunctionname(@NotNull FunctionnameContext ctx) {
		this.funcName = ctx.getText();
	}

}
