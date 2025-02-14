@Sort
Feature: As a customer, I want to sort products by price/name to find items within my budget

  Background: User has logged in and user is on the products page
    Given user is on the login page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page

  Scenario: User should be able to sort products by price (low-high)
    And user selects "Price (low to high)"
    Then user should see prices of products in "ascending" order

  Scenario: User should be able to sort products by price (high-low)
    And user selects "Price (high to low)"
    Then user should see prices of products in "descending" order

  Scenario: User should be able to sort products by name (A to Z)
    And user selects "Name (A to Z)"
    Then user should see product names of products in alphabetical ascending order

  Scenario: User should be able to sort products by name (Z to A)
    And user selects "Name (Z to A)"
    Then user should see product names of products in alphabetical descending order

