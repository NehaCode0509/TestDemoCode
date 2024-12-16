package com.DEW.DEWAutomation.atdd.stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.DEW.DEWAutomationSuite.atdd.Testpage1.Homelogin;

import io.cucumber.java.PendingException;
//import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//import com.DEW.DEWAutomation.stepDefinitions.Home;

public class PageLayoutStepDefinition {
	
	Homelogin homelogin ;

	public PageLayoutStepDefinition()
	{
		homelogin = new Homelogin();
	}
	 @Given("^User launch the Facebook homepage$")
	    public void i_open_the_google_homepage() throws Exception{
	    
		 homelogin.LaunchAppUrl();
		    
	    }

	 @When("^User should login with valid username and password$")
	 public void user_login_with() throws Throwable {
		

	     homelogin.LoginApp();
	     
	 }
	 @Then("^I can see home page successfully$")
	 public void i_can_see_home_page_successfully() throws Exception {

        homelogin.LoginSuccessful();
        
        
	 }

	

}