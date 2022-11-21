package org.login;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

    File file = new File("C:\\Users\\Its We\\Desktop\\Java Recording\\Framework\\ExcelWrite.xlsx");
    FileOutputStream fs = new FileOutputStream(file);
    Workbook w = new XSSFWorkbook();
    Sheet createSheet = w.createSheet("First Sheet");
    Row createRow = createSheet.createRow(0);
    Cell createCell = createRow.createCell(0);
    createCell.setCellValue("Sudhir Kumar");
    w.write(fs);
    		
    
		
	
	
	


    
    
    
    
    
		
		
		
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
