package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {


	@Given("I have logged into the application")
	public void preconditions()
	{
		System.out.println("Given statement");
	}
	
	@Given("I am at the home page")
	public void navToHomePage()
	{
		System.out.println("Navigated to homepage");
	}
	
	@When("I click on add button")
	public void addProfile()
	{
		System.out.println("Add button handled");
	}
	
	@When("I enter details")
	public void enteringDetails()
	{
		System.out.println("Details entered");
	}
	
// CTRL + SHIFT + O	
	@Then("Profile should get added")
	public void validateProfile()
	{
		System.out.println("Profile created!!!");
	}
	
	@When("I click on edit details")
	public void editButtonHandling()
	{
		System.out.println("Clicked on edit");
	}
	
	
	@When("I update data")
	public void updateDetails()
	{
		System.out.println("Details updated");
	}
	
	
	@Then("Profile should get updated")
	public void profileUpdation()
	{
		System.out.println("Profile has been updated");
	}
	
	@When("I click on delete button")
	public void clickOnDelete()
	{
		System.out.println("delete button clicked!!!");
	}
	
	@Then("Profile should get deleted")
	public void validateDelete()
	{
		System.out.println("Deletion validated");
	}

}
