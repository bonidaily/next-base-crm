@B33G3-162
Feature: Users should be able to login

  Background: User is already in the log in page
    Given user is logged in with valid credentials


  @B33G3-161
  Scenario: Access Employees page with 8 different modules view  in the Employees page
    Given user should be able to login the page
    Then user should be able to click the Employees page.
    And user should be able to see the Company Structure as default
    Then user should verify that modules as below are seen in the Employees Page
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |















