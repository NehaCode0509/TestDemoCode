package com.DEW.DEWAutomationSuite.atdd.testRunner;


	import org.junit.runner.RunWith;
	//import cucumber.api.CucumberOptions;
	//import cucumber.api.junit.Cucumber;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/functional", 
	glue = { "com.DEW.DEWAutomation.atdd.stepdefinitions", },
	dryRun = false,
	plugin = { "pretty","html:target/HTMLreports", }, 
	monochrome = true,
	tags = "@functional1")
	 
	public class TestRunner {
	}

