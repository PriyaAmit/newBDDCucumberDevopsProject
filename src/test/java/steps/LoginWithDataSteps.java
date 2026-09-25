package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {


@Given("user at the home page")
public void user_at_the_home_page() {
 System.out.println("navigating to login page");
}
@When("user enters username as {string}")
public void user_enters_username_as(String uname) {
   System.out.println("enter username"+uname);
}
@When("user enters password as {string}")
public void user_enters_password_as(String pwd) {
    System.out.println("enter pwd"+pwd);
    Assert.assertTrue(false);
}
@When("user click on {int} login button wit slot {double}")
public void user_click_on_login_button_wit_slot(Integer int1, Double double1) {
    System.out.println("user click with int button number"+int1);
    System.out.println("user click with slot"+double1);
}
@Then("user logged in validated")
public void user_logged_in_validated() {
   System.out.println("user logged in validated successfullly!!!!!!!!gdhkhkhkjhj");
}
}
