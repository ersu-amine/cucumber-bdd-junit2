@smoke @logout
Feature: User should be able to logout successfully

Background:
  Given user is on the login page
  When user enters "standard_user" and "secret_sauce"

  Scenario: User can logout
    And user clicks on the hamburger menu
    And user clicks Logout link
    Then user should land on the login page

  Scenario: User cannot go back to logged in state by navigating back after successful logout
    And user clicks on the hamburger menu
    And user clicks Logout link
    And user should land on the login page
    And user navigates back
    Then user should see error message "Epic sadface: You can only access '/inventory.html' when you are logged in."


