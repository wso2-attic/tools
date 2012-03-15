package org.wso2.carbonstudio.eclipse.greg.base.ui.util;

import java.util.List;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryResourceNode;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryURLInfo;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryUrlStore;
import org.wso2.carbonstudio.eclipse.greg.base.ui.dialog.RegistryTreeBrowserDialog;
import org.wso2.carbonstudio.eclipse.platform.ui.interfaces.IFieldControlData;
import org.wso2.carbonstudio.eclipse.platform.ui.interfaces.IOnAction;
import org.wso2.carbonstudio.eclipse.platform.ui.interfaces.UIControl;
import org.wso2.carbonstudio.eclipse.platform.ui.utils.WSO2UIToolkit;


public class RegistryBrowserUIControl implements UIControl {

	
	private static RegistryResourceNode selectedRegistryResourceNode = null;
	Label regLabel; 
	Button btnRegBrowse; 
	
	public IFieldControlData createUIField(String id, Composite container, int columns,
			Integer verticalIndent, Integer horizontalIndent,
			boolean isTextReadonly,
			final Shell shell,
			final String label, 
			String fileButtonCaption,
			int selectedOption) {
		if (id.equals("registry.browser")){
			regLabel = new Label(container, SWT.None);
			regLabel.setText(label);
			GridData gridData = new GridData();
			if (verticalIndent != null) {
				gridData.verticalIndent = verticalIndent;
			}
			if (horizontalIndent != null) {
				gridData.horizontalIndent = horizontalIndent;
			}
			regLabel.setLayoutData(gridData);
			
			final Text txtValue = new Text(container, SWT.BORDER);
			txtValue.setEditable(!isTextReadonly);
			if (columns != -1) {
				gridData = new GridData();
				gridData.horizontalSpan = columns - 3;
				gridData.grabExcessHorizontalSpace = true;
				gridData.horizontalAlignment = SWT.FILL;
				txtValue.setLayoutData(gridData);
			}
			
			IFieldControlData regControlData =
		        addRegistryBrowseButton(container, shell, label, fileButtonCaption, txtValue,selectedOption);
			return regControlData;
		}
		return null;
	}
	
	public IFieldControlData addRegistryBrowseButton(Composite container,
			final Shell shell, String label, String buttonCaption, final Text txtValue,
			final int selectedOption) {
//		RegistryResourceNode selectedRegistryResourceNode = null;
		btnRegBrowse = new Button(container, SWT.None);
		btnRegBrowse.setText(buttonCaption);
		btnRegBrowse.addSelectionListener(new SelectionListener() {
			
			public void widgetDefaultSelected(SelectionEvent event) {
				RegistryTreeBrowserDialog r = new RegistryTreeBrowserDialog(shell,selectedOption);
				r.create();
				List<RegistryURLInfo> allRegistryUrls = RegistryUrlStore.getInstance().getAllRegistryUrls();
				for (RegistryURLInfo registryURLInfo : allRegistryUrls) {
					r.addRegistryNode(registryURLInfo, null);
				}
				if(r.open() == Window.OK){
					if(r.getViewer()!=null){
						switch (selectedOption & r.getViewer().getSelectionState()) {
							case RegistryTreeBrowserDialog.SELECT_REGISTRY_PATH:
								selectedRegistryResourceNode = r.getSelectedRegistryResourceNode();
								break;
							case RegistryTreeBrowserDialog.SELECT_REGISTRY_RESOURCE:
							default:
								selectedRegistryResourceNode = r.getSelectedRegistryResourceNodeResource();
								break;
						}
						if(selectedRegistryResourceNode!=null){
							txtValue.setData(selectedRegistryResourceNode);
							txtValue.setText(selectedRegistryResourceNode.getRegistryResourcePath());
						}	
					}
				}
			}

			
			public void widgetSelected(SelectionEvent event) {
				widgetDefaultSelected(event);
			}
		});
		RegistryFieldControlData regFiledControlData = new RegistryFieldControlData(txtValue);
//		regFiledControlData.setSelectedRegistryNode(selectedRegistryResourceNode);
		WSO2UIToolkit.propagateControlStatus(txtValue,regLabel,btnRegBrowse);
		return regFiledControlData;
	}

	private static class RegistryFieldControlData implements IFieldControlData{
		//private RegistryResourceNode selectedRegistryNode;
		private Control control;
		private IOnAction onAction;
		
		public Object getData() {
			return  getControl().getData();
		}

		
		public void setData(Object data) {
			if (data!=null){
				if(data instanceof RegistryResourceNode){
					((Text) getControl()).setText(((RegistryResourceNode)data).getRegistryResourcePath());
					getControl().setData(data);
				} else{
					((Text) getControl()).setText("");
				}
			} else{
				((Text) getControl()).setText("");
			}
		}

		
		public Control getControl() {
			return this.control;
		}
		
		
		public IOnAction getOnAction(){
			return onAction;
		}

		
		public void setOnAction(IOnAction action) {
			this.onAction = action;
			Text ctrl = (Text) getControl();
			ctrl.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent evt) {
					getOnAction().onModifyAction();
				}
			});
			ctrl.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					getControl().setData(null);
					//FIXME
				    super.keyReleased(e);
				}
			});

		}
		
		public RegistryFieldControlData(Control control){
			this.control = control;
		} 
		
//		public RegistryFieldControlData(Control control, RegistryResourceNode selectedRegistryNode){
//			this.control = control;
//			this.selectedRegistryNode = selectedRegistryNode;
//		} 

//		public void setSelectedRegistryNode(RegistryResourceNode selectedRegistryNode) {
//			this.selectedRegistryNode = selectedRegistryNode;
//		}
//
//		public RegistryResourceNode getSelectedRegistryNode() {
//			return selectedRegistryNode;
//		}
		
	}
}

