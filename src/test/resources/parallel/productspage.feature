Feature: Products feature

Background:
Given user into RBG
|username|password|
|test-pratim@gmail.com|123456|

Scenario: As a gym owner he/she should be able to add product category

When user clicks on the settings
And user clicks on products label
Then products page title should be "Red Belt Gym - Products"
And user will enter a category
Then product category will be added


Scenario: As a gym owner he/she should be able to add a product

When user clicks on the settings
And user clicks on products label
Then user will click on Add a Product button
And enter details to add product
And save the product details

     