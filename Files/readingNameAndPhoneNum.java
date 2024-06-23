import java.io.*;

public class namePhoneNum {
    public static void main(String[] args){
        String path1 = "/Users/mahanteshmise/Desktop/FileFolder/data3Phone.rtf";
        String path2 = "/Users/mahanteshmise/Desktop/FileFolder/data4Name.rtf";
        String path3 = "/Users/mahanteshmise/Desktop/FileFolder/data5Combined.rtf";
        // Creating a reference of FileReader and BufferedReader
        FileReader reader1 = null;
        BufferedReader bufferedReader1 = null;
        FileReader reader2 = null;
        BufferedReader bufferedReader2 = null;
        FileWriter writer1 = null;
        BufferedWriter bufferedWriter = null;
        try{
            reader1 = new FileReader(path1);
            bufferedReader1 = new BufferedReader(reader1);
            reader2 = new FileReader(path2);
            bufferedReader2 = new BufferedReader(reader2);
            writer1 = new FileWriter(path3);
            bufferedWriter = new BufferedWriter(writer1);
            String name = bufferedReader1.readLine();
            String phone = bufferedReader2.readLine();
            while(name != null && phone != null){
                bufferedWriter.write(name + ":"+phone+"\n");
                name = bufferedReader1.readLine();
                phone = bufferedReader2.readLine();
            }
            bufferedWriter.flush();
        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }
    }
}
