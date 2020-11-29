Feature: ReportExcelTemplate functionality

#  3.9.1) Yeni bir Excel Template oluşturun onu DUZENLEYIN (editleyin) ve SILIN.
#  Reports > Setup > Excel Template
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to ReportExcelTemplate page
  @RegressionTest
  Scenario: Create a ReportExcelTemplate
    When Create a ReportExcelTemplate name as "Herne1"
    Then Success message should be displayed

  Scenario:Edit a ReportExcelTemplate
    When Name a ReportExcelTemplate edit the "Herne1" to "Herne2"
    Then Success message should be displayed

  Scenario: Delete a ReportExcelTemplate
    When Name a ReportExcelTemplate delete The "Herne2"
    Then Success message should be displayed