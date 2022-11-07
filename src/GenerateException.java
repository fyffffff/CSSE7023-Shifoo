public class GenerateException {

    /** Throws a specific type of exception based on the given parameter.
     * If the parameter is "arithmetic" then an ArithmeticException must be
     * thrown, if the parameter is "index" then an IndexOutOfBoundsException
     * must be thrown, if the parameter is "null" then a NullPointerException
     * must be thrown. Otherwise, nothing should happen.
     * @param exceptionType the type of exception that needs to be thrown
     */
    public static void generateException(String exceptionType) {
        if (exceptionType.equals("arithmetic")) {
            throw new ArithmeticException();
        }
        if (exceptionType.equals("index")) {
            throw new IndexOutOfBoundsException();
        }
        if (exceptionType.equals("null")) {
            throw new NullPointerException();
        }
    }
}