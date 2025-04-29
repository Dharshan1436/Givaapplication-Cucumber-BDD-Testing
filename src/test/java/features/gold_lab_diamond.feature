Feature: Browse Gold with Lab Diamond jewelry on GIVA
  Background:
    Given user launches the browser
    When user navigates to home page
    Then GIVA homepage should be displayed
  @SmokeTest
  Scenario: User selects Gold with Lab Diamond category and applies filters
    Then Gold with Lab Diamond category page should be displayed
    When user selects product type Gold Necklace
    Then filtered jewelry should be visible
