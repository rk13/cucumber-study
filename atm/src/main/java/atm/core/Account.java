package atm.core;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;

    public Account() {
        this.balance = BigDecimal.ZERO;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    public void debit(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }
}
