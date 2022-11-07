public class Casting {
    /**
     * Converts a double value into an int value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static int castDoubleToInt(double number) {
        return (int) number;
    }

    /**
     * Converts a double value into a String value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static String castDoubleToString(double number) {
        return number+"";
    }

    /**
     * Converts a String value into an int value.
     * @param number A number to be converted. Will only be a whole number,
     *               and will not have decimal places.
     * @return The converted value.
     */
    public static int castStringToInt(String number) {
        return Integer.parseInt(number);
    }

    /**
     * Converts a String value into a double value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static double castStringToDouble(String number) {
        return Double.parseDouble(number);
    }
}
