package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To open the browser Create the obj of BaseTest
		BaseTest bt = new BaseTest();
		
		// read the data from property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    bt.closeBrowser();
		
		
	}
	
	

}
