Feature: adding a product
Scenario: add one product and move to the cart

Background:
Given site launched successfully
When user enter valid credentials
Then user must logged in successfully

Given product page opens
When user filter the products
When user add the first product
When user clicks on the cart button
Then user is on product cart page
And product added successfully