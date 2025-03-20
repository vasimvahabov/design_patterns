package adapter;

public class LegacyCustomerNotFoundException extends RuntimeException {

    public LegacyCustomerNotFoundException(String message) {
        super(message);
    }

}
