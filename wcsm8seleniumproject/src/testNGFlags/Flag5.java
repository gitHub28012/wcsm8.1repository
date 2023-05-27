package testNGFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
  @Test(description = "Login TestCase")
  public void loginMethod() {
	  Reporter.log("login Performed!!",true);
  }
  
  @Test(description = "CreateUser TestCase",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Assert.fail();
	  Reporter.log("user Created!!",true);
	  
  }
  
  @Test(description = "Logout TestCase",dependsOnMethods = "createUser",alwaysRun = true)
  public void logoutMethod() {
	  Reporter.log("logout Performed!!",true);
  }
}
