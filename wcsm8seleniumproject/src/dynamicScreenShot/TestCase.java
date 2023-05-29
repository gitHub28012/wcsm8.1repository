package dynamicScreenShot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListners.class)

public class TestCase extends BaseTest{
	
  @Test
  public void login1() {
	  
	
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	 // Assert.fail();
	  SoftAssert sa = new SoftAssert();
	  sa.fail();
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
  }
}
