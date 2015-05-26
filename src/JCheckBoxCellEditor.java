/***   Simulation GUI v0.99
   Copyright (C) 2014 Gregor Boehl, Sander van der Hoog, Herbert Dawid, Simon Gemkow, Philipp Harting

   This program is free software: you can redistribute it and/or modify
   it under the terms of the Open Database License (ODbL 1.0) as published by
   the Open Data Commons, see <http://opendatacommons.org/licenses/odbl/>.
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/


import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;


public class JCheckBoxCellEditor extends DefaultCellEditor implements TableCellEditor{
	
	JCheckBox cBox;
	
	int editedRow, editedCol;
	
	JCheckBoxCellEditor (JCheckBox checkBox){
	super (checkBox);
	cBox = checkBox;
	}
	
	
	// This method is called when a cell value is edited by the user.
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int rowIndex, int vColIndex) {
        // 'value' is value contained in the cell located at (rowIndex, vColIndex
    	
    	editedRow = rowIndex;
    	editedCol = vColIndex;
    	
    	System.out.println("NDD");
    	
        if (isSelected) {
            // cell (and perhaps other cells) are selected
        }

        // Configure the component with the specified value 
        if(value.equals(true))
        {
        ((JCheckBox)cBox).setSelected(true);
        }else
        {
        	((JCheckBox)cBox).setSelected(false);
        }
        return cBox;
      
        
    }
    
    
    // This method is called when editing is completed.
    // It must return the new value to be stored in the cell.
    public Object getCellEditorValue() {
    	
    	if(((JCheckBox)cBox).isSelected()){
    		return true;
    		
    	}else
    	{
    		return false;
    	}
    }
  
	
	public int getRow(){
		
		return editedRow;
		
	}
	
	
public int getColumn(){
		
		return editedCol;
		
	}
	
	
}
	

