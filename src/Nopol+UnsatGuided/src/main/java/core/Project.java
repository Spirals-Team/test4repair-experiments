package core;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Project {

	 public String projectName;
	 public String logPath;
	 public static Map<Integer, Integer> ngelicValuelist = new HashMap<Integer,Integer>();
	 public static Map<Integer, String> classPathlist = new HashMap<Integer,String>();
	 public static Map<Integer, int[]> complianceLevellist = new HashMap<Integer,int[]>();
	 public static String libs="";
	 public static int bugNumber;
	 public static Map<Integer, String[]> srclist = new HashMap<Integer, String[]>();
	  
	 public Project (String Name) { 
		 projectName = Name;
		 Config.setPath();
		 logPath = Config.resultsRoot + "/";
		 logPath +=	Name;
	 }
	 
	 public static void initParameters(){
		 ngelicValuelist.clear();
		 classPathlist.clear();
		 complianceLevellist.clear();
		 libs="";
		 bugNumber=0;
		 srclist.clear();
	 }
	 
	 /**
	   * gets the information from the json file of the project to be repaired
	   */
	 public static void parseData (String projectName){	
		 initParameters();
		 String initialpath = Project.class.getResource("").toString();
		 initialpath = initialpath.replace("file:","");
		 initialpath = initialpath.replace("target/classes","src/main/java");
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 initialpath = initialpath.substring(0,initialpath.lastIndexOf("/"));
		 String path = initialpath + "/data/projects/" + projectName.toLowerCase() + ".json";
		 	 
		 JSONParser parser = new JSONParser();
         try{
	            FileReader fileReader = new FileReader(path);
	            JSONObject json = (JSONObject) parser.parse(fileReader);
	            
	            /**
	      	      * gets the number of the buggy versions for the project to be repaired
	      	      */
	            bugNumber=Integer.valueOf(json.get("nbBugs").toString());
	            
	            /**
	      	      * gets the buggy versions with angelic value
	      	      */
	            JSONObject jsonangelicValue = (JSONObject) json.get("angelicValue");
	            getListMapAngelicValue(jsonangelicValue);
	            
	            /**
	      	      * gets the class path information
	      	      */
	            JSONObject jsonclassPath = (JSONObject) json.get("classpath");
	            getListMapClassPath(jsonclassPath);
	            
	            /**
	      	      * gets the class compliance level information
	      	      */
	            JSONObject jsoncomplianceLevel = (JSONObject) json.get("complianceLevel");
	            getListMapComplianceLevel(jsoncomplianceLevel);
	            
	            /**
	      	      * gets the lib information
	      	      */
	            JSONArray libsArray = (JSONArray)json.get("libs");
	            for (int i = 0; i < libsArray.size(); i++) {
	                String libString = libsArray.get(i).toString();
                	libs+=":lib/";
	                libs+=libString;
	            }
	            
	            /**
	      	      * gets the cource code information
	      	      */
	            JSONObject jsonsrcInfo = (JSONObject) json.get("src");
	            getListSrcInfo(jsonsrcInfo);
	            
	            /**
	      	      * sorts the information obtained from json file
	      	      */
	            ngelicValuelist = sortByComparator(ngelicValuelist);
	            classPathlist = sortByComparator(classPathlist);
	            complianceLevellist = sortByComparator(complianceLevellist);
	            srclist = sortByComparator(srclist);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	     }
	 }
	 
	 /**
	   * gets the class compliance level information
	   */
     public static void getListMapComplianceLevel (JSONObject jsoncomplianceLevel){
		 for (Object key : jsoncomplianceLevel.keySet()) {
		        int  bugIndex = Integer.valueOf(key.toString());
		        JSONObject jsonSourceTarget = (JSONObject)jsoncomplianceLevel.get(key);
		        int sourceCompilanceLevel = Integer.valueOf(jsonSourceTarget.get("source").toString());
		        int targetCompilanceLevel = Integer.valueOf(jsonSourceTarget.get("target").toString());
		        int[] compilanceLevelArray = new int[2];
		        compilanceLevelArray[0] = sourceCompilanceLevel;
		        compilanceLevelArray[1] = targetCompilanceLevel;
		        complianceLevellist.put(bugIndex, compilanceLevelArray);
		    }
      }
	 
     /**
	   * gets the class path information
	   */
     public static void getListMapClassPath (JSONObject jsonclassPath){  
		 for (Object key : jsonclassPath.keySet()) {
		        int  bugIndex = Integer.valueOf(key.toString());
		        String  classPath = jsonclassPath.get(key.toString()).toString();
		        classPathlist.put(bugIndex, classPath);
		    }
     }
	 
     /**
	   * gets the buggy versions with angelic value
	   */
	 public static void getListMapAngelicValue (JSONObject jsonangelicValue){	 
		 for (Object key : jsonangelicValue.keySet()) {
		        int  bugIndex = Integer.valueOf(key.toString());
		        int  angelicValue = Integer.valueOf((jsonangelicValue.get(key.toString())).toString());    
		        ngelicValuelist.put(bugIndex,angelicValue);
		    }
     }
	 
	 /**
	   * gets the cource code information
	   */
     public static void getListSrcInfo (JSONObject jsonsrcInfo){
    	 for (Object key : jsonsrcInfo.keySet()) {
		        int  bugIndex = Integer.valueOf(key.toString());
		        JSONObject jsonSourceInfomation = (JSONObject)jsonsrcInfo.get(key);
		        String binjava = jsonSourceInfomation.get("binjava").toString();
		        String bintest = jsonSourceInfomation.get("bintest").toString();
		        String srcjava = jsonSourceInfomation.get("srcjava").toString();
		        String srctest = jsonSourceInfomation.get("srctest").toString();
		        String[] srcInfoArray = new String[4];
		        srcInfoArray[0] = binjava;
		        srcInfoArray[1] = bintest;
		        srcInfoArray[2] = srcjava;
		        srcInfoArray[3] = srctest;
		        srclist.put(bugIndex, srcInfoArray);
		    }
     }
     
     /**
	   * a model method that sorts the elements in the Map by key in ascending order
	   */
      private static Map sortByComparator(Map unsortMap)
      {
          List list=new LinkedList(unsortMap.entrySet());
          Collections.sort(list,new Comparator()
          {
               public int compare(Object o1,Object o2)
               {
                  return ((Comparable)((Map.Entry)(o1)).getKey()).compareTo(((Map.Entry) (o2)).getKey());
               }
          });

         Map sortedMap=new LinkedHashMap();
         for (Iterator it=list.iterator();it.hasNext();)
         {
           Map.Entry entry=(Map.Entry)it.next();
           sortedMap.put(entry.getKey(),entry.getValue());
         }
         return sortedMap; 
       }    
   }