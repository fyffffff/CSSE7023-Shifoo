public class WriteToConsole {
    /**
     * Prints the phrase "Hello, user!" to the system out console.
     */
    public void printHelloUser() {
        // write your code here
        System.out.println("Hello, user!");
    }

    /**
     * Prints the phrase "Hello, user!" to the system out console (i.e. the first line),
     * followed by "Greetings!" on a new line (i.e. the second line).
     */
    public void printHelloUserNewline() {
        // write your code here
        System.out.println("Hello, user!\nGreetings!");
    }

    /**
     * Prints the phrase "Hello, user!" to the system out console (i.e. the first line),
     * followed by two blank lines,
     * followed by "Greetings!" on the fourth line.
     */
    public void printHelloUserBlankLines() {
        // write your code here
        System.out.println("Hello, user!\n\n\nGreetings!");
    }

    public static void main(String[] args) {
        WriteToConsole writeToConsole = new WriteToConsole();
        writeToConsole.printHelloUserBlankLines();
    }
}
