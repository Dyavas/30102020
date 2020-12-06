Feature: BankAccount functionality

    Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Budget page

  @RegressionTest
  Scenario: Create a Budget
    And Create a Budget
    When Create a Budget name
    |nameInput|nameDeneme|
    |codeInput|codeDeneme|
    |typeSelect|  |
    |countryOfTheCityDropDown| Personal |
    |orderInput|3|
    |salaryUserType||
    |option| 4 |
    And Click Save Button
    Then Success message should be displayed

  @RegressionTest
  Scenario: Edit a Budget
    And Name a Budget edit the "nameDeneme"
    When Create a Budget name
      |nameInput|YeninameDeneme|
      |codeInput|YenicodeDeneme|
      |typeSelect|  |
      |countryOfTheCityDropDown| Personal |
      |orderInput|4|
      |salaryUserType||
      |option| 2 |
    And Click Save Button
    Then Success message should be displayed

  Scenario: Delete a Budget
    When Name is delete
    Then Success message should be displayed