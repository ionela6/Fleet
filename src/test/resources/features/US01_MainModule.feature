Feature: Accessing main modules of the app

  @test01
  Scenario Outline: Store and Sales Managers see 8 module names
    Given the user is logged in as a "<userType>"
    When the user can see the below module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario: Drivers see 4 module names
    Given the user is logged in as "<userType>"
    When the user can see the following module names:
      | Fleet              |
      | Customers          |
      | Activities         |
      | System             |