package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/frame.html");
		
		Thread.sleep(2000);
	    WebElement usernameBox = driver.findElement(By.id("i2"));
	    usernameBox.sendKeys("admin");
	    WebElement frameElement = driver.findElement(By.name("frname"));
	    
	   // driver.switchTo().frame(0); // handle by using index value
	   //driver.switchTo().frame("frname"); //handle by using nameOrId.
	    driver.switchTo().frame(frameElement); //handle by using weblement as a frame
	    Thread.sleep(2000);
	    WebElement passwordBox = driver.findElement(By.id("i1"));
	    passwordBox.sendKeys("manager");
	    
	    Thread.sleep(2000);
	    passwordBox.clear();
	    Thread.sleep(2000);
	    // switch the controls to parentFrame
	   // driver.switchTo().parentFrame();
	    
	    driver.switchTo().defaultContent();
	    usernameBox.clear();
	    

	}

}
