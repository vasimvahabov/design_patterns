package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete decorator : LoggingDecorator
 */

@Log4j2
public class LoggingDecorator extends PaymentProcessorDecorator {

    public LoggingDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public boolean process(PaymentRequest request) {
        log.info("Payment processing started : {} ", request.orderId());
        boolean result = super.process(request);
        log.info("Payment processing ended : {} ", request.orderId());
        return result;
    }

}
