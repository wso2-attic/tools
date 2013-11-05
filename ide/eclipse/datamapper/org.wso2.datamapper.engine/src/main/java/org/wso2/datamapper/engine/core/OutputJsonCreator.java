package org.wso2.datamapper.engine.core;

import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.apache.avro.Schema;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OutputJsonCreator {

	public JSONObject getOutPut(Queue<String> keys, Map<String, Schema> outputSchemaMap, List<JSONObject> outJsonObList) throws JSONException {
		
		JSONObject outputJson = new JSONObject();;
		
		for (int i = keys.size(); i >0; i--) {
			String key = keys.poll();
			Schema sc = outputSchemaMap.get(key);
			
			if (key.equals("root")) {
				break;
			}
			
			if(sc.getType() == Schema.Type.ARRAY){	
				
				JSONArray tempar = new JSONArray();
				tempar.put(outputJson);			
				outputJson = new JSONObject();
				outputJson.put(key, tempar);
				
			}else if (sc.getType() == Schema.Type.RECORD) {				
				JSONArray tempArray = new JSONArray();

				for (JSONObject ob : outJsonObList) {
					tempArray.put(ob);
				}
				outputJson = new JSONObject();
				outputJson.put(key, tempArray);
				
			}
			
		}	
		return outputJson;
	}
}
