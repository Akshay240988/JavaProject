package multithreading;

public class MultithreadingDemo extends Thread {


    public void run(){
        System.out.println("In run method");
    }
    public static void main(String[] args) {
        MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
       // Thread thread = new Thread();
        //thread.start();
        multithreadingDemo.start();


    }
}
