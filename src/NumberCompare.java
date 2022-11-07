public class NumberCompare {
    /**
     * Takes two numbers and a comparison, returns the result of applying the
     * comparison to the two numbers.
     * If comparator is '<', then the smallest number is returned.
     * If comparator is '>', then the largest number is returned.
     * If comparator is '=', then the first number is returned.
     * Otherwise, -1 is returned.
     *
     * @param firstNumber First number of operation.
     * @param secondNumber Second number of operation.
     * @param comparison Specifies what type of comparison is required.
     * @return The result of when the 'comparison' is used to compare the two
     * numbers.
     */
    public int numberCompare(int firstNumber, int secondNumber,
                             char comparison) {
        // write your code here
        if (comparison == '<') {
            return Math.min(firstNumber, secondNumber);
        } else if (comparison == '>') {
            return Math.max(firstNumber, secondNumber);
        } else if (comparison == '=') {
            return firstNumber;
        }
        else {
            return -1;
        }
    }
}
