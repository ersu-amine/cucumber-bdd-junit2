@wip
Feature: User should be able to login

  Scenario Outline: User should be able to login with valid credentials
    Given user is on the login page
    When user enters "<username>" and "<password>"
    Then user should land on the "products" page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |