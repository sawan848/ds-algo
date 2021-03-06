package ExecutorService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:9:21 PM
 */
class SendMail implements Runnable{
    private CountDownLatch cl;

    public SendMail() {
    }

    public SendMail(CountDownLatch cl) {
        this.cl = cl;
    }

    @Override
    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cl.countDown();
        System.out.println(cl.getCount());

    }
}
public class ExecutorServiceRealLiveExample {
    public static void main(String[] args) throws InterruptedException {
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        ExecutorService es= Executors.newFixedThreadPool(20);
        System.out.println(df.format(new Date()));
        for (int i = 0; i < 10; i++) {
            es.submit(new SendMail());
        }
        es.shutdown();
        es.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(df.format(new Date()));
        System.out.println();
    }
}
/*
* send email to all student of university regarding their course registration of the academic year
* student==6000
* data from different  table of database
* 0.5sec
* 0.5*60000=3000=50 minutes
* */
