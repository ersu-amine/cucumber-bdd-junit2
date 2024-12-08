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

  Scenario Outline: User should see matching title, description, price and image of each item on the products and the item page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<description>" on item page

    Examples:
      | item title                        | description                                                                                                                                                            | price  |
      | Sauce Labs Backpack               | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.                                 | $29.99 |
      | Sauce Labs Bike Light             | A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.        | $9.99  |
      | Sauce Labs Bolt T-Shirt           | Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.                        | $15.99 |
      | Sauce Labs Fleece Jacket          | It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office. | $49.99 |
      | Sauce Labs Onesie                 | Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.        | $7.99  |
      | Test.allTheThings() T-Shirt (Red) | This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.              | $15.99 |


  Scenario Outline: User should see matching title and price on the products and the item page
    When user enters "standard_user" and "secret_sauce"
    And user should land on the products page
    And user clicks on item "<item title>"
    Then user should see matching "<item title>" and "<price>" on item page

    Examples:
      | item title                        | price  |
      | Sauce Labs Backpack               | $29.99 |
      | Sauce Labs Bike Light             | $9.99  |
      | Sauce Labs Bolt T-Shirt           | $15.99 |
      | Sauce Labs Fleece Jacket          | $49.99 |
      | Sauce Labs Onesie                 | $7.99  |
      | Test.allTheThings() T-Shirt (Red) | $15.99 |

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





