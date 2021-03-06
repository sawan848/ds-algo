package ExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/*
 * @author:Saawan
 * @created:[11/2/2020],Monday
 * Time:6:58 PM
 */
class Cons implements  Runnable {
    BlockingQueue<Integer> bq;

    public Cons(BlockingQueue<Integer> bq) {
        this.bq = bq;
        Thread prod = new Thread(this);
        prod.start();
    }

    public void run() {

        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Consumer " + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Prod implements  Runnable{
    BlockingQueue<Integer>bq;

    public Prod(BlockingQueue<Integer> bq) {
        this.bq = bq;
        Thread prod=new Thread(this);
        prod.start();
    }
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Producer " + i);
            try { Thread.sleep(500);bq.put(i++);  } catch (InterruptedException e) { e.printStackTrace();  }
        }
    }
 }

public class ProducerConsumerBlockingQueue{
    public static void main(String[] args) {
        BlockingQueue<Integer>bq=new ArrayBlockingQueue<>(2);
        new Prod(bq);
        new Cons(bq);

    }
}

/*
* consumer Class
* producer class
*
* */
