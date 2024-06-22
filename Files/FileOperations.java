import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileOperations111 {
    public static void main(String[] args) {
        String pathName = "/Users/mahanteshmise/Desktop/FileFolder/testFile.docx";
        /*FileReader readFile = null;
        try {
            readFile = new FileReader(pathName);
            // Explicitly type casting to read the char from the file.
            System.out.println((char)readFile.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //To read a String from the file.
        FileReader stringReader = null;
        char[] arr1 = new char[50];
        try {
            stringReader = new FileReader(pathName);
            System.out.println(stringReader.read(arr1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        // Trying a different way to read file on mac system
        File macFile = new File(pathName);
        Scanner in = null;
        try {
            in = new Scanner(macFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String arr2 = in.next();
        System.out.println(arr2);
        in.close();
    }
}
