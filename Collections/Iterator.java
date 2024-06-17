import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mahantesh");
        arr.add("Mise");
        arr.add("Prakr");
        Iterator<String> arrItr = arr.iterator();

        //Looping through the array list elements
        while(arrItr.hasNext()){
            System.out.println(arrItr.next());
        }

        // Removing one of the element from the array list.
        arrItr = arr.iterator();
        while ((arrItr.hasNext())){
            String name = arrItr.next();
            if(name.equals("PrakS")){
                arrItr.remove();
            }
        }
        System.out.println("\n\n");
        //Printing after removing an element from the array list.
        arrItr = arr.iterator();
        while(arrItr.hasNext()){
            System.out.println(arrItr.next());
        }
    }
}
