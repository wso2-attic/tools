package ${package}.ui;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import ${package}.stub.*;
import java.lang.Exception;


public class HelloWorldServiceClient {
	
	private HelloWorldServiceStub stub;
	
	public HelloWorldServiceClient(ConfigurationContext configCtx, String backendServerURL, String cookie) throws Exception{
		String serviceURL = backendServerURL + "HelloWorldService";
        stub = new HelloWorldServiceStub(configCtx, serviceURL);
        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);
        options.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, cookie);
	}
	
	public String getMessage() throws Exception {
		try {
			return stub.getMessage();
		} catch (RemoteException e) {
            String msg = "Cannot retrieve message"
                + " . Backend service may be unvailable";         
            throw new Exception(msg, e);
		}
	}
}
