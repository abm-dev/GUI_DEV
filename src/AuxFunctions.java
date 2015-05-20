/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JOptionPane;




public class AuxFunctions {
	
	
	
	public static PlottingSettings.Agent DeepCopyAgentVariableInstance (PlottingSettings.Agent agentInstanceListOrig)
	{

		
		
		
		PlottingSettings.Agent agentInstanceListClone = (new PlottingSettings()).new Agent(agentInstanceListOrig.agentName);
		
		agentInstanceListClone.isSelected = agentInstanceListOrig.isSelected;
		agentInstanceListClone.singleTimeSeriesSelected = agentInstanceListOrig.singleTimeSeriesSelected;
		agentInstanceListClone.singleBandpassFilteredTimeSeriesSelected = agentInstanceListOrig.singleBandpassFilteredTimeSeriesSelected;
		agentInstanceListClone.histogrammSelected = agentInstanceListOrig.histogrammSelected;
		agentInstanceListClone.boxplotSelected = agentInstanceListOrig.boxplotSelected;
		agentInstanceListClone.heatmapSelected = agentInstanceListOrig.heatmapSelected;
		agentInstanceListClone.correlationSelected = agentInstanceListOrig.correlationSelected;

		/*TODO Add here other markers */
		
		for(int i=0; i<agentInstanceListOrig.listOfVariableInstances.size();i++){
			
			agentInstanceListClone.listOfVariableInstances.add(agentInstanceListOrig.listOfVariableInstances.get(i).clone());
			
			if(agentInstanceListClone.listOfVariableInstances.get(i).isVariable)
				agentInstanceListClone.listOfVariableInstances.get(i).variable =agentInstanceListOrig.listOfVariableInstances.get(i).variable.clone();
			else
				agentInstanceListClone.listOfVariableInstances.get(i).agentRatio =agentInstanceListOrig.listOfVariableInstances.get(i).agentRatio.clone();
		}
		
		agentInstanceListClone.defaultSettings = agentInstanceListOrig.defaultSettings.clone();
		
		for(int i=0; i<agentInstanceListOrig.filter.size();i++){
				
				agentInstanceListClone.filter.add(agentInstanceListOrig.filter.get(i).clone());
	
			}
		
		for(int i=0; i<agentInstanceListOrig.partitioning.size();i++){
			
			agentInstanceListClone.partitioning.add(agentInstanceListOrig.partitioning.get(i).clone());
	
		}
		
		for(int i=0; i<agentInstanceListOrig.weighting.size();i++){
			
			agentInstanceListClone.weighting.add(agentInstanceListOrig.weighting.get(i).clone());
	
		}

		return agentInstanceListClone;		
	}
	
	
	public static PlottingSettings.SingleTimeSeries DeepCopyTimeSeriesList (PlottingSettings.SingleTimeSeries tsListOrig)
	{
		
		PlottingSettings.SingleTimeSeries timeSeriesListClone;
		
		if(tsListOrig.isVariableInstance)
			timeSeriesListClone = (new PlottingSettings()).new SingleTimeSeries(tsListOrig.variableInstance.clone());
		else
			timeSeriesListClone = (new PlottingSettings()).new SingleTimeSeries(tsListOrig.ratioInstance.clone());
		
		timeSeriesListClone.tmin = tsListOrig.tmin;
		timeSeriesListClone.tmax = tsListOrig.tmax;
		timeSeriesListClone.upperBound = tsListOrig.upperBound;
		timeSeriesListClone.lowerBound = tsListOrig.lowerBound;
		timeSeriesListClone.upperBoundEnabled = tsListOrig.upperBoundEnabled;
		timeSeriesListClone.lowerBoundEnabled = tsListOrig.lowerBoundEnabled;
			
		return timeSeriesListClone;
		
	}
	
	
	public static PlottingSettings.RatioInstance DeepCopyRatioInstance (PlottingSettings.RatioInstance ratioInstanceListOrig)
	{

		PlottingSettings.RatioInstance ratioInstanceListClone = (new PlottingSettings()).new RatioInstance(ratioInstanceListOrig.ratioInstanceName,ratioInstanceListOrig.numerator.clone(),ratioInstanceListOrig.denominator.clone());
		
		ratioInstanceListClone.selectedForSingleTimeSeries = ratioInstanceListOrig.selectedForSingleTimeSeries;
		ratioInstanceListClone.selectedForSingleBandpassFilteredTimeSeries = ratioInstanceListOrig.selectedForSingleBandpassFilteredTimeSeries;
		
		ratioInstanceListClone.isSelectedForCrossCorrelation = ratioInstanceListOrig.isSelectedForCrossCorrelation;
		ratioInstanceListClone.isSelectedForMultipleBandpassFilteredTimeSeries = ratioInstanceListOrig.isSelectedForMultipleBandpassFilteredTimeSeries;
		ratioInstanceListClone.isSelectedForMultipleTimeSeries = ratioInstanceListOrig.isSelectedForMultipleTimeSeries;
		ratioInstanceListClone.isSelectedForScatterplots = ratioInstanceListOrig.isSelectedForScatterplots;
	
		return ratioInstanceListClone;		
	}
	
