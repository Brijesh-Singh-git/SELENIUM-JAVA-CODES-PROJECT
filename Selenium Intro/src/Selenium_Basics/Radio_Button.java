package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();  
		
		System.out.println(driver.findElement(By.id("male")).isSelected()); 
		
		driver.findElement(By.id("male")).click();
		System.out.println(driver.findElement(By.id("male")).isSelected()); 
		
		
		
}
}