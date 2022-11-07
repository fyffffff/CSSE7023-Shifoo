import java.util.List;

public class CatchExceptions {
    static List<String> strings;

    /**
     * Validates the given string and adds it to the end of list of strings
     * timesToAdd times.
     *
     * For example, calling validateAndAdd("abc", 3) should add the string "abc"
     * to the list of strings three times.
     *
     * @param newString string to be added
     * @param timesToAdd number of times to add
     * @throws IllegalArgumentException if timesToAdd is less than zero; or if
     * newString is the empty string
     * @throws NullPointerException if newString is null
     * @throws IllegalStateException if the list of strings has not yet been
     * initialised (i.e. it is null)
     */
    public static void validateAndAdd(String newString, int timesToAdd) {
        // write your code here
        if (timesToAdd < 0) {
            throw new IllegalArgumentException();
        }
        if (newString.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (strings == null) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < timesToAdd; i ++) {
            strings.add(newString);
        }
    }

    /**
     * Calls validateAndAdd with the given parameters.
     *
     * If the call to validateAndAdd throws an IllegalStateException, it should
     * be caught and the message "IllegalStateException" should be printed to
     * System.out.
     *
     * @param newString string to be added
     * @param timesToAdd number of times to add
     */
    public static void add1(String newString, int timesToAdd) {
        // write your code here
        try {
            validateAndAdd(newString, timesToAdd);
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException");
        }

    }

    /**
     * Calls validateAndAdd with the given parameters.
     *
     * If the call to validateAndAdd throws an IllegalStateException or a
     * NullPointerException, it should be caught and an IllegalArgumentException
     * should be thrown instead.
     *
     * @param newString string to be added
     * @param timesToAdd number of times to add
     */
    public static void add2(String newString, int timesToAdd) {
        // write your code here
        try {
            validateAndAdd(newString, timesToAdd);
        } catch (IllegalStateException | NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Calls validateAndAdd with the given parameters.
     *
     * If the call to validateAndAdd throws an IllegalArgumentException, it
     * should be "squashed" (ignored).
     * If the call to validateAndAdd throws an IllegalStateException or a
     * NullPointerException, it should be caught and the message "Whoops" should
     * be printed to System.out.
     *
     * @param newString string to be added
     * @param timesToAdd number of times to add
     */
    public static void add3(String newString, int timesToAdd) {
        // write your code here
        try {
            validateAndAdd(newString, timesToAdd);
        } catch (IllegalArgumentException ignore) {
        } catch (IllegalStateException | NullPointerException e) {
            System.out.println("Whoops");
        }
    }

    public static void main(String[] args) {
        add2("aa", 2);
    }
}
