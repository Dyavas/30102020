Feature: Country functionality
  @RegressionTest
  Scenario: Create Country
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page
    When Create a country name as "pde123" and code as "4561132"
    Then Success message should be displayed