package atm;

import atm.core.Teller;
import atm.support.KnowsMyAccount;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

public class TellerSteps {
    private KnowsMyAccount helper;

    public TellerSteps(Stepdefs stepdefs, KnowsMyAccount helper) {
        this.helper = helper;
    }

    @When("^I withdraw \\$(\\d+\\.\\d+)$")
    public void requestMoneyWithdrawal(BigDecimal amount) {
        Teller teller = new Teller();
        teller.withdrawFrom(helper.getAccount(), amount);
        helper.getCashSlot().dispense(amount);
    }
}