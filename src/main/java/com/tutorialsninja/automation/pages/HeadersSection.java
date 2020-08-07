package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection 
{
	//initialize the web elements again
	public HeadersSection()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	//Creating web elements for header page of tutorial ninja demo
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
     public static WebElement myAccountLink;
	
	
	@FindBy(linkText = "Register")
	public static WebElement registerLink;
	
	
	@FindBy(linkText= "Login")
	public static WebElement loginLink;
	
	@FindBy(xpath  = "//input[@placeholder='Search']")
	public static WebElement searchBoxField;
	
	@FindBy(xpath  = "//i[@class='fa fa-search']")
	public static WebElement searchButton;
	
	
}
