package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import core.Config;
import core.Project;

public class Tool {
	
	public static String toolName;
	public String configName;
	public static int maxExecutionTime;
    public String pathName;
    public static String mainPath;
    public static String jarPath;
    public static String solverName;
    public static String solverPathName;
    public static String versionName;
    public static String EvoSuitePath;
    public static String JunitPath;
    public static String hamcrestPath;
    public static String toolsPath;
    public static String dtPath;
    
    public Tool (String nameOfTool){
    	this.toolName = nameOfTool;
    }
   
    public static void parseData (String nameOfConfigPath){
		
    	 /**
   	       * gets the path of the json file of the repair tool
   	       */
		 String initialpath = Tool.class.getResource("").toString();
		 initialpath = initialpath.replace("file:","");
		 initialpath = initialpath.replace("target/classes","src/main/java");
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 String path = initialpath + "/data/tools/" + nameOfConfigPath + ".json";
		 	 
		 JSONParser parser = new JSONParser();
         try {
	            FileReader fileReader = new FileReader(path);
	            JSONObject json = (JSONObject) parser.parse(fileReader);
	            
	            /**
	     	      * gets the path of the main class of the repair tool
	     	      */
	            mainPath = json.get("main").toString();
	            
	            /**
	     	      * gets the path of the JAR file of the repair tool
	     	      */
	            jarPath = json.get("jar").toString();
	            Config.setPath();
	            jarPath = jarPath.replace("<defects4j-repair>", Config.defects4jRepairRoot);
	            
	            /**
	     	      * gets the solver name of the repair tool
	     	      */
	            solverName = json.get("solver").toString();
	            
	            /**
	     	      * gets the path of the solver of the repair tool
	     	      */
	            solverPathName = json.get("solverPath").toString();
	            solverPathName = solverPathName.replace("<defects4j-repair>", Config.defects4jRepairRoot);
	            
	            /**
	     	      * gets the version number of the repair tool
	     	      */
	            versionName = json.get("version").toString();
	            
	            /**
	     	      * gets the path of the EvoSuite tool
	     	      */
	            EvoSuitePath = json.get("EvoSuitePath").toString();
	            EvoSuitePath = EvoSuitePath.replace("<defects4j-repair>", Config.defects4jRepairRoot);
	            
	            /**
	     	      * gets the path of the JUnit tool
	     	      */
	            JunitPath = json.get("JUnitPath").toString();
	            JunitPath = JunitPath.replace("<defects4j-repair>", Config.defects4jRepairRoot);
	            
	            hamcrestPath = json.get("hamcrestCorePath").toString();
	            hamcrestPath = hamcrestPath.replace("<defects4j-repair>", Config.defects4jRepairRoot);
	            
	        } catch (Exception ex) {
	            ex.printStackTrace();
	     }
         
	 }
    
    public static String initTask (Project nameOfProject, int identityNumber ) {

    	/**
	     * constructs the working directory
	     */
    	 String workdir = "/tmp/"+ (nameOfProject.projectName).toLowerCase()+"_"+Integer.toString(identityNumber)
    	                   +"_"+toolName;
    	  
    	 String commandString="";
    	 
    	 /**
	       * adds jdk7 path to PATH, adds Defects4J's executables to the PATH
	       */
 	     commandString = "export JAVA_HOME="+Config.javaHome_7+" && "+"export JRE_HOME="+Config.javaHome_7+"/jre"+" && "+"export CLASS_PATH=.:"+Config.javaHome_7+"/lib"+":"+Config.javaHome_7+"/jre/lib"+" && "+
    	 "export PATH="+Config.processPath(System.getenv("PATH"),7)+":"+Config.defects4jRoot+
 	    		 "/framework/bin"+" && "+"export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8"+" && ";
    	 /**
	       * copies the specific buggy version of the specific program to the working directory
	       */
 	     String copyCommand="";
 	     copyCommand="cp -r "+Config.projectsRoot+"/"+(nameOfProject.projectName).toLowerCase()+"/"+
 	    		(nameOfProject.projectName).toLowerCase()+"_"+Integer.toString(identityNumber)+" "+
 	    		workdir+" && "+"cd "+workdir+" && ";
 	     commandString+=copyCommand;
    	
    	 /**
 	       * compiles the specific buggy version of the specific program
 	       */
    	 commandString+="defects4j compile";
    	 commandString+= " && ";
    	 commandString+="defects4j test";
    	 commandString+= " && ";
    	 /**
	       * copy the related libs to the working directory
	       */	
         String libString="";
         libString="mkdir -p lib/"+" && "+"cp -r "+Config.defects4jRoot+"/framework/projects/lib/* lib/"+" && ";
         commandString+=libString;
    	 
    	 if(!((nameOfProject.projectName).toLowerCase().equals("chart"))) {
    	   String chartString="";
    	   chartString="cp -r "+Config.defects4jRoot+"/framework/projects/"+nameOfProject.projectName+"/lib/* lib/"+" && ";
    	   commandString+=chartString;
    	 }
    	 
    	 String deleteString="find . -type f -name "+"\""+"package-info.java"+"\""+" -delete";
    	 commandString+=deleteString;
    	 
    	 /**
 	       * starts a process to run the shell command
 	       */
    	 String[] cmd = { "/bin/bash", "-c", commandString};
 	     ProcessBuilder pb = new ProcessBuilder(cmd);
         Process p = null;
         try {
             pb.inheritIO();
             p = pb.start();
             p.waitFor();
         } catch (IOException e1) {
             e1.printStackTrace();
         } catch (InterruptedException e) {
             e.printStackTrace();
         } 
        return workdir;     
    }
    
    /**
      * starts a process to get the host name of the machine
      */
    public static String getHostName () {
    	String hostName="";
    	String[] cmd = { "/bin/bash", "-c", "hostname;"};
	    ProcessBuilder pb = new ProcessBuilder(cmd);
        Process p = null;
        try {
            pb.inheritIO();
            p = pb.start();
            p.waitFor();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
			      hostName+=line;
			}
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        return hostName;
   }
    
    /**
      * returns the path of EvoSuite tool
      */
   public String getEvoSuitePath() {
	   return EvoSuitePath;
   }
    
}
