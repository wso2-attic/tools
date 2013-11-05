package org.wso2.datamapper.engine.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.*;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.LazyDynaBean;
import org.json.JSONException;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.wso2.datamapper.engine.inputAdapters.XmlInputReader;
import org.wso2.datamapper.engine.models.MappingConfigModel;
import org.wso2.datamapper.engine.sample.Employee;
import org.wso2.datamapper.engine.sample.Engineer;

public class DataMapper {
	
	public void doMap(File configFile, File inputFile, File inputSchema,File outputSchema) throws IOException, IllegalAccessException, InstantiationException, ScriptException {
		
		Schema inSchema = new Parser().parse(inputSchema);
		Schema outSchema = new Parser().parse(outputSchema);
		
		XmlInputReader reader = new XmlInputReader();
		reader.setInputReader(inputFile);
		
		Context context = Context.enter();
		context.setOptimizationLevel(-1);
		Scriptable scope = context.initStandardObjects();
		
		BufferedReader confReader = new BufferedReader(new FileReader(configFile));
		MappingHandler mappingHandler = new MappingHandler(inSchema,outSchema,scope,reader,context);	
		
		String line = "";
		String script= "";
		Pattern pattern = Pattern.compile("function map_(L|S)_([a-zA-Z]+)_([a-zA-Z]+)");
		
		HashMap<String, MappingConfigModel> mappingTypes = new HashMap<String, MappingConfigModel>();
		MappingConfigModel mappingModel;
		
		while ((line = confReader.readLine()) != null) {
			script = script.concat(line);			
			Matcher matcher = pattern.matcher(line);
			mappingModel = new MappingConfigModel();

			if(matcher.find()){
				mappingModel.setMappingFunctionType(matcher.group(1));
				mappingModel.setInputDataType(matcher.group(2));
				mappingTypes.put(matcher.group(3), mappingModel);
			}
		}
		context.evaluateString(scope, script , "", 1, null);
				
		try {
			mappingHandler.executeMappingFunctions(mappingTypes);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		System.out.println("end mapping");
		confReader.close();

	}

}
