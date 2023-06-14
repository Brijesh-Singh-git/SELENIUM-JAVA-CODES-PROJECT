package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_8esh']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back(); 
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		driver.close();
	}
}
