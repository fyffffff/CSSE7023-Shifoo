public class VowelCounter {
    /**
     * Calculates the number of vowels in some given text.
     * Both upper case and lower case vowels count towards the total.
     *
     * @param text The text which to be searched.
     * @return The number of vowels in the given text.
     */

    public int numberVowels(String text) {
        // write your code here
        int count = 0;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char testChar = text.charAt(i);
            if (Character.isUpperCase(testChar)) {
                testChar = Character.toLowerCase(testChar);
            }
            if (testChar == 'a' || testChar == 'e'
                    || testChar == 'i' || testChar == 'o' ||
                    testChar == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        VowelCounter vowelCounter = new VowelCounter();
        System.out.println(vowelCounter.numberVowels("Apples"));
    }
}
