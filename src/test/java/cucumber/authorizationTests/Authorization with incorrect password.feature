Feature: Authorization with incorrect password

  Background:
    Given Open site

  Scenario:
    When Click on the login button to open the authorization window
    And Fill input Login
    And Click on Password field
    And Fill input Password with incorrect data
    And Click on button "Login"
    Then Authorization error check