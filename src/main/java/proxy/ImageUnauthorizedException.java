package proxy;

/**
 * an exception thrown on appropriate role
 * */

public class ImageUnauthorizedException extends Exception {

    public ImageUnauthorizedException(String message) {
        super(message);
    }

}
