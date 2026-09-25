Feature: Fetch Order Information
Background: 
user is at the order page

Scenario: Fetch currently placed order information
Given user is at the order page
When user clicks on the currentOrder button
Then user should able to see the status

Scenario: Fetch already completed order
When user clicks on past order button
Then user should able to see past order details

Scenario: Fetch cancelled order information
When user clicks on cancelled button
Then user should able to cancelled order info