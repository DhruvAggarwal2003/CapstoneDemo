Feature: Add to cart feature
Scenario: Add a product to the cart
Given the user is on the products page
When the user clicks the Add to Cart button for a product
Then the product should be added to the cart
