Feature: feature to test login functionality
Scenario: check login is successfull with valid credentials

Given user is on log in page
When user enters username and password
And clicks on Login button
Then user is navigated to login page


