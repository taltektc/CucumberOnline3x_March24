Feature: TalentTEK Signup


  Scenario: Create new account with valid email and password
    Given student at TalentTEK Homepage
    And student clicks on Create New Account button
    And student enter their first name
    And student enter their last name
    And student enter their email
    And student enter their password
    And student confirm their password
    And student enter their dob such month, date and year
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should be able to get an student Id

  Scenario: Student should not able to create account with invalid email and valid password
    Given student at TalentTEK Homepage
    And student enter their first name
    And student enter their last name
    And student enter their invalid email
    And student enter their password
    And student confirm their password
    And student enter their dob such month, date and year
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should get an error message about email is being incorrect