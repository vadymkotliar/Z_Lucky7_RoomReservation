package com.cbt.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		
		tags="@temp",
		features= "src/test/resources/com/cbt/features", 
		glue= "com/cbt/step_definitions"
		
//		,dryRun = true
		)
public class CukesRunner {}
