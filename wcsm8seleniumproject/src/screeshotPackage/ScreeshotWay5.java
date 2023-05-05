package screeshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreeshotWay5 {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// consider we are taking ss of Selenium.dev Wp
		driver.get("https://www.selenium.dev");

		TakesScreenshot ts=(TakesScreenshot) driver;

		// Implementation of method
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss1.png");
		
		Files.copy(src, dest);

	}

}
