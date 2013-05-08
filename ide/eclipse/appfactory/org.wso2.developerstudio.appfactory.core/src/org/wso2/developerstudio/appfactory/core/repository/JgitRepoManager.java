package org.wso2.developerstudio.appfactory.core.repository;
import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.*;
import org.eclipse.jgit.api.CreateBranchCommand.SetupUpstreamMode;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepository;
import org.eclipse.jgit.transport.CredentialItem;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.URIish;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.eclipse.distribution.project.ui.wizard.ProjectsImportPage;
import org.wso2.developerstudio.eclipse.distribution.project.ui.wizard.ProjectsImportPage.ProjectRecord;
/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.jcraft.jsch.JSchException;

public class JgitRepoManager {

    private String localPath;
    private String remotePath;
    private Repository localRepo;
    private Git git;
  
    public JgitRepoManager(String localPath,String uri) throws IOException {
    	 this.localPath =localPath;
         this.remotePath = uri;
         localRepo = new FileRepository(localPath + "/.git");
         git = new Git(localRepo);   
	}
 
    public void createGitRepo(){
        Repository newRepo;
		try {
			newRepo = new FileRepository(localPath + ".git");
			newRepo.create();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void gitClone() throws InvalidRemoteException, TransportException, GitAPIException   {     
        Git.cloneRepository() 
          // .setCredentialsProvider(new JgitCredentialProvider(Authenticator.userName, Authenticator.passwords))
           .setURI(remotePath)
           .setDirectory(new File(localPath))
           .call();  
    }
    
    public void importProject(ProjectRecord[] projects){
    	ProjectsImportPage importMainPage = new ProjectsImportPage();
    	importMainPage.createProjects(projects);
    }

}