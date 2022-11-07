import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListPrintStrings {
    /**
     * Prints the given list of strings to System.out, skipping every second
     * string. Then, prints the list of strings in reverse order, skipping
     * every second string. All output should be printed on the same line.
     *
     * For example, if the list of strings is ["a", "b", "c", "d"], the output
     * should be "acdb". If the list of strings is ["a", "b", "c"], the output
     * should be "acca".
     *
     * @param strings strings to print
     */
    public static void printStrings(List<String> strings) {
        // write your code here
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        StringBuilder newString = new StringBuilder();
        ListIterator<String> listIterator = strings.listIterator();
        int countA = 1;
        int countB = 1;
        while (listIterator.hasNext()) {
            listA.add((String) listIterator.next());
        }
        for (String s: listA) {
            countA += 1;
            if (countA % 2 == 0) {
                newString.append(s);
            }
        }
        while (listIterator.hasPrevious()) {
            listB.add((String) listIterator.previous());
        }
        for (String s:listB) {
            countB += 1;
            if (countB % 2 == 0) {
                newString.append(s);
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        ArrayList<String> tmpList = new ArrayList<>();
        tmpList.add("a");
        tmpList.add("b");
        tmpList.add("c");
        tmpList.add("d");
        printStrings(tmpList);
    }
}
