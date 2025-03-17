package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete decorator : PaymentProcessorDecorator
 */

@Log4j2
public class AuthorizationDecorator extends PaymentProcessorDecorator {

    public AuthorizationDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public boolean process(PaymentRequest request) {
        log.info("Payment data is being authorized...");
        if (request.availableCredit() < request.amount()) {
            log.error("Insufficient funds.");
            return false;
        }
        return super.process(request);
    }
}
