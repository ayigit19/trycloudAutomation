Feature: As a user, I should be able to log in.
@task1
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and passcode "<password>"

    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username    | password    |
      | user3       | Userpass123 |
      | user33      | Userpass123 |
      | user63      | Userpass123 |
      | user93      | Userpass123 |