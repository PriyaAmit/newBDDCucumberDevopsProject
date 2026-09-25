@campaigns
Feature: sending email campaign
Background:
Given user should be at campaign page
@sanity @regression
Scenario:create Campaign
When user clicks on create campaign button
Then user enters the information
Then campaign should get created

@regression
Scenario: update campaign
When user schedule the campaign by updating
Then campaign should get schedule

@functional
Scenario:delete campaign
When user click on delete button
Then campaign should get deleted

