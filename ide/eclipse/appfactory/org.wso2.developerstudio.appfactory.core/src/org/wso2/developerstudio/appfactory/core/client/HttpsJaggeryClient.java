package org.wso2.developerstudio.appfactory.core.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;

import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.ui.preferences.ClientTrustStorePreferencePage;

public class HttpsJaggeryClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	static HttpClient  client;
	private static IPreferencesService preferenceStore;

	static{
		preferenceStore = Platform.getPreferencesService();
	}
	public static String httpPostLogin(String urlStr, Map<String,String> params){
	    init();
		client = new DefaultHttpClient();
		return httpPost(urlStr,params);
	}
	
	public static String httpPost(String urlStr, Map<String,String> params) {
		   
		    HttpPost post = new HttpPost(urlStr);
		    String respond = "";
		    try {
		      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			  Set<String> keySet = params.keySet();
			  for (String key : keySet) {
				  nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
			   }
		      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		      HttpResponse response = client.execute(post);
		     // System.out.println(resp);
		      
		      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		      while ((respond = rd.readLine()) != null) {
		      }
		    } catch (IOException e) {
		     log.error("Server Error", e);
		  }
	  return respond;	       
  }
	
	public static void init() {
		String clientTrustStoreLocation = preferenceStore
				.getString("org.wso2.developerstudio.eclipse.platform.ui",
						ClientTrustStorePreferencePage.TRUST_STORE_LOCATION,
						null, null);
		String clientTrustStoreType = preferenceStore.getString(
				"org.wso2.developerstudio.eclipse.platform.ui",
				ClientTrustStorePreferencePage.TRUST_STORE_TYPE, null, null);
		String clientTrustStorePassword = preferenceStore
				.getString("org.wso2.developerstudio.eclipse.platform.ui",
						ClientTrustStorePreferencePage.TRUST_STORE_PASSWORD,
						null, null);

		System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		if (clientTrustStoreLocation != null
				&& clientTrustStorePassword != null
				&& clientTrustStoreLocation.endsWith(".jks")
				&& !clientTrustStorePassword.equals("")) {
			System.setProperty("javax.net.ssl.trustStore",
					clientTrustStoreLocation);
			System.setProperty("javax.net.ssl.trustStorePassword",
					clientTrustStorePassword);
		} else {
			//System.setProperty("javax.net.ssl.trustStore", getJKSPath());
			//System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		}
	}
	
		
	
	public static String httpUrlPost(String urlStr, String[] paramName,
			String[] paramVal) throws Exception {
			  URL url = new URL(urlStr);
			  HttpsURLConnection conn =
			      (HttpsURLConnection) url.openConnection();
			  conn.setRequestMethod("POST");
			  conn.setDoOutput(true);
			  conn.setDoInput(true);
			  conn.setUseCaches(false);
			  conn.setAllowUserInteraction(false);
			  conn.setRequestProperty("Content-Type",
			      "application/x-www-form-urlencoded");

			  // Create the form content
			  OutputStream out = conn.getOutputStream();
			  Writer writer = new OutputStreamWriter(out, "UTF-8");
			  for (int i = 0; i < paramName.length; i++) {
			    writer.write(paramName[i]);
			    writer.write("=");
			    writer.write(URLEncoder.encode(paramVal[i], "UTF-8"));
			    writer.write("&");
			  }
			  writer.close();
			  out.close();
			  System.out.println(conn.getResponseCode());
			  if (conn.getResponseCode() != 200) {
			    throw new IOException(conn.getResponseMessage());
			  }

			  // Buffer the result into a string
			  BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			  StringBuilder sb = new StringBuilder();
			  String line;
			  while ((line = rd.readLine()) != null) {
			    sb.append(line);
			  }
			  rd.close();
			  conn.disconnect();
			  return sb.toString();
	  } 
}
