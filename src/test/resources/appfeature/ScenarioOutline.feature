Feature: Signup functionality
Scenario Outline: signup to application
Given user is at the signup page
When user enters name as "<name>" on form
And user select gender "<gender>"
And user enters age as <age> 
Then user gets created

Examples:
| name | gender | age |
| Eder | male | 28 |
| Ron | male | 30 |
| Diana | female | 32 |
| Alex | male | 34 |

