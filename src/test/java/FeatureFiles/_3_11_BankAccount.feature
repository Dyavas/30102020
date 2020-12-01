Feature: BankAccount functionality

    Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to BankAccounts page

  @RegressionTest
  Scenario: Create a BankAccounts
    And Create a BankAccounts
    When Create a BankAccounts name is "Galatasaray" and Iban is "TR19051905"
    Then Currency is currencyDoviz and Integration Code is "1905"
    Then Success message should be displayed

  @RegressionTest
  Scenario: Delete a BankAccounts
    When Name is delete "Galatasaray"
    Then Success message should be displayed