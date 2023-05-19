package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		Flib flib = new Flib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		
		Thread.sleep(2000);
		hp.logOutMethod();
		Thread.sleep(2000);
	  	
		bt.tearDown();
	}

}
