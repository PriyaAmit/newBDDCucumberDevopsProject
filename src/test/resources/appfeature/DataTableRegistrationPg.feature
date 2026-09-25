Feature: Account opening application
Scenario: Opening bank account by considering nominee
Given user is at the accounts page
When user enters the following data
| Erin | Smith | erin.smith@gmail.com | 9876543210 |
| Robert | Jackson | robert.jackson@gmail.com | 9988776655 |
| Alex | Johnson | alex.johnson@gmail.com | 2233445566 |
And user clicks on submit button
Then user should get confirmation message

