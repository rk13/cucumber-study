package atm.core;

import java.math.BigDecimal;

/**
 * @author Vladimir Kotov
 */
public class Teller {
    public void withdrawFrom(Account account, BigDecimal amount) {
        account.debit(amount);
    }
}
