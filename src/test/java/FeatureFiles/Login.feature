Feature: Login Functionality

  #username ve password girerek login dogrulama
  @SmokeTest @RegressionTest
  Scenario: Login with valid username and password

    #Siteyi ac- Basqar a git
  Given Navigate to basqar
    #username ve password gir velogin butonuna tiklat
  When Enter username and password and click Login button
    #Login oldugunu dogrula
  Then User should login successfully