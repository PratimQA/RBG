Feature: Appointment feature

Background:
Given user has already logged in to application
|username|password|
|test-pratim@gmail.com|123456|

Scenario: Appointment Page Title
Given user is on dashboard page
When user clicks on appointment section
Then page title should be "Red Belt Gym - Appointment"

Scenario: Create Appointment
Given user is on dashboard page
When user clicks on appointment section
Then user will see appointment screen
And user will click on create appointment
Then user will enter the appointment details and click on submit

#Scenario: View Appointments
#Given user is on dashboard page
#When user clicks on appointment section
#Then user will see appointment screen
#And click on Month tab
#And click on Week tab
#And click on Day tab
#And finally click on List
#
#Scenario: Create and check Appointments
#Given user is on dashboard page
#When user clicks on appointment section
#Then user will see appointment screen
#And user will click on create appointment
#Then user will enter the appointment details and click on submit
#And user will go to Contacts section
#And search for the contact whose appointment was created
#Then user will click on that contact
#And in contact modal user will click on Appointment section
#And the appoinments created should show