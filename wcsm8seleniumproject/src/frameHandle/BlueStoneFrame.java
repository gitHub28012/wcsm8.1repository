package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	//fc_widget

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();

		Thread.sleep(2000);
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		
		// Swith the controls to frame for click on chat Box
		driver.switchTo().frame("fc_widget");// By using nameOrId
		
		//driver.switchTo().frame(frameElement); // By using WebElement as a frame
		
		


		WebElement chatBox = driver.findElement(By.id("chat-icon"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		//swith the controls to default WebPage
		  driver.switchTo().defaultContent();
		
		// insert the inputs fro textBox..
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Tanmay_123");
		driver.findElement(By.id("chat-fc-email")).sendKeys("tanmay@123gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		




	}

}
