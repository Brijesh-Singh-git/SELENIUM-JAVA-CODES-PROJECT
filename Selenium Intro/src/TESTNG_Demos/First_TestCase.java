package TESTNG_Demos;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_TestCase {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"G:\\INFOSYS Lectures & Codes\\Stream Training\\JAR Files\\CD.exe"); 
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize(); 
	}
	
	
	@Test
	public void test() throws InterruptedException { 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
	}
	
	@AfterClass 
	public void teardown() {
		
		driver.close();
	}
}
