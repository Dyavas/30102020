Feature: SalaryConstants functionality

# Yeni bir Salary Constants oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
# Human Resources > Setup > Salary Constants
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to SalaryConstants page
  @RegressionTest
  Scenario: Create a SalaryConstants
    And Click to addButton
    When Create a SalaryConstants name
      | formNameInput  | deger1     |
      | formDateInput  | 12/12/2020 |
      | formKeyInput   | Deger3     |
      | formValueInput | 5          |
    And Click Save Button
    Then Success message should be displayed

  @RegressionTest
  Scenario: Edit a SalaryConstants
   And Name a SalaryConstants edit the "deger1"
    When Name a SalaryConstants edit the
      | formNameInput  | Yenideger1     |
      | formDateInput  | 10/12/2020 |
      | formKeyInput   | YeniDeger3     |
      | formValueInput | 10          |
    And Click Save Button
    Then Success message should be displayed

  @RegressionTest
  Scenario: Delete a SalaryConstants
    And Name a SalaryConstants delete the "yenideger1"
    Then Success message should be displayed