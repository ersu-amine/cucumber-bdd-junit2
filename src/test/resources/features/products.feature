
Feature: As a user I should be able to see products on the Products page

  Background:
    Given user is on the login page

  Scenario Outline: User should see correct title and description, price of each item on the products page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    Then user should see title "<item title>", description and price on products page
    Examples:
      | item title                        |
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |

  Scenario Outline: User should see matching title and description, price of each item on the item page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see title "<item title>", description and price on item page

    Examples:
      | item title                        |
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |

  Scenario Outline: User should see matching title and image on the products and the item page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    And user should see matching "<item title>" and "<image>" on product page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<image>" on item page

    Examples:
      | item title                        | image                                               |
      | Sauce Labs Backpack               | https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg |
      | Sauce Labs Bike Light             | https://www.saucedemo.com/static/media/bike-light-1200x1500.37c843b0.jpg     |
      | Sauce Labs Bolt T-Shirt           | https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c2599ac5.jpg     |
      | Sauce Labs Fleece Jacket          | https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg |
      | Sauce Labs Onesie                 | https://www.saucedemo.com/static/media/red-onesie-1200x1500.2ec615b2.jpg     |
      | Test.allTheThings() T-Shirt (Red) | https://www.saucedemo.com/static/media/red-tatt-1200x1500.30dadef4.jpg       |




