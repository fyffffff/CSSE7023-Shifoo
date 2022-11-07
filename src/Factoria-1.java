package recursionfactorial;

public class Factorial {

    /**
     * Calculates the factorial for a given input number.
     *
     * @param number The number to calculate the factorial for.
     * @return Factorial of the input number.
     */
    public static long factorialIterative(int number) {
        long factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calculates the factorial for a given input number.
     *
     * @param number The number to calculate the factorial for.
     * @return Factorial of the input number.
     */
    public static long factorialRecursive(int number) {
    // write your code here
    if(number > 1)
        {
            return(number * factorialRecursive(number - 1));  // Method calling itself
        }
        return 1;
}
}
