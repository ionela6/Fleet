@us9
Feature: Users should see error messages while entering an invalid integer number
  into the calendar Repeat Every input box.

  Scenario Outline: Verify that users see error messages when enter integer less than 1.
    Given the user logged in as "<userType>"
    When user is on the "Activities" on "Calendar Events" page
    And user clicks on the Create Calendar event button
    And user checks the repeat checkbox
    And user enters a number less than one in the Repeat Every field
    Then error message one: "The value have not to be less than 1." is displayed under the field
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |

  Scenario Outline: Verify that users see error messages when enter integer more than 99.
    Given the user logged in as "<userType>"
    When user is on the "Activities" on "Calendar Events" page
    And user clicks on the Create Calendar event button
    And user checks the repeat checkbox
    And user enters a number more than ninetynine in the Repeat Every field
    Then error message two: "The value have not to be more than 99." is displayed under the field
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |
