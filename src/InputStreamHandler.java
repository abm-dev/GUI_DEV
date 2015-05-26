/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.io.IOException;
import java.io.InputStream;


public class InputStreamHandler extends Thread{

	/**
	  * Stream being read
	  */
			
	 private InputStream m_stream;
			
	 /**
	  * The StringBuffer holding the captured output
	  */
			
	 private StringBuffer m_captureBuffer;
			
	 /**
	  * Constructor. 
	  * 
	  * @param 
	  */
			
	 InputStreamHandler( StringBuffer captureBuffer, InputStream stream )
	 {
	  m_stream = stream;
	  m_captureBuffer = captureBuffer;
	  start();
	 }
			
	 /**
	  * Stream the data.
	  */
			
	 public void run()
	 {
	  try
	  {
	   int nextChar;
	   while( (nextChar = m_stream.read()) != -1 )
	   {
	    m_captureBuffer.append((char)nextChar);
	   }
	  }
	  catch( IOException ioe )
	  {
	  }
	 }
	
	
}
