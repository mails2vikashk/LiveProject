package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	HeadersSection hSection =  new HeadersSection();
	SearchResultsPages srp = new SearchResultsPages();
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String products)
	{
		Elements.TypeText(HeadersSection.searchBoxField, products);
		Elements.click(HeadersSection.searchButton);
	}
	@Then("^I should see the product in the results$")
	public void i_should_see_the_product_in_the_results()
	{
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPages.product));
	   
	}
	
	@Then("^I should see the given msg \"([^\"]*)\"$")
	public void i_should_see_the_given_msg(String arg1) throws InterruptedException
	{
	    Assert.assertTrue(Elements.isDisplayed(SearchResultsPages.errorMSG));
	    Thread.sleep(5000);
	}
}
