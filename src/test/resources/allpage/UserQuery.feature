Feature: Test function on user query page


  @UserQuery
    Scenario Outline:  Use the user query function
    Given  Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And User Query
    Examples:
      | name       | password | platform | country   | name1  | password1 |
      | linfeng.ma | Eco@2018 | android  | 中国     | 18616915369 | 665258    |