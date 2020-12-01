Feature: MySubjectCat Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to MySubjectCat page

  @RegressionTest
  Scenario: Create a MySubjectCat
    When Create a MySubjectCat on SubjectCategories and Name is "MySubjectCatt" and Code is "1905"
    Then Success message should be displayed

  @RegressionTest
  Scenario: Create a new Subject
    When Create a new Subject and name is "NewSubject" and code ise "1905"
    Then Select a Categories and Select a Style

  @RegressionTest
  Scenario: Delete

    And  User try delete the Category "MySubjectCatt"

  # Scenario: Create a Subjects
   # When Create a Subjects name as "GS" and code is "1905"
