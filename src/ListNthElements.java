import java.util.ArrayList;
import java.util.List;

public class ListNthElements {

    private static List<String> ArrayList;
    private static Object String;

    /**
     * Takes a provided list of strings, then returns a new list containing
     * every nth (e.g. 2nd, 4th) element from the provided list.
     * For example, if the provided list has the following strings
     * "cat", "dog", "bear", "ant", "horse", "koala", "emu", "mouse" and
     * the value of n (i.e. the second parameter) is 3, a list containing
     * "bear", "koala" must be returned.
     * If the provided list is empty, an IllegalArgumentException must
     * be thrown.
     * If n is less than 1, an IllegalArgumentException must be thrown.
     * If n is more than the size of the provided list, an
     * IndexOutOfBoundsException must be thrown.
     * @param words the list of words to search
     * @param n frequency of elements in the provided list to return
     * @return new list containing every nth element from provided list
     */
    public static List<String> everyNthElement(List<String> words, int n) {
        List<String> result = new ArrayList<>();
        if (n < 1 | words.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (n > words.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = n; i < words.size() + 1; i+=n) {
            result.add(words.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test = null;
        everyNthElement(test, 1);
    }
}

