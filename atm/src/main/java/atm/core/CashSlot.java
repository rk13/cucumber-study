package atm.core;

import java.math.BigDecimal;

public class CashSlot {

    private BigDecimal contents;

    public void dispense(BigDecimal contents) {
        this.contents = contents;
    }

    public BigDecimal contents() {
        return contents;
    }
}
