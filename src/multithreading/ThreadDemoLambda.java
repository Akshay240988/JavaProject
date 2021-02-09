package multithreading;


class Hiii implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hii");
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class Helllo implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
public class ThreadDemoLambda {
    public static void main(String[] args) {


    Runnable hiii = new Hiii();
    Runnable helllo = new Helllo();

    Thread t1 = new Thread(hiii);
    Thread t2 = new Thread(helllo);

        t1.start();
        t2.start();
    }
}
