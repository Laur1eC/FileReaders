import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class LowerCase {
    public static void main(String[] args) throws IOException{
        File tedsFile = new File("fixedFile.txt");
        FileReader reader = new FileReader(tedsFile);

        String story = "";
        char[] words = new char[(int)tedsFile.length()];
        reader.read(words);
        String s = new String(words);
        String[] wordArray = s.split(" ");
        for(String element: wordArray){
            story += element + " ";
        }
        System.out.println(story.toLowerCase());
        reader.close();
    }
}