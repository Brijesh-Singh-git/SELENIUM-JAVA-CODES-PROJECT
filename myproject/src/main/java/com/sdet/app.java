package com.sdet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class app {
	
	@Test 
	public void t1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize(); 
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		 
		
		for(int i=0; i<links.size();i++) {
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL (url);
			
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			
			httpConn.connect();
			
			int rescode = httpConn.getResponseCode();
			if(rescode>=400) {
				System.out.println(url + " - " + " is broken link");
				
			}
			else {
				System.out.println(url + " - " + " is valid link");
			}
		}  
		Thread.sleep(2000);
		driver.quit();
	}
	
}
