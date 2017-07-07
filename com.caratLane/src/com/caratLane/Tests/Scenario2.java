package com.caratLane.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.caratLane.Util.Helper;


public class Scenario2 {
	
WebDriver driver;
	
//PRICE

	@FindBy(how=How.XPATH,using="//div[@class='header__main__nav']/ul/li[1]")
	WebElement Jewellery;
	
	@FindBy(how=How.XPATH,using="//div[@class='header__main__nav']/ul/li[1]//span")
	WebElement Jewellery_span;
	
	@FindBy(how=How.XPATH,using="//a[text()='Engagement Rings']")
	WebElement Engagement_Rings;
	
	//PRODUCT TYPE
	@FindBy(how=How.XPATH,using="//a[text()='Cocktail']")
	WebElement Cocktail;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[4]//a[text()='Rings']")
	WebElement Rings;
	
	//WEIGHT RANGES
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[2]/label[contains(text(),'2-5 gms')]/input")
	WebElement Grams2To5;
	
	@FindBy(how=How.XPATH,using="//div[@class='listing__filter__content']/ul/li[3]/label[contains(text(),'5-10 gms')]/input")
	WebElement Grams5To10;
	public void hover(WebDriver driver) throws IOException, InterruptedException{
			
		/*boolean Jewellery1 =Jewellery.isDisplayed();
		
		System.out.println("Jewellery element presence : "+Jewellery1);
	*/
		Helper.isDisplyedElement(driver, Jewellery);
		
		Actions a = new Actions(driver);
		a.moveToElement(Jewellery).build().perform();
		Thread.sleep(4000);
	
		//Helper.Hover(driver, Jewellery);
		
		String Jewellery_Value =Jewellery_span.getAttribute("innerHTML");

		System.out.println("Clicking on "+Jewellery_Value+" Menu");
		
		System.out.println("Clicking on "+Engagement_Rings.getText()+" under " +Jewellery_Value+" menu");

		Engagement_Rings.click();
		
		
		
	}

}
