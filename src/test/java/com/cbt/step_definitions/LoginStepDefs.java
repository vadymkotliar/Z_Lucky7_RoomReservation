package com.cbt.step_definitions;

import com.cbt.pages.LoginPage;
import com.cbt.utils.ConfigurationReader;
import com.cbt.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {

	LoginPage lg = new LoginPage();

@Given("The user is on login page")
public void the_user_is_on_login_page() {
	
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	
}

@When("user logs in  valid {string} and {string}")
public void user_logs_in_valid_and(String string, String string2) {
	
	lg.email.sendKeys("email");
	lg.password.sendKeys("password");
	lg.button.click();
	
}
@Then("user should see home page")
public void user_should_see_home_page() {
   lg.homePage.isDisplayed();
	
}
	
}



