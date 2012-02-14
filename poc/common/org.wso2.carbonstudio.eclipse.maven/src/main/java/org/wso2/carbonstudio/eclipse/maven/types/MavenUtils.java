package org.wso2.carbonstudio.eclipse.maven.types;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.apache.maven.project.MavenProject;

public class MavenUtils {
	public static final String CAPP_SCOPE_PREFIX = "capp";
	
	public static MavenProject getMavenProject(File file) throws Exception{
		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
		Model model;
			model = mavenXpp3Reader.read(new FileInputStream(file));
			return new MavenProject(model);
	}
	
	public static void saveMavenProject(MavenProject project, File file) throws Exception{
		MavenXpp3Writer mavenXpp3writer = new MavenXpp3Writer();
		mavenXpp3writer.write(new FileWriter(file), project.getModel());
	}
}
