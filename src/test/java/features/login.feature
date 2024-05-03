Feature: Login

  Background:
    Given student at TalentTEK Homepage

  @login @regression @smoke @hb
  Scenario: Student should be able to login with valid credentials
    And student enter their valid email address
    And student enter their password during Login
    When they click on Login button
    Then student should be successfully login

  @login @regression @smoke
  Scenario: Student should not be able to login with invalid email address
    And student enter their invalid email address
    And student enter their password during Login
    When they click on Login button
    Then student should not able to successfully login

  @login @regression @smoke @fail
  Scenario: Student should be able to login with valid credentials
    And student enter their valid email address
    And student enter their password during Login
    When they click on Login button
    Then student should be successfully login but failing on purpose


