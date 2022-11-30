Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then login page title should be "Red Belt Gym - Login"

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "test-pratim@gmail.com"
And user enters password "123456"
And user clicks on Login button