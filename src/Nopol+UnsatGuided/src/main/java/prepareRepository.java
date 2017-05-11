

import java.io.IOException;

import core.Config;

public class prepareRepository {
	
	/**
     * this method downloads the Defects4J repository form GitHub site, initializes Defects4J, 
     * checkouts buggy source code versions
     */
	
	public static void downloadRepository() {
		
		String commandSequence="";
		Config.setPath();
		String homePath = System.getProperty("user.home");
		commandSequence = "cd "+homePath+" && ";
		
		/**
	     * clones and initializes the Defects4J repository
	     */
		String defects4jString="";
		defects4jString="git clone https://github.com/rjust/defects4j"+" && "+"cd "+"defects4j"+" && "
		  +"git checkout 2c6e18b4241fb2b7b918f8a687d1c0cef13829d8"+" && "+"./init.sh"+" && ";
		commandSequence+=defects4jString;
		
		 /**
	     * adds jdk7 path and Defects4J's executables to the PATH
	     */
		String pathString="";
		pathString="export PATH="+Config.processPath(System.getenv("PATH"),7)+" && "+"export PATH="+Config.defects4jRoot
				+"/framework/bin:$PATH"+" && "+"mkdir "+Config.projectsRoot+" && ";
		commandSequence+=pathString;
	    
		String tempString ="";
		/**
	     * checkouts the Char, Lang, Math, and Time repository respectively
	     */
		for (int chartID=1; chartID <=26; chartID++)
   	    { 	    	
   	    	String chartString="";
   	    	tempString ="";
   	    	if(chartID==1)
   	    	{
   	    		chartString="mkdir "+Config.projectsRoot+"/chart"+" && ";
   	    		commandSequence+=chartString;
   	    	}	
   	    	tempString="defects4j checkout -p Chart -v "+Integer.toString(chartID)+"b"+" -w "+Config.projectsRoot
   	    			+"/chart/chart_"+Integer.toString(chartID);
   	    	commandSequence +=tempString;
   	    	commandSequence += " && ";

   	    }
   	    
		for(int LangID=1; LangID <=65; LangID++)
	    { 
   	    	String langString="";
   	    	tempString ="";
   	    	if(LangID==1)
   	    	{
   	    		langString="mkdir "+Config.projectsRoot+"/lang"+" && ";
   	    		commandSequence+=langString;
   	    	}	
   	    	tempString="defects4j checkout -p Lang -v "+Integer.toString(LangID)+"b"+" -w "+Config.projectsRoot
   	    			+"/lang/lang_"+Integer.toString(LangID);
   	    	commandSequence +=tempString;
  	    	commandSequence += " && ";
	    }

		for (int MathID=1; MathID <=106; MathID++)
	    {    	
   	    	String mathString="";
   	    	tempString ="";
   	    	if(MathID==1)
   	    	{
   	    		mathString="mkdir "+Config.projectsRoot+"/math"+" && ";
   	    		commandSequence+=mathString;
   	    	}	
   	    	tempString="defects4j checkout -p Math -v "+Integer.toString(MathID)+"b"+" -w "+Config.projectsRoot
   	    			+"/math/math_"+Integer.toString(MathID);
   	    	commandSequence +=tempString;
   	    	commandSequence += " && ";
	    }
		
		for (int TimeID=1; TimeID <=27; TimeID++)
	    {
   	    	String timeString="";
   	    	tempString ="";
   	    	if(TimeID==1)
   	    	{
   	    		timeString="mkdir "+Config.projectsRoot+"/time"+" && ";
   	    		commandSequence+=timeString;
   	    	}	
   	    	tempString="defects4j checkout -p Time -v "+Integer.toString(TimeID)+"b"+" -w "+Config.projectsRoot
   	    			+"/time/time_"+Integer.toString(TimeID);
   	    	commandSequence +=tempString;
	    	if (TimeID!=27)
	    	  commandSequence += " && ";
	    }
   	    
   	    /**
	     * starts a process to run the shell command
	     */
		String[] cmd = { "/bin/bash", "-c", commandSequence};
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
	}
}
