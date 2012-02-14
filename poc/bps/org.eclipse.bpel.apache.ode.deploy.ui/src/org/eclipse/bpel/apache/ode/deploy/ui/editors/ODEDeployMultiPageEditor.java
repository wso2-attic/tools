/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation, University of Stuttgart (IAAS) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation, University of Stuttgart (IAAS) - initial API and implementation
 *******************************************************************************/

package org.eclipse.bpel.apache.ode.deploy.ui.editors;

import java.io.IOException;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.bpel.apache.ode.deploy.model.dd.DocumentRoot;
import org.eclipse.bpel.apache.ode.deploy.model.dd.ProcessType;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TDeployment;
import org.eclipse.bpel.apache.ode.deploy.model.dd.util.ddResourceFactoryImpl;
import org.eclipse.bpel.apache.ode.deploy.ui.pages.ProcessPage;
import org.eclipse.bpel.apache.ode.deploy.ui.util.DeployUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.MultiPageEditorSite;

/**
 * A multipage editor for Apache ODE deployment descriptors.
 * 
 * @author Tammo van Lessen (IAAS)
 * @author Simon Moser (IBM)
 */
public class ODEDeployMultiPageEditor extends FormEditor implements IEditingDomainProvider {
	
	protected TDeployment deployDescriptor = null;	
	
	protected AdapterFactoryEditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;

	
	/**
	 * Creates a multi-page editor example.
	 */
	public ODEDeployMultiPageEditor() {
		super();
		initializeEditingDomain();
	}
	
	/**
	 * Saves the deployment descriptor
	 */
	public void doSave(IProgressMonitor monitor) {
		commitPages(true);
		saveDeploymentDescriptor();
		((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
		this.editorDirtyStateChanged();
	}
	
	/**
	 * SaveAs is not supported.
	 */
	public void doSaveAs() {
		throw new UnsupportedOperationException("SaveAs is not allowed."); //$NON-NLS-1$
	}
	
	/**
	 * The implementation of this method checks that the input is an 
	 * instance of <code>IFileEditorInput</code> and creates the data model.
	 */
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		setPartName(editorInput.getName());
		
		if (!(editorInput instanceof IFileEditorInput)) {
			throw new PartInitException("Invalid Input: Must be IFileEditorInput"); //$NON-NLS-1$
		}
		
		createModel();
	}

	public boolean isSaveAsAllowed() {
		return false;
	}

	public void saveDeploymentDescriptor() {
		try {
			deployDescriptor.eResource().save(null);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	protected org.eclipse.bpel.model.Process loadBPEL(IFile bpelFile) {
		IPath fullProcessPath = bpelFile.getFullPath();
		URI uri = URI.createPlatformResourceURI(fullProcessPath.toString(), false);
		Resource bpelResource = editingDomain.getResourceSet().getResource(uri, true);

		try {
			bpelResource.load(Collections.EMPTY_MAP);
			EList<EObject> contents = bpelResource.getContents();
			if (!contents.isEmpty()) {
				return (org.eclipse.bpel.model.Process) contents.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	protected void addPages() {		
		try {
			for (ProcessType pt : deployDescriptor.getProcess()) {
				addPage(new ProcessPage(this, pt));
			}
		} 
		catch (PartInitException e) {
			// ~
		}
	}
	
	public TDeployment getDeploymentModel(){
		return deployDescriptor;
	}

	protected void initializeEditingDomain() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// Create the command stack that will notify this editor as commands are executed.
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  editorDirtyStateChanged();
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}
	
	public void setFocus() {
		if (getActivePage() != -1 && getControl(getActivePage()) != null) {
			getControl(getActivePage()).setFocus();
		}
	}
	
	protected void createModel() throws PartInitException {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Resource resource = null;

		ddResourceFactoryImpl fac = new ddResourceFactoryImpl();
		resource = fac.createResource(resourceURI);
		editingDomain.getResourceSet().getResources().add(resource);
		try {
			resource.load(Collections.EMPTY_MAP);
			
			EList<EObject> contents = resource.getContents();
			if (!contents.isEmpty() && contents.get(0) instanceof DocumentRoot) {
				deployDescriptor = ((DocumentRoot) contents.get(0)).getDeploy();
				
				populateModel();
				
				//TODO: what to do with processtypes in DD without a corresponding BPEL file available?
			}
		} catch (CoreException e) {
			throw new PartInitException(e.getStatus());
		} catch (IOException e) {
			throw new PartInitException(e.getMessage(), e);
		}
	}

	public void populateModel() throws CoreException {
		((IFileEditorInput)getEditorInput()).getFile().getProject().accept(new IResourceVisitor() {
			public boolean visit(IResource bpelfile) throws CoreException {
				if (bpelfile.getType() == IResource.FILE
						&& bpelfile.getFileExtension().equalsIgnoreCase("bpel")) { //$NON-NLS-1$
					org.eclipse.bpel.model.Process p = DeployUtils.loadBPEL((IFile)bpelfile, editingDomain.getResourceSet());
					if (p != null) {
						// add process to DD unless it it not already there.
						ProcessType pt = DeployUtils.findProcessTypeInDD(p, deployDescriptor); 
						if (pt == null) {
							pt = DeployUtils.createProcessStub(p);
							deployDescriptor.getProcess().add(pt);
						}
						// set model
						pt.setModel(p);
						
					}
				}
				return true;
			}
		});
	}

}
