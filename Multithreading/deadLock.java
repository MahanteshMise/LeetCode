public class DeadLock implements Runnable{
    String resource1 = "PlayStation";
    String resource2 = "Remote";

    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("Elon")){
            elonMethod();
        }
        else{
            ZuckMethod();
        }
    }

    public void elonMethod(){
        try{
            Thread.sleep(1000);
            synchronized (resource2){
                System.out.println("Elon is playing with PlayStation");
                Thread.sleep(1000);
                synchronized (resource1){
                    System.out.println("Elon has the remote");
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void ZuckMethod(){
        try{
            Thread.sleep(1000);
            synchronized (resource1){
                System.out.println("Zuck is playing with PlayStation");
                Thread.sleep(1000);
                synchronized (resource2){
                    System.out.println("Zuck has the remote");
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Main114{
    public static void main(String[] args){
        DeadLock obj = new DeadLock();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Elon");
        t2.setName("Zuck");

        t1.start();
        t2.start();
    }
}
