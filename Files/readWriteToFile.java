import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile111 {
    public static void main(String[] args){
        //Specifying the directory where the read and to be written file exists
        String path1 = "/Users/mahanteshmise/Desktop/FileFolder/data.rtf";
        String path2 = "/Users/mahanteshmise/Desktop/FileFolder/data2.rtf";
        FileReader reader = null;
        FileWriter writer = null;
        // Creating an object of file reader and writer
        try{
            reader = new FileReader(path1);
            writer = new FileWriter(path2);
            // Read the character from the reader file and writer to writer file
            int c = reader.read();
            while (c!= -1){
                writer.write(c);
                c = reader.read();
            }
            writer.flush();
        }catch (FileNotFoundException e1){
            e1.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }
    }
}
