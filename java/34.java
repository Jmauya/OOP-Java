import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Write initial text to the file
            FileWriter fw = new FileWriter("note.txt");
            fw.write("Start from the beginning");
            fw.close();

            // Open the file in append mode
            FileWriter fwAppendMode = new FileWriter("note.txt", true);
            fwAppendMode.write(" Add to the end");
            fwAppendMode.close();

            // Read the file and display its contents
            FileReader fr = new FileReader("note.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
