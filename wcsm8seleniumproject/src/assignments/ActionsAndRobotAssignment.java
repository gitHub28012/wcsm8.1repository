package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobotAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (Bluestone)
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement watchJewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));

		Actions act = new Actions(driver);
		act.moveToElement(watchJewellery).perform();

		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement filterBy = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(filterBy).perform();
		}
		
		// To copy the filter by using Robot Class.
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	    driver.findElement(By.name("search_query")).click();
	    
	    // paste the filter by
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    
		WebElement searchBoxButton = driver.findElement(By.name("submit_search"));
		searchBoxButton.submit();
		

	}

}
