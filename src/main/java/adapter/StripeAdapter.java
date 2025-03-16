package adapter;

import adapter.payment.Payment;
import adapter.payment.StripePayment;
import java.math.BigDecimal;

public class StripeAdapter implements Payment {

    private final StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public BigDecimal pay(BigDecimal balance, BigDecimal amount) {
        return stripePayment.pay(balance, amount);
    }

}
