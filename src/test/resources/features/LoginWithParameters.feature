Feature: Login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"
  # "user10" and "UserUser123"    ==> cucumber parameters, you can pass the information with the double code to java side

  @wip
  Scenario: login as a driver
    Given the user logged in as "salesmanager"
    Then the user should be able to login
    And the title contains "Dashboard"
    #driver, storemanager,salesmanager
  # you will have one step definition and it will handle different usertypes
    
