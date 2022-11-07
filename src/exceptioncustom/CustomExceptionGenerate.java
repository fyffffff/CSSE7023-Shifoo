package exceptioncustom;

public class CustomExceptionGenerate {

    /**
     * Generates a custom exception based on the given number.
     * If number is less than 30, a NumberTooSmallException must be thrown with
     * the message "The number was too small";
     * If the number is exactly 30, a NumberTooSmallException must be thrown with
     * no message.
     * If number is more than 50, a NumberTooBigException must be thrown with
     * the message "The number was too big";
     * If the number is exactly 50, a NumberTooBigException must be thrown with
     * no message.
     * If the number is more than 30, and less than 50, nothing happens.
     * @param number the number value to be checked
     */
    public static void generateCustomException(int number) throws
            NumberTooBigException, NumberTooSmallException {
        if (number == 30) {
            throw new NumberTooSmallException();
        }
        if (number < 30) {
            throw new NumberTooSmallException("The number was too small");
        }
        if (number == 50) {
            throw new NumberTooBigException();
        }
        if (number > 50) {
            throw new NumberTooBigException("The number was too big");
        }
    }

    public static void main(String[] args) throws NumberTooBigException, NumberTooSmallException {
        generateCustomException(30);
//        generateCustomException(52);
    }
}