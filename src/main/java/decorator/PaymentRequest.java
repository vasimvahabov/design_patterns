package decorator;

/**
 * the record contains payment details
 */

public record PaymentRequest (
        String orderId,
        double amount,
        double availableCredit
) {

    public boolean isValid() {
        return amount > 0;
    }

}
