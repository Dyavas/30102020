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
    And Click in the Type new Type form
    And Create a Select name as "countryOfTheCityDropDown" and value as " Personal "
    And Create a codeInput name as "orderInput" and value as "3"
    And Click expenseSelect Button
    And Create a Select name as "countryOfTheCityDropDown" and value as " 2.2 | Расходы на развитие образовательной деятельности "
    And Click Save Button
    Then Success message should be displayed

  @RegressionTest
  Scenario: Edit a Budget
    And Name a Budget edit the "nameDeneme"
    When Create a Budget name
      |nameInput|YeninameDeneme|
      |codeInput|YenicodeDeneme|
    And Click in the Type new Type form
    And Create a Select name as "countryOfTheCityDropDown" and value as " Production "
    And Create a codeInput name as "orderInput" and value as "7"
    And Click expenseSelect Button
    And Create a Select name as "countryOfTheCityDropDown" and value as " 2.3 | Расходы на социальные мероприятия/Расходы на рекламу "
    And Click Save Button
    Then Success message should be displayed

  Scenario: Delete a Budget
    When Name is delete
    Then Success message should be displayed