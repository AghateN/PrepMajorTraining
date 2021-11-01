Feature: Hamburger menu icon
  As a registered user on https://develop1.prepmajor.com
  I want to be able to click on the Hamburger Icon
  So  that I can navigate my profile page

  Scenario: Verify that user is able to navigate into his profile page
    Given that user navigates to PrepMajor website
    And user signs into his account
    When user clicks on the hamburger button
    Then user is able to navigate into his profile
    And User sees the extended view of the Navigation panel which shows the Icon names on the left of the Panel and the Icon images to the Right of the names.

