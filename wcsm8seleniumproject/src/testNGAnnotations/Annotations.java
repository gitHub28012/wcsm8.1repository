package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  
	  Reporter.log("Test Annotation",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("BeforeMethod Annotation",true);
  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AfterMethod Annotation",true);
  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("BeforeClass Annotation",true);
  
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("AfterClass Annotation",true);
  
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("BeforeTest Annotation",true);
  
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("AfterTest Annotation",true);
  
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("BeforeSuite Annotation",true);
  
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("AfterSuite Annotation",true);
  
  }

  @Test
  public void testMethod()
  {
	  Reporter.log("Test Annotation2",true);
  }
  
}
