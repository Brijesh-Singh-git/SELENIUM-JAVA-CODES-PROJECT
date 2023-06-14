package Selenium_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parametrization_Part2 {
 
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
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
        
		
		
		driver.close();
	}
}
