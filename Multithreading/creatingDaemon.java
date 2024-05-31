public class CreatingDaemon {
    public class UserTask extends Thread {
        @Override
        public void run() {
            System.out.println("The user thread has started execution");
            for (int i = 0; i < 5; i++) {
                System.out.println("The user thread is executing");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("The user thread has stopped executing");
        }
    }
    public class DaemonThread extends Thread{
        @Override
        public void run(){
            System.out.println("The daemon thread has started its execution");
            for(;;){
                System.out.println("The daemon thread is executing");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args){
        CreatingDaemon obj = new CreatingDaemon();
        UserTask t1 = obj.new UserTask();
        DaemonThread t2 = obj.new DaemonThread();

        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
