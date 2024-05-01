Feature: feature file for login functionality

  Scenario: user logs in with valid username and password
    Given user is on login page
    And user enters the username
    And user enters the password
    When users clicks on the login button
    Then user should be logged in
