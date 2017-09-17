Feature: Checkout

    Scenario Outline: Checkout a banana
        Given the price of a "banana" is 40c 
        When I checkout <count> "banana"
        Then the total price should be <total>c

        Examples:
        | count | total |
        | 1     | 40    |
        | 2     | 80    |

    Scenario: Two bananas scanned separately 
        Given the price of a "banana" is 40c 
        When I checkout 1 "banana"
        And I checkout 1 "banana"
        Then the total price should be 80c

    Scenario: A banana and an apple
        Given the price of a "banana" is 40c 
        And the price of a "apple" is 25c 
        When I checkout 1 "banana"
        And I checkout 1 "apple"
        Then the total price should be 65c