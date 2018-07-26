package com.acttime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class SamplelistenerClass implements ITestListener {


	@Override
	public void onTestFailure(ITestResult T) {
		String failedTestName = T.getMethod().getMethodName();
		System.out.println("test fail====>"+failedTestName);
		EventFiringWebDriver eDriver= new EventFiringWebDriver(BaseClass.driver);
		File srcfile= eDriver.getScreenshotAs(OutputType.FILE);
		File dstfile= new File("F:\\screenshot\\"+failedTestName+".png") ;
		try {
			FileUtils.copyFile(srcfile,dstfile );}
		catch (IOException e) {}
		}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}


