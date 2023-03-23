Feature: Communication log feature

Background:
Given user into RBG and will check communication log feature
|username|password|
|test-pratim@gmail.com|123456|

Scenario: As a gym owner he/she should be able to see communication log

When user clicks on headphone icon
Then communication log page title should be "Red Belt Gym - Communication Log"
And data should show in communication log



Scenario: As a gym staff he/she should be able to see communication log

When user clicks on headphone icon
Then communication log page title should be "Red Belt Gym - Communication Log"
And data should show in communication log





