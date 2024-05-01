Feature: feature file for login functionality

  Scenario Outline: user login with correct username and password
    Given user z in login page
    And user enter the username  "<Username>" and password "<Password>"
    When user click on the login button
    Then user shd be loggd in to dashboard

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admi123  |
