import java.util.Scanner;

public class throwingExceptions {
    public void fun1() throws Exception{
        System.out.println("Connection 2 started");
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator");
            int a = scan.nextInt();
            System.out.println("Enter the denominator");
            int b = scan.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception handled in fun1");
        }
        finally {
            System.out.println("Connection 2 terminated");
        }
    }
}
class Demo{
    public static void main(String[] args){
        System.out.println("Connection 1 is Estd");
        try{
            throwingExceptions obj1 = new throwingExceptions();
            obj1.fun1();
        }
        catch (Exception e){
            System.out.println("Exception handled in main()");
        }
        System.out.println("Connection 1 is terminated");
    }
}
