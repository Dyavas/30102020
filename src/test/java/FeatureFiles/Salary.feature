Feature: Salary functionality

  #3.8) Yeni bir Position Salary oluşturun onu DUZENLEYIN (editleyin) ve onu
  #SILIN.
  #Human Resources > Setup > Position Salary
  #Yeni bir Positions oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
  #Human Resources > Setup > Positions
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Salary page

  Scenario: Create Salary
    When Create a Salary
    Then Success message should be displayed

  Scenario:Edit a Salary
    When Name edit the "herne" to "Nrw"
    Then Success message should be displayed

  Scenario: Delete a Salary
    When Name delete The "Nrw"
    Then Success message should be displayed

