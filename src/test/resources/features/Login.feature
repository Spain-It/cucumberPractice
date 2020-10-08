Feature: Login TiwiliaERP
  @vip
  Scenario: login with valid credentials
    Given the user goes to link
    And the user logs in "eventscrmmanager22@info.com" "eventscrmmanager"

    Scenario: navigate to Employees
      Given the user goes to link
      And the user logs in "eventscrmmanager22@info.com" "eventscrmmanager"

