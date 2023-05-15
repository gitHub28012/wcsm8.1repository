package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData("./data/config.properties","username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData("./data/config.properties","password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}
