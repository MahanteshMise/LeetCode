public class producerConsumerQueue {
    private int data;
    public void setData(int data){
        this.data = data;
        System.out.println("Producer produced the value "+data);
    }
    public void getData(){
        System.out.println("Consumer consumed the value "+ data);
    }
}
class Producer extends Thread{
    private producerConsumerQueue q;
    public Producer(producerConsumerQueue q){
        this.q = q;
    }
    @Override
    public void run(){
        int i = 1;
        for(;;)
            q.setData(i++);

    }
}
class Consumer extends Thread{
    private producerConsumerQueue q;

    public Consumer(producerConsumerQueue q){
        this.q = q;
    }
    @Override
    public void run(){
        int i=1;
        for(;;)
            q.getData();
    }
}
class Main117{
    public static void main(String[] args){
        producerConsumerQueue objPC= new producerConsumerQueue();
        Producer objP = new Producer(objPC);
        Consumer objC = new Consumer(objPC);

        objP.setName("PRODUCER");
        objC.setName("CONSUMER");

        objP.start();
        objC.start();

    }
}
