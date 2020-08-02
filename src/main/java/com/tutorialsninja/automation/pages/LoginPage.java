package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage 
{
	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id = "input-email")
    public static WebElement emailField;
	
	
	@FindBy(id = "input-password")
	public static WebElement passWord;
	
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public static WebElement signInButton;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	public static WebElement lpWarning;	
	
	
	@FindBy(xpath = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	public static WebElement fPassword;
	
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public static WebElement continueButton;
	
	
	@FindBy(xpath  = "/html[1]/body[1]/div[2]/div[1]")
	public static WebElement  warningForgotPassword;
	
	
	public static void loginPage(String email,String password)
	{
		 Elements.TypeText(LoginPage.emailField, email);
		   Elements.TypeText(LoginPage.passWord, password);
		   Elements.click(LoginPage.signInButton);
	}
	public static void resetPasswordPage(String email)
	{
		Elements.click(LoginPage.fPassword);
		Elements.TypeText(LoginPage.emailField, email);
		Elements.click(LoginPage.continueButton);
		
	}
}

