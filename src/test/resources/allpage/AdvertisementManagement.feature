Feature:Test function on advertisement management page

  @advertisement
  Scenario Outline: Test add a new advertisement and enable to mobile side
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Add a new advertisement and enable it
    And Set up testing environment on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify advertisement is effective
    And Go back to website to disable advertisement
    Then Tear down for mobile driver
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

