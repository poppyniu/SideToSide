Feature: Test function on message management page

  @MessagePush
  Scenario Outline:  Use the message push function
    Given  Open <country> area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Add Message Push
    And Set up testing environment on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name1> and <password1> and click login button in <country>
    And Login to <platform> mobile to verify add message push
    Then Tear down for mobile driver
    Examples:
      | name       | password | platform | country   | name1  | password1 |
      | linfeng.ma | Eco@2018 | android  | 中国     | 15259562596 | zxw15259562596    |