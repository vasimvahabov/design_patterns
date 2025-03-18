package strategy;

/**
 * Exception will be thrown on strategy if is null in context
 */

public class CompressionStrategyNotFoundException extends RuntimeException {

    public CompressionStrategyNotFoundException(String message) {
        super(message);
    }

}
