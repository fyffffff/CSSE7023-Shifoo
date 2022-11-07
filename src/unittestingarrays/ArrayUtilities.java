package unittestingarrays;

// IMPORTANT: do not change the below ArrayUtilities class
public class ArrayUtilities {
    /**
     * Returns the value in the middle of the given array of non-negative
     * values.
     *
     * If the array of values has an even length, the value closer to the
     * end of the array of the two middle values is returned.
     * If the array is null or empty, -1 is returned.
     *
     * @param values non-negative values to find middle value in
     * @return value in the middle of the given array; -1 if null or empty
     */
    public int findMiddle(int[] values) {
        if (values == null || values.length == 0) {
            return -1;
        }
        int middleIndex = values.length / 2;
        return values[middleIndex];
    }

    /**
     * Returns the sum of the elements of the given array, summing either only
     * even values or only odd values.
     *
     * @param values values to sum
     * @param even if true, sum even values, otherwise, sum odd values
     * @return sum of even or odd values in the array
     */
    public int sum(int[] values, boolean even) {
        int sum = 0;
        for (int value : values) {
            if (even) {
                // summing only even values
                if (value % 2 == 0) {
                    // this value is even, add it to the sum
                    sum += value;
                }
            } else {
                // summing only odd values
                if (value % 2 == 1) {
                    // this value is odd, add it to the sum
                    sum += value;
                }
            }
        }
        return sum;
    }
}
// ^^^ IMPORTANT: do not change the above ArrayUtilities class