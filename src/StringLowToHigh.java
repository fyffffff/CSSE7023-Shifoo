public class StringLowToHigh {

    /** You need to make use of this variable */
    private StringBuilder builder;

    public StringBuilder getBuilder() { return this.builder; }

    /**
     * Creates a string reporting the numbers between low and high (inclusive),
     * using the StringBuilder variable above.
     * Format must be: "numbers: low,low + 1,..., high - 1, high".
     * For example if low is 13 and high is 17, then "numbers: 13,14,15,16,17"
     * must be returned. If low is -1 and high is 1, then "numbers: -1,0,1"
     * must be returned.
     */
    public String makeString(int low, int high) {
        this.builder  =
                new StringBuilder(("numbers: %d").formatted(low));
        for (int i = low + 1; i < high + 1; i++) {
            this.builder.append(",");
            this.builder.append(i);
        }
        return this.builder.toString();
    }

    /**
     * Takes a string builder object, converts the first character of each word
     * to a capital letter, then returns the result as a string.
     * For example, if the given string builder object holds
     * "this is a very interesting sentence",
     * then "This Is A Very Interesting Sentence" must be returned.
     * @param builder string builder containing a sequence of characters.
     *                Must contain not be empty. Must not contain symbols or
     *                numbers (except spaces).
     * @return string with each word capitalised
     */
    public String capitaliseEachWord(StringBuilder builder) {
        this.builder = new StringBuilder();
        String[] splitStrings = builder.toString().split(" ");
        for (String word: splitStrings) {
            if (word.isBlank()) {
                this.builder.append(" ");
            } else {
                this.builder.append(word.substring(0, 1).toUpperCase());
                this.builder.append(word.substring(1));
                this.builder.append(" ");
            }
        }
        return this.builder
                .substring(0, this.builder.toString().length() - 1);
    }

    public static void main(String[] args) {
        StringLowToHigh stringLowToHigh = new StringLowToHigh();
        StringBuilder stringBuilder = new StringBuilder(" hello world");
        System.out.println(stringLowToHigh.capitaliseEachWord(stringBuilder));
    }
}
