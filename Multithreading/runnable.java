import java.util.Scanner;

public class runnableimplement {
    public class Add implements Runnable{
        @Override
        public void run() {
            System.out.println("Addition activity started");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number a");
            int a = scan.nextInt();
            System.out.println("Enter the number b");
            int b = scan.nextInt();
            System.out.println("The sum of two numbers is a+b="+(a+b));
        }
    }
    public class PrintChar implements Runnable{
        @Override
        public void run() {
            for (int i = 65; i < 97; i++) {
                System.out.println((char)i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public class PrintNums implements Runnable{
        @Override
        public void run(){
            for(int i=1;i<10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args){
        runnableimplement Obj = new runnableimplement();
        runnableimplement.Add d1= Obj.new Add();
        runnableimplement.PrintChar d2= Obj.new PrintChar();
        runnableimplement.PrintNums d3= Obj.new PrintNums();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        //Starting the thread process indirectly

        t1.start();
        t2.start();
        t3.start();
    }
}
