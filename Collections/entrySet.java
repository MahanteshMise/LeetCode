import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap111 {
    public static void main(String[] args){
        // Create a HashMap and add keyValue pairs to it
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        map1.put("India",1000);
        map1.put("China",2000);
        map1.put("USA",3000);
        map1.put("Japan",4000);
        map1.put("Korea",5000);
        map1.put("Russia",6000);
        System.out.println(map1);
        // Get the set of key value pairs from the HashMap
        Set<Map.Entry<String,Integer>> entrySet = map1.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
