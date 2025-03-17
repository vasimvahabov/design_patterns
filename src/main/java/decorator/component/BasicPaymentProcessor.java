package decorator.component;

import decorator.PaymentRequest;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete Component : BasicPaymentProcessor
 */

@Log4j2
public class BasicPaymentProcessor implements PaymentProcessor {

    @Override
    public boolean process(PaymentRequest paymentData) {
        log.info("Payment is processing ...");
        return true;
    }

}
