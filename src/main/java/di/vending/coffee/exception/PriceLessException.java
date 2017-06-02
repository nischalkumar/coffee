package di.vending.coffee.exception;

/**
 * Created by nischal.k on 02/06/17.
 */
public class PriceLessException extends RuntimeException{
    public PriceLessException() {
    }

    public PriceLessException(String message) {
        super(message);
    }

    public PriceLessException(String message, Throwable cause) {
        super(message, cause);
    }

    public PriceLessException(Throwable cause) {
        super(cause);
    }

    public PriceLessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
