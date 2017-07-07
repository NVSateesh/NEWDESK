package com.java.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddPosts {

	
	WebDriver driver;
	
//	public AddPosts(WebDriver driver){
//	
//		this.driver = driver;
//	}
	
	@FindBy(how=How.XPATH,using="//a[@class='wp-has-submenu wp-not-current-submenu open-if-no-js menu-top menu-icon-post menu-top-first']")
	WebElement PostsLeftSide;
	
	@FindBy(how=How.XPATH,using="//div[@class='wrap']/h2/a")
	WebElement AddNew;
	
	@FindBy(how=How.XPATH,using="//div[@class='wrap']//h2")
	WebElement AddNewPost_Verification;
	
	@FindBy(how=How.XPATH,using="//input[@name='post_title']")
	WebElement Title;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='content']")
	WebElement textArea;
	
	@FindBy(how=How.XPATH,using="//input[@id='new-tag-post_tag']")
	WebElement newTags;
	
	@FindBy(how=How.XPATH,using="//input[@class='button tagadd']")
	WebElement Add_UnderTags;

	@FindBy(how=How.XPATH,using="//div[@id='preview-action']//a]")
	WebElement preview;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='preview-action']/a[@id='post-preview']")
	WebElement preview2;
	
	@FindBy(how=How.XPATH,using="//a[@id='post-preview']")
	WebElement preview3;
	
	@FindBy(how=How.XPATH,using="//a[@id='post-preview' and @class='preview button']")
	WebElement preview_text;
	

	@FindBy(how=How.LINK_TEXT,using="Preview")
	WebElement preview_text1;
	public void createPostWithContent(WebDriver driver,String title,String textAreaData,String tags) throws IOException, InterruptedException{
	
		PostsLeftSide.click();
		AddNew.click();
		String x = AddNewPost_Verification.getText();
		System.out.println(x);
		Title.sendKeys(title);
		//textArea.sendKeys(textAreaData);
		newTags.sendKeys(tags);
		Add_UnderTags.click();
		
		//Thread.sleep(2000);
		preview_text1.click();
		
		Helper.takeScreenshot(driver, "PostCreation");
	}
}
