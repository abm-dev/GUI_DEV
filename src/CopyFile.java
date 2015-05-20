/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

import java.io.*;

import javax.swing.JOptionPane;

public class CopyFile{
		  public void copyfile(String srFile, String dtFile){
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
		 
		}