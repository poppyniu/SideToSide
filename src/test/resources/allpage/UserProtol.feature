Feature:Test function on user protocol page

  @Protocol
  Scenario Outline: Test add a new user protocol and publish to mobile side
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

  @SearchProtocol
  Scenario Outline: Test search and view a user protocol
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Search user protocol and check search result
    And View detailed info for a protocol
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |

  @EditProtocol
  Scenario Outline: Test edit a user protocol
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest user protocol version
    And Add a new user protocol and verify result
    And Eit a new user protocol and verify result
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |