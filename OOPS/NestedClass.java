public class NestedClass {
    int x = 10;
    static class InnerClass{
        int y =20;
    }
}
/*class Main111 {
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        System.out.println(obj.x);
        // The way below is declared is very important
        NestedClass.InnerClass nestedObj = obj.new InnerClass();
        System.out.println(nestedObj.y);
    }
}*/
//Accessing object using static method in Java
class Main111{
    public static void main(String[] args){
        NestedClass.InnerClass obj = new NestedClass.InnerClass();
        System.out.println(obj.y);
    }
}
