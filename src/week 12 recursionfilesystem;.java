package recursionfilesystem;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a single file or a single directory (containing other files).
 */
public class File {
    String name; // name of the file
    List<File> contents; // list of sub-files

    public File(String name) {
        this.name = name;
        this.contents = new LinkedList<>();
    }

    void addFile(File file) {
        this.contents.add(file);
    }

    /* See Javadoc for prettyPrint(int) */
    public String prettyPrint() {
        return prettyPrint(0);
    }

    /**
     * Returns a multi-line string representing this file and, recursively,
     * all of its sub-files.
     *
     * The indentation level should increase for every sub-file, as shown below.
     * Each level of indentation should be represented by two spaces "  ".
     * The last character of the final string should always be a line separator
     * (\n).
     *
     * root
     *   dir1
     *   dir2
     *     subdir
     *       Hello.java
     *   dir3
     *     myfile.txt
     *     another.png
     *
     * @param indentationLevel level of indentation to use before printing the
     *                         file's name
     * @return formatted multi-line string representation of this file
     */
    private String prettyPrint(int indentationLevel) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< indentationLevel; i++) {
            sb.append("  ");
        }
        sb.append(this.name);
        sb.append("\n");
        for (File content: contents) {
            sb.append(content.prettyPrint(indentationLevel + 1));
        }
        
        return  sb.toString();
    }
}
