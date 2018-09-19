Feature:Test function on login page

  @Login
  Scenario Outline: Test valid login for china user
    Given  Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    Examples:
      | name       | password | country |
      | linfeng.ma | Eco@2018 | 中国      |
      | linfeng.ma | Eco@2018 | 美国      |
      | linfeng.ma | Eco@2018 | 德国      |
      | linfeng.ma | Eco@2018 | 新加坡     |

  @InvalidLogin
  Scenario Outline: Test invalid login for china user
    Given Open <country> area login page
    And Input nothing and click login button and check remind info
    And Input invalid name or password then click login button and check remind info
    Examples:
      | country |
      | 中国      |
      | 美国      |
      | 德国      |
      | 新加坡     |
