package decorator;

import decorator.component.BasicPaymentProcessor;
import decorator.component.PaymentProcessor;
import decorator.decorator.*;
import lombok.extern.log4j.Log4j2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@Log4j2
class DecoratorTest {

    @Test
    void test () {

//        var request = new PaymentRequest("ORDER-123", 500, 1000);
//
//        var processor = new BasicPaymentProcessor();
//        processor.process(request);
//
//        var decoratedProcessor = new LoggingDecorator(
//                new EncryptionDecorator(
//                        new AuthorizationDecorator(
//                            new ValidationDecorator(
//                                    new RetryDecorator(processor, 3)
//                            )
//                        )
//                )
//        );
//
//        var result = decoratedProcessor.process(request);
//        log.info("Payment result : {}", result ? "SUCCESS" : "FAILURE");

        var request = new PaymentRequest("ORDER-123", 500, 1000);

        PaymentProcessor processor = new BasicPaymentProcessor();
        processor = new RetryDecorator(processor, 3);
        processor = new ValidationDecorator(processor);
        processor = new AuthorizationDecorator(processor);
        processor = new EncryptionDecorator(processor);
        processor = new LoggingDecorator(processor);

        var result = processor.process(request);
        assertTrue(result);
        log.info("Payment result : {}", "SUCCESS");

    }

}
