Feature: Authorization with incorrect login

  Background:
    Given Open site

  Scenario:
    When Click on the login button to open the authorization window
    And Fill input Login with incorrect data
    And Click on Password field
    And Fill input Password
    And Click on button "Login"
    Then Authorization error check