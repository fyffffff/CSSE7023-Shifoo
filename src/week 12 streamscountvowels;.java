package streamscountvowels;

public class StreamVowelCounter {

    /**
     * Calculates the number of vowels in some given text.
     * Both upper case and lower case vowels count towards the total.
     *
     * @param text The text which to be searched.
     * @return The number of vowels in the given text.
     */
    public long numberVowels(String text) {
        // write your code here
        return text.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count();
    }
}
