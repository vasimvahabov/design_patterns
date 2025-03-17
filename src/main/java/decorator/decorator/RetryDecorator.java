package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;

/**
 * Concrete decorator : RetryDecorator
 */

@Log4j2
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RetryDecorator extends PaymentProcessorDecorator {

    int maxRetries;

    public RetryDecorator(PaymentProcessor paymentProcessor, int maxRetries) {
        super(paymentProcessor);
        this.maxRetries = maxRetries;
    }

    private static class PaymentFailedException extends RuntimeException {
        private PaymentFailedException(String message) {
            super(message);
        }
    }

    @Override
    public boolean process(PaymentRequest request) {
        int retries = 0;
        boolean result;

        while(retries < maxRetries) {
            result = super.process(request);
            if(result){
                return true;
            }
            retries++;
            log.error("Payment failed, retrying. attempt : {}", retries);
        }
        throw new PaymentFailedException("Payment failed. Please try again...");
    }

}
