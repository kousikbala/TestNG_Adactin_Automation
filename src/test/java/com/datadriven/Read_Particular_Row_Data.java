package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Particular_Row_Data {
	
public static void read_Particular_Row_Data() throws IOException {
		
        File f = new File ("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\practice data driver.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		

			Row r = s.getRow(0);
			
			for (int j=0; j<r.getPhysicalNumberOfCells(); j++)
			{	
			Cell c = r.getCell(j);
				
				
			CellType type = c.getCellType();
			
		
			
			if(type.equals(CellType.STRING)) {
		    	 String Value = c.getStringCellValue();
		    	 System.out.println(Value);
		     }
			
		     else if (type.equals(CellType.NUMERIC)) {
		    	 double numericValue = c.getNumericCellValue();
		    	 int v = (int) numericValue;
		    	 String Value = Integer.toString(v);
		    	 
		    	 System.out.println(Value);
				
				
			}
		}
		
	wb.close();	
		
	}
		
	
	public static void main(String[] args) throws IOException {
		
		read_Particular_Row_Data();
		
		
		
	}
	

	}



