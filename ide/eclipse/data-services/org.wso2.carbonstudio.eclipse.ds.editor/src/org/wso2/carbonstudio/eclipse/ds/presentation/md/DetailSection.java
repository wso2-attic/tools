package org.wso2.carbonstudio.eclipse.ds.presentation.md;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.presentation.DsEditor;

public class DetailSection {

	private FormToolkit toolkit;
	private AdapterFactoryItemDelegator adapterFactoryItemDelegator;
	private Composite detailsclient;
	private ArrayList<IItemPropertyDescriptor> detailPropertyDescriptors = null;
	private HashMap<String, StyledText> widgetlist = null;
	private Object input;
	
	
	public DetailSection(FormToolkit toolkit,
			AdapterFactoryItemDelegator adapterFactoryItemDelegator,
			Composite detailsclient, Object input,DsEditor editor) {
		this.toolkit = toolkit;
		this.adapterFactoryItemDelegator = adapterFactoryItemDelegator;
		this.detailsclient = detailsclient;
		this.input = input;
		
	}

	private void labelMaker(String s) {
		Label l = toolkit.createLabel(detailsclient, s, SWT.NONE);
		GridData gd = new GridData();
		l.setLayoutData(gd);
	}

	public void createSection(final Object input) {
		
		//boolean isProperty = isPropertyText(adapterFactoryItemDelegator.getText(input));
		
		if (input != null) {
			if (adapterFactoryItemDelegator.getPropertyDescriptors(input) != null) {

				detailPropertyDescriptors = (ArrayList<IItemPropertyDescriptor>) adapterFactoryItemDelegator
						.getPropertyDescriptors(input);
			}

			widgetlist = new HashMap<String, StyledText>();

			for (Iterator<IItemPropertyDescriptor> i = detailPropertyDescriptors.iterator(); i.hasNext();) {
				
				boolean isEditable = true;
				
				ItemPropertyDescriptor desc = (ItemPropertyDescriptor) i.next();

				String displayName = desc.getDisplayName(input);
				
				if((input instanceof ConfigurationProperty) && (displayName.equals("Name") || displayName.equals("name"))){
					
					isEditable = false;
				}
				if (desc.getFeature(input) instanceof EAttributeImpl) {

					EAttributeImpl attribute = (EAttributeImpl) desc
							.getFeature(input);

					Object eObject = ((EObject) adapterFactoryItemDelegator
							.getEditableValue(input))
							.eGet((EStructuralFeature) attribute);

					labelMaker(" ");
					labelMaker(" ");

					labelMaker(displayName);
					attributefieldMaker(eObject, desc,isEditable);
				}

				else if (desc.getFeature(input) instanceof EReferenceImpl) {
					/*
					if (((EObject) adapterFactoryItemDelegator
							.getEditableValue(input))
							.eGet((EStructuralFeature) desc.getFeature(input))
							.toString().compareTo("[]") == 0) {

					} else {
						labelMaker(((EObject) adapterFactoryItemDelegator
							.getEditableValue(input))
							.eGet((EStructuralFeature) desc.getFeature(input)).toString());
					}*/
				} else {
					labelMaker(desc.getFeature(input).toString()
							+ " ?: "
							+ ((EObject) adapterFactoryItemDelegator
									.getEditableValue(input))
									.eGet((EStructuralFeature) desc
											.getFeature(input))

					);
				}

			}
		} else {
			labelMaker("No data to show in the Detail section");
		}
		toolkit.paintBordersFor(detailsclient);

	}

