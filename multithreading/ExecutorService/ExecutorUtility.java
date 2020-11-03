package ExecutorService;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:9:52 AM
 */

class Service implements Runnable{
    int i;

    public Service(int i) {
        this.i = i;
    }

    @Override
    public void run() {

        System.out.println("In thread "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExecutorUtility {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(5);
        System.out.println(new Date());

        for (int i = 0; i < 25; i++) {
            executorService.execute(new Service(i));
        }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(new Date());
    }
}

/*
* ExecutorService in concurrency (multithreading)
* execute()
* shutdown()
* Future-->stores data received by submit
* awaitTermination()
* submit(new Runnable()) --> return null
* submit(new callable())--> return data
* invokeAny() --> returns only single data from list of callable objects
* invokeALll()-->return list of future object
* */
