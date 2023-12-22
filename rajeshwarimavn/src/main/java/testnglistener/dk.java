package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class dk implements ITestListener {
//rightclick=> source=> override/implement method
	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished ");
	}
	
	//ITestListener => builtin interface
	//onstart, onfinish, ontestsuccess,
	// class<=> interface

}
