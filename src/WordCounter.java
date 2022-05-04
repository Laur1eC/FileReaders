import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("fixedFile.txt"));

        int wordCount = 0;
        String lines;
        while((lines = reader.readLine()) != null) {
            String[] words = lines.split(" ");
            wordCount += words.length;
        }
        System.out.println('\n' + "There are " + wordCount + " words in this file.");
        reader.close();
    }
}