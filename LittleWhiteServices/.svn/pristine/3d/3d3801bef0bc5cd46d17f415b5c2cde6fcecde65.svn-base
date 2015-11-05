package com.mitake.build.object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statement {

	public String cmdLine[] = {};

	private String errMsg = "";

	//! default unknow error!
	private StateCode stateCode = StateCode.UnknowError;
	
	//! 執行命令列
	public StateCode onStart() {
		
		String s;
		
		if(this.cmdLine.equals("")) {
		
			stateCode = StateCode.CmdLineEmptyError;
		}
		else {
			
			Process p = null;
			
			try {
				
				p = Runtime.getRuntime().exec(cmdLine);
		            
		        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		 
		        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		
		        // read the output from the command
		        System.out.println("Here is the standard output of the command:\n");
		        while ((s = stdInput.readLine()) != null) {
		            System.out.println(s);
		        }
		         
		        // read any errors from the attempted command
		        System.out.println("Here is the standard error of the command (if any):\n");
		        while ((s = stdError.readLine()) != null) {
		            System.out.println(s);
		        }
		        
		        p.waitFor();
			}
			catch(IOException | InterruptedException e) {
			
				errMsg = e.getMessage();
			}
			finally {
			
				if(p != null) {
					
					if(p.exitValue() == 0) {
				        	
			        	stateCode = StateCode.TriggerSuccess;
			        }
			        else {
			        	
			        	stateCode = StateCode.TriggerError;
			        }
					
//					p.destroy();
				}
			}
		}
		
		return stateCode;
	}
	
	//! 錯誤訊息
	public String getErrorMsg() {
		
		switch(this.stateCode) {

			case TriggerSuccess:
			{
				errMsg = "no error!";
			}
				break;
			case CmdLineEmptyError:
			{
				errMsg = "Usage:command line is empty, please implement <cmdLine>";
			}
				break;
			case UnknowError:
			{
				errMsg = "Usage: unknow error!";
			}
				break;
			default:
				break;
		}
		
		return errMsg;
	}
}
