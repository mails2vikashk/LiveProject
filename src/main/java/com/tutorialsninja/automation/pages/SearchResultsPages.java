package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPages 
{
	HeadersSection hSection  = new HeadersSection();
	public SearchResultsPages()
	{
		PageFactory.initElements(Base.driver, this);
	}	
		@FindBy(xpath  = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
		public static WebElement product;
		
		@FindBy(xpath  = "/html[1]/body[1]/div[2]/div[1]/div[1]/p[2]")
		public static WebElement errorMSG;
		
		@FindBy(xpath  = "//span[contains(text(),'Add to Cart')]")
		public static WebElement addTocart;
		
		public static void addProductToCart()
		{
			HeadersSection.searchProduct();
			Elements.click(SearchResultsPages.addTocart);
		}
}
