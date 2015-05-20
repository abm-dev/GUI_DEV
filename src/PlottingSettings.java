/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Vector;



public class PlottingSettings implements Cloneable {
    

	
	/****************************************/
	
	public PlottingSettings clone()  {
        try {
			return (PlottingSettings) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	
	public static  boolean singleRunAnalyis = true;
	public static  boolean batchRunAnalyis = true;
	public static  boolean parameterAnalyis = true;
	
	
	
	
	public static  boolean ratiosSelectedForSingleTimeSeries;
	public static  boolean ratiosSelectedForMultipleTimeSeries;
	public static  boolean ratiosSelectedForSingleBandpassFilteredTimeSeries;
	public static  boolean ratiosSelectedForMultipleBandpassFilteredTimeSeries;
	
	public static boolean addLegend = false;
	public static boolean coloured = false;
	public static int transitionPhase = 0;
	public static String fileTypePlots = "pdf";
	
	/*List of variable Instances*/
	public static ArrayList <Agent> listOfAgentsVariableInstances = new ArrayList <Agent>();

	/*List of ratio Instances*/
	public static ArrayList <RatioInstance> listOfRatioInstances = new ArrayList <RatioInstance>();
	
	/*List of time series*/
	public static ArrayList <SingleTimeSeries> listOfSingleTimeSeries = new ArrayList <SingleTimeSeries>();
	public static DefaulSingleTimeSeriesSettings defaultsSingleTimeSeries = (new PlottingSettings()).new  DefaulSingleTimeSeriesSettings();
	
	/*List of multiple time series*/
	public static ArrayList <MultipleTimeSeries> listOfMultipleTimeSeries = new ArrayList <MultipleTimeSeries>();
	public static DefaulMultipleTimeSeriesSettings defaultsMultipleTimeSeries = (new PlottingSettings()).new  DefaulMultipleTimeSeriesSettings();
	
	

	
	
	
	/*List of multiple time series*/
	public static ArrayList <Histogram> listOfHistograms = new ArrayList <Histogram>();
	public static DefaultSettingsHistogram defaultsHistogram = (new PlottingSettings()).new  DefaultSettingsHistogram();
	
	/*List of multiple time series*/
	public static ArrayList <Boxplots> listOfBoxplots = new ArrayList <Boxplots>();
	public static DefaultSettingsBoxplots defaultsBoxplots = (new PlottingSettings()).new  DefaultSettingsBoxplots();


	/*List of multiple time series*/
	public static ArrayList <Heatmaps> listOfHeatmaps = new ArrayList <Heatmaps>();
	public static DefaultSettingsHeatmaps defaultsHeatmaps = (new PlottingSettings()).new  DefaultSettingsHeatmaps();
	
	
	/*List of multiple time series*/
	public static ArrayList <ScatterPlots> listOfScatterPlots = new ArrayList <ScatterPlots>();
	public static DefaultSettingsScatterPlots defaultsScatterPlots = (new PlottingSettings()).new  DefaultSettingsScatterPlots();
	
	



	public static boolean areTimeSeriesSelected(){
		
		
		for(int i=0; i < listOfAgentsVariableInstances.size();i++){
			
			if(listOfAgentsVariableInstances.get(i).isSelected && listOfAgentsVariableInstances.get(i).listOfVariableInstances.size()>0){
				return true;	
			}

		}
		
		
		return false;
		
	}
	
	
	public class Agent implements Cloneable {
	    

		
		/****************************************/
		
		public Agent clone()  {
	        try {
				return (Agent) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		String agentName;
		boolean isSelected = false;
		boolean singleTimeSeriesSelected;
		boolean singleBandpassFilteredTimeSeriesSelected;
		boolean histogrammSelected = false;
		boolean boxplotSelected = histogrammSelected;
		boolean heatmapSelected = false;
		boolean heatmap2VSelected = false;
		boolean correlationSelected = false;
		
		ArrayList<VariableInstance> listOfVariableInstances = new ArrayList<VariableInstance>();
		
		
		Agent(String nameOfAgent){
			
			agentName = nameOfAgent; 

		}
		
		
		Agent(){

			
		}
		
		
		
		ArrayList <Filter> filter = new ArrayList <Filter>();
		ArrayList <Weighting> weighting = new ArrayList <Weighting>();
		ArrayList <Partitioning> partitioning = new ArrayList <Partitioning>();

		DefaultSettings defaultSettings = new DefaultSettings ();
		
		
	}
	
	
	
	

	public class DefaultSettings implements Cloneable {
	    

		
		
		/****************************************/
		
		public DefaultSettings clone()  {
	        try {
				return (DefaultSettings) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		String defaultMethod;
		String defaultFilter1;
		String defaultFilter2;
		String defaultPartitioning;
		
		DefaultSettings(){
			
			defaultMethod = "Mean";
			defaultFilter1 = "No Filter";
			defaultFilter2 = "No Filter";
			defaultPartitioning = "No Partitioning";
			
		}
		
		

	}

	
	
	
	
public class Filter  implements Cloneable {
    

	
	
	/****************************************/
	
	public Filter clone()  {
        try {
			return (Filter) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
		
		String filterName;
		String variableName;
		String filterValue;
		String filterMethod;
		
		Filter(String filName, String varName, String value, String method){
			
			filterName = filName;
			variableName = varName;
			filterValue = value;
			filterMethod = method;
		}
		
		
		
	}




public class Weighting  implements Cloneable {
    

	
	
	/****************************************/
	
	public Weighting clone()  {
        try {
			return (Weighting) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
		
		String weightingVariable;
		
		Weighting(String varName){
			
			
			weightingVariable = varName;
			
		}
		
		
		
	}
	
	public class Partitioning implements Cloneable {
	    

		
		
		/****************************************/
		
		public Partitioning clone()  {
	        try {
				return (Partitioning) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		String partitioningName;
		String variableName;
		ArrayList<String> partitioningValues;
		
		
		Partitioning(String partName, String varName, ArrayList<String> values){
			
			partitioningName = partName;
			variableName = varName;
			partitioningValues = values;
		}
		
		
	}
	
	
	
	
	/*Holds a variable instance defined by the user*/
	public class VariableInstance implements Cloneable {
	    

		
		/****************************************/
		
		public VariableInstance clone()  {
	        try {
				return (VariableInstance) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		boolean isVariable;
		
		String instanceName;
		String agentName;
		Variable variable;
		AgentRatio agentRatio;
		String instanceMethod ;
		String whichFilter1;
		String whichFilter2;
		String whichPartitioning;
		String growthRate;
		
		
		
		boolean isSelectedForRatios = false;
		boolean selectedForSingleTimeSeries = false;
		boolean selectedForSingleBandpassFilteredTimeSeries = false;
		boolean isSelectedForMultipleTimeSeries = false;
		boolean isSelectedForMultipleBandpassFilteredTimeSeries = false;
		boolean isSelectedForCrossCorrelation= false;
		boolean isSelectedForScatterplots= false;
		
		boolean isSpecialVariableInstance;
		



		VariableInstance( String name, String aName, Variable var, String method, String filter1, String filter2, String partitioning, String growthRa){
			
			instanceName = name;
			agentName = aName;
			variable = var;
			instanceMethod = method;
			whichFilter1 = filter1;
			whichFilter2 = filter2;
			whichPartitioning = partitioning;
			growthRate = growthRa;
			isVariable= true;
			
			
		}
		
		
		VariableInstance( String name, String aName, AgentRatio aRtaio, String method, String filter1, String filter2, String partitioning, String growthRa){
			
			instanceName = name;
			agentName = aName;
			agentRatio = aRtaio;
			instanceMethod = method;
			whichFilter1 = filter1;
			whichFilter2 = filter2;
			whichPartitioning = partitioning;
			growthRate = growthRa;
			isVariable= false;
			
			
		}
		

		public boolean instanceContainsVariable(String variableName){
			
			if(isVariable){
				
				if(variable.name.equals(variableName))
					return true;
				else	
					return false;
		
			}else{
				
				if(agentRatio.numerator.name.equals(variableName))
					return true;
				else if(agentRatio.denominator.name.equals(variableName))
					return true;
				else
					return false;
						
			}

		}
		
		
		
	public String getName(){
				
				if(isVariable){
					
					return variable.name;
			
				}else{
					
					return agentRatio.ratioName;
							
				}
	
			}
		
		
	}
	
	
	
public class SingleTimeSeries implements Cloneable {
    

	
	/****************************************/
	
	public SingleTimeSeries clone()  {
        try {
			return (SingleTimeSeries) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }

		VariableInstance variableInstance;
		RatioInstance ratioInstance;
		
		boolean isVariableInstance;
		
		String instanceName;
		
		int tmin;
		int tmax;
		double lowerBound;
		double upperBound;
		boolean lowerBoundEnabled;
		boolean upperBoundEnabled;
		
		SingleTimeSeries(VariableInstance variableInst){
			
			variableInstance = variableInst;
			instanceName = variableInstance.instanceName;
			isVariableInstance = true;
			
			tmin = defaultsSingleTimeSeries.tmin;
			tmax = defaultsSingleTimeSeries.tmax;
			lowerBoundEnabled =false;
			lowerBound = -999;
			upperBoundEnabled = false;
			upperBound = 999;
			
			
			
		}
		
		SingleTimeSeries(RatioInstance ratioInst){
			
			ratioInstance = ratioInst;
			instanceName = ratioInstance.ratioInstanceName;
			isVariableInstance = false;
			
			tmin = defaultsSingleTimeSeries.tmin;
			tmax = defaultsSingleTimeSeries.tmax;
			lowerBoundEnabled =false;
			lowerBound = -999;
			upperBoundEnabled = false;
			upperBound = 999;
		}
		
	

	}


/*Holds a ratio defined by the user*/
public class RatioInstance implements Cloneable {
    

	
	/****************************************/
	
	public RatioInstance clone()  {
        try {
			return (RatioInstance) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	String ratioInstanceName;
	VariableInstance numerator;
	VariableInstance denominator;
	
	boolean selectedForSingleTimeSeries = false;
	boolean selectedForSingleBandpassFilteredTimeSeries = false;
	boolean isSelectedForMultipleTimeSeries = false;
	boolean isSelectedForMultipleBandpassFilteredTimeSeries = false;
	boolean isSelectedForCrossCorrelation= false;
	boolean isSelectedForScatterplots= false;
	
	RatioInstance(String rName, VariableInstance num, VariableInstance denom){
		
		ratioInstanceName = rName;
		numerator = num;
		denominator = denom;
	}
	

}


public class AgentRatio  implements Cloneable {
	
	
/****************************************/
	
	public AgentRatio clone()  {
        try {
			return (AgentRatio) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	String ratioName;
	Variable numerator;
	Variable denominator;
	
	AgentRatio(Variable num, Variable den){
		
		ratioName = num.name+"_"+den.name+"_agent_ratio";
		numerator = num;
		denominator = den;
		
	}
	
	
	
	
	
}


public class DefaulSingleTimeSeriesSettings implements Cloneable {
    

	
	
	/****************************************/
	
	public DefaulSingleTimeSeriesSettings clone()  {
        try {
			return (DefaulSingleTimeSeriesSettings) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	int tmin;
	int tmax;

	
	DefaulSingleTimeSeriesSettings(){
		
		tmin = 1;
		tmax = (int) Math.floor(SimulationSettings.numIterations);
	
		
	}
	
	

}




public class DefaulMultipleTimeSeriesSettings implements Cloneable {
    

	
	
	/****************************************/
	
	public DefaulMultipleTimeSeriesSettings clone()  {
        try {
			return (DefaulMultipleTimeSeriesSettings) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	int tmin;
	int tmax;
	

	DefaulMultipleTimeSeriesSettings(){
		
		tmin = 1;
		tmax = (int) Math.floor(SimulationSettings.numIterations);

		
	}
	
	

}




public class MultipleTimeSeries implements Cloneable {
    

	
	/****************************************/
	
	public MultipleTimeSeries clone()  {
        try {
			return (MultipleTimeSeries) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	int tmin;
	int tmax;
	String timeSeriesName;
	
	double lowerBound;
	double upperBound;
	boolean lowerBoundEnabled;
	boolean upperBoundEnabled;
	
	MultipleTimeSeries(String TSName){
		
		timeSeriesName = TSName;
		tmin = defaultsMultipleTimeSeries.tmin;
		tmax = defaultsMultipleTimeSeries.tmax;
		
		lowerBoundEnabled =false;
		lowerBound = -999;
		upperBoundEnabled = false;
		upperBound = 999;
	}
	
	ArrayList<RatioInstance> ratiosUsedForMultioleTimeSeries = new ArrayList<RatioInstance>();
	ArrayList<VariableInstance> variableInstancesUsedForMultioleTimeSeries = new ArrayList<VariableInstance>();

}







public class DefaultSettingsSingleBandpassFilteredTimeSeries implements Cloneable{
	
	public DefaultSettingsSingleBandpassFilteredTimeSeries clone()  {
        try {
			return (DefaultSettingsSingleBandpassFilteredTimeSeries) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	int tmin;
	int tmax;

	boolean correlation;
	boolean logarithmic;
	
	String aggregation;
	
	int low;
	int high;
	int Nfix;
	
	boolean drift;
	
	
	DefaultSettingsSingleBandpassFilteredTimeSeries(){
		
		tmin = 1;
		tmax = (int) Math.floor(SimulationSettings.numIterations);

		
		correlation = true;
		logarithmic  = false;
		
		aggregation = "Sum";
		
		low = 6;
		high = 32;
		Nfix = 4;
		
		drift = false;
		
	}
	

}



public class Histogram implements Cloneable{
	
	public Histogram clone()  {
        try {
			return (Histogram) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	

	String name;
	String instanceName="";
	String instanceNameDenominator="";
	AgentRatio agentRatio;
	String histBelongsTo;
	Variable variable;
	boolean isVariable;
	String Filter1;
	String Filter2;

	
	
	Histogram(String na,Variable var, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		variable = var;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = true;
	}
	
	
	Histogram(String na,AgentRatio ratio, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		agentRatio = ratio;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = false;
	}
	
	
	String getName(){
		
		if(isVariable)
			return variable.name;
		else
			return agentRatio.ratioName;
		
	}
	
	

}



public class DefaultSettingsHistogram implements Cloneable{
	
	public DefaultSettingsHistogram clone()  {
        try {
			return (DefaultSettingsHistogram) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	String Filter1;
	String Filter2;
	
	ArrayList<Iteration> iterations = new ArrayList<Iteration>();

	
	DefaultSettingsHistogram(){
		
		
		Filter1 = "No Filter";
		Filter2 = "No Filter";
		
		iterations.add(new Iteration(Integer.toString((int) Math.floor(SimulationSettings.numIterations))));
		
		
		
	}
	
	

}




public class Boxplots implements Cloneable{
	
	public Boxplots clone()  {
        try {
			return (Boxplots) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	

	String name;
	String instanceName="";
	String instanceNameDenominator="";
	AgentRatio agentRatio;
	String histBelongsTo;
	Variable variable;
	boolean isVariable;
	String Filter1;
	String Filter2;

	
	
	Boxplots(String na,Variable var, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		variable = var;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = true;
	}
	
	
	Boxplots(String na,AgentRatio ratio, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		agentRatio = ratio;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = false;
	}
	
	
	String getName(){
		
		if(isVariable)
			return variable.name;
		else
			return agentRatio.ratioName;
		
	}
	
	

}



public class DefaultSettingsBoxplots implements Cloneable{
	
	public DefaultSettingsBoxplots clone()  {
        try {
			return (DefaultSettingsBoxplots) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	String Filter1;
	String Filter2;
	
	ArrayList<Iteration> iterations = new ArrayList<Iteration>();

	
	DefaultSettingsBoxplots(){
		
		
		Filter1 = "No Filter";
		Filter2 = "No Filter";
		
		iterations.add(new Iteration(Integer.toString((int) Math.floor(SimulationSettings.numIterations))));
		
		
		
	}
	
	

}

public class Iteration implements Cloneable{
	
	public Iteration clone()  {
        try {
			return (Iteration) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }


	String iteration;
	
	Iteration(String it){
		
		iteration = it;
	}
}





public class Heatmaps implements Cloneable{
	
	public Heatmaps clone()  {
        try {
			return (Heatmaps) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	

	String name;
	String instanceName="";
	String instanceNameDenominator="";
	AgentRatio agentRatio;
	String histBelongsTo;
	Variable variable;
	boolean isVariable;
	String Filter1;
	String Filter2;
	int bins;
	boolean lowerBoundEnabled;
	boolean upperBoundEnabled;
	double lowerBound;
	double upperBound;	
	int tmin;
	int tmax;

	
	
	Heatmaps(String na,Variable var, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		variable = var;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = true;
		
		bins = defaultsHeatmaps.bins;
		lowerBoundEnabled =false;
		lowerBound = -999;
		upperBoundEnabled = false;
		upperBound = 999;	
		tmin= defaultsHeatmaps.tmin;
		tmax= defaultsHeatmaps.tmax;
	}
	
	
	Heatmaps(String na,AgentRatio ratio, String belongsTo, String fil1, String fil2){
		
		name = na;
		instanceName="";
		agentRatio = ratio;
		histBelongsTo = belongsTo;
		Filter1 = fil1;
	    Filter2 = fil2;
		isVariable = false;
		
		bins = defaultsHeatmaps.bins;
		lowerBoundEnabled =false;
		lowerBound = -999;
		upperBoundEnabled = false;
		upperBound = 999;
		tmin= defaultsHeatmaps.tmin;
		tmax= defaultsHeatmaps.tmax;
	}
	
	
	String getName(){
		
		if(isVariable)
			return variable.name;
		else
			return agentRatio.ratioName;
		
	}
	
	

}



public class DefaultSettingsHeatmaps implements Cloneable{
	
	public DefaultSettingsHeatmaps clone()  {
        try {
			return (DefaultSettingsHeatmaps) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	String Filter1;
	String Filter2;
	
	int bins;

	int tmin;
	int tmax;
	
	ArrayList<Iteration> iterations = new ArrayList<Iteration>();

	
	DefaultSettingsHeatmaps(){
		
		
		Filter1 = "No Filter";
		Filter2 = "No Filter";
		
		iterations.add(new Iteration(Integer.toString((int) Math.floor(SimulationSettings.numIterations))));
		
		bins = 75;
		tmin = 0;
		tmax = (int) Math.floor(SimulationSettings.numIterations);
		
	}
	
	

}








public class ScatterPlots implements Cloneable{
	
	public ScatterPlots clone()  {
        try {
			return (ScatterPlots) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	

	ScatterPlotComponent firstComponent;
	ScatterPlotComponent secondComponent;

	int timeLag;
	
	ScatterPlots(ScatterPlotComponent var1, ScatterPlotComponent var2){
		
		firstComponent = var1;
		secondComponent = var2;
		
		timeLag = defaultsScatterPlots.timeLags;
	}
	
	
	

}


public class ScatterPlotComponent implements Cloneable{
	
	public ScatterPlotComponent clone()  {
        try {
			return (ScatterPlotComponent) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	VariableInstance variableInstance;
	RatioInstance ratioInstance;
	
	boolean isVariableInstance;
	
	
	ScatterPlotComponent(VariableInstance varInstance){
		
		variableInstance = varInstance;
		isVariableInstance = true;
		
	}
	
	ScatterPlotComponent(RatioInstance varInstance){
		
		ratioInstance = varInstance;
		isVariableInstance = false;
		
	}
	
	String getName(){
		
		
		if(isVariableInstance)
			return variableInstance.instanceName;
		else
			return ratioInstance.ratioInstanceName;
	}
	
	
}



public class DefaultSettingsScatterPlots implements Cloneable{
	
	public DefaultSettingsScatterPlots clone()  {
        try {
			return (DefaultSettingsScatterPlots) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	int timeLags;
	
	DefaultSettingsScatterPlots(){
		
		timeLags = 0;
		
		
	}


}















public class Correlation implements Cloneable{
	
	public Correlation clone()  {
        try {
			return (Correlation) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	String name;

	Variable variable1;
	Variable variable2;
	String Filter1;
	String Filter2;
	String histBelongsTo;
	String instanceName1="";
	String instanceName2="";
	
	
	Correlation(Variable var1, Variable var2, String belongsTo, String fil1, String fil2){
		
		variable1 = var1;
		variable2 = var2;
		Filter1 = fil1;
		Filter2 = fil2;
		histBelongsTo = belongsTo;
		
		name = "corr_"+variable1.name+"_"+variable2.name;
	}
	
	
	
	
	
	
	

}



public class DefaultSettingsCorrelation implements Cloneable{
	
	public DefaultSettingsCorrelation clone()  {
        try {
			return (DefaultSettingsCorrelation) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	String Filter1;
	String Filter2;
	
	ArrayList<Iteration> iterations = new ArrayList<Iteration>();

	
	DefaultSettingsCorrelation(){
		
		
		Filter1 = "No Filter";
		Filter2 = "No Filter";

		
	}
	
	

}

public static void removeDeletedVarsFromVariableInstanceList(){
	
	
	/*Go through the variable instance lists and check whether the corresponding variable is still there. if the variable has been deleted then check if the 
	 * the affected variable instances are used for 1) ratios 2) plottings.  */
	
	for(int i=0; i < listOfAgentsVariableInstances.size();i++){
		
		for(int j=0; j < AgentSettings.agents.size(); j++){
			
			if(listOfAgentsVariableInstances.get(i).agentName.equals(AgentSettings.agents.get(j).agentName)){
				
				for(int k=0; k < listOfAgentsVariableInstances.get(i).listOfVariableInstances.size();k++){
					
					if(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).isVariable){
						
						boolean varFound = false;
						for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
							
							
							if(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
								
								varFound = true;
								break;
								
							}
							
							
						}
						
						if(!varFound){
							
							removeVarInstanceFromPlottingList(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).instanceName);
							removeRatioInstanceFromPlottingList(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).instanceName);
							
							listOfAgentsVariableInstances.get(i).listOfVariableInstances.remove(k);
							k--;
							
						}
				
					}else{
						
						boolean numFound = false;
						boolean denomFound = false;
						
						for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
							
							
							if(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).agentRatio.numerator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
								
								numFound = true;
								
							}
							
							if(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).agentRatio.denominator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
								
								denomFound = true;
								
							}
							
							if(numFound && denomFound)
								break;
							
						}
						
						if(!numFound || !denomFound){
							
							removeVarInstanceFromPlottingList(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).instanceName);
							removeRatioInstanceFromPlottingList(listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).instanceName);
							listOfAgentsVariableInstances.get(i).listOfVariableInstances.remove(k);
							k--;
							
						}
						
						
						
					}

				}
			
			}

		}

	}

	/*Call a function that checks the other plotting settings which do not use variable instances */
	removeOtherPlottingsIfVarDeleted();

}


/*<check if the variable instance with the given name is used for ratios.*/
public static void removeRatioInstanceFromPlottingList(String instanceName){
	
	for(int i=0; i < listOfRatioInstances.size(); i++ ){
		
		
		if(listOfRatioInstances.get(i).numerator.instanceName.equals(instanceName) || listOfRatioInstances.get(i).denominator.instanceName.equals(instanceName)){
			
			removeVarInstanceFromPlottingList(listOfRatioInstances.get(i).ratioInstanceName);
			listOfRatioInstances.remove(i);
			
			
			
		}
		
		
	}
	

	
}
/*Check if the instance with the given name is used for time series, band pass filtered time series etc.*/
public static void removeVarInstanceFromPlottingList(String instanceName){
	
	
	for(int i=0; i < listOfSingleTimeSeries.size(); i++){
		
		if(listOfSingleTimeSeries.get(i).isVariableInstance && listOfSingleTimeSeries.get(i).variableInstance.instanceName.equals(instanceName)){
			
			listOfSingleTimeSeries.remove(i);
			i--;
			
			
		}else if(!listOfSingleTimeSeries.get(i).isVariableInstance && listOfSingleTimeSeries.get(i).ratioInstance.ratioInstanceName.equals(instanceName)){
			
			
			listOfSingleTimeSeries.remove(i);
			i--;
			
		}
		
		
	}

	
	for(int i=0; i < listOfMultipleTimeSeries.size(); i++){
		
		
		for(int j=0; j < listOfMultipleTimeSeries.get(i).variableInstancesUsedForMultioleTimeSeries.size();j++){
			
			if(listOfMultipleTimeSeries.get(i).variableInstancesUsedForMultioleTimeSeries.get(j).instanceName.equals(instanceName)){
				
				listOfMultipleTimeSeries.get(i).variableInstancesUsedForMultioleTimeSeries.remove(j);
				j--;
				
			}
			
			
		}
		
		
		
		for(int j=0; j < listOfMultipleTimeSeries.get(i).ratiosUsedForMultioleTimeSeries.size();j++){
			
			if(listOfMultipleTimeSeries.get(i).ratiosUsedForMultioleTimeSeries.get(j).ratioInstanceName.equals(instanceName)){
				
				listOfMultipleTimeSeries.get(i).ratiosUsedForMultioleTimeSeries.remove(j);
				j--;
				
			}
			
			
		}
		
		
		if(listOfMultipleTimeSeries.get(i).variableInstancesUsedForMultioleTimeSeries.size()==0 && listOfMultipleTimeSeries.get(i).ratiosUsedForMultioleTimeSeries.size()==0)
		{
			listOfMultipleTimeSeries.remove(i);
			i--;
		}
		
		
	}
	
	

	for(int i=0; i < listOfScatterPlots.size(); i++){
		
		if(listOfScatterPlots.get(i).firstComponent.isVariableInstance && listOfScatterPlots.get(i).firstComponent.variableInstance.instanceName.equals(instanceName) ){
			
			listOfScatterPlots.remove(i);
			i--;
		}else if(!listOfScatterPlots.get(i).firstComponent.isVariableInstance && listOfScatterPlots.get(i).firstComponent.ratioInstance.ratioInstanceName.equals(instanceName) ){
			
			listOfScatterPlots.remove(i);
			i--;
		}else if(listOfScatterPlots.get(i).secondComponent.isVariableInstance && listOfScatterPlots.get(i).secondComponent.variableInstance.instanceName.equals(instanceName) ){
			
			listOfScatterPlots.remove(i);
			i--;
		}else if(!listOfScatterPlots.get(i).secondComponent.isVariableInstance && listOfScatterPlots.get(i).secondComponent.ratioInstance.ratioInstanceName.equals(instanceName) ){
			
			listOfScatterPlots.remove(i);
			i--;
		}
	}
		
	}




/*This function goes through the other plotting settings (those which do not use variable instances, i.e. correlation, heat maps etc) */
public static void removeOtherPlottingsIfVarDeleted(){
	
	

	for(int i=0; i < listOfHistograms.size(); i++){
		
		for(int j=0; j < AgentSettings.agents.size();j++)
		{
			
			if( AgentSettings.agents.get(j).agentName.equals(listOfHistograms.get(i).histBelongsTo)){
		
		
				if(listOfHistograms.get(i).isVariable){
			
			
					boolean varFound = false;

					for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
				
				
						if(listOfHistograms.get(i).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
							
							varFound = true;
							break;
							
						}
		
					}
			
			
				if(!varFound){
					
					listOfHistograms.remove(i);
					i--;
					break;
				}
				
			}else{
				
				boolean numFound = false;
				boolean denomFound = false;
				
				for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
					
					
					if(listOfHistograms.get(i).agentRatio.numerator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
						
						numFound = true;
						
					}
					
					if(listOfHistograms.get(i).agentRatio.denominator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
						
						denomFound = true;
						
					}
					
					if(numFound && denomFound)
						break;
					
				}
				
				if(!numFound || !denomFound){
					
		
					listOfHistograms.remove(i);
					i--;
					break;
					
				}
				
				
			}	
		}
		

		}
	}
	
	for(int i=0; i < listOfBoxplots.size(); i++){
		
		
		for(int j=0; j < AgentSettings.agents.size();j++)
		{
			
			if( AgentSettings.agents.get(j).agentName.equals(listOfBoxplots.get(i).histBelongsTo)){
		
		
				if(listOfBoxplots.get(i).isVariable){
			
			
					boolean varFound = false;

					for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
				
				
						if(listOfBoxplots.get(i).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
							
							varFound = true;
							break;
							
						}
		
					}
			
			
				if(!varFound){
					
					listOfBoxplots.remove(i);
					i--;
					break;
				}
				
			}else{
				
				boolean numFound = false;
				boolean denomFound = false;
				
				for(int l=0; l <  AgentSettings.agents.get(j).variableList.size();l++){
					
					
					if(listOfBoxplots.get(i).agentRatio.numerator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
						
						numFound = true;
						
					}
					
					if(listOfBoxplots.get(i).agentRatio.denominator.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)){
						
						denomFound = true;
						
					}
					
					if(numFound && denomFound)
						break;
					
				}
				
				if(!numFound || !denomFound){
					
		
					listOfBoxplots.remove(i);
					i--;
					break;
					
				}
				
				
			}	
		}
		

		}
		
		
		
	}




	
		
		
		
		
		
	

	
	
	
}


}
