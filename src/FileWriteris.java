import java.io.FileWriter;

public class FileWriteris {
    public static void saugoti (Biblioteka bib) {

        try {
            // Creates a FileWriter
            FileWriter failoPavadinimas = new FileWriter("knygu_biblioteka.txt");

            // Writes the string to the file
            failoPavadinimas.write(bib.toString());

            // Closes the writer
            failoPavadinimas.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
