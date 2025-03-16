package adapter.payment;

import java.math.BigDecimal;

public class PayPalPayment implements Payment {

    @Override
    public BigDecimal pay(BigDecimal balance, BigDecimal amount) {
        return balance.subtract(amount);
    }

}
