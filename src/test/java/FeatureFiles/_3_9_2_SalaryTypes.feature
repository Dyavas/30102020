Feature: SalaryTypes functionality

#  3.9) Yeni bir Excel Template oluşturun onu DUZENLEYIN (editleyin) ve SILIN.
#  Reports > Setup > Excel Template
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to SalaryTypes page
  @RegressionTest
  Scenario: Create a SalaryTypes
    And Click on the element in the dialogContent class

    When Create a SalaryTypes name as "herne1"

    And Click in the SalaryTypes new SalaryTypes form
    |salaryUserType|
    |option1|

    And Click  Click on the element in the dialogContent class
    Then Success message should be displayed

  Scenario:Edit a SalaryTypes
    When Name a SalaryTypes edit the "herne1" to "herne2"
    Then Success message should be displayed

  Scenario: Delete a SalaryTypes
    When Name a SalaryTypes delete The "herne2"
    Then Success message should be displayed