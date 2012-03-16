package org.wso2.developerstudio.eclipse.capp.project.publisher;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.wst.server.core.IServer;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppUtils;
import org.wso2.developerstudio.eclipse.carbonserver.base.interfaces.ICarbonServerModulePublisher;
import org.wso2.developerstudio.eclipse.carbonserver.base.interfaces.ICredentials;
import org.wso2.developerstudio.eclipse.carbonserver.base.manager.CarbonServerManager;
import org.wso2.developerstudio.eclipse.carbonserver.base.utils.CAppDeployer;
import org.wso2.developerstudio.eclipse.distribution.project.export.CarExportHandler;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

import java.io.File;
import java.net.URL;
import java.util.List;


public class CAppProjectRemotePublisher implements ICarbonServerModulePublisher{
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public void publish(IProject project, IServer server, File serverHome,
			File deployLocation) throws Exception {
		URL serverURL = CarbonServerManager.getServerURL(server);
		ICredentials serverCredentials = CarbonServerManager.getServerCredentials(server);
		File tempDir = FileUtils.createTempDirectory();
		CAppDeployer cappDeployer = new CAppDeployer();
//        File carFile = CAppUtils.generateCAR(tempDir.getPath(), project, false);
		CarExportHandler handler=new CarExportHandler();
		List<IResource> exportArtifact = handler.exportArtifact(project);
		cappDeployer.deployCApp(serverCredentials.getUsername(), serverCredentials.getPassword(), serverURL.toString(), ((IFile)exportArtifact.get(0)).getLocation().toFile());
		
	}

	public void unpublish(IProject project, IServer server, File serverHome,
			File deployLocation) throws Exception {
		URL serverURL = CarbonServerManager.getServerURL(server);
		ICredentials serverCredentials = CarbonServerManager.getServerCredentials(server);
		CAppDeployer cappDeployer = new CAppDeployer();
//		Artifact superArtifact = CAppEnvironment.getcAppManager().getSuperArtifact(project);
		CarExportHandler handler=new CarExportHandler();
		List<IResource> exportArtifact = handler.exportArtifact(project);
		File carFile = ((IFile)exportArtifact.get(0)).getLocation().toFile();
		CAppDeployer.unDeployCAR(serverURL.toString(), 
								 serverCredentials.getUsername(), 
								 serverCredentials.getPassword(), 
								 carFile.getName());
		
	}

	public void hotUpdate(final IProject project, final IServer server, final File serverHome,
	                      final File deployLocation) throws Exception {
		// unpublish(project, server, serverHome, deployLocation);
		// Thread.sleep(10000);
		// publish(project, server, serverHome, deployLocation);

		new Thread(new Runnable() {
			// Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				try {
					unpublish(project, server, serverHome, deployLocation);
					Thread.sleep(10000);
					publish(project, server, serverHome, deployLocation);
				} catch (Exception e) {
					log.error(e);
				}

			}
		}).start();
		// });

	}

}
