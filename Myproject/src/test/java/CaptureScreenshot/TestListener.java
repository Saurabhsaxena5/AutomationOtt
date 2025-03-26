package CaptureScreenshot;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		// ✅ Capture the Test Name
		String testName = result.getMethod().getMethodName();
		System.out.println("❌ Test Case Failed: " + testName);
		
		captureScreenshot("Screenshots/" + testName + ".jpg");
	}
}
