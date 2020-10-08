Feature: Employees
  @employees
  Scenario: navigate to Employees
    Given the user goes to link
    And the user logs in "eventscrmmanager22@info.com" "eventscrmmanager"
    And navigate to employees
    And click the list button
    Then print the email of David Samson
    Then print email be name "Jack Macklin"