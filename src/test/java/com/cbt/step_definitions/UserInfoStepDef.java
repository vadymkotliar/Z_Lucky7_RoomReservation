package com.cbt.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class UserInfoStepDef {

	
	
	@Given("the user logs in using {string} {string}")
	public void the_user_logs_in_using(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("the user is on the my self page")
	public void the_user_is_on_the_my_self_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("the following user information should be displayed")
	public void the_following_user_information_should_be_displayed(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new PendingException();
	}

	
	
}
