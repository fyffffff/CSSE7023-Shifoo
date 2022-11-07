import java.util.ArrayList;
import java.util.List;

public class StringIndices {

    /** Searches for all occurances of the given character in a string.
     * Returns a list of integers corresponding to the index positions where
     * the character appears in the string.
     * The search is case sensitive (i.e. 'a' and 'A' are different).
     * @param text Text to be searched.
     * @param searchingFor A character to search for in the text.
     * @return List of numbers corresponding to index positions in the text.
     * */
    public static List<Integer> positionsInString(String text, char searchingFor) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == searchingFor) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(positionsInString("ApAle", 'A'));
    }
}