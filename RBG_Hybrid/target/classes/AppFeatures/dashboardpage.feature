Feature: Dashboard feature

Background:
Given user has already logged in to application
|username|password|
|test-user26@rbg.in|123456|



Scenario: Dashboard page title
Given user is on Dashboard page
When user gets the title of the page
Then page title should be "Red Belt Gym - Dashboard"

