Feature: Robot

    Scenario: Tickle a happy robot
        Given I am in a good mood
        When you tackle me
        Then I will gigle
    
    Scenario: Attack a happy robot
        Given I am in a good mood
        When you kick me
        Then I will cry
    
    Scenario: Robot moves
        Given a board like this:
            | |1|2|3| 
            |1| | | | 
            |2| | | | 
            |3| | | |
        When robot current position set to 1,1
        Then the board should look like this:
            | |1|2|3| 
            |1|x| | | 
            |2| | | | 
            |3| | | |
    
    
    
    