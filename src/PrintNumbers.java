public class PrintNumbers {
    /**
     * Prints integer numbers to the console all on one line, starting at one,
     * and ending at the given limit (inclusive).
     * Each number is separated by a single space. The last number is
     * followed by single space.
     * For example, if limit is 5, then "1 2 3 4 5 " (no quotes) must be
     * printed to the console.
     * @param limit the maximum number to print
     */
    public void printNumbersOneToLimit(int limit) {
        // write your code here
        String outString = "";
        for (int i = 1; i <= limit; i++) {
            String tempStr = Integer.toString(i);
            outString += tempStr;
            outString += " ";
        }
        System.out.print(outString);
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.printNumbersOneToLimit(5);
    }
}
