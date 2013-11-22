package org.wso2.datamapper.engine.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericRecord;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class AvroWrapper implements Scriptable{
	
	private GenericRecord record;
	private Map<String, Schema> schemaMap;
	private Scriptable prototype;
	
	
	public AvroWrapper(GenericRecord record) {	
		this.record = record;
	}

	public GenericRecord getRecord() {
		return record;
	}

	public void setSchemaMap(Map<String, Schema> schemaMap) {
		this.schemaMap = schemaMap;
	}

	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(String name, Scriptable start) {
		Object resource = this.record.get(name);
		if(resource != null){
			return resource;
		}
		
		return NOT_FOUND;
	}

	public Object get(int index, Scriptable start) {
		return null;
	}

	public boolean has(String name, Scriptable start) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean has(int index, Scriptable start) {
		// TODO Auto-generated method stub
		return false;
	}

	public void put(String name, Scriptable start, Object value) {
		
		if (value instanceof NativeJavaObject) {
			this.record.put(name, ((NativeJavaObject) value).getDefaultValue(String.class));
		}else{
			this.record.put(name, value);
		}

	}

	public void put(int index, Scriptable start, Object value) {

	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	public Scriptable getPrototype() {
		return prototype;
	}

	public void setPrototype(Scriptable prototype) {
		this.prototype = prototype;		
	}

	public Scriptable getParentScope() {
		return null;
	}

	public void setParentScope(Scriptable parent) {
		// TODO Auto-generated method stub
		
	}

	public Object[] getIds() {
	    ArrayList res = new ArrayList();
	    
	    Schema schema = this.record.getSchema();
	    Iterator<Field> fieldIter = schema.getFields().iterator();
	    Schema.Field field;
	    
	    while (fieldIter.hasNext()) {
			 field = (Schema.Field) fieldIter.next();
			 res.add(field.name());
		}
	    Object[] result = res.toArray();
		
		return result;
	}

	public Object getDefaultValue(Class<?> hint) {
		return null;
	}

	public boolean hasInstance(Scriptable instance) {
		return false;
	}

}
