Feature: City and country DeleteControl functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @RegressionTest
  Scenario: Create a country and a city
    When Navigate to country page
    And Create a country name as "Somecountrya1a12" and code as "12345d56789"
    And Success message should be displayed

  @RegressionTest
  Scenario: City
    When Navigate to city page
    And Create a city name as "ProjeDenemed7a112" and country name as "Somecountrya1a12"
    And Success message must be displayed!

  @RegressionTest
  Scenario: Contry
    Then Navigate to country page
    And User delete the "Somecountrya1a12"
    And Error message should be displayed!

  @RegressionTest
  Scenario: Delete
    When Navigate to city page
    And  User try delete the City  "ProjeDenemed7a112"
    And Success message should be observed