import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListAverage {
    /**
     * Returns the average of a list of numbers. If the list is empty,
     * NaN is returned.
     * @param numbers A list of numbers. Cannot be empty.
     * @return the average of the list of numbers
     */
    public static double findAverageDouble(ArrayList<Double> numbers) {
        Iterator<Double> listIterator = numbers.iterator();
        double sum = 0;
        double average = Double.NaN;
        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }
        if (numbers.size() != 0) {
            average = sum / numbers.size();
        }
        return average;
    }
}