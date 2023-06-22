Feature: Log in

  Scenario: User can log in
    Given User is on Login page
    When User inserts username "tomsmith"
    And User inserts password "SuperSecretPassword!"
    And User clicks on Login button
    Then User is logged in