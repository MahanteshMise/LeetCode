public class producerConsumerSolution {
    private int data;
    private boolean isDataPresent = false;

    public synchronized void setData(int data){
        try{
            if(!this.isDataPresent){
                this.data = data;
                System.out.println("Producer produced the value "+data);
                this.isDataPresent = true;
                notify();
            }
            else{
                wait();
            }
        }catch (Exception e){
            e.printStackTrace();;
        }
    }
    public synchronized void getData(){
        try{
            if(isDataPresent){
                System.out.println("Consumer consumed the value "+ data);
                isDataPresent =false;
                notify();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Producer001 extends Thread{
    private producerConsumerSolution q;
    public Producer001(producerConsumerSolution q){
        this.q = q;
    }
    @Override
    public void run(){
        int i = 1;
        for(;;)
            q.setData(i++);

    }
}
class Consumer001 extends Thread{
    private producerConsumerSolution q;

    public Consumer001(producerConsumerSolution q){
        this.q = q;
    }
    @Override
    public void run(){
        int i=1;
        for(;;)
            q.getData();
    }
}

class Main118{
    public static void main(String[] args){
        producerConsumerSolution objPC= new producerConsumerSolution();
        Producer001 objP = new Producer001(objPC);
        Consumer001 objC = new Consumer001(objPC);

        objP.setName("PRODUCER");
        objC.setName("CONSUMER");

        objP.start();
        objC.start();
    }
}
