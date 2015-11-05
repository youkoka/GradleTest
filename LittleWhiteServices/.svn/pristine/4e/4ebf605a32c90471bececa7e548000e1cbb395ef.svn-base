package com.mitake.build.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitake.build.object.PropertiesObject;

public class BaseController {

	/** Logger available to subclasses */
	protected final Log logger = LogFactory.getLog(getClass());
	
	private final String configurePath = "com/mitake/resources/configure/Configure.properties";
	
	protected final PropertiesObject props = PropertiesObject.instance(configurePath);	
}
