package decorator.component;

import decorator.PaymentRequest;

/**
 * Component interface : BasicPaymentProcessor
 */

public interface PaymentProcessor {

    boolean process(PaymentRequest request);

}
