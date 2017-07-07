package com.java.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Tests {
	
	WebDriver driver;
	
	@BeforeTest
	public void invokeChromeBrowser(){
  
//	WebDriver driver = SetBrowser.invokeBrowser("chrome", "http://demo.opensourcecms.com/wordpress/wp-login.php");
	}
	
	@Test
	public void testLogin() throws IOException, InterruptedException{
		
		WebDriver driver = SetBrowser.invokeBrowser("chrome", "http://demo.opensourcecms.com/wordpress/wp-login.php");
	
		Login  lpage =PageFactory.initElements(driver, Login.class);
		
		lpage.loginValidCredentials(driver, "admin", "demo123");
		
	    Helper.verifyCurrentURL(driver, "http://demosite.center/wordpress/wp-admin/");
		
		Helper.verifyTitle(driver, "Dashboard");
		
		System.out.println("Login success");
		
		AddPosts  postCreation =PageFactory.initElements(driver, AddPosts.class);
		
		postCreation.createPostWithContent(driver, "SeleniumTest_Post", "SeleniumTest_Post", "Testing, Manual Testing,Automation Testing");
	
		System.out.println("Post Creation success");
		
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"/tab");
		
		System.out.println(driver.getTitle());
	}
	

}
