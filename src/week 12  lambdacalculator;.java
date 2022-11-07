package lambdacalculator;

import java.util.function.BiFunction;

public class LambdaCalculator {

    /**
     * Returns a function that takes two doubles as input and returns the
     * result of performing the given operation "op".
     *
     * @param op operation for the returned function to perform
     * @return a calculator function to perform the given operation
     */
    public static BiFunction<Double, Double, Double> calculator(Operation op) {
        // implement your code here
        switch (op) {
            case ADD: 
                return (Double a, Double b) -> a + b;
            case SUBTRACT:
                return (Double a, Double b) -> a - b;
            case MULTIPLY:
                return (Double a, Double b) -> a * b;
            case DIVIDE: 
                return (Double a, Double b) -> a / b;
            case MODULUS:
                return (Double a, Double b) -> a % b;
            default:
                return (Double a, Double b) -> Math.pow(a, b);
        }
    }
}