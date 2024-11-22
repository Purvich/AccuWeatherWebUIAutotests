Feature: Authorization with an empty login field

  Background:
    Given Open site

    Scenario:
      When Click on the login button to open the authorization window
      And Fill input Password
      And Click on button "Login"
      Then Authorization error check