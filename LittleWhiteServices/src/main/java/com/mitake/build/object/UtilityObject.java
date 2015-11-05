package com.mitake.build.object;

import java.io.File;
import java.util.ArrayList;

public class UtilityObject {

	static public boolean isStrEmpty(String str) {
		
		if(str == null) {
			
			return true;
		}
			
		str = str.trim();
		
		if(str.length() > 0) {
		
			return false;
		}
		
		return true;
	}
	
	static public ArrayList<File> getFileByExtensionType(String sourcePath, String extType) {
		
		ArrayList<File> fileList = new ArrayList<File>();
		
		final String path = sourcePath;
		
		File fileFolder = new File(path);
		
		String fileListTemp[] = fileFolder.list();
		
		for(String f : fileListTemp) {
			
			File fileTemp = new File(path + File.separatorChar + f);
			
			if(fileTemp.isFile()) {
				
				if(f.endsWith(extType)) {
				
					fileList.add(fileTemp);
				}
			}
		}
		
		return fileList;
	}
}
