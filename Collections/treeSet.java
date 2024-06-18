import java.util.TreeSet;

public class treeSet111 {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(25);
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(15));
        System.out.println(set.tailSet(15));
    }
}