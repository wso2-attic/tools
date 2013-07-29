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

package org.wso2.developerstudio.eclipse.datamapper.engine;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class FunctionHandler {
private File inputFile;
	
	public FunctionHandler(File inputFile) {
		this.inputFile = inputFile;
	}
	
	public String executeFunction(String functionName, List<String> args) {
		String result ="";
		Iterator<String> configArgsIterator = args.listIterator();
		String arg;
		String inputvalue;
		InputDataHandler inputHandler = new InputDataHandler();
		inputHandler.setInputFile(this.inputFile);
		
		while (configArgsIterator.hasNext()) {
			
			arg = configArgsIterator.next();
			arg = arg.replace(".", "/");
			inputvalue = inputHandler.getInputvalue(arg);
			
			if(functionName.equals("concat")){
				result = result.concat(" "+inputvalue);
			}
		}
		
		System.out.println("result "+result);
		return result;
	}
}
