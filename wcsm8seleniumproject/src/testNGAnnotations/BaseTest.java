package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	static WebDriver driver;
	@BeforeTest
	public void propertyMethod()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
