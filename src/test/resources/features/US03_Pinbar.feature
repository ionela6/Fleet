@pinbar
Feature: user should be able to learn how to use the pinbar

  Scenario Outline: Display "How To Use Pinbar" information
    Given the user logged in as "<userType>"
    When user click the Learn how to use this space link
    Then user should see a heading "How To Use Pinbar"
    And user should see the text "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user should see an image on the page with this source "https://qa1.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg"
    Examples:
      | userType      |
      | sales manager |
      | store manager |



