Feature: Positions functionality

  #Human Resources > Setup > Position Salary
  #Yeni bir Positions oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
  #Human Resources > Setup > Positions
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Positions page

  Scenario: Create Positions
    When Create a Positions name as "Herne" shortName as"hrn"
    Then Success message should be displayed

  Scenario:Edit a Positions
    When Name edit the "Deneme1" to "Deneme2"
    Then Success message should be displayed

  Scenario: Delete a Positions
    When Name delete The "Deneme2"
    Then Success message should be displayed