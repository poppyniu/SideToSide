Feature:Test function on privacy policy page

  @Privacy
  Scenario Outline: Test add a new privacy policy and publish to mobile side
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest privacy policy version
    And Add a new privacy policy and verify result
    And Publish the new privacy policy and verify publish result
    And Set up testing environment on <platform>
    And Login to <platform> mobile to verify privacy policy is effective
    Then Tear down for mobile driver
    Examples:
      | name       | password | platform |
      | linfeng.ma | Eco@2018 | android  |

  @SearchPrivacy
  Scenario Outline: Test search and view a privacy policy function
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Search privacy policy and check search result
    And View detailed info for a privacy policy
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |

  @EditPrivacy
  Scenario Outline: Test edit a privacy policy
    Given  Open china area login page
    When Input valid user <name> and <password> and click login button
    Then User login to system succeed
    And Get current newest privacy policy version
    And Add a new privacy policy and verify result
    And Edit a new privacy policy and verify result
    Examples:
      | name       | password |
      | linfeng.ma | Eco@2018 |
