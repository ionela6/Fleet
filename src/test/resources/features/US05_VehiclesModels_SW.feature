Feature: As a user, I want to view columns on the Vehicles Model page. (web-table)

  @US05
  Scenario Outline: Verify that the Store manager and Sales manager can see 10 columns on the
  Vehicles Model page.
    Given the user logged in as "<userType>"
    When user is on the "Fleet" on "Vehicles Model" page
    Then user can see following columns on the Vehicles Model page.

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | store manager |
      | sales manager |
  @US05
  Scenario Outline: Verify that drivers cannot access Vehicles Model page
    Given the user logged in as "<userType>"
    When driver navigates to the Vehicles Model page
    Then user sees the message "You do not have permission to perform this action."
    Examples:
      | userType |
      | driver   |
