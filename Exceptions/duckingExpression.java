import java.util.Scanner;

public class exception3 {
    public void fun1() throws Exception {
        System.out.println("Func1 starting");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int a = scan.nextInt();
        System.out.println("Enter the denominator");
        int b = scan.nextInt();
        int c = b / a;
        System.out.println(c);
        System.out.println("Exception handled in fun1()");
        System.out.println("Connection2 is terminated");
    }
}
class Demo123{
    public static void main(String[] args){
        System.out.println("Connection is Estd");
        try{
            exception3 obj1 = new exception3();
            obj1.fun1();
        }
        catch (Exception e){
            System.out.println("Exception handled in main()");
        }
        System.out.println("Connection1 is terminated");
    }
}


