@addLink
Feature: user should be able to add link in message

  Background:
    Given the user is on the login page

  Scenario:Verify that the user can attach a link to the specified text.
    When user click  Message button message tab opens
    Then user click Link button
    Then user can attach a link to the specified text.
    Then user click to save button
    Then  user click on to send Button to see the link
    Then user is able to see the link displayed


  Scenario: Verify that by clicking on the link the user can navigate to the correct URL.
    Given user sees the expected "https://www.apple.com/" link URL in message area
    When user click to the link navigate to the correct URL
    Then user should see the title "Apple"of new webPage


Scenario: Verify that the link is opened in a new tab.
  Given user click to the link navigate to the correct URL
  When I click on the link to open in a new tab
  Then Verify that the link is opened in a new tab


