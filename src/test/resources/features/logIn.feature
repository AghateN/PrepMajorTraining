Feature: Log in
  As a User on PrepMajor website
  I want to enter my login details
  So that I can be logged into my account

  Background:
    Given that user is on PrepMajor website
    When user clicks on the login button

  Scenario: Log in with valid credentials
    And user enters my Username
    And user enters my Password
    And user Clicks on Login
    Then user is logged in his account


  Scenario: Log in with invalid password
    And user enters my Username
    And user enters an invalid password
    And user Clicks on Login
    Then user is not logged in his account


  Scenario: Log in with invalid username
    And user enters an invalid username
    And user enters my Password
    And user Clicks on Login
    Then user is not logged in his account



