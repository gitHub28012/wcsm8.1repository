package dynamicScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomeListners extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Case is Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test Case Executed Successfully",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("Test Case Failed Due to  :"+failedMethod,true);
		failedMethodToTakesScreenShot(failedMethod);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Case Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("Test Case  Started",true);
	}
		
	

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Case Finished",true);
 
}
	
	}
