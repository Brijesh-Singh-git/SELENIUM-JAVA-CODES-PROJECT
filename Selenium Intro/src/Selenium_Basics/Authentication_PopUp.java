package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PopUp {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//https://username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String t = driver.findElement(By.cssSelector("div[class='example'] p")).getText();
		System.out.println(t);
		
		
		
		
		
}
}
