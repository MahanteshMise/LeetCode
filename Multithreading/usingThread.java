import java.util.Scanner;

public class MultiThreading {
    public class Add extends Thread{
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
    public class PrintChar extends Thread {
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
    public class PrintNums extends Thread{
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
        MultiThreading threadObj =new MultiThreading();
        MultiThreading.Add d1 = threadObj.new Add();
        MultiThreading.PrintChar d2 = threadObj.new PrintChar();
        MultiThreading.PrintNums d3 = threadObj.new PrintNums();

        d1.start();
        d2.start();
        d3.start();
    }
}
