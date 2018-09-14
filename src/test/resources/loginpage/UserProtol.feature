Feature:Test function on user protocol page

  @Protocol
  Scenario Outline: Test add a new user protocol
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest user protocol version
    And Add a new user protocol and verify result
    And Publish the new protocol and verify publish result
    And Set up testing environment on <platform>
    And Login to <platform> mobile to verify protocol is effective
    Then Tear down for mobile driver
    Examples:
      | name       | password | platform |
      | linfeng.ma | Eco@2018 | android  |
