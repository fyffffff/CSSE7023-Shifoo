package exceptioncustom;

public class NumberTooSmallException extends Exception {
    public NumberTooSmallException() {
    }

    public NumberTooSmallException(String message) {
        super(message);
    }
}
