@B33G3-134
Feature: As a user, I should be able to see all the options on the Activity stream page

  Background:
  #Given User in the homepage
  #When user log in with valid credentials
    Given User logs in with valid credentials

@B33G3-130
  Scenario:Verify that the user views the following options on the Activity Stream page.
    When User successfully logged in
    Then User should be able to see the following options
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |
@B33G3-131
  Scenario: Verify that the user views the following 4 options under the MORE tab.
    When User click on More tab
    Then User should be able to see four options
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |


