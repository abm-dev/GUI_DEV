/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;


public class EditorListener implements CellEditorListener{
	
	
	public void editingStopped(ChangeEvent e) {
        System.out.println("A cell has been edited.");
        
       System.out.println(e.getSource().getClass());
        
     //  e.getSource().update();
    }
	

    /**
     * Listens for cells where editing has been canceled (cell data has not been
     * changed).
     */
    public void editingCanceled(ChangeEvent e) {
        System.out.println("Editing of a cell has been canceled.");
    }

}
