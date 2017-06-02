package di.vending.coffee.exception;

/**
 * Created by nischal.k on 02/06/17.
 */
public class IngredientInAvailableException extends RuntimeException{
    public IngredientInAvailableException() {
    }

    public IngredientInAvailableException(String message) {
        super(message);
    }

    public IngredientInAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public IngredientInAvailableException(Throwable cause) {
        super(cause);
    }

    public IngredientInAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
