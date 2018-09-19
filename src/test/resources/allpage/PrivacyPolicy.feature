Feature:Test function on privacy policy page

  @Privacy
  Scenario Outline: Test add a new privacy policy and publish to mobile side
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest privacy policy version
    And Add a new privacy policy and verify result
    And Publish the new privacy policy and verify publish result
    And Set up testing environment on <platform>
    And Choose <country> as login country on <platform>
    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify privacy policy is effective
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

  @SearchPrivacy
  Scenario Outline: Test search and view a privacy policy function
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Search privacy policy and check search result
    And View detailed info for a privacy policy
    Examples:
      | name       | password | country |
      | linfeng.ma | Eco@2018 | 中国      |
      | linfeng.ma | Eco@2018 | 美国      |
      | linfeng.ma | Eco@2018 | 德国      |
      | linfeng.ma | Eco@2018 | 新加坡     |

  @EditPrivacy
  Scenario Outline: Test edit a privacy policy
    Given Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest privacy policy version
    And Add a new privacy policy and verify result
    And Edit a new privacy policy and verify result
    Examples:
      | name       | password | country |
      | linfeng.ma | Eco@2018 | 中国      |
      | linfeng.ma | Eco@2018 | 美国      |
      | linfeng.ma | Eco@2018 | 德国      |
      | linfeng.ma | Eco@2018 | 新加坡     |
