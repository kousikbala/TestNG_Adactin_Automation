package com.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\hp\\Desktop\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
        wb.createSheet("User_data").createRow(0).createCell(0).setCellValue("email");
        
        wb.getSheet("User_data").getRow(0).createCell(1).setCellValue("paaword");
        
        wb.getSheet("User_data").createRow(1).createCell(0).setCellValue("kousikbala");
        
        wb.getSheet("User_data").getRow(1).createCell(1).setCellValue("qwerty");
        
        FileOutputStream fos = new FileOutputStream(f);
        
        wb.write(fos);
        
        wb.close();
        
        System.out.println("Write Successfully");
		
		
		
	}

}
