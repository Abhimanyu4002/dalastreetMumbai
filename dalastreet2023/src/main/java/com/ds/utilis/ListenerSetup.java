package com.ds.utilis;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testbase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result)
	{
		logger.info("Test case execution started - "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// logger work as printing statement
		logger.info("pass test "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		//logger.info("On test fail"+result.getName());
		//UtilClass.TakeScreenShots(result.getName()+"--"+System.currentTimeMillis());
		//logger.info("Take Screenshots");
	
	}

	public void onTestSkipped(ITestResult result) {
	
		logger.info("on test skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
		
	}

}
