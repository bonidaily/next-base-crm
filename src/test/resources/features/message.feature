@B33G3-135
Feature: User should be able to send messages by clicking on Message tab in the Activity Stream

  Background:
    Given user is log in with valid credentials

  @B33G3-113
  Scenario: Verify that the user can see The message title is not specified
    When user click on message tab
    And user click on send button
    Then user should see The message title is not specified

  @B33G3-114
  Scenario: Verify that the user can see Please specify at least one person
    When user click on message tab
    And user should write a message "Hello Cydeo" in the message box
    And user should delete the recipient
    And user click on send button
    Then user should see Please specify at least one person

  @B33G3-132
  Scenario: Verify that the message delivery is to 'All employees' by default
    When user click on message tab
    Then user should see All employees has been selected by default

  @B33G3-133
  Scenario: Verify that the user can cancel sending message at any time before sending
    When user click on message tab
    And user click on cancel to cancel the send
    Then user should see Send message ... and the message should be canceled



