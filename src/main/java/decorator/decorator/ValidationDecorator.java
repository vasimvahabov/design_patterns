package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete decorator : ValidationDecorator
 */

@Log4j2
public class ValidationDecorator extends PaymentProcessorDecorator {

    public ValidationDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public boolean process(PaymentRequest request) {
        log.info("Payment data is being validated ...");
        if (!request.isValid()) {
            log.error("Payment data invalid.");
            return false;
        }
        return super.process(request);
    }

}
