package atm;

import atm.support.KnowsMyAccount;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.math.BigDecimal;

public class Stepdefs {

    private KnowsMyAccount helper;

    public Stepdefs(KnowsMyAccount helper) {
        this.helper = helper;
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account")
    public void i_have_deposited_my_account(BigDecimal amount) throws Throwable {
        helper.getAccount().deposit(amount);
        Assert.assertEquals(amount, helper.getAccount().getBalance());
    }

    @Then("^\\$(\\d+.\\d+) should be dispensed$")
    public void $ShouldBeDispensed(BigDecimal amount) throws Throwable {
        Assert.assertEquals(amount, helper.getCashSlot().contents());
    }

    @And("^the balance of my account should be \\$(\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(BigDecimal amount) throws Throwable {
        Assert.assertEquals(amount, helper.getAccount().getBalance());
    }
}
