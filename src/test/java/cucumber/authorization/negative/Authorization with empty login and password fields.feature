Feature: Authorization with an empty login and password fields

  Background:
    Given Open site

  Scenario:
    When Click on the login button to open the authorization window
    And Click on button "Login"
    Then Authorization error check