	public static PlottingSettings.MultipleTimeSeries DeepCopyMultipleTimeSeriesList (PlottingSettings.MultipleTimeSeries tsListOrig)
	{
		
		PlottingSettings.MultipleTimeSeries timeSeriesListClone =  (new PlottingSettings()).new MultipleTimeSeries(tsListOrig.timeSeriesName);
	
		for(int i=0; i< tsListOrig.variableInstancesUsedForMultioleTimeSeries.size();i++){
			
			timeSeriesListClone.variableInstancesUsedForMultioleTimeSeries.add(tsListOrig.variableInstancesUsedForMultioleTimeSeries.get(i).clone());
		
		}
		
		for(int i=0; i< tsListOrig.ratiosUsedForMultioleTimeSeries.size();i++){
			
			timeSeriesListClone.ratiosUsedForMultioleTimeSeries.add(tsListOrig.ratiosUsedForMultioleTimeSeries.get(i).clone());
		
		}
		
		timeSeriesListClone.tmax = tsListOrig.tmax;
		timeSeriesListClone.tmin = tsListOrig.tmin;
		timeSeriesListClone.upperBoundEnabled = tsListOrig.upperBoundEnabled;
		timeSeriesListClone.lowerBoundEnabled = tsListOrig.lowerBoundEnabled;
		timeSeriesListClone.upperBound = tsListOrig.upperBound;
		timeSeriesListClone.lowerBound = tsListOrig.lowerBound;

		
		return timeSeriesListClone;
		
	}
	
	
	
	
	
	
	
	
	public static ArrayList<Agent> deepCopyAgentSettingsList (ArrayList<Agent> agentListOrig)
	{
		
		 ArrayList<Agent> agentListClone = new ArrayList<Agent>();
		 
		 for(int i=0; i<agentListOrig.size();i++){
			 
			 
			 agentListClone.add(new Agent(agentListOrig.get(i).agentName));
			 
			 agentListClone.get(i).dataStorageSettings = agentListOrig.get(i).dataStorageSettings.clone();
			 
			 
			 for(int j=0; j<agentListClone.get(i).variableList.size();j++ ){
				 
				 agentListClone.get(i).variableList.remove(j);
				 j--;
 
			 }
			 
			 
			 for(int j=0; j<agentListOrig.get(i).variableList.size();j++ ){
				 
				 agentListClone.get(i).variableList.add(agentListOrig.get(i).variableList.get(j).clone());
 
			 }
			 
		 }
		
		
		
		
		
		
			
		return agentListClone;
		
	}
	
	
	
	  public static void copyfile(String srFile, String dtFile){
		  try{
		  File f1 = new File(srFile);
		  File f2 = new File(dtFile);
		  InputStream in = new FileInputStream(f1);
		  
		  //For Append the file.
		//  OutputStream out = new FileOutputStream(f2,true);

		  //For Overwrite the file.
		  OutputStream out = new FileOutputStream(f2);

		  byte[] buf = new byte[1024];
		  int len;
		  while ((len = in.read(buf)) > 0){
		  out.write(buf, 0, len);
		  }
		  in.close();
		  out.close();
		  System.out.println("File copied.");
		  }
		  catch(FileNotFoundException ex){
		  System.out.println(ex.getMessage() + " in the specified directory.");
		  JOptionPane.showMessageDialog(null,srFile+ " not found  in the specified directory.");
		  }
		  catch(IOException e){
		  System.out.println(e.getMessage());  
		  }
		  }
	  
	  
	  
	  public class MyStringAsIntegerComparable implements Comparator<Integer>{


		    public int compare(Integer o1, Integer o2) {
		    	
		    	System.out.println("BP1");
		    
		    	System.out.println("BP1");
		        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
		    }


		}
	  
	  
	  public class MyStringAsDoubleComparable implements Comparator<Double>{


		    public int compare(Double o1, Double o2) {
		    	
		    	System.out.println("BP1");
		    
		    	System.out.println("BP1");
		        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
		    }


		}
	
	

}
