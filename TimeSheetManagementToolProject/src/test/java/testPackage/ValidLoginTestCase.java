package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagePackage.LoginPage;

public class ValidLoginTestCase extends BaseTest {
	
	@Test
	public void validLoginMethod() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH1,"username"),flib.readPropertyData(PROP_PATH1,"password"));
	}

}
