package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	// Method or Annotation is Enabled or Disabled
  @Test(description = "Login Method")
  public void method1() {
	  Reporter.log("Login Performed!!",true);
  }
  
  @Test(enabled =false,description = "Logout Method")
  public void method2()
  {
	  Reporter.log("LogOut Performed!!",true);
  }
}
