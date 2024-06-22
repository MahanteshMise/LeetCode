import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader111 {
    public static void main(String[] args){
        String path = "/Users/mahanteshmise/Desktop/FileFolder/data.rtf";
        FileReader read= null;
        BufferedReader bufferRead = null;
        try{
            read = new FileReader(path);
            bufferRead = new BufferedReader(read);
            String line = bufferRead.readLine();
            while(line!=null) {
                System.out.println(line);
                line = bufferRead.readLine();
            }
        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
