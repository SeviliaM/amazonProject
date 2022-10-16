Feature: This feature allows user to search for the items

  Background:
    Given Open the browser


  Scenario:
    When User clicks on search field
    And User enters input
    And User clicks on search button
    Then Verify search result is displayed
