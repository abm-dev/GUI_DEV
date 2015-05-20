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


public class SelectedModelParameter {
	
	String name;
	String type;
	ArrayList<String> values = new ArrayList<String>();
	
	/*Standard constructor*/
	SelectedModelParameter(){
		
	}
	
	public void setName(String na){
		
		name = na;
		
	}
	
	public void setType(String ty){
		
		type = ty;
		
	}

	public void addValue(String value){
	
	values.add(value);
	}
	
	public void removeValue(int index){
		
		values.remove(index);
	
}
	
	
public String getName(){
		
	 	return name;
		
	}
	
	public String getType(){
		
		return type;
		
	}

	public ArrayList<String> getValue(){
	
		return values;
	
}
	

}
