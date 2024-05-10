@B33G3-144
Feature: As a user, I should be able to logout.

  Background:
    Given User logged in successfully
@B33G3-142
  Scenario: Verify that the user can log out from the app after clicking the “Log out” button.
    When User clicks on profile name
    When User clicks on Log out Button
    Then User should be able to log out
@B33G3-143
  Scenario: Verify that the user can see 5 options under the profile name.
    When User clicks on profile name
    Then User should be Able to see Five options under the profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
