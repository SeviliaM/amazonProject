Feature: This feature file allow user to login

  Background:
    Given Open browser
    And  User clicks on  Hello sign in button
    And Verify user is on sign in page

  Scenario Outline:Verify user is able to login with valid email and password
    When User enter "<email>" address
    And  User clicks on continue
    When  User enter "<password>"
    And  User is able to click login button
    Then User is able successfully login to account

    Examples:
      | email         | password |
      | abc@yahoo.com | A@123    |
      | xyx@gmail.com | A@234    |

  Scenario Outline:Verify user is able to login with valid phone number and password
    When User enter "<phoneNumber>"
    And  User clicks on continue
    Then User enter "<password>"
    And  User is able to click login button
    Then User is able successfully login to account

    Examples:
      | phoneNumber  | password |
      | 234-456-2345 | S@1234   |
      | 345-567-0982 | S@0987   |







