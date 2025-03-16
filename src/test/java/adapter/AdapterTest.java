package adapter;

import adapter.payment.PayPalPayment;
import adapter.payment.Payment;
import adapter.payment.StripePayment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

class AdapterTest {

    @Test
    void test() {

        var doubleBalance = 500d;
        AtomicReference<BigDecimal> balance = new AtomicReference<>(BigDecimal.valueOf(500));

        System.out.println("---------------------------------------");
        System.out.printf("Balance %s%n", balance.get());
        System.out.printf("Paypal payment process started...%n");

        Payment payPalAdapter = new PayPalAdapter(new PayPalPayment());
        balance = new AtomicReference<>(payPalAdapter.pay(balance.get(), BigDecimal.valueOf(100)));

        System.out.println("Paypal payment process ended...");
        System.out.printf("Balance : %s%n", balance.get());
        System.out.println("---------------------------------------");


        System.out.println("Stripe payment process started...");
        System.out.printf("Balance : %s%n", balance.get());

        Payment stripeAdapter = new StripeAdapter(new StripePayment());
        balance = new AtomicReference<>(stripeAdapter.pay(balance.get(), BigDecimal.valueOf(100)));

        System.out.println("Stripe payment process ended...");
        System.out.printf("Balance : %s%n", balance.get());
        System.out.println("---------------------------------------");

//        assertEquals(doubleBalance, balance.get().doubleValue());
        assertNotEquals(doubleBalance, balance.get().doubleValue());

    }

}
