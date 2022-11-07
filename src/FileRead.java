

import java.io.*;

public class FileRead {

    /**
     * Reads the content of a given file (accessed by the provided reader),
     * sums all the tokens (separated by spaces) in the file, then returns the sum.
     * If the file is empty, return 0.
     * If the reader is null, return 0.
     * If there are non-numbers tokens in the file (e.g. file5.txt), these
     * specific tokens need to be ignored when calculating the sum.
     * @param reader file reader object which has already been initialised to
     *               read from a target .txt file.
     * @return the sum of all the numbers in the file
     */
    public static double sumTotalInFile(Reader reader) {
        if (reader == null) {
            return 0;
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        double sum = 0.0;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] fileString = line.split(" ");
                for (String t: fileString) {
                    try {
                        double i = Double.parseDouble(t);
                        sum += i;
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
            return sum;
        } catch (IOException ioException) {
            System.out.println("IOException occurred");
        }
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Reader reader = new FileReader("data/file2.txt");
            System.out.println(sumTotalInFile(reader));
        } catch (IOException ioe) {
            System.err.println("Could not open file");
        }

    }
}
