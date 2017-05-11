package core.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.JSONObject;
import core.Config;
import core.Project;
import core.Tool;

public class Nopol extends Tool {
	
	public String repairMode; 
	public String synthesisType;
	public String oracleType;
    public String workdir;
    public String rootClassName;
    public String projectClassPath;
    public String compiledTestsPath;
    public String sourceTestPath;
    public Boolean whetherFindPatch;
    public String patchString;
    public String logInfoBase;
    public String logFinalResultPath;
    
    public double initialRepairTime=0;
    
	public Nopol(String nameOfTool) {
		super(nameOfTool);
	}
	
	/**
     * to be overwritten by the child class
     */
	public void run (Project nameOfProject, int identityNumber, Boolean whetherFirstLaunch, Boolean whetherDeleteDir, Boolean whetherFirstOrFinalLaunch,
			String testsClassesArray, int maximalRepairTime){
		
		this.runNopol(nameOfProject, identityNumber, "repair", "smt", "angelic", 
				whetherFirstLaunch, whetherDeleteDir,whetherFirstOrFinalLaunch,testsClassesArray, maximalRepairTime);
		
	}
	
	/**
     * run nopol
     * @param nameOfProject : the name of the project to be repaired
     * @param identityNumber : the ID of the buggy version
     * @param nameOfRepairType : mode of repair type
     * @param nameOfSynthesisType : type of synthesis
     * @param nameOfOracleType : type of used oracle
     * @param whetherLog : whether or not log the output information during repair
     * @param whetherDeleteDir : whether or not delete the temporary working directory
     * @param whetherFirstLaunch : whether or not this is the first time to launch nopol for the specific 
     * buggy version of the specific project
     */
	@SuppressWarnings({ "rawtypes", "static-access" })
	public void runNopol(Project nameOfProject, int identityNumber, String nameOfRepairMode, String nameOfSynthesisType,  
			String nameOfOracleType, Boolean whetherFirstLaunch, Boolean whetherDeleteDir, Boolean whetherFirstOrFinalLaunch,
			String testsClassesArray, int maximalRepairTime) {
		
		this.repairMode = nameOfRepairMode;
		this.synthesisType = nameOfSynthesisType;
		this.oracleType = nameOfOracleType;
		
		/**
	     * extracts the class path from json file of the project to be repaired
	     */
		String classpath = "";
        for(Map.Entry entry : nameOfProject.classPathlist.entrySet())
        {
            if(identityNumber <= Integer.valueOf(entry.getKey().toString()))
        	  {
        	     classpath = entry.getValue().toString();
        	     break;
              }
        }
        String classPathAdditional="";
        classPathAdditional=nameOfProject.libs+":"+this.jarPath+":"+this.EvoSuitePath+":"+this.JunitPath+":"
        		+this.hamcrestPath;
        
        classpath +=classPathAdditional;

        projectClassPath = classpath;

        /**
	     * extracts the source code path, test case path and compiled test case path from json file 
	     * of the project to be repaired
	     */
        String src = "";
        String sourcetestcases = ""; 
        String cptestcases = "";
        for(Map.Entry entry : nameOfProject.srclist.entrySet())
        {
            if(identityNumber <= Integer.valueOf(entry.getKey().toString()))
        	  {
        	     src = ((String[])(entry.getValue()))[2];
        	     sourcetestcases = ((String[])(entry.getValue()))[3];
            	 cptestcases = ((String[])(entry.getValue()))[1];
        	     break;
              }
        }  
        compiledTestsPath = cptestcases;
        sourceTestPath = sourcetestcases;
        
        /**
	     * gets the name of the temporary working directory 
	     */
        if(whetherFirstLaunch)
           workdir = this.initTask(nameOfProject, identityNumber);
        
        /**
	     * sets the working directory to be the temporary working directory, add jdk7 path to PATH
	     */
        String commandSequence="";
        commandSequence="cd "+workdir+" && "+"export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8"+" && "+"export JAVA_HOME="+Config.javaHome_7+" && "+ "export PATH="+
        		Config.processPath(System.getenv("PATH"),7)+" && ";
	    
        /**
	     * runs nopol with the defined parameters
	     */
        String nopolCommand="";
         
           nopolCommand="java -jar "+ this.jarPath+" --mode "+this.repairMode+" --oracle "+this.oracleType
 		+" --synthesis "+this.synthesisType+" --solver "+this.solverName+" --solver-path "+this.solverPathName
 		+" -z gzoltar"+" --maxTime "+maximalRepairTime+" --complianceLevel ";

        commandSequence+=nopolCommand;
        
        /**
	     * extracts the compliance level of the source code from json file of the project to be repaired
	     */
        String complianceLevel = "";
        for(Map.Entry entry : nameOfProject.complianceLevellist.entrySet())
        {
            if(identityNumber == Integer.valueOf(entry.getKey().toString()))
        	  {
        	     int cpSourceLevel = ((int[])(entry.getValue()))[0];
        	     complianceLevel=Integer.toString(cpSourceLevel);
        	     break;
              }
        }
        String nopolCommandAdditional="";
        if(whetherFirstOrFinalLaunch)
           nopolCommandAdditional=complianceLevel+" --source "+src+" --classpath "+classpath;
        else
           nopolCommandAdditional=complianceLevel+" --source "+src+" --classpath "+classpath+" --test "+testsClassesArray;
        
        commandSequence+=nopolCommandAdditional;
        
        /**
	     * deletes the temporary working directory
	     */
        if (whetherDeleteDir)
        {
           String commandDeleteDir=" && "+"rm -rf "+workdir;
           commandSequence+= commandDeleteDir;
        }
        
        File file = null;
        /**
	     * logs the run time information during nopol execution
	     */
        String logPath="";
        if (whetherFirstLaunch)
        { 
           logPath = nameOfProject.logPath+"/"+Integer.toString(identityNumber)+"/"+this.toolName+"/";
           logInfoBase=logPath;
           logPath+="stdout.log.initial";
	       file = new File(logPath);
		   if (!file.exists()) {
             try {
            	  file.getParentFile().mkdirs();
				  file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		   }
        }
        
        /**
	     * starts a process to run the shell command
	     */
		String[] cmd = { "/bin/bash", "-c", commandSequence};
	    ProcessBuilder pb = new ProcessBuilder(cmd);
	    pb.redirectErrorStream(true);
        Process p = null;
        try {
          //  pb.inheritIO();
            p = pb.start();
            whetherFindPatch=false;
            patchString="";
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = null;
			int patchNumber=0;
			int currentLineNumber=0;
			String stringContainedPatch="";
			FileOutputStream fos= null;
			BufferedWriter bw = null;
			if(whetherFirstLaunch)
			 {
			   fos = new FileOutputStream(file);
			   bw = new BufferedWriter(new OutputStreamWriter(fos));
			 }
			/**
		     * processes the run time information
		     */
			while ((s = stdInput.readLine()) != null) {
				//  System.out.println(s);
				  currentLineNumber+=1;
				  if ((currentLineNumber==(patchNumber+1))&& whetherFindPatch)
				  {
					  stringContainedPatch = s;
				  } 
				  if (s.contains("----PATCH FOUND----"))
				  {
					  whetherFindPatch=true;
					  patchNumber = currentLineNumber;
				  }
				  if (whetherFirstLaunch)
		          {
					 bw.write(s);
				     bw.newLine();
		          }
			}
			if(whetherFirstLaunch)
			     bw.close();
			  
			if(!stringContainedPatch.isEmpty())
				patchString=stringContainedPatch;
			
			p.waitFor();		
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
        
        if(whetherFirstLaunch)
            this.parseLogInfo(logPath, nameOfProject, identityNumber);
	}

	/**
     * convert the log information and write the information to a json file
     * @param logPath : the path of the log file
     * @param nameOfProject : the name of the project to be repaired
     * @param identityNumber : the ID of the buggy version
     * @param whetherInitial : whether or not this is the first time to convert the log information for the specific 
     * buggy version of the specific project
     */
	@SuppressWarnings({ "unchecked", "static-access" })
	public void parseLogInfo (String logPath, Project nameOfProject, int identityNumber) {
		int nbStatement=0;
		int nbAngelic=0;
		int nbInput=0;
		int nbVariable=0;
		int executionTime=0;
		String className="";
		int lineNumber=0;
		String patchType="";
		String patch="";
		String dateNow=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String nodeName= this.getHostName();
		
		/**
	     * reads the log file generated during nopol execution
	     */
		String wholeText="";
        try {
            FileInputStream fstream = new FileInputStream(logPath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
            String strLine;
            String eol = System.getProperty("line.separator");
            while ((strLine = br.readLine()) != null) {
            	wholeText+=strLine;
            	wholeText+=eol;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
		
        /**
	     * a set of pattern strings
	     */
        String patternString1 = "Nb Statements Analyzed : ([0-9]+)";
        String patternString2 = "Nb Statements with Angelic Value Found : ([0-9]+)";
        String patternString3 = "Nb inputs in SMT : ([0-9]+)";
        String patternString4 = "Nb variables in SMT : ([0-9]+)";
        String patternString5 = "NoPol Execution time : ([0-9]+)ms";
        String patternString6 = "----PATCH FOUND----\n([^:]+):([0-9]+): ([^ ]+) (.+)";
        String patternString7 = "Node: ([a-zA-Z0-9]+)";
        String patternString8 = "Date: ([^`]+)$";
        
        /**
	     * uses regular expression to extract desired information from log file generated during nopol execution
	     */
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher m1 = pattern1.matcher(wholeText);
        if(m1.find())
          {
        	 nbStatement = Integer.parseInt(m1.group(1));
        	 Pattern pattern2 = Pattern.compile(patternString2);
             Matcher m2 = pattern2.matcher(wholeText);
             if (m2.find())
            	 nbAngelic = Integer.parseInt(m2.group(1));
             Pattern pattern3 = Pattern.compile(patternString3);
             Matcher m3 = pattern3.matcher(wholeText);
             if (m3.find())
            	 nbInput = Integer.parseInt(m3.group(1));
             Pattern pattern4 = Pattern.compile(patternString4);
             Matcher m4 = pattern4.matcher(wholeText);
             if (m4.find())
            	 nbVariable = Integer.parseInt(m4.group(1));
             Pattern pattern5 = Pattern.compile(patternString5);
             Matcher m5 = pattern5.matcher(wholeText);
             if (m5.find())
            	 executionTime = Integer.parseInt(m5.group(1));
             Pattern pattern6 = Pattern.compile(patternString6);
             Matcher m6 = pattern6.matcher(wholeText);
             if (m6.find())
             {
            	 className = m6.group(1);
            	 lineNumber = Integer.parseInt(m6.group(2));
            	 patchType = m6.group(3);
            	 patch = m6.group(4);
             }
             Pattern pattern7 = Pattern.compile(patternString7);
             Matcher m7 = pattern7.matcher(wholeText);
             if (m7.find())
            	 nodeName = m7.group(1);
             Pattern pattern8 = Pattern.compile(patternString8);
             Matcher m8 = pattern8.matcher(wholeText);
             if (m8.find())
            	 dateNow = m8.group(1);
          }
        else
        	return;
        
        String writePath="";
        writePath = nameOfProject.logPath+"/"+Integer.toString(identityNumber)+"/"+this.toolName+"/"+"result-initial.json";
                 
        logFinalResultPath = nameOfProject.logPath+"/"+Integer.toString(identityNumber)+"/"+this.toolName;
                
        File file = new File(writePath);
		if (!file.exists()) {
            try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
	     * writes the extracted information to json file
	     */
		JSONObject obj = new JSONObject();
		obj.put("nbStatement", nbStatement);
		obj.put("nbAngelicValue", nbAngelic);
		obj.put("nbSMTInput", nbInput);
		obj.put("nbSMTVariable", nbVariable);
		obj.put("executionTime", executionTime);
		JSONObject subobj = new JSONObject();
		subobj.put("className", className);
		subobj.put("line", lineNumber);
		obj.put("patchLocation", subobj);
		obj.put("patchType", patchType);
		obj.put("patch", patch);
		obj.put("node", nodeName);
		obj.put("date", dateNow);
		try {
			FileWriter file1 = new FileWriter(writePath);
			file1.write(obj.toJSONString());
			file1.flush();
			file1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		initialRepairTime=BigDecimal.valueOf((double)executionTime/60000.0).setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		
		rootClassName = className;
	}
	
	public double getRepairTime(){
		return initialRepairTime;
	}
	/**
     * get the class name of the nopol bug fix 
     */
	public String getRootClassName(){
		return rootClassName;
	}
	
	/**
     * get the class name of the nopol bug fix 
     */
	public String getLogInfoBase(){
		return logInfoBase;
	}
	
	/**
     * get the temporary working directory
     */
	public String getWorkDir() {
		return workdir;
	}
	
	/**
     * get the class path of the project
     */
	public String getProjectClassPath() {
		return projectClassPath;
	}
	
	/**
     * get the path of the compiled tests
     */
	public String getCompiledTestsPath() {
		return compiledTestsPath;
	}
	
	/**
     * get the path of the source tests
     */
	public String getSourceTestsPath() {
		return sourceTestPath;
	}
	
	/**
     * returns whether or nor a patch has founded
     */
	public Boolean whetherFindPatch () {
		return whetherFindPatch;
	}
	
	/**
     * returns the patch string
     */
	public String getPatchString () {
		return patchString;
	}
	
	/**
     * returns the path of the final logged result
     */
	public String getFinalLogPath () {
		return logFinalResultPath;
	}
}
