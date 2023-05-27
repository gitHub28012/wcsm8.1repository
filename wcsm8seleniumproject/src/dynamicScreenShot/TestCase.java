package dynamicScreenShot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListners.class)

public class TestCase extends BaseTest{
	
  @Test
  public void login() {
	  
	
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.fail();
	  driver.findElement(By.id("loginButton")).click();
  }
}
