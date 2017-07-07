package com.caratLane.Tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Homepage {
	
WebDriver driver;
	
//PRICE

	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[1]//a[text()='Under Rs.5000']")
	WebElement under5000;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[2]//a[text()='Rs.5001 To Rs.10000']")
	WebElement FiveToTen_K_old;
	
	@FindBy(how=How.XPATH,using="//a[text()='Rs.5001 To Rs.10000']")
	WebElement FiveToTen_K;

	@FindBy(how=How.XPATH,using="//a[text()='Rs.5001 To Rs.10000']/following::span[1]")
	WebElement FiveToTen_K_Span;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[3]//a[text()='Rs.10001 To Rs.20000']")
	WebElement TenToTwenty_K;
	
	//PRODUCT TYPE
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[1]//a[text()='Nail Rings']")
	WebElement NailRings;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[4]//a[text()='Rings']")
	WebElement Rings_old;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li//label[text()='Rings']")
	WebElement Rings11;
	
	@FindBy(how=How.XPATH,using="//*[text()='Rings']/input")
	WebElement Rings;
	
	@FindBy(how=How.XPATH,using="//*[text()='Rings']/span")
	WebElement Rings_Span;
	//WEIGHT RANGES
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[2]/label[contains(text(),'2-5 gms')]/input")
	WebElement Grams2To5;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[3]/label[contains(text(),'5-10 gms')]/input")
	WebElement Grams5To10_Old;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'5-10 gms')]/input")
	WebElement Grams5To10;

	//MATERIAL
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content listing__filter__material']/ul/li[3]//a[text()='Diamond']")
	WebElement Diamond;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content listing__filter__material']/ul/li[2]//a[text()='Gold']")
	WebElement Gold_old;
	
	@FindBy(how=How.XPATH,using="//a[contains(.,'Gold')]")
	WebElement Gold;
	
	@FindBy(how=How.XPATH,using="//a[contains(.,'Gold')]/span")
	WebElement Gold_Span;
	
	public void selectFilters(WebDriver driver) throws IOException, InterruptedException{
	
		
		boolean FiveToTen_K1 = FiveToTen_K.isDisplayed();
				
		System.out.println("FiveToTen_K1 : "+FiveToTen_K1);
		
		FiveToTen_K.click();
		
		Thread.sleep(10000);
		
	
	
		String FiveToTen_K_Value =FiveToTen_K_Span.getAttribute("innerHTML");
		
		System.out.println(FiveToTen_K_Value);
/*		
String FiveToTen_K_Value1 =FiveToTen_K_Span.getAttribute("outerHTML");
		
		System.out.println(FiveToTen_K_Value1);*/
		
		
//		WebDriverWait wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedCondition.vi);
		
		Thread.sleep(6000);
		Thread.sleep(6000);
		
		/*JavascriptExecutor jse =((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].scrollIntoView(true)",Rings);*/
		boolean Rings1 = Rings.isDisplayed();
		
		System.out.println(Rings1);
		
		Rings.click();
		
String Rings_Value =Rings_Span.getAttribute("innerHTML");
		
		System.out.println(Rings_Value);
		
		Thread.sleep(6000);
	
		
/*boolean Grams5To101 = Grams5To10.isDisplayed();
		
		System.out.println(Grams5To101);
		
		Grams5To10.click();
		Thread.sleep(4000);
		
*/
	/*	JavascriptExecutor jse =((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].scrollIntoView(true)",Gold);
		
		boolean Gold1 = Gold.isDisplayed();
		
		System.out.println("Gold1 : "+Gold1);
		
		Gold.click();
		
	String Gold_Value =Gold_Span.getAttribute("innerHTML");
		
		System.out.println(Gold_Value);*/
		Thread.sleep(10000);
	
		
	}

}
