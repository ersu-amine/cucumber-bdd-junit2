Feature: As a user I should be able to see products on the Products page

  Background:
    Given user is on the login page
    When user enters "standard_user" and "secret_sauce"

Scenario: User should see all products on the products page
  And user sees the following products
  |product1|
  |product2|
  |product3|
  |product4|
  |product5|
  |product6|

  Scenario: User should see same product image on products page and item specific page
    And user clicks a product
    Then user should see matching product image


