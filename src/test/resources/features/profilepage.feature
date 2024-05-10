@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given user is logged in with valid credentials
    #Given the user logged in as "<userType>"
    #Given the user logged in with username as "User1" and password as "UserUser123"

  @B33G3-138
  Scenario: User should be able to access My Profile page.
    Given user should be able to login the page
    When user should be able to click My profile image icon
   And user should be able to click My profile option
    Then user should be able to see the following options on My Profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Then user should be able to verify that the email under the General tab is the same as the user’s account.

