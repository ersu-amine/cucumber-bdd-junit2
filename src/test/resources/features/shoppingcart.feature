Feature: As a user I should be able add products to my shopping cart

  Background:
    Given user is on the login page
    When user enters "standard_user" and "secret_sauce"

  Scenario: User should be able to add product to shopping cart from product page
    And user clicks add to cart button on any item
    And user clicks on the shopping cart
    Then user sees the correct item in the shopping cart

  Scenario: User should be able to add product to shopping cart from item specific page
    And user clicks a product
    And user clicks on the shopping cart
    Then user sees the correct item in the shopping cart


  Scenario: Shopping should have correct item count and total price
    And user clicks add to cart button on the following items
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |
    And user sees the correct item count on the shopping cart icon
    And user clicks on the shopping cart
    Then user sees the correct item count and total price

    #removing the item from cart