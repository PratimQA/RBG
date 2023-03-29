Feature: Program feature

Background:
Given user into RBG and will check program feature
|username|password|
|test-pratim@gmail.com|123456|

Scenario: As a gym owner he/she should be able to add program category

When user clicks on the gen settings
And user clicks on program label
Then program page title should be "Red Belt Gym - Courses"
And user will enter a course category
Then program category will be added


Scenario: As a gym owner he/she should be able to add a program

When user clicks on the gen settings
And user clicks on program label
Then user will click on Add a Program button
And enter details to add program
And save the program details