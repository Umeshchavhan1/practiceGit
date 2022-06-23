package ZerodhaTest;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Sreenshot;

public class TestListeners extends ListenersBaseTest implements ITestListener {
	
	public void OnTestStart(ITestResult result) {
		System.out.println(result.getName()+ " Test Started");
	}
	public void OnTestFinish(ITestResult result) {
		System.out.println(result.getName()+ " Test Finished");
	}
	public void OnTestSucess(ITestResult result) {
		System.out.println(result.getName()+ " Test Sucessfully");
	}
	public void OnTestFailure(ITestResult result) {
		try {
			Sreenshot.getScreenShot(driver, result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void OnTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ " Test Skipped");
	}
	
}
