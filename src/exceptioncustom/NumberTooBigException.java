package exceptioncustom;

public class NumberTooBigException extends Exception{
    public NumberTooBigException() {
    }

    public NumberTooBigException(String message) {
        super(message);
    }
}
