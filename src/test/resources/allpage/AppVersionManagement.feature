Feature:Test function on app version management page

  @VersionManagement
  Scenario Outline: Test add a new app version and publish to mobile side
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest app version for <platform>
    And Add a new app version and verify result
    And Add install file set remind upgrade to yes and publish to mobile side
    And Set up testing environment on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify app version is effective
    Then Tear down for mobile driver
    And Go back to website to set remind upgrade to no
    Examples:
      | name       | password | platform | country | name1       | password1 |
      | linfeng.ma | Eco@2018 | android  | 中国      | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | android  | 美国   | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | android  | 德国   | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | android  | 新加坡 | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | ios      | 中国     | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | ios      | 美国   | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | ios      | 德国   | 18616915369 | 665258    |
#      | linfeng.ma | Eco@2018 | ios      | 新加坡 | 18616915369 | 665258    |

