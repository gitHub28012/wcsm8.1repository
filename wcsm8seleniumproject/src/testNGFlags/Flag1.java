package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	// To describe the Method
	
  @Test(description = "This Method Performs Login!!")
  public void method1() {
	  
	  Reporter.log("Method 1 Login!!",true);
  }
}
