Feature: checking out the product
Scenario: items present in the cart should be checked out sucessfully

Background:
Given site launched successfully
When user enter valid credentials
Then user must logged in successfully

Given product page opens
When user filter the products
When user add the first product
When user clicks on the cart button
Then product added successfully

Given user is on cart page
When user clicks on checkout button
When user enter shipping details
When user clicks on continue button
When user click on finish button
Then item checked out successfully