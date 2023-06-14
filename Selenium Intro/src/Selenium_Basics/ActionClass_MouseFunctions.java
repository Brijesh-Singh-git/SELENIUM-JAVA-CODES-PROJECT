package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_MouseFunctions {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();   
		
		Actions act = new Actions(driver);
		
		WebElement first = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
		WebElement sec = driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));

		act.moveToElement(first).build().perform();
		act.moveToElement(sec).click().build().perform();
		
		
}
}
