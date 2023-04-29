package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (Bluestone)
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		//Identify Coin 
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));

		// create obj of Actions class to move to the coin
		Actions act = new Actions(driver);
		// use this method to move
		act.moveToElement(target).perform();
        //click on 1gm for 22...
		driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'gold-coins-2'))]")).click();
       // verify the 1gm 22k coin is displayed or not
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
        if(coin.isDisplayed())
        {
        	System.out.println("coin is displayed!!");
        }
        else 
        {
        	System.out.println("will get exception!!");
        }
        
        // close the browser
        Thread.sleep(2000);
        driver.quit();
		
		

	}

}
