package com.caratLane.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	
	public static void Hover(WebDriver driver, WebElement ele) throws InterruptedException{
	Actions a = new Actions(driver);
	a.moveToElement(ele).build().perform();
	Thread.sleep(4000);
	}

	public static boolean isDisplyedElement(WebDriver driver, WebElement ele) throws InterruptedException{
		boolean elePrsence = ele.isDisplayed();
		
		Thread.sleep(4000);
	//	System.out.println("Element Prsence is "+elePrsence);
		return elePrsence;
		
		}
}
