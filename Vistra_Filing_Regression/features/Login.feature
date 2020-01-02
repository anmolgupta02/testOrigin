@LoginTest
Feature: Login Test

  Scenario: Login test with valid credentials
    Given Open Browser and Go to portal
    When User submits valid "test1@liferay.com" and "test"
    Then user should be navigated to portal landing screen
    And Application should be closed
