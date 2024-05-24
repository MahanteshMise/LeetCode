import java.util.Scanner;

public class singleRun extends Thread{
    @Override
    public void run(){
        Thread init = Thread.currentThread();
        String name = init.getName();

        switch (name) {
            case "Thread1" -> add();
            case "Thread2" -> printChar();
            case "Thread3" -> printNum();
        }
    }

    public void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num A");
        int a = scan.nextInt();
        System.out.println("Enter the num B");
        int b = scan.nextInt();
        System.out.println("The result to adding A and B is="+(a+b));
    }

    public void printChar(){
        for(int i=65;i<97;i++){
            System.out.println((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void printNum(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MainSingleRun{
    public static void main(String[] args){
        singleRun t1 = new singleRun();
        singleRun t2 = new singleRun();
        singleRun t3 = new singleRun();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
