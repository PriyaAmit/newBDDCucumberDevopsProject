package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am at Login page")
	public void preconditions() {
		System.out.println("preconditions has been executed");
	    	}
	@When("I enter username")
	public void enteringUsername() {
		System.out.println("entered username");
	    
	}
	@When("I enter password")
	public void enteringPassword() {
		System.out.println("entered password");
	   
	}
	@When("i click on login")
	public void loginButton() {
		System.out.println("login done");
	    
	}
	

@Then("i should be able to login")
public void i_should_be_able_to_login() {
System.out.println("user validated successfully");



System.out.println("user validated successfully...............wow.............nice");
}


}
