package Selenium_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Parametrization {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String filepath = "C:\\Users\\HP\\Desktop\\Data.xlsx"; 
		
		File file = new File(filepath);
		
		FileInputStream filestream = new FileInputStream(file);
		
		XSSFWorkbook work = new XSSFWorkbook(filestream);
		
		XSSFSheet sheet = work.getSheet("Sheet2");
		
        int rowcount= sheet.getLastRowNum(); 
        System.out.println("No of Rows are: " + rowcount);
        
        int colcount= sheet.getRow(0).getLastCellNum();
        System.out.println("No of Columns are: " + colcount);
        
        
        for(int i=0; i<rowcount;i++) {
        	
        	XSSFRow currentRow = sheet.getRow(i);   // Focuses on the Current Row
        	
        	for(int j=0;j<colcount;j++) {
        		
        		String val = currentRow.getCell(j).toString();  //read the value from the cell
        		System.out.print(val);
        		
        	} 
        	System.out.println();
        	
        }
        
      
}
}
