package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test(description = "Search For JAVA !!")
  public void search1() {
	  driver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);
  }
  
  @Test(description = "Serach For SQL!!")
  public void search2()
  {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  
  @	Test(description = "Serach For Selenium")
  public void serach3()
  {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
