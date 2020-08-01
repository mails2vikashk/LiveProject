package com.tutorialsninja.automation.pages;

import java.util.Map;

//import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage 
{
	
	
	public RegisterPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id = "input-firstname")
     public static WebElement firstName;
	
	
	@FindBy(id = "input-lastname")
	public static WebElement lastName;
	
	@FindBy(id = "input-email")
	public static WebElement eMail;
	
	
	@FindBy(id = "input-telephone")
	public static WebElement telePhone;
	
	
	@FindBy(id = "input-password")
	public static WebElement passWord;
	
	
	@FindBy(id  = "input-confirm")
	public static WebElement confirmPassword;
  
	@FindBy(xpath = "//input[@name='agree']")
	public static WebElement privacyPolicy;
	
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public static WebElement continueButton;
	
	@FindBy(linkText = "Register")
	public static WebElement register;
	
	
	@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	public static WebElement ifWarning;
	
	@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	public static WebElement ilWarning;
	
	
	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	public static WebElement ieWarning;
	
	
	@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	public static WebElement itWarning;
	
	@FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	public static WebElement ipWarning;
	
	
	@FindBy(name = "newsletter")
	public static WebElement newsletter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	public static WebElement duplicateWarning;
	

	public static void enterALLDetails(DataTable dTable)
	{
		Map<String, String> map = dTable.asMap(String.class , String.class );
		Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.eMail, System.currentTimeMillis()+map.get("Email"));
		Elements.TypeText(RegisterPage.telePhone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.passWord, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
		
	}
	public static void enterDuplicateDetails(DataTable dTable)
	{
		Map<String, String> map = dTable.asMap(String.class , String.class );
		Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.eMail, map.get("Email"));
		Elements.TypeText(RegisterPage.telePhone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.passWord, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
		
	}
}
