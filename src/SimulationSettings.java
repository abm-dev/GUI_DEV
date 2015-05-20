/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.util.ArrayList;


public class SimulationSettings implements Cloneable {
    

	
	/****************************************/
	
	public SimulationSettings clone()  {
        try {
			return (SimulationSettings) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	public static String Experiment_Name = "Experiment_Name";
	public static int numBatchRuns = 10;
	public static int numIterations = 5000;
	public static int numProcessors;
	public static int DO_RUN = 1;
	public static int SNAPSHOTS_FREQUENCY = 1000;
	public static  boolean SNAPSHOTS = false;
	public static int DO_COMPRESS_KEEP_ORIGINAL = 0;
	public static int DO_COMPRESS_REMOVE_ORIGINAL = 0;
	public static int REMOVE = 1;
	public static int DO_REMOVE_DB = 0;
	public static int DO_DECOMPRESS = 0;
	public static String WORKING_DIRECTORY = ".";
	public static String MAIN_EXECUTABLE =".";
	public static String EURACE_MODEL_XML = ".eurace_model.xml";
	public static String ZERO_XML_FILE ="0.xml";
	public static String PATH_TO_RSCRIPTS = "./Data_Analysis_GUI_Serial";
	public static String PATH_TO_XPARSER = "./";
	public static boolean experimentBuilt = false;
	public static int numParameters = 0;
	public static boolean saveAllAgentVariables = true;
	public static boolean execXParser = false;
	
	public static SelectedModelParameter PARAMETER_1= (new SimulationSettings()).new SelectedModelParameter();
	public static SelectedModelParameter PARAMETER_2=(new SimulationSettings()).new SelectedModelParameter();
	
	
	
	
	public static ArrayList<AgentNumber> agentNumbers = new ArrayList<AgentNumber>();
	
	
	public class SelectedModelParameter implements Cloneable {
	    

		
		/****************************************/
		
		public SelectedModelParameter clone()  {
	        try {
				return (SelectedModelParameter) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		public String name;
		public String type;
		public ArrayList<Value> values = new ArrayList<Value>();
		
		/*Standard constructor*/
		SelectedModelParameter(){
			
			name = "";
			type = "";
		}
		
		

	}
	

	public class Value {
		
		String value;
		
		Value(String val){
			
			value = val;
			
		}
		
	}
	
	
	public class AgentNumber{
		
		
		String agentName;
		int numberOfAgents;
		
		
		AgentNumber(String name, int numb){
			
			agentName  = name;
			numberOfAgents = numb;
		}

	}

	

}
