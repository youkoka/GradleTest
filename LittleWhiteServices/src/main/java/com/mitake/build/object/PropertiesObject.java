package com.mitake.build.object;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.mitake.build.object.PropertiesObject;

public class PropertiesObject {

	public String configurePath = "";
	
	private Properties pathProps = null;
	
	private static PropertiesObject props = null;
	
	//! singleton instance
	static public PropertiesObject instance(String configurePath) {

		if(props != null) {
			
			if(props.configurePath.equals(configurePath)) {
				
				if(props == null) {
					
					props = new PropertiesObject(configurePath);
				}
			}
			else {
				
				props = null;
				
				props = new PropertiesObject(configurePath);
			}
		}
		else {
			
			props = new PropertiesObject(configurePath);
		}
		
		return props;
	}
	
	//! constructor method
	public PropertiesObject(String configurePath) {
		
		try {		
			
			this.configurePath = configurePath;
			
			Resource resPath = new ClassPathResource(this.configurePath);
			
			pathProps = PropertiesLoaderUtils.loadProperties(resPath);
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//! get properties's content by key
	public String getProperties(String key) {
		
		String result = "";
		
		if(pathProps != null) {
			
			result = pathProps.getProperty(key);
		}
		else {
			
			try {
				
				Resource resPath = new ClassPathResource(this.configurePath);
				
				pathProps = PropertiesLoaderUtils.loadProperties(resPath);
				
				result = pathProps.getProperty(key);
			}
			catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
