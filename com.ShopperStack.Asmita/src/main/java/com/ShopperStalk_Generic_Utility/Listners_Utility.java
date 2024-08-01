package com.ShopperStalk_Generic_Utility;
	
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.ISuiteListener;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class Listners_Utility implements ITestListener,ISuiteListener {
		
		@Override
		public void onTestFailure(ITestResult result) {
			
			TakesScreenshot ts=(TakesScreenshot) Base_Test.sdriver;				//if failure
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			File dstn=new File("./screenshot/"+result.getName()+".png");
			try {
				FileHandler.copy(temp, dstn);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}


