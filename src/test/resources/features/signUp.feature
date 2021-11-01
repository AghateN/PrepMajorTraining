Feature: Sign Up
  As a user on https://develop1.prepmajor.com/
  I want to be able to register on the website
  So that I can access the website.

  Scenario Outline: Sign Up with valid credentials
    Given that user navigates to the PrepMajor website
    And user clicks on the sign up button
    And user enters a valid "<username>" and "<email>" and "<password>"
    And user confirms "<confirm password>"
    And user clicks on the agreement button
    When user clicks on Register button
    Then user is logged into his account
    Examples:
      | username      | email                   | password         | confirm password |
      | MaryJonesTest2 | MaryJonesTest2@gmail.com | MaryJones123Test2 | MaryJones123Test2 |






