package com.mitake.build.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpService {

	public int send(String url, HttpEntity httpEntity) throws ClientProtocolException, IOException {
		//
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(httpEntity);
		CloseableHttpResponse httpResponse = httpclient.execute(httpPost);
		int statusCode = 0;
		try {
		    statusCode = httpResponse.getStatusLine().getStatusCode();
		    
		    HttpEntity entity = httpResponse.getEntity();
		    // do something useful with the response body
		    // and ensure it is fully consumed
		    EntityUtils.consume(entity);
		} 
		finally {
			
			httpResponse.close();
		}
		
		return statusCode;
	}
}
