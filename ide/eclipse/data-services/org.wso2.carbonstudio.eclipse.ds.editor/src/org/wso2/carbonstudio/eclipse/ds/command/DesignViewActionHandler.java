package org.wso2.carbonstudio.eclipse.ds.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.handlers.HandlerUtil;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryProperty;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;
import org.wso2.carbonstudio.eclipse.ds.Sql;
import org.wso2.carbonstudio.eclipse.ds.Subscription;
import org.wso2.carbonstudio.eclipse.ds.presentation.DsEditor;

public class DesignViewActionHandler {
	
	private Object referenceObject;
	private DataService dataService;
	private TreeViewer outlineViewer;
	private EditingDomain editingDomain;
	private ISelection currentSelection;
		
	public void delete(DsEditor editor){
		
		
		EStructuralFeature feature = null;
		Object value = null;
		EObject parent = null;
	
		dataService = editor.getDataService();
		editingDomain = editor.getEditingDomain();
		
		if(editor.getActivePage() == DsEditor.getDesignViewIndex()){
			
			currentSelection = editor.getMdPage().getOutLineBlock().getCurrentSelection();
			
			if (currentSelection instanceof IStructuredSelection && ((IStructuredSelection) currentSelection).size() == 1) {
				
				referenceObject = ((IStructuredSelection) currentSelection).getFirstElement();
				
				if(referenceObject != null && referenceObject instanceof DataService){
					
					DataService dataService  = (DataService)referenceObject;
					
					MessageDialog.openError(Display.getCurrent().getActiveShell().getShell(), 
							"Can not Complete Action", "You can not delete "+ dataService.getName()+" service!");
					
				}else if(referenceObject != null && referenceObject instanceof DataSourceConfiguration){
					
					value  = (DataSourceConfiguration)referenceObject;
					feature = DsPackage.Literals.DATA_SERVICE__CONFIG;
					parent = dataService;
					
				}else if(referenceObject != null && referenceObject instanceof Query){
					
					value = (Query)referenceObject;
					feature = DsPackage.Literals.DATA_SERVICE__QUERY;
					parent = dataService;
					
					
				}else if(referenceObject != null && referenceObject instanceof Operation){
					
					value = (Operation)referenceObject;
					feature = DsPackage.Literals.DATA_SERVICE__OPERATION;
					parent = dataService;
					
					
				}else if(referenceObject != null && referenceObject instanceof EventTrigger){
					
					value = (EventTrigger)referenceObject;
					feature = DsPackage.Literals.DATA_SERVICE__EVENT_TRIGGER;
					parent = dataService;
					
				}else if(referenceObject != null && referenceObject instanceof Resource){
					
					value = (Resource)referenceObject;
					feature = DsPackage.Literals.DATA_SERVICE__RESOURCE;
					parent = dataService;
					
				}else if(referenceObject != null && referenceObject instanceof ConfigurationProperty ){
					
					value = (ConfigurationProperty)referenceObject;
					feature = DsPackage.Literals.DATA_SOURCE_CONFIGURATION__PROPERTY;
					parent = (DataSourceConfiguration)editingDomain.getParent(value);
					
					
				}else if(referenceObject != null && referenceObject instanceof Sql){
					
					value =(Sql)referenceObject;
					feature = DsPackage.Literals.QUERY__SQL;
					parent = (Query)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof QueryPropertyList){
					
					value = (QueryPropertyList)referenceObject;
					feature = DsPackage.Literals.QUERY__PROPERTIES;
					parent = (Query)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof QueryProperty){
					
					value = (QueryProperty)referenceObject;
					feature = DsPackage.Literals.QUERY_PROPERTY_LIST__PROPERTY;
					parent = (QueryPropertyList)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof ResultMapping){
					
					value = (ResultMapping)referenceObject;
					feature = DsPackage.Literals.QUERY__RESULT;
					parent = (Query)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof ElementMapping){
					
					value = (ElementMapping)referenceObject;
					feature = DsPackage.Literals.RESULT_MAPPING__ELEMENT;
					parent = (ResultMapping)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof AttributeMapping){
					
					value = (AttributeMapping)referenceObject;
					feature = DsPackage.Literals.RESULT_MAPPING__ATTRIBUTE;
					parent = (ResultMapping)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof CallQuery){
					
					value = (CallQuery)referenceObject;
					
					if(editingDomain.getParent(value) instanceof Operation){
					
					feature = DsPackage.Literals.OPERATION__CALL_QUERY;
					parent = (Operation)editingDomain.getParent(value);
				   					
					}else if(editingDomain.getParent(value) instanceof ResultMapping){
					
					feature = DsPackage.Literals.RESULT_MAPPING__CALL_QUERY;
					parent = (ResultMapping)editingDomain.getParent(value);
					
					}else if (editingDomain.getParent(value) instanceof Resource){
					
					feature = DsPackage.Literals.RESOURCE__CALL_QUERY;
					parent = (Resource)editingDomain.getParent(value);
						
					}else if (editingDomain.getParent(value) instanceof CallQueryList){
					
					feature = DsPackage.Literals.CALL_QUERY_LIST__CALL_QUERY;
					parent = (CallQueryList)editingDomain.getParent(value);
					
					}
					
				}else if(referenceObject != null && referenceObject instanceof CallQueryList){
					
					value = (CallQueryList)referenceObject;
					feature = DsPackage.Literals.OPERATION__CALL_QUERY_GROUP;
					parent = (Operation)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof ExcelQuery){
					
					value = (ExcelQuery)referenceObject;
					feature = DsPackage.Literals.QUERY__EXCEL;
					parent = (Query)editingDomain.getParent(value);
						
				}else if(referenceObject != null && referenceObject instanceof GSpreadQuery){
					
					value = (GSpreadQuery)referenceObject;
					feature = DsPackage.Literals.QUERY__GSPREAD;
					parent = (Query)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof QueryParameter){
					
					value = (QueryParameter)referenceObject;
					feature =DsPackage.Literals.QUERY__PARAM;
					parent = (Query)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof  LongRangeValidator){
					
					value = (LongRangeValidator)referenceObject;
					feature = DsPackage.Literals.QUERY_PARAMETER__VALIDATE_LONG_RANGE;
					parent = (QueryParameter)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof DoubleRangeValidator){
					
					value = (DoubleRangeValidator)referenceObject;
					feature =DsPackage.Literals.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE;
					parent = (QueryParameter)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof LengthValidator){
					
					value = (LengthValidator)referenceObject;
					feature =DsPackage.Literals.QUERY_PARAMETER__VALIDATE_LENGTH;
					parent = (QueryParameter)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof PatternValidator){
					
					value = (PatternValidator)referenceObject;
					feature = DsPackage.Literals.QUERY_PARAMETER__VALIDATE_PATTERN;
					parent = (QueryParameter)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof CustomValidator){
					
					value = (CustomValidator)referenceObject;
					feature = DsPackage.Literals.QUERY_PARAMETER__VALIDATE_CUSTOM;
					parent = (QueryParameter)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof EventSubscriptionList){
					
					value = (EventSubscriptionList)referenceObject;
					feature = DsPackage.Literals.EVENT_TRIGGER__SUBSCRIPTIONS;
					parent = (EventTrigger)editingDomain.getParent(value);
					
				}else if(referenceObject != null && referenceObject instanceof Subscription){
					
					value = (Subscription)referenceObject;
					feature = DsPackage.Literals.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION;
					parent = (EventSubscriptionList)editingDomain.getParent(value);
					
				} else if(referenceObject != null && referenceObject instanceof ParameterMapping){
					
					value = (ParameterMapping)referenceObject;
					feature = DsPackage.Literals.CALL_QUERY__WITH_PARAM;
					parent = (CallQuery)editingDomain.getParent(value);
						
				}else{
					
				System.out.println("no implemantaion for this delete");
				
				} 
				
				if (editingDomain != null && parent != null && feature != null && value != null) {
					RemoveCommand removeCommand = new RemoveCommand(editingDomain, parent, feature, value);
					if (removeCommand.canExecute()) {
						editingDomain.getCommandStack().execute(removeCommand);
					}

				}
				
				
			}
					
				
		}
		
	}

}
