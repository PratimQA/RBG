Feature: Contacts page feature

Background:
Given user into RBG and will use contacts feature
|username|password|
|test-merchant@tier5.in|123456|




Scenario: As a gym owner he/she should open Contact modal and check the page title
When user clicks on the contact menu
Then contact page title should be "Red Belt Gym - Contacts"




Scenario: As a gym owner he/she should not be able to send sms to a contact if the contact does not have number
When user clicks on the contact menu
And user clicks on a contact having no number
And contact modal opens and user clicks on inbox tab
Then SMS button should be disabled




Scenario: As a gym owner he/she should be able to send sms to a contact if the contact has a number
When user clicks on the contact menu
And user clicks on a contact having a number
And contact modal opens and user clicks on inbox tab
Then SMS button should be enabled




Scenario: As a gym owner he/she should be sble to send SMS to a contact having a number
When user clicks on the contact menu
And user clicks on a contact having a number
And contact modal opens and user clicks on inbox tab
Then user clicks on SMS button
And writes and sends SMS



