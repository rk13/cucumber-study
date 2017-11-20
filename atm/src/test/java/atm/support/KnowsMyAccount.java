package atm.support;

import atm.core.Account;
import atm.core.CashSlot;

public class KnowsMyAccount {

    private Account account;
    private CashSlot cashSlot;

    public Account getAccount() {
        if (account == null) {
            account = new Account();
        }
        return account;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public void setCashSlot(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
}
