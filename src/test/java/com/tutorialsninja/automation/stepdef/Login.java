package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login 
{
	
	HeadersSection hSection  = new HeadersSection();
	LoginPage lPage = new LoginPage();
	MyAccountPage maPage = new MyAccountPage();
	
	
	@Given("^I naviage to Account Login page$")
	public void i_naviage_to_Account_Login_page()  
	{
	    Elements.click(HeadersSection.myAccountLink);
	    Elements.click(HeadersSection.loginLink);
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password)  
	{
		LoginPage.loginPage(email, password);
	}

	@Then("^I should see that the User is able to successfully login$")
	public void i_should_see_that_the_User_is_able_to_successfully_login()  
	{
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.lpValidations));
			    
	}
	
	@Then("^I should see an error message informing the User about invalid credentials$")
	public void i_should_see_an_error_message_informing_the_User_about_invalid_credentials() 
	{
		Assert.assertTrue(Elements.isDisplayed(LoginPage.lpWarning));
	 	}
	@When("^I reset the forgotten password for \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for(String arg1)
	{
	   
	   LoginPage.resetPasswordPage(arg1);
	}

	@Then("^I should see a message informing that the password reset details have been sent to the email address$")
	public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address() 
	{
		Elements.isDisplayed(LoginPage.warningForgotPassword);
	}

	
}
