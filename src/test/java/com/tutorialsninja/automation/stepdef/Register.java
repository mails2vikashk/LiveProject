package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register 
{
	@Given("^I launch the application$")
	public void i_launch_the_application()
	{
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page()
	{ 
	    
	}
	@When("^I provide all the valid details\\.$")
	public void i_provide_all_the_valid_details(DataTable arg1)
	{
	    
	}

	@And("^I Select the privacy policy$")
	public void i_Select_the_privacy_policy()
	{
	   
	}

	@And("^I Click on the continue button$")
	public void i_Click_on_the_continue_button()
	{
	   
	}

	@Then("^I should see the User account has  Successfully created$")
	public void i_should_see_the_User_account_has_Successfully_created()
	{
	   
	}
}
