package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String s1 = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println("Text is: " + s1);
		
		String s2 = driver.getCurrentUrl();
		System.out.println(s2);
		Thread.sleep(3000);
		driver.close();
	}
}
