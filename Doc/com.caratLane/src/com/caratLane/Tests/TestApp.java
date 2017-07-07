package com.caratLane.Tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestApp {

	
WebDriver driver;
	
	@BeforeTest
	public void invokeChromeBrowser(){
  
//		 driver = Driver.invokeBrowser("chrome", "https://www.caratlane.com/jewellery.html");
		 
		// System.out.println("In BeforeTest");
	}
	
	@Test(enabled=false)
	public void setFiltersInHomePage() throws IOException, InterruptedException{
		
		driver = Driver.invokeBrowser("chrome", "https://www.caratlane.com/jewellery.html");
		System.out.println("In Test");
		Homepage  hmepage =PageFactory.initElements(driver, Homepage.class);
		hmepage.selectFilters(driver);
	
		System.out.println("setFiltersInHomePage");
	
			}
	
	@Test
	public void productPage() throws IOException, InterruptedException{
		
		driver = Driver.invokeBrowser("chrome", "https://www.caratlane.com/jewellery.html");
		System.out.println("In Test");
		Scenario2  scenario2 =PageFactory.initElements(driver, Scenario2.class);
		scenario2.hover(driver);
	
		System.out.println("productPage");
	
			}

}
