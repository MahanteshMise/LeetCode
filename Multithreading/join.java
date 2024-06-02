public class joinMethod extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                System.out.println("Inside user defined thread");
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Main115{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started execution");
        joinMethod obj = new joinMethod();

        obj.start();
        obj.join();
        System.out.println("Main thread completed execution");

    }
}
