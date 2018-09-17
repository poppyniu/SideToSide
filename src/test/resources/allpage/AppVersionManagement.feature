Feature:Test function on app version management page

  @VersionManagement
  Scenario Outline: Test add a new app version and publish to mobile side
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest app version for <platform>
    And Add a new app version and verify result
    And Add install file set remind upgrade to yes and pulish to mobile side
    And Set up testing environment on <platform>
    And Login to <platform> mobile to verify app version is effective
    Then Tear down for mobile driver
    Examples:
      | name       | password | platform |
      | linfeng.ma | Eco@2018 | android  |

