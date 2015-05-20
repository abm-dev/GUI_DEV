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


public class BatchExperiments {
	
	
	public static ArrayList<Experiment> experimentBatch = new ArrayList<Experiment>();
	
	public class Experiment {
		
		
		String path;
		
		 SimulationSettings.SelectedModelParameter parameter1 = (new SimulationSettings()).new SelectedModelParameter();
		 SimulationSettings.SelectedModelParameter parameter2 = (new SimulationSettings()).new SelectedModelParameter();
	
		
	}

}
