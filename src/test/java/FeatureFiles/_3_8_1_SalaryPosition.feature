Feature: Salary functionality

  #3.8.1) Yeni bir Position Salary oluşturun onu duzenleyin (editleyin) ve onu silin.
  #Human Resources > Setup > Position Salary
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Salary page
  @RegressionTest
  Scenario: Create Salary
    When Create a Salary name as "herne"
    Then Success message should be displayed

  @RegressionTest
  Scenario:Edit a Salary
    When Name edit the "herne" to "Nrw"
    Then Success message should be displayed

  @RegressionTest
  Scenario: Delete a Salary
    When Name delete The "Nrw"
    Then Success message should be displayed

