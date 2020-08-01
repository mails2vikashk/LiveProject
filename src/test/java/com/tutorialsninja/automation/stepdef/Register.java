package com.tutorialsninja.automation.stepdef;

//import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.SuccessPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register 
{
	// after creatting the object the webelement will be initialized
	HeadersSection HSection = new HeadersSection();
	RegisterPage RPage = new RegisterPage();
	SuccessPage Spage = new SuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException
	{
		Base.driver.get(Base.reader.getUrl());
		//Thread.sleep(5000);
	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page() throws InterruptedException
	{ 
	    Elements.click(HeadersSection.myAccountLink);
	    Elements.click(HeadersSection.registerLink);
	   // Thread.sleep(5000);
	}
	@When("^I provide all the valid details\\.$")
	public void i_provide_all_the_valid_details(DataTable dTable) throws InterruptedException
	{
		RegisterPage.enterALLDetails(dTable);
		//Thread.sleep(5000);
	}

	@And("^I Select the privacy policy$")
	public void i_Select_the_privacy_policy() throws InterruptedException
	{
		Elements.selectCheckBox(RegisterPage.privacyPolicy);
		//Thread.sleep(5000);
	}

	@And("^I Click on the continue button$")
	public void i_Click_on_the_continue_button() throws InterruptedException
	{
	   Elements.click(RegisterPage.continueButton);
	   //Thread.sleep(5000);
	}

	@Then("^I should see the User account has  Successfully created$")
	public void i_should_see_the_User_account_has_Successfully_created()
	{
		Assert.assertTrue(Elements.isDisplayed(SuccessPage.successPage));
	   
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() 
	{
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.register));
	}
	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() 
	{
	  Assert.assertTrue(Elements.isDisplayed(RegisterPage.ifWarning));
	  Assert.assertTrue(Elements.isDisplayed(RegisterPage.ilWarning));
	  Assert.assertTrue(Elements.isDisplayed(RegisterPage.ieWarning));
	  Assert.assertTrue(Elements.isDisplayed(RegisterPage.itWarning));
	  Assert.assertTrue(Elements.isDisplayed(RegisterPage.ipWarning));
	  
	}
	
	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() 
	{
	    Elements.click(RegisterPage.newsletter);
	}
	
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable arg1) throws InterruptedException 
	{
		RegisterPage.enterDuplicateDetails(arg1);
		//Thread.sleep(5000);
	}

	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() 
	{
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.duplicateWarning));
	   
	}

}
