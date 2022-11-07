public class FilterFirstLast {
    /** Searches text for the first and last instances of a given character.
     * Returns the text with the first and last instances of character removed.
     * If the character does not appear in the text, the whole text must be returned intact.
     * If the character only appears in the text once, then then the text must
     * be returned with the first instance of character removed.
     * e.g. "revere" and 'e' would return "rver"
     * @param text Text to be searched.
     * @param searchingFor A character to search for in the text.
     * @return Text with first and last instances of character removed.
     * */

    public static String filterFirstLast(String text, char searchingFor) {
        String newString;
        int index = text.indexOf(searchingFor);
        if (index != -1) {
            newString = text.substring(0, index)
                    + text.substring(index+1);
            int indexNew = newString.lastIndexOf(searchingFor);
            if (indexNew != -1) {
                newString = newString.substring(0, indexNew) +
                        newString.substring(indexNew+1);
            }
        }
        else newString = text;
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(filterFirstLast("revere", 'e'));
    }
}
