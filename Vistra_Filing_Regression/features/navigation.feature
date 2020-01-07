@NavigationTests
Feature: Check on each for navigation.

  Scenario: User clicks on important links for navigation
    Given User is loggedIn
    When User clicks on Important links
    Then System must navigate to important links.
    And The browser should be closed
