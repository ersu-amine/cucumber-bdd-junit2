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
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
      | error_user    | secret_sauce |
      | visual_user   | secret_sauce |

  Scenario Outline: User should see matching title and description, price and image of each item on the products and the item page
    When user enters "<username>" and "<password>"
    And user should land on the products page
    And user clicks on item "Sauce Labs Backpack"
    Then user should see title "Sauce Labs Backpack", description and price on products page and item page are matching
    And user navigates back
    And user clicks on item "Sauce Labs Bike Light"
    Then user should see title "Sauce Labs Bike Light", description and price on products page and item page are matching
    And user navigates back
    And user clicks on item "Sauce Labs Bolt T-Shirt"
    Then user should see title "Sauce Labs Bolt T-Shirt", description and price on products page and item page are matching
    And user navigates back
    And user clicks on item "Sauce Labs Fleece Jacket"
    Then user should see title "Sauce Labs Fleece Jacket", description and price on products page and item page are matching
    And user clicks on item "Sauce Labs Onesie"
    Then user should see title "Sauce Labs Onesie", description and price on products page and item page are matching
    And user clicks on item "Test.allTheThings() T-Shirt (Red)"
    Then user should see title "Test.allTheThings() T-Shirt (Red)", description and price on products page and item page are matching

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
      | error_user    | secret_sauce |
      | visual_user   | secret_sauce |

  Scenario Outline: User should see matching title and image on the products and the item page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<image>" on item page

    Examples:
      | item title                        | image                                               |
      | Sauce Labs Backpack               | /static/media/sauce-backpack-1200x1500.0a0b85a3.jpg |
      | Sauce Labs Bike Light             | /static/media/bike-light-1200x1500.37c843b0.jpg     |
      | Sauce Labs Bolt T-Shirt           | /static/media/bolt-shirt-1200x1500.c2599ac5.jpg     |
      | Sauce Labs Fleece Jacket          | /static/media/sauce-pullover-1200x1500.51d7ffaf.jpg |
      | Sauce Labs Onesie                 | /static/media/red-onesie-1200x1500.2ec615b2.jpg     |
      | Test.allTheThings() T-Shirt (Red) | /static/media/red-tatt-1200x1500.30dadef4.jpg       |

  Scenario Outline: User should see matching title and image on the products and the item page
    When user enters "visual_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<image>" on item page

    Examples:
      | item title                        | image                                               |
      | Sauce Labs Backpack               | /static/media/sauce-backpack-1200x1500.0a0b85a3.jpg |
      | Sauce Labs Bike Light             | /static/media/bike-light-1200x1500.37c843b0.jpg     |
      | Sauce Labs Bolt T-Shirt           | /static/media/bolt-shirt-1200x1500.c2599ac5.jpg     |
      | Sauce Labs Fleece Jacket          | /static/media/sauce-pullover-1200x1500.51d7ffaf.jpg |
      | Sauce Labs Onesie                 | /static/media/red-onesie-1200x1500.2ec615b2.jpg     |
      | Test.allTheThings() T-Shirt (Red) | /static/media/red-tatt-1200x1500.30dadef4.jpg       |

  Scenario Outline: User should see matching title and image on the products and the item page
    When user enters "visual_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<image>" on item page

    Examples:
      | item title                        | image                                               |
      | Sauce Labs Backpack               | /static/media/sauce-backpack-1200x1500.0a0b85a3.jpg |
      | Sauce Labs Bike Light             | /static/media/bike-light-1200x1500.37c843b0.jpg     |
      | Sauce Labs Bolt T-Shirt           | /static/media/bolt-shirt-1200x1500.c2599ac5.jpg     |
      | Sauce Labs Fleece Jacket          | /static/media/sauce-pullover-1200x1500.51d7ffaf.jpg |
      | Sauce Labs Onesie                 | /static/media/red-onesie-1200x1500.2ec615b2.jpg     |
      | Test.allTheThings() T-Shirt (Red) | /static/media/red-tatt-1200x1500.30dadef4.jpg       |

  Scenario Outline: User should see matching title and image on the products and the item page
    When user enters "error_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<image>" on item page

    Examples:
      | item title                        | image                                               |
      | Sauce Labs Backpack               | /static/media/sauce-backpack-1200x1500.0a0b85a3.jpg |
      | Sauce Labs Bike Light             | /static/media/bike-light-1200x1500.37c843b0.jpg     |
      | Sauce Labs Bolt T-Shirt           | /static/media/bolt-shirt-1200x1500.c2599ac5.jpg     |
      | Sauce Labs Fleece Jacket          | /static/media/sauce-pullover-1200x1500.51d7ffaf.jpg |
      | Sauce Labs Onesie                 | /static/media/red-onesie-1200x1500.2ec615b2.jpg     |
      | Test.allTheThings() T-Shirt (Red) | /static/media/red-tatt-1200x1500.30dadef4.jpg       |





