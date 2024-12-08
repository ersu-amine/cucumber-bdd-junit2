@wip
Feature: As a user I should be able to see products on the Products page

  Background:
    Given user is on the login page

  Scenario Outline: User should be able to see all products on the products page
    When user enters "<username>" and "<password>"
    And user should land on the products page
    And user sees the following products
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  Scenario: User should see matching title, description, price and image of each item on the products and the item page
    When user enters "<username>" and "<password>"
    #TODO
    #And user sees the following products




