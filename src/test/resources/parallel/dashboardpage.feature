Feature: Dashboard feature

Background:
Given user has already logged in to application
|username|password|
|test-pratim@gmail.com|123456|



Scenario: Dashboard page title
Given user is on Dashboard page
Then Dashboard page title should be "Red Belt Gym - Dashboard"


Scenario: Select previous month for additional revenue
Given user is on Dashboard page
Then user selects previous month in additional revenue


Scenario: Select previous month for monthly recurring revenue growth
Given user is on Dashboard page
Then user selects previous month in monthly recurring revenue
