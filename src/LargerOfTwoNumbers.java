public class LargerOfTwoNumbers {
    /**
     * Finds the biggest of two numbers and returns the biggest number.
     * If the numbers are equal, return the first operand.
     *
     * @param firstNumber First value of operation.
     * @param secondNumber Second value of operation.
     * @return The bigger of the two operands.
     */
    public int largerOfTwoNumbers(int firstNumber, int secondNumber) {
        // write your code here
        if (firstNumber>secondNumber) {
            return firstNumber;
        } else if (secondNumber>firstNumber) {
            return secondNumber;
        }
        else {
            return firstNumber;
        }
    }

    public static void main(String[] args) {
        LargerOfTwoNumbers largerOfTwoNumbers = new LargerOfTwoNumbers();
        System.out.println(largerOfTwoNumbers.largerOfTwoNumbers(1,3));
    }
}
