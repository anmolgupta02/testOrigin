Feature: Login Test

  Scenario: Login test with valid credentials
  	Given Open Browser and Go to portal
  	When User submits valid username and password
  	Then user should be navigated to portal landing screen
  	And Application should be closed