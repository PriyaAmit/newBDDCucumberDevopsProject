package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {



	

@Given("user should be at campaign page")
public void user_should_be_at_campaign_page() {
    System.out.println("Given statement");
}
@When("user schedule the campaign by updating")
public void user_schedule_the_campaign_by_updating() {
   System.out.println("updating details");
}
@Then("campaign should get schedule")
public void campaign_should_get_schedule() {
   System.out.println("Campaign scheduled!!!");
}


@When("user clicks on create campaign button")
public void user_clicks_on_create_campaign_button() {
   System.out.println("creating campaign");
}
@When("user enters the information")
public void user_enters_the_information() {
    System.out.println("Entered information");
}
@Then("campaign should get created")
public void campaign_should_get_created() {
   System.out.println("Campaign created!!!");
}

@When("user click on delete button")
public void user_click_on_delete_button() {
   System.out.println("Clicked on delete");
}
@Then("campaign should get deleted")
public void campaign_should_get_deleted() {
   System.out.println("Campaign deleted!!!!");
}

}


