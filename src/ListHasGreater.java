import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHasGreater {
    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreater(List<Integer> numbers, int number) {
        // write your code here
        int greaterCount = 0;
        Iterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() > number) {
                greaterCount++;
            }
        }
        return greaterCount>0;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterFor(List<Integer> numbers, int number) {
        // write your code here
        int greaterCount = 0;
        int size = numbers.size();
        for (int i=0; i < size; i++) {
            if (numbers.get(i) > number) {
                greaterCount++;
            }
        }
        return greaterCount > 0;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterWhile(List<Integer> numbers, int number) {
        // write your code here
        int i = 0;
        int greaterCount = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) > number) {
                greaterCount++;
            }
            i++;
        }
        return greaterCount>0;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterForEach(List<Integer> numbers, int number) {
        // write your code here
        int greaterCount = 0;
        for (int i:numbers) {
            if (i > number) {
                greaterCount++;
            }
        }
        return greaterCount > 0;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterDoWhile(List<Integer> numbers, int number) {
        // write your code here
        int i = 0;
        boolean greaterBool = false;
        do {
            if (numbers.size() > 0) {
                if (numbers.get(i) > number) {
                    greaterBool = true;
                    break;
                }
            }
            i++;
        }
        while (i < numbers.size());
        return greaterBool;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(6);
        intList.add(8);
        System.out.println(hasGreaterDoWhile(intList, 2));
    }

}