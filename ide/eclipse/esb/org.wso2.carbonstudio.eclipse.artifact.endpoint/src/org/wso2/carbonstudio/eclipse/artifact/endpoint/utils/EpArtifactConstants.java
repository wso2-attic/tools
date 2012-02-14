package org.wso2.carbonstudio.eclipse.artifact.endpoint.utils;

import org.eclipse.osgi.util.NLS;

public class EpArtifactConstants extends NLS{
	public static final String BUNDLE_NAME = "org.wso2.carbonstudio.eclipse.artifact.endpoint.utils.epartifactconstants";
	public static  String EP_WIZARD_WINDOW_TITLE;
	public static  String ADDRESS_EP;
	public static  String WSDL_EP;
	public static  String DEFAULT_EP;
	public static  String FAIL_OVER_EP;
	public static  String LOAD_BALANCE_EP;
	public static  String TEMPLATE_EP;
	public static  String ESB_PROJECT_NATURE;
	
	//project wizard page properties
	public static String WIZARD_OPTION_EP_TYPE;
	public static String WIZARD_OPTION_DYNAMIC_EP;
	public static String WIZARD_OPTION_REGISTRY_PATH;
	public static String WIZARD_OPTION_SAVE_LOCATION;
	public static String WIZARD_OPTION_IMPORT_OPTION;
	public static String WIZARD_OPTION_CREATE_ESB_PROJECT;
	public static String WIZARD_OPTION_EP_NAME;
	public static String WIZARD_OPTION_IMPORT_FILE;
	public static String WIZARD_OPTION_TEMPLATE_ADDRESS_EP_URL;
	public static String WIZARD_OPTION_TEMPLATE_WSDL_EP_URL;
	public static String WIZARD_OPTION_TEMPLATE_WSDL_EP_SERVICE;
	public static String WIZARD_OPTION_TEMPLATE_WSDL_EP_SERVICE_PORT;
	public static String WIZARD_OPTION_TEMPLATE_TEMP_EP_URL;
	public static String WIZARD_OPTION_TEMPLATE_TEMP_TARGET;
	public static String WIZARD_OPTION_AVAILABLE_EPS;
	
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, EpArtifactConstants.class);
	}
	
	private EpArtifactConstants(){
		
	}
}
