package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

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
	
	@FindBy(xpath= "//span[contains(text(),'Shopping Cart')]")
	public static WebElement shopingCart;
	
	public static void navigationPage()
	{
		Elements.click(HeadersSection.myAccountLink);		
		Elements.click(HeadersSection.loginLink);
	}
	public static void searchProduct()
	{
		Elements.TypeText(HeadersSection.searchBoxField, Base.reader.getProduct());
	    Elements.click(HeadersSection.searchButton);
	}
	public static void shopingCart()
	{
		Elements.click(shopingCart);
	}
	
}
