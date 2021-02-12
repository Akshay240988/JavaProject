package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {


        BlockingQueue b = new LinkedBlockingQueue<>(2);
        Producer1 producer1 = new Producer1(b);
        Consumer1 consumer1 = new Consumer1(b);

    }
}
class Producer1 implements Runnable{

        BlockingQueue b;
    public Producer1(BlockingQueue b) {
              this.b=b;
              Thread thread = new Thread(this,"Producer1");
              thread.start();
    }

    @Override
    public void run() {

        for(int i=1;i<=10;i++){
            System.out.println("Producer:"+i);
            try { b.put(i); } catch (InterruptedException e) { e.printStackTrace(); }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }

    }
}

class Consumer1 implements Runnable{

    BlockingQueue b;
    public Consumer1(BlockingQueue b){
        this.b=b;
        Thread thread = new Thread(this,"Consumer1");
        thread.start();
    }
    @Override
    public void run() {
        while(true){
            try { System.out.println("Consumer:"+b.take()); } catch (InterruptedException e) { e.printStackTrace(); }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
