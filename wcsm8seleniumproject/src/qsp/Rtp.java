package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select the browser which u want open!!!");
		String browserValue = sc.next();

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IlleaglStatException

			// to handle ConnectionFailedException

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			driver=new ChromeDriver(co);// to launch chrome Browser
			// to maximize browser
			driver.manage().window().maximize();
			Thread.sleep(2000);// provide the delay 
			driver.close();// close the browser
		}

		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

		else
		{
			System.out.println("Enter the valid BrowserValue!!!");
		}

	}

}
