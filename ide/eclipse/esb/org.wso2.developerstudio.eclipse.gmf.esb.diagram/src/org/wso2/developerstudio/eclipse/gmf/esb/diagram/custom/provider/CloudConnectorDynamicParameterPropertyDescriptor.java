package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.provider;

import java.util.Iterator;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorOperation;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

public class CloudConnectorDynamicParameterPropertyDescriptor extends PropertyDescriptor{
	
	IItemPropertyDescriptor itemPropertyDescriptor=null;
	
	public CloudConnectorDynamicParameterPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
		this.itemPropertyDescriptor=itemPropertyDescriptor;
	}
	
	public CellEditor createPropertyEditor(Composite parent) {			
		TextCellEditor textCellEditor=new TextCellEditor(parent){
			
			@Override
			protected void focusLost() {				
 				String displayName=itemPropertyDescriptor.getDisplayName(object);
				Iterator<CallTemplateParameter> iterator=((CloudConnectorOperation)object).getConnectorParameters().iterator();
				String s=null;
				while (iterator.hasNext()) {
					CallTemplateParameter next = (CallTemplateParameter)iterator.next();
					if(next.getParameterName().equals(displayName)){					
					s=getValue().toString();
					
					SetCommand setCmd = new SetCommand(TransactionUtil.getEditingDomain(object), next,
							EsbPackage.Literals.CALL_TEMPLATE_PARAMETER__PARAMETER_VALUE,
							s);
					if(setCmd.canExecute()){
						TransactionUtil.getEditingDomain(object).getCommandStack().execute(setCmd);
					}
					setValue(s);
					}					
				}
				super.focusLost();
			}
	
		     @Override
			protected void doSetValue(Object value) {
				if (value == null) {
					Iterator<CallTemplateParameter> iterator = ((CloudConnectorOperation) object)
							.getConnectorParameters().iterator();
					while (iterator.hasNext()) {
						CallTemplateParameter next = (CallTemplateParameter) iterator.next();
						if (next.getParameterName().equals(getDisplayName())) {
							value = next.getParameterValue();
						}
					}
					if (value == null) {
						value = "";
					}
				}
				super.doSetValue(value);
			}
		};
		return textCellEditor;
	}

}
