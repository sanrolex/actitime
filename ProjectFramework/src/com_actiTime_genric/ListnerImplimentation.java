package com_actiTime_genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplimentation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+"is succefuly excuted",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src =t.getScreenshotAs(OutputType.FILE);
		File des =new File("./Screenshot/"+res+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {		}
		
		}
		
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
	
	

}
