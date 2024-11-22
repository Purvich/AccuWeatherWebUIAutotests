Feature: Success login

  Background:
    Given Open site

  Scenario:
    When Click on the login button to open the authorization window
    And Fill input Login
    And Fill input Password
    And Click on button "Login"
    Then Check success authorization