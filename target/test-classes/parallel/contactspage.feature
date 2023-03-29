Feature: Contacts page feature

Background:
Given user into RBG and will use contacts feature
|username|password|
|test-merchant@tier5.in|123456|




Scenario: As a gym owner he/she should open Contact modal and test SMS feature
When user clicks on the contact menu
Then contact page title should be "Red Belt Gym - Contacts"
When user clicks on a contact having no number
And contact modal opens and user clicks on inbox tab
Then SMS button should be disabled
Then close this contact
When user clicks on a contact having a number
And contact modal opens and user clicks on inbox tab
Then SMS button should be enabled
Then user clicks on SMS button
And user should be able to send SMS
And checks in communication log
And user clicks on contacts again
And selects multiple users
And selects Bulk SMS option
When Bulk SMS modal opens
And user sends Bulk sms
Then Bulk SMS should be sent and reflecting in communication log



Scenario: As a gym owner I should open Contact modal and test email feature
When user clicks on the contact menu
Then contact page title should be "Red Belt Gym - Contacts"
When user clicks on a contact having no email
And contact modal opens and user clicks on inbox tab
And user clicks on Email button
Then email disabled or enabled message should show
Then close this contact
When user clicks on a contact having an email
And contact modal opens and user clicks on inbox tab
And user clicks on Email button
Then email disabled or enabled message should show
And user should be able to send Email
And checks in communication log
And user clicks on contacts again
And selects multiple users
And selects Bulk Email option
And Bulk Email modal opens
And user sends Bulk Email
Then Bulk Email should be sent and reflecting in communication log





#Scenario: As a gym owner he/she should open Contact modal and check the page title
#When user clicks on the contact menu
#Then contact page title should not be "RBG - Contacts"



#Scenario: As a gym owner he/she should not be able to send sms to a contact if the contact does not have number
#When user clicks on the contact menu
#When user clicks on a contact having no number
#And contact modal opens and user clicks on inbox tab
#Then SMS button should be disabled




#Scenario: As a gym owner he/she should be able to send sms to a contact if the contact has a number
#When user clicks on the contact menu
#And user clicks on a contact having a number
#And contact modal opens and user clicks on inbox tab
#Then SMS button should be enabled
#
#
#
#
#Scenario: As a gym owner he/she should be sble to send SMS to a contact having a number
#When user clicks on the contact menu
#And user clicks on a contact having a number
#And contact modal opens and user clicks on inbox tab
#Then user clicks on SMS button
#And writes and sends SMS
#
#
#
#
#Scenario: As a gym owner he/she should be able to send SMS using templates
#When user clicks on the contact menu
#And user clicks on a contact having a number
#And contact modal opens and user clicks on inbox tab
#Then user clicks on SMS button
#And user selects a SMS template
#And writes and sends SMS
#
#
#
#
#Scenario: As a gym owner he/she should be able to send SMS and check in communication log
#When user clicks on the contact menu
#And user clicks on a contact having a number
#And contact modal opens and user clicks on inbox tab
#Then user clicks on SMS button
#And user selects a SMS template
#And writes and sends SMS
#And checks in communication log the latest communication