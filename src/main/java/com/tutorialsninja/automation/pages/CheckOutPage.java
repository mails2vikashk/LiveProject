package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckOutPage 
{

	public CheckOutPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id  = "button-payment-address")
	public static WebElement billingContinueButton;
	
	@FindBy(id  = "button-shipping-address")
	public static WebElement shippingAddress;
	
	@FindBy(id =  "button-shipping-method")
	public static WebElement shippingMethod;
	
	@FindBy(name  = "agree")
	public static  WebElement tc;
	
	@FindBy(id  = "button-payment-method")
	public static WebElement paymentMetod;
	
	@FindBy(id  = "button-confirm")
	public static WebElement confirmButton;
	
	
	
	public static void confirmOrder() throws Exception
	{

		  Elements.click(billingContinueButton);
		  Elements.click(shippingAddress);
		   Thread.sleep(3000);
		   Elements.click(shippingMethod);
		   Thread.sleep(3000);
		   Elements.click(tc);
		   Thread.sleep(3000);
		   Elements.click(paymentMetod);
		   Thread.sleep(3000);
		   Elements.click(confirmButton);
		   Thread.sleep(3000);
	}
	

}
