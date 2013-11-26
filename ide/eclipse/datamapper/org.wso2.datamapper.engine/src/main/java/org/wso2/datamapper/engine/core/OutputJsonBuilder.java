package org.wso2.datamapper.engine.core;

import java.io.IOException;
import org.apache.avro.generic.GenericRecord;
import org.json.JSONException;
import org.json.JSONObject;

public class OutputJsonBuilder {

	public JSONObject getOutPut(GenericRecord outputRecord , String rootElementName) throws JSONException, IOException {
		
		JSONObject outputJson = new JSONObject();
		outputJson.put(rootElementName, new JSONObject(outputRecord.toString()));

		return outputJson;
	}
}
