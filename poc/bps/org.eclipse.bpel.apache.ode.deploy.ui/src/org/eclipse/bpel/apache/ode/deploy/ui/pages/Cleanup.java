/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.bpel.apache.ode.deploy.model.dd.OnType;

/**
 * @author ishan
 * 
 */
public class Cleanup {
	private String enumerationValue;
	private boolean enumerationValueBoolean;
	private boolean[] values;
	// private static final String[] attributes;
	private static int size = 0;
	private static final int ENUMERATION_VALUE_BOOLEAN = size++;
	private static final int ALL = size++;
	private static final int INSTANCE = size++;
	private static final int VARIABLES = size++;
	private static final int MESSAGES = size++;
	private static final int CORRELATION = size++;
	private static final int EVENTS = size++;
	//private static final final HashMap<String, Integer> map = new HashMap<String, Integer>(){{"a", (new Integer(2))}};

	private static final String[] valueNames = new String[] {"", "instance", "variable", "messages", "correlations", "events", "all"};
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
			this);

	public Cleanup() {
	}

	public Cleanup(String enumerationValue) {
		this.enumerationValue = enumerationValue;
		// read from the file -> model and then populate the table
		this.values = new boolean[ProcessPage.N_CATEGORY_TYPES + 1];
		for (int i = 0; i < ProcessPage.N_CATEGORY_TYPES + 1; ++i) {
			values[i] = false;
		}
	}

	public Cleanup(String enumerationValue, boolean all, boolean instance,
			boolean variables, boolean messages, boolean correlation) {
		this.enumerationValue = enumerationValue;
		values = new boolean[] { false, all, instance, variables, messages,
				correlation };
	}

	public void setAll(boolean all) {
		set(ALL, all);
	}

	public void setInstance(boolean instance) {
		set(INSTANCE, instance);
	}

	public void setVariables(boolean variables) {
		set(VARIABLES, variables);
	}

	public void setEvents(boolean events) {
		set(EVENTS, events);
	}
	public void setMesseges(boolean messages) {
		set(MESSAGES, messages);
	}

	public void setCorrelation(boolean correlation) {
		set(CORRELATION, correlation);
	}

	public boolean getAll() {
		return isChecked(ALL);
	}

	public boolean getInstance() {
		return isChecked(INSTANCE);
	}

	public boolean getVariables() {
		return isChecked(VARIABLES);
	}

	public boolean getMesseges() {
		return isChecked(MESSAGES);
	}

	public boolean getCorrelation() {
		return isChecked(CORRELATION);
	}

	public String getEnumerationValue() {
		return this.enumerationValue;
	}

	public void selectEnumerationValue() {
		set(ENUMERATION_VALUE_BOOLEAN, true);
	}

	public void deselectEnumerationValue() {
		set(ENUMERATION_VALUE_BOOLEAN, false);
	}

	public boolean isEnumerationValueSelected() {
		return isChecked(ENUMERATION_VALUE_BOOLEAN);
	}

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public boolean isChecked(int index) {
		//System.out.println(" -- getting from Cleanup");
		return values[index];
	}

	public void set(int index, boolean value) {
		values[index] = value;
		//System.out.println("setting Cleanup");
		//System.out.println("Cleanup#set() => value: " + enumerationValue
		//		+ " index: " + index + " value: " + value);
	}
	
	public void setValueByName(String name) {
		for (int i = 1; i < valueNames.length; ++i) {
			if (valueNames[i].equals(name)) {
				values[i] = true;
				return;
			}
		}
		System.out.println("no value name found in the name: " + name);
	}
	public void printValues() {
		System.out.print("[");
		for (int i = 0; i < values.length; ++i) {
			System.out.print(values[i] + " ");
		}
		System.out.println("]");
	}
}
