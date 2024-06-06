package com.qa.AmazonPages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerForAmazon implements ITestListener{

	public void onFinish(ITestContext result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("this testcase is failed:"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("this testcase is skipped:"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test case started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
	}

}
