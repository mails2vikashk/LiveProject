package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Register.feature" },
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"},
tags={"@Register", "@one"})
*/


@RunWith(Cucumber.class)
//@CucumberOptions(features={"classpath:FeatureFiles/Register.feature"}, is a part of register page //Login.feature
@CucumberOptions(features={"classpath:FeatureFiles/Order.feature",
		                    "classpath:FeatureFiles/Login.feature",
		                    "classpath:FeatureFiles/Register.feature",
"classpath:FeatureFiles/Search.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags={"@Orders","@One"})// running the login feature file

//tags={"@Register"}) //running all the scenario in a single row for register page.
//tags={"@Register","@Four"}) running only fourth scenario

public class TestRunner 
{
	
}
