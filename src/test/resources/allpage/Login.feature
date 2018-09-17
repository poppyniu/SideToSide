Feature:Test function on login page

  @Login
  Scenario Outline: Test valid login for china user
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |

  @InvalidLogin
  Scenario: Test invalid login for china user
    Given  Open china area login page
    And Input nothing and click login button and check remind info
    And Input invalid name or password then click login button and check remind info
