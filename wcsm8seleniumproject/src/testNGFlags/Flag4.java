package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	// execute the annotations or methods according to priority
  @Test
  public void f() {
	  Reporter.log("f method",true);
  }
  
  @Test
  public void a()
  {
	  Reporter.log("a method",true);
  }
  
  @Test
  public void g()
  {
	  Reporter.log("g method",true);
  }
  
  @Test
  public void m()
  {
	  Reporter.log("m method",true);
  }
  
  @Test(priority = -1)
  public void p()
  {
	  Reporter.log("p method",true);
  }
  
  @Test(priority = 1)
  public void e()
  {
	  Reporter.log("e method",true);
  }
  
  @Test
  public void z()
  {
	  Reporter.log("z method",true);
  }
  
  @Test(priority = 1)
  public void k()
  {
	  Reporter.log("k method",true);
  }
}
