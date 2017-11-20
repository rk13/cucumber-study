Feature: Cash Withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100.30 in my account
    When I withdraw $20.0
    Then $20.0 should be dispensed