/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class writeGeneralSettingsToFile {
	
	private BufferedWriter bw;

	String pathToFile;
	
	writeGeneralSettingsToFile(String path, boolean withBashStatement){
		
		pathToFile = path;
		
		try{
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile,false)));
			
			if(withBashStatement)
				{
				bw.append("#!/bin/bash");
				bw.newLine();
				}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Content was not written to file!");
		}
		
	}
	
	
	public void writeToFile(String toWrite){
		
		try{
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile,true)));
			bw.append(toWrite);
			bw.newLine();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Content was not written to file!");
		}
		
	}
	
	
public void writeToFileWithoutNewLine(String toWrite){
		
		try{
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile,true)));
			bw.append(toWrite);
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Content was not written to file!");
		}
		
	}
		
		
	

}
