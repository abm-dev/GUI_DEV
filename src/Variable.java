/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

	 
class Variable implements Cloneable {
    

	
	/****************************************/
	
	public Variable clone()  {
        try {
			return (Variable) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
		
		String type;
		String name; 
		String description;
		boolean isSelectedForPlotting;
		boolean isSelectedForHistograms =false;
		boolean isSelectedForBoxplots =isSelectedForHistograms;
		boolean isSelectedFilter = false;
		boolean isSelectedWeighted;
		
		Variable(String varName, String varType, String varDescription, boolean isSelected){
			
			name = varName;
			type = varType; 
			description = varDescription;
			isSelectedForPlotting = isSelected;
	
		}	
		
		
		
	

	
	
	
}
