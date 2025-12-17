Feature: Add Product to Cart
  As a logged user
  I want to add a product to my shopping cart
  So that I can purchase it later

  Background:
    Given user is on the Pet Store landing page

  Scenario: Successfully add a product to the cart
    When user select category "FISH"
    And user select product "Angelfish"
    Then user select item "Large Angelfish" and added it to cart