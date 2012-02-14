package org.eclipse.bpel.validator;

/**
 * Java JDK dependencies 
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel.model.Import;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELResourceSetImpl;
import org.eclipse.bpel.validator.factory.AdapterFactory;
import org.eclipse.bpel.validator.helpers.ModelQueryImpl;
import org.eclipse.bpel.validator.model.INode;
import org.eclipse.bpel.validator.model.IProblem;
import org.eclipse.bpel.validator.model.Messages;
import org.eclipse.bpel.validator.model.Runner;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.WSDLElement;
import org.w3c.dom.Element;


/**
 * A builder which is invoked to build (in this case validate), the BPEL files
 * in the projects in which the builder is installed.
 * 
 * @author Michal Chmielewski (michal.chmielewski@oracle.com)
 * @date Sep 19, 2006
 *
 */

@SuppressWarnings("nls")
public class Builder extends IncrementalProjectBuilder {

	Date created = new Date();
	
	boolean bDebug = false;
	
	/** Empty problems list */
	IProblem[] EMPTY_PROBLEMS = {};
	
	/** The adapter manager for the platform */
	IAdapterManager fAdapterManager = Platform.getAdapterManager();		

	BPELResourceSetImpl fResourceSet = new BPELResourceSetImpl();
	
	BPELReader fReader = new BPELReader();
	
		 
	/**
	 * Create brand new shiny BPEL Builder.
	 */
	
	public Builder() {
		p("Created on " + created);
	}
    
	/** (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		super.setInitializationData(config, propertyName, data);	
	}

	


	@SuppressWarnings("unchecked")
	
	protected IProject[] build (int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		
		
		long started = System.currentTimeMillis();
		if (args != null) {
			bDebug = toBoolean(args.get("debug"),false);
		}
		
		AdapterFactory.DEBUG = bDebug;
		if (bDebug) {
			p("Clear error messages from the cache ... (will re-load)");
			Messages.clear();			
		} 

		IProject myProject = this.getProject();
		IResourceDelta resourceDelta = this.getDelta(myProject);
		
		if (resourceDelta == null) {
						
			// Now find all the BPEL files in the project and validate them
			validate ( myProject, monitor );
			
		} else {
						
			processDeltas(resourceDelta.getAffectedChildren( IResourceDelta.CHANGED ), monitor );
			
		}
				
		long ended = System.currentTimeMillis();
		p(" Validation Ended " + (ended-started) + "ms");
		return new IProject[] { myProject };
	}
	
	
	
	void processDeltas ( IResourceDelta [] deltas , IProgressMonitor monitor ) throws CoreException {
		
		for(IResourceDelta delta : deltas) {			
			processDeltas( delta.getAffectedChildren(IResourceDelta.CHANGED, IResource.FILE), monitor );			
			IResource resource = delta.getResource();
			if (resource.getType () != IResource.FILE) {
				continue;
			}
			
//			 * @see IResourceDelta#CONTENT
//			 * @see IResourceDelta#DESCRIPTION
//			 * @see IResourceDelta#ENCODING
//			 * @see IResourceDelta#OPEN
//			 * @see IResourceDelta#MOVED_TO
//			 * @see IResourceDelta#MOVED_FROM
//			 * @see IResourceDelta#TYPE
//			 * @see IResourceDelta#SYNC
//			 * @see IResourceDelta#MARKERS
//			 * @see IResourceDelta#REPLACED
			 
			if ((delta.getFlags() & IResourceDelta.CONTENT) != IResourceDelta.CONTENT ) {
				continue;
			}
			
			validate ( resource, monitor );					
		}		
	}

	
	/**
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#clean(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected void clean (IProgressMonitor monitor) throws CoreException {
		
	}

	/**
	 * Validate the resource using the monitor passed.
	 * 
	 * @param resource (File or Folder)
	 * @param monitor the monitor to use.
	 * @throws CoreException
	 */
	
	@SuppressWarnings("unchecked")
	public void validate (IResource resource, IProgressMonitor monitor) throws CoreException {
		
		switch (resource.getType()) {
		
		case IResource.FOLDER :
			IFolder folder = (IFolder) resource;			
			for(IResource next :  folder.members() ) {
				validate (next,monitor);
			}			
			break;
			
		case IResource.FILE :			
			IFile file = (IFile) resource;
									
			p("File Resource : " + file.getName() );
			 
			// TODO: This should be a better check
			if (file.getName().endsWith(".bpel")) {
				file.deleteMarkers(IBPELMarker.ID, true,
						IResource.DEPTH_INFINITE);
				deleteMarkersInReferencialResources(file);
				makeMarkers(validate(file, monitor));
			}
			break;

		case IResource.PROJECT:
			for (IFile bpelFile : getBPELFilesByProject((IProject) resource)) {
				p("File Resource : " + bpelFile.getName());

				bpelFile.deleteMarkers(IBPELMarker.ID, true,
						IResource.DEPTH_INFINITE);
				deleteMarkersInReferencialResources(bpelFile);
				makeMarkers(validate(bpelFile, monitor));
			}
		}
	}
	
	
	/**
	 * @param file
	 * @param monitor
	 * @return return the list of problems found 
	 */
	
	@SuppressWarnings("unchecked")
	public IProblem[] validate (IFile file, IProgressMonitor monitor  ) {
		
		
		p("Validating BPEL Resource : " + file.getName() );
				
		// Step 1. Read the BPEL process using the Model API.
				
		fResourceSet.resourceChanged(file);
		fReader.read( file, fResourceSet );
		Process process = fReader.getProcess();
		
		if (process == null) {
			p ("Cannot read BPEL Process !!!");
			return EMPTY_PROBLEMS ;
		}
		
		p("Read in BPEL Model OK" );
		
		// Step 2. Preparation for the validator.
		linkModels ( process );
		p("Models Linked" );		
		
		// Process as INode 
		INode node = (INode) fAdapterManager.getAdapter( process.getElement(), INode.class );
		
		// Debug: Dump the dom from the reader, just to see what we have 
		// p( org.eclipse.bpel.model.util.BPELUtils.elementToString(process.getElement())); 
		
		// Step 4. Run the validator.
		
		IProblem[] problemList = new Runner (ModelQueryImpl.getModelQuery(), node ).run();
		p("Validator Executed" );
		return problemList;	
	}

	
	
	/**
	 * @param problemList
	 */
	public void makeMarkers ( IProblem [] problemList ) {

		if (problemList.length < 1) {
			return ;
		}

		// Step 5. Adapt problems to markers.		
		for(IProblem problem : problemList) {
			fAdapterManager.getAdapter(problem, IMarker.class);			
		}
		
		p( "Markers Created " );
		p( " ------ Done" );
		
		// done.
	}
	
	
	
	void linkModels ( EObject process ) {
		
		// 
		// Each extensible element points to the DOM element that 
		// comprises it. This is done in the BPEL reader as well as
		// the WSDL readers. Here we add a pointer to the 
		// emf objects from the DOM objects.
	
		Iterator<?> emfIterator = process.eAllContents();
		while (emfIterator.hasNext()) {
			Object obj = emfIterator.next();
			// This is because only WSDLElement has a reference to
			// a DOM element.
			if (obj instanceof WSDLElement) {
				WSDLElement wsdle = (WSDLElement) obj;
				Element el = wsdle.getElement();
				if (el != null) {
					el.setUserData("emf.model", obj, null); //$NON-NLS-1$
				}
			}
		}
	}
	
	
	@SuppressWarnings("boxing")	
	boolean toBoolean ( Object obj , boolean def) {
		if (obj instanceof String) {
			return new Boolean((String)obj);			
		}
		return def;
	}
	
	
		
	void p (String msg ) {
		if (bDebug) {
			System.out.printf( "[%1$s]>> %2$s\n", getClass().getName(), msg);
			System.out.flush();
		}
	}

	private List<IFile> getBPELFilesByProject(IProject project) {

		final List<IFile> bpelFolders = new ArrayList<IFile>();
		IResourceVisitor bpelFolderFinder = new IResourceVisitor() {

			public boolean visit(IResource resource) throws CoreException {
				if (resource.getType() == IResource.FILE) {
					if ("bpel".equals(resource.getFileExtension())) {
						bpelFolders.add((IFile) resource);
						return false;
					}
				}
				return true;
			}
		};
		try {
			project.accept(bpelFolderFinder);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return bpelFolders;
	}

	private void deleteMarkersInReferencialResources(IFile bpelFile)
			throws CoreException {

		fResourceSet.resourceChanged(bpelFile);
		fReader.read(bpelFile, fResourceSet);
		Process process = fReader.getProcess();

		p("Delete markers");

		IContainer container = bpelFile.getParent();
		for (Import impt : process.getImports()) {
			String fileLocation = impt.getLocation();
			IFile importedFile = container.getFile(new Path(fileLocation));
			if (importedFile != null && importedFile.exists()) {
				importedFile.deleteMarkers(IBPELMarker.ID, false,
						IResource.DEPTH_ZERO);
			}
		}

	}

	public void clearCach() {
		fResourceSet.getResources().clear();
	}
}
