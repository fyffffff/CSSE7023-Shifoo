public class Delimiters {
    /**
     * Determines the number number of tokens which exist when the given
     * delimiter is applied to the given string.
     * @param toSplit the string to be split
     * @param delimiter the delimiter used to split the string
     * @return the number of tokens
     */
    public static int countTokens(String toSplit, String delimiter) {
        int count;
        String[] arrOfStr = toSplit.split(delimiter);
        count = arrOfStr.length;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTokens("some interesting text","t"));
    }
}
