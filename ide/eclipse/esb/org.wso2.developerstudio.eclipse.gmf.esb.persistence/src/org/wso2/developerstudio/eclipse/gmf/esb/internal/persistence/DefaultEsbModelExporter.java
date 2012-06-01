/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.util.XMLPrettyPrinter;
import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.config.SynapseConfigurationBuilder;
import org.apache.synapse.config.xml.SynapseXMLConfigurationSerializer;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.developerstudio.eclipse.gmf.esb.Task;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbModelTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * Default implementation of {@link EsbModelTransformer}.
 */
public class DefaultEsbModelExporter implements EsbModelTransformer {
	static String sourceXML= new String();
	/**
	 * {@inheritDoc}
	 */
	public void export(Resource resource, File destination) throws Exception {
		Assert.isTrue(resource.getContents().size() == 1,
				"Resource should have exactly one root object.");
		EObject rootObj = resource.getContents().get(0);
		Assert.isTrue(rootObj instanceof EsbDiagram, "Unknown diagram object.");
		EsbDiagram esbDiagram = (EsbDiagram) rootObj;
		EsbServer server = esbDiagram.getServer();
		Assert.isTrue(null != server,
				"Unable to locate esb server visual model object.");
		export(server, destination);
	}

	/**
	 * Exports the given {@link EsbServer} visual model into specified
	 * destination.
	 * 
	 * @param serverModel
	 *            {@link EsbServer} visual model instance.
	 * @param destination
	 *            target file.
	 * @throws Exception
	 *             if an error occurs during export operation.
	 */
	private void export(EsbServer serverModel, File destination)
			throws Exception {
		SynapseXMLConfigurationSerializer serializer = new SynapseXMLConfigurationSerializer();
		OMElement configOM = serializer
				.serializeConfiguration(transform(serverModel));
		OutputStream os = new FileOutputStream(destination);
		XMLPrettyPrinter.prettify(configOM, os);
	}

	/**
	 * Transforms the given {@link EsbServer} visual model into a
	 * {@link SynapseConfiguration} object.
	 * 
	 * @param serverModel
	 *            {@link EsbServer} visual model.
	 * @return configured {@link SynapseConfiguration} object.
	 * @throws Exception
	 *             if an error occurs during transformation.
	 */
	private SynapseConfiguration transform(EsbServer serverModel)
			throws Exception {
		SynapseConfiguration configuration = new SynapseConfiguration();
		TransformationInfo info = new TransformationInfo();
		info.setSynapseConfiguration(configuration);
		
		//message  mediation
		MessageMediator messageMed = serverModel.getMessageMediator();
		if (messageMed!=null) {
			MessageMediatorTransformer transformer = new MessageMediatorTransformer();
			info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
			transformer.transform(info, messageMed);
		}
		
		List<EsbElement> childNodes = serverModel.getChildren();
		int startupCount=-1;
		for (EsbElement childNode : childNodes) {
			
			// service mediation.
			if (childNode instanceof ProxyService) {
				ProxyService visualService = (ProxyService) childNode;
				ProxyServiceTransformer transformer = new ProxyServiceTransformer();
				info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
				transformer.transform(info, visualService);
			}
			
			
			if(childNode instanceof Task){
				++startupCount;
				Task task=(Task) childNode;		
				TaskTransformer transformer=new TaskTransformer();
				transformer.transform(info,task,startupCount);
			}
			
			
			
		}
		return configuration;
	}

	public String designToSource(EsbServer serverModel) throws Exception {
		SynapseXMLConfigurationSerializer serializer = new SynapseXMLConfigurationSerializer();
		OMElement configOM = serializer
				.serializeConfiguration(transform(serverModel));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DefaultEsbModelExporter.prettify(configOM, baos);
		// demo();
		sourceXML = baos.toString("UTF-8");
		return baos.toString("UTF-8");
	}

