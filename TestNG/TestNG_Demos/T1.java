package TestNG_Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class T1 {
	
	public static WebDriver driver;
	public static String url = "https://selectorshub.com/xpath-practice-page/";

	@BeforeMethod
	public void setUp() throws InterruptedException {
		// Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software Testing Jars\\Drivers\\Chromedriver\\chromedriver.exe");

		// Open browser instance
		driver = new ChromeDriver();

		// Open the AUT
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test
	public void test() throws InterruptedException {

//		// Child & Parent 
//		int count = driver.findElements(By.xpath("//div[@data-elementor-id='1097']/child::section")).size();
//		System.out.println("The child of Div 1097 Is :"+count);
//		
//		
//		// Reach and read the attribute of parent element 
//		String attributeValue = driver.findElement(By.xpath("//div[@data-elementor-id='1097']"
//				+ "/child::section[5]/parent::div")).getAttribute("data-elementor-id");
//		System.out.println("The attribute value is : "+attributeValue);
		
		// Following -sibling 
//		int countOfAfterSibling = driver.findElements(By.xpath("//main[@id= 'content']"
//				+ "/header/following-sibling::*")).size();
//		System.out.println("My folloing sibling count is :"+countOfAfterSibling);
		
		
		int countOfBeforeSibling = driver.findElements(By.xpath(
				"//main[@id= 'content']/div/preceding-sibling::*")).size();
		System.out.println("My previous sibling count is :"+countOfBeforeSibling);
		
		
		// Ancestor --------Decendants 
		
		
	}

	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}
