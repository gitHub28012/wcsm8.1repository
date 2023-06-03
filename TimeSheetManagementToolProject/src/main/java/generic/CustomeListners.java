package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListners extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {

		Reporter.log("Browser Opened & Test Will Start!!",true);

	}

	public void onTestSuccess(ITestResult result) {

		Reporter.log("Test executed successfully!!",true);

	}

	public void onTestFailure(ITestResult result) {

		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("Test falied due to :"+failedMethod,true);
		faliedMethodToTakeScreenshot(failedMethod);

	}

	public void onTestSkipped(ITestResult result) {

		Reporter.log("Test case Skipped ",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

		Reporter.log("Test Started!!",true);
	}

	public void onFinish(ITestContext context) {

		Reporter.log("Test Finished!!",true);
	}


}
