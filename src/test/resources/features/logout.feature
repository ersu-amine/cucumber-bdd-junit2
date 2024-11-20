Feature: User should be able to logout successfully

Background:
  Given user is on the login page
  When user enters "standard_user" and "secret_sauce"

  Scenario: User can logout
    And user clicks on the hamburger menu
    And user clicks Logout link
    Then user should land on the login page
