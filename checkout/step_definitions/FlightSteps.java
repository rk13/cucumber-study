package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.*;
import static org.junit.Assert.*;
import java.util.*;
import static org.junit.Assert.*;

public class FlightSteps {

    private Set<String> flights = new HashSet<>();

    @Given("^Given the flight (\\w\\d+) is leaving today$")
    public void givenTheFlightCIsLeavingToday(String flight) throws Throwable {
        flights.add(flight);    
    }
    
    @Then("^everything is OK$")
    public void everythingIsOK() throws Throwable {
        assertTrue(true);
    }

    @When("^I transfer \\$(\\d+) from my (\\w+\\s\\w+) into my (\\w+\\s\\w+)\\.$")
    public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int sum, String fromAccount, String toAccount) throws Throwable {
        System.out.println("Transfer " + sum + " from " + fromAccount + " to " + toAccount);
    }
}