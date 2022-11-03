Feature: Login

Scenario: Successful Login with Valid credentials
    Given User Launch Chrome browser
    When User Opens URL "https://www.redbeltgym.com"
    Then Page Title should be "Red Belt Gym - Login"
    And User will Enter Email as "test-user26@rbg.in" and Password as "123456"
    And User will click on Login button
    
