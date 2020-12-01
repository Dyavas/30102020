Feature: SalaryModifiers functionality

# Yeni bir Salary Modifiers oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
# Human Resources > Setup > Salary Modifiers
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to SalaryModifiers page
  @RegressionTest
  Scenario: Create a SalaryModifiers
    And Click to addButton
    When Create a SalaryModifiers name
      | description | deger1 |
      | variable    | deger2 |
      | amount      | 5 |
    Then Success message should be displayed

  @RegressionTest
  Scenario: Edit a SalaryModifiers
    And Name a SalaryModifiers edit the "deger1"
    When Name a SalaryModifiers edit the
      | description | yenideger1 |
      | variable    | yenideger2 |
      | amount      | yeniDeger3 |
    And Click Save Button
    Then Success message should be displayed

  @RegressionTest
  Scenario: Delete a SalaryModifiers
    And Name a SalaryModifiers delete the "yenideger1"
    Then Success message should be displayed