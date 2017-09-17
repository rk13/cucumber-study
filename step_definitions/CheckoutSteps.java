package step_definitions; 

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import static org.junit.Assert.*;

public class CheckoutSteps {
    
    int bananaPrice;
    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
    }

    Checkout checkout;
    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String name) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}