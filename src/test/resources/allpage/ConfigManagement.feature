Feature:Test function on config management page

  @xiaoneng
  Scenario Outline: Test xiaoneng custom service page
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Set xiao neng working time
    And Set up testing environment on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify xiao neng working time is effective
#    Then Tear down for mobile driver
    Examples:
      | name       | password | platform | country |name1  | password1 |
      | linfeng.ma | Eco@2018 | android  | 中国   |18616915369 | 665258    |

