package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		    Point point = link.getLocation();
		    int xaxis = point.getX();
		    int yaxis = point.getY();
		    
		    Thread.sleep(2000);
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		    Thread.sleep(2000);
		 
		    // handle or address of current window / parent window
		    String parentHandle = driver.getWindowHandle();
		    System.out.println("handle of parent window : " +parentHandle);
		    
		    
		    
	}

}
