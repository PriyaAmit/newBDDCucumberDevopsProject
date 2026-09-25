package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//row starts from 0th indext
/*| Erin | Smith | erin.smith@gmail.com | 9876543210 |
| Robert | Jackson | robert.jackson@gmail.com | 9988776655 |
| Alex | Johnson | alex.johnson@gmail.com | 2233445566 |*/
public class DataTableRegistrationSteps {

@Given("user is at the accounts page")
public void user_is_at_the_accounts_page() {
	System.out.println("navigated to accounts page");
    
}
@When("user enters the following data")
public void user_enters_the_following_data(io.cucumber.datatable.DataTable dataTable) {
	
	System.out.println("using List of List +++++++++++++++++++++++++++++++++++++++");
	///to get all the data
	List<List<String>> allData= dataTable.asLists();
	System.out.println(allData);
	//to get the first row
	List<String> firstRow=allData.get(1);
	System.out.println(firstRow);
	String emailAdress=firstRow.get(2);
	System.out.println(emailAdress);
	
	//in a single line how to do that
	String phoneNumber=allData.get(0).get(3);
	System.out.println(phoneNumber);
	
	System.out.println("using  Map   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	List<Map<String,String>>  allMapData= dataTable.asMaps();
	Map<String,String>   firstIndex=allMapData.get(0);
	String emailAd=firstIndex.get(0);
	System.out.println(emailAd);
	//in one line//
	String phoneNo=allMapData.get(0).get(3);
   
}
@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
	System.out.println("clicked on submit button");
    
}
@Then("user should get confirmation message")
public void user_should_get_confirmation_message() {
	System.out.println("confirmation received and validated!!!!!!!!!!");
}


}
