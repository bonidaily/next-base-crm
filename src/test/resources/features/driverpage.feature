@B33G3-119
Feature: Driver menu item

  Background: User is already in the log in page
    Given the user is on the login page


  #Scenario: Verify login with different user types
    Given user is logged in with valid credentials
@B33G3-116
  Scenario: As a user, I should be able to access the Drive page.
    Given User is able to login home page
    Then User clicks Driver page
    Then User sees Modules are in the main header and user verifies modules

      | My Drive                   |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management’s documents |
      | Drive Cleanup              |
      | More                       |
