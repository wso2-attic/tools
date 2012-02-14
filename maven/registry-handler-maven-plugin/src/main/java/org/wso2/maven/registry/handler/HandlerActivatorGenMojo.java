package org.wso2.maven.registry.handler;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.PluginManager;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.wso2.maven.registry.handler.model.BundleManifest;
import org.wso2.maven.registry.handler.model.BundleManifest.ManifestHeader;
import org.wso2.maven.registry.handler.utils.ClassUtils;
import org.wso2.maven.registry.handler.utils.FileManagementUtils;
import org.wso2.maven.registry.handler.utils.MojoExecutor;
import org.wso2.maven.registry.handler.utils.RegistryHandlerUtils;
import org.wso2.maven.registry.handler.utils.MojoExecutor.Element;
import org.wso2.maven.registry.handler.utils.MojoExecutor.ExecutionEnvironment;

/**
 * Write environment information for the current build to file.
 * 
 * @goal activator-gen
 * @phase compile
 */
public class HandlerActivatorGenMojo extends AbstractMojo {

	/**
	 * Handler Artifact Name/Symbolic Name of the bundle being created
	 * 
	 * @parameter
	 * @required
	 */
	private String handlerName;
	
	/**
	 * Handler Artifact version/Bundle version of the bundle being created
	 * 
	 * @parameter
	 * @required
	 */
	private String handlerVersion;
	
	/**
	 * Fully qualified class name of the Filter Class
	 * 
	 * @parameter
	 * @required
	 */
	private String filterClassName;

	/**
	 * Fully qualified class name of the Handler Class
	 * 
	 * @parameter
	 * @required
	 */
	private String handlerClassName;

	/**
	 * Overriden Filter class methods
	 * 
	 * @parameter
	 * @required
	 */
	private List<String> methods;

	/**
	 * Initializing the filter object
	 * 
	 * @parameter
	 * 
	 */
	private Map<String, String> filterInitializeValues;

	/**
	 * @parameter default-value="${project}"
	 */
	private MavenProject project;

	/**
	 * @parameter default-value=
	 *            "org.wso2.carbon.registry.handler.internal.invoker.Activator"
	 */
	private String activatorClassName;

	private File TARGET;
    /**
     * Maven ProjectHelper.
     *
     * @component role="org.apache.maven.plugin.PluginManager"
     */
    private PluginManager pluginManager;

    /**
     * The Maven Session Object
     *
     * @parameter expression="${session}"
     * @required
     * @readonly
     */
     protected MavenSession session; 
    
	public void execute() throws MojoExecutionException, MojoFailureException {
		try {
			File sourceCodeGenLocation = getSourceCodeGenLocation();
			File packagedPathForClass = getActivatorPathForActivatorClass(sourceCodeGenLocation);
			String activatorContent = getActivatorContent();
			FileManagementUtils.writeContent(packagedPathForClass,
					activatorContent);
			project.addCompileSourceRoot(sourceCodeGenLocation
					.getAbsolutePath());
			a();
		} catch (IOException e) {
			throw new MojoExecutionException(e.getMessage(), e);
		}
	}

	private void a() throws MojoExecutionException {
		System.out.println(session);
		ExecutionEnvironment executionEnvironment = MojoExecutor.executionEnvironment(project, session, pluginManager);
		
		Plugin plugin = MojoExecutor.plugin("org.apache.maven.plugins", "maven-antrun-plugin","1.1");
		String goal = MojoExecutor.goal("run");
		Element echoElement = MojoExecutor.element("echo");
		echoElement.addAttributes(MojoExecutor.elementAttribute("message", "hello world"));
		Element element = MojoExecutor.element("tasks",echoElement);
		Xpp3Dom configuration = MojoExecutor.configuration(element);
		
		try {
			MojoExecutor.executeMojo(plugin, goal, configuration, executionEnvironment);
			
			BundleManifest bundleManifest = new BundleManifest();
			bundleManifest.setBundleSymbolicName(getHandlerName());
			bundleManifest.setBundleName(getHandlerName());
			bundleManifest.setBundleDescription(getHandlerName());
			bundleManifest.setBundleVersion(getHandlerVersion());
			bundleManifest.setBundleActivatorName(getActivatorClassName());
			bundleManifest.setDynamicImports(true);
			String[] imports=new String[]{"org.wso2.carbon.registry.core.jdbc.handlers",
					"org.wso2.carbon.registry.core.exceptions",
					"org.wso2.carbon.registry.core.jdbc.handlers",
					"org.wso2.carbon.registry.core.jdbc.handlers.filters",
					"org.wso2.carbon.registry.core.config"};
			for (String importPackage : imports) {
				bundleManifest.getImportPackagesList().add(importPackage);	
			}
			String[] exports=new String[]{getPackageName(getHandlerClassName()),
					getPackageName(getFilterClassName())};
			for (String export : exports) {
				bundleManifest.getExportPackagesList().add(export);
			}
			
			plugin = MojoExecutor.plugin("org.apache.felix", "maven-bundle-plugin","1.4.0");
			goal = MojoExecutor.goal("bundle");
			echoElement = MojoExecutor.element("echo");
			echoElement.addAttributes(MojoExecutor.elementAttribute("message", "hello world"));
			element = MojoExecutor.element("instructions");
			List<ManifestHeader> manifestHeaders = bundleManifest.getManifestHeaders();
			List<Element> ele=new ArrayList<Element>();
			for (ManifestHeader manifestHeader : manifestHeaders) {
				ele.add(MojoExecutor.element(manifestHeader.getHeaderName(), manifestHeader.getHeaderValue()));
			}			
			element.addChildren(ele.toArray(new Element[]{}));
			configuration = MojoExecutor.configuration(element);

			MojoExecutor.executeMojo(plugin, goal, configuration, executionEnvironment);

			
		} catch (MojoExecutionException e) {
			// TODO Auto-generated catch block
			throw new MojoExecutionException(e.getMessage(),e);
		}
		
//		MavenSession session = createMavenSession( project );
//				
//		         String goal = "process";
//		         
//		         Plugin plugin = new Plugin();
//		         
//		         plugin.setGroupId( "org.apache.maven.plugins" );
//		         plugin.setArtifactId( "maven-remote-resources-plugin" );
//		         plugin.setVersion( "1.0-beta-2" );
//		         
//		         MojoDescriptor mojoDescriptor = pluginManager.getMojoDescriptor( plugin, goal, session.getCurrentProject(), session.getLocalRepository() );        
//		         assertPluginDescriptor( mojoDescriptor, "org.apache.maven.plugins", "maven-remote-resources-plugin", "1.0-beta-2" );
//		         MojoExecution mojoExecution = new MojoExecution( mojoDescriptor );
//		         pluginManager.executeMojo( session, mojoExecution );

		
	}

