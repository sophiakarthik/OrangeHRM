Feature: feature file for login functionality

  Scenario: user login with valid username and password
    Given user is in login page 
    And user enters the username  "Admin"
    And user enters the password  "admin123"
    When user clicks on the login button
    Then user shd be logged in to dashboard