	private void attributefieldMaker(Object dataType,final IItemPropertyDescriptor desc,boolean isEditable) {
		StyledText dtxt = null;
		String dString = "";

		if (dataType == null) {
			dataType = new String("");
		}

		if (dataType != null)
			dString = new String(dataType.toString());

		dtxt = new StyledText(detailsclient, SWT.NONE);		
		dtxt.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		addCommonActions(dtxt);
		dtxt.setEditable(isEditable);
		dtxt.setEnabled(isEditable);
		
		final ControlDecoration controlDecoration = crateControlDecoration(dtxt);
		controlDecoration.hide();
		toolkit.adapt(dtxt, true, true);
		dtxt.setText(dString);

		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = dString.length();
		styleRange.fontStyle = SWT.NORMAL;
		styleRange.foreground = detailsclient.getDisplay().getSystemColor(
				SWT.COLOR_BLACK);
		
		dtxt.setStyleRange(styleRange);
				
		GridData gd = new GridData();
		gd.widthHint = 200;
		dtxt.setLayoutData(gd);
		
		if(dataType instanceof String){
			
			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for(Iterator<IItemPropertyDescriptor> i = detailPropertyDescriptors.iterator();i.hasNext();){
						
						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) i.next();

						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for string property
							idesc.setPropertyValue(input,((StyledText) event.widget).getText());
							
						}
					}
				}
			});
			
			
		}else if(dataType instanceof Integer){
			
			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for (Iterator<IItemPropertyDescriptor> j = detailPropertyDescriptors.iterator(); j.hasNext();) {

						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) j.next();
						
						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for Integer property
							idesc.setPropertyValue(input,new Integer(Integer.parseInt(((StyledText) event.widget).getText())));
							
						}
					}
					
				}
			});
			
			
		}else if(dataType instanceof Boolean){
			
			
			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for (Iterator<IItemPropertyDescriptor> j = detailPropertyDescriptors.iterator(); j.hasNext();) {

						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) j.next();
						
						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for Boolean property
							idesc.setPropertyValue(input,new Boolean(((StyledText) event.widget).getText()));
							
						}
					}
					
				}
			});
			
				
		}else if(dataType instanceof Long ){
			
			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for (Iterator<IItemPropertyDescriptor> j = detailPropertyDescriptors.iterator(); j.hasNext();) {

						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) j.next();
						
						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for Long property
							String longNum = ((StyledText) event.widget).getText();
							
							if(isValidLongString(longNum)){
								
							idesc.setPropertyValue(input,new Long(longNum));
							controlDecoration.hide();
							
							}else{
							
							controlDecoration.setDescriptionText("Please enter valid long value");
							controlDecoration.show();
							}
						}
					}
					
				}
			});
		}else if(dataType instanceof Double){
			
			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for (Iterator<IItemPropertyDescriptor> j = detailPropertyDescriptors.iterator(); j.hasNext();) {

						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) j.next();
						
						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for Double property
							
							String doubleNum = ((StyledText) event.widget).getText();
							
							if(isValidDoubleString(doubleNum)){
								
								idesc.setPropertyValue(input,new Double(doubleNum));
								controlDecoration.hide();
							} else {
								
								controlDecoration.setDescriptionText("Please enter valid Double value");
								controlDecoration.show();
							}
							
						}
					}
					
				}
			});
		}else if(dataType instanceof BigInteger){

			dtxt.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent event) {
					
					for (Iterator<IItemPropertyDescriptor> j = detailPropertyDescriptors.iterator(); j.hasNext();) {

						IItemPropertyDescriptor idesc = (IItemPropertyDescriptor) j.next();
						
						if (idesc.getId(input).equals(desc.getId(input))) {
							// this works for UnsingedLong property
							
							String bigIntNum = ((StyledText) event.widget).getText();
							
							if(isValidBigIntString(bigIntNum)){
								
								idesc.setPropertyValue(input,new BigInteger(bigIntNum));
								controlDecoration.hide();
							} else {
								
								controlDecoration.setDescriptionText("Please enter valid UnsingedLong value");
								controlDecoration.show();
							}
							
						}
					}
					
				}
			});
		}
		
		widgetlist.put(desc.getId(input), dtxt);
	}
	
	private void addCommonActions(StyledText text){
		
		Listener keyBindListener = new Listener() {
			
			   public void handleEvent( Event event ) {
			      if ( event.stateMask == SWT.CTRL && event.keyCode == 'a') {
			    	  
			         ((StyledText)event.widget).selectAll();
			         
			      }else if(event.stateMask == SWT.CTRL && event.keyCode == 'c'){
			    	  
			    	  ((StyledText)event.widget).copy();
			    	  
			      }else if(event.stateMask == SWT.CTRL && event.keyCode == 'v'){
			    	  
			    	  ((StyledText)event.widget).paste();
			    	  
			      }else if(event.stateMask == SWT.CTRL && event.keyCode == 'x'){
			    	  
			    	  ((StyledText)event.widget).cut();
			      }
			   }
			};
			
			text.addListener(SWT.KeyUp, keyBindListener);
	}
	
	private boolean isValidBigIntString(String text){
		
		try{
			
			new BigInteger(text);
			
		}catch(NumberFormatException e){
			
			return false;
		}
		
		return true;
	}
	
	private boolean isValidLongString(String text){
		
		try{
			
			new Long(text);
			
		}catch (NumberFormatException  e) {
			
			return false;
		}
		
		return true;
	}
	
	private boolean isValidDoubleString(String text){
		
		try{
			
			new Double(text);
			
		}catch(NumberFormatException e){
			
			return false;
		}
		
		return true;
	}
	
	private ControlDecoration crateControlDecoration(StyledText dtxt){
		
		ControlDecoration controlDecoration = new ControlDecoration(dtxt, SWT.LEFT | SWT.TOP);
				
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
				
		controlDecoration.setImage(fieldDecoration.getImage());
		
		return controlDecoration;
	}
	

}
