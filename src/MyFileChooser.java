/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MyFileChooser extends JPanel implements ActionListener{

	String  currentDirectoty, textAppearsOnButton;
	boolean onlyDirectory;
	  
	JButton go;
    
	   JFileChooser chooser;
	   String choosertitle;
	    
	  public MyFileChooser(String initialWorkinDirectory, String textOnButton, boolean directoryOnly) {
		
		textAppearsOnButton = textOnButton;
		onlyDirectory = directoryOnly;
		currentDirectoty = initialWorkinDirectory;
	    go = new JButton(textOnButton);
	    go.addActionListener(this);
	    add(go);
	   }
	 
	  public void actionPerformed(ActionEvent e) {
	    	    
	    chooser = new JFileChooser();
	    chooser.setCurrentDirectory(new java.io.File(currentDirectoty));
	   
	    
	    if(onlyDirectory)
	    {
	    	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    }else
	    {
	    	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY );
	    }
	    //
	    // disable the "All files" option.
	    //
	    chooser.setAcceptAllFileFilterUsed(false);
	    //   
	    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
	    
	    
	    	
	      
	      	if(!chooser.getSelectedFile().equals(null))
	     	{
	      		/*Check whether file or directory exists*/
	      		File file =new File(chooser.getSelectedFile().getAbsolutePath());
		     	if(file.exists()) 
		     	{
		     		currentDirectoty = chooser.getSelectedFile().getAbsolutePath();
			    }else
			    {
			    	JOptionPane.showMessageDialog(null, "File or Directory does not exist!");
			    }
			    	  
		     	  System.out.println("workingDirectory : "+  currentDirectoty);	
	     	}
	    	
	      }
	    
	    
	     }
	  
	  
	  	public String getDirectoryOrFile(){
	  		
	  		System.out.println("getCurrentDirectoty: "+currentDirectoty);
	  		return currentDirectoty;
	  		
	  	}
	  	
	  	
	
}
