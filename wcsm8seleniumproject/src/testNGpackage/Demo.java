package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demoMethod() {
	  
//	  System.out.println("Hiii TestNG!!");
	  Reporter.log("Hiii TestNG!!",true);
  }
  
  
  }

