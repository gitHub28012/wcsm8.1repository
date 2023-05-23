package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void e() {
	  Reporter.log("e method From DemoTest2",true);
  }
  
  @Test
  public void f()
  {
	  Reporter.log("f method From DemoTest2",true);
  }
  
  @Test
  public void f1()
  {
	  int i=10;
	  int j=5;
	  int res=i/j;
	  Reporter.log("f1 method From DemoTest2",true);
  }
}
