package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Config {
	
	public static String defects4jRepairRoot;
	public static String projectsRoot;
	public static String defects4jRoot;
	public static String resultsRoot; 
	public static String z3Root;
	public static String javaHome7;
	public static String javaHome_7;
	public static String javaHome8;
	public static String javaArgs;
	
	public static void setPath(){
		
		 String initialpath = Config.class.getResource("").toString();
		 initialpath = initialpath.replace("file:","");
		 initialpath = initialpath.replace("target/classes","src/main/java");
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 initialpath+="/";
		 // the root path that contains the code base for repairing defects4j buggy versions
		 defects4jRepairRoot=initialpath;	 
		// String userHome = System.getProperty("user.home");
		  String userHome="";
		  try {
				userHome = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "echo $HOME"}).getInputStream())).readLine();
		  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  }

		 // the root path that contains the projects, including Lang, Math etc.
		 projectsRoot=userHome+"/projects"; 
		 // the root path that contains the defects4j framework
		 defects4jRoot=userHome+"/defects4j";
		 // the root path that stores the results
		 resultsRoot=initialpath;
		 resultsRoot+="results/2016-December";  
		 z3Root=initialpath;
		 z3Root+="libs/z3";
		 // two paths for different jdk versions, note runs different shell processes will use different jdks
		
		 javaHome_7 = "/usr/lib/jvm/jdk1.7.0_79";		 
    	 javaHome7 = "/usr/lib/jvm/jdk1.7.0_79/bin";	 
		 javaHome8 = "/usr/lib/jvm/jdk1.8.0_101/bin";
		 javaArgs = "";
	}
	
	public static String processPath(String orginalPath, int jdkNumber) {
		
		String transferredPath="";
		if(orginalPath.indexOf("jdk1.8")!=-1||orginalPath.indexOf("jdk1.7")!=-1)
		{
			String[] splittedBin=orginalPath.split(":");
			for (int index=0; index< splittedBin.length; index++)
			{
				if(splittedBin[index].indexOf("jdk1.8")==-1&&splittedBin[index].indexOf("jdk1.7")==-1)
				{
					transferredPath+=splittedBin[index];
					transferredPath+=":";
				}
			}
			transferredPath = transferredPath.substring(0, transferredPath.length()-1);
		}
		else transferredPath=orginalPath;
		
		String internString="";
		if(jdkNumber==7)
			 internString= Config.javaHome7;
		else if(jdkNumber==8)
			  internString= Config.javaHome8;
		internString += ":";
		transferredPath = internString + transferredPath;
		
		return transferredPath;
	}
	
}
