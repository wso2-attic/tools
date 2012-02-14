package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.wso2.carbon.registry.app.RemoteRegistry;
import org.wso2.carbon.registry.core.RegistryConstants;
import org.wso2.carbon.registry.core.Resource;
import org.wso2.carbon.registry.core.exceptions.RegistryException;

public class Test {

	/**
	 * @param args
	 * @throws RegistryException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws RegistryException, IOException {

		
		
		System.setProperty("javax.net.ssl.trustStore", "/home/saminda/Downloads/wso2esb-3.0.0-SNAPSHOT/resources/security/client-truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		System.setProperty("javax.net.ssl.trustStoreType","JKS");
		
		RemoteRegistry registry = new RemoteRegistry(new URL("https://localhost:9443/registry"), "admin", "admin");
		Resource resource3 = registry.get("/repository/components/org.wso2.carbon.event/index/TopicIndex;version:600");
		new FileOutputStream(new File("/home/saminda/tmp/test123356.txt")).write((byte[])resource3.getContent());
		System.exit(0);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//      Map parameters2 = new HashMap();
//      parameters2.put("query", "SELECT A.REG_PATH_ID, A.REG_NAME FROM REG_RESOURCE A WHERE A.REG_NAME LIKE ?");
//      parameters2.put("1","%wsdl%");
//      Resource result2 = registry.executeQuery("/custom-queries3", parameters2);
//      
//      System.exit(1);
		String sql1 = "SELECT A.REG_PATH_ID, A.REG_NAME FROM REG_PATH B, REG_RESOURCE A WHERE ((A.REG_NAME LIKE 'abc') OR ((A.REG_NAME IS NULL) AND (B.REG_PATH_VALUE LIKE 'abc') AND (A.REG_PATH_ID=B.REG_PATH_ID)))";

        Resource q1 = registry.newResource();

        q1.setContent(sql1);

        q1.setMediaType(RegistryConstants.SQL_QUERY_MEDIA_TYPE);

        q1.addProperty(RegistryConstants.RESULT_TYPE_PROPERTY_NAME,

                RegistryConstants.RESOURCES_RESULT_TYPE);

        registry.put("/custom-queries", q1);



    // then you should give the parameters and the query location you just put

        Map parameters = new HashMap();

//        parameters.put("1", "%coll%ctio%");

        Resource result = registry.executeQuery("/custom-queries", parameters);

    String[] paths = (String[])result.getContent();

		for (String path : paths) {
			System.out.println(path);
		}

//		ResourceImpl r=(ResourceImpl)registry.get("/AuthenticationAdminService.wsdl");
////		System.out.println(r.get);
//		String[] versions = registry.getVersions("/AuthenticationAdminService.wsdl");
//		for (String v : versions) {
//			System.out.println(v);
//		}
		System.exit(0);
		
		Resource resource = registry.get("/carbon");
		//ResourceImpl r=(ResourceImpl)resource;
		
		
		System.out.println(resource.getMediaType());
		resource.setMediaType("samindaaaaaaaaaaaaa");
		registry.put("/carbon", resource);
		resource = registry.get("/carbon");
		System.out.println(resource.getMediaType());
		
		System.exit(0);
		File file = new File("/home/saminda/tmp/testexport");
		registry.get("/");
		//RegistryClientUtils.exportFromRegistry(file, "/carbon", registry);

//		ClientOptions.getClientOptions().setUsername("admin");
//		ClientOptions.getClientOptions().setPassword("admin");
//		ClientOptions.getClientOptions().setWorkingDir(file.getAbsolutePath());
//		ClientOptions.getClientOptions().setRegistryUrl("https://localhost:9445/registry");
//		ClientOptions.getClientOptions().setCheckoutPath("/carbon");
//
////		ClientOptions.getClientOptions().setUserUrl("https://localhost:9445/registry/carbon");
//		ClientOptions.getClientOptions().setUserUrl(ClientOptions.getClientOptions().getRegistryUrl()+ClientOptions.getClientOptions().getCheckoutPath());
//
//		
//		new Checkout().execute();
//		Object content = registry.get("/carbon/xslt/LocalEntry.xslt").getContent();
//		byte[] b=(byte[])content;
//		
//		FileOutputStream fos = new FileOutputStream("/home/saminda/tmp/abc.txt");
//		fos.write(b);
//		fos.close();
//		String a="/carbon/";
//		String[] s = a.split("/");
//		for (String p : s) {
//			System.out.println(p);
//		}
	}

}

