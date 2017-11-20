package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.*;
import implementation.*;
import static org.junit.Assert.*;
import java.util.*;

public class RobotSteps {
    private Robot robot = new Robot();
    private Robot.Action lastAction;
    private List<List<String>> board;

    @Given("^I am in a good mood$")
    public void iAmInAGoodMood() throws Throwable {
        robot.setMood(Robot.Mood.GOOD);
    }

    @When("^you tackle me$")
    public void youTackleMe() throws Throwable {
        lastAction = robot.tackle();
    }

    @Then("^I will gigle$")
    public void iWillGigle() throws Throwable {
        assertEquals(lastAction, Robot.Action.GIGLE);
    }

    @When("^you kick me$")
    public void youKickMe() throws Throwable {
        lastAction = robot.kick();
    }

    @Then("^I will cry$")
    public void iWillCry() throws Throwable {
        assertEquals(lastAction, Robot.Action.CRY);        
    }

    @Given("^a board like this:$")
    public void aBoardLikeThis(DataTable table) throws Throwable {
        board = new ArrayList<List<String>>();
        for(List<String> row : table.raw()) {
            board.add(new ArrayList<String>(row));
        }
    }
    
    @When("^robot current position set to (\\d+),(\\d+)$")
    public void robotCurrentPositionSetTo(int x, int y) throws Throwable {
        board.get(x).set(y, "x");    
    }
    
    @Then("^the board should look like this:$")
    public void theBoardShouldLookLikeThis(DataTable expectedTable) throws Throwable{
        expectedTable.diff(board);
    }
}