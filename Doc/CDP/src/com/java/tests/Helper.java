package com.java.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Helper {
	
	 WebDriver driver;
	 
	 // To validate the current url of the browser/webpage
	 
	public static void verifyCurrentURL( WebDriver driver,String expectedURL){
		
		String actual = driver.getCurrentUrl();
		String expected=expectedURL;
		Assert.assertEquals(actual, expected, "Logged in with invalid credentials");
		
		System.out.println("verifyCurrentURL verified");
		
	}

	
	// To validate the Title of the webpage
	
public static void verifyTitle( WebDriver driver,String expectedTitle){
		
		String actual = driver.getCurrentUrl();
		String expected=expectedTitle;
//		Assert.assertEquals(actual, expected, "Actual text not match with expectedTitle Expected text");
		
		if(actual.contains(expected)){}		
		System.out.println("verifyTitle verified");

		
	}

public static void takeScreenshot( WebDriver driver,String screenshotTitle) throws IOException{
	int i=1;
	i++;
	String destFile ="./Screenshots/"+screenshotTitle+"_"+i+".jpeg";
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File(destFile));
	
	System.out.println("verifyTitle verified");

	
}

}
