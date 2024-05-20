@B33G3-128
Feature:As a user, I should be able to upload files and pictures while sending appreciation

#Background: User is already in the log in page
  #  Given the user is on the login page

  #Scenario: Verify login with different user types
#Given user is logged in with valid credentials
@B33G3-121
  Scenario Outline: Verify that the user can upload files and pictures.

    Given User is logged in with valid credentials
    When User clicks on More tab
    And user clicks on the appreciation tab
    And User clicks on attachment Button
    And User clicks on the upload files and images and select the files "<file path>"
    Then the user should be able to see the "<file Name>"

    Examples:
      | file path                                  | file Name          |
      | C:\Users\zerrin\Desktop\Screenshot.jpeg    | Screenshot.jpeg    |
      | C:\Users\zerrin\Desktop\2_image.png        | 2_image.png        |
      | C:\Users\zerrin\Desktop\Cucumber.docx      | Cucumber.docx      |
      | C:\Users\zerrin\Desktop\Zerrin.txt         | Zerrin.txt         |
      | C:\Users\zerrin\Desktop\Java_Technical.pdf | Java_Technical.pdf |

  @B33G3-122
  Scenario Outline: Verify that the user can insert the files and images into the text.

    Given User is logged in with valid credentials
    When User clicks on More tab
    And user clicks on the appreciation tab
    And User clicks on attachment Button
    And User clicks on the upload files and images and select the files "<file path>"
    Then the user should be able to see the "<file Name>"
    And the user clicks insertBtn
    Then user should be able to see file or image in the message body

    Examples:
      | file path                                  | file Name          |
      | C:\Users\zerrin\Desktop\Screenshot.jpeg    | Screenshot.jpeg    |

  @B33G3-123
  Scenario Outline: Verify that the user can remove files and images at any time before sending.

    Given User is logged in with valid credentials
    When User clicks on More tab
    And user clicks on the appreciation tab
    And User clicks on attachment Button
    And User clicks on the upload files and images and select the files "<file path>"
    Then the user should be able to see the "<file Name>"
    And the user clicks insertBtn
    Then user should be able to see file or image in the message body
    Then the user should be able to remote files and images

    Examples:
      | file path                                  | file Name          |
      | C:\Users\zerrin\Desktop\Screenshot.jpeg    | Screenshot.jpeg    |












