Feature: Login with data inside the file
Scenario: Login with correct credentials
Given user at the home page
When user enters username as "testusername"
And user enters password as "Test@1234"
And user click on 1 login button wit slot 2.5
Then user logged in validated
