package adapter.adaptee;

import adapter.payment.PayPalPayment;
import adapter.payment.Payment;
import java.math.BigDecimal;

public class PayPalAdapter implements Payment {

    private final PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public BigDecimal pay(BigDecimal balance, BigDecimal amount) {
        return payPalPayment.pay(balance, amount);
    }

}
