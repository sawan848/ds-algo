package ExecutorService;
/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:9:37 PM
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cl=new CountDownLatch(10);
        ExecutorService es= Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            es.submit(new SendMail(cl));
        }
        cl.await();
        System.out.println("thread completed task !!!");


    }
}
