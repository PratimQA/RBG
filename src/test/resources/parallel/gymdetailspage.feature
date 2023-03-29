Feature: Gym details feature

Background:
Given user has already logged in
|username|password|
|test-pratim@gmail.com|123456|

Scenario: As a gym owner he/she should be able to add the gym details for first time

When user clicks on the settings icon
And user clicks on gym details
Then Gym page title should be "Red Belt Gym - Gym Details"
And Accordingly User will click on Edit button
Then User will fill up all fields
And Finally click on Save
    
    
    
Scenario: Gym profile picture can be added but this not mandatory

When user clicks on the settings icon
And user clicks on gym details
And Accordingly User will click on Edit button
Then User will click on upload and select any png or jpg file
And Finally click on Save         
    
    
Scenario: As a gym owner once the details are added now i should only see the edit button    
    
When user clicks on the settings icon
And user clicks on gym details
Then User must see the edit button beside the name of the gym
And Accordingly User will click on Edit button
And Update the details    
    
    
