Feature: Product Search on GIVA
  Background:
    Given user launches the browser
    When user navigates to home page
    Then GIVA homepage should be displayed
  @SmokeTest
  Scenario Outline: User searches for a product on GIVA
    And user searches for "<product>"
    Then search results for "<product>" should be displayed

    Examples:
      | product              |
      | Silver Flamme Ring   |
      | Gold Necklace        |
      | Diamond Earrings     |
