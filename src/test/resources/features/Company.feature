@B33G3
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario: Verify login with different user types
    Given user is logged in with valid credentials
    When user clicks   Company button
    Then User should be able to see below modules;


      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Company        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |






