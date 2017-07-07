package com.java.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Login {

	
	WebDriver driver;
	
//	public Login(WebDriver driver){
//	
//		this.driver = driver;
//	}
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.ID,using="rememberme")
	WebElement rememberMe;
	
	@FindBy(how=How.ID,using="wp-submit")
	WebElement submit_button;
	
	
	
	public void loginValidCredentials(WebDriver driver,String uname,String pwd){
	
		username.sendKeys(uname);
		password.sendKeys(pwd);
		rememberMe.click();
		submit_button.click();
	}
}
