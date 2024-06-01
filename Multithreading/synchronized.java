public class synchronizedThread implements Runnable{
    @Override
    synchronized public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started with execution");
        try {
            Thread.sleep(1000);
            System.out.println(name + " is executing");
            Thread.sleep(1000);
            System.out.println(name + " is done with execution");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Main112{
    public static void main(String[] args){
        synchronizedThread obj = new synchronizedThread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.setName("Company1");
        t2.setName("Company2");
        t3.setName("Company3");

        t1.start();
        t2.start();
        t3.start();
    }
}
