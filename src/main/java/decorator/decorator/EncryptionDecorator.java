package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete decorator : EncryptionDecorator
 */

@Log4j2
public class EncryptionDecorator extends PaymentProcessorDecorator{

    public EncryptionDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public boolean process(PaymentRequest request) {
        log.info("Payment data is being encrypted ...");
        return super.process(request);
    }
}
