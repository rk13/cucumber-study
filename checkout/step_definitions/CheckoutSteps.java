package step_definitions; 

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import static org.junit.Assert.*;
import java.util.*;

public class CheckoutSteps {
    Map<String, Integer> prices = new HashMap<>();
    Checkout checkout = new Checkout();
    
    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        prices.put(name, price);
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String name) throws Throwable {
        checkout.add(itemCount, prices.get(name));
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}