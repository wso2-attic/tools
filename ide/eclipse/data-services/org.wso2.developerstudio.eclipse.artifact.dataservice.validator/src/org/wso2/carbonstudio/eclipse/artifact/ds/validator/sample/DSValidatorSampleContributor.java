package org.wso2.carbonstudio.eclipse.artifact.ds.validator.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.artifact.ds.validator.utils.DSValidatorImageUtils;
import org.wso2.carbonstudio.eclipse.artifact.ds.validator.utils.DSValidatorTemplateUtils;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;

public class DSValidatorSampleContributor extends AbstractSampleContributor{
	static String caption="Dataservice Number Validator";
	static ImageDescriptor image=DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-sample-16x16.png");
	static String tooltip="Create a data service validator for numbers";
	static String dsValidatorSampleProject = "CustomDataserviceValidatorSampleProject";
	static ImageDescriptor wizardImage = DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-wizard.png");
	static String resourceRelativePath = "src/main/java/org/wso2/dataservice/validator/sample/NumberValidator.java";
	
	public void addSampleTo(IProject project) throws Exception {
	    super.addSampleTo(project);
	}
	
	protected File getSampleResourceFile() throws IOException {
	    return DSValidatorTemplateUtils.getInstance().getResourceFile("samples/CustomDataserviceValidatorSample.zip");
    }

    public String getCaption() {
	    return caption;
    }

    public ImageDescriptor getImage() {
	    return image;
    }

    public String getToolTip() {
	    return tooltip;
    }

    public boolean isCustomCreateSample() {
	    return false;
    }
    
    public String getProjectName() {
    	return dsValidatorSampleProject;
    }
    
    public ImageDescriptor getWizardPageImage() {
    	return wizardImage;
    }
    
	public String getResourceRelativePath() {
		return resourceRelativePath;
	}

}
