Feature:Test function on contact service page

  @contact
  Scenario Outline: Test add a new custom service for different area and search and delete
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Add a new custom service for <area>
    And Set up testing environment on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify custom service is effective
    And Go back to website to search and delete custom service for <area>
    Then Tear down for mobile driver
    Examples:
      | name       | password | platform | country | name1       | password1 | area |
      | linfeng.ma | Eco@2018 | android  | 中国      | 18616915369 | 665258    | CN   |
#      | linfeng.ma | Eco@2018 | android  | 美国      | 18616915369 | 665258    | US   |
#      | linfeng.ma | Eco@2018 | android  | 德国      | 18616915369 | 665258    | DE   |
#      | linfeng.ma | Eco@2018 | android  | 新加坡     | 18616915369 | 665258    | SG   |
#      | linfeng.ma | Eco@2018 | ios      | 中国      | 18616915369 | 665258    | CN   |
#      | linfeng.ma | Eco@2018 | ios      | 美国      | 18616915369 | 665258    | US   |
#      | linfeng.ma | Eco@2018 | ios      | 德国      | 18616915369 | 665258    | DE   |
#      | linfeng.ma | Eco@2018 | ios      | 新加坡     | 18616915369 | 665258    | SG   |

