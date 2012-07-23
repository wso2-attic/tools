package org.wso2.developerstudio.eclipse.artifact.cep.utils;

import org.eclipse.osgi.util.NLS;


public class CEPArtifactConstants extends NLS {

	public static final String BUNDLE_NAME = "org.wso2.developerstudio.eclipse.artifact.cep.utils.cepartifactconstants";
	
	//project wizard page properties
	public static String WIZARD_OPTION_BUCKET_NAME;
	public static String WIZARD_OPTION_IMPORT_FILE;
	public static String WIZARD_OPTION_NEW_DSPROJECT;
	public static String WIZARD_OPTION_IMPORT_DSPROJECT;
	public static String WIZARD_OPTION_BUCKET_NAMESPACE;
	public static String WIZARD_OPTION_CEP_ENGINEPROVIDER;
	public static String WIZARD_OPTION_BUCKET_DISCRIPTION;
	public static String WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME;
	public static String WIZARD_OPTION_ESPER_CEP_RUNTIME;
	public static String WIZARD_OPTION_WS_EVENT_BROKER;
	public static String WIZARD_OPTION_LOCAL_BROKER;
	public static String WIZARD_OPTION_INTEGER;
	public static String WIZARD_OPTION_DOUBLE;
	public static String WIZARD_OPTION_STRING;
	public static String WIZARD_OPTION_LONG;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CEPArtifactConstants.class);
	}
	
	public CEPArtifactConstants() {
		
	}
}
