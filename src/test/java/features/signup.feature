Feature: TalentTEK Signup

  Background:
    Given student at TalentTEK Homepage
    And student clicks on Create New Account button
    And student enter their first name
    And student enter their last name

  @signup @regression @smoke
  Scenario: Create new account with valid email and password
    And student enter their email
    And student enter their password
    And student confirm their password
    And student enter their dob such month, date and year
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should be able to get an student Id

  @signup @regression
  Scenario: Login after creating a brand new account
    And student enter their email
    And student enter their password
    And student confirm their password
    And student enter their dob such month, date and year
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should be able to get an student Id
    And student enter their newly created studentId
    And student enter their password during Login
    When they click on Login button
    ## Then student should be able to successfully log in

  @signup @regression
  Scenario: Send values from feature file
    And student enter their email
    And student enter their password
    And student confirm their password
    And student enter their month as "Nov", day as "8" and year as "1986"
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should be able to get an student Id

  @signup @regression @dataProvider
  Scenario Outline: Create students by using all the 12 months
    And student enter their email
    And student enter their password
    And student confirm their password
    And student validate if they can select different months as "<Month>"
    Examples:
    |Month|
    |Jan   |
    |Feb   |
    |Mar   |
    |Apr   |
    |May   |
    |Jun   |


  @signup
  Scenario: Student should not able to create account with invalid email and valid password
    And student enter their invalid email
    And student enter their password
    And student confirm their password
    And student enter their dob such month, date and year
    And student enter their gender as male
    And student agrees with terms and conditions
    When student click on Create My Account button
    Then student should get an error message about email is being incorrect