Feature: Login Functionality
Scenario: login with correct credentials
Given I am at Login page
When I enter username
And I enter password
And i click on login  
Then i should be able to login