	private String getActivatorContent() throws IOException {
		URL resource = getClass().getResource("/templates/Activator.java");
		String contentAsString;
		contentAsString = FileManagementUtils.getContentAsString(resource);
		String activatorContent = getActivatorContent(contentAsString);
		return activatorContent;
	}

	private String getActivatorContent(String templateString)
			throws IOException {
		String handlerFileContent = MessageFormat.format(templateString,
				new Object[] { getHandlerClassName(),
						ClassUtils.getClassName(getHandlerClassName()),
						getFilterClassName(),
						ClassUtils.getClassName(getFilterClassName()),
						RegistryHandlerUtils.filterMethodList(getMethods()),
						getFilterObjectInitializeMethods(), "{", "}", getActivatorClassName() });

		return handlerFileContent;
	}

	private File getActivatorPathForActivatorClass(File sourceCodeGenLocation) {
		String[] packagePaths = getPackageName(getActivatorClassName()).split("\\.");
		File packagedPath = sourceCodeGenLocation;
		for (String packagePath:packagePaths) {
			if (!packagePath.trim().equalsIgnoreCase("")) {
				packagedPath = new File(packagedPath, packagePath);
			}
		}
		packagedPath = new File(packagedPath,getClassName(getActivatorClassName()) + ".java");
		return packagedPath;
	}
	
	private String getClassName(String fullyQualifiedClassName){
		String[] split = fullyQualifiedClassName.split("\\.");
		return split[split.length-1];
	}

	private String getPackageName(String fullyQualifiedClassName){
		String className = getClassName(fullyQualifiedClassName);
		if (fullyQualifiedClassName.length()==className.length()){
			return "";
		}else{
			return fullyQualifiedClassName.substring(0,fullyQualifiedClassName.length()-className.length()-1);
		}
	}
	
	private File getSourceCodeGenLocation() {
		TARGET = new File(project.getBasedir(), "target");
		File GENERATED_SRC = new File(TARGET, "generated-src");
		File handlerSRC = new File(GENERATED_SRC, "handler-src");
		return handlerSRC;
	}

	public void setFilterClassName(String filterClassName) {
		this.filterClassName = filterClassName;
	}

	public String getFilterClassName() {
		return filterClassName;
	}

	public void setHandlerClassName(String handlerClassName) {
		this.handlerClassName = handlerClassName;
	}

	public String getHandlerClassName() {
		return handlerClassName;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setFilterInitializeValues(
			Map<String, String> filterInitializeValues) {
		this.filterInitializeValues = filterInitializeValues;
	}

	public Map<String, String> getFilterInitializeValues() {
		if (filterInitializeValues==null){
			filterInitializeValues=new HashMap<String, String>();
		}
		return filterInitializeValues;
	}

	public void setActivatorClassName(String activatorClassName) {
		this.activatorClassName = activatorClassName;
	}

	public String getActivatorClassName() {
		return activatorClassName;
	}
	private String getFilterObjectInitializeMethods(){
		Map<String, String> filterInitializeValues = getFilterInitializeValues();
		String result="";
		for (String methodName : filterInitializeValues.keySet()) {
			result=result+"\n		"+"filter.set"+methodName.substring(0,1).toUpperCase()+methodName.substring(1)+"(\""+this.filterInitializeValues.get(methodName)+"\");";
		}
		return result;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerVersion(String handlerVersion) {
		this.handlerVersion = handlerVersion;
	}

	public String getHandlerVersion() {
		return handlerVersion;
	}
}
