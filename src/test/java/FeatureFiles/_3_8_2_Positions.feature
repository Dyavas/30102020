Feature: Positions functionality

  #Yeni bir Positions oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
  #Human Resources > Setup > Positions

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Positions page

  @RegressionTest
  Scenario: Create a Positions
    When Create a Positions name as "herne1" and shortName as "hrn1"
    Then Success message should be displayed

  Scenario:Edit a Positions
    When Name a Positions edit the "herne1" to "herne2"
    Then Success message should be displayed

  Scenario: Delete a Positions
    When Name a Positions delete The "herne2"
    Then Success message should be displayed