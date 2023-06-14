package Selenium_Basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();   
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		
//		System.out.println(driver.getTitle());
		
		Set <String> s = driver.getWindowHandles();
		
		for(String i :s ) {
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
			
			if(t.contains("Frames & windows")) {
				driver.close();
			}
		}

		
		driver.close();
}

}
