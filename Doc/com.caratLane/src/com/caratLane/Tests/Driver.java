package com.caratLane.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {


	static WebDriver driver;

	public static WebDriver invokeBrowser(String browserName,String siteUrl) {

		if (browserName.equalsIgnoreCase("Mozilla")) {

			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Jars\\chromedriver_win32\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(options);
			
		}

		if (browserName.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(siteUrl);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;
	}

	  
	}
	
	
	
	
	
	
	
	
