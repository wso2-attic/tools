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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.wso2.datamapper.parsers.MappingLexer;
import org.wso2.datamapper.parsers.MappingParser;
import org.wso2.datamapper.core.FunctionExecuter;
import org.wso2.datamapper.inputAdapters.InputDataReaderAdapter;
import org.wso2.datamapper.inputAdapters.XmlInputReader;

public class DataMapper {

	public void doMapping(File configFile, File inputFile, File inputSchema, File outputSchema) {
		
		InputDataReaderAdapter reader = new XmlInputReader();
		reader.setInputReader(inputFile);
		GenericRecord inRecord = null;

		Schema schema;
		try {
			schema = new Parser().parse(inputSchema);
			inRecord = reader.readInputvalues(schema);
			
			System.out.println("input record "+inRecord);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ANTLRInputStream inputStream;
		
		try {
			inputStream = new ANTLRInputStream(new FileInputStream(configFile));
			MappingLexer lexer = new MappingLexer(inputStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MappingParser parser = new MappingParser(tokens);
			
			ParseTree tree = parser.statment();
			ParseTreeWalker walker = new ParseTreeWalker();
			FunctionExecuter conWalker = new FunctionExecuter();
			conWalker.setInputData(inRecord);
			
			walker.walk(conWalker, tree);
			
			Map<String,String> resultMap = conWalker.getResultMap();
			
			Iterator<String> resultIt = resultMap.keySet().iterator();
			String result = "";
			String outElement = "";
			
			Schema outSchema = new Parser().parse(outputSchema);
			GenericRecord outRecord = new GenericData.Record(outSchema);
			
			while (resultIt.hasNext()) {
				outElement = resultIt.next();
				result = resultMap.get(outElement);
				outRecord.put(outElement, result);
			}

			System.out.println("out record "+outRecord.toString());
			
			BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File("./resource/output.json")));
			outputWriter.write(outRecord.toString());
			outputWriter.flush();
			outputWriter.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
