package org.wso2.developerstudio.appfactory.core.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class HttpsJaggeryClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
    public static HttpClient  client;

	public static String httpPostLogin(String urlStr, Map<String,String> params){
		
	    client = new DefaultHttpClient();
	    client = HttpsJaggeryClient.wrapClient(client);
	    return  httpPost(urlStr,params);
	}
	
	public static String httpPost(String urlStr, Map<String,String> params) {
		   
		    HttpPost post = new HttpPost(urlStr);
		    String respond = "";
	         try{
		      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			  Set<String> keySet = params.keySet();
			  for (String key : keySet) {
				  nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
			   }
		      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		      HttpResponse response = client.execute(post);
		      if(200==response.getStatusLine().getStatusCode()){
		      HttpEntity entityGetAppsOfUser = response.getEntity();
		      BufferedReader rd = new BufferedReader(new InputStreamReader(entityGetAppsOfUser.getContent()));
		      StringBuilder sb = new StringBuilder();
		      String line ="";
		      while ((line = rd.readLine()) != null) {
		                  sb.append(line);
		            }
		      respond = sb.toString();
		      }else{
		    	  log.error("Error RespondCode");
		    	  return "false";
		      }
	         }catch(Exception e){
	        	 log.error("", e);
	         }	   
     return respond;	       
  }
	@SuppressWarnings("deprecation")
	public static HttpClient wrapClient(HttpClient base) {
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
            ClientConnectionManager ccm = base.getConnectionManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            sr.register(new Scheme("https", ssf, 443));
            return new DefaultHttpClient(ccm, base.getParams());
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } 
    }
}
