Feature: Users should be able to manage filters on
  the Vehicles Cost page

  @test1
  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page.
  Expected Column names: TYPE, TOTAL PRICE, DATE
    Given the user logged in as "<userType>"
    When user is on the "Fleet" on "Vehicle Costs" page
    Then the user can see three columns on the Vehicle Costs page
      | Type        |
      | Total Price |
      | Date       |


    Examples:
      | userType      |
      | sales manager |
      |store manager|

