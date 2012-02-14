/*                                                                             
 * Copyright 2004,2005 The Apache Software Foundation.                         
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */
package org.wso2.maven.equinox.bundlesinfo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.List;

/**
 * This Mojo generates an Equinox Simple COnfigurator bundles.info file based on the plugins in the
 * specified directory
 *
 * @goal bundlesinfo
 */
public class BundlesInfoMojo extends AbstractMojo {

    /**
     * @parameter
     */
    private String[] frameworkBundles;
    /**
     * The directories from which the bundles will be picked up
     *
     * @parameter
     */
    private String[] bundlesDirectories;

    /**
     * @parameter expression="${bundlesinfo.bundleInfoOutputDir}
     */
    private String bundleInfoOutputDir;

    /**
     * @parameter expression="${bundlesinfo.bundlesUrlPrefix}
     */
    private String bundlesUrlPrefix;

    /**
     * @parameter expression="${bundlesinfo.defaultStartLevel} default-value="10"
     */
    private int defaultStartLevel;

    private static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName:";
    private static final String BUNDLE_VERSION = "Bundle-Version:";

    public void execute() throws MojoExecutionException {

        String bundlesInfoFileContent = "";
        if (frameworkBundles != null) {
            for (String frameworkBundle : frameworkBundles) {
                bundlesInfoFileContent += frameworkBundle + "\n";
            }
        }

        if (bundlesDirectories != null && bundlesDirectories.length > 0) {
            for (String bundlesDir : bundlesDirectories) {
                if (bundlesDir == null) {
                    throw new MojoExecutionException("An empty bundlesDicrectories child element has been specified");
                }
                bundlesDir = bundlesDir.trim();
                File dir = new File(bundlesDir);
                if (!dir.isDirectory()) {
                    throw new MojoExecutionException(bundlesDir + " is not a directory");
                }
                for (String file : dir.list()) {
                    String bundleInfoLine;
                    String bundleSymbolicName = null;
                    String bundleVersion = null;
                    boolean startBundle = true;
                    file = dir.getAbsolutePath() + File.separator + file;
                    try {
                        List<String> lines = ArchiveReader.readManifestFile(file);
                        for (int i =0; i < lines.size(); i++) {
                            String line = lines.get(i);
                            if (line.startsWith(BUNDLE_SYMBOLIC_NAME)) {
                                bundleSymbolicName =
                                        line.substring(line.indexOf(BUNDLE_SYMBOLIC_NAME) + BUNDLE_SYMBOLIC_NAME.length() + 1);
                                int j = i + 1;
                                line = lines.get(j);
                                if(line.startsWith(" ")){ // Bundle-SymbolicName continues on next line?
                                    bundleSymbolicName += line.substring(1);
                                }
                                int iSemicolon = bundleSymbolicName.indexOf(";");
                                if (iSemicolon != -1) {
                                    bundleSymbolicName = bundleSymbolicName.substring(0, iSemicolon);
                                }
                            } else if (line.startsWith(BUNDLE_VERSION)) {
                                bundleVersion =
                                        line.substring(line.indexOf(BUNDLE_VERSION) + BUNDLE_VERSION.length() + 1);
                                int j = i + 1;
                                line = lines.get(j);
                                if(line.startsWith(" ")){ // Bundle-Version continues on next line?
                                    bundleVersion += line.substring(1);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new MojoExecutionException("Cannot read file " + file, e);
                    }
                    if (bundleSymbolicName != null && bundleVersion != null) {
                        String bundleFileName = file.substring(file.lastIndexOf(File.separator) + 1);
                        bundleInfoLine = bundleSymbolicName + "," +
                                         bundleVersion + "," +
                                         bundlesUrlPrefix + bundleFileName + "," +
                                         defaultStartLevel + "," + startBundle + "\n";
                        bundlesInfoFileContent += bundleInfoLine;
                    }
                }
            }
        }

        // Write the output file
        File outputDir = new File(bundleInfoOutputDir);
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }
        Writer output = null;
        try {
            File outputFile = new File(bundleInfoOutputDir + File.separator + "bundles.info");
            output = new BufferedWriter(new FileWriter(outputFile));
            output.write(bundlesInfoFileContent);
        } catch (Exception e) {
            throw new MojoExecutionException("Cannot write bundles.info file", e);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
