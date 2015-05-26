/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class OverwriteFlameXMLCFile {
	
	
	ArrayList<EndState> endStates;

	
	OverwriteFlameXMLCFile() throws IOException{
		
		
		endStates = new ArrayList<EndState>();
			

		
		String filePath = SimulationSettings.EURACE_MODEL_XML;
		String temFilePath;
		
		if(filePath.contains("/")){
			filePath = filePath.substring(0,filePath.lastIndexOf("/"))+"/xml.c";
			temFilePath = filePath.substring(0,filePath.lastIndexOf("/"))+"/tempxml.c";
		}else{
			filePath = filePath.substring(0,filePath.lastIndexOf("\\"))+"\\xml.c";
			temFilePath = filePath.substring(0,filePath.lastIndexOf("\\"))+"\\tempxml.c";
		}
		
		
		/* Search for end states*/
		
		for(int i=0; i < AgentSettings.agents.size();i++){
			
			endStates.add(new EndState(AgentSettings.agents.get(i).agentName , readNameEndStat(filePath,AgentSettings.agents.get(i) )));
			
		}
		
		
		String searchString;
		
		for(int i=0; i < AgentSettings.agents.size();i++){
			
			searchString = "void write_"+AgentSettings.agents.get(i).agentName+"_agent";
			
			if(i==0)
				  searchUsingBufferedReader(filePath,temFilePath,searchString,"}",false,"NDD1");
			else
				 searchUsingBufferedReader(filePath,temFilePath,searchString,"}",false,null);
			
		}
		
		
		searchString = "if(FLAME_integer_in_array(0, output_types, output_type_size) ||";
		
		for(int i=0; i < AgentSettings.agents.size();i++){
			
			if(i==0)
			 searchUsingBufferedReader(filePath,temFilePath,searchString,"fputs(", true,"NDD2");
			else
				 searchUsingBufferedReader(filePath,temFilePath,searchString,"fputs(", true, null);
		
			
		}





for(int i=0; i < AgentSettings.agents.size();i++){
	
	ArrayList<Variable> variables;
	
	variables = determineListOfvariables(AgentSettings.agents.get(i));
	
	if(variables.size()>0){
		for(int j=0; j < endStates.size();j++){
		
			if(endStates.get(j).agentName.equals(AgentSettings.agents.get(i).agentName)){
				writeStoreSettings(filePath,temFilePath, AgentSettings.agents.get(i),variables, i+1, endStates.get(j).endState);
				break;
			}
		}
	}
}






		removeMarker(filePath,temFilePath );
		
	
		
	}
	
	

	
	
	public static void searchUsingBufferedReader(String filePath,  String temFilePath, String searchQuery1, String searchQuery2, boolean includeLastQuery, String marker) throws IOException
    {
        searchQuery1 = searchQuery1.trim();
        searchQuery2 = searchQuery2.trim();
        BufferedReader br1 = null;
    
        
        PrintWriter wr= null;

        try
        {
            br1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            wr = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temFilePath)));
            String line1;
          
            while ((line1 = br1.readLine()) != null)
            {
            	
                if (line1.contains(searchQuery1))
                {
              
                	 while ((line1 = br1.readLine()) != null)
                     {
                		if(line1.contains(searchQuery2))
                			break;
                     }
                	 
                	 if(marker!=null){
	                	 wr.println(marker);
	                	 wr.flush();
                	 }
                	 
                   if(includeLastQuery){
                	   
                	   wr.println(line1);
                  	 	wr.flush();
                	   
                   }
  
                	
                }
                else
                {
                	 wr.println(line1);
                	 wr.flush();
                }
            }
        }
        finally
        {
            try
            {
                if (br1 != null)
                    br1.close();
                if(wr !=null)
                	wr.close();
                
                File infile = new File(filePath);
                if(!infile.delete())
                	System.out.println("Cannot delete xml.c file");
                
                File outfile = new File(temFilePath);
                if(!outfile.renameTo(infile))
                	System.out.println("Cannot rename temporary xml.c file");
                
            }
            catch (Exception e)
            {
                System.err.println("Exception while closing bufferedreader " + e.toString());
            }
        }

 
    }
	
	
	
	
	
	
	void writeStoreSettings(String pathFile, String tempPathFile, Agent agent, ArrayList<Variable> vars, int counter, String endState) throws IOException{
		

		 BufferedReader br1 = null;

	        PrintWriter wr= null;
	        try
	        {
	            br1 = new BufferedReader(new InputStreamReader(new FileInputStream(pathFile)));
	            wr = new PrintWriter(new OutputStreamWriter(new FileOutputStream(tempPathFile)));
	            String line1;
	          
	            while ((line1 = br1.readLine()) != null)
	            {
	                if (line1.contains("NDD1"))
	                {
	              
	                	
	                	 wr.println("");
	                	 wr.println("");
	                	 wr.println("");
	                	 wr.println("void write_"+agent.agentName+"_agent(FILE *file, xmachine_memory_"+agent.agentName+" * current)");
	                	 wr.println("{");
	                	 wr.println("char data[1000];");
	                    
	                	 wr.println("fputs(\"<xagent>\\n\" , file);");
	                	wr.println("fputs(\"<name>"+agent.agentName+"</name>\\n\", file);");
	                	wr.println("fputs(\"<id>\", file);");
	                	wr.println("sprintf(data, \"%d\", current->id);");
	                	wr.println(" fputs(data, file);");
	                	 wr.println("fputs(\"</id>\\n\", file);");
	                	 
	                	
	                	 
	                	 wr.flush();
	                	 
	                	 
	                	 for(int i =0; i < vars.size();i++){
	                		 
	                		 wr.println("fputs(\"<"+vars.get(i).name+">\", file);");
	 	                	wr.println("sprintf(data, \"%"+vars.get(i).type+"\", current->"+vars.get(i).name+");");
	 	                	wr.println(" fputs(data, file);");
	 	                	 wr.println("fputs(\"</"+vars.get(i).name+">\\n\", file);");
	 	                	 wr.flush();
	                	 }
	                	 wr.println("fputs(\"</xagent>\\n\" , file);");
	                	 wr.println("}");
	                	 wr.println("NDD1");
	                	 wr.flush();
	                	 
	                	 
	                }else if(line1.contains("NDD2")){
	                	
	                	
	                	 wr.println("if(FLAME_integer_in_array(0, output_types, output_type_size) || FLAME_integer_in_array("+counter+", output_types, output_type_size))");
	                			 wr.println("{");
	                			wr.println("      current_xmachine_"+agent.agentName+"_holder = "+agent.agentName+"_"+endState+"_state->agents;");
	                			wr.println(" while(current_xmachine_"+agent.agentName+"_holder)");
	                			wr.println("  {");
	                			wr.println("  write_"+agent.agentName+"_agent(file, current_xmachine_"+agent.agentName+"_holder->agent);");
	                		    wr.println("current_xmachine_"+agent.agentName+"_holder = current_xmachine_"+agent.agentName+"_holder->next;");
	                			wr.println("  }");
	                			wr.println("   }");
	                			wr.println("");
	                			 wr.println("NDD2");
	                			 wr.flush();
	                	
	                }else
	                {
	                	 wr.println(line1);
	                	 wr.flush();
	                }
	            }
	        }
	        finally
	        {
	            try
	            {
	                if (br1 != null)
	                    br1.close();
	                if(wr !=null)
	                	wr.close();
	                
	                File infile = new File(pathFile);
	                if(!infile.delete())
	                	System.out.println("Cannot delete xml.c file");
	                
	                File outfile = new File(tempPathFile);
	                if(!outfile.renameTo(infile))
	                	System.out.println("Cannot rename temporary xml.c file");
	                
	            }
	            catch (Exception e)
	            {
	                System.err.println("Exception while closing bufferedreader " + e.toString());
	            }
	        }

		
		
		
		
	
		
		
		
	}
	
	
	
	
	
	
	
	void removeMarker(String filePath, String tempFilePath) throws IOException{
		
		
		 BufferedReader br1 = null;
		    
	        
	        PrintWriter wr= null;

	        try
	        {
	            br1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
	            wr = new PrintWriter(new OutputStreamWriter(new FileOutputStream(tempFilePath)));
	            String line1;
	          
	            while ((line1 = br1.readLine()) != null)
	            {
	            	
	                if (line1.contains("NDD"))
	                {
	             
	                	
	                }
	                else
	                {
	                	 wr.println(line1);
	                	 wr.flush();
	                }
	            }
	        }
	        finally
	        {
	            try
	            {
	                if (br1 != null)
	                    br1.close();
	                if(wr !=null)
	                	wr.close();
	                
	                File infile = new File(filePath);
	                if(!infile.delete())
	                	System.out.println("Cannot delete xml.c file");
	                
	                File outfile = new File(tempFilePath);
	                if(!outfile.renameTo(infile))
	                	System.out.println("Cannot rename temporary xml.c file");
	                
	            }
	            catch (Exception e)
	            {
	                System.err.println("Exception while closing bufferedreader " + e.toString());
	            }
	        }

		
		
	}
	
	
	/*Todo*/
	String readNameEndStat(String filePath, Agent agent) throws IOException{
		
		String searchQuery1 =  "if(FLAME_integer_in_array(0, output_types, output_type_size) ||";
		searchQuery1 = searchQuery1.trim();
		String searchQuery2 = "current_xmachine_"+agent.agentName;
		
		String nameEndState= null;
		
		searchQuery2 = searchQuery2.trim();
		BufferedReader br1 = null;
    
  
        try
        {
            br1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
         
            String line1;
          
            while ((line1 = br1.readLine()) != null)
            {
            	
                if (line1.contains(searchQuery1))
                {
              
                	 while ((line1 = br1.readLine()) != null)
                     {
                		if(line1.contains(searchQuery2)){
                			
                			nameEndState = line1.substring(line1.indexOf("=")+1);
                			
                			nameEndState = nameEndState.replaceFirst(" "+agent.agentName+"_","");
                			nameEndState = nameEndState.substring(0, nameEndState.lastIndexOf("_"));
                			break;
                		}
                			
                     }
                	 
                	break;
                	
                }
                else
                {
                
                }
            }
        }
        finally
        {
            try
            {
                if (br1 != null)
                    br1.close();
               
         
                
            }
            catch (Exception e)
            {
                System.err.println("Exception while closing bufferedreader " + e.toString());
            }
        }
		
		
		return nameEndState;
		
		
	}
	
	/*Todo*/
	ArrayList<Variable> determineListOfvariables(Agent agent){
		
		ArrayList<Variable> tempList = new ArrayList<Variable>();
		
		
	
		for(int i=0; i<agent.variableList.size();i++){
			
			boolean found = false;
			
			if(agent.variableList.get(i).isSelectedForPlotting){
			
				if(!agent.variableList.get(i).name.equals("id")){
					if(agent.variableList.get(i).type.equals("int")){
							tempList.add(new Variable(agent.variableList.get(i).name,"d"));
					}else{
						
						tempList.add(new Variable(agent.variableList.get(i).name,"f"));
					}
					found = true;
			}
			} 
			
			if(agent.variableList.get(i).isSelectedForHistograms && !found){
			
				if(!agent.variableList.get(i).name.equals("id")){
					if(agent.variableList.get(i).type.equals("int")){
							tempList.add(new Variable(agent.variableList.get(i).name,"d"));
					}else{
						
						tempList.add(new Variable(agent.variableList.get(i).name,"f"));
					}
					found = true;;
			}
			}
				
				if(agent.variableList.get(i).isSelectedForBoxplots&& !found){ 
					if(!agent.variableList.get(i).name.equals("id")){
						if(agent.variableList.get(i).type.equals("int")){
								tempList.add(new Variable(agent.variableList.get(i).name,"d"));
						}else{
							
							tempList.add(new Variable(agent.variableList.get(i).name,"f"));
						}
						found = true;;
				}
				}


				if(agent.variableList.get(i).isSelectedFilter && !found){
					if(!agent.variableList.get(i).name.equals("id")){
						if(agent.variableList.get(i).type.equals("int")){
								tempList.add(new Variable(agent.variableList.get(i).name,"d"));
						}else{
							
							tempList.add(new Variable(agent.variableList.get(i).name,"f"));
						}
						found = true;
				}
				}


				if(agent.variableList.get(i).isSelectedWeighted && !found){
					if(!agent.variableList.get(i).name.equals("id")){
						if(agent.variableList.get(i).type.equals("int")){
								tempList.add(new Variable(agent.variableList.get(i).name,"d"));
						}else{
							
							tempList.add(new Variable(agent.variableList.get(i).name,"f"));
						}
						found = true;
				}
				}
			
			
			}
		
		
		
		
		
		
		
	
		return tempList;
		
	}
	
	
	
	
	
	
	class Variable{
		
		String name;
		String type;
		
		Variable(String na, String ty){
			
			name = na;
			type= ty;
		}
		
	}
	
	
class EndState{
		
		String agentName;
		String endState;
		
		EndState(String na, String ty){
			
			agentName = na;
			endState= ty;
		}
		
	}
	
}


