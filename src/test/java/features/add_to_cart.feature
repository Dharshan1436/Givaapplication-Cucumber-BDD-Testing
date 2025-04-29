Feature: Search product on GIVA site
  Background:
    Given user launches the browser
    When user navigates to home page
    Then GIVA homepage should be displayed
  @SmokeTest
  Scenario: Search and add Silver Flamme Ring to cart
    When user searches for Ring
    Then search results should be displayed
    When user clicks on the first product
    Then product detail page should be displayed
    When user adds the product to the cart
    And user views the cart
    Then cart should display the added product

