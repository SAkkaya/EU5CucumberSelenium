@login @smoke
Feature: Users should be able to login

  Background:    #instance bloc gibi her method dan once calisiyor
    Given the user is on the login page

@driver @VYT-123
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login

@sales-manager  @VYT-123
  Scenario:  Login as a sales manager
    When the user enters the sales manager information
    Then  the user should be able to login

@store_manager
  Scenario: Login as a store manager
    When the user enters the store manager information
    Then  the user should be able to login


