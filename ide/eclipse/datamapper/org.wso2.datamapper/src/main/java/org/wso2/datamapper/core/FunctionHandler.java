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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.wso2.datamapper.parsers.MappingLexer;
import org.wso2.datamapper.parsers.MappingParser;



import temp.FunctionExecuter;

public class FunctionHandler {
	
	private String result = "";
	
	public String executeFunction(String configQuery) {
		
		CharStream in = new ANTLRInputStream(configQuery);		
        MappingLexer lexer = new MappingLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MappingParser parser = new MappingParser(tokens);
        
        ParseTree tree = parser.stat();
        
        
        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionExecuter funExe = new FunctionExecuter();
            
        walker.walk(funExe, tree);
        result = funExe.getResult();
        System.out.println("final result "+result);

        return result;
	}
}
