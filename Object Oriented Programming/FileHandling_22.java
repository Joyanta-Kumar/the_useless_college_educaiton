import java.io.*;

public class FileHandling_22 {
    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            // 1. Write to a file
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is the first line.\n");
            writer.write("File handling in Java is easy!\n");
            writer.close();
            System.out.println("Successfully written to the file.");

            // 2. Append to the file
            FileWriter appendWriter = new FileWriter(filename, true);
            appendWriter.write("This line is appended.\n");
            appendWriter.close();
            System.out.println("Successfully appended to the file.");

            // 3. Read from the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nContents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
