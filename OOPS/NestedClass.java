public class NestedClass {
    int x = 10;
    public class InnerClass{
        int y =20;
    }
}
class Main111 {
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        System.out.println(obj.x);
        // The way below is declared is very important
        NestedClass.InnerClass nestedObj = obj.new InnerClass();
        System.out.println(nestedObj.y);
    }
}
