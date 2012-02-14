package org.wso2.carbonstudio.eclipse.esb.presentation.ui;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.esb.core.EsbConfigurationManager;
import org.wso2.carbonstudio.eclipse.greg.core.RegistryManager;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProviderData;


public class CarbonStudioElementProviderDialog extends Dialog {
	private Class<?>[] type;
	private TreeViewer treeViewer;
	private String selectedPath = null;
	private Button chkOpenResource;
	private static ICarbonStudioLog log = Logger.getLog("org.wso2.carbonstudio.eclipse.esb.editor");
	private Map<String, List<String>> filters;
	
	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public CarbonStudioElementProviderDialog(Shell parentShell, Class<?>[] type, Map<String, List<String>> filters) {
		super(parentShell);
		setType(type);
		setFilters(filters);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		treeViewer = new TreeViewer(container, SWT.BORDER);
		Tree treeResrouceProviders = treeViewer.getTree();
		treeResrouceProviders.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateSelectedElement();
				updateOKButtonStatus();
			}
		});
		treeResrouceProviders.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 1, 1));

		chkOpenResource = new Button(container, SWT.CHECK);
		chkOpenResource.setText("Open the resource for editing");
		treeViewer.setContentProvider(new ITreeContentProvider() {
			public Object[] getChildren(Object o) {
				List<Object> list = new ArrayList<Object>();
				if (o instanceof ICarbonStudioProviderData[]) {
					ICarbonStudioProviderData[] oo = (ICarbonStudioProviderData[]) o;
					for (ICarbonStudioProviderData data : oo) {
						ICarbonStudioProvider provider = data
								.getProvider();
						if (isChildElementsPresent(provider)) {
							list.add(data);
						}
					}
				} else if (o instanceof ICarbonStudioProvider
						|| o instanceof ICarbonStudioProviderData) {
					ICarbonStudioProvider provider = o instanceof ICarbonStudioProvider ? (ICarbonStudioProvider) o
							: ((ICarbonStudioProviderData) o)
									.getProvider();
					ICarbonStudioElement[] resources = provider.getElements(getFilters());
					if (resources != null) {
						list.addAll(Arrays.asList(resources));
					}
					ICarbonStudioProvider[] categories = provider.getCategories(getFilters());
					if (categories != null) {
						list.addAll(Arrays.asList(categories));
					}
				} else if (o instanceof ICarbonStudioElement) {
					ICarbonStudioElement element = (ICarbonStudioElement) o;
					list.addAll(Arrays.asList(element.getChildren(getFilters())));
				}
				return list.toArray();
			}

			private boolean isChildElementsPresent(
					ICarbonStudioProvider provider) {
				ICarbonStudioElement[] resources = provider.getElements(getFilters());
				ICarbonStudioProvider[] categories = provider.getCategories(getFilters());
				return (resources != null && resources.length > 0)
						|| (categories != null && categories.length > 0);
			}

			public Object getParent(Object arg0) {
				return null;
			}

			public boolean hasChildren(Object o) {
				if (o instanceof ICarbonStudioProviderData[]) {
					return ((ICarbonStudioProviderData[]) o).length > 0;
				} else if (o instanceof ICarbonStudioProviderData) {
					ICarbonStudioProviderData provider = (ICarbonStudioProviderData) o;
					return isChildElementsPresent(provider
							.getProvider());
				} else if (o instanceof ICarbonStudioProvider) {
					ICarbonStudioProvider provider = (ICarbonStudioProvider) o;
					return isChildElementsPresent(provider);
				} else if (o instanceof ICarbonStudioElement) {
					ICarbonStudioElement element = (ICarbonStudioElement) o;
					return element.hasChildren(getFilters());
				}
				return false;
			}

			public Object[] getElements(Object o) {
				return getChildren(o);
			}

			public void dispose() {
				// TODO Auto-generated method stub
			}

			public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
				// TODO Auto-generated method stub
			}
		});
		treeViewer.setLabelProvider(new ILabelProvider() {
			public Image getImage(Object o) {
				if (o instanceof ICarbonStudioProviderData) {
					ICarbonStudioProviderData oo = (ICarbonStudioProviderData) o;
					if (oo.getProvider().getIcon() != null) {
						return oo.getProvider().getIcon().createImage();
					}
				} else if (o instanceof ICarbonStudioProvider) {
					ICarbonStudioProvider provider = (ICarbonStudioProvider) o;
					if (provider.getIcon() != null) {
						return provider.getIcon().createImage();
					}
				} else if (o instanceof ICarbonStudioElement) {
					ICarbonStudioElement resource = (ICarbonStudioElement) o;
					if (resource.getIcon() != null) {
						return resource.getIcon().createImage();
					}
				}
				return null;
			}

			public String getText(Object o) {
				if (o instanceof ICarbonStudioProviderData) {
					ICarbonStudioProviderData oo = (ICarbonStudioProviderData) o;
					return oo.getName();
				} else if (o instanceof ICarbonStudioProvider) {
					ICarbonStudioProvider provider = (ICarbonStudioProvider) o;
					return provider.getText();
				} else if (o instanceof ICarbonStudioElement) {
					ICarbonStudioElement resource = (ICarbonStudioElement) o;
					return resource.getText();
				}
				return null;
			}

			public void addListener(ILabelProviderListener arg0) {
			}

			public void dispose() {

			}

			public boolean isLabelProperty(Object arg0, String arg1) {
				return false;
			}

			public void removeListener(ILabelProviderListener arg0) {

			}

		});
		List<Object> list=new ArrayList<Object>();
		list.addAll(Arrays.asList(RegistryManager.getResourceProviders(true)));
		list.addAll(Arrays.asList(EsbConfigurationManager.getEndpointProviders(true)));
		list.addAll(Arrays.asList(EsbConfigurationManager.getSequenceProviders(true)));
		list.addAll(Arrays.asList(EsbConfigurationManager.getLocalEntryProviders(true)));
		treeViewer.setInput(list.toArray(new ICarbonStudioProviderData[]{}));

		return container;
	}

	private void updateOKButtonStatus() {
		Object firstElement = getSelectedElement();
		boolean okButtonEnabled = firstElement==null? false:isContainsClass(firstElement,getType());
		getButton(IDialogConstants.OK_ID).setEnabled(okButtonEnabled);
	}

	private boolean isContainsClass(Object objectToTest, Class<?>[] classes){
		for (Class<?> class1 : classes) {
			try {
				class1.cast(objectToTest);
				return true;
			} catch (Exception e) {
				//not an instace of
			} 
		}
		return false;
	}
	
	protected void okPressed() {
		if (chkOpenResource.getSelection()) {
			Object selectedElement = getSelectedElement();
			ICarbonStudioElement resource = (ICarbonStudioElement) selectedElement;

			try {
				if (resource.getSource() instanceof IFile) {
					IDE.openEditor(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage(),
							(IFile) resource.getSource());
				} else if (resource.getSource() instanceof File
						&& ((File) resource.getSource()).isFile()) {
					IFileStore fileStore = EFS.getLocalFileSystem().getStore(((File)resource.getSource()).toURI());
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IDE.openEditorOnFileStore(page, fileStore);
				}
			} catch (PartInitException e) {
				log.error("Error opening the resource file",e);
			}

		}
		super.okPressed();
	}

	private Object getSelectedElement() {
		return ((ITreeSelection) treeViewer.getSelection()).getFirstElement();
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		updateOKButtonStatus();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	protected Point getInitialSize() {
		return new Point(464, 335);
	}

	public void setType(Class<?>[] type) {
		this.type = type;
	}

	public Class<?>[] getType() {
		return type;
	}

	public void setSelectedPath(String selectedPath) {
		this.selectedPath = selectedPath;
	}

	public String getSelectedPath() {
		return selectedPath;
	}

	private void updateSelectedElement() {
		Object selectedElement = getSelectedElement();
		if (selectedElement instanceof ICarbonStudioElement) {
			setSelectedPath(((ICarbonStudioElement) selectedElement).getKey());
		} else {
			setSelectedPath(null);
		}
	}

	public void setFilters(Map<String, List<String>> filters) {
		this.filters = filters;
	}

	public Map<String, List<String>> getFilters() {
		return filters;
	}

}
