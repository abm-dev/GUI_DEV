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
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Vector;


public class RecursiveFileList {
	
	
	public static File[] listFilesAsArray(
			File directory,
			FilenameFilter filter,
			boolean recurse)
	{
		Collection<File> files = listFiles(directory,
				filter, recurse);
		
		File[] arr = new File[files.size()];
		return files.toArray(arr);
	}

	public static Collection<File> listFiles(
	
			File directory,
			FilenameFilter filter,
			boolean recurse)
	{
		// List of files / directories
		Vector<File> files = new Vector<File>();
	
		
		// Get files / directories in the directory
		File[] entries = directory.listFiles();
		
		// Go over entries
		for (File entry : entries)
		{

			// If there is no filter or the filter accepts the 
			// file / directory, add it to the list
			if (filter == null || filter.accept(directory, entry.getName()))
			{
				files.add(entry);
			}
			
			// If the file is a directory and the recurse flag
			// is set, recurse into the directory
			if (recurse && entry.isDirectory())
			{
				files.addAll(listFiles(entry, filter, recurse));
			}
		}
		
		// Return collection of files
		return files;		
	}

}
