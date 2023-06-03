package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class InvalidLoginTestCase extends BaseTest{

	@Test
	public void inavlidLogin() throws IOException, EncryptedDocumentException, InterruptedException
	{
       
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1;i<rc;i++)
		{
		lp.inValidLogin(flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 0),flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1));
		}
	}

}