	// TODO: There is a bug. Output pretty formatted XML does not have a
	// linebreak after xml tab.
	// The method prettify is the same as used in Axis2Utiles and AbstractXmlDoc
	// in carbon studio
	// It works fine with this exact code if tried from a new java project. Have
	// to check this.
	// public void demo(){
	// String a = "<foo><bar>hi</bar></foo>";
	// OMElement ele;
	// ByteArrayOutputStream out = new ByteArrayOutputStream();
	// try {
	// ele = AXIOMUtil.stringToOM(a);
	//
	// DefaultEsbModelExporter.prettify(ele, out);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// System.out.println(out.toString());
	// }

	private static final String prettyPrintStylesheet = "<xsl:stylesheet xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0' "
			+ " xmlns:xalan='http://xml.apache.org/xslt' "
			+ " exclude-result-prefixes='xalan'>"
			+ "  <xsl:output method='xml' indent='yes' xalan:indent-amount='4'/>"
			+ "  <xsl:strip-space elements='*'/>"
			+ "  <xsl:template match='/'>"
			+ "    <xsl:apply-templates/>"
			+ "  </xsl:template>"
			+ "  <xsl:template match='node() | @*'>"
			+ "        <xsl:copy>"
			+ "          <xsl:apply-templates select='node() | @*'/>"
			+ "        </xsl:copy>" + "  </xsl:template>" + "</xsl:stylesheet>";

	protected static void prettify(OMElement wsdlElement, OutputStream out)
			throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wsdlElement.serialize(baos);

		Source stylesheetSource = new StreamSource(new ByteArrayInputStream(
				prettyPrintStylesheet.getBytes()));
		Source xmlSource = new StreamSource(new ByteArrayInputStream(
				baos.toByteArray()));

		TransformerFactory tf = TransformerFactory.newInstance();
		Templates templates = tf.newTemplates(stylesheetSource);
		Transformer transformer = templates.newTransformer();
		transformer.transform(xmlSource, new StreamResult(out));
	}

	public EsbServer sourceToDesign(String source,EsbServer esbServer) throws Exception {
		if(!sourceXML.equals(source)){
			updateDesign(source,esbServer);
			sourceXML = source;
		}
		 
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private void updateDesign(String source,EsbServer esbServer) throws Exception{
		CompoundCommand resultCommand = new CompoundCommand();
        File tempfile = File.createTempFile("file", ".tmp");
        BufferedWriter outfile = new BufferedWriter(new FileWriter(tempfile));
        outfile.write(source);
        outfile.close();
		SynapseConfiguration synapseCofig = SynapseConfigurationBuilder.getConfiguration(tempfile.getAbsolutePath(), null);
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(esbServer);

		// cleaning old diagram
		// TODO: should be replaced by better approach
		for(EsbElement child : esbServer.getChildren()){
			if(child instanceof ProxyService ){
			RemoveCommand removeCmd = new RemoveCommand(domain, esbServer,EsbPackage.Literals.ESB_SERVER__CHILDREN,child) ;
			resultCommand.append(removeCmd);
			}
			
		}
		
		if (resultCommand.canExecute()) {
			domain.getCommandStack().execute(resultCommand);
		}
		
		
		resultCommand = new CompoundCommand();
		for(org.apache.synapse.core.axis2.ProxyService proxyService:synapseCofig.getProxyServices()){
			ProxyService proxy = EsbFactory.eINSTANCE.createProxyService();
			proxy.setName(proxyService.getName());
			proxy.setTransports(join(proxyService.getTransports(),","));
			proxy.setInputConnector(EsbFactory.eINSTANCE.createProxyInputConnector() );
			proxy.setOutputConnector(EsbFactory.eINSTANCE.createProxyOutputConnector());
			AddCommand addCmd = new AddCommand(domain,esbServer,EsbPackage.Literals.ESB_SERVER__CHILDREN, proxy);
			domain.getCommandStack().execute(addCmd);
		}
		if (resultCommand.canExecute()) {
			domain.getCommandStack().execute(resultCommand);
		}
	}
	
	public static String join(Iterable<? extends CharSequence> s, String delimiter) {
	    @SuppressWarnings("unchecked")
		Iterator<String> iter = (Iterator<String>) s.iterator();
	    StringBuffer buffer = new StringBuffer(iter.next());
	    while (iter.hasNext()) buffer.append(delimiter).append(iter.next());
	    return buffer.toString();
	}

	
}
