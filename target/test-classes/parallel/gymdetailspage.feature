Feature: Gym details feature

Background:
Given user has already logged in to application
|username|password|
|test-user26@rbg.in|123456|

Scenario: As a gym owner he/she should be able to add the gym details for first time

Given User Launch Chrome browser
When User Opens URL "https://www.redbeltgym.com"
Then Page Title should be "Red Belt Gym - Login"
And User will Enter Email as "test-user26@rbg.in" and Password as "123456"
And User will click on Login button
Then User will click on general settings
And User will click on gym details
And Accordingly User will click on Edit button
Then User will fill up all fields
And Finally click on Save
    
    
    
Scenario: Gym profile picture can be added but this not mandatory

Given User Launch Chrome browser
When User Opens URL "https://www.redbeltgym.com"
Then Page Title should be "Red Belt Gym - Login"
And User will Enter Email as "test-user26@rbg.in" and Password as "123456"
And User will click on Login button
Then User will click on general settings
And User will click on gym details
And Accordingly User will click on Edit button
Then User will click on upload and select any png or jpg file
         
    
    
Scenario: As a gym owner once the details are added now i should only see the edit button    
    
Given User Launch Chrome browser
When User Opens URL "https://www.redbeltgym.com"
Then Page Title should be "Red Belt Gym - Login"
And User will Enter Email as "test-user26@rbg.in" and Password as "123456"
And User will click on Login button
Then User will click on general settings
And User will click on gym details
Then User must see the edit button beside the name of the gym
And Accordingly User will click on Edit button
And Update the details
    
    
    
