package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();   
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		
		String s1 = driver.switchTo().alert().getText(); 
		System.out.println(s1);
		driver.switchTo().alert().accept();  // It will accept the pop up 
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String s2 = driver.switchTo().alert().getText();
		System.out.println(s2);
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String s3 = driver.switchTo().alert().getText();
		System.out.println(s3);
		driver.switchTo().alert().sendKeys("Hello this is me");
		driver.switchTo().alert().accept();
		
		
		
		
		
}
}
