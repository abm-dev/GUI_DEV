/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/



public class ModelParameter implements Cloneable {
    

	
	/****************************************/
	
	public ModelParameter clone()  {
        try {
			return (ModelParameter) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			return null;
		}
		
        
    }
	
	String type;
	String name;
	String description;
	String value;
	
	ModelParameter(String ty, String na, String descr){
		
		type = ty;
		name = na;
		description = descr;
	}
	
	public String getType(){
		
		return type;
	}
	
	public String getName(){
		
		return name;
	}

	public String getDescription(){
		
		return description;
	}

}
