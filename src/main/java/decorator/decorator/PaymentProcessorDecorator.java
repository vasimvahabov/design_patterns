package decorator.decorator;

import decorator.PaymentRequest;
import decorator.component.PaymentProcessor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Decorator abstract class : PaymentProcessorDecorator
 */

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public abstract class PaymentProcessorDecorator implements PaymentProcessor {

    PaymentProcessor paymentProcessor;

    @Override
    public boolean process(PaymentRequest request) {
        return paymentProcessor.process(request);
    }
}
