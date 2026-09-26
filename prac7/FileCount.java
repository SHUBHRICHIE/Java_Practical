import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCount{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the path to the text file: ");
        String filePath = keyboard.nextLine();
        
        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;

        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;
                
                characterCount += line.length();
                
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            
            reader.close();
            
            System.out.println("\n--- File Statistics ---");
            System.out.println("Lines      : " + lineCount);
            System.out.println("Words      : " + wordCount);
            System.out.println("Characters : " + characterCount);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be found. Please check the path.");
        } finally {
            keyboard.close();
        }
    }
}