public class SimpleCalculator {
    /**
     * Calculates the result of applying 'operator' to 'operand1' and 'operand2'.
     * @param operand1 First value of operation.
     * @param operand2 Second value of operation.
     * @param operator The operator to apply in this operation.
     * @return The result of calculating the 'operator' applied to the two operands.
     */
    public static double calculate(double operand1, double operand2,
                                   char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            case '%':
                result = operand1 % operand2;
                break;
            case '^':
                result = Math.pow(operand1, operand2);
                break;
        }
        return result;
    }
}
