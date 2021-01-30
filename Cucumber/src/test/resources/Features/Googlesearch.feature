Feature: feature to test google search functionality
Scenario: validate google search is working

Given broweser is open
And user is on serach page
And user enters text in search box
And user cliks eneter 
Then search results displayed
