Feature: Cash Withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100.00 in my account
    When I withdraw $20.0
    Then $20.0 should be dispensed
    And the balance of my account should be $80.00
