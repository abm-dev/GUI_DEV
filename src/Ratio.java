/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


/*Holds the information concerning the Rations defined in the plotting GUI*/
public class Ratio implements Cloneable {
	
	
	public Ratio clone()  {
        try {
			return (Ratio) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	
	String ratioName;
	VariableForRatio variableNumerator;
	VariableForRatio variableDenominator;
	boolean timeSeriesSelected;
	
	TimeSeriesSettings timeSeriesSettings;
	
	
	Ratio(String name, String instanceNameNumerator, String agentTypeNumerator,String instanceNameDenominator, String agentTypeDenominator){
		
		ratioName = name;
		variableNumerator = new VariableForRatio(agentTypeNumerator, instanceNameNumerator);
		variableDenominator = new VariableForRatio(agentTypeDenominator, instanceNameDenominator);
		
		timeSeriesSettings = new TimeSeriesSettings();
		
	}
	
	
	
	public class TimeSeriesSettings implements Cloneable{
		
		public TimeSeriesSettings clone()  {
	        try {
				return (TimeSeriesSettings) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
	        
	        
	 
			
	        
	    }
		
	       int tmin = 0 ;
	       int tmax = 0 ;

	}

	
	
	
	
	public class VariableForRatio implements Cloneable{
		
		public VariableForRatio clone()  {
	        try {
				return (VariableForRatio) super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
				return null;
			}
			
	        
	    }
		
		String agentType;
		String variableInstanceName;
		
		VariableForRatio(String type, String name){
			
			agentType = type;
			variableInstanceName = name;	
		}

		
	}

}
