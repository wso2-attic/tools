package org.wso2.developerstudio.appfactory.core.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
//import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.model.ErroModel;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
 
public class HttpsJaggeryClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
    private static HttpClient  client;
    private static Shell activeShell;

	public static String httpPostLogin(String urlStr, Map<String,String> params){
 
	 
	    client = new DefaultHttpClient();
	    client = HttpsJaggeryClient.wrapClient(client,urlStr);
	    return  httpPost(urlStr,params);
	}
	
	public static String httpPost(String urlStr, Map<String,String> params){
		   
		    HttpPost post = new HttpPost(urlStr);
		   //  PostMethod postMethod = new PostMethod(urlStr);
		    String respond = "";
		    HttpResponse response=null;
	         try{
		      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			  Set<String> keySet = params.keySet();
			  for (String key : keySet) {
				  nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
			   }
		      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		      response = client.execute(post);
		    //  client.executeMethod(post);
		      if(200==response.getStatusLine().getStatusCode()){
		      HttpEntity entityGetAppsOfUser = response.getEntity();
		      BufferedReader rd = new BufferedReader(new InputStreamReader(entityGetAppsOfUser.getContent()));
		      StringBuilder sb = new StringBuilder();
		      String line ="";
		      while ((line = rd.readLine()) != null) {
		                  sb.append(line);
		            }
		      respond = sb.toString();
		      EntityUtils.consume(entityGetAppsOfUser);
		      if (entityGetAppsOfUser != null) {
		    	  entityGetAppsOfUser.getContent().close();
		    	}
		      }else{
		    	     ErroModel erroModel = Authenticator.getInstance().getErroModel();
		    	     erroModel.setMessage("Error respond Code");
		    	     List<String> resions = new ArrayList<String>();
		    	     resions.add(""+response.getStatusLine().getStatusCode());
		    	     resions.add(response.getStatusLine().getReasonPhrase()); 
		    	     erroModel.setResions(resions);
		    	  return "false";
		      }
		     
	      }catch(Exception e){
	    	  
	    	     ErroModel erroModel = Authenticator.getInstance().getErroModel();
	    	     
	    	     erroModel.setMessage("Could not connect to the AppFactory due to one of the following resions");
	    	     List<String> resions = new ArrayList<String>();
	    	     resions.add("1 Network connection failer");
	    	     resions.add("2 Unknow Hostname");
	    	     resions.add("3 Connection time out");
	    	     resions.add(e.getMessage());
	    	     resions.add("");
	    	     resions.add("Please refer the log file for more detials");
	    	     erroModel.setResions(resions);
	    	     log.error("Connection failer",e); 
	        	 return "false";
	         } finally{
	           client.getConnectionManager().closeExpiredConnections();
	         }
 
     return respond;	       
  }
	@SuppressWarnings("deprecation")
	public static HttpClient wrapClient(HttpClient base,String urlStr) {
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager() {

                public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);
            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
          
            ClientConnectionManager ccm =  new ThreadSafeClientConnManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            URL url = new URL(urlStr);
            int port = url.getPort();
            if(port==-1){
            	port=443;
            }
            String protocol = url.getProtocol();
            if("https".equals(protocol)){
            	 if(port==-1){
                 	port=443;
                 }
            }else if("http".equals(protocol)){
            	 if(port==-1){
                 	port=80;
                 }
            }
            sr.register(new Scheme(protocol, ssf, port));
            
            return new DefaultHttpClient(ccm, base.getParams());
        } catch (Throwable ex) {
            ex.printStackTrace();
            log.error("Trust Mangaer error", ex);
            return null;
        } 
    }
}
