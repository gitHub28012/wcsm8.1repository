package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Flib implements IAutoconstant {

	protected static WebDriver driver;

	// It is use to open the browser & close the browser
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();

		String browserValue = flib.readPropertyData(PROP_PATH,"browser");
		String url = flib.readPropertyData(PROP_PATH,"url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			
			WebDriverManager.edgedriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			Reporter.log("InvalidBrowser Value!!!",true);
		}
	}

	public void faliedMethodToTakeScreenshot(String failedMethod)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+failedMethod+".png");
		Files.copy(src, dest);
		}
		catch(Exception e)
		{

		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


}
