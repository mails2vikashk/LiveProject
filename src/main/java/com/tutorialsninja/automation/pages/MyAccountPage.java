package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class MyAccountPage 
{
	
	
	public MyAccountPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/ul[3]/li[1]/a[1]")
	public static WebElement lpValidations;
}
