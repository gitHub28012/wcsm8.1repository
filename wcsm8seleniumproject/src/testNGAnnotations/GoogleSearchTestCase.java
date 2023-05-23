package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test
  public void search1() {
	  driver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);
  }
  
  @Test
  public void search2()
  {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  
  @	Test
  public void serach3()
  {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
