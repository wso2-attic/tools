package org.wso2.carbonstudio.eclipse.libraries.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.wso2.carbonstudio.eclipse.libraries.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;


public class LibraryUtils {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	public static File getDependencyPath(String dependencyName){
		String dependencyPath = getLibLocation() + dependencyName;  
		URL resource = getResourceURL(dependencyPath);
		return getDependencyPath(resource);
	}

	public static URL getResourceURL(String dependencyPath) {
		return Platform.getBundle(Activator.PLUGIN_ID).getResource(dependencyPath);
	}

	public static File getDependencyPath(URL resource) {
		IPath path = Activator.getDefault().getStateLocation();
		IPath libFolder = path.append("lib");
		String[] paths = resource.getFile().split("/");
		IPath library = libFolder.append(paths[paths.length-1]);
		File libraryFile = new File(library.toOSString());
		try {
		    writeToFile(libraryFile, resource.openStream());
		} catch (IOException e) {
		    log.error(e);
		    return null;
		}
		return libraryFile;
	}

	private static String getLibLocation() {
		return "lib/";
	} 
	
	private static void writeToFile(File file, InputStream stream) throws IOException{
		file.getParentFile().mkdirs();
	    OutputStream out=new FileOutputStream(file);
	    byte buf[]=new byte[1024];
	    int len;
	    while((len=stream.read(buf))>0)
	    	out.write(buf,0,len);
	    out.close();
	    stream.close();
	}
	
//	public static String[] getAvailableLibraries() throws IOException{
//		List<String> libraryNames=new ArrayList<String>();
//		for (String location : getLibLocation()) {
//			Enumeration resources = Platform.getBundle(Activator.PLUGIN_ID).getEntryPaths(location);
//			while (resources.hasMoreElements()){
//				String libraryPath = resources.nextElement().toString();
//				if (libraryPath.toLowerCase().endsWith("jar")){
//					libraryNames.add(libraryPath);
//				}
//			}
//		}
//		
//		return libraryNames.toArray(new String[]{});
//	}
}
