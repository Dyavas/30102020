Feature: Country Delete functionality
  @RegressionTest
  Scenario: Delete a country
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page
    When User delete the "pde123"
    Then Success message should be displayed