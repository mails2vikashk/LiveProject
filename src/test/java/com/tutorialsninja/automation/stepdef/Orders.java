package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

//import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPages;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders 
{
	HeadersSection hSection  = new HeadersSection();
	LoginPage page = new LoginPage();
	ShoppingCartPage scp  = new ShoppingCartPage();
	SearchResultsPages srp = new SearchResultsPages();
	CheckOutPage  cop  = new CheckOutPage();  
	OrderSuccessPage osp = new  OrderSuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() throws InterruptedException
	{
		Browser.openApplicationURL();
		HeadersSection.navigationPage();
		LoginPage.login();
		
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout() 
	{
		SearchResultsPages.addProductToCart();
		
		HeadersSection.shopingCart();
		ShoppingCartPage.checkout();			
	}

	@And("^I place an order$")
	public void i_place_an_order() throws Exception
	{
		CheckOutPage.confirmOrder();
		
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()
	{
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.confirmOrderStatus));
		
	}
}
