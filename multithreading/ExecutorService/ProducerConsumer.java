package ExecutorService;
/*
 * @author:Saawan
 * @created:[11/2/2020],Monday
 * Time:6:24 PM
 */
class Utility{
    int i;
    boolean aBoolean=false;

    public synchronized void getI() throws InterruptedException {
        while (!aBoolean){ wait(); }
        aBoolean=false;
        System.out.println("Consumer"+i);
        notify();

    }

    public synchronized void setI(int i) throws InterruptedException {
        while (aBoolean){ wait(); }
        this.i = i;
        aBoolean=true;
        System.out.println("Producer"+i);
        notify();
    }
}

class Consumer implements Runnable{
    private Utility utility;
    public Consumer(Utility utility) {
        this.utility=utility;
        Thread consumer=new Thread(this,"consumer ");
        consumer.start();
    }
     public void run() {
        while (true){
            try {
                utility.getI();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Producer implements Runnable{
    private Utility utility;
    public Producer(Utility utility) {
        this.utility=utility;
        Thread producer=new Thread(this,"Producer ");
        producer.start();
    }
    public void run() {
        int i=0;
        while (true){
            try {
                utility.setI(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Utility utility=new Utility();
        new Producer(utility);
        new Consumer(utility);



    }
}
/*
* utility class to perform wait and notify
* consumer class to consume
* producer class to produce
*  */
