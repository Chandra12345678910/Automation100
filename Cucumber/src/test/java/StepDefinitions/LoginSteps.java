package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on log in page")
	public void user_is_on_log_in_page() {
	    System.out.println("user is on log in page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on Login button");
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		System.out.println("user is navigated to login page");
	}
}
