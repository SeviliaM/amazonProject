Feature: This feature file allow user to login

  Background:
    Given Open browser


  Scenario: Verify user is able to login with valid email and password
    When User enter email address
    And  User clicks on continue
    When  User enter password
    And  User is able to click login button
    Then User is able successfully login to account



  Scenario:Verify user is able to login with valid phone number and password

    And  User clicks on continue
    Then User enter phone number and password
    And  User is able to click login button
    Then User is able successfully login to account









