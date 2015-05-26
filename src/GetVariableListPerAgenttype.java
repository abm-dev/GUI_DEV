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
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class GetVariableListPerAgenttype {
	
	boolean typeFilter;
	String DirectoryEuraceModelXML;
	ArrayList<VariableList> variableListAgent;
	ArrayList<Agent> agentList;
	Vector<File> files = new Vector<File>();
	ArrayList<Variable> varList;
	
	GetVariableListPerAgenttype(ArrayList<Agent> agents, boolean filter, String path){
		
		agentList = agents;
		typeFilter = filter;
		DirectoryEuraceModelXML = path;
	}
	
	
	
		
	  
	

}
