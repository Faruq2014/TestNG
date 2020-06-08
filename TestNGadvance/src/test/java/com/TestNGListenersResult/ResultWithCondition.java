package com.TestNGListenersResult;

import static org.testng.Assert.fail;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ResultWithCondition {

	@Test(priority = 1)
	public void loginTest() {
		
	}
	

	@Test(priority = 2)
	public void smokeTest() {
		fail();
	}

	@Test(priority = 3)
	public void functionalTest() {
		fail();	
	}

	@Test(priority = 4)
	public void regressionalTest() {
		fail("need more work");
	}

	@Test(priority = 5)
	public void sanity() {
		throw new SkipException(" We will build it latter. ");
	}
	
	@Test(priority = 6)
	public void e2eTest() {
		throw new SkipException(" We will build it latter. ");
	}
	
	@AfterMethod
	public void get(ITestResult result) {
		
		if (result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Success= Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			}
		if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed = Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			}
		
		if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("Skipped= Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			}
		
		
	}
}
