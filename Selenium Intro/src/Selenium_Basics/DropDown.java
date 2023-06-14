package Selenium_Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();   
		
		WebElement element = driver.findElement(By.id("country"));
		
		Select se = new Select(element);
		
		List originalList = new ArrayList();
		List tempList = new ArrayList();

		List <WebElement> options = se.getOptions();
		
		for(WebElement e: options) {
			
			originalList.add(e.getText());
			tempList.add(e.getText()); 
		}
		
		System.out.println(originalList);
		
		
		System.out.println("TempList: " + tempList);
		
		Collections.sort(tempList);
		
		System.out.println("Sorted List" + tempList); 
		
		
		if(originalList == tempList) {
			System.out.println("Dropdown Sorted");
		}
		else {
			System.out.println("Dropdown not Sorted");
		}
		
		
		driver.close();
}
}
