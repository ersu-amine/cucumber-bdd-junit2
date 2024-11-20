@wip
Feature: User should be able to login

  Scenario Outline: User should be able to login with valid credentials
    Given user is on the login page
    When user enters "<username>" and "<password>"
    Then user should land on the page with header "Products"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  Scenario Outline: User should not be able to login with invalid credentials
    Given user is on the login page
    When user enters "<username>" and "<password>"
    Then user should see error message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | username      | password     |
      | standard_user | scrt_sauce   |
      | out_user      | secret_sauce |
      | not_user      | apple_sauce  |

  Scenario: User should not be able to login without password
    Given user is on the login page
    When user enters "<username>"
    And user clicks login button
    Then user should see error message "Epic sadface: Password is required"

  Scenario: User should not be able to login without username and password
    Given user is on the login page
    And user clicks login button
    Then user should see error message "Epic sadface: Username is required"

