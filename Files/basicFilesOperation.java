import java.io.File;
import java.io.IOException;

public class fileExists111 {
    public static void main(String[] args) {
        String path = "/Users/mahanteshmise/Desktop/untitled folder/data.rtf";
        String newFilePathName = "/Users/mahanteshmise/Desktop/untitled folder/dataNewFile.rtf";
        String listFilePath = "/Users/mahanteshmise/Desktop/untitled folder";
        String deleteFile = "/Users/mahanteshmise/Desktop/untitled folder/dataNewFile.rtf";
        // Creating a file object
        File file = new File(path);
        File newFile = new File(newFilePathName);
        File listFilePathRef = new File(listFilePath);
        File deleteFileRef = new File(deleteFile);
        // To Check if the file path exists
        System.out.println(file.exists());
        // To check if the file can read
        System.out.println(file.canRead());
        //To check if the file can be Written
        System.out.println(file.canWrite());
        //To get the name of the file
        System.out.println(file.getName());
        //To get the parentName of the file
        System.out.println(file.getParent());
        //To get the absolute path of the file
        System.out.println(file.getAbsolutePath());
        //To check if the file is file
        System.out.println(file.isFile());
        //To check if the file is directory of not
        System.out.println(file.isDirectory());
        // Creating a new file
        try {
            newFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        //To list the files present in the file path
        String[] list = listFilePathRef.list();
        for(String string:list){
            System.out.println(string);
        }
        // Deleting a file
        System.out.println(deleteFileRef.delete());
    }

}
