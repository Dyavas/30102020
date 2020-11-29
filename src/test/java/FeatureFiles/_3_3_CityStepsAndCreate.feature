Feature: City functionality
  @RegressionTest
     Scenario:  Create a City
      Given Navigate to basqar
      When Enter username and password and click Login button
      Then User should login successfully
      And Navigate to city page
      When Create a city name as "proje7Cityyyy" and country name as "p7ac1" and code as "asa5c514"
      Then Success message should be displayed

    Scenario: Delete a city
      Given Navigate to basqar
      When Enter username and password and click Login button
      Then User should login successfully
      And Navigate to city page
      When User delete the "proje7Cityyyy"
      Then Success message should be displayed