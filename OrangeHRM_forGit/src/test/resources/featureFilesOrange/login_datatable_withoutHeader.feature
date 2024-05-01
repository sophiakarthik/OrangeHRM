Feature: feature file for login functionality

  Scenario: user logs in with valid username and password
    Given you are on login page
    When you enter the usernam and passwrd
      | Admin | admin123 |
    And you clicks the login button
    Then you should be logged in to dashboard
#it is not working
