package ExecutorService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:9:13 PM
 */
public class ExecutorServiceInvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println(new Date());
        List<Callable<String>> futureList = new ArrayList<>();

        futureList.add( new ServiceCallable(1));
        futureList.add( new ServiceCallable(2));
        futureList.add( new ServiceCallable(3));
        futureList.add( new ServiceCallable(4));
        futureList.add( new ServiceCallable(5));

        List<Future<String>>callable=es.invokeAll(futureList);
        /*only invoke one thread ,it can be any from list*/

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("--> --> --> -->  -->=== === === === === --> --> --> --> -->");

        for (Future<String> fut:callable)
            System.out.println(fut.get());

        System.out.println(new Date());
    }


}

