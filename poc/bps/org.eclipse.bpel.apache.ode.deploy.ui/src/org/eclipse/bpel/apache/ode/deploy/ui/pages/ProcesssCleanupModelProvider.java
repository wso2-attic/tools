/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpel.apache.ode.deploy.model.dd.OnType;

/**
 * @author ishan
 * 
 */
public class ProcesssCleanupModelProvider {
	private static ProcesssCleanupModelProvider content;
	private List<Cleanup> attributes;

	//private static final String SUCCESS_ATTR = "success";
	//private static final String FAILURE_ATTR = "failure";
	//private static final String ALWAYS_ATTR = "always";

	private static final int size = 3;

	private ProcesssCleanupModelProvider() {
		
		attributes = new ArrayList<Cleanup>();
		Cleanup a;
		for (int i = 0; i < size; ++i) {
			//System.out.println("ProcessCleanupModel#rowId: " + OnType.get(i).getName());
			// TODO we have to handle these two properly
			a = new Cleanup(OnType.get(i).getName());
			attributes.add(a);
		}
	}

	public static synchronized ProcesssCleanupModelProvider getInstance() {
		if (content != null) {
			return content;
		}
		content = new ProcesssCleanupModelProvider();
		return content;
	}

	public List<Cleanup> getAttributes() {
		return this.attributes;
	}
}
