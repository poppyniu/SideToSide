Feature:Test function on login page

  @Login
  Scenario Outline: Test valid login for china user
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |
