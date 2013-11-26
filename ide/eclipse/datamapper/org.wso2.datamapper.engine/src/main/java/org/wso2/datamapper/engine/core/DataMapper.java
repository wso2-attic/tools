package org.wso2.datamapper.engine.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.*;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.data.Json;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.LazyDynaBean;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONWriter;
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

public class DataMapper {
	
	public void doMap(File configFile, InputStream inStream, File inputSchema,File outputSchema) throws IOException, IllegalAccessException, InstantiationException, ScriptException, JSONException {
		
		Schema inSchema = new Parser().parse(inputSchema);
		Schema outSchema = new Parser().parse(outputSchema);
		
		XmlInputReader reader = new XmlInputReader();
		reader.setInptStream(inStream);
		
		Context context = Context.enter();
		context.setOptimizationLevel(-1);
		Scriptable scope = context.initStandardObjects();
		
		BufferedReader confReader = new BufferedReader(new FileReader(configFile));
		MappingHandler mappingHandler = new MappingHandler(inSchema,outSchema,scope,reader,context);	
		
		String line = "";
		String script= "";
		Pattern pattern = Pattern.compile("function map_(L|S)_([a-zA-Z]+)_(L|S)_([a-zA-Z]+)");
		
		HashMap<String, MappingConfigModel> mappingTypes = new HashMap<String, MappingConfigModel>();
		MappingConfigModel mappingModel;
		
		while ((line = confReader.readLine()) != null) {
			script = script.concat(line);			
			Matcher matcher = pattern.matcher(line);
			mappingModel = new MappingConfigModel();

			if(matcher.find()){
				mappingModel.setMappingFunctionType(matcher.group(1));
				mappingModel.setOutputDataType(matcher.group(4));
				mappingTypes.put(matcher.group(2), mappingModel);
			}
		}
		
		context.evaluateString(scope, script ,"", 1, null);
		GenericRecord outRecord = null;		
		try {
			outRecord = mappingHandler.executeMappingFunctions(mappingTypes);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		OutputJsonBuilder outJsonBuilder = new OutputJsonBuilder();
		JSONObject resultJson = outJsonBuilder.getOutPut(outRecord, outSchema.getName());
		
		System.out.println("end mapping "+resultJson);
		confReader.close();

	}

}
