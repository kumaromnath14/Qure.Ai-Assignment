@All
Feature: QureAi Login  page automation

  @SignUp
  Scenario Outline: Verify QureAi SignUp functionality
    Given Load the browser and Navigate to Pocker URL
    When User click on  SIGNUP link
    And User click & enter Username as "<username>" in usename field
    And user enter  Email as "<email>" in email field
    And user enter password as "<password>" in password field
    And User Click on signup button
    Then Than user Click on setting & click on logout button

    Examples: 
      | username | email             | password |
      | kumar8007  | kumar8007@gmail.com | user1234 |

  @SignIn
  Scenario Outline: Verify QureAi login functionality
    Given Load the browser and Navigate to Pocker URL
    When user click on  signin link
    And user enter  Email as "<email>" in email field
    And user enter password as "<password>" in password field
    And User Click on signin button
    And user clcik on new Article link
    And user enter article Tittle as "<tittle>" in article tittle field
    And user enter about article  as "<aboutarticle>" in  about article  field
    And user enter details of  article  as "<articledetails>" in  article details field
    And User Click on publish article button button
    And User Click on home button & filter from popular tags
    And user add comment as "<comment>" in article field
    And user able to follow the post
    And user able to favorite the post
    Then Than user Click on setting & click on logout button

    Examples: 
      | email            | password | tittle                | aboutarticle | articledetails                  | comment                           |
      | kumar4@gmail.com | user1234 | Testing please ignore | Assignment   | Assignment for QA,please ignore | comment added to post for testing |
