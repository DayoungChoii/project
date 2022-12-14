package marketit.backend.project.order.exception;

public class WrongPriceException extends RuntimeException{
    public WrongPriceException() {
    }

    public WrongPriceException(String message) {
        super(message);
    }

    public WrongPriceException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPriceException(Throwable cause) {
        super(cause);
    }

    public WrongPriceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
