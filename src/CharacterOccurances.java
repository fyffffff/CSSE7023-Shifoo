import java.util.List;

public class CharacterOccurances {
    /**
     * Evaluate how many characters from the first text appear in the second text.
     * Assume the first operand will never contain the same character more than
     * once. e.g. "afax" is not allowed.
     * If a character from the first operand appears in the second operand
     * multiple times, only the first occurance adds to the count.
     * The result is case sensitive, so 'a' and 'A' are not considered the same
     * character in the first operand.
     * If the <b>first</b> operand includes <b>any</b> characters which are not a letter
     * (e.g.'$', '/', '2'), then -1 must be returned.
     *
     * @param text1 The list of characters to search for. e.g. "abftx"
     * @param text2 The text to be searched. e.g. "java is fun"
     * @return How many of the letters appear in the second text.
     */
    public static int charOccurancesInText(String text1, String text2) {
        char[] charArr = new char[text1.length()];
        int count = 0;
        int letterCount = 0;
        for (int i = 0; i < text1.length(); i++){
            charArr[i] = text1.charAt(i);
        }
        for (char s: charArr) {
            if (Character.isLetter(s)) {
                letterCount++;
            }
        }
        if (letterCount != charArr.length) {
            count = -1;
        }
        if (count != -1) {
            for (char s: charArr) {
                int index = text2.indexOf(s);
                if (index != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(charOccurancesInText("abftx", "java is fun"));
    }
}
