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

import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Reads a provided archive
 */
public class ArchiveReader {

    /**
     * Read the MANIFEST.MF file in an archive and return the lines in that line as a list of
     * String
     *
     * @param file  The file to be read
     * @return The lines in the MANIFEST.MF as a List<String>
     * @throws IOException If an error occurs while reading the archive
     */
    public static List<String> readManifestFile(String file) throws IOException {
        ZipFile archive = null;
        try {
            if (file.toLowerCase().endsWith(".jar")) {
                archive = new JarFile(file);
                JarEntry entry = ((JarFile)archive).getJarEntry(JarFile.MANIFEST_NAME);
                if (entry != null) {
                    InputStream input = archive.getInputStream(entry);
                    return process(input);
                }
            } else if (file.toLowerCase().endsWith(".zip")) {
               archive = new JarFile(file);
                ZipEntry entry = archive.getEntry(JarFile.MANIFEST_NAME);
                if (entry != null) {
                    InputStream input = archive.getInputStream(entry);
                    return process(input);
                }
            }
        } finally {
            if(archive !=null){
                archive.close();
            }
        }
        return new ArrayList<String>();
    }

    private static List<String>  process(InputStream input) throws IOException {
        List<String> lines = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(isr);
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);

        }
        reader.close();
        return lines;
    }
